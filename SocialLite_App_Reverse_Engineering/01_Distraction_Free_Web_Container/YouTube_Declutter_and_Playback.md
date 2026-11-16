# YouTube डीक्लटर आणि बॅकग्राउंड प्लेबॅक लॉजिक (YouTube Declutter & Playback)

## १. फिचरचे काम (What It Does)
YouTube वरील व्यसन निर्माण करणारे मुख्य घटक म्हणजे:
1. **YouTube Shorts**: 1 मिनिटांपेक्षा कमी लांबीचे व्हिडिओ, जे एकामागे एक आपोआप प्ले होतात.
2. **होम फीड अल्गोरिदम**: ॲप उघडताच हजारो थंबनेल्स दाखवून लक्ष विचलित करणे.
3. **वॉच पेज रेकमेंडेशन्स**: व्हिडिओ पाहताना खाली सजेस्टेड व्हिडिओंची भलीमोठी यादी.

SocialLite या सर्व घटकांना लपवून YouTube ला एक **स्वच्छ, शांत आणि उद्देशपूर्ण व्हिडिओ टूल (Clean Intentional Video Tool)** बनवते.

---

## २. CSS आणि DOM इंजेक्शन कार्यपद्धती (`personal.js`)

SocialLite `apktool_out/assets/youtube/personal.js` हे स्क्रिप्ट इंजेक्ट करते:

### A. YouTube Shorts शेल्फ आणि बटणे लपवणे
```javascript
if (C.shorts) {
    var selectors = [
        'ytm-reel-shelf-renderer',
        'ytm-shorts-lockup-view-model',
        'ytm-rich-shelf-renderer:has(a[href*="/shorts/"])',
        'ytm-rich-section-renderer:has(ytm-shorts-lockup-view-model)',
        'ytm-rich-section-renderer:has(ytm-reel-shelf-renderer)',
        'ytm-shelf-renderer:has(a[href*="/shorts/"])',
        'ytm-video-with-context-renderer:has([data-style="SHORTS"])',
        'ytm-compact-video-renderer:has([data-style="SHORTS"])',
        'ytm-rich-item-renderer:has([data-style="SHORTS"])'
    ];
    selectors.forEach(function(x) { s += x + '{display:none!important}\n'; });
    
    // नेव्हिगेशन बारमधील शॉर्ट्स बटण गायब करणे:
    s += 'ytm-pivot-bar-item-renderer[tab-identifier="FEshorts"], ytm-pivot-bar-item-renderer[tab-identifier="shorts"] {display:none!important}\n';
}
```

### B. "सर्च-ओन्ली" मोड (Search-Only Mode)
जेव्हा युजर "Search Only" मोड ऑन करतो, तेव्हा युट्यूबचे होमपेज पूर्णपणे रिकामे दिसते, जेणेकरून युजर फक्त जे हवे आहे तेच सर्च करून पाहू शकेल:
```javascript
if (C.searchOnly) {
    // होमपेजवरील सर्व रिकमेंडेशन्स ब्लॉक:
    s += 'html[__NS__-home] ytm-rich-item-renderer, html[__NS__-home] ytm-rich-section-renderer {display:none!important}\n';
    s += 'html[__NS__-home] ytm-single-column-browse-results-renderer > .tab-content {display:none!important}\n';
    
    // व्हिडिओ पाहताना ऑटो-प्ले आणि रिलेटेड व्हिडिओज बंद:
    s += 'ytm-watch-next-secondary-results-renderer, ytm-compact-autoplay-renderer, .related-chips-slot-wrapper, ytm-autonav-toggle-button-renderer {display:none!important}\n';
}
```

---

## ३. बॅकग्राउंड ऑडिओ प्लेबॅक आणि वेक-लॉक (`YouTubePlaybackService.java`)

YouTube सामान्यतः बॅकग्राउंडमध्ये व्हिडिओ पॉज करते जेव्हा स्क्रीन लॉक होते किंवा ॲप मिनिमाइज होते. SocialLite हे कसे बायपास करते?

1. **JavaScript Hook**: व्हिडिओ एलिमेंटचा `pause` इव्हेंट रोखला जातो.
2. **Foreground Service**: `YouTubePlaybackService` सुरू केला जातो (`foregroundServiceType="mediaPlayback"`).
3. **PowerManager WakeLock**:
```java
PowerManager.WakeLock wakeLock = ((PowerManager) getSystemService(PowerManager.class))
    .newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "sociallite:youtube_player");
wakeLock.acquire(14400000L); // 4 तास वेक-लॉक चालू ठेवला जातो
```
4. **Media Notification**: युजरला स्टेटस बारमध्ये प्ले/पॉज/स्टॉप ॲक्शन्ससह नोटिफेक्शन दिसते.

---

## ४. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `personal.js` मधील CSS रूल्स एका स्टाइलशीट स्ट्रिंगमध्ये ठेवा आणि WebView च्या डॉक्युमेंट हेडमध्ये अपेंड करा.
2. Android Manifest मध्ये `FOREGROUND_SERVICE_MEDIA_PLAYBACK` आणि `WAKE_LOCK` परमिशन द्या.
3. युट्यूबच्या `onHideCustomView()` किंवा `Activity.onStop()` मध्ये व्हिडिओ पॉज न करता `YouTubePlaybackService` ला चालू ठेवा.
