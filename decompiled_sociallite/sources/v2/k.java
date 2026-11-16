package v2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21826a;

    public static String a(int i2) {
        if (i2 == -1) {
            return "Unspecified";
        }
        if (i2 == 0) {
            return "None";
        }
        if (i2 == 1) {
            return "Default";
        }
        if (i2 == 2) {
            return "Go";
        }
        if (i2 == 3) {
            return "Search";
        }
        if (i2 == 4) {
            return "Send";
        }
        if (i2 == 5) {
            return "Previous";
        }
        if (i2 == 6) {
            return "Next";
        }
        return i2 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f21826a == ((k) obj).f21826a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21826a);
    }

    public final String toString() {
        return a(this.f21826a);
    }
}
