package com.sociallite.android.data;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.a0;
import androidx.credentials.CredentialOption;
import androidx.lifecycle.j0;
import c8.b;
import com.sociallite.android.R;
import fe.l1;
import ge.c;
import ge.c3;
import ge.d2;
import ge.f;
import ge.f3;
import ge.g;
import ge.h;
import ge.h3;
import ge.hb;
import ge.i3;
import ge.l;
import ge.lc;
import ge.m;
import ge.mb;
import ge.n;
import ge.qa;
import ge.r9;
import ge.t9;
import ge.y9;
import ge.z9;
import hf.a;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import qf.r;
import se.k;
import sf.b1;
import sf.h0;
import sf.r1;
import sf.w;
import sf.y;
import te.u;
import te.x;
import zf.e;

/* JADX INFO: loaded from: classes.dex */
public final class AppBlockerService extends AccessibilityService {
    public static final int $stable = 8;
    public static final long HEARTBEAT_INTERVAL_MS = 300000;
    private static final String TAG = "AppBlocker";
    private static boolean isRunning;
    private static WeakReference<AppBlockerService> testService;
    private final h foregroundGate;
    private Runnable foregroundRecheck;
    private long lastHeartbeatMillis;
    private Runnable postModeExpiryRunnable;
    private String postModeUnlockedPackage;
    private SharedPreferences prefs;
    private Set<String> protectedPackages;
    private long protectedPackagesAt;
    private b1 quotaCheckJob;
    private final w quotaScope;
    private final m sleepCheck;
    private final n sleepClockReceiver;
    private final SharedPreferences.OnSharedPreferenceChangeListener sleepPreferencesChanged;
    private boolean sleepReceiverRegistered;
    private lc usageTracker;
    public static final l Companion = new l();
    private static final Map<String, String> BLOCKED_PACKAGES = x.L(new k("com.instagram.android", "instagram"), new k("com.google.android.youtube", "youtube"), new k("com.zhiliaoapp.musically", "tiktok"), new k("com.ss.android.ugc.trill", "tiktok"), new k("com.snapchat.android", "snapchat"), new k("com.twitter.android", "twitter"), new k("com.twitter.android.lite", "twitter"), new k("com.atebits.Tweetie2", "twitter"), new k("com.facebook.katana", "facebook"), new k("com.facebook.lite", "facebook"), new k("com.linkedin.android", "linkedin"));
    private final Map<String, Long> lastBlockedTimes = new LinkedHashMap();
    private final Handler handler = new Handler(Looper.getMainLooper());

    public AppBlockerService() {
        r1 r1VarE = y.e();
        e eVar = h0.f19764a;
        this.quotaScope = y.b(db.h.A(r1VarE, xf.n.f23250a.f20267y));
        int i2 = 0;
        this.foregroundGate = new h(new a0(0, this, AppBlockerService.class, "quotaForegroundPackage", "quotaForegroundPackage()Ljava/lang/String;", i2, 4), new e3.m(1, this, AppBlockerService.class, "enforcePackage", "enforcePackage(Ljava/lang/String;)V", i2, 2), new b(this, 2), new ge.k(this, 0));
        this.sleepPreferencesChanged = new l1(this, 1);
        this.sleepClockReceiver = new n(this);
        this.sleepCheck = new m(this);
        this.protectedPackages = u.f20251t;
    }

