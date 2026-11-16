package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static final c2 b = new c2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f2640c = new c2(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c2 f2641d = new c2(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2 f2642e = new c2(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c2 f2643f = new c2(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c2 f2644g = new c2(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c2 f2645h = new c2(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c2 f2646i = new c2(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2647a;

    public /* synthetic */ c2(int i2) {
        this.f2647a = i2;
    }

    public final boolean a(int i2) {
        switch (this.f2647a) {
            case 0:
                return a5.z.a(i2) != 0;
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 3:
                return a5.z.b(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 5:
                return i2 == 0 || i2 == 1;
            case 6:
                return i2 == 1 || i2 == 2;
            default:
                return a5.z.c(i2) != 0;
        }
    }
}
