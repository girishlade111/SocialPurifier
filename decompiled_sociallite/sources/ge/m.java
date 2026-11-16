package ge;

import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import com.sociallite.android.data.AppBlockerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AppBlockerService f6519t;

    public m(AppBlockerService appBlockerService) {
        this.f6519t = appBlockerService;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0177  */
    /* JADX WARN: Code duplicated, block: B:104:0x017d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0184  */
    /* JADX WARN: Code duplicated, block: B:109:0x0188  */
    /* JADX WARN: Code duplicated, block: B:144:0x0208  */
    /* JADX WARN: Code duplicated, block: B:146:0x020e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0218  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0225  */
    /* JADX WARN: Code duplicated, block: B:155:0x0229  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:205:0x02da  */
    /* JADX WARN: Code duplicated, block: B:207:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:211:0x030a  */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        String string;
        long jCurrentTimeMillis;
        SharedPreferences sharedPreferences3;
        SharedPreferences sharedPreferences4;
        SharedPreferences sharedPreferences5;
        String string2;
        long j10;
        SharedPreferences sharedPreferences6;
        SharedPreferences sharedPreferences7;
        String string3;
        String string4;
        SharedPreferences sharedPreferences8;
        SharedPreferences sharedPreferences9;
        String string5;
        AppBlockerService.Companion.getClass();
        if (AppBlockerService.isRunning) {
            AppBlockerService appBlockerService = this.f6519t;
            if (appBlockerService.prefs == null) {
                return;
            }
            long j11 = 60000;
            try {
                try {
                    if (((PowerManager) appBlockerService.getSystemService(PowerManager.class)).isInteractive()) {
                        if (!((KeyguardManager) appBlockerService.getSystemService(KeyguardManager.class)).isKeyguardLocked()) {
                            AccessibilityNodeInfo rootInActiveWindow = appBlockerService.getRootInActiveWindow();
                            if (rootInActiveWindow != null) {
                                try {
                                    CharSequence packageName = rootInActiveWindow.getPackageName();
                                    if (packageName != null) {
                                        string4 = packageName.toString();
                                    } else {
                                        string4 = null;
                                    }
                                } catch (Throwable th) {
                                    rootInActiveWindow.recycle();
                                    throw th;
                                }
                            } else {
                                string4 = null;
                            }
                            if (rootInActiveWindow != null) {
                                rootInActiveWindow.recycle();
                            }
                            if (string4 != null) {
                                appBlockerService.enforcePackage(string4);
                            }
                        }
                        if (!((PowerManager) appBlockerService.getSystemService(PowerManager.class)).isInteractive()) {
                            return;
                        }
                        SharedPreferences sharedPreferences10 = appBlockerService.prefs;
                        if (sharedPreferences10 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        if (!sharedPreferences10.getBoolean("sleepEnabled", false)) {
                            SharedPreferences sharedPreferences11 = appBlockerService.prefs;
                            if (sharedPreferences11 == null) {
                                kotlin.jvm.internal.l.e("prefs");
                                throw null;
                            }
                            if (kotlin.jvm.internal.l.a(sharedPreferences11.getString("accountType", "personal"), "personal") && ((string3 = sharedPreferences11.getString("parentViewKidCode", "")) == null || qf.k.G0(string3))) {
                                List list = f.f6116a;
                                SharedPreferences sharedPreferences12 = appBlockerService.prefs;
                                if (sharedPreferences12 == null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (!f.a(sharedPreferences12)) {
                                    sharedPreferences6 = appBlockerService.prefs;
                                    if (sharedPreferences6 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (kotlin.jvm.internal.l.a(sharedPreferences6.getString("accountType", ""), "kid")) {
                                        return;
                                    }
                                    sharedPreferences7 = appBlockerService.prefs;
                                    if (sharedPreferences7 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (!sharedPreferences7.getBoolean("scheduleEnabled", false)) {
                                        return;
                                    }
                                }
                            } else {
                                sharedPreferences6 = appBlockerService.prefs;
                                if (sharedPreferences6 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (kotlin.jvm.internal.l.a(sharedPreferences6.getString("accountType", ""), "kid")) {
                                    return;
                                }
                                sharedPreferences7 = appBlockerService.prefs;
                                if (sharedPreferences7 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (!sharedPreferences7.getBoolean("scheduleEnabled", false)) {
                                    return;
                                }
                            }
                        }
                        appBlockerService.handler.removeCallbacks(this);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        SharedPreferences sharedPreferences13 = appBlockerService.prefs;
                        if (sharedPreferences13 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        long j12 = sharedPreferences13.getLong("blockExpiryMillis", 0L);
                        j10 = 60020 - (jCurrentTimeMillis2 % 60000);
                        if (j12 > jCurrentTimeMillis2) {
                            j11 = (j12 - jCurrentTimeMillis2) + 20;
                        }
                    } else {
                        if (!((PowerManager) appBlockerService.getSystemService(PowerManager.class)).isInteractive()) {
                            return;
                        }
                        SharedPreferences sharedPreferences14 = appBlockerService.prefs;
                        if (sharedPreferences14 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        if (!sharedPreferences14.getBoolean("sleepEnabled", false)) {
                            SharedPreferences sharedPreferences15 = appBlockerService.prefs;
                            if (sharedPreferences15 == null) {
                                kotlin.jvm.internal.l.e("prefs");
                                throw null;
                            }
                            if (kotlin.jvm.internal.l.a(sharedPreferences15.getString("accountType", "personal"), "personal") && ((string5 = sharedPreferences15.getString("parentViewKidCode", "")) == null || qf.k.G0(string5))) {
                                List list2 = f.f6116a;
                                SharedPreferences sharedPreferences16 = appBlockerService.prefs;
                                if (sharedPreferences16 == null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (!f.a(sharedPreferences16)) {
                                    sharedPreferences8 = appBlockerService.prefs;
                                    if (sharedPreferences8 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (kotlin.jvm.internal.l.a(sharedPreferences8.getString("accountType", ""), "kid")) {
                                        return;
                                    }
                                    sharedPreferences9 = appBlockerService.prefs;
                                    if (sharedPreferences9 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (!sharedPreferences9.getBoolean("scheduleEnabled", false)) {
                                        return;
                                    }
                                }
                            } else {
                                sharedPreferences8 = appBlockerService.prefs;
                                if (sharedPreferences8 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (kotlin.jvm.internal.l.a(sharedPreferences8.getString("accountType", ""), "kid")) {
                                    return;
                                }
                                sharedPreferences9 = appBlockerService.prefs;
                                if (sharedPreferences9 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (!sharedPreferences9.getBoolean("scheduleEnabled", false)) {
                                    return;
                                }
                            }
                        }
                        appBlockerService.handler.removeCallbacks(this);
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        SharedPreferences sharedPreferences17 = appBlockerService.prefs;
                        if (sharedPreferences17 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        long j13 = sharedPreferences17.getLong("blockExpiryMillis", 0L);
                        j10 = 60020 - (jCurrentTimeMillis3 % 60000);
                        if (j13 > jCurrentTimeMillis3) {
                            j11 = (j13 - jCurrentTimeMillis3) + 20;
                        }
                    }
                    appBlockerService.handler.postDelayed(this, Math.min(j10, j11));
                } catch (Exception e10) {
                    Log.w("AppBlocker", "Sleep boundary check failed", e10);
                    if (((PowerManager) appBlockerService.getSystemService(PowerManager.class)).isInteractive()) {
                        SharedPreferences sharedPreferences18 = appBlockerService.prefs;
                        if (sharedPreferences18 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        if (!sharedPreferences18.getBoolean("sleepEnabled", false)) {
                            SharedPreferences sharedPreferences19 = appBlockerService.prefs;
                            if (sharedPreferences19 == null) {
                                kotlin.jvm.internal.l.e("prefs");
                                throw null;
                            }
                            if (kotlin.jvm.internal.l.a(sharedPreferences19.getString("accountType", "personal"), "personal") && ((string = sharedPreferences19.getString("parentViewKidCode", "")) == null || qf.k.G0(string))) {
                                List list3 = f.f6116a;
                                SharedPreferences sharedPreferences20 = appBlockerService.prefs;
                                if (sharedPreferences20 == null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (!f.a(sharedPreferences20)) {
                                    sharedPreferences = appBlockerService.prefs;
                                    if (sharedPreferences != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (kotlin.jvm.internal.l.a(sharedPreferences.getString("accountType", ""), "kid")) {
                                        return;
                                    }
                                    sharedPreferences2 = appBlockerService.prefs;
                                    if (sharedPreferences2 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (!sharedPreferences2.getBoolean("scheduleEnabled", false)) {
                                        return;
                                    }
                                }
                            } else {
                                sharedPreferences = appBlockerService.prefs;
                                if (sharedPreferences != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (kotlin.jvm.internal.l.a(sharedPreferences.getString("accountType", ""), "kid")) {
                                    return;
                                }
                                sharedPreferences2 = appBlockerService.prefs;
                                if (sharedPreferences2 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (!sharedPreferences2.getBoolean("scheduleEnabled", false)) {
                                    return;
                                }
                            }
                        }
                        appBlockerService.handler.removeCallbacks(this);
                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                        SharedPreferences sharedPreferences21 = appBlockerService.prefs;
                        if (sharedPreferences21 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        long j14 = sharedPreferences21.getLong("blockExpiryMillis", 0L);
                        appBlockerService.handler.postDelayed(this, Math.min(60020 - (jCurrentTimeMillis4 % 60000), j14 > jCurrentTimeMillis4 ? (j14 - jCurrentTimeMillis4) + 20 : 60000L));
                    }
                }
            } catch (Throwable th2) {
                if (((PowerManager) appBlockerService.getSystemService(PowerManager.class)).isInteractive()) {
                    SharedPreferences sharedPreferences22 = appBlockerService.prefs;
                    if (sharedPreferences22 == null) {
                        kotlin.jvm.internal.l.e("prefs");
                        throw null;
                    }
                    if (sharedPreferences22.getBoolean("sleepEnabled", false)) {
                        appBlockerService.handler.removeCallbacks(this);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        sharedPreferences3 = appBlockerService.prefs;
                        if (sharedPreferences3 != null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        long j15 = sharedPreferences3.getLong("blockExpiryMillis", 0L);
                        appBlockerService.handler.postDelayed(this, Math.min(60020 - (jCurrentTimeMillis % 60000), j15 > jCurrentTimeMillis ? (j15 - jCurrentTimeMillis) + 20 : 60000L));
                    } else {
                        SharedPreferences sharedPreferences23 = appBlockerService.prefs;
                        if (sharedPreferences23 == null) {
                            kotlin.jvm.internal.l.e("prefs");
                            throw null;
                        }
                        if (kotlin.jvm.internal.l.a(sharedPreferences23.getString("accountType", "personal"), "personal") && ((string2 = sharedPreferences23.getString("parentViewKidCode", "")) == null || qf.k.G0(string2))) {
                            List list4 = f.f6116a;
                            SharedPreferences sharedPreferences24 = appBlockerService.prefs;
                            if (sharedPreferences24 == null) {
                                kotlin.jvm.internal.l.e("prefs");
                                throw null;
                            }
                            if (f.a(sharedPreferences24)) {
                                appBlockerService.handler.removeCallbacks(this);
                                jCurrentTimeMillis = System.currentTimeMillis();
                                sharedPreferences3 = appBlockerService.prefs;
                                if (sharedPreferences3 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                long j16 = sharedPreferences3.getLong("blockExpiryMillis", 0L);
                                appBlockerService.handler.postDelayed(this, Math.min(60020 - (jCurrentTimeMillis % 60000), j16 > jCurrentTimeMillis ? (j16 - jCurrentTimeMillis) + 20 : 60000L));
                            } else {
                                sharedPreferences4 = appBlockerService.prefs;
                                if (sharedPreferences4 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (kotlin.jvm.internal.l.a(sharedPreferences4.getString("accountType", ""), "kid")) {
                                    sharedPreferences5 = appBlockerService.prefs;
                                    if (sharedPreferences5 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    if (sharedPreferences5.getBoolean("scheduleEnabled", false)) {
                                        appBlockerService.handler.removeCallbacks(this);
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                        sharedPreferences3 = appBlockerService.prefs;
                                        if (sharedPreferences3 != null) {
                                            kotlin.jvm.internal.l.e("prefs");
                                            throw null;
                                        }
                                        long j17 = sharedPreferences3.getLong("blockExpiryMillis", 0L);
                                        appBlockerService.handler.postDelayed(this, Math.min(60020 - (jCurrentTimeMillis % 60000), j17 > jCurrentTimeMillis ? (j17 - jCurrentTimeMillis) + 20 : 60000L));
                                    }
                                }
                            }
                        } else {
                            sharedPreferences4 = appBlockerService.prefs;
                            if (sharedPreferences4 != null) {
                                kotlin.jvm.internal.l.e("prefs");
                                throw null;
                            }
                            if (kotlin.jvm.internal.l.a(sharedPreferences4.getString("accountType", ""), "kid")) {
                                sharedPreferences5 = appBlockerService.prefs;
                                if (sharedPreferences5 != null) {
                                    kotlin.jvm.internal.l.e("prefs");
                                    throw null;
                                }
                                if (sharedPreferences5.getBoolean("scheduleEnabled", false)) {
                                    appBlockerService.handler.removeCallbacks(this);
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                    sharedPreferences3 = appBlockerService.prefs;
                                    if (sharedPreferences3 != null) {
                                        kotlin.jvm.internal.l.e("prefs");
                                        throw null;
                                    }
                                    long j18 = sharedPreferences3.getLong("blockExpiryMillis", 0L);
                                    appBlockerService.handler.postDelayed(this, Math.min(60020 - (jCurrentTimeMillis % 60000), j18 > jCurrentTimeMillis ? (j18 - jCurrentTimeMillis) + 20 : 60000L));
                                }
                            }
                        }
                    }
                }
                throw th2;
            }
        }
    }
}
