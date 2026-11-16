# लॉकस्क्रीन आणि फ्रिक्शन चॅलेंजेस कोड सखोल विश्लेषण (Friction Implementation)

## १. लॉकस्क्रीन ओव्हरले आर्किटेक्चर (`TimerFocusLockActivity.java`)

SocialLite फोनच्या लॉकस्क्रीनवर थेट फोकस टायमर दाखवण्यासाठी Android Window Flags चा वापर करते:

```java
@Override
public void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    
    // १. फोनच्या लॉकस्क्रीनवर दाखवण्यासाठी Android Flags:
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) { // API 27+
        setShowWhenLocked(true);
        setTurnScreenOn(true);
    } else {
        getWindow().addFlags(
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
            WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
        );
    }
    
    // २. स्क्रीनचा बॅकग्राउंड रंग (डार्क थीम) सेट करणे:
    getWindow().setBackgroundDrawable(new ColorDrawable(-16248811));
    
    // ३. युजरने फोन अनलॉक केला का हे ऐकण्यासाठी ब्रॉडकास्ट रिसीव्हर:
    IntentFilter filter = new IntentFilter(Intent.ACTION_USER_PRESENT);
    registerReceiver(userPresentReceiver, filter);
    
    // ४. जेटपॅक कंपोज UI सेट करणे:
    setContent {
        FocusLockScreen(remainingTime = remainingMillis)
    }
}
```

---

## २. हार्ड मोड गणित चॅलेंज स्टेट मशीन (Math Challenge State Machine)

```kotlin
class MathChallengeViewModel : ViewModel() {
    private val totalQuestions = 5
    var currentQuestionIndex by mutableStateOf(1)
    var numA by mutableStateOf(0)
    var numB by mutableStateOf(0)
    var errorMessage by mutableStateOf("")

    init {
        generateNewProblem()
    }

    fun generateNewProblem() {
        // दोन अंकी गुणाकार तयार करणे (उदा. 12 ते 19 x 7 ते 15)
        numA = (12..19).random()
        numB = (7..15).random()
    }

    fun submitAnswer(userAnswer: Int) {
        val correctAnswer = numA * numB
        if (userAnswer == correctAnswer) {
            if (currentQuestionIndex >= totalQuestions) {
                // सर्व ५ गणिते बरोबर! पुढील टप्प्यावर जा
                onChallengeCompleted()
            } else {
                currentQuestionIndex++
                generateNewProblem()
            }
        } else {
            // चुकीचे उत्तर! पुन्हा पहिल्या प्रश्नावर रीसेट करा!
            errorMessage = "Not right. Back to the first one."
            currentQuestionIndex = 1
            generateNewProblem()
        }
    }
}
```

---

## ३. ६० सेकंद कूलडाउन टायमर व ॲप लीव्ह डिटेक्शन (Cooldown Breath Timer)

```kotlin
@Composable
fun CooldownTimerScreen(onFinished: () -> Unit) {
    var secondsLeft by remember { mutableStateOf(60) }
    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_PAUSE) {
                // जर युजरने ॲप मिनिमाइज केले तर टायमर पुन्हा ६० वर रीसेट!
                secondsLeft = 60
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }

    LaunchedEffect(secondsLeft) {
        if (secondsLeft > 0) {
            delay(1000L)
            secondsLeft--
        } else {
            onFinished()
        }
    }

    Text(text = "$secondsLeft seconds left. Breathe.")
}
```

---

## ४. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `setShowWhenLocked(true)` सह एक स्वतंत्र ॲक्टिव्हिटी बनवा.
2. अनलॉकिंग फ्लॅग बदलण्यापूर्वी हे ४ चॅलेंजेस स्टेट मशीनद्वारे सक्तीने सोडवून घ्या.
3. लाइफसायकल `ON_PAUSE` वर टायमर रीसेट करून युजरची फसवणूक रोखा.
