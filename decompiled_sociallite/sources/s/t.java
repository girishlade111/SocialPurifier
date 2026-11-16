package s;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19221a;
    public long[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19225f;

    public final int a(int i2) {
        int i10 = this.f19223d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19221a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final Object b(long j10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i10 = i2 & ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f19223d;
        int i12 = (i2 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f19221a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j11 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j12 = (((long) i10) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i12) & i11;
                if (this.b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f19222c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void c(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, f0.c(i2)) : 0;
        this.f19223d = iMax;
        if (iMax == 0) {
            jArr = f0.f19180a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            te.j.V(jArr);
        }
        this.f19221a = jArr;
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f19225f = f0.a(this.f19223d) - this.f19224e;
        this.b = new long[iMax];
        this.f19222c = new Object[iMax];
    }

    public final void d(long j10, x xVar) {
        long j11;
        int i2;
        long j12;
        int iNumberOfTrailingZeros;
        int i10;
        long[] jArr;
        int i11;
        long j13;
        int i12 = -862048943;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & ModuleDescriptor.MODULE_VERSION;
        int i16 = this.f19223d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f19221a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j14 = ((jArr2[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr2[i19] >>> i20);
            long j15 = i15;
            int i22 = i18;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j17) >> 3)) & i16;
                int i23 = i12;
                if (this.b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
                j17 &= j17 - 1;
                i12 = i23;
            }
            int i24 = i12;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int iA = a(i14);
                long j18 = 255;
                if (this.f19225f != 0 || ((this.f19221a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    i2 = 1;
                    j12 = 128;
                } else {
                    int i25 = this.f19223d;
                    if (i25 <= 8 || Long.compareUnsigned(((long) this.f19224e) * 32, ((long) i25) * 25) > 0) {
                        j11 = 255;
                        i10 = 1;
                        j12 = 128;
                        int iB = f0.b(this.f19223d);
                        long[] jArr3 = this.f19221a;
                        long[] jArr4 = this.b;
                        Object[] objArr = this.f19222c;
                        int i26 = this.f19223d;
                        c(iB);
                        long[] jArr5 = this.b;
                        Object[] objArr2 = this.f19222c;
                        int i27 = 0;
                        while (i27 < i26) {
                            if (((jArr3[i27 >> 3] >> ((i27 & 7) << 3)) & 255) < 128) {
                                long j19 = jArr4[i27];
                                int iHashCode2 = Long.hashCode(j19) * i24;
                                int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                int iA2 = a(i28 >>> 7);
                                i11 = i27;
                                long j20 = i28 & ModuleDescriptor.MODULE_VERSION;
                                long[] jArr6 = this.f19221a;
                                int i29 = iA2 >> 3;
                                int i30 = (iA2 & 7) << 3;
                                jArr = jArr5;
                                jArr6[i29] = (jArr6[i29] & (~(255 << i30))) | (j20 << i30);
                                int i31 = this.f19223d;
                                int i32 = ((iA2 - 7) & i31) + (i31 & 7);
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                jArr6[i33] = (jArr6[i33] & (~(255 << i34))) | (j20 << i34);
                                jArr[iA2] = j19;
                                objArr2[iA2] = objArr[i11];
                            } else {
                                jArr = jArr5;
                                i11 = i27;
                            }
                            i27 = i11 + 1;
                            i10 = i10;
                            jArr3 = jArr3;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr7 = this.f19221a;
                        int i35 = this.f19223d;
                        int i36 = 0;
                        int i37 = 0;
                        while (i36 < i35) {
                            int i38 = i36 >> 3;
                            int i39 = (i36 & 7) << 3;
                            if (((jArr7[i38] >> i39) & j18) == 254) {
                                long[] jArr8 = this.f19221a;
                                j13 = j18;
                                jArr8[i38] = (jArr8[i38] & (~(j13 << i39))) | (128 << i39);
                                int i40 = this.f19223d;
                                int i41 = ((i36 - 7) & i40) + (i40 & 7);
                                int i42 = i41 >> 3;
                                int i43 = (i41 & 7) << 3;
                                jArr8[i42] = ((~(j13 << i43)) & jArr8[i42]) | (128 << i43);
                                i37++;
                            } else {
                                j13 = j18;
                            }
                            i36++;
                            i21 = i21;
                            j18 = j13;
                        }
                        j11 = j18;
                        i10 = i21;
                        j12 = 128;
                        this.f19225f += i37;
                    }
                    i2 = i10;
                    iA = a(i14);
                }
                this.f19224e++;
                int i44 = this.f19225f;
                long[] jArr9 = this.f19221a;
                int i45 = iA >> 3;
                long j21 = jArr9[i45];
                int i46 = (iA & 7) << 3;
                if (((j21 >> i46) & j11) != j12) {
                    i2 = 0;
                }
                this.f19225f = i44 - i2;
                jArr9[i45] = (j21 & (~(j11 << i46))) | (j15 << i46);
                int i47 = this.f19223d;
                int i48 = ((iA - 7) & i47) + (i47 & 7);
                int i49 = i48 >> 3;
                int i50 = (i48 & 7) << 3;
                jArr9[i49] = (jArr9[i49] & (~(j11 << i50))) | (j15 << i50);
                iNumberOfTrailingZeros = iA;
                break;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i24;
        }
        this.b[iNumberOfTrailingZeros] = j10;
        this.f19222c[iNumberOfTrailingZeros] = xVar;
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        Object[] objArr;
        boolean z10;
        int i2;
        Object[] objArr2;
        long j10;
        char c10;
        long j11;
        long[] jArr2;
        int i10;
        if (obj != this) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (tVar.f19224e == this.f19224e) {
                    long[] jArr3 = this.b;
                    Object[] objArr3 = this.f19222c;
                    long[] jArr4 = this.f19221a;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j12 = jArr4[i11];
                            char c11 = 7;
                            long j13 = -9187201950435737472L;
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = 0;
                                z10 = true;
                                while (i14 < i13) {
                                    if ((j12 & 255) < 128) {
                                        int i15 = (i11 << 3) + i14;
                                        objArr2 = objArr3;
                                        long j14 = jArr3[i15];
                                        c10 = c11;
                                        Object obj2 = objArr2[i15];
                                        if (obj2 != null) {
                                            i2 = i14;
                                            j10 = j12;
                                            j11 = j13;
                                            jArr2 = jArr3;
                                            if (!obj2.equals(tVar.b(j14))) {
                                                return false;
                                            }
                                        } else {
                                            if (tVar.b(j14) != null) {
                                                return false;
                                            }
                                            int iHashCode = Long.hashCode(j14) * (-862048943);
                                            int i16 = iHashCode ^ (iHashCode << 16);
                                            j11 = j13;
                                            int i17 = i16 & ModuleDescriptor.MODULE_VERSION;
                                            int i18 = tVar.f19223d;
                                            int i19 = (i16 >>> 7) & i18;
                                            int i20 = 0;
                                            while (true) {
                                                long[] jArr5 = tVar.f19221a;
                                                int i21 = i19 >> 3;
                                                int i22 = (i19 & 7) << 3;
                                                long j15 = jArr5[i21] >>> i22;
                                                long j16 = jArr5[i21 + 1] << (64 - i22);
                                                i2 = i14;
                                                jArr2 = jArr3;
                                                long j17 = j15 | (j16 & ((-i22) >> 63));
                                                j10 = j12;
                                                long j18 = (((long) i17) * 72340172838076673L) ^ j17;
                                                for (long j19 = (j18 - 72340172838076673L) & (~j18) & j11; j19 != 0; j19 &= j19 - 1) {
                                                    int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j19) >> 3) + i19) & i18;
                                                    if (tVar.b[iNumberOfTrailingZeros] == j14) {
                                                        i10 = iNumberOfTrailingZeros;
                                                        break;
                                                    }
                                                }
                                                if ((j17 & ((~j17) << 6) & j11) != 0) {
                                                    i10 = -1;
                                                    break;
                                                }
                                                i20 += 8;
                                                i19 = (i19 + i20) & i18;
                                                jArr3 = jArr2;
                                                i14 = i2;
                                                j12 = j10;
                                            }
                                            if (!(i10 >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        i2 = i14;
                                        objArr2 = objArr3;
                                        j10 = j12;
                                        c10 = c11;
                                        j11 = j13;
                                        jArr2 = jArr3;
                                    }
                                    j12 = j10 >> i12;
                                    i14 = i2 + 1;
                                    c11 = c10;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                    j13 = j11;
                                    i12 = i12;
                                }
                                objArr = objArr3;
                                int i23 = i12;
                                jArr = jArr3;
                                if (i13 != i23) {
                                    return true;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                z10 = true;
                            }
                            if (i11 == length) {
                                return z10;
                            }
                            i11++;
                            jArr3 = jArr;
                            objArr3 = objArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.f19222c;
        long[] jArr2 = this.f19221a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i2];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i2 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j10) < 128) {
                        int i12 = (i2 << 3) + i11;
                        long j11 = jArr[i12];
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j11);
                    }
                    j10 >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i2 == length) {
                return iHashCode;
            }
            i2++;
        }
    }

    public final String toString() {
        int i2;
        int i10;
        if (this.f19224e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.f19222c;
        long[] jArr2 = this.f19221a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j11 = jArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(j11);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.f19224e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j10 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i2 = i16;
                } else {
                    i2 = i11;
                }
                if (i2 == length) {
                    break;
                }
                i11 = i2 + 1;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
