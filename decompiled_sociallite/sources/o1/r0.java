package o1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gd.e f15745a = new gd.e(26);
    public static Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f15746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f15747d;

    public static final Rect A(b3.i iVar) {
        return new Rect(iVar.f1608a, iVar.b, iVar.f1609c, iVar.f1610d);
    }

    public static final Rect B(n1.d dVar) {
        return new Rect((int) dVar.f15035a, (int) dVar.b, (int) dVar.f15036c, (int) dVar.f15037d);
    }

    public static final RectF C(n1.d dVar) {
        return new RectF(dVar.f15035a, dVar.b, dVar.f15036c, dVar.f15037d);
    }

    public static final Shader.TileMode D(int i2) {
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 == 3 && Build.VERSION.SDK_INT >= 31) {
            return c1.f15707a.b();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int E(long j10) {
        float[] fArr = p1.d.f16418a;
        return (int) (w.b(j10, p1.d.f16419c) >>> 32);
    }

    public static final Bitmap.Config F(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final n1.d G(RectF rectF) {
        return new n1.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode H(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String I(int i2) {
        if (i2 == 0) {
            return "Clamp";
        }
        if (i2 == 1) {
            return "Repeated";
        }
        if (i2 == 2) {
            return "Mirror";
        }
        return i2 == 3 ? "Decal" : "Unknown";
    }

    public static final void J(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            w4.d.j("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            w4.d.j("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r0
  0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static final int K(float f10, float[] fArr, int i2) {
        float f11 = 0.0f;
        if (f10 >= 0.0f) {
            f11 = 1.0f;
            if (f10 > 1.0f) {
                if (f10 <= 1.0000008f) {
                    f10 = f11;
                } else {
                    f10 = Float.NaN;
                }
            }
        } else if (f10 >= -8.34465E-7f) {
            f10 = f11;
        } else {
            f10 = Float.NaN;
        }
        fArr[i2] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public static final d a(h hVar) {
        Canvas canvas = e.f15714a;
        d dVar = new d();
        dVar.f15708a = new Canvas(n(hVar));
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0154  */
    /* JADX WARN: Code duplicated, block: B:106:0x015b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:112:0x016f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0184  */
    /* JADX WARN: Code duplicated, block: B:121:0x0189  */
    /* JADX WARN: Code duplicated, block: B:122:0x018b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:81:0x010c  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0133  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public static final long b(float f10, float f11, float f12, float f13, p1.c cVar) {
        int i2;
        int i10;
        int i11;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f14;
        if (cVar.c()) {
            float f15 = f13 < 0.0f ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i28 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i29 = i28 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < 0.0f ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i30 = i29 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            f14 = f12 >= 0.0f ? f12 : 0.0f;
            long j10 = ((long) (i30 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i31 = w.f15767j;
            return j10;
        }
        long j11 = cVar.b;
        int i32 = p1.b.f16415e;
        if (((int) (j11 >> 32)) != 3) {
            w4.d.j("Color only works with ColorSpaces with 3 components");
            return 0L;
        }
        int i33 = cVar.f16417c;
        if (i33 == -1) {
            w4.d.j("Unknown color space, please use a color space in ColorSpaces");
            return 0L;
        }
        int i34 = 0;
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f10 >= fB3) {
            fB3 = f10;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i35 = iFloatToRawIntBits3 >>> 31;
        int i36 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i37 = iFloatToRawIntBits3 & 8388607;
        if (i36 == 255) {
            i10 = i37 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i36 - 112;
            if (i2 >= 31) {
                i10 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i38 = i37 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i11 = (((i2 << 10) | i38) + 1) | (i35 << 15);
                    } else {
                        i10 = i38;
                    }
                    short s10 = (short) i11;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f11 >= fB) {
                        fB = f11;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i12 = iFloatToRawIntBits >>> 31;
                    i13 = (iFloatToRawIntBits >>> 23) & 255;
                    i14 = iFloatToRawIntBits & 8388607;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i15 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i15 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                }
                                short s11 = (short) i18;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f12 >= fB2) {
                                    fB2 = f12;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i20 = iFloatToRawIntBits2 >>> 31;
                                i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i22 = 8388607 & iFloatToRawIntBits2;
                                if (i21 == 255) {
                                    i25 = i22 != 0 ? 512 : 0;
                                    i34 = 31;
                                } else {
                                    i23 = i21 - 112;
                                    if (i23 >= 31) {
                                        i25 = 0;
                                        i34 = 49;
                                    } else {
                                        if (i23 <= 0) {
                                            i24 = i22 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                            } else {
                                                i25 = i24;
                                                i34 = i23;
                                            }
                                            short s12 = (short) i26;
                                            f14 = f13 >= 0.0f ? f13 : 0.0f;
                                            long j12 = (((long) i33) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i39 = w.f15767j;
                                            return j12;
                                        }
                                        if (i23 >= -10) {
                                            i27 = (i22 | 8388608) >> (1 - i23);
                                            if ((i27 & 4096) != 0) {
                                                i27 += 8192;
                                            }
                                            i25 = i27 >> 13;
                                        } else {
                                            i25 = 0;
                                        }
                                    }
                                }
                                i26 = i25 | (i20 << 15) | (i34 << 10);
                                short s13 = (short) i26;
                                if (f13 >= 0.0f) {
                                }
                                long j13 = (((long) i33) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i310 = w.f15767j;
                                return j13;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                                i15 = 0;
                            } else {
                                i17 = 0;
                                i15 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i15 << 10);
                    short s14 = (short) i18;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i25 = i22 != 0 ? 512 : 0;
                        i34 = 31;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i25 = 0;
                            i34 = 49;
                        } else {
                            if (i23 <= 0) {
                                i24 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                } else {
                                    i25 = i24;
                                    i34 = i23;
                                }
                                short s15 = (short) i26;
                                if (f13 >= 0.0f) {
                                }
                                long j14 = (((long) i33) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i311 = w.f15767j;
                                return j14;
                            }
                            if (i23 >= -10) {
                                i27 = (i22 | 8388608) >> (1 - i23);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    i26 = i25 | (i20 << 15) | (i34 << 10);
                    short s16 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j15 = (((long) i33) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s16)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i312 = w.f15767j;
                    return j15;
                }
                if (i2 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i2);
                    if ((i40 & 4096) != 0) {
                        i40 += 8192;
                    }
                    i10 = i40 >> 13;
                    i2 = 0;
                } else {
                    i10 = 0;
                    i2 = 0;
                }
            }
        }
        i11 = i10 | (i35 << 15) | (i2 << 10);
        short s17 = (short) i11;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f11 >= fB) {
            fB = f11;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i12 = iFloatToRawIntBits >>> 31;
        i13 = (iFloatToRawIntBits >>> 23) & 255;
        i14 = iFloatToRawIntBits & 8388607;
        if (i13 == 255) {
            if (i14 != 0) {
                i17 = 512;
            } else {
                i17 = 0;
            }
            i15 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i15 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                    }
                    short s18 = (short) i18;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i25 = i22 != 0 ? 512 : 0;
                        i34 = 31;
                    } else {
                        i23 = i21 - 112;
                        if (i23 >= 31) {
                            i25 = 0;
                            i34 = 49;
                        } else {
                            if (i23 <= 0) {
                                i24 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                                } else {
                                    i25 = i24;
                                    i34 = i23;
                                }
                                short s19 = (short) i26;
                                if (f13 >= 0.0f) {
                                }
                                long j16 = (((long) i33) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s19)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i313 = w.f15767j;
                                return j16;
                            }
                            if (i23 >= -10) {
                                i27 = (i22 | 8388608) >> (1 - i23);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    i26 = i25 | (i20 << 15) | (i34 << 10);
                    short s110 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j17 = (((long) i33) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s110)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i314 = w.f15767j;
                    return j17;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                    i15 = 0;
                } else {
                    i17 = 0;
                    i15 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i15 << 10);
        short s111 = (short) i18;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f12 >= fB2) {
            fB2 = f12;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i20 = iFloatToRawIntBits2 >>> 31;
        i21 = (iFloatToRawIntBits2 >>> 23) & 255;
        i22 = 8388607 & iFloatToRawIntBits2;
        if (i21 == 255) {
            i25 = i22 != 0 ? 512 : 0;
            i34 = 31;
        } else {
            i23 = i21 - 112;
            if (i23 >= 31) {
                i25 = 0;
                i34 = 49;
            } else {
                if (i23 <= 0) {
                    i24 = i22 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i26 = (((i23 << 10) | i24) + 1) | (i20 << 15);
                    } else {
                        i25 = i24;
                        i34 = i23;
                    }
                    short s112 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j18 = (((long) i33) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s112)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i315 = w.f15767j;
                    return j18;
                }
                if (i23 >= -10) {
                    i27 = (i22 | 8388608) >> (1 - i23);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i25 = i27 >> 13;
                } else {
                    i25 = 0;
                }
            }
        }
        i26 = i25 | (i20 << 15) | (i34 << 10);
        short s113 = (short) i26;
        if (f13 >= 0.0f) {
        }
        long j19 = (((long) i33) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s113)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i316 = w.f15767j;
        return j19;
    }

    public static final long c(int i2) {
        long j10 = ((long) i2) << 32;
        int i10 = w.f15767j;
        return j10;
    }

    public static final long d(long j10) {
        long j11 = j10 << 32;
        int i2 = w.f15767j;
        return j11;
    }

    public static long e(float f10, float f11, float f12) {
        return b(f10, f11, f12, 1.0f, p1.d.f16419c);
    }

    public static long f(int i2, int i10, int i11) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static h g(int i2, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        p1.r rVar = p1.d.f16419c;
        F(i11);
        return new h(m.b(i2, i10, i11, true, rVar));
    }

    public static final c6.j h() {
        return new c6.j(new Paint(7));
    }

    public static final j i() {
        return new j(new Path());
    }

    public static final long j(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i2 = d1.f15712c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long k(float f10, float f11, float f12, float f13, p1.c cVar) {
        int i2;
        int i10;
        int i11;
        int iFloatToRawIntBits;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iFloatToRawIntBits2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        if (cVar.c()) {
            long j10 = ((long) ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32;
            int i26 = w.f15767j;
            return j10;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        int i30 = 49;
        int i31 = 0;
        if (i28 == 255) {
            i10 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i10 = 0;
            } else {
                if (i2 > 0) {
                    int i32 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i11 = (((i2 << 10) | i32) + 1) | (i27 << 15);
                    } else {
                        i10 = i32;
                    }
                    short s10 = (short) i11;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i12 = iFloatToRawIntBits >>> 31;
                    i13 = (iFloatToRawIntBits >>> 23) & 255;
                    i14 = iFloatToRawIntBits & 8388607;
                    if (i13 == 255) {
                        if (i14 != 0) {
                            i17 = 512;
                        } else {
                            i17 = 0;
                        }
                        i15 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i15 = 49;
                            i17 = 0;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                }
                                short s11 = (short) i18;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i20 = iFloatToRawIntBits2 >>> 31;
                                i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i22 = 8388607 & iFloatToRawIntBits2;
                                if (i21 == 255) {
                                    i23 = i21 - 112;
                                    if (i23 < 31) {
                                        if (i23 <= 0) {
                                            i31 = i22 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                                            } else {
                                                i30 = i23;
                                            }
                                        } else if (i23 >= -10) {
                                            i25 = (i22 | 8388608) >> (1 - i23);
                                            if ((i25 & 4096) != 0) {
                                                i25 += 8192;
                                            }
                                            i30 = 0;
                                            i31 = i25 >> 13;
                                        } else {
                                            i30 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
                                    int i33 = w.f15767j;
                                    return jMax;
                                }
                                i31 = i22 == 0 ? 0 : 512;
                                i30 = 31;
                                i24 = (i20 << 15) | (i30 << 10) | i31;
                                long jMax2 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
                                int i34 = w.f15767j;
                                return jMax2;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                                i15 = 0;
                            } else {
                                i17 = 0;
                                i15 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i15 << 10);
                    short s12 = (short) i18;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i23 = i21 - 112;
                        if (i23 < 31) {
                            if (i23 <= 0) {
                                i31 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                                } else {
                                    i30 = i23;
                                }
                            } else if (i23 >= -10) {
                                i25 = (i22 | 8388608) >> (1 - i23);
                                if ((i25 & 4096) != 0) {
                                    i25 += 8192;
                                }
                                i30 = 0;
                                i31 = i25 >> 13;
                            } else {
                                i30 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
                        int i35 = w.f15767j;
                        return jMax3;
                    }
                    i31 = i22 == 0 ? 0 : 512;
                    i30 = 31;
                    i24 = (i20 << 15) | (i30 << 10) | i31;
                    long jMax4 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
                    int i36 = w.f15767j;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i37 = (i29 | 8388608) >> (1 - i2);
                    if ((i37 & 4096) != 0) {
                        i37 += 8192;
                    }
                    i10 = i37 >> 13;
                    i2 = 0;
                } else {
                    i10 = 0;
                    i2 = 0;
                }
            }
        }
        i11 = i10 | (i27 << 15) | (i2 << 10);
        short s13 = (short) i11;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i12 = iFloatToRawIntBits >>> 31;
        i13 = (iFloatToRawIntBits >>> 23) & 255;
        i14 = iFloatToRawIntBits & 8388607;
        if (i13 == 255) {
            if (i14 != 0) {
                i17 = 512;
            } else {
                i17 = 0;
            }
            i15 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i15 = 49;
                i17 = 0;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                    }
                    short s14 = (short) i18;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i20 = iFloatToRawIntBits2 >>> 31;
                    i21 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i22 = 8388607 & iFloatToRawIntBits2;
                    if (i21 == 255) {
                        i23 = i21 - 112;
                        if (i23 < 31) {
                            if (i23 <= 0) {
                                i31 = i22 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                                } else {
                                    i30 = i23;
                                }
                            } else if (i23 >= -10) {
                                i25 = (i22 | 8388608) >> (1 - i23);
                                if ((i25 & 4096) != 0) {
                                    i25 += 8192;
                                }
                                i30 = 0;
                                i31 = i25 >> 13;
                            } else {
                                i30 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
                        int i38 = w.f15767j;
                        return jMax5;
                    }
                    i31 = i22 == 0 ? 0 : 512;
                    i30 = 31;
                    i24 = (i20 << 15) | (i30 << 10) | i31;
                    long jMax6 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
                    int i39 = w.f15767j;
                    return jMax6;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                    i15 = 0;
                } else {
                    i17 = 0;
                    i15 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i15 << 10);
        short s15 = (short) i18;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i20 = iFloatToRawIntBits2 >>> 31;
        i21 = (iFloatToRawIntBits2 >>> 23) & 255;
        i22 = 8388607 & iFloatToRawIntBits2;
        if (i21 == 255) {
            i23 = i21 - 112;
            if (i23 < 31) {
                if (i23 <= 0) {
                    i31 = i22 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i24 = (((i23 << 10) | i31) + 1) | (i20 << 15);
                    } else {
                        i30 = i23;
                    }
                } else if (i23 >= -10) {
                    i25 = (i22 | 8388608) >> (1 - i23);
                    if ((i25 & 4096) != 0) {
                        i25 += 8192;
                    }
                    i30 = 0;
                    i31 = i25 >> 13;
                } else {
                    i30 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
            int i310 = w.f15767j;
            return jMax7;
        }
        i31 = i22 == 0 ? 0 : 512;
        i30 = 31;
        i24 = (i20 << 15) | (i30 << 10) | i31;
        long jMax8 = ((((long) ((short) i24)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f16417c) & 63);
        int i311 = w.f15767j;
        return jMax8;
    }

    public static final float l(int i2, int i10, float[] fArr, float[] fArr2) {
        int i11 = i2 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final Path.Direction m(int i2) {
        int iE = v.g.e(i2);
        if (iE == 0) {
            return Path.Direction.CCW;
        }
        if (iE == 1) {
            return Path.Direction.CW;
        }
        m0.n.h();
        return null;
    }

    public static final Bitmap n(h hVar) {
        if (hVar instanceof h) {
            return hVar.f15720a;
        }
        d8.m.k("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final long o(long j10, long j11) {
        float f10;
        float f11;
        long jB = w.b(j10, w.g(j11));
        float fE = w.e(j11);
        float fE2 = w.e(jB);
        float f12 = 1.0f - fE2;
        float f13 = (fE * f12) + fE2;
        float fI = w.i(jB);
        float fI2 = w.i(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fI2 * fE) * f12) + (fI * fE2)) / f13;
        }
        float fH = w.h(jB);
        float fH2 = w.h(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fH2 * fE) * f12) + (fH * fE2)) / f13;
        }
        float f15 = w.f(jB);
        float f16 = w.f(j11);
        if (f13 != 0.0f) {
            f14 = (((f16 * fE) * f12) + (f15 * fE2)) / f13;
        }
        return k(f10, f11, f14, f13, w.g(j11));
    }

    public static void p(q1.d dVar, o0 o0Var, long j10) {
        if (o0Var instanceof m0) {
            n1.d dVar2 = ((m0) o0Var).f15735a;
            dVar.z0(j10, a.a.d(dVar2.f15035a, dVar2.b), c.a.a(dVar2.f(), dVar2.c()), 1.0f, 3);
            return;
        }
        boolean z10 = o0Var instanceof n0;
        q1.g gVar = q1.g.f17000a;
        if (!z10) {
            if (o0Var instanceof l0) {
                dVar.e0(((l0) o0Var).f15734a, j10, 1.0f, gVar);
                return;
            } else {
                m0.n.h();
                return;
            }
        }
        n0 n0Var = (n0) o0Var;
        j jVar = n0Var.b;
        if (jVar != null) {
            dVar.e0(jVar, j10, 1.0f, gVar);
            return;
        }
        n1.e eVar = n0Var.f15737a;
        float fB = n1.a.b(eVar.f15044h);
        dVar.j(j10, a.a.d(eVar.f15038a, eVar.b), c.a.a(eVar.b(), eVar.a()), y1.c.a(fB, fB), gVar, 1.0f);
    }

    public static void q(Canvas canvas, boolean z10) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            v.f15752a.a(canvas, z10);
            return;
        }
        if (!f15747d) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f15746c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f15746c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f15746c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f15747d = true;
        }
        if (z10) {
            try {
                Method method4 = b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f15746c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static long r() {
        return w.b;
    }

    public static long s() {
        return w.f15765h;
    }

    public static long t() {
        return w.f15762e;
    }

    public static final long u(long j10, long j11, float f10) {
        p1.l lVar = p1.d.f16435t;
        long jB = w.b(j10, lVar);
        long jB2 = w.b(j11, lVar);
        float fE = w.e(jB);
        float fI = w.i(jB);
        float fH = w.h(jB);
        float f11 = w.f(jB);
        float fE2 = w.e(jB2);
        float fI2 = w.i(jB2);
        float fH2 = w.h(jB2);
        float f12 = w.f(jB2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return w.b(k(c9.v.x(fI, fI2, f10), c9.v.x(fH, fH2, f10), c9.v.x(f11, f12, f10), c9.v.x(fE, fE2, f10), lVar), w.g(j11));
    }

    public static final float v(long j10) {
        p1.c cVarG = w.g(j10);
        if (!p1.b.a(cVarG.b, p1.b.f16412a)) {
            a6.d.r("The specified color must be encoded in an RGB color space. The supplied color space is ", p1.b.b(cVarG.b));
            return 0.0f;
        }
        p1.m mVar = ((p1.r) cVarG).f16474p;
        double d2 = mVar.d(w.i(j10));
        float fD = (float) ((mVar.d(w.f(j10)) * 0.0722d) + (mVar.d(w.h(j10)) * 0.7152d) + (d2 * 0.2126d));
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    public static final float[] w(List list, List list2) {
        if (list == null) {
            return null;
        }
        List list3 = list;
        float[] fArr = new float[list3.size()];
        Iterator it = list3.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = ((Number) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    public static final void x(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final BlendMode z(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }
}
