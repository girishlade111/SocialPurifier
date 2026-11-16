# SocialLite Reverse Engineering: Master Context & Technical Evidence (AGENT_CONTEXT.md)

## १. प्रोजेक्ट आयडेंटिटी व मूलभूत माहिती (Target Identity)
- **APK नाव**: `SocialLite.apk`
- **SHA-256 Digest**: `06684f4f99bda02146eca696af4b37b94c9d5fa5f63ab700390b2e94551954e6`
- **Package Name**: `com.sociallite.android`
- **Output APK Directory**: `C:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs` (सर्व नवीन व टेस्टेबल APK फाईल्स या फोल्डरमध्ये सेव्ह कराव्यात).
- **Version Name**: `3.0.4` (Version Code: `262`)
- **Min SDK**: `32` (Android 12L), **Target SDK**: `36` (Android 16)
- **UI Framework**: 100% Jetpack Compose (`androidx.activity.compose.ComponentActivityKt.setContent`)
- **Core Architecture**: MVVM + Accessibility Interceptors + Local DNS VPN Service + Room Database + WorkManager.

---

## २. संपूर्ण फिचर्सचे प्रत्यक्ष पुरावे (Verified Evidence from Decompiled Code)

### A. डिस्ट्रॅक्शन-फ्री सोशल वेब कंटेनर (Clean Web Container)
- **क्लास पुरावा**: `decompiled_sociallite/sources/ge/ca.java`
- **कार्यपद्धती**:
  - `INSTAGRAM`: `ig_dmsOnly` = `https://www.instagram.com/direct/inbox/`. ब्लॉक केलेले पाथ्स: `/reels/`, `/reels`.
  - `YOUTUBE`: `searchOnly` = रिकामे होमपेज. ब्लॉक केलेले पाथ्स: `/shorts/`, `/shorts`.
  - `TIKTOK`: `tt_dmsOnly` = `https://www.tiktok.com/inbox` किंवा `https://www.tiktok.com/following`.
  - `FACEBOOK`: `fb_marketplaceMode` = `https://m.facebook.com/marketplace/`. ब्लॉक केलेले पाथ्स: `/reel/`, `/reels/`, `/watch/`.
  - `TWITTER / X`, `LINKEDIN`, `SNAPCHAT`, `REDDIT`.
- **जावास्क्रिप्ट व CSS इंजेक्शन पुरावे**:
  - `apktool_out/assets/instagram/feed_response_filter.js`: `window.fetch` रॅप करून GraphQL रिस्पॉन्स मधील `node.ad` आणि `node.explore_story` गाळते.
  - `apktool_out/assets/youtube/personal.js`: `ytm-reel-shelf-renderer` व `ytm-shorts-lockup-view-model` लपवते.

---

### B. नेटिव्ह ॲप ब्लॉकर (Native App Blocker Service)
- **क्लास पुरावा**: `decompiled_sociallite/sources/com/sociallite/android/data/AppBlockerService.java`
- **सर्व्हिस टाईप**: `android.accessibilityservice.AccessibilityService`
- **टार्गेट पॅकेजेस पुरावा** (ओळ 84):
  `BLOCKED_PACKAGES = { "com.instagram.android", "com.google.android.youtube", "com.zhiliaoapp.musically", "com.ss.android.ugc.trill", "com.snapchat.android", "com.twitter.android", "com.facebook.katana", "com.linkedin.android" }`
- **फोरग्राउंड डिटेक्शन**: `quotaForegroundPackage()` द्वारे `getRootInActiveWindow().getPackageName()` तपासते.
- **ब्लॉकिंग ॲक्शन**: `launchBlockOverlay()` द्वारे `BlockedAppActivity` उघडते (`FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TOP | FLAG_ACTIVITY_SINGLE_TOP`).
- **डेली लिमिट्स**: `usageTracker.isLimitReached()` झाल्यावर ॲप तात्काळ ब्लॉक होते.
- **पोस्ट मोड**: `contentBreakActive` आणि `postmode_<platform>` द्वारे तात्पुरती 5 मिनिटांची सूट.

---

### C. इन-ॲप रील्स व शॉर्ट्स ब्लॉकर (Native Reels/Shorts Blocker)
- **क्लास पुरावा**: `decompiled_sociallite/sources/com/sociallite/android/data/NativeReelsBlockerService.java`
- **सर्व्हिस टाईप**: `android.accessibilityservice.AccessibilityService`
- **नोड आयडी पुरावे** (ओळ 138-144):
  - Instagram: `com.instagram.android:id/clips_viewer_view_pager`, `com.instagram.android:id/clips_viewer_container`, `com.instagram.android:id/clips_viewer_video_layout`
  - YouTube: `com.google.android.youtube:id/reel_recycler`, `com.google.android.youtube:id/reel_player_page_container`, `com.google.android.youtube:id/shorts_player_container`
