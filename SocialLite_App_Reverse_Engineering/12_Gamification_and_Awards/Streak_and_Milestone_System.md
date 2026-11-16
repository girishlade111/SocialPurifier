# स्ट्रीक आणि अचिव्हमेंट कॅल्क्युलेशन लॉजिक (Streak Calculation Logic)

## १. स्ट्रीक कॅल्क्युलेटर मॉडेल (Streak Engine Model)

```kotlin
data class UserHabitState(
    val currentStreakDays: Int,
    val bestStreakDays: Int,
    val totalFocusMinutes: Int,
    val completedSleepNights: Int,
    val lastEvaluatedDate: String, // "YYYY-MM-DD"
    val unlockedAwardIds: Set<String>
)
```

---

## २. दैनंदिन स्ट्रीक मूल्यांकन लॉजिक (`evaluateDailyStreak`)

SocialLite दररोज रात्री 11:59 वाजता किंवा दुसऱ्या दिवशी सकाळी ॲप उघडल्यावर कालचा दिवस यशस्वी होता की नाही हे तपासते:

```kotlin
fun evaluateDailyStreak(context: Context) {
    val prefs = context.getSharedPreferences("sociallite_settings", Context.MODE_PRIVATE)
    val today = LocalDate.now().toString()
    val lastDate = prefs.getString("streak_last_eval_date", "")

    if (lastDate == today) return // आज आधीच तपासले आहे

    val didIncreaseLimits = prefs.getBoolean("streak_violation_limit_increased", false)
    val didDisableProtection = prefs.getBoolean("streak_violation_protection_disabled", false)
    val didExceedQuotas = prefs.getBoolean("streak_violation_quota_exceeded", false)

    var currentStreak = prefs.getInt("streak_current_count", 0)

    if (!didIncreaseLimits && !didDisableProtection && !didExceedQuotas) {
        // युजरने यशस्वीपणे सर्व नियम पाळले! स्ट्रीक +१ वाढवा:
        currentStreak += 1
        val bestStreak = maxOf(currentStreak, prefs.getInt("streak_best_count", 0))
        prefs.edit()
            .putInt("streak_current_count", currentStreak)
            .putInt("streak_best_count", bestStreak)
            .apply()

        // नवीन पुरस्कार अनलॉक झाले आहेत का तपासा:
        checkAndUnlockAwards(context, currentStreak)
    } else {
        // नियम मोडला! स्ट्रीक पुन्हा ० वर रीसेट:
        prefs.edit().putInt("streak_current_count", 0).apply()
    }

    // नवीन दिवसासाठी व्हायोलेशन फ्लॅग्ज रीसेट करा:
    prefs.edit()
        .putString("streak_last_eval_date", today)
        .putBoolean("streak_violation_limit_increased", false)
        .putBoolean("streak_violation_protection_disabled", false)
        .putBoolean("streak_violation_quota_exceeded", false)
        .apply()
}
```

---

## ३. पुरस्कार अनलॉक तपासणी (`checkAndUnlockAwards`)

```kotlin
fun checkAndUnlockAwards(context: Context, currentStreak: Int) {
    val awardsToUnlock = mutableListOf<String>()

    if (currentStreak >= 3) awardsToUnlock.add("award_1")
    if (currentStreak >= 7) awardsToUnlock.add("award_3")
    if (currentStreak >= 30) awardsToUnlock.add("award_5")
    if (currentStreak >= 90) awardsToUnlock.add("award_7")
    if (currentStreak >= 180) awardsToUnlock.add("award_9")
    if (currentStreak >= 365) awardsToUnlock.add("award_11")

    // अनलॉक डायलॉग दाखवणे व युजरला सन्मानित करणे
    for (awardId in awardsToUnlock) {
        if (!isAlreadyUnlocked(context, awardId)) {
            markAwardUnlocked(context, awardId)
            showCelebrationDialog(awardId)
        }
    }
}
```

---

## ४. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `SharedPreferences` मध्ये `streak_current_count` साठवा.
2. युजरने दिवसभरात मर्यादा न वाढवल्यास स्ट्रीक वाढवा.
3. अचिव्हमेंट अनलॉक झाल्यावर सुंदर ॲनिमेशनसह सेलिब्रेशन डायलॉग दाखवा.
