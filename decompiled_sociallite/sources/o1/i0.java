package o1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15723a;

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f15723a == ((i0) obj).f15723a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15723a);
    }

    public final String toString() {
        int i2 = this.f15723a;
        if (i2 == 0) {
            return "Argb8888";
        }
        if (i2 == 1) {
            return "Alpha8";
        }
        if (i2 == 2) {
            return "Rgb565";
        }
        if (i2 == 3) {
            return "F16";
        }
        return i2 == 4 ? "Gpu" : "Unknown";
    }
}