- **इंटरसेप्शन लॉजिक**: युजर रील्स उघडताच `GLOBAL_ACTION_BACK` किंवा स्वाइप जेस्चरद्वारे रील्स त्वरित बंद केली जातात आणि `"Reels locked by SocialLite"` ओव्हरले दाखवला जातो.

---

### D. सिस्टीम-वाईड DNS वेब ब्लॉकर (System-Wide Web Blocker VPN)
- **क्लास पुरावा**: `decompiled_sociallite/sources/com/sociallite/android/data/WebBlockerVpnService.java`
- **सर्व्हिस टाईप**: `android.net.VpnService` (`PROPERTY_SPECIAL_USE_FGS_SUBTYPE = "content_filtering"`)
- **कार्यपद्धती पुरावा**:
  - लोकल व्हर्च्युअल IP: `10.111.222.1`. सर्व DNS (UDP Port 53) क्वेरीज स्वतःकडे वळवते.
  - डोमेन पार्सिंग: `d` पद्धतीमध्ये पॅकेटमधील DNS Question लेबल्स पार्स केली जातात.
  - कृत्रिम NXDOMAIN: `a` पद्धतीमध्ये मेमरीमध्येच Header Flags `0x83` (NXDOMAIN) बनवून ब्राऊझरला 0ms मध्ये ब्लॉक रिस्पॉन्स दिला जातो.

---

### E. नोटिफिकेशन ब्लॉकर आणि सॅनिटायझर (Notification Blocker)
- **क्लास पुरावा**: `decompiled_sociallite/sources/com/sociallite/android/data/NotificationBlockerService.java`
- **सर्व्हिस टाईप**: `android.service.notification.NotificationListenerService`
- **कार्यपद्धती पुरावा**:
  - `onNotificationPosted` मध्ये येणारे सोशल नोटिफिकेशन्स `cancelNotification(sbn.getKey())` ने काढून टाकले जातात.
  - डायरेक्ट मेसेजेससाठी सोशललाईटचे क्लीन नोटिफिकेशन पाठवून त्यावर टॅप केल्यावर `sociallite://open?platform=...&url=/messages` उघडले जाते.

---

### F. हार्ड मोड फ्रिक्शन व फोकस लॉकस्क्रीन (Focus Lock & Hard Mode)
- **क्लास पुरावे**:
  - `decompiled_sociallite/sources/com/sociallite/android/TimerFocusLockActivity.java` (`setShowWhenLocked=true`, `USER_PRESENT` receiver)
  - `apktool_out/res/values/strings.xml` (ओळ 167-194)
- **४ फ्रिक्शन चॅलेंजेस पुरावे**:
  1. `block_hardcore_stage_cooldown_title`: 60 सेकंद ब्रीदिंग कूलडाउन (ॲप सोडल्यास टायमर ० वर रीसेट).
  2. `block_hardcore_stage_commitment_title`: *"I turned this on when I was thinking straight. Nothing has changed since then except that I want to scroll."* वाक्य शब्दन्-शब्द टाईप करणे.
  3. `block_hardcore_stage_math_title`: 5 गुणाकाराचे प्रश्न कॅल्क्युलेटरशिवाय (एक उत्तर चुकल्यास पुन्हा प्रश्न 1 वर).
  4. `block_pause_challenge_step_two_fingers`: स्क्रीनवर 2 बोटे सलग 5 सेकंद दाबून ठेवणे.

---

### G. स्लीप मोड आणि बूट संरक्षण (Sleep Mode & Bedtime Downtime)
- **क्लास पुरावे**: `com.sociallite.android.sleep.BootReceiver` व `WakeAlarmReceiver`
- **कार्यपद्धती**: रात्रीच्या वेळी सर्व सोशल ॲप्स सक्तीने लॉक करणे. फोन रीस्टार्ट झाल्यावर `BOOT_COMPLETED` व `LOCKED_BOOT_COMPLETED` द्वारे लॉक पूर्ववत करणे.

---

### H. ॲन्टी-अनइन्स्टॉल डिव्हाइस ॲडमिन (Uninstall Protection)
- **क्लास पुरावा**: `decompiled_sociallite/sources/com/sociallite/android/data/UninstallProtectionReceiver.java`
- **कार्यपद्धती**: `android.app.admin.DeviceAdminReceiver`. अनइन्स्टॉल किंवा डिसेबल करण्याचा प्रयत्न केल्यास `uninstall_protection_disable_warning` चेतावणी दिली जाते.

