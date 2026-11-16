package n2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15052a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f15052a == ((h) obj).f15052a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15052a);
    }

    public final String toString() {
        int i2 = this.f15052a;
        if (i2 == 0) {
            return "Button";
        }
        if (i2 == 1) {
            return "Checkbox";
        }
        if (i2 == 2) {
            return "Switch";
        }
        if (i2 == 3) {
            return "RadioButton";
        }
        if (i2 == 4) {
            return "Tab";
        }
        if (i2 == 5) {
            return "Image";
        }
        return i2 == 6 ? "DropdownList" : "Unknown";
    }
}
