package v2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21834a;

    public static String a(int i2) {
        if (i2 == 0) {
            return "Unspecified";
        }
        if (i2 == 1) {
            return "Text";
        }
        if (i2 == 2) {
            return "Ascii";
        }
        if (i2 == 3) {
            return "Number";
        }
        if (i2 == 4) {
            return "Phone";
        }
        if (i2 == 5) {
            return "Uri";
        }
        if (i2 == 6) {
            return "Email";
        }
        if (i2 == 7) {
            return "Password";
        }
        if (i2 == 8) {
            return "NumberPassword";
        }
        return i2 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f21834a == ((n) obj).f21834a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21834a);
    }

    public final String toString() {
        return a(this.f21834a);
    }
}
