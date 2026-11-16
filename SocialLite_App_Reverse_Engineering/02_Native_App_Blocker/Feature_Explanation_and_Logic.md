# 02. नेटिव्ह ॲप ब्लॉकर (Native App Blocker)

## १. फिचरचे काम (What It Does)
युजर्सच्या फोनमध्ये आधीपासूनच अधिकृत (Official) ॲप्स इन्स्टॉल असतात - जसे की Instagram, YouTube, Snapchat, TikTok, Facebook.
SocialLite चे **नेटिव्ह ॲप ब्लॉकर** हे सिस्टीम लेव्हलवर काम करते. जेव्हा युजर अधिकृत Instagram किंवा YouTube ॲप उघडतो:
1. SocialLite 0.1 सेकंदात (100ms) ते ॲप डिटेक्ट करते.
2. त्या ॲपच्या वर SocialLite चे स्वतःचे **BlockedAppActivity** चे फुलस्क्रीन कव्हर आणते.
3. युजरला दोन पर्याय दिले जातात:
   - **"Go Home"** (फोनच्या होम स्क्रीनवर परत जा)
   - **"Open in SocialLite"** (सोशललाईटच्या स्वच्छ, व्यसनमुक्त मोडमध्ये उघडा)
4. याशिवाय दररोजचा वापर वेळ (Daily Limit) संपल्यावर ॲप आपोआप ब्लॉक होते.

---

## २. ब्लॉक केलेल्या अधिकृत ॲप्सची यादी (Target Packages)

`AppBlockerService.java` मधील मॅपिंग:
```java
private static final Map<String, String> BLOCKED_PACKAGES = Map.of(
    "com.instagram.android", "instagram",
    "com.google.android.youtube", "youtube",
    "com.zhiliaoapp.musically", "tiktok",
    "com.ss.android.ugc.trill", "tiktok",
    "com.snapchat.android", "snapchat",
    "com.twitter.android", "twitter",
    "com.twitter.android.lite", "twitter",
    "com.atebits.Tweetie2", "twitter",
    "com.facebook.katana", "facebook",
    "com.facebook.lite", "facebook",
    "com.linkedin.android", "linkedin"
);
```

---

## ३. प्रमुख वैशिष्ट्ये (Key Features)

### A. डेली कोटा आणि स्क्रीन टाईम ट्रॅकिंग (Daily Screen Time Limits)
- युजर प्रत्येक ॲपसाठी दररोजचा वेळ ठरवू शकतो (उदा. Instagram साठी 15 मिनिटे).
- युसेज ट्रॅकर (`lc.java`) स्क्रीन चालू असताना त्या ॲपचा नेमका वेळ मोजतो.
- 15 मिनिटे संपताच ॲप उघडल्यास *"Instagram limit reached for today. Available tomorrow."* हा मेसेज दाखवून ॲप ब्लॉक केले जाते.

### B. पोस्ट मोड / तात्पुरती सूट (Post Mode / Content Break)
- जर युजरला काही फोटो किंवा स्टोरी पोस्ट करायची असेल, तर युजर "Post Mode" ऑन करू शकतो (उदा. 5 मिनिटांसाठी).
- या काळात SocialLite ब्लॉकिंग तात्पुरते बंद करते.
- 5 मिनिटे संपताच टायमर आपोआप ट्रिगर होतो आणि ॲप पुन्हा ब्लॉक होते (`cleanUpPostMode()`).

### C. स्लीप मोड ब्लॉकिंग (Sleep Mode Enforcer)
- रात्रीच्या वेळी (उदा. 10:30 PM ते 6:30 AM) सर्व सोशल ॲप्स सक्तीने ब्लॉक राहतात.
