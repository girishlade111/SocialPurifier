package k9;

import android.util.Log;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TreeSet f9176a;
    public final /* synthetic */ int b;

    public /* synthetic */ b0(int i2) {
        this.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:5:0x0004, B:7:0x0008, B:20:0x0035, B:22:0x0039, B:24:0x003f, B:25:0x0041, B:27:0x0045, B:29:0x0053, B:36:0x0065, B:35:0x0062, B:12:0x001b, B:19:0x0033, B:18:0x002f, B:15:0x0029), top: B:41:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:43:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized void a(boolean z10) {
        c0 c0Var;
        TreeSet treeSetF;
        if (z10) {
            c0Var = c0.f9182a;
            if (p9.a.f16774a.contains(c0.class)) {
                treeSetF = null;
                this.f9176a = treeSetF;
            } else {
                treeSetF = c0Var.f(this);
                this.f9176a = treeSetF;
            }
        } else {
            try {
                TreeSet treeSet = this.f9176a;
                if (treeSet == null || !kotlin.jvm.internal.l.a(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    c0Var = c0.f9182a;
                    if (p9.a.f16774a.contains(c0.class)) {
                        treeSetF = null;
                        this.f9176a = treeSetF;
                    } else {
                        try {
                            treeSetF = c0Var.f(this);
                        } catch (Throwable th) {
                            p9.a.a(th, c0.class);
                            treeSetF = null;
                        }
                        this.f9176a = treeSetF;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TreeSet treeSet2 = this.f9176a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            switch (this.b) {
                case 2:
                    if (t8.r.a().getApplicationInfo().targetSdkVersion >= 30) {
                        Log.w(p9.a.f16774a.contains(c0.class) ? null : "k9.c0", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                    }
                    break;
                default:
                    break;
            }
            throw th2;
        }
    }

    public final String b() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return "com.facebook.katana";
            case 3:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    public final void c() {
    }
}
