package o1;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x {
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15736c;

    public n(long j10, int i2, ColorFilter colorFilter) {
        super(colorFilter);
        this.b = j10;
        this.f15736c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return w.d(this.b, nVar.b) && this.f15736c == nVar.f15736c;
    }

    public final int hashCode() {
        int i2 = w.f15767j;
        return Integer.hashCode(this.f15736c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        t8.c.s(this.b, sb2, ", blendMode=");
        int i2 = this.f15736c;
        if (i2 == 0) {
            str = "Clear";
        } else if (i2 == 1) {
            str = "Src";
        } else if (i2 == 2) {
            str = "Dst";
        } else if (i2 == 3) {
            str = "SrcOver";
        } else if (i2 == 4) {
            str = "DstOver";
        } else if (i2 == 5) {
            str = "SrcIn";
        } else if (i2 == 6) {
            str = "DstIn";
        } else if (i2 == 7) {
            str = "SrcOut";
        } else if (i2 == 8) {
            str = "DstOut";
        } else if (i2 == 9) {
            str = "SrcAtop";
        } else if (i2 == 10) {
            str = "DstAtop";
        } else if (i2 == 11) {
            str = "Xor";
        } else if (i2 == 12) {
            str = "Plus";
        } else if (i2 == 13) {
            str = "Modulate";
        } else if (i2 == 14) {
            str = "Screen";
        } else if (i2 == 15) {
            str = "Overlay";
        } else if (i2 == 16) {
            str = "Darken";
        } else if (i2 == 17) {
            str = "Lighten";
        } else if (i2 == 18) {
            str = "ColorDodge";
        } else if (i2 == 19) {
            str = "ColorBurn";
        } else if (i2 == 20) {
            str = "HardLight";
        } else if (i2 == 21) {
            str = "Softlight";
        } else if (i2 == 22) {
            str = "Difference";
        } else if (i2 == 23) {
            str = "Exclusion";
        } else if (i2 == 24) {
            str = "Multiply";
        } else if (i2 == 25) {
            str = "Hue";
        } else if (i2 == 26) {
            str = "Saturation";
        } else if (i2 == 27) {
            str = "Color";
        } else {
            str = i2 == 28 ? "Luminosity" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
