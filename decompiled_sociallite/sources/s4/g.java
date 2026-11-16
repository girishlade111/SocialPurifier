package s4;

import androidx.security.crypto.MasterKey;
import java.util.Arrays;
import ke.c1;
import o4.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19434a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f19435c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f19436d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i10, boolean[] zArr) {
        int i11 = i10 - i2;
        r4.a.i(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i2 + 2;
        while (i13 < i12) {
            byte b10 = bArr[i13];
            if ((b10 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static d c(byte[] bArr, int i2, int i10) {
        int i11;
        int iD;
        int i12;
        int iL;
        int i13 = 2;
        f6.f fVar = new f6.f(bArr, i2 + 2, i10);
        int i14 = 4;
        fVar.s(4);
        int i15 = fVar.i(3);
        fVar.r();
        int i16 = fVar.i(2);
        boolean zH = fVar.h();
        int i17 = fVar.i(5);
        int i18 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (fVar.h()) {
                i18 |= 1 << i19;
            }
        }
        int i20 = 6;
        int[] iArr = new int[6];
        for (int i21 = 0; i21 < 6; i21++) {
            iArr[i21] = fVar.i(8);
        }
        int i22 = fVar.i(8);
        int i23 = 0;
        for (int i24 = 0; i24 < i15; i24++) {
            if (fVar.h()) {
                i23 += 89;
            }
            if (fVar.h()) {
                i23 += 8;
            }
        }
        fVar.s(i23);
        if (i15 > 0) {
            fVar.s((8 - i15) * 2);
        }
        fVar.l();
        int iL2 = fVar.l();
        if (iL2 == 3) {
            fVar.r();
        }
        int iL3 = fVar.l();
        int iL4 = fVar.l();
        if (fVar.h()) {
            int iL5 = fVar.l();
            int iL6 = fVar.l();
            int iL7 = fVar.l();
            int iL8 = fVar.l();
            iL3 -= (iL5 + iL6) * ((iL2 == 1 || iL2 == 2) ? 2 : 1);
            iL4 -= (iL7 + iL8) * (iL2 == 1 ? 2 : 1);
        }
        int iL9 = fVar.l();
        int i25 = iL3;
        int i26 = i18;
        int iL10 = fVar.l();
        int iL11 = fVar.l();
        for (int i27 = fVar.h() ? 0 : i15; i27 <= i15; i27++) {
            fVar.l();
            fVar.l();
            fVar.l();
        }
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        if (fVar.h() && fVar.h()) {
            int i28 = 0;
            while (i28 < i14) {
                int i29 = 0;
                while (i29 < i20) {
                    if (fVar.h()) {
                        int iMin = Math.min(64, 1 << ((i28 << 1) + 4));
                        if (i28 > 1) {
                            fVar.m();
                        }
                        for (int i30 = 0; i30 < iMin; i30++) {
                            fVar.m();
                        }
                    } else {
                        fVar.l();
                    }
                    i29 += i28 == 3 ? 3 : 1;
                    i20 = 6;
                }
                i28++;
                i14 = 4;
                i20 = 6;
            }
        }
        fVar.s(2);
        if (fVar.h()) {
            fVar.s(8);
            fVar.l();
            fVar.l();
            fVar.r();
        }
        int iL12 = fVar.l();
        int i31 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int iC = -1;
        int i32 = -1;
        int i33 = -1;
        while (i31 < iL12) {
            if (i31 == 0 || !fVar.h()) {
                iL = fVar.l();
                int iL13 = fVar.l();
                int[] iArr3 = new int[iL];
                int i34 = 0;
                while (i34 < iL) {
                    iArr3[i34] = (i34 > 0 ? iArr3[i34 - 1] : 0) - (fVar.l() + 1);
                    fVar.r();
                    i34++;
                }
                int[] iArr4 = new int[iL13];
                int i35 = 0;
                while (i35 < iL13) {
                    iArr4[i35] = fVar.l() + 1 + (i35 > 0 ? iArr4[i35 - 1] : 0);
                    fVar.r();
                    i35++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i32 = iL13;
            } else {
                int i36 = i33 + i32;
                int iL14 = (1 - ((fVar.h() ? 1 : 0) * 2)) * (fVar.l() + 1);
                int i37 = i36 + 1;
                boolean[] zArr = new boolean[i37];
                for (int i38 = 0; i38 <= i36; i38++) {
                    if (fVar.h()) {
                        zArr[i38] = true;
                    } else {
                        zArr[i38] = fVar.h();
                    }
                }
                int[] iArr5 = new int[i37];
                int[] iArr6 = new int[i37];
                int i39 = 0;
                for (int i40 = i32 - 1; i40 >= 0; i40--) {
                    int i41 = iArrCopyOf[i40] + iL14;
                    if (i41 < 0 && zArr[i33 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                if (iL14 < 0 && zArr[i36]) {
                    iArr5[i39] = iL14;
                    i39++;
                }
                iL = i39;
                for (int i42 = 0; i42 < i33; i42++) {
                    int i43 = iArr2[i42] + iL14;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[iL] = i43;
                        iL++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iL);
                int i44 = 0;
                for (int i45 = i33 - 1; i45 >= 0; i45--) {
                    int i46 = iArr2[i45] + iL14;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (iL14 > 0 && zArr[i36]) {
                    iArr6[i44] = iL14;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i32; i48++) {
                    int i49 = iArrCopyOf[i48] + iL14;
                    if (i49 > 0 && zArr[i33 + i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i47);
                iArr2 = iArrCopyOf2;
                i32 = i47;
            }
            i33 = iL;
            i31++;
            i13 = i13;
            iL12 = iL12;
            iL9 = iL9;
        }
        int i50 = i13;
        int i51 = iL9;
        if (fVar.h()) {
            int iL15 = fVar.l();
            for (int i52 = 0; i52 < iL15; i52++) {
                fVar.s(iL11 + 5);
            }
        }
        int i53 = i50;
        fVar.s(i53);
        float f10 = 1.0f;
        if (fVar.h()) {
            if (fVar.h()) {
                int i54 = fVar.i(8);
                if (i54 == 255) {
                    int i55 = fVar.i(16);
                    int i56 = fVar.i(16);
                    if (i55 != 0 && i56 != 0) {
                        f10 = i55 / i56;
                    }
                } else if (i54 < 17) {
                    f10 = b[i54];
                } else {
                    c1.v("Unexpected aspect_ratio_idc value: ", i54, "NalUnitUtil");
                }
            }
            if (fVar.h()) {
                fVar.r();
            }
            if (fVar.h()) {
                fVar.s(3);
                if (fVar.h()) {
                    i53 = 1;
                }
                if (fVar.h()) {
                    int i57 = fVar.i(8);
                    int i58 = fVar.i(8);
                    fVar.s(8);
                    iC = h.c(i57);
                    iD = h.d(i58);
                } else {
                    iD = -1;
                }
            } else {
                i53 = -1;
                iD = -1;
            }
            if (fVar.h()) {
                fVar.l();
                fVar.l();
            }
            fVar.r();
            if (fVar.h()) {
                iL4 *= 2;
            }
            i12 = i53;
            i11 = iL4;
        } else {
            i11 = iL4;
            iD = -1;
            i12 = -1;
        }
        return new d(i16, zH, i17, i26, i51, iL10, iArr, i22, i25, i11, f10, iC, i12, iD);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9 A[PHI: r15
  0x01d9: PHI (r15v6 float) = (r15v5 float), (r15v10 float) binds: [B:82:0x0164, B:99:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0176  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    /* JADX WARN: Code duplicated, block: B:93:0x018d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019f  */
    public static f d(byte[] bArr, int i2, int i10) {
        int iL;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int iL2;
        boolean z11;
        int i14;
        boolean zH;
        int i15;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int iD;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 1;
        f6.f fVar = new f6.f(bArr, i2 + 1, i10);
        int i25 = 8;
        int i26 = fVar.i(8);
        int i27 = fVar.i(8);
        int i28 = fVar.i(8);
        int iL3 = fVar.l();
        if (i26 == 100 || i26 == 110 || i26 == 122 || i26 == 244 || i26 == 44 || i26 == 83 || i26 == 86 || i26 == 118 || i26 == 128 || i26 == 138) {
            iL = fVar.l();
            boolean zH2 = iL == 3 ? fVar.h() : false;
            int iL4 = fVar.l();
            int iL5 = fVar.l();
            fVar.r();
            if (fVar.h()) {
                int i29 = iL != 3 ? 8 : 12;
                int i30 = 0;
                while (i30 < i29) {
                    if (fVar.h()) {
                        int i31 = i30 < 6 ? 16 : 64;
                        int iM = i25;
                        int i32 = iM;
                        for (int i33 = 0; i33 < i31; i33++) {
                            if (iM != 0) {
                                iM = ((fVar.m() + i32) + MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE) % MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                            }
                            if (iM != 0) {
                                i32 = iM;
                            }
                        }
                    }
                    i30++;
                    i25 = 8;
                }
            }
            i11 = 16;
            z10 = zH2;
            i12 = iL4;
            i13 = iL5;
        } else {
            iL = 1;
            i11 = 16;
            i12 = 0;
            i13 = 0;
            z10 = false;
        }
        int iL6 = fVar.l() + 4;
        int iL7 = fVar.l();
        if (iL7 != 0) {
            if (iL7 == 1) {
                boolean zH3 = fVar.h();
                fVar.m();
                fVar.m();
                iL7 = iL7;
                long jL = fVar.l();
                iL6 = iL6;
                for (int i34 = 0; i34 < jL; i34++) {
                    fVar.l();
                }
                i24 = 1;
                iL2 = 0;
                z11 = zH3;
            } else {
                iL2 = 0;
            }
            fVar.l();
            fVar.r();
            int iL8 = fVar.l() + i24;
            int iL9 = fVar.l() + i24;
            i14 = i24;
            zH = fVar.h();
            i15 = 2 - (zH ? 1 : 0);
            int i35 = iL9 * i15;
            if (!zH) {
                fVar.r();
            }
            fVar.r();
            i16 = iL8 * 16;
            i17 = i35 * 16;
            if (fVar.h()) {
                int iL10 = fVar.l();
                int iL11 = fVar.l();
                int iL12 = fVar.l();
                int iL13 = fVar.l();
                if (iL != 0) {
                    if (iL == 3) {
                        i14 = 2;
                    }
                    if (iL == i14) {
                        i23 = 2;
                    } else {
                        i23 = i14;
                    }
                    i15 *= i23;
                }
                i16 -= (iL10 + iL11) * i14;
                i17 -= (iL12 + iL13) * i15;
            }
            int i36 = i17;
            f10 = 1.0f;
            if (fVar.h()) {
                if (fVar.h()) {
                    i20 = fVar.i(8);
                    if (i20 == 255) {
                        int i37 = i11;
                        i21 = fVar.i(i37);
                        i22 = fVar.i(i37);
                        if (i21 != 0 && i22 != 0) {
                            f10 = i21 / i22;
                        }
                    } else if (i20 < 17) {
                        f10 = b[i20];
                    } else {
                        c1.v("Unexpected aspect_ratio_idc value: ", i20, "NalUnitUtil");
                    }
                }
                if (fVar.h()) {
                    fVar.r();
                }
                if (fVar.h()) {
                    fVar.s(3);
                    i19 = fVar.h() ? 1 : 2;
                    if (fVar.h()) {
                        int i38 = fVar.i(8);
                        int i39 = fVar.i(8);
                        fVar.s(8);
                        int iC = h.c(i38);
                        iD = h.d(i39);
                        i18 = iC;
                    } else {
                        i18 = -1;
                    }
                } else {
                    i18 = -1;
                    i19 = -1;
                }
                iD = -1;
            } else {
                i18 = -1;
                i19 = -1;
                iD = -1;
            }
            return new f(i26, i27, i28, iL3, i16, i36, f10, i12, i13, z10, zH, iL6, iL7, iL2, z11, i18, i19, iD);
        }
        iL2 = fVar.l() + 4;
        z11 = false;
        fVar.l();
        fVar.r();
        int iL14 = fVar.l() + i24;
        int iL15 = fVar.l() + i24;
        i14 = i24;
        zH = fVar.h();
        i15 = 2 - (zH ? 1 : 0);
        int i310 = iL15 * i15;
        if (!zH) {
            fVar.r();
        }
        fVar.r();
        i16 = iL14 * 16;
        i17 = i310 * 16;
        if (fVar.h()) {
            int iL16 = fVar.l();
            int iL17 = fVar.l();
            int iL18 = fVar.l();
            int iL19 = fVar.l();
            if (iL != 0) {
                if (iL == 3) {
                    i14 = 2;
                }
                if (iL == i14) {
                    i23 = 2;
                } else {
                    i23 = i14;
                }
                i15 *= i23;
            }
            i16 -= (iL16 + iL17) * i14;
            i17 -= (iL18 + iL19) * i15;
        }
        int i311 = i17;
        f10 = 1.0f;
        if (fVar.h()) {
            i18 = -1;
            i19 = -1;
            iD = -1;
        } else {
            if (fVar.h()) {
                i20 = fVar.i(8);
                if (i20 == 255) {
                    int i312 = i11;
                    i21 = fVar.i(i312);
                    i22 = fVar.i(i312);
                    if (i21 != 0) {
                        f10 = i21 / i22;
                    }
                } else if (i20 < 17) {
                    f10 = b[i20];
                } else {
                    c1.v("Unexpected aspect_ratio_idc value: ", i20, "NalUnitUtil");
                }
            }
            if (fVar.h()) {
                fVar.r();
            }
            if (fVar.h()) {
                fVar.s(3);
                if (fVar.h()) {
                }
                if (fVar.h()) {
                    int i313 = fVar.i(8);
                    int i314 = fVar.i(8);
                    fVar.s(8);
                    int iC2 = h.c(i313);
                    iD = h.d(i314);
                    i18 = iC2;
                } else {
                    i18 = -1;
                }
            } else {
                i18 = -1;
                i19 = -1;
            }
            iD = -1;
        }
        return new f(i26, i27, i28, iL3, i16, i311, f10, i12, i13, z10, zH, iL6, iL7, iL2, z11, i18, i19, iD);
    }

    public static int e(byte[] bArr, int i2) {
        int i10;
        synchronized (f19435c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i2) {
                while (true) {
                    if (i11 >= i2 - 2) {
                        i11 = i2;
                        break;
                    }
                    try {
                        if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i2) {
                    int[] iArr = f19436d;
                    if (iArr.length <= i12) {
                        f19436d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f19436d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i2 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f19436d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }
}
