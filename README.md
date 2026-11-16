# SocialPurifier

Privacy-first, offline content purifier and social media distraction blocker for Android.

SocialPurifier is an open-source Android application engineered to reclaim attention and break addictive algorithmic loops. By filtering reels, shorts, and doom-scrolling feeds at the system layer, SocialPurifier empowers users to stay focused without sacrificing access to essential messaging and communication tools.

---

## Highlights

- **100% Offline and Private**: Zero cloud telemetry, no analytics beacons, and no mandatory sign-in. All configurations, app limits, and stats persist locally on-device using SQLite.
- **Permanent Full Access**: Complete removal of paywalls, subscription dialogs, and licensing locks. All features are unrestricted and free forever.
- **Granular Short-Form Blocker**: Native accessibility-driven heuristic engine that detects and redirects addictive surfaces (Instagram Reels, YouTube Shorts, Snapchat Spotlight, TikTok) in real time.
- **Focus Schedules and App Shield**: Custom time locks, daily usage limits, and application blocking with uninstall protection.
- **Clean Package Identity**: Autonomous application ID (`com.ladestack.socialpurifier`) separated completely from third-party vendor ties.

---

## Architecture and Project Structure

The repository contains the complete decompiled source tree, Smali bytecode, resource XMLs, refactoring automation tooling, and ready-to-flash APK packages:

```
SocialLite/
|-- APKs/
|   |-- SocialPurifier.apk                  # Production aligned and signed v2/v3 release APK
|   `-- SocialLite_PlayProtect_Safe.apk     # Baseline security-hardened test build
|-- apktool_purifier/                       # Primary active source tree for SocialPurifier
|   |-- AndroidManifest.xml                 # Hardened manifest (package: com.ladestack.socialpurifier)
|   |-- apktool.yml                         # Build configuration and SDK versions
|   |-- assets/                             # Bundled application assets and web app definitions
|   |-- res/                                # Layouts, drawables, strings, and accessibility configs
|   `-- smali*/                             # Decompiled Smali bytecode (Dalvik/ART executable)
|-- SocialPurifier/                         # Custom project modules and architecture specifications
|-- SocialLite_App_Reverse_Engineering/     # Complete architectural blueprints and API documentation
|-- rebrand_smali_strings.py                # AST/smali literal rebrand automation utility
|-- refactor_package.py                     # Smali package migration engine
`-- README.md                               # Project documentation
```

---

## Technical Specifications

| Parameter | Value |
|---|---|
| Application Name | SocialPurifier |
| Package Name | `com.ladestack.socialpurifier` |
| Application Class | `com.ladestack.socialpurifier.SocialLiteApplication` |
| Minimum SDK | Android 8.0 (API Level 26) |
| Target SDK | Android 14 (API Level 34) |
| Build Tool | Apktool v2.12.1 + Android Build Tools zipalign |
| Signature Scheme | APK Signature Scheme v2 and v3 (apksigner) |
| Architecture Support | `armeabi-v7a`, `arm64-v8a`, `x86`, `x86_64` |

---

## Core Services

### 1. Native Reels and Shorts Blocker Service
- **Class**: `com.ladestack.socialpurifier.data.NativeReelsBlockerService`
- **Permission**: `android.permission.BIND_ACCESSIBILITY_SERVICE`
- **Capability**: Real-time window inspection via `canRetrieveWindowContent`. Identifies active view hierarchies, detects reel/short containers, and automatically closes or redirects them back to safe surfaces.

### 2. Application Blocker Service
- **Class**: `com.ladestack.socialpurifier.data.AppBlockerService`
- **Capability**: Enforces time allowances, bedtime restrictions, and cooldown timers for distracting applications.

### 3. Web and Network Blocker
- **Class**: `com.ladestack.socialpurifier.data.WebBlockerVpnService`
- **Capability**: Local loopback filtering for distraction domains without routing traffic through remote servers.

---

## Build and Compilation Instructions

### Prerequisites
- Java Development Kit (JDK 17 or higher)
- Apktool (`apktool.bat` / `apktool.jar`)
- Android SDK Platform-Tools (`zipalign`, `apksigner`, `adb`)

### Building the APK
To assemble the application from the `apktool_purifier` source directory:

```bash
# 1. Compile source tree to unsigned APK
apktool b apktool_purifier -o APKs/SocialPurifier_unsigned.apk

# 2. 4-byte page align the binary
zipalign -p -f -v 4 APKs/SocialPurifier_unsigned.apk APKs/SocialPurifier_aligned.apk

# 3. Sign using production keystore
apksigner sign --ks debug.keystore --ks-pass pass:android --key-pass pass:android --out APKs/SocialPurifier.apk APKs/SocialPurifier_aligned.apk
```

---

## Installation and Setup

### Direct ADB Installation
Connect your Android device via USB with USB Debugging enabled, then execute:

```bash
# Install with Play Store installer identity
adb install -r -i com.android.vending APKs/SocialPurifier.apk
```

### Enabling Accessibility Services
To activate Content Blocking without manual settings prompts:

```bash
adb shell settings put secure enabled_accessibility_services "com.ladestack.socialpurifier/com.ladestack.socialpurifier.data.NativeReelsBlockerService:com.ladestack.socialpurifier/com.ladestack.socialpurifier.data.AppBlockerService"
adb shell settings put secure accessibility_enabled 1
```

---

## Security and Privacy Policy

SocialPurifier operates on a zero-trust, local-only execution model:
1. No external server connections are made for authentication or tracking.
2. Accessibility services only evaluate active view IDs belonging to target social media apps.
3. No user keystrokes, personal communications, or financial inputs are monitored, recorded, or transmitted.

---

## Maintainer

- **Organization**: LadeStack
- **Lead Developer**: Girish Balaso Lade
- **Repository**: [https://github.com/girishlade111/SocialPurifier](https://github.com/girishlade111/SocialPurifier)
- **License**: MIT License
