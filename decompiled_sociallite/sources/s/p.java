package s;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import ke.c1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19206a = f0.f19180a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f19207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19210f;

    public p() {
        int[] iArr = k.f19193a;
        this.b = iArr;
        this.f19207c = iArr;
        f(f0.d(6));
    }

    public final void a() {
        this.f19209e = 0;
        long[] jArr = this.f19206a;
        if (jArr != f0.f19180a) {
            te.j.V(jArr);
            long[] jArr2 = this.f19206a;
            int i2 = this.f19208d;
            int i10 = i2 >> 3;
            long j10 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        this.f19210f = f0.a(this.f19208d) - this.f19209e;
    }

    public final int b(int i2) {
        int i10 = this.f19208d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19206a;
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

    public final int c(int i2) {
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f19208d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f19206a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.b[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int d(int i2) {
        int iC = c(i2);
        if (iC >= 0) {
            return this.f19207c[iC];
        }
        p1.n.o(c1.i("Cannot find value for key ", i2));
        return 0;
    }

    public final int e(int i2) {
        int iC = c(i2);
        if (iC >= 0) {
            return this.f19207c[iC];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0023->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f19209e != this.f19209e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.f19207c;
        long[] jArr = this.f19206a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j10 = jArr[i2];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i2 << 3) + i11;
                            if (iArr2[i12] != pVar.d(iArr[i12])) {
                                return false;
                            }
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
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, f0.c(i2)) : 0;
        this.f19208d = iMax;
        if (iMax == 0) {
            jArr = f0.f19180a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            te.j.V(jArr);
        }
        this.f19206a = jArr;
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f19210f = f0.a(this.f19208d) - this.f19209e;
        this.b = new int[iMax];
        this.f19207c = new int[iMax];
    }

    public final void g(int i2, int i10) {
        long j10;
        int i11;
        long j11;
        int iNumberOfTrailingZeros;
        int[] iArr;
        long j12;
        int i12 = i2;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i12) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & ModuleDescriptor.MODULE_VERSION;
        int i17 = this.f19208d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f19206a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            int i23 = i19;
            long j13 = (((-i21) >> 63) & (jArr[i20 + 1] << (64 - i21))) | (jArr[i20] >>> i21);
            long j14 = i16;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L);
            while (j16 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i18) & i17;
                int i24 = i13;
                if (this.b[iNumberOfTrailingZeros] == i12) {
                    break loop0;
                }
                j16 &= j16 - 1;
                i13 = i24;
            }
            int i25 = i13;
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i15);
                long j17 = 255;
                if (this.f19210f != 0 || ((this.f19206a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    i11 = 1;
                    j11 = 128;
                } else {
                    int i26 = this.f19208d;
                    if (i26 <= 8 || Long.compareUnsigned(((long) this.f19209e) * 32, ((long) i26) * 25) > 0) {
                        j10 = 255;
                        i11 = 1;
                        j11 = 128;
                        int iB2 = f0.b(this.f19208d);
                        long[] jArr2 = this.f19206a;
                        int[] iArr2 = this.b;
                        int[] iArr3 = this.f19207c;
                        int i27 = this.f19208d;
                        f(iB2);
                        int[] iArr4 = this.b;
                        int[] iArr5 = this.f19207c;
                        int i28 = 0;
                        while (i28 < i27) {
                            if (((jArr2[i28 >> 3] >> ((i28 & 7) << 3)) & 255) < 128) {
                                int i29 = iArr2[i28];
                                int iHashCode2 = Integer.hashCode(i29) * i25;
                                int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                int iB3 = b(i30 >>> 7);
                                iArr = iArr4;
                                long j18 = i30 & ModuleDescriptor.MODULE_VERSION;
                                long[] jArr3 = this.f19206a;
                                int i31 = iB3 >> 3;
                                int i32 = (iB3 & 7) << 3;
                                jArr3[i31] = (jArr3[i31] & (~(255 << i32))) | (j18 << i32);
                                int i33 = this.f19208d;
                                int i34 = ((iB3 - 7) & i33) + (i33 & 7);
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                jArr3[i35] = (jArr3[i35] & (~(255 << i36))) | (j18 << i36);
                                iArr[iB3] = i29;
                                iArr5[iB3] = iArr3[i28];
                            } else {
                                iArr = iArr4;
                            }
                            i28++;
                            iArr4 = iArr;
                        }
                    } else {
                        long[] jArr4 = this.f19206a;
                        int i37 = this.f19208d;
                        int i38 = 0;
                        int i39 = 0;
                        while (i38 < i37) {
                            int i40 = i38 >> 3;
                            int i41 = (i38 & 7) << 3;
                            if (((jArr4[i40] >> i41) & j17) == 254) {
                                long[] jArr5 = this.f19206a;
                                j12 = j17;
                                jArr5[i40] = (jArr5[i40] & (~(j12 << i41))) | (128 << i41);
                                int i42 = this.f19208d;
                                int i43 = ((i38 - 7) & i42) + (i42 & 7);
                                int i44 = i43 >> 3;
                                int i45 = (i43 & 7) << 3;
                                jArr5[i44] = (jArr5[i44] & (~(j12 << i45))) | (128 << i45);
                                i39++;
                            } else {
                                j12 = j17;
                            }
                            i38++;
                            i22 = i22;
                            j17 = j12;
                        }
                        j10 = j17;
                        i11 = i22;
                        j11 = 128;
                        this.f19210f += i39;
                    }
                    iB = b(i15);
                }
                this.f19209e++;
                int i46 = this.f19210f;
                long[] jArr6 = this.f19206a;
                int i47 = iB >> 3;
                long j19 = jArr6[i47];
                int i48 = (iB & 7) << 3;
                if (((j19 >> i48) & j10) != j11) {
                    i11 = 0;
                }
                this.f19210f = i46 - i11;
                jArr6[i47] = (j19 & (~(j10 << i48))) | (j14 << i48);
                int i49 = this.f19208d;
                int i50 = ((iB - 7) & i49) + (i49 & 7);
                int i51 = i50 >> 3;
                int i52 = (i50 & 7) << 3;
                jArr6[i51] = (jArr6[i51] & (~(j10 << i52))) | (j14 << i52);
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i12 = i2;
            i13 = i25;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i2;
        this.f19207c[iNumberOfTrailingZeros] = i10;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.f19207c;
        long[] jArr = this.f19206a;
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
                        int i12 = (i2 << 3) + i11;
                        int i13 = iArr[i12];
                        iHashCode += Integer.hashCode(iArr2[i12]) ^ Integer.hashCode(i13);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f19209e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.f19207c;
        long[] jArr = this.f19206a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i2];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i11 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i2 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            sb2.append(i15);
                            i10++;
                            if (i10 < this.f19209e) {
                                sb2.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