    public static final /* synthetic */ Map access$getBLOCKED_PACKAGES$cp() {
        return BLOCKED_PACKAGES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelPostModeExpiry() {
        Runnable runnable = this.postModeExpiryRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        this.postModeExpiryRunnable = null;
        this.postModeUnlockedPackage = null;
    }

    private final void cleanUpPostMode() {
        cancelPostModeExpiry();
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("contentBreakActive", false).putLong("contentBreakEndTime", 0L).putBoolean("postmode_instagram", false).putBoolean("postmode_youtube", false).putBoolean("postmode_tiktok", false).putBoolean("postmode_snapchat", false).putBoolean("postmode_twitter", false).putBoolean("postmode_facebook", false).putBoolean("postmode_linkedin", false).apply();
        } else {
            kotlin.jvm.internal.l.e("prefs");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:131:0x0205  */
    /* JADX WARN: Code duplicated, block: B:133:0x020b  */
    /* JADX WARN: Code duplicated, block: B:141:0x022e  */
    /* JADX WARN: Code duplicated, block: B:152:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x025c  */
    /* JADX WARN: Code duplicated, block: B:158:0x026d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0274  */
    /* JADX WARN: Code duplicated, block: B:162:0x027c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0286  */
    /* JADX WARN: Code duplicated, block: B:165:0x028a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0296  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:174:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02da  */
    /* JADX WARN: Code duplicated, block: B:186:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:194:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:195:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:198:0x0307  */
    /* JADX WARN: Code duplicated, block: B:199:0x0309  */
    /* JADX WARN: Code duplicated, block: B:201:0x0311  */
    /* JADX WARN: Code duplicated, block: B:202:0x0313  */
    /* JADX WARN: Code duplicated, block: B:204:0x0317  */
    /* JADX WARN: Code duplicated, block: B:205:0x032b  */
    /* JADX WARN: Code duplicated, block: B:206:0x032d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0387  */
    /* JADX WARN: Code duplicated, block: B:220:0x039f  */
    /* JADX WARN: Code duplicated, block: B:222:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:226:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:228:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:231:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:232:0x03d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x03db  */
    /* JADX WARN: Code duplicated, block: B:234:0x03de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:244:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    public final void enforcePackage(String str) {
        Set stringSet;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zB;
        boolean z13;
        lc lcVar;
        lc lcVar2;
        String lowerCase;
        Integer numValueOf;
        k kVar;
        String string;
        String str3;
        boolean zBooleanValue;
        String string2;
        lc lcVar3;
        boolean z14;
        Long l;
        boolean z15;
        u uVar = u.f20251t;
        if (!((PowerManager) getSystemService(PowerManager.class)).isInteractive() || ((KeyguardManager) getSystemService(KeyguardManager.class)).isKeyguardLocked()) {
            return;
        }
        hb hbVar = mb.f6571i;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        mb mbVarC = hbVar.c(applicationContext);
        if (mbVarC.H0() || mbVarC.O0()) {
            d2.B(this);
            long jCurrentTimeMillis = System.currentTimeMillis();
            i3 i3VarB = d2.B(this);
            z9 z9Var = z9.f7262a;
            if (z9.a(i3VarB, str)) {
                return;
            }
            boolean zU = c.U(i3VarB);
            boolean z16 = zU && f.a(i3VarB) && c.o0(i3VarB).f5945a;
            boolean z17 = z16 && c.R(this, str);
            if (kotlin.jvm.internal.l.a(d2.B(this).f6283a.getString("accountType", ""), "kid")) {
                if (isProtectedPackage(str)) {
                    return;
                }
            } else if (z16) {
                if (!z17) {
                    return;
                }
            } else if (r.p0(str, "com.android.", false) || r.p0(str, "com.google.android.permissioncontroller", false)) {
                return;
            }
            if (str.equals("com.sociallite.android")) {
                return;
            }
            if (kotlin.jvm.internal.l.a(i3VarB.f6283a.getString("accountType", "personal"), "kid")) {
                r9 r9VarN0 = c.n0(i3VarB);
                if (r9VarN0 != null) {
                    stringSet = r9VarN0.b;
                } else {
                    stringSet = uVar;
                }
            } else {
                stringSet = i3VarB.getStringSet("blockedAppPackages", uVar);
                if (stringSet == null) {
                    stringSet = uVar;
                }
            }
            Map<String, String> map = BLOCKED_PACKAGES;
            boolean z18 = ((!map.containsKey(str) && !stringSet.contains(str)) || r.p0(str, "com.android.", false) || r.p0(str, "com.google.android.permissioncontroller", false)) ? false : true;
            if (map.containsKey(str)) {
                String str4 = map.get(str);
                str4.getClass();
                str2 = str4;
            } else if (!stringSet.contains(str) && !z17) {
                return;
            } else {
                str2 = "custom";
            }
            i3 i3VarB2 = d2.B(this);
            Boolean boolA = c.j(i3VarB2, str) ? Boolean.TRUE : t9.a(i3VarB2, str2);
            Set stringSet2 = i3VarB2.getStringSet("sleepAllowedPackages", uVar);
            boolean z19 = stringSet2 != null && stringSet2.contains(str);
            Calendar calendar = Calendar.getInstance();
            boolean z20 = z19;
            if (kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", ""), "kid")) {
                calendar.getClass();
                if (c.w0(i3VarB2, calendar, 0, 4).f6703d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z18 && !kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid")) {
                z11 = z10;
                boolean z21 = c.d(c.f5958j, i3VarB2, null, 6) != null;
                if (!z11 || (z21 && !z20)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                long j10 = i3VarB2.f6283a.getLong("blockExpiryMillis", 0L);
                if (kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid") && !z12 && j10 > 0 && System.currentTimeMillis() >= j10) {
                    SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("sociallite_focus_reviews", 0);
                    sharedPreferences.getClass();
                    c.t0(i3VarB2, sharedPreferences);
                    h3 h3Var = new h3(i3VarB2);
                    h3Var.putBoolean("appBlockingEnabled", false);
                    h3Var.putLong("blockExpiryMillis", 0L);
                    h3Var.a(false);
                    return;
                }
                if (kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid") || z11 || kotlin.jvm.internal.l.a(boolA, Boolean.TRUE)) {
                    if (z12 && kotlin.jvm.internal.l.a(boolA, Boolean.FALSE)) {
                        return;
                    }
                    if (!z12 || kotlin.jvm.internal.l.a(boolA, Boolean.TRUE) || f.a(i3VarB2)) {
                        if (zU) {
                            if (!z17 || z18) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zB = c.k(i3VarB2, str, z15);
                        } else {
                            zB = f.b(i3VarB2, str2, str);
                        }
                        if (!z12 || kotlin.jvm.internal.l.a(boolA, Boolean.TRUE) || zB) {
                            z13 = i3VarB2.getBoolean("contentBreakActive", false);
                            long j11 = i3VarB2.f6283a.getLong("contentBreakEndTime", 0L);
                            if (z12) {
                                cancelPostModeExpiry();
                            }
                            if (!kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid") || z12 || !z13 || System.currentTimeMillis() >= j11) {
                                if (z13 && System.currentTimeMillis() >= j11) {
                                    cleanUpPostMode();
                                }
                            } else if (i3VarB2.getBoolean("postmode_".concat(str2), false)) {
                                schedulePostModeExpiry(j11, str, str2);
                                return;
                            }
                            lcVar = this.usageTracker;
                            if (lcVar != null) {
                                kotlin.jvm.internal.l.e("usageTracker");
                                throw null;
                            }
                            lcVar.c();
                            lcVar2 = this.usageTracker;
                            if (lcVar2 != null) {
                                kotlin.jvm.internal.l.e("usageTracker");
                                throw null;
                            }
                            if (z9.b(lcVar2.f6510c, str2)) {
                                kVar = new k(Boolean.FALSE, null);
                            } else if (lcVar2.f6517j) {
                                kVar = new k(Boolean.TRUE, lcVar2.f6518k);
                            } else {
                                Locale locale = Locale.ROOT;
                                lowerCase = str2.toLowerCase(locale);
                                lowerCase.getClass();
                                if (kotlin.jvm.internal.l.a(lcVar2.f6510c.f6283a.getString("accountType", "personal"), "kid")) {
                                    switch (lowerCase) {
                                        case "youtube":
                                            str3 = "yt";
                                            break;
                                        case "reddit":
                                            str3 = "reddit";
                                            break;
                                        case "twitter":
                                            str3 = "tw";
                                            break;
                                        case "tiktok":
                                            str3 = "tt";
                                            break;
                                        case "instagram":
                                            str3 = "ig";
                                            break;
                                        case "snapchat":
                                            str3 = "snap";
                                            break;
                                        case "facebook":
                                            str3 = "fb";
                                            break;
                                        case "linkedin":
                                            str3 = "li";
                                            break;
                                        default:
                                            str3 = null;
                                            break;
                                    }
                                    if (str3 != null) {
                                        numValueOf = Integer.valueOf(lcVar2.f6510c.f6283a.getInt(str3.concat("_daily_limit_minutes"), 0));
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    numValueOf = (Integer) lcVar2.f6516i.get(lowerCase);
                                }
                                if (numValueOf != null || numValueOf.intValue() <= 0 || lcVar2.e(str2) < numValueOf.intValue() * 60) {
                                    kVar = new k(Boolean.FALSE, null);
                                } else {
                                    Boolean bool = Boolean.TRUE;
                                    if (str2.length() > 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        String strValueOf = String.valueOf(str2.charAt(0));
                                        strValueOf.getClass();
                                        String upperCase = strValueOf.toUpperCase(locale);
                                        upperCase.getClass();
                                        sb2.append((Object) upperCase);
                                        sb2.append(str2.substring(1));
                                        string = sb2.toString();
                                    } else {
                                        string = str2;
                                    }
                                    kVar = new k(bool, string.concat(" limit reached for today"));
                                }
                            }
                            zBooleanValue = ((Boolean) kVar.f19723t).booleanValue();
                            string2 = (String) kVar.f19724u;
                            lcVar3 = this.usageTracker;
                            if (lcVar3 != null) {
                                kotlin.jvm.internal.l.e("usageTracker");
                                throw null;
                            }
                            z14 = lcVar3.f6517j;
                            l = this.lastBlockedTimes.get(str);
                            if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < 500) {
                                return;
                            }
                            this.lastBlockedTimes.put(str, Long.valueOf(jCurrentTimeMillis));
                            if (z12) {
                                string2 = "Sleep mode is active — go to bed.";
                            } else if (kotlin.jvm.internal.l.a(boolA, Boolean.TRUE)) {
                                string2 = getString(R.string.parent_native_block_reason);
                                string2.getClass();
                            } else if (z14) {
                                string2 = "Downtime is active";
                            } else if (zBooleanValue) {
                                string2 = getString(R.string.blocked_page_reason_default);
                                string2.getClass();
                            } else if (string2 == null) {
                                string2 = "Time limit reached";
                            }
                            launchBlockOverlay(str2, string2, str, z12);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            z11 = z10;
            if (z11) {
                z12 = true;
            } else {
                z12 = true;
            }
            long j12 = i3VarB2.f6283a.getLong("blockExpiryMillis", 0L);
            if (kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid")) {
            }
            if (kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid")) {
            }
            if (z12) {
            }
            if (z12) {
            }
            if (zU) {
                if (z17) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                zB = c.k(i3VarB2, str, z15);
            } else {
                zB = f.b(i3VarB2, str2, str);
            }
            if (z12) {
            }
            z13 = i3VarB2.getBoolean("contentBreakActive", false);
            long j13 = i3VarB2.f6283a.getLong("contentBreakEndTime", 0L);
            if (z12) {
                cancelPostModeExpiry();
            }
            if (kotlin.jvm.internal.l.a(i3VarB2.f6283a.getString("accountType", "personal"), "kid")) {
                if (z13) {
                    cleanUpPostMode();
                }
            } else if (z13) {
                cleanUpPostMode();
            }
            lcVar = this.usageTracker;
            if (lcVar != null) {
                kotlin.jvm.internal.l.e("usageTracker");
                throw null;
            }
            lcVar.c();
            lcVar2 = this.usageTracker;
            if (lcVar2 != null) {
                kotlin.jvm.internal.l.e("usageTracker");
                throw null;
            }
            if (z9.b(lcVar2.f6510c, str2)) {
                kVar = new k(Boolean.FALSE, null);
            } else if (lcVar2.f6517j) {
                kVar = new k(Boolean.TRUE, lcVar2.f6518k);
            } else {
                Locale locale2 = Locale.ROOT;
                lowerCase = str2.toLowerCase(locale2);
                lowerCase.getClass();
                if (kotlin.jvm.internal.l.a(lcVar2.f6510c.f6283a.getString("accountType", "personal"), "kid")) {
                    switch (lowerCase) {
                        case -991745245:
                            if (lowerCase.equals("youtube")) {
                                str3 = "yt";
                            } else {
                                str3 = null;
                            }
                            break;
                        case -934889890:
                            if (lowerCase.equals("reddit")) {
                                str3 = "reddit";
                            } else {
                                str3 = null;
                            }
                            break;
                        case -916346253:
                            if (lowerCase.equals("twitter")) {
                                str3 = "tw";
                            } else {
                                str3 = null;
                            }
                            break;
                        case -873713414:
                            if (lowerCase.equals("tiktok")) {
                                str3 = "tt";
                            } else {
                                str3 = null;
                            }
                            break;
                        case 28903346:
                            if (lowerCase.equals("instagram")) {
                                str3 = "ig";
                            } else {
                                str3 = null;
                            }
                            break;
                        case 284397090:
                            if (lowerCase.equals("snapchat")) {
                                str3 = "snap";
                            } else {
                                str3 = null;
                            }
                            break;
                        case 497130182:
                            if (lowerCase.equals("facebook")) {
                                str3 = "fb";
                            } else {
                                str3 = null;
                            }
                            break;
                        case 1194692862:
                            if (lowerCase.equals("linkedin")) {
                                str3 = "li";
                            } else {
                                str3 = null;
                            }
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str3 != null) {
                        numValueOf = Integer.valueOf(lcVar2.f6510c.f6283a.getInt(str3.concat("_daily_limit_minutes"), 0));
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = (Integer) lcVar2.f6516i.get(lowerCase);
                }
                if (numValueOf != null) {
                    kVar = new k(Boolean.FALSE, null);
                } else {
                    kVar = new k(Boolean.FALSE, null);
                }
            }
            zBooleanValue = ((Boolean) kVar.f19723t).booleanValue();
            string2 = (String) kVar.f19724u;
            lcVar3 = this.usageTracker;
            if (lcVar3 != null) {
                kotlin.jvm.internal.l.e("usageTracker");
                throw null;
            }
            z14 = lcVar3.f6517j;
            l = this.lastBlockedTimes.get(str);
            if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < 500) {
                return;
            }
            this.lastBlockedTimes.put(str, Long.valueOf(jCurrentTimeMillis));
            if (z12) {
                string2 = "Sleep mode is active — go to bed.";
            } else if (kotlin.jvm.internal.l.a(boolA, Boolean.TRUE)) {
                string2 = getString(R.string.parent_native_block_reason);
                string2.getClass();
            } else if (z14) {
                string2 = "Downtime is active";
            } else if (zBooleanValue) {
                string2 = getString(R.string.blocked_page_reason_default);
                string2.getClass();
            } else if (string2 == null) {
                string2 = "Time limit reached";
            }
            launchBlockOverlay(str2, string2, str, z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final se.a0 foregroundGate$lambda$2(AppBlockerService appBlockerService, a aVar) {
        aVar.getClass();
        ad.a aVar2 = new ad.a(appBlockerService, 7, aVar);
        appBlockerService.handler.postDelayed(aVar2, 120L);
        appBlockerService.foregroundRecheck = aVar2;
        return se.a0.f19710a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void foregroundGate$lambda$2$lambda$0(AppBlockerService appBlockerService, a aVar) {
        appBlockerService.foregroundRecheck = null;
        try {
            if (!isRunning || appBlockerService.prefs == null) {
                return;
            }
            aVar.invoke();
        } catch (Throwable th) {
            Log.e(TAG, "Deferred foreground check failed: ".concat(th.getClass().getSimpleName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final se.a0 foregroundGate$lambda$3(AppBlockerService appBlockerService) {
        Runnable runnable = appBlockerService.foregroundRecheck;
        if (runnable != null) {
            appBlockerService.handler.removeCallbacks(runnable);
        }
        appBlockerService.foregroundRecheck = null;
        return se.a0.f19710a;
    }

    private final void handleAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String string;
        d2.B(this);
        if (accessibilityEvent != null && accessibilityEvent.getEventType() == 32) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.prefs;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.l.e("prefs");
                throw null;
            }
            String string2 = sharedPreferences.getString("blocker_last_detected_failure", "");
            if (kotlin.jvm.internal.l.a(string2, "stale_events") || kotlin.jvm.internal.l.a(string2, "os_disabled") || jCurrentTimeMillis - this.lastHeartbeatMillis >= HEARTBEAT_INTERVAL_MS) {
                this.lastHeartbeatMillis = jCurrentTimeMillis;
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                mb mbVarC = mb.f6571i.c(applicationContext);
                String strU = mbVarC.u();
                boolean z10 = strU.equals("stale_events") || strU.equals("os_disabled");
                i3 i3Var = mbVarC.b;
                i3Var.getClass();
                h3 h3Var = new h3(i3Var);
                h3Var.putLong("blocker_last_event_at", jCurrentTimeMillis);
                if (z10) {
                    h3Var.f6230a.put("blocker_last_detected_failure", "");
                }
                h3Var.a(false);
                if (z10) {
                    mbVarC.S0();
                }
            }
            CharSequence packageName = accessibilityEvent.getPackageName();
            if (packageName == null || (string = packageName.toString()) == null) {
                return;
            }
            requestDailyLimitCheck();
            h hVar = this.foregroundGate;
            hVar.getClass();
            hVar.f6222e++;
            hVar.f6221d.invoke();
            if (qf.k.G0(string)) {
                return;
            }
            String str = (String) hVar.f6219a.invoke();
            if (str == null || !str.equals(string)) {
                hVar.f6220c.invoke(new g(0, hVar.f6222e, hVar));
            } else {
                hVar.b.invoke(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean isProtectedPackage(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.protectedPackages.isEmpty()) {
            y9 y9Var = y9.f7225a;
            this.protectedPackages = d2.J(this);
            this.protectedPackagesAt = jCurrentTimeMillis;
        } else {
            long j10 = jCurrentTimeMillis - this.protectedPackagesAt;
            if (0 > j10 || j10 >= 60001) {
                try {
                    y9 y9Var2 = y9.f7225a;
                    this.protectedPackages = d2.J(this);
                    this.protectedPackagesAt = jCurrentTimeMillis;
                } catch (Exception e10) {
                    Log.w(TAG, "Essential app exclusions unavailable", e10);
                    return true;
                }
            }
        }
        return this.protectedPackages.contains(str);
    }

    private final void launchBlockOverlay(String str, String str2, String str3, boolean z10) {
        d2.B(this);
        Intent intent = new Intent(this, (Class<?>) BlockedAppActivity.class);
        intent.addFlags(335544320);
        intent.putExtra("platform", str);
        intent.putExtra("reason", str2);
        intent.putExtra("package_name", str3);
        intent.putExtra("sleep_block", z10);
        startActivity(intent);
    }

    public static /* synthetic */ void launchBlockOverlay$default(AppBlockerService appBlockerService, String str, String str2, String str3, boolean z10, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z10 = false;
        }
        appBlockerService.launchBlockOverlay(str, str2, str3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final se.a0 onServiceConnected$lambda$8(AppBlockerService appBlockerService) {
        appBlockerService.requestSleepCheck();
        return se.a0.f19710a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String quotaForegroundPackage() {
        AccessibilityNodeInfo rootInActiveWindow;
        try {
            if (!((PowerManager) getSystemService(PowerManager.class)).isInteractive() || ((KeyguardManager) getSystemService(KeyguardManager.class)).isKeyguardLocked() || (rootInActiveWindow = getRootInActiveWindow()) == null) {
                return null;
            }
            try {
                CharSequence packageName = rootInActiveWindow.getPackageName();
                return packageName != null ? packageName.toString() : null;
            } finally {
                rootInActiveWindow.recycle();
            }
        } catch (Exception e10) {
            Log.w(TAG, "Daily app limit foreground unavailable", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestDailyLimitCheck() {
        if (isRunning) {
            b1 b1Var = this.quotaCheckJob;
            if (b1Var == null || !b1Var.a()) {
                this.quotaCheckJob = y.v(this.quotaScope, null, new j0(this, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestSleepCheck() {
        this.handler.removeCallbacks(this.sleepCheck);
        this.handler.post(this.sleepCheck);
    }

    private final void schedulePostModeExpiry(long j10, String str, String str2) {
        cancelPostModeExpiry();
        long jCurrentTimeMillis = j10 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            cleanUpPostMode();
            if (kotlin.jvm.internal.l.a(quotaForegroundPackage(), str)) {
                enforcePackage(str);
                return;
            }
            return;
        }
        this.postModeUnlockedPackage = str;
        ad.a aVar = new ad.a(str, 8, this);
        this.postModeExpiryRunnable = aVar;
        this.handler.postDelayed(aVar, jCurrentTimeMillis);
        long j11 = jCurrentTimeMillis / ((long) CredentialOption.PRIORITY_PASSWORD_OR_SIMILAR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePostModeExpiry$lambda$9(String str, AppBlockerService appBlockerService) {
        i3 i3VarB = d2.B(appBlockerService);
        boolean z10 = i3VarB.getBoolean("contentBreakActive", false);
        long j10 = i3VarB.f6283a.getLong("contentBreakEndTime", 0L);
        if (z10 && System.currentTimeMillis() >= j10) {
            appBlockerService.cleanUpPostMode();
            if (kotlin.jvm.internal.l.a(appBlockerService.quotaForegroundPackage(), str)) {
                appBlockerService.enforcePackage(str);
            }
        }
        appBlockerService.postModeExpiryRunnable = null;
        appBlockerService.postModeUnlockedPackage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sleepPreferencesChanged$lambda$5(AppBlockerService appBlockerService, SharedPreferences sharedPreferences, String str) {
        if (str == null || r.p0(str, "sleep", false) || r.p0(str, "schedule", false) || r.p0(str, "personalRemovedApps:", false) || r.p0(str, "personalTimerScope:", false) || str.equals("personalTimerActiveOwner") || str.equals("parent_weekly_schedule") || te.a0.F("accountType", "hasPaid", "subscriptionTier", "forceFreeModeDebug", "debugProOverride", "appBlockingEnabled", "blockExpiryMillis", "userId", "parentViewKidCode", "blockedAppPackages").contains(str)) {
            appBlockerService.requestSleepCheck();
        }
        if (str == null || r.p0(str, "personalAppLimits:", false) || r.p0(str, "personalAppLimitGroups:", false) || r.p0(str, "personalRemovedApps:", false) || te.a0.F("accountType", "userId", "parentViewKidCode", "hasPaid", "subscriptionTier", "forceFreeModeDebug", "debugProOverride").contains(str)) {
            appBlockerService.handler.post(new a5.g(appBlockerService, 12));
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        try {
            handleAccessibilityEvent(accessibilityEvent);
        } catch (Throwable th) {
            Log.e(TAG, "onAccessibilityEvent threw — swallowed to keep service alive", th);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        isRunning = false;
        WeakReference<AppBlockerService> weakReference = testService;
        if (kotlin.jvm.internal.l.a(weakReference != null ? weakReference.get() : null, this)) {
            testService = null;
        }
        qa qaVar = qa.f6764a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        qa.b(applicationContext);
        c3 c3Var = c3.f5971a;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        c3.b(applicationContext2);
        xf.e eVar = f3.f6132a;
        f3.b(this);
        this.handler.removeCallbacks(this.sleepCheck);
        h hVar = this.foregroundGate;
        hVar.f6222e++;
        hVar.f6221d.invoke();
        y.g(this.quotaScope, null);
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.sleepPreferencesChanged);
        }
        if (this.sleepReceiverRegistered) {
            unregisterReceiver(this.sleepClockReceiver);
            this.sleepReceiverRegistered = false;
        }
        cancelPostModeExpiry();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        super.onServiceConnected();
        d2.B(this);
        int i2 = 1;
        isRunning = true;
        qa qaVar = qa.f6764a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        qa.b(applicationContext);
        c3 c3Var = c3.f5971a;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        c3.b(applicationContext2);
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        if (u7.m.f21024x == null) {
            Context applicationContext4 = applicationContext3.getApplicationContext();
            applicationContext4.getClass();
            u7.m.f21024x = new u7.m(applicationContext4);
        }
        this.prefs = d2.B(this);
        f.d(this);
        this.usageTracker = lc.l.f(this);
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        serviceInfo.eventTypes = 32;
        serviceInfo.feedbackType = 16;
        serviceInfo.flags = 2;
        serviceInfo.notificationTimeout = 300L;
        setServiceInfo(serviceInfo);
        SharedPreferences sharedPreferences = this.prefs;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.l.e("prefs");
            throw null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.sleepPreferencesChanged);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.sleepClockReceiver;
        if (i10 >= 33) {
            registerReceiver(nVar, intentFilter, 4);
        } else {
            registerReceiver(nVar, intentFilter);
        }
        this.sleepReceiverRegistered = true;
        requestSleepCheck();
        requestDailyLimitCheck();
        xf.e eVar = f3.f6132a;
        Context applicationContext5 = getApplicationContext();
        applicationContext5.getClass();
        f3.a(applicationContext5, this, new ge.k(this, i2));
    }
}
