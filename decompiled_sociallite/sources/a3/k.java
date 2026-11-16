package a3;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188a;

    public static String a(int i2) {
        if (i2 == 1) {
            return "Ltr";
        }
        if (i2 == 2) {
            return "Rtl";
        }
        if (i2 == 3) {
            return "Content";
        }
        if (i2 == 4) {
            return "ContentOrLtr";
        }
        if (i2 == 5) {
            return "ContentOrRtl";
        }
        return i2 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f188a == ((k) obj).f188a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188a);
    }

    public final String toString() {
        return a(this.f188a);
    }
}
