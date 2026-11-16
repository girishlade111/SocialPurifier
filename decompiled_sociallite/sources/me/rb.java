package me;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13525g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13520a = 202.0f;
    public float b = 56.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lf.f f13526h = new lf.f(ModuleDescriptor.MODULE_VERSION, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f13527i = new ArrayList(480);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f13528j = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:21:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[SYNTHETIC] */
    public final void a(int i2) {
        float fCos;
        float fSin;
        float f10;
        float f11;
        float f12;
        float f13;
        la laVar;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        float f14 = this.b;
        float f15 = 2.0f;
        float f16 = f14 / 2.0f;
        float f17 = this.f13520a - f14;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        float f18 = 3.1415927f * f16;
        int i10 = 0;
        while (i10 < i2) {
            float f19 = f17 * f15;
            float fB = b(0.0f, (f18 * f15) + f19);
            if (fB < f17) {
                f11 = -1.0f;
                f13 = ((-f17) / f15) + fB;
                f12 = -f16;
            } else {
                if (fB < f17 + f18) {
                    double d2 = ((fB - f17) / f16) - 1.5707964f;
                    fCos = (float) Math.cos(d2);
                    fSin = (float) Math.sin(d2);
                    f10 = f17 / f15;
                } else if (fB < f19 + f18) {
                    f11 = 1.0f;
                    f12 = f16;
                    f13 = (f17 / f15) - ((fB - f17) - f18);
                } else {
                    double d3 = (((fB - f19) - f18) / f16) + 1.5707964f;
                    fCos = (float) Math.cos(d3);
                    fSin = (float) Math.sin(d3);
                    f10 = (-f17) / f15;
                }
                f13 = f10 + (fCos * f16);
                f12 = fSin * f16;
                float fB2 = (b(12.0f, 32.0f) * this.f13522d) + b(10.0f, 32.0f);
                float fB3 = b(-16.0f, 16.0f);
                float f20 = (fCos * fB2) - (fSin * fB3);
                float f21 = ((fCos * fB3) + (fSin * fB2)) - 12.0f;
                float fB4 = b(0.3f, 0.85f);
                float fB5 = b(0.55f, 1.2f);
                float fB6 = b(0.45f, 0.95f);
                float fB7 = b(0.0f, 6.28f);
                if (i10 % 9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 % 6 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                laVar = new la(f13, f12, f20, f21, f13, f12, fB4, fB5, fB6, fB7, z10, z11, 12288);
                arrayList = this.f13527i;
                if (arrayList.size() < 480) {
                    arrayList.add(laVar);
                }
                i10++;
                f15 = 2.0f;
            }
            fSin = f11;
            fCos = 0.0f;
            float fB8 = (b(12.0f, 32.0f) * this.f13522d) + b(10.0f, 32.0f);
            float fB9 = b(-16.0f, 16.0f);
            float f22 = (fCos * fB8) - (fSin * fB9);
            float f23 = ((fCos * fB9) + (fSin * fB8)) - 12.0f;
            float fB10 = b(0.3f, 0.85f);
            float fB11 = b(0.55f, 1.2f);
            float fB12 = b(0.45f, 0.95f);
            float fB13 = b(0.0f, 6.28f);
            if (i10 % 9 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 % 6 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            laVar = new la(f13, f12, f22, f23, f13, f12, fB10, fB11, fB12, fB13, z10, z11, 12288);
            arrayList = this.f13527i;
            if (arrayList.size() < 480) {
                arrayList.add(laVar);
            }
            i10++;
            f15 = 2.0f;
        }
    }

    public final float b(float f10, float f11) {
        return ((f11 - f10) * this.f13526h.b()) + f10;
    }
}
