package s;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19241a = f0.f19180a;
    public Object[] b = t.a.f19859c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f19242c = l.f19194a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19245f;

    public y(int i2) {
        if (i2 >= 0) {
            d(f0.d(i2));
        } else {
            w4.d.j("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i2) {
        int i10 = this.f19243d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19241a;
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

    public final int b(Object obj) {
        int i2 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f19243d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f19241a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i12;
                if (kotlin.jvm.internal.l.a(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i13 = i14 + i2;
        }
    }

    public final long c(Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f19242c[iB];
        }
        p1.n.r(obj, " in the map", "There is no key ");
        return 0L;
    }

    public final void d(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, f0.c(i2)) : 0;
        this.f19243d = iMax;
        if (iMax == 0) {
            jArr = f0.f19180a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            te.j.V(jArr);
        }
        this.f19241a = jArr;
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f19245f = f0.a(this.f19243d) - this.f19244e;
        this.b = new Object[iMax];
        this.f19242c = new long[iMax];
    }

    public final void e(long j10, Object obj) {
        long j11;
        int i2;
        long j12;
        int iNumberOfTrailingZeros;
        Object[] objArr;
        long j13;
        Object obj2 = obj;
        int i10 = -862048943;
        int iHashCode = obj2.hashCode() * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & ModuleDescriptor.MODULE_VERSION;
        int i14 = this.f19243d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f19241a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            int i20 = i16;
            long j14 = (((-i18) >> 63) & (jArr[i17 + 1] << (64 - i18))) | (jArr[i17] >>> i18);
            long j15 = i13;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i15) & i14;
                int i21 = i10;
                if (kotlin.jvm.internal.l.a(this.b[iNumberOfTrailingZeros], obj2)) {
                    break loop0;
                }
                j17 &= j17 - 1;
                i10 = i21;
            }
            int i22 = i10;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i12);
                long j18 = 255;
                if (this.f19245f != 0 || ((this.f19241a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    i2 = 1;
                    j12 = 128;
                } else {
                    int i23 = this.f19243d;
                    if (i23 <= 8 || Long.compareUnsigned(((long) this.f19244e) * 32, ((long) i23) * 25) > 0) {
                        j11 = 255;
                        i2 = 1;
                        j12 = 128;
                        int iB = f0.b(this.f19243d);
                        long[] jArr2 = this.f19241a;
                        Object[] objArr2 = this.b;
                        long[] jArr3 = this.f19242c;
                        int i24 = this.f19243d;
                        d(iB);
                        Object[] objArr3 = this.b;
                        long[] jArr4 = this.f19242c;
                        int i25 = 0;
                        while (i25 < i24) {
                            if (((jArr2[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                Object obj3 = objArr2[i25];
                                int iHashCode2 = (obj3 != null ? obj3.hashCode() : 0) * i22;
                                int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                int iA2 = a(i26 >>> 7);
                                objArr = objArr3;
                                long j19 = i26 & ModuleDescriptor.MODULE_VERSION;
                                long[] jArr5 = this.f19241a;
                                int i27 = iA2 >> 3;
                                int i28 = (iA2 & 7) << 3;
                                jArr5[i27] = (jArr5[i27] & (~(255 << i28))) | (j19 << i28);
                                int i29 = this.f19243d;
                                int i30 = ((iA2 - 7) & i29) + (i29 & 7);
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                jArr5[i31] = (jArr5[i31] & (~(255 << i32))) | (j19 << i32);
                                objArr[iA2] = obj3;
                                jArr4[iA2] = jArr3[i25];
                            } else {
                                objArr = objArr3;
                            }
                            i25++;
                            objArr3 = objArr;
                        }
                    } else {
                        long[] jArr6 = this.f19241a;
                        int i33 = this.f19243d;
                        int i34 = 0;
                        int i35 = 0;
                        while (i34 < i33) {
                            int i36 = i34 >> 3;
                            int i37 = (i34 & 7) << 3;
                            if (((jArr6[i36] >> i37) & j18) == 254) {
                                long[] jArr7 = this.f19241a;
                                j13 = j18;
                                jArr7[i36] = (jArr7[i36] & (~(j13 << i37))) | (128 << i37);
                                int i38 = this.f19243d;
                                int i39 = ((i34 - 7) & i38) + (i38 & 7);
                                int i40 = i39 >> 3;
                                int i41 = (i39 & 7) << 3;
                                jArr7[i40] = (jArr7[i40] & (~(j13 << i41))) | (128 << i41);
                                i35++;
                            } else {
                                j13 = j18;
                            }
                            i34++;
                            i19 = i19;
                            j18 = j13;
                        }
                        j11 = j18;
                        i2 = i19;
                        j12 = 128;
                        this.f19245f += i35;
                    }
                    iA = a(i12);
                }
                this.f19244e++;
                int i42 = this.f19245f;
                long[] jArr8 = this.f19241a;
                int i43 = iA >> 3;
                long j20 = jArr8[i43];
                int i44 = (iA & 7) << 3;
                if (((j20 >> i44) & j11) != j12) {
                    i2 = 0;
                }
                this.f19245f = i42 - i2;
                jArr8[i43] = (j20 & (~(j11 << i44))) | (j15 << i44);
                int i45 = this.f19243d;
                int i46 = ((iA - 7) & i45) + (i45 & 7);
                int i47 = i46 >> 3;
                int i48 = (i46 & 7) << 3;
                jArr8[i47] = (jArr8[i47] & (~(j11 << i48))) | (j15 << i48);
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            obj2 = obj;
            i10 = i22;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = obj;
        this.f19242c[iNumberOfTrailingZeros] = j10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[LOOP:0: B:14:0x0023->B:26:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f19244e != this.f19244e) {
            return false;
        }
        Object[] objArr = this.b;
        long[] jArr = this.f19242c;
        long[] jArr2 = this.f19241a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j10 = jArr2[i2];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i2 << 3) + i11;
                            if (jArr[i12] != yVar.c(objArr[i12])) {
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

    public final int hashCode() {
        Object[] objArr = this.b;
        long[] jArr = this.f19242c;
        long[] jArr2 = this.f19241a;
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
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i12]);
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
        if (this.f19244e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.b;
        long[] jArr = this.f19242c;
        long[] jArr2 = this.f19241a;
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
                            Object obj = objArr[i15];
                            i10 = i11;
                            long j11 = jArr[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(j11);
                            i12++;
                            if (i12 < this.f19244e) {
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
