# AppBlockerService सखोल विश्लेषण (AppBlockerService Code Deep-Dive)

## १. ॲक्सेसिबिलिटी कॉन्फिगरेशन (`accessibility_service_config.xml`)

```xml
<accessibility-service xmlns:android="http://schemas.android.com/apk/res/android"
    android:accessibilityEventTypes="typeWindowStateChanged|typeWindowContentChanged"
    android:accessibilityFeedbackType="feedbackGeneric"
    android:accessibilityFlags="flagDefault|flagRetrieveInteractiveWindows"
    android:canRetrieveWindowContent="true"
    android:description="@string/accessibility_service_description"
    android:notificationTimeout="100" />
```

---

## २. फोरग्राउंड पॅकेज डिटेक्ट करण्याचे लॉजिक (`quotaForegroundPackage`)

Android 14+ वर बॅकग्राउंड ॲप्सची माहिती मिळवणे कठीण असते. SocialLite हे ॲक्सेसिबिलिटी नोड ट्रीचा वापर करून अचूकपणे शोधते:

```java
public final String quotaForegroundPackage() {
    AccessibilityNodeInfo rootInActiveWindow;
    try {
        PowerManager pm = (PowerManager) getSystemService(PowerManager.class);
        KeyguardManager km = (KeyguardManager) getSystemService(KeyguardManager.class);
        
        // जर स्क्रीन बंद असेल किंवा फोन लॉक असेल तर काहीही करू नका
        if (!pm.isInteractive() || km.isKeyguardLocked() || (rootInActiveWindow = getRootInActiveWindow()) == null) {
            return null;
        }
        try {
            CharSequence packageName = rootInActiveWindow.getPackageName();
            return packageName != null ? packageName.toString() : null;
        } finally {
            rootInActiveWindow.recycle(); // मेमरी लीक टाळण्यासाठी रिसायकल
        }
    } catch (Exception e) {
        Log.w("AppBlocker", "Daily app limit foreground unavailable", e);
        return null;
    }
}
```

---

## ३. ब्लॉक अंमलबजावणी लॉजिक (`enforcePackage`)

```java
public final void enforcePackage(String currentPkg) {
    // १. फोनची स्क्रीन आणि लॉक स्टेटस तपासणे
    if (!powerManager.isInteractive() || keyguardManager.isKeyguardLocked()) return;
    
    // २. SocialLite स्वतःचे ॲप किंवा सिस्टीम सेटिंग्स सोडून इतर तपासणे
    if (currentPkg.equals("com.sociallite.android") || currentPkg.startsWith("com.android.")) return;
    
    // ३. हे ॲप ब्लॉक यादीत आहे का?
    if (BLOCKED_PACKAGES.containsKey(currentPkg) || customBlockedSet.contains(currentPkg)) {
        
        // ४. पोस्ट मोड (तात्पुरती सूट) चालू आहे का?
        if (prefs.getBoolean("contentBreakActive", false) && System.currentTimeMillis() < prefs.getLong("contentBreakEndTime", 0L)) {
            // पोस्ट मोड चालू आहे, ब्लॉकिंग थांबवा
            return;
        }
        
        // ५. स्लीप मोड चालू आहे का?
        boolean isSleepActive = checkSleepActive();
        
        // ६. वापर मर्यादा (Daily Limit) संपली आहे का?
        boolean isLimitReached = usageTracker.isLimitReached(currentPkg);
        
        if (isSleepActive || isLimitReached || isHardBlockActive) {
            String reason = isSleepActive ? "Sleep mode is active — go to bed." : "Time limit reached";
            
            // ब्लॉक स्क्रीन दाखवणे:
            launchBlockOverlay(currentPkg, reason);
        }
    }
}
```

---

## ४. ब्लॉक स्क्रीन लाँच करण्याचे तंत्र (`launchBlockOverlay`)

SocialLite ब्लॉक स्क्रीन उघडताना ॲपचा मूळ टास्क हिस्टरी सुरक्षित ठेवते:
```java
public final void launchBlockOverlay(String platform, String reason, String packageName, boolean isSleepBlock) {
    Intent intent = new Intent(this, BlockedAppActivity.class);
    // FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TOP | FLAG_ACTIVITY_SINGLE_TOP (335544320)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
    intent.putExtra("platform", platform);
    intent.putExtra("reason", reason);
    intent.putExtra("package_name", packageName);
    intent.putExtra("sleep_block", isSleepBlock);
    startActivity(intent);
}
```

---

## ५. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `AccessibilityService` सबक्लास करा.
2. `AndroidManifest.xml` मध्ये `android.permission.BIND_ACCESSIBILITY_SERVICE` परमिशन द्या.
3. `onAccessibilityEvent` मध्ये `AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED` ऐका.
4. पॅकेज नाव मिळवून ते ब्लॉक लिस्टमध्ये आहे की नाही ते तपासा आणि `BlockedAppActivity` लाँच करा.
