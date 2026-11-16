# SocialLite Complete Reverse Engineered Context (CONTEXT.md)

Refer to [AGENT_CONTEXT.md](file:///c:/Users/Girish%20Lade/OneDrive/Desktop/SocialLite/AGENT_CONTEXT.md) and the 15 reference folders in [SocialLite_App_Reverse_Engineering](file:///c:/Users/Girish%20Lade/OneDrive/Desktop/SocialLite/SocialLite_App_Reverse_Engineering) for full technical documentation, decompiled sources, and architecture breakdowns.


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
