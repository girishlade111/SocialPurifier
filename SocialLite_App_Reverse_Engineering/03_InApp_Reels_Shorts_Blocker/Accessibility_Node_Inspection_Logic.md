# रील्स नोड इन्स्पेक्शन व ब्लॉकिंग लॉजिक (Reels Node Inspection Logic)

## १. ॲक्सेसिबिलिटी इव्हेंट हँडलिंग (`onAccessibilityEvent`)

```java
@Override
public void onAccessibilityEvent(AccessibilityEvent event) {
    if (event == null) return;
    
    CharSequence packageNameSeq = event.getPackageName();
    if (packageNameSeq == null) return;
    String packageName = packageNameSeq.toString();
    
    // फक्त Instagram किंवा YouTube असेल तरच पुढे जा:
    if (!packageName.equals("com.instagram.android") && 
        !packageName.equals("com.google.android.youtube")) {
        return;
    }
    
    // डीबाउन्स (वारंवार ट्रिगर रोखण्यासाठी 80ms ते 120ms विंडो)
    long now = SystemClock.uptimeMillis();
    if (now - this.lastInspectionTime < 100) {
        return;
    }
    this.lastInspectionTime = now;
    
    // विन्डोची नोड ट्री तपासणे
    AccessibilityNodeInfo rootNode = getRootInActiveWindow();
    if (rootNode == null) return;
    
    try {
        if (packageName.equals("com.instagram.android")) {
            inspectInstagramReels(rootNode);
        } else if (packageName.equals("com.google.android.youtube")) {
            inspectYouTubeShorts(rootNode);
        }
    } finally {
        rootNode.recycle();
    }
}
```

---

## २. Instagram रील्स ओळखण्याचे लॉजिक (`inspectInstagramReels`)

```java
private void inspectInstagramReels(AccessibilityNodeInfo rootNode) {
    // १. टार्गेट व्ह्यू आयडीज शोधणे:
    for (String viewId : f3486t0) { // clips_viewer_view_pager, clips_viewer_container
        List<AccessibilityNodeInfo> nodes = rootNode.findAccessibilityNodeInfosByViewId(viewId);
        if (nodes != null && !nodes.isEmpty()) {
            for (AccessibilityNodeInfo node : nodes) {
                if (node.isVisibleToUser()) {
                    // रील्स स्क्रीन सुरू आहे! त्वरित ब्लॉक करा!
                    dismissReels();
                    return;
                }
            }
        }
    }
}
```

---

## ३. YouTube शॉर्ट्स ओळखण्याचे लॉजिक (`inspectYouTubeShorts`)

```java
private void inspectYouTubeShorts(AccessibilityNodeInfo rootNode) {
    for (String viewId : f3487u0) { // reel_recycler, shorts_player_container
        List<AccessibilityNodeInfo> nodes = rootNode.findAccessibilityNodeInfosByViewId(viewId);
        if (nodes != null && !nodes.isEmpty()) {
            for (AccessibilityNodeInfo node : nodes) {
                if (node.isVisibleToUser()) {
                    // शॉर्ट्स चालू झाले आहेत! त्वरित बंद करा!
                    dismissReels();
                    return;
                }
            }
        }
    }
}
```

---

## ४. रील्स डिस्मिसल आणि ओव्हरले लॉजिक (`dismissReels`)

```java
private void dismissReels() {
    // ॲक्शन १: फोनचे ग्लोबल बॅक बटण दाबणे
    boolean success = performGlobalAction(AccessibilityService.GLOBAL_ACTION_BACK);
    
    // ॲक्शन २: जर बॅक काम करत नसेल, तर जेस्चर स्वाइप करणे
    if (!success && Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Path swipePath = new Path();
        swipePath.moveTo(50f, 500f);
        swipePath.lineTo(800f, 500f); // डावीकडून उजवीकडे स्वाइप
        GestureDescription gesture = new GestureDescription.Builder()
            .addStroke(new GestureDescription.StrokeDescription(swipePath, 0, 100))
            .build();
        dispatchGesture(gesture, null, null);
    }
    
    // ॲक्शन ३: ओव्हरले विंडो दाखवणे (कस्टमाइझ मेसेजसह)
    showLockOverlay("Reels locked by SocialLite");
}
```

---

## ५. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `AccessibilityService` कॉन्फिगरेशनमध्ये `android:canRetrieveWindowContent="true"` सेट करा.
2. Instagram व YouTube च्या नवीन अपडेट्समधील व्ह्यू आयडीज सतत मॉनिटर करा आणि यादीमध्ये ठेवा.
3. रील्स सापडताच `GLOBAL_ACTION_BACK` किंवा स्वाइप जेस्चर फायर करा.
