# 03. इन-ॲप नेटिव्ह रील्स व शॉर्ट्स ब्लॉकर (In-App Reels & Shorts Blocker)

## १. फिचरचे काम (What It Does)
बहुतेक ॲप ब्लॉकर्स संपूर्ण ॲपच बंद करतात (उदा. पूर्ण Instagram बंद करणे). पण अनेक युजर्सना Instagram वरील मित्रांचे मेसेजेस (DMs), महत्त्वाचे अपडेट्स किंवा युट्यूबवरील शैक्षणिक व्हिडिओ पाहायचे असतात. अडचण तेव्हा होते जेव्हा युजर अनवधानाने "Reels" किंवा "Shorts" टॅबवर क्लिक करतो आणि तासनतास स्क्रोल करत राहतो.

SocialLite चे **NativeReelsBlockerService** हे जगातील सर्वात प्रगत तंत्रज्ञान वापरते:
- **युजर अधिकृत Instagram / YouTube ॲप वापरू शकतो** (DMs, फोटो पोस्ट्स, चॅट्स, नेहमीचे व्हिडिओ सर्व चालू राहतात).
- पण युजरने **जशी रील्स (Reels) किंवा शॉर्ट्स (Shorts) उघडली, तसे SocialLite त्याला त्वरित बंद करते किंवा लॉक स्क्रीन दाखवते!**

---

## २. टार्गेट व्ह्यू आयडी आणि पॅकेजेस (Target View IDs)

`NativeReelsBlockerService.java` मध्ये खालील नोड्स स्कॅन केले जातात:

### A. Instagram Reels View IDs:
1. `com.instagram.android:id/clips_viewer_view_pager` (रील्सचा मुख्य स्वाइप व्ह्यू)
2. `com.instagram.android:id/clips_viewer_container` (रील्स कंटेनर)
3. `com.instagram.android:id/clips_viewer_video_layout` (व्हिडिओ लेआउट)

### B. YouTube Shorts View IDs:
1. `com.google.android.youtube:id/reel_recycler` (शॉर्ट्सचा रिसायकलर व्ह्यू)
2. `com.google.android.youtube:id/reel_player_page_container` (शॉर्ट्स प्लेअर कंटेनर)
3. `com.google.android.youtube:id/shorts_player_container` (मॉडर्न शॉर्ट्स प्लेअर)

### C. TikTok आणि Snapchat:
- TikTok पॅकेजेस: `com.zhiliaoapp.musically`, `com.ss.android.ugc.trill`
- Snapchat Spotlight नोड्स

---

## ३. ब्लॉक ॲक्शन कशी घेतली जाते? (Action Mechanics)

जेव्हा युजर रील्स नोडवर पोहोचतो, तेव्हा SocialLite खालीलपैकी एक ॲक्शन घेते:
1. **ऑटोमॅटिक बॅक ॲक्शन (Automatic Back Action)**:
   - `performGlobalAction(GLOBAL_ACTION_BACK)` कॉल करून युजरला रील्समधून बाहेर काढून थेट मुख्य फीड किंवा चॅटवर आणले जाते.
2. **इन-ॲप ओव्हरले (In-App Overlay Window)**:
   - `WindowManager` द्वारे त्या रील्स स्क्रीनवर एक सुंदर काळा ओव्हरले टाकला जातो, ज्यावर लिहिलेले असते:
   *"Reels locked by SocialLite — Your focus is protected."*
3. **जेस्चर डिस्मिसल (Swipe Gesture Simulation)**:
   - जर बॅक बटण काम करत नसेल, तर `dispatchGesture()` द्वारे स्वाइप जेस्चर सिमुलेट करून रील्स स्क्रीन बंद केली जाते.
