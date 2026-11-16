package s;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19217a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19220e;

    public s(int i2) {
        this.f19217a = f0.f19180a;
        this.b = k.f19193a;
        if (i2 >= 0) {
            e(f0.d(i2));
        } else {
            w4.d.j("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(int i2) {
        long j10;
        long j11;
        int iNumberOfTrailingZeros;
        int[] iArr;
        long j12;
        int i10 = this.f19219d;
        int i11 = -862048943;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & ModuleDescriptor.MODULE_VERSION;
        int i15 = this.f19218c;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f19217a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = i17;
            long j13 = (((-i19) >> 63) & (jArr[i18 + 1] << (64 - i19))) | (jArr[i18] >>> i19);
            long j14 = i14;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                int i21 = i11;
                if (this.b[iNumberOfTrailingZeros] == i2) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iD = d(i13);
                long j17 = 255;
                if (this.f19220e != 0 || ((this.f19217a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = 128;
                } else {
                    int i23 = this.f19218c;
                    if (i23 <= 8 || Long.compareUnsigned(((long) this.f19219d) * 32, ((long) i23) * 25) > 0) {
                        j10 = 255;
                        j11 = 128;
                        int iB = f0.b(this.f19218c);
                        long[] jArr2 = this.f19217a;
                        int[] iArr2 = this.b;
                        int i24 = this.f19218c;
                        e(iB);
                        int[] iArr3 = this.b;
                        int i25 = 0;
                        while (i25 < i24) {
                            if (((jArr2[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                int i26 = iArr2[i25];
                                int iHashCode2 = Integer.hashCode(i26) * i22;
                                int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                int iD2 = d(i27 >>> 7);
                                iArr = iArr3;
                                long j18 = i27 & ModuleDescriptor.MODULE_VERSION;
                                long[] jArr3 = this.f19217a;
                                int i28 = iD2 >> 3;
                                int i29 = (iD2 & 7) << 3;
                                jArr3[i28] = (jArr3[i28] & (~(255 << i29))) | (j18 << i29);
                                int i30 = this.f19218c;
                                int i31 = ((iD2 - 7) & i30) + (i30 & 7);
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                jArr3[i32] = (jArr3[i32] & (~(255 << i33))) | (j18 << i33);
                                iArr[iD2] = i26;
                            } else {
                                iArr = iArr3;
                            }
                            i25++;
                            jArr2 = jArr2;
                            iArr3 = iArr;
                        }
                    } else {
                        long[] jArr4 = this.f19217a;
                        int i34 = this.f19218c;
                        int i35 = 0;
                        int i36 = 0;
                        while (i35 < i34) {
                            int i37 = i35 >> 3;
                            int i38 = (i35 & 7) << 3;
                            if (((jArr4[i37] >> i38) & j17) == 254) {
                                long[] jArr5 = this.f19217a;
                                j12 = j17;
                                jArr5[i37] = (jArr5[i37] & (~(j12 << i38))) | (128 << i38);
                                int i39 = this.f19218c;
                                int i40 = ((i35 - 7) & i39) + (i39 & 7);
                                int i41 = i40 >> 3;
                                int i42 = (i40 & 7) << 3;
                                jArr5[i41] = ((~(j12 << i42)) & jArr5[i41]) | (128 << i42);
                                i36++;
                            } else {
                                j12 = j17;
                            }
                            i35++;
                            jArr4 = jArr4;
                            i34 = i34;
                            j17 = j12;
                        }
                        j10 = j17;
                        j11 = 128;
                        this.f19220e += i36;
                    }
                    iD = d(i13);
                }
                iNumberOfTrailingZeros = iD;
                this.f19219d++;
                int i43 = this.f19220e;
                long[] jArr6 = this.f19217a;
                int i44 = iNumberOfTrailingZeros >> 3;
                long j19 = jArr6[i44];
                int i45 = (iNumberOfTrailingZeros & 7) << 3;
                this.f19220e = i43 - (((j19 >> i45) & j10) == j11 ? 1 : 0);
                jArr6[i44] = (j19 & (~(j10 << i45))) | (j14 << i45);
                int i46 = this.f19218c;
                int i47 = ((iNumberOfTrailingZeros - 7) & i46) + (i46 & 7);
                int i48 = i47 >> 3;
                int i49 = (i47 & 7) << 3;
                jArr6[i48] = (jArr6[i48] & (~(j10 << i49))) | (j14 << i49);
                break;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i22;
        }
        this.b[iNumberOfTrailingZeros] = i2;
        return this.f19219d != i10;
    }

    public final void b() {
        this.f19219d = 0;
        long[] jArr = this.f19217a;
        if (jArr != f0.f19180a) {
            te.j.V(jArr);
            long[] jArr2 = this.f19217a;
            int i2 = this.f19218c;
            int i10 = i2 >> 3;
            long j10 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        this.f19220e = f0.a(this.f19218c) - this.f19219d;
    }

    public final boolean c(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f19218c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f19217a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.b[iNumberOfTrailingZeros] == i2) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(int i2) {
        int i10 = this.f19218c;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19217a;
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

    public final void e(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, f0.c(i2)) : 0;
        this.f19218c = iMax;
        if (iMax == 0) {
            jArr = f0.f19180a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            te.j.V(jArr);
        }
        this.f19217a = jArr;
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f19220e = f0.a(this.f19218c) - this.f19219d;
        this.b = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.f19219d != this.f19219d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.f19217a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j10 = jArr[i2];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && !sVar.c(iArr[(i2 << 3) + i11])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i10 == 8) {
                        if (i2 != length) {
                            i2++;
                        }
                    }
                } else if (i2 != length) {
                    i2++;
                }
            }
        }
        return true;
    }

    public final void f(int i2) {
        this.f19219d--;
        long[] jArr = this.f19217a;
        int i10 = i2 >> 3;
        int i11 = (i2 & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        int i12 = this.f19218c;
        int i13 = ((i2 - 7) & i12) + (i12 & 7);
        int i14 = i13 >> 3;
        int i15 = (i13 & 7) << 3;
        jArr[i14] = (jArr[i14] & (~(255 << i15))) | (254 << i15);
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.f19217a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i2];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i2 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j10) < 128) {
                        iHashCode = Integer.hashCode(iArr[(i2 << 3) + i11]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.b;
        long[] jArr = this.f19217a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i2 = 0;
        int i10 = 0;
        loop0: while (true) {
            long j10 = jArr[i2];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i2 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = iArr[(i2 << 3) + i12];
                        if (i10 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i10 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(i13);
                        i10++;
                    }
                    j10 >>= 8;
                }
                if (i11 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sb2.append((CharSequence) "]");
                break;
            }
            if (i2 == length) {
                sb2.append((CharSequence) "]");
                break;
            }
            i2++;
        }
        return sb2.toString();
    }

    public /* synthetic */ s() {
        this(6);
    }
}
