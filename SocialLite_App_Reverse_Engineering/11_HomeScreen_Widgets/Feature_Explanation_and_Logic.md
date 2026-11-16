# 11. होमस्क्रीन ॲप विजेट्स (HomeScreen Widgets)

## १. फिचरचे काम (What It Does)
युजर्सना फोनच्या मुख्य स्क्रीनवर (HomeScreen) सोशल ॲप्सचे आयकॉन्स ठेवण्याची सवय असते. जर त्यांनी अधिकृत Instagram आयकॉनवर क्लिक केले तर ते व्यसनात अडकतात.

SocialLite युजर्सना **होमस्क्रीन विजेट्स (App Widgets)** पुरवते:
1. **क्विक लाँच (1-Tap Clean Launch)**:
   - युजर होमस्क्रीनवर "Instagram", "YouTube", "X", "TikTok" चे विजेट्स ठेवू शकतो.
   - यावर टॅप करताच अधिकृत ॲप उघडण्याऐवजी SocialLite चे क्लीन, रील्स-मुक्त व्हर्जन उघडते.
2. **रिअल-टाईम कोटा माहिती (Remaining Time Badge)**:
   - विजेटवरच दिसते की आज त्या ॲपसाठी किती वेळ शिल्लक आहे (उदा. *"18 min left"*).
3. **क्विक लाँचर बार (QuickLaunch Widget)**:
   - एकाच विजेट पट्टीमध्ये सर्व सोशल मीडियाचे आयकॉन्स एकत्र असतात.

---

## २. उपलब्ध विजेट्सची यादी (Available Widgets)

| विजेट प्रदाता (Provider) | लेबल (Label) | XML कॉन्फिगरेशन |
|---|---|---|
| `InstagramWidgetProvider` | Instagram | `res/xml/widget_info_instagram.xml` |
| `YouTubeWidgetProvider` | YouTube | `res/xml/widget_info_youtube.xml` |
| `TwitterWidgetProvider` | X | `res/xml/widget_info_twitter.xml` |
| `TikTokWidgetProvider` | TikTok | `res/xml/widget_info_tiktok.xml` |
| `FacebookWidgetProvider` | Facebook | `res/xml/widget_info_facebook.xml` |
| `LinkedInWidgetProvider` | LinkedIn | `res/xml/widget_info_linkedin.xml` |
| `SnapchatWidgetProvider` | Snapchat | `res/xml/widget_info_snapchat.xml` |
| `QuickLaunchWidgetProvider` | Quick Launch | `res/xml/widget_info_quick_launch.xml` |
