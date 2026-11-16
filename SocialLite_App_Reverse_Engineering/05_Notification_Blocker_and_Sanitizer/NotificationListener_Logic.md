# NotificationListenerService कोड व लॉजिक सखोल विश्लेषण

## १. सर्व्हिस कॉन्फिगरेशन (`AndroidManifest.xml`)

```xml
<service android:name="com.sociallite.android.data.NotificationBlockerService"
    android:label="SocialLite Notification Blocker"
    android:permission="android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"
    android:exported="false">
    <intent-filter>
        <action android:name="android.service.notification.NotificationListenerService" />
    </intent-filter>
</service>
```

---

## २. नोटिफिकेशन इंटरसेप्शन लॉजिक (`onNotificationPosted`)

```java
@Override
public void onNotificationPosted(StatusBarNotification sbn) {
    if (sbn == null) return;
    
    String packageName = sbn.getPackageName();
    
    // १. हे ॲप आमच्या टार्गेट सोशल मीडिया यादीत आहे का?
    if (!f3516t.containsKey(packageName)) {
        return;
    }
    
    String platformKey = (String) f3516t.get(packageName);
    
    // २. मूळ नोटिफिकेशन लगेच रद्द (Cancel) करा जेणेकरून युजरला आवाज किंवा पॉप-अप येणार नाही:
    cancelNotification(sbn.getKey());
    
    // ३. नोटिफिकेशन मधील डेटा सुरक्षितपणे वाचणे:
    Notification notification = sbn.getNotification();
    Bundle extras = notification != null ? notification.extras : null;
    
    CharSequence title = extras != null ? extras.getCharSequence(Notification.EXTRA_TITLE) : null;
    CharSequence text = extras != null ? extras.getCharSequence(Notification.EXTRA_TEXT) : null;
    CharSequence bigText = extras != null ? extras.getCharSequence(Notification.EXTRA_BIG_TEXT) : null;
    
    if (bigText != null) {
        text = bigText;
    }
    
    // ४. जर फक्त रील किंवा ट्रेंड अलर्ट असेल तर शांतपणे सोडून द्या:
    if (isAlgorithmNotification(title, text)) {
        return;
    }
    
    // ५. जर डायरेक्ट मेसेज (DM) असेल, तर सोशललाईटचे क्लीन नोटिफिकेशन पाठवा:
    postSanitizedNotification(platformKey, title, text);
}
```

---

## ३. सॅनिटाइज्ड नोटिफिकेशन तयार करण्याचे लॉजिक (`postSanitizedNotification`)

```java
private void postSanitizedNotification(String platform, CharSequence title, CharSequence text) {
    NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    String channelId = "sl_msg_" + platform;
    
    // डीप लिंक तयार करणे: SocialLite मध्ये फक्त मेसेजिंग उघडा
    Intent intent = new Intent(this, MainActivity.class);
    intent.setAction(Intent.ACTION_VIEW);
    intent.setData(Uri.parse("sociallite://open?platform=" + platform + "&url=/direct/inbox/"));
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
    
    PendingIntent pendingIntent = PendingIntent.getActivity(
        this, 
        platform.hashCode(), 
        intent, 
        PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
    );
    
    NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId)
        .setSmallIcon(R.drawable.ic_notification)
        .setContentTitle(title != null ? title : platform)
        .setContentText(text)
        .setContentIntent(pendingIntent)
        .setAutoCancel(true)
        .setPriority(NotificationCompat.PRIORITY_HIGH);
        
    nm.notify(platform.hashCode(), builder.build());
}
```

---

## ४. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `NotificationListenerService` तयार करा.
2. युजरला `Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS` द्वारे परमिशन देण्यास सांगा.
3. `cancelNotification(sbn.getKey())` वापरून विचलित करणारे अलर्ट्स काढून टाका.
4. फक्त महत्त्वपूर्ण मेसेजेसचे क्लीन नोटिफिकेशन्स पाठवा.
