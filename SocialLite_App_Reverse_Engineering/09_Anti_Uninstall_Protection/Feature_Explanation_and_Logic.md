# 09. ॲन्टी-अनइन्स्टॉल सुरक्षा (Anti-Uninstall Protection)

## १. फिचरचे काम (What It Does)
जेव्हा एखादा युजर किंवा मुलगा सोशल मीडियाच्या प्रचंड व्यसनात अडकलेला असतो आणि फोकस मोडमुळे ॲप्स उघडत नसतात, तेव्हा सर्वात पहिली प्रतिक्रिया असते: **"SocialLite ॲपच अनइन्स्टॉल करून टाका!"**

SocialLite ने हे रोखण्यासाठी Android च्या **डिव्हाइस ॲडमिनिस्ट्रेटर (Device Administration API)** चा वापर केला आहे:
1. **अनइन्स्टॉलेशन ब्लॉक करणे**: जोपर्यंत डिव्हाइस ॲडमिन चालू आहे, तोपर्यंत Android सिस्टीम सोशललाईट ॲप अनइन्स्टॉल करण्याचे बटणच ब्लॉक करते!
2. **डिसेबल वॉर्निंग (Disable Warning)**: जर युजरने सिस्टीम सेटिंग्समध्ये जाऊन ॲडमिन बंद करण्याचा प्रयत्न केला, तर सोशललाईट एक गंभीर चेतावणी डायलॉग दाखवते (`uninstall_protection_disable_warning`).
3. **पालकांसाठी सुरक्षा**: मुलाला पालकांच्या पासवर्डशिवाय ॲप काढून टाकता येत नाही.

---

## २. कॉम्पोनंट्स (Components)

1. `com.sociallite.android.data.UninstallProtectionReceiver`: `DeviceAdminReceiver` सबक्लास.
2. `res/xml/device_admin.xml`: डिव्हाइस ॲडमिन पॉलिसी डिक्लेरेशन.
3. स्ट्रिंग रिसोर्सेस:
   - `uninstall_protection_admin_label`: "SocialLite Protection"
   - `uninstall_protection_admin_description`: "Prevents SocialLite from being uninstalled during active focus blocks and bedtime."
   - `uninstall_protection_disable_warning`: "Disabling protection will allow SocialLite to be removed, resetting your streaks and focus sessions."
