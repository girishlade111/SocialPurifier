# 13. UI/UX डिझाइन सिस्टीम आणि जेटपॅक कंपोज आर्किटेक्चर (Design System & Compose Architecture)

## १. डिझाइन तत्वज्ञान (Design Philosophy)
सोशल मीडिया ॲप्स भडक रंग, लाल नोटिफेकेशन डॉट्स आणि फ्लॅश ॲनिमेशन्स वापरतात जेणेकरून मेंदूत सतत उत्तेजना (Hyper-stimulation) राहील.

SocialLite ची डिझाइन सिस्टीम **शांत, ध्यानस्थ आणि मिनिमलिस्ट (Calm, Mindful, Utilitarian Minimalist)** आहे:
- **Zero Distraction Palette**: डीप ब्लॅक (`#000000`), चारकोल (`#121212`), सॉफ्ट ग्रे (`#888888`), आणि क्लीन व्हाईट.
- **नो फ्लॅशी ॲनिमेशन्स**: स्लो, स्मूथ आणि अर्थपूर्ण फेड-इन्स.
- **क्लियर व्हिज्युअल हायरार्की**: सर्वात महत्त्वाचा घटक (उदा. टायमर किंवा रिमेनिंग टाईम) मोठ्या अक्षरांत दिसतो; बाकी सर्व मिनिमल राहते.

---

## २. डार्क मोड आणि थीम आर्किटेक्चर (`MainActivity.attachBaseContext`)

SocialLite मध्ये सिस्टम-लेव्हल डार्क मोड ओव्हरराइड करण्यासाठी प्रगत `attachBaseContext` पद्धत वापरली आहे:

```java
// MainActivity.java
int darkModeStrategy = sharedPreferences.getInt("darkModeStrategy", 4);
boolean darkModeEnabled = prefs.getBoolean("darkModeEnabled", false);

Configuration config = new Configuration(context.getResources().getConfiguration());

// युजरने निवडलेला मोड सेट करणे:
if (themeMode.equals("LIGHT")) {
    config.uiMode = (config.uiMode & ~Configuration.UI_MODE_NIGHT_MASK) | Configuration.UI_MODE_NIGHT_NO;
} else if (themeMode.equals("DARK")) {
    config.uiMode = (config.uiMode & ~Configuration.UI_MODE_NIGHT_MASK) | Configuration.UI_MODE_NIGHT_YES;
}

// ॲपसाठी नवीन ConfigurationContext तयार करणे:
Context themedContext = context.createConfigurationContext(config);
super.attachBaseContext(themedContext);
```

---

## ३. जेटपॅक कंपोज थीम आणि कलर्स (Compose Theme & Colors)

```kotlin
object SocialLiteTheme {
    val BackgroundDark = Color(0xFF0A0A0A)
    val SurfaceDark = Color(0xFF161618)
    val CardBorderDark = Color(0xFF26262A)
    
    val TextPrimaryDark = Color(0xFFEEEEEE)
    val TextSecondaryDark = Color(0xFFAAAAAA)
    
    // Accent Colors (प्लॅटफॉर्म्ससाठी सौम्य रंग):
    val InstagramAccent = Color(0xFFE1306C)
    val YouTubeAccent = Color(0xFFFF0000)
    val TwitterAccent = Color(0xFF1DA1F2)
    val SuccessGreen = Color(0xFF2ECC71)
    val WarningAmber = Color(0xFFF39C12)
}
```

---

## ४. ब्लॉक स्क्रीनचे कंपोज लेआउट (`BlockedAppActivity.kt`)

```kotlin
@Composable
fun BlockedAppScreen(
    appName: String,
    reason: String,
    onOpenInSocialLite: () -> Unit,
    onGoHome: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(SocialLiteTheme.BackgroundDark)
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // १. आयकॉन व मेसेज
            Icon(
                painter = painterResource(R.drawable.ic_shield_focus),
                contentDescription = null,
                tint = SocialLiteTheme.SuccessGreen,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = "$appName is Blocked",
                style = MaterialTheme.typography.headlineMedium,
                color = SocialLiteTheme.TextPrimaryDark
            )
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = reason,
                style = MaterialTheme.typography.bodyLarge,
                color = SocialLiteTheme.TextSecondaryDark,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(32.dp))

            // २. ॲक्शन बटणे
            Button(
                onClick = onOpenInSocialLite,
                modifier = Modifier.fillMaxWidth().height(52.dp),
                colors = ButtonDefaults.buttonColors(containerColor = SocialLiteTheme.SurfaceDark)
            ) {
                Text("Open in SocialLite (Clean Mode)")
            }
            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = onGoHome,
                modifier = Modifier.fillMaxWidth().height(52.dp)
            ) {
                Text("Go to Home Screen")
            }
        }
    }
}
```
