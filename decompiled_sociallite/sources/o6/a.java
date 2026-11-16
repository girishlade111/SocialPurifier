package o6;

import b6.h;
import i5.d0;
import i5.o;
import java.math.RoundingMode;
import o4.e0;
import o4.f0;
import o4.n;
import r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f16012m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f16013n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f16014a;
    public final d0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f16015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r4.o f16018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o4.o f16020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16023k;
    public long l;

    public a(o oVar, d0 d0Var, h hVar) throws f0 {
        this.f16014a = oVar;
        this.b = d0Var;
        this.f16015c = hVar;
        int i2 = hVar.f1660c;
        int iMax = Math.max(1, i2 / 10);
        this.f16019g = iMax;
        r4.o oVar2 = new r4.o((byte[]) hVar.f1663f);
        oVar2.m();
        int iM = oVar2.m();
        this.f16016d = iM;
        int i10 = hVar.b;
        int i11 = hVar.f1661d;
        int i12 = (((i11 - (i10 * 4)) * 8) / (hVar.f1662e * i10)) + 1;
        if (iM != i12) {
            throw f0.a(null, "Expected frames per block: " + i12 + "; got: " + iM);
        }
        int iE = v.e(iMax, iM);
        this.f16017e = new byte[iE * i11];
        this.f16018f = new r4.o(iM * 2 * i10 * iE);
        int i13 = ((i11 * i2) * 8) / iM;
        n nVar = new n();
        nVar.l = e0.h("audio/raw");
        nVar.f15884g = i13;
        nVar.f15885h = i13;
        nVar.f15889m = iMax * 2 * i10;
        nVar.f15901y = i10;
        nVar.f15902z = i2;
        nVar.A = 2;
        this.f16020h = new o4.o(nVar);
    }

    @Override // o6.b
    public final void a(long j10) {
        this.f16021i = 0;
        this.f16022j = j10;
        this.f16023k = 0;
        this.l = 0L;
    }

    @Override // o6.b
    public final void b(int i2, long j10) {
        this.f16014a.q(new e(this.f16015c, this.f16016d, i2, j10));
        this.b.a(this.f16020h);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // o6.b
    public final boolean c(i5.n nVar, long j10) {
        byte[] bArr;
        int i2;
        int i10;
        int i11;
        r4.o oVar;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        int i15;
        int i16;
        int iG;
        int iMin;
        int[] iArr;
        int i17;
        int i18;
        int i19;
        byte b;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = this.f16023k;
        h hVar = this.f16015c;
        int i27 = i26 / (hVar.b * 2);
        int i28 = this.f16019g;
        int i29 = this.f16016d;
        int iE = v.e(i28 - i27, i29);
        int i30 = hVar.f1661d;
        int i31 = iE * i30;
        boolean z10 = j10 == 0;
        while (true) {
            bArr = this.f16017e;
            if (z10 && (i24 = this.f16021i) < i31) {
                i25 = nVar.read(bArr, this.f16021i, (int) Math.min(i31 - i24, j10));
                if (i25 == -1) {
                    break;
                }
                this.f16021i += i25;
                bArr = this.f16017e;
                if (z10) {
                }
            }
            i2 = this.f16021i / i30;
            if (i2 > 0) {
                i11 = 0;
                while (true) {
                    oVar = this.f16018f;
                    if (i11 < i2) {
                        break;
                    }
                    i13 = 0;
                    while (true) {
                        i14 = hVar.b;
                        if (i13 < i14) {
                            bArr2 = oVar.f18482a;
                            int i32 = (i13 * 4) + (i11 * i30);
                            i15 = (i14 * 4) + i32;
                            i16 = (i30 / i14) - 4;
                            iG = (short) ((bArr[i32] & 255) | ((bArr[i32 + 1] & 255) << 8));
                            int i33 = i2;
                            iMin = Math.min(bArr[i32 + 2] & 255, 88);
                            iArr = f16013n;
                            i17 = iArr[iMin];
                            i18 = ((i11 * i29 * i14) + i13) * 2;
                            bArr2[i18] = (byte) (iG & 255);
                            bArr2[i18 + 1] = (byte) (iG >> 8);
                            int i34 = i11;
                            i19 = 0;
                            while (i19 < i16 * 2) {
                                b = bArr[((i19 / 8) * i14 * 4) + i15 + ((i19 / 2) % 4)];
                                i20 = i19;
                                i21 = b & 255;
                                if (i20 % 2 == 0) {
                                    i22 = b & 15;
                                } else {
                                    i22 = i21 >> 4;
                                }
                                i23 = ((((i22 & 7) * 2) + 1) * i17) >> 3;
                                if ((i22 & 8) != 0) {
                                    i23 = -i23;
                                }
                                iG = v.g(iG + i23, -32768, 32767);
                                i18 = (i14 * 2) + i18;
                                bArr2[i18] = (byte) (iG & 255);
                                bArr2[i18 + 1] = (byte) (iG >> 8);
                                iMin = v.g(iMin + f16012m[i22], 0, 88);
                                i17 = iArr[iMin];
                                i19 = i20 + 1;
                            }
                            i13++;
                            i2 = i33;
                            i11 = i34;
                        }
                    }
                    i11++;
                }
                int i35 = i2;
                int i36 = i29 * i35 * 2 * hVar.b;
                oVar.F(0);
                oVar.E(i36);
                this.f16021i -= i35 * i30;
                int i37 = oVar.f18483c;
                this.b.c(oVar, i37, 0);
                i12 = this.f16023k + i37;
                this.f16023k = i12;
                if (i12 / (hVar.b * 2) >= i28) {
                    d(i28);
                }
            }
            if (z10 && (i10 = this.f16023k / (hVar.b * 2)) > 0) {
                d(i10);
            }
            return z10;
        }
        while (true) {
            bArr = this.f16017e;
            if (z10) {
            }
            i2 = this.f16021i / i30;
            if (i2 > 0) {
                i11 = 0;
                while (true) {
                    oVar = this.f16018f;
                    if (i11 < i2) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (true) {
                        i14 = hVar.b;
                        if (i13 < i14) {
                            bArr2 = oVar.f18482a;
                            int i38 = (i13 * 4) + (i11 * i30);
                            i15 = (i14 * 4) + i38;
                            i16 = (i30 / i14) - 4;
                            iG = (short) ((bArr[i38] & 255) | ((bArr[i38 + 1] & 255) << 8));
                            int i39 = i2;
                            iMin = Math.min(bArr[i38 + 2] & 255, 88);
                            iArr = f16013n;
                            i17 = iArr[iMin];
                            i18 = ((i11 * i29 * i14) + i13) * 2;
                            bArr2[i18] = (byte) (iG & 255);
                            bArr2[i18 + 1] = (byte) (iG >> 8);
                            int i310 = i11;
                            i19 = 0;
                            while (i19 < i16 * 2) {
                                b = bArr[((i19 / 8) * i14 * 4) + i15 + ((i19 / 2) % 4)];
                                i20 = i19;
                                i21 = b & 255;
                                if (i20 % 2 == 0) {
                                    i22 = b & 15;
                                } else {
                                    i22 = i21 >> 4;
                                }
                                i23 = ((((i22 & 7) * 2) + 1) * i17) >> 3;
                                if ((i22 & 8) != 0) {
                                    i23 = -i23;
                                }
                                iG = v.g(iG + i23, -32768, 32767);
                                i18 = (i14 * 2) + i18;
                                bArr2[i18] = (byte) (iG & 255);
                                bArr2[i18 + 1] = (byte) (iG >> 8);
                                iMin = v.g(iMin + f16012m[i22], 0, 88);
                                i17 = iArr[iMin];
                                i19 = i20 + 1;
                            }
                            i13++;
                            i2 = i39;
                            i11 = i310;
                        }
                    }
                    i11++;
                }
                int i311 = i2;
                int i312 = i29 * i311 * 2 * hVar.b;
                oVar.F(0);
                oVar.E(i312);
                this.f16021i -= i311 * i30;
                int i313 = oVar.f18483c;
                this.b.c(oVar, i313, 0);
                i12 = this.f16023k + i313;
                this.f16023k = i12;
                if (i12 / (hVar.b * 2) >= i28) {
                    d(i28);
                }
            }
            if (z10) {
                d(i10);
            }
            return z10;
            this.f16021i += i25;
        }
    }

    public final void d(int i2) {
        long j10 = this.f16022j;
        long j11 = this.l;
        h hVar = this.f16015c;
        long j12 = hVar.f1660c;
        int i10 = v.f18493a;
        long jH = j10 + v.H(j11, 1000000L, j12, RoundingMode.FLOOR);
        int i11 = i2 * 2 * hVar.b;
        this.b.d(jH, 1, i11, this.f16023k - i11, null);
        this.l += (long) i2;
        this.f16023k -= i11;
    }
}
