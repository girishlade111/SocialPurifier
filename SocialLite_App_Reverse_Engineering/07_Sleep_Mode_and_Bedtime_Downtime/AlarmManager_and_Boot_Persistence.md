# स्लीप अलार्म व बूट पर्सीस्टन्स सखोल विश्लेषण (Sleep Alarm Implementation)

## १. AlarmManager द्वारे अचूक अलार्म शेड्युलिंग (`setExactAndAllowWhileIdle`)

Android चे Doze Mode अलार्म्स लांबणीवर टाकू नयेत म्हणून SocialLite `setExactAndAllowWhileIdle` चा वापर करते:

```java
public static void scheduleSleepWindow(Context context, long bedtimeMillis, long wakeMillis) {
    AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
    
    // १. बेडटाईम अलार्म (स्लीप मोड सुरू करणे):
    Intent sleepIntent = new Intent(context, WakeAlarmReceiver.class);
    sleepIntent.setAction("com.sociallite.android.action.START_SLEEP");
    PendingIntent sleepPending = PendingIntent.getBroadcast(
        context, 1001, sleepIntent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
    );
    
    // Doze मोडमध्येही अचूक वाजणारा अलार्म:
    am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, bedtimeMillis, sleepPending);
    
    // २. वेक-अप अलार्म (स्लीप मोड संपवणे):
    Intent wakeIntent = new Intent(context, WakeAlarmReceiver.class);
    wakeIntent.setAction("com.sociallite.android.action.END_SLEEP");
    PendingIntent wakePending = PendingIntent.getBroadcast(
        context, 1002, wakeIntent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
    );
    
    am.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, wakeMillis, wakePending);
}
```

---

## २. बूट आणि टाईम बदल ऐकणारे ब्रॉडकास्ट रिसीव्हर (`BootReceiver.java`)

```java
public final class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) return;
        
        String action = intent.getAction();
        if (Intent.ACTION_BOOT_COMPLETED.equals(action) ||
            "android.intent.action.LOCKED_BOOT_COMPLETED".equals(action) ||
            Intent.ACTION_MY_PACKAGE_REPLACED.equals(action) ||
            Intent.ACTION_TIME_CHANGED.equals(action) ||
            Intent.ACTION_TIMEZONE_CHANGED.equals(action)) {
            
            // १. सध्याची वेळ तपासा
            Calendar now = Calendar.getInstance();
            SharedPreferences prefs = context.getSharedPreferences("sociallite_settings", 0);
            
            int bedtimeHour = prefs.getInt("sleep_bedtime_hour", 22);
            int bedtimeMin = prefs.getInt("sleep_bedtime_minute", 30);
            int wakeHour = prefs.getInt("sleep_wake_hour", 6);
            int wakeMin = prefs.getInt("sleep_wake_minute", 30);
            
            // २. सध्या स्लीप मोड वेळेत आहोत का?
            boolean isDuringSleep = isTimeBetween(now, bedtimeHour, bedtimeMin, wakeHour, wakeMin);
            
            if (isDuringSleep) {
                // फोन चालू होताच तात्काळ ब्लॉकिंग सक्रिय करा:
                prefs.edit().putBoolean("sleep_mode_active", true).apply();
            }
            
            // ३. पुढील अलार्म्स पुन्हा सिस्टीममध्ये रजिस्टर करा:
            rescheduleAlarms(context);
        }
    }
}
```

---

## ३. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `AndroidManifest.xml` मध्ये `RECEIVE_BOOT_COMPLETED` आणि `SCHEDULE_EXACT_ALARM` परवानग्या जोडा.
2. `AlarmManager.RTC_WAKEUP` वापरून बेडटाईम आणि वेक-अपचे अचूक इंटेंट्स पाठवा.
3. फोन रीबूट झाल्यानंतर सर्व शेड्यूल्स त्वरित पुन्हा ॲक्टिव्हेट करा.
