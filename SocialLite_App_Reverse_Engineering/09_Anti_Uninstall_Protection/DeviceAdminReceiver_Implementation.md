# DeviceAdminReceiver कोड व अंमलबजावणी (Device Admin Implementation)

## १. XML पॉलिसी डिक्लेरेशन (`res/xml/device_admin.xml`)

```xml
<device-admin xmlns:android="http://schemas.android.com/apk/res/android">
    <uses-policies>
        <!-- डिव्हाइस ॲडमिन चालू असताना अनइन्स्टॉल रोखले जाते -->
    </uses-policies>
</device-admin>
```

---

## २. Manifest मध्ये डिक्लेरेशन (`AndroidManifest.xml`)

```xml
<receiver
    android:name="com.sociallite.android.data.UninstallProtectionReceiver"
    android:label="@string/uninstall_protection_admin_label"
    android:description="@string/uninstall_protection_admin_description"
    android:permission="android.permission.BIND_DEVICE_ADMIN"
    android:exported="true">
    <meta-data
        android:name="android.app.device_admin"
        android:resource="@xml/device_admin" />
    <intent-filter>
        <action android:name="android.app.action.DEVICE_ADMIN_ENABLED" />
    </intent-filter>
</receiver>
```

---

## ३. Java कोड अंमलबजावणी (`UninstallProtectionReceiver.java`)

```java
package com.sociallite.android.data;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import com.sociallite.android.R;
import ge.mb;

public final class UninstallProtectionReceiver extends DeviceAdminReceiver {
    
    // युजरने जेव्हा ॲडमिन बंद करण्याचे बटण दाबले, तेव्हा ही वॉर्निंग दिसते:
    @Override
    public final CharSequence onDisableRequested(Context context, Intent intent) {
        return context.getString(R.string.uninstall_protection_disable_warning);
    }

    // ॲडमिन बंद झाल्यावर:
    @Override
    public final void onDisabled(Context context, Intent intent) {
        super.onDisabled(context, intent);
        mb.f6571i.c(context).l2(false); // SharedPreferences मधील सुरक्षा फ्लॅग फॉल्स करणे
    }

    // ॲडमिन सक्रिय झाल्यावर:
    @Override
    public final void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);
        mb.f6571i.c(context).l2(true); // SharedPreferences मधील सुरक्षा फ्लॅग ट्रू करणे
    }
}
```

---

## ४. युजरकडून डिव्हाइस ॲडमिन परमिशन कशी मागितली जाते? (Permission Request Flow)

```kotlin
fun requestDeviceAdmin(activity: Activity) {
    val componentName = ComponentName(activity, UninstallProtectionReceiver::class.java)
    val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN).apply {
        putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, componentName)
        putExtra(
            DevicePolicyManager.EXTRA_ADD_EXPLANATION,
            "Enable protection to prevent SocialLite from being uninstalled during focus sessions."
        )
    }
    activity.startActivityForResult(intent, REQUEST_CODE_DEVICE_ADMIN)
}
```

---

## ५. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `DeviceAdminReceiver` सबक्लास करा.
2. `onDisableRequested` मध्ये स्पष्ट चेतावणी मेसेज द्या.
3. अनइन्स्टॉल संरक्षण सक्रिय करण्यासाठी युजरला सिस्टीम डायलॉग दाखवा.
