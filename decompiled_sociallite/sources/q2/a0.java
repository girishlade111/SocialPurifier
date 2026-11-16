package q2;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f17005a = new y();
    public static final long b;

    static {
        long j10 = 0;
        b = (j10 & 4294967295L) | (j10 << 32);
    }

    public static final TextDirectionHeuristic a(int i2) {
        if (i2 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i2 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i2 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i2 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i2 != 4) {
            return i2 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
