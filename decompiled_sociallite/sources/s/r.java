package s;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19212a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19216f;

    public r(int i2) {
        this.f19212a = f0.f19180a;
        this.b = k.f19193a;
        this.f19213c = t.a.f19859c;
        if (i2 >= 0) {
            g(f0.d(i2));
        } else {
            w4.d.j("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f19215e = 0;
        long[] jArr = this.f19212a;
        if (jArr != f0.f19180a) {
            te.j.V(jArr);
            long[] jArr2 = this.f19212a;
            int i2 = this.f19214d;
            int i10 = i2 >> 3;
            long j10 = 255 << ((i2 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        te.j.U(0, this.f19214d, null, this.f19213c);
        this.f19216f = f0.a(this.f19214d) - this.f19215e;
    }

    public final boolean b(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f19214d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f19212a;
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

    public final boolean c(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f19214d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f19212a;
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
        long j10;
        int i10;
        long j11;
        int[] iArr;
        long j12;
        int i11 = -862048943;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & ModuleDescriptor.MODULE_VERSION;
        int i15 = this.f19214d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f19212a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = 1;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = i14;
            int i21 = i17;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j16) >> 3)) & i15;
                int i22 = i11;
                if (this.b[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i11 = i22;
            }
            int i23 = i11;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j17 = 255;
                if (this.f19216f != 0 || ((this.f19212a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    i10 = 1;
                    j11 = 128;
                } else {
                    int i24 = this.f19214d;
                    if (i24 <= 8 || Long.compareUnsigned(((long) this.f19215e) * 32, ((long) i24) * 25) > 0) {
                        j10 = 255;
                        j11 = 128;
                        int iB = f0.b(this.f19214d);
                        long[] jArr2 = this.f19212a;
                        int[] iArr2 = this.b;
                        Object[] objArr = this.f19213c;
                        int i25 = this.f19214d;
                        g(iB);
                        int[] iArr3 = this.b;
                        Object[] objArr2 = this.f19213c;
                        int i26 = 0;
                        while (i26 < i25) {
                            if (((jArr2[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                int i27 = iArr2[i26];
                                int iHashCode2 = Integer.hashCode(i27) * i23;
                                int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i28 >>> 7);
                                long j18 = i28 & ModuleDescriptor.MODULE_VERSION;
                                long[] jArr3 = this.f19212a;
                                int i29 = iE2 >> 3;
                                int i30 = (iE2 & 7) << 3;
                                iArr = iArr3;
                                jArr3[i29] = (jArr3[i29] & (~(255 << i30))) | (j18 << i30);
                                int i31 = this.f19214d;
                                int i32 = ((iE2 - 7) & i31) + (i31 & 7);
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                jArr3[i33] = (jArr3[i33] & (~(255 << i34))) | (j18 << i34);
                                iArr[iE2] = i27;
                                objArr2[iE2] = objArr[i26];
                            } else {
                                iArr = iArr3;
                            }
                            i26++;
                            i20 = i20;
                            jArr2 = jArr2;
                            iArr3 = iArr;
                        }
                    } else {
                        long[] jArr4 = this.f19212a;
                        int i35 = this.f19214d;
                        int i36 = 0;
                        int i37 = 0;
                        while (i36 < i35) {
                            int i38 = i36 >> 3;
                            int i39 = (i36 & 7) << 3;
                            if (((jArr4[i38] >> i39) & j17) == 254) {
                                long[] jArr5 = this.f19212a;
                                jArr5[i38] = (jArr5[i38] & (~(j17 << i39))) | (128 << i39);
                                int i40 = this.f19214d;
                                int i41 = ((i36 - 7) & i40) + (i40 & 7);
                                int i42 = i41 >> 3;
                                int i43 = (i41 & 7) << 3;
                                j12 = j17;
                                jArr5[i42] = (jArr5[i42] & (~(j12 << i43))) | (128 << i43);
                                i37++;
                            } else {
                                j12 = j17;
                            }
                            i36++;
                            j17 = j12;
                        }
                        j10 = j17;
                        j11 = 128;
                        this.f19216f += i37;
                    }
                    i10 = i20;
                    iE = e(i13);
                }
                this.f19215e += i10;
                int i44 = this.f19216f;
                long[] jArr6 = this.f19212a;
                int i45 = iE >> 3;
                long j19 = jArr6[i45];
                int i46 = (iE & 7) << 3;
                if (((j19 >> i46) & j10) != j11) {
                    i10 = 0;
                }
                this.f19216f = i44 - i10;
                jArr6[i45] = (j19 & (~(j10 << i46))) | (j14 << i46);
                int i47 = this.f19214d;
                int i48 = ((iE - 7) & i47) + (i47 & 7);
                int i49 = i48 >> 3;
                int i50 = (i48 & 7) << 3;
                jArr6[i49] = (jArr6[i49] & (~(j10 << i50))) | (j14 << i50);
                return iE;
            }
            i17 = i21 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i23;
        }
    }

    public final int e(int i2) {
        int i10 = this.f19214d;
        int i11 = i2 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19212a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f19215e != this.f19215e) {
            return false;
        }
        int[] iArr = this.b;
        Object[] objArr = this.f19213c;
        long[] jArr = this.f19212a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j10 = jArr[i2];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            int i12 = (i2 << 3) + i11;
                            int i13 = iArr[i12];
                            Object obj2 = objArr[i12];
                            if (obj2 == null) {
                                if (rVar.f(i13) != null || !rVar.c(i13)) {
                                    return false;
                                }
                            } else if (!obj2.equals(rVar.f(i13))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return true;
    }

    public final Object f(int i2) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f19214d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f19212a;
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f19213c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void g(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, f0.c(i2)) : 0;
        this.f19214d = iMax;
        if (iMax == 0) {
            jArr = f0.f19180a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            te.j.V(jArr);
        }
        this.f19212a = jArr;
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        this.f19216f = f0.a(this.f19214d) - this.f19215e;
        this.b = new int[iMax];
        this.f19213c = new Object[iMax];
    }

    public final void h(int i2, Object obj) {
        int iD = d(i2);
        this.b[iD] = i2;
        this.f19213c[iD] = obj;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.f19213c;
        long[] jArr = this.f19212a;
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
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i13);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f19215e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.b;
        Object[] objArr = this.f19213c;
        long[] jArr = this.f19212a;
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
                            Object obj = objArr[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i10++;
                            if (i10 < this.f19215e) {
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

    public /* synthetic */ r() {
        this(6);
    }
}
