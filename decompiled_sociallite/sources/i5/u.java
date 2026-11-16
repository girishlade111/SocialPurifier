package i5;

import java.util.Collections;
import java.util.List;
import o4.f0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8434a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8441i;

    public u(List list, int i2, int i10, int i11, int i12, int i13, int i14, float f10, String str) {
        this.f8434a = list;
        this.b = i2;
        this.f8435c = i10;
        this.f8436d = i11;
        this.f8437e = i12;
        this.f8438f = i13;
        this.f8439g = i14;
        this.f8440h = f10;
        this.f8441i = str;
    }

    public static u a(r4.o oVar) throws f0 {
        boolean z10;
        try {
            oVar.G(21);
            int iT = oVar.t() & 3;
            int iT2 = oVar.t();
            int i2 = oVar.b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i11 >= iT2) {
                    break;
                }
                oVar.G(1);
                int iZ = oVar.z();
                for (int i13 = 0; i13 < iZ; i13++) {
                    int iZ2 = oVar.z();
                    i12 += iZ2 + 4;
                    oVar.G(iZ2);
                }
                i11++;
            }
            oVar.F(i2);
            byte[] bArr = new byte[i12];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f10 = 1.0f;
            String strC = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < iT2) {
                int iT3 = oVar.t() & 63;
                int iZ3 = oVar.z();
                int i21 = i10;
                while (i21 < iZ3) {
                    int iZ4 = oVar.z();
                    boolean z11 = z10;
                    int i22 = iT;
                    System.arraycopy(s4.g.f19434a, i10, bArr, i20, 4);
                    int i23 = i20 + 4;
                    System.arraycopy(oVar.f18482a, oVar.b, bArr, i23, iZ4);
                    if (iT3 == 33 && i21 == 0) {
                        s4.d dVarC = s4.g.c(bArr, i23, i23 + iZ4);
                        i14 = dVarC.f19408e + 8;
                        i15 = dVarC.f19409f + 8;
                        i16 = dVarC.l;
                        int i24 = dVarC.f19415m;
                        int i25 = dVarC.f19416n;
                        float f11 = dVarC.f19414k;
                        strC = r4.a.c(dVarC.f19405a, dVarC.b, dVarC.f19406c, dVarC.f19407d, dVarC.f19410g, dVarC.f19411h);
                        i18 = i25;
                        f10 = f11;
                        i17 = i24;
                    }
                    i20 = i23 + iZ4;
                    oVar.G(iZ4);
                    i21++;
                    z10 = z11;
                    iT = i22;
                    iT2 = iT2;
                    i10 = 0;
                }
                i19++;
                i10 = 0;
            }
            return new u(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iT + 1, i14, i15, i16, i17, i18, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw f0.a(e10, "Error parsing HEVC config");
        }
    }
}
