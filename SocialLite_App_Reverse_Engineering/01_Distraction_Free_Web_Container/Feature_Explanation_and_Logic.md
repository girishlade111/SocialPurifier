# 01. डिस्ट्रॅक्शन-फ्री सोशल वेब कंटेनर (Distraction-Free Social Web Container)

## १. फिचरचे काम (What It Does)
सोशललाईटचे मूळ वैशिष्ट्य म्हणजे हे युजरला मुख्य सोशल मीडिया प्लॅटफॉर्म्स (Instagram, YouTube, X, TikTok, Facebook, LinkedIn, Snapchat, Reddit) वापरण्याची परवानगी देते, परंतु **त्यांमधील व्यसनाधीन भाग (उदा. अल्गोरिदम फीड, रील्स, शॉर्ट्स, ॲड्स, एक्स्प्लोर टॅब आणि रेकमेंडेशन्स) पूर्णपणे काढून टाकते**.

युजर फक्त कामापुरता सोशल मीडिया वापरू शकतो:
- फक्त डायरेक्ट मेसेज (DMs Only Mode)
- फक्त सर्च (Search-Only Mode)
- फक्त फॉलो केलेल्या लोकांच्या पोस्ट्स (Following Only Feed)
- झिरो ॲड्स आणि झिरो सजेस्टेड पोस्ट्स

---

## २. सपोर्टेड प्लॅटफॉर्म्स आणि त्यांचे मोड्स (Platforms & Clean Modes)

`ge.ca.java` या इनम क्लासमधून रिव्हर्स इंजिनिअर केलेली माहिती:

| प्लॅटफॉर्म | डीफॉल्ट URL | स्पेशल मोड्स व ऑप्शन्स | ब्लॉक केलेले पाथ्स (Blocked Paths) |
|---|---|---|---|
| **Instagram** | `https://www.instagram.com/accounts/login/` | १) `ig_dmsOnly` = `https://www.instagram.com/direct/inbox/`<br>२) Hide Suggested Posts<br>३) Hide Feed Ads | `/reels/`, `/reels` |
| **YouTube** | `https://m.youtube.com/` | १) `searchOnly` (होम फीड ब्लँक)<br>२) `watchRecs` (संबंधित व्हिडिओ बंद)<br>३) बॅकग्राउंड ऑडिओ प्लेबॅक | `/shorts/`, `/shorts` |
| **TikTok** | `https://www.tiktok.com/inbox` | १) `tt_dmsOnly` = `/inbox`<br>२) फॉलोइंग फीड = `/following`<br>३) "For You" फीड पूर्णपणे ब्लॉक | `/foryou` |
| **Facebook** | `https://m.facebook.com/` | `fb_marketplaceMode` = `https://m.facebook.com/marketplace/` | `/reel/`, `/reels/`, `/reels`, `/watch/` |
| **X (Twitter)** | `https://x.com/home` | फॉर यू टॅब लपवणे, ट्रेंड्स लपवणे | ट्रेंड्स व अल्गोरिदम फीड |
| **LinkedIn** | `https://www.linkedin.com/feed/` | जॉब्स आणि मेसेजिंगवर फोकस, फीड लपवणे | ॲड्स आणि स्पॉन्सर्ड पोस्ट्स |
| **Snapchat** | `https://www.snapchat.com/web/` | स्पॉटलाइट आणि डिस्कव्हर लपवणे | डिस्कव्हर व स्पॉटलाइट स्टोरीज |
| **Reddit** | `https://www.reddit.com/` | पॉप्युलर/ऑल फीड बंद | होम फीड ॲड्स |

---

## ३. वर्किंग लॉजिक आणि अंमलबजावणी (Working Logic & Implementation)

### A. URL नेव्हिगेशन व पाथ ब्लॉकिंग लॉजिक (`ca.java`)
```java
// जेव्हा युजर एखाद्या लिंकवर क्लिक करतो किंवा पेज लोड होते:
public final List b(Context context) {
    i3 prefs = d2.B(context);
    int platform = ordinal();
    
    // Instagram साठी रील्स पाथ ब्लॉक करणे:
    if (platform == 0) { // INSTAGRAM
        ArrayList blocked = new ArrayList();
        if (prefs.getBoolean("ig_blockReels", true)) {
            blocked.add("/reels/");
            blocked.add("/reels");
        }
        return blocked;
    }
    
    // YouTube साठी शॉर्ट्स पाथ ब्लॉक करणे:
    if (platform == 1) { // YOUTUBE
        ArrayList blocked = new ArrayList();
        if (prefs.getBoolean("yt_blockShorts", true)) {
            blocked.add("/shorts/");
            blocked.add("/shorts");
        }
        return blocked;
    }
    
    // Facebook साठी वॉच आणि रील्स ब्लॉक करणे:
    if (platform == 4) { // FACEBOOK
        return List.of("/reel/", "/reels/", "/reels", "/watch/");
    }
    return Collections.emptyList();
}
```

### B. WebView मधील क्लायंट इंटरसेप्शन (`WebViewClient.shouldOverrideUrlLoading`)
1. जेव्हा युजर नेव्हिगेट करतो, तेव्हा URL चे स्कीमा (Schema) तपासले जाते (`http`, `https` सोडून इतर अज्ञात स्कीमा त्वरित रोखले जातात).
2. URL पाथ तपासला जातो - जर युजरने `/reels/` किंवा `/shorts/` वर क्लिक केले, तर `WebView` नेव्हिगेशन कॅन्सल करते आणि मूळ फीडवर राहते किंवा अलर्ट दाखवते.
3. पेज लोड होताच `assets/` मधील जावास्क्रिप्ट आणि CSS इंजेक्ट केली जाते.
