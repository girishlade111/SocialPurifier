# पॅरेंटल सिंकिंग व ऑफलाइन म्यूटेशन रांग (Sync & Offline Queue Logic)

## १. WorkManager बॅकग्राउंड वर्कर (`KidSettingsSyncWorker.java`)

मुलाच्या फोनमध्ये इंटरनेट कधी चालू कधी बंद असू शकते. त्यामुळे SocialLite `androidx.work.CoroutineWorker` चा वापर करते:

```java
public final class KidSettingsSyncWorker extends CoroutineWorker {
    @Override
    public Object doWork(Continuation continuation) {
        Context context = getApplicationContext();
        mb settings = mb.f6571i.c(context);
        
        // १. हे ॲप "kid" मोडमध्ये आहे का?
        if (!settings.getAccountType().equals("kid")) {
            // जर पर्सनल मोड असेल तर हा वर्कर थांबवा
            WorkManager.getInstance(context).cancelUniqueWork("sl_kid_settings_sync");
            return Result.success();
        }
        
        // २. क्लाउड सर्व्हरवरून पालकांची नवीन पॉलिसी डाऊनलोड करणे:
        try {
            boolean success = settings.pullLatestPoliciesFromServer();
            if (success) {
                return Result.success();
            } else {
                return Result.retry(); // इंटरनेट नसल्यास पुन्हा प्रयत्न करा
            }
        } catch (Exception e) {
            Log.w("KidSettingsSyncWorker", "Kid settings pull failed; will retry", e);
            return Result.retry();
        }
    }
}
```

---

## २. ऑफलाइन म्यूटेशन रांग (`pending_sync_queue` in Room DB)

जेव्हा मुलगा इंटरनेट नसताना फोन वापरतो, तेव्हा फोनमधील स्क्रीन टाईम युसेज इव्हेंट्स वाया जात नाहीत. ते Room डेटाबेसमध्ये साठवले जातात:

```sql
CREATE TABLE IF NOT EXISTS `pending_sync_queue` (
    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `mutation_type` TEXT NOT NULL,         -- उदा. "USAGE_HEARTBEAT" किंवा "APP_BLOCKED_EVENT"
    `payload_json` TEXT NOT NULL,          -- इव्हेंटची संपूर्ण माहिती
    `created_at_timestamp` INTEGER NOT NULL,
    `retry_count` INTEGER NOT NULL DEFAULT 0
);
```

### म्यूटेशन फ्लश करण्याचे लॉजिक (`SyncFlushWorker.java`):
1. जेव्हा नेटवर्क कनेक्टिव्हिटी परत येते (`Constraint.CONNECTED`), तेव्हा WorkManager आपोआप `SyncFlushWorker` चालवतो.
2. `pending_sync_queue` मधील सर्व रेकॉर्ड्स बॅच करून सर्व्हरला पाठवले जातात.
3. सर्व्हरकडून `HTTP 200 OK` आल्यावर स्थानिक डेटाबेसमधून ते डिलीट केले जातात.

---

## ३. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. पेअरिंगसाठी सुरक्षित ६-अंकी अल्फान्युमेरिक टोकन जनरेट करा.
2. मुलाच्या डिव्हाइसवर `accountType = "kid"` फ्लॅग सेट करा.
3. पॉलिसी सिंकिंगसाठी `PeriodicWorkRequestBuilder<KidSettingsSyncWorker>(15, TimeUnit.MINUTES)` शेड्युल करा.
4. ऑफलाइन असताना वापरलेला वेळ गमावू नये म्हणून Room डेटाबेसमध्ये स्थानिक इव्हेंट रांग ठेवा.
