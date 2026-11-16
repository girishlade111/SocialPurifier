package ac;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class x extends z {
    public static z f(int i2) {
        if (i2 < 0) {
            return z.b;
        }
        return i2 > 0 ? z.f596c : z.f595a;
    }

    @Override // ac.z
    public final z a(int i2, int i10) {
        int i11;
        if (i2 < i10) {
            i11 = -1;
        } else {
            i11 = i2 > i10 ? 1 : 0;
        }
        return f(i11);
    }

    @Override // ac.z
    public final z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // ac.z
    public final z c(boolean z10, boolean z11) {
        int i2;
        if (z10 == z11) {
            i2 = 0;
        } else {
            i2 = z10 ? 1 : -1;
        }
        return f(i2);
    }

    @Override // ac.z
    public final z d(boolean z10, boolean z11) {
        int i2;
        if (z11 == z10) {
            i2 = 0;
        } else {
            i2 = z11 ? 1 : -1;
        }
        return f(i2);
    }

    @Override // ac.z
    public final int e() {
        return 0;
    }
}