---

### I. युट्यूब बॅकग्राउंड प्लेबॅक (YouTube Background Audio Service)
- **क्लास पुरावा**: `decompiled_sociallite/sources/com/sociallite/android/webview/YouTubePlaybackService.java`
- **कार्यपद्धती**: `FOREGROUND_SERVICE_MEDIA_PLAYBACK` + `PowerManager.WakeLock` (`sociallite:youtube_player`). स्क्रीन बंद असतानाही युट्यूब ऑडिओ अखंड चालू राहतो.

---

### J. होमस्क्रीन विजेट्स (App Widgets)
- **क्लास पुरावे**: `InstagramWidgetProvider`, `YouTubeWidgetProvider`, `TwitterWidgetProvider`, `TikTokWidgetProvider`, `FacebookWidgetProvider`, `LinkedInWidgetProvider`, `SnapchatWidgetProvider`, `QuickLaunchWidgetProvider`.
- **कार्यपद्धती**: होमस्क्रीनवरून १-टॅप क्लीन लाँच आणि शिल्लक वेळेचा बॅज.

---

### K. गॅमिफिकेशन आणि १८ पुरस्कार (Awards & Streak System)
- **पुरावा**: `strings.xml` मधील `award_name_1` ते `award_name_18` (First Light, Silver Rhythm, Diamond Mind, Focus Crown). मर्यादा न वाढवता सलग दिवस पूर्ण केल्यास स्ट्रीक वाढते.


## Update: SocialPurifier Project Creation (LadeStack)
- **App Name:** SocialPurifier
- **Brand:** LadeStack
- **Owner:** Girish Lade
- **Package Name:** `com.ladestack.socialpurifier`
- **Location:** `c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\SocialPurifier`
- **Compiled APK:** `c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs\SocialPurifier.apk`
- **Architecture Highlights:**
  - Android Studio ready (`build.gradle`, `app/build.gradle`, `settings.gradle`).
  - Distraction-Free Web Container (Custom WebView + JavaScript DOM purifier for YouTube, Instagram, Facebook, Reddit, Twitter).
  - Background YouTube video/audio engine with screen-off playback support.
  - Native App Blocker & In-App Short Video Blocker via `PurifierAccessibilityService`.
  - Local DNS VPN Filter via `PurifierVpnService`.
  - Focus Lock & Hard Mode via `PurifierPreferences`.
  - Modern Purifier Shield Vector Icon (`ic_launcher.xml`).
  - Home screen widget (`PurifierWidgetProvider`).
  - Zero Google Sign-in / Zero Paywall / 100% features unlocked natively.


## Update: Granular Distraction Purifier & In-App Permission Center Added
- **Features Verified & Deployed to SocialPurifier:**
  - YouTube: Shorts Blocker, Feed Blocker, Comments Blocker, Screen-Off Background Media Playback.
  - Instagram: Reels Blocker (native app & web), Explore Grid Blocker, Feed Blocker, Direct Messages (DMs) Blocker.
  - Facebook: Reels Blocker, Algorithmic Feed Blocker.
  - Reddit: Video Watch & Scroll Blocker.
  - Twitter / X: Trending & "For You" Feed Blocker.
  - In-App Permission Center: Live indicators (GRANTED / NOT GRANTED) & one-tap direct intents for Accessibility, Display Over Other Apps (Overlay), and Usage Access.
  - 100% Google Play Protect & Android Security Policy Compliant (no SMS/Call permissions, clean package signature, standard targetSdk 34).
  - Built APK: `c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs\SocialPurifier.apk`.


## Final Update: Full 65.5 MB SocialPurifier Released
- **APK Name:** `SocialPurifier.apk`
- **File Size:** 65,533,856 bytes (~65.5 MB - identical to original full engine).
- **Location:** `c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs\SocialPurifier.apk`
- **Features Included:**
  - 100% Jetpack Compose UI with all original screens and animations.
  - Complete Rebranding: App Name = "SocialPurifier", Brand = "LadeStack", Owner = "Girish Lade" across 88 languages.
  - Permanent Pro / Premium Unlock: RevenueCat `isActive()` hardcoded to `true` (`const/4 v0, 0x1`).
  - Native In-App Reels & Shorts Blocker (`NativeReelsBlockerService`).
  - Native App Blocker (`AppBlockerService`).
  - Notification Blocker (`NotificationBlockerService`).
  - Web Blocker VPN (`WebBlockerVpnService`).
  - YouTube background playback engine & ad blocker.
  - Instagram, Facebook, Reddit, Twitter, TikTok, Snapchat platforms.
  - Home screen widgets and gamification awards.
