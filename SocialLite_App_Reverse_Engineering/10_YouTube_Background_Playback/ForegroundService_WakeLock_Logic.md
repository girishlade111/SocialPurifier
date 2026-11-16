# YouTubePlaybackService कोड व वेक-लॉक सखोल विश्लेषण

## १. Manifest परवानग्या आणि सर्व्हिस डिक्लेरेशन

```xml
<uses-permission android:name="android.permission.FOREGROUND_SERVICE" />
<uses-permission android:name="android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK" />
<uses-permission android:name="android.permission.WAKE_LOCK" />

<service
    android:name="com.sociallite.android.webview.YouTubePlaybackService"
    android:foregroundServiceType="mediaPlayback"
    android:exported="false" />
```

---

## २. Java सर्व्हिस कोड (`YouTubePlaybackService.java`)

```java
public class YouTubePlaybackService extends Service {
    public PowerManager.WakeLock wakeLock;
    public boolean isRunning;

    @Override
    public final int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent != null ? intent.getAction() : null;
        
        // १. जर स्टॉप ॲक्शन आली असेल तर:
        if ("stop".equals(action)) {
            pauseWebViewVideo();
            stopSelf();
            return START_NOT_STICKY;
        }

        // २. प्लेबॅक सुरू करण्याचा इंटेंट:
        if ("com.sociallite.android.youtube.CONTINUE_PLAYBACK".equals(action)) {
            
            // नोटिफिकेशन चॅनेल तयार करणे:
            NotificationManager nm = (NotificationManager) getSystemService(NotificationManager.class);
            NotificationChannel channel = new NotificationChannel(
                "youtube_playback", "YouTube playback", NotificationManager.IMPORTANCE_LOW
            );
            nm.createNotificationChannel(channel);

            // परत ॲपमध्ये जाण्यासाठी डीप लिंक इंटेंट:
            Intent appIntent = new Intent(this, MainActivity.class);
            appIntent.setAction(Intent.ACTION_VIEW);
            appIntent.setData(Uri.parse("sociallite://open?platform=youtube"));
            appIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

            PendingIntent contentPendingIntent = PendingIntent.getActivity(
                this, 10, appIntent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );

            // स्टॉप बटण ॲक्शन:
            Intent stopIntent = new Intent(this, YouTubePlaybackService.class).setAction("stop");
            PendingIntent stopPendingIntent = PendingIntent.getService(
                this, 11, stopIntent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );

            Notification notification = new Notification.Builder(this, "youtube_playback")
                .setSmallIcon(android.R.drawable.ic_media_play)
                .setContentTitle("YouTube is playing")
                .setContentText("Tap to return to SocialLite")
                .setContentIntent(contentPendingIntent)
                .setOngoing(true)
                .addAction(new Notification.Action.Builder(null, "Stop", stopPendingIntent).build())
                .build();

            // फोरग्राउंड सर्व्हिस सुरू करणे (Android 14+ कंपॅटिबिलिटी):
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                startForeground(7402, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK);
            } else {
                startForeground(7402, notification);
            }

            this.isRunning = true;

            // CPU WakeLock ॲक्वायर करणे (स्क्रीन बंद झाल्यावरही CPU चालू ठेवणे):
            if (this.wakeLock == null) {
                PowerManager pm = (PowerManager) getSystemService(PowerManager.class);
                PowerManager.WakeLock lock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "sociallite:youtube_player");
                lock.acquire(14400000L); // जास्तीत जास्त ४ तास
                this.wakeLock = lock;
            }
            return START_NOT_STICKY;
        }
        return START_NOT_STICKY;
    }

    @Override
    public final void onDestroy() {
        if (this.wakeLock != null && this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        this.wakeLock = null;
        super.onDestroy();
    }
}
```

---

## ३. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `Service` सबक्लास करून `android:foregroundServiceType="mediaPlayback"` जोडा.
2. `PARTIAL_WAKE_LOCK` मिळवा जेणेकरून स्क्रीन लॉक असताना CPU ऑडिओ थ्रेड बंद करणार नाही.
3. मीडिया नोटिफिकेशनमध्ये प्ले/स्टॉप ॲक्शन्स जोडा.
