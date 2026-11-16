package g2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends e2.s0 implements u0, e2.k0 {
    public boolean A;
    public final e2.f0 B = new e2.f0(this, 0);
    public s.v C;
    public s.v D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5567z;

    public static void O0(b1 b1Var) {
        f0 f0Var;
        b1 b1Var2 = b1Var.F;
        e0 e0Var = b1Var.E;
        if (!kotlin.jvm.internal.l.a(b1Var2 != null ? b1Var2.E : null, e0Var)) {
            e0Var.Q.f5557r.M.f();
            return;
        }
        a aVarI = e0Var.Q.f5557r.i();
        if (aVarI == null || (f0Var = ((k0) aVarI).M) == null) {
            return;
        }
        f0Var.f();
    }

    @Override // e2.k0
    public final e2.j0 A(int i2, int i10, Map map, hf.c cVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i10) == 0) {
            return new n0(i2, i10, map, cVar, this);
        }
        bb.a.e0("Size(" + i2 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public abstract int B0(e2.n nVar);

    public final void G0(l1 l1Var) {
        long j10;
        char c10;
        long j11;
        long j12;
        p0 p0VarM0;
        j1 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        long[] jArr2;
        long j13;
        long j14;
        int i2;
        int i10;
        int i11;
        if (this.A || l1Var.f5540t.j() == null) {
            return;
        }
        s.v vVar = this.D;
        if (vVar == null) {
            vVar = new s.v();
            this.D = vVar;
        }
        s.v vVar2 = this.C;
        if (vVar2 == null) {
            vVar2 = new s.v();
            this.C = vVar2;
        }
        Object[] objArr2 = vVar2.b;
        float[] fArr2 = vVar2.f19231c;
        long[] jArr3 = vVar2.f19230a;
        int length = jArr3.length - 2;
        long j15 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            c10 = 7;
            j11 = 255;
            while (true) {
                long j16 = jArr3[i13];
                j12 = 128;
                if ((((~j16) << 7) & j16 & j15) != j15) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j16 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            j14 = j15;
                            Object obj = objArr2[i16];
                            float f10 = fArr2[i16];
                            int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                            int i17 = iHashCode ^ (iHashCode << 16);
                            int i18 = i17 >>> 7;
                            int i19 = i17 & ModuleDescriptor.MODULE_VERSION;
                            int i20 = vVar.f19232d;
                            int i21 = i18 & i20;
                            int i22 = 0;
                            while (true) {
                                long[] jArr4 = vVar.f19230a;
                                int i23 = i21 >> 3;
                                int i24 = (i21 & 7) << 3;
                                long j17 = jArr4[i23] >>> i24;
                                long j18 = jArr4[i23 + 1] << (64 - i24);
                                jArr2 = jArr3;
                                long j19 = j17 | (j18 & ((-i24) >> 63));
                                j13 = j16;
                                long j20 = i19;
                                long j21 = j19 ^ (j20 * 72340172838076673L);
                                long j22 = (j21 - 72340172838076673L) & (~j21) & j14;
                                while (j22 != 0) {
                                    int iNumberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j22) >> 3)) & i20;
                                    int i25 = i19;
                                    if (kotlin.jvm.internal.l.a(vVar.b[iNumberOfTrailingZeros], obj)) {
                                        i10 = iNumberOfTrailingZeros;
                                        break;
                                    } else {
                                        j22 &= j22 - 1;
                                        i19 = i25;
                                    }
                                }
                                int i26 = i19;
                                if ((j19 & ((~j19) << 6) & j14) != 0) {
                                    int iB = vVar.b(i18);
                                    if (vVar.f19234f == 0 && ((vVar.f19230a[iB >> 3] >> ((iB & 7) << 3)) & 255) != 254) {
                                        int i27 = vVar.f19232d;
                                        if (i27 <= 8 || Long.compareUnsigned(((long) vVar.f19233e) * 32, ((long) i27) * 25) > 0) {
                                            int iB2 = s.f0.b(vVar.f19232d);
                                            long[] jArr5 = vVar.f19230a;
                                            Object[] objArr3 = vVar.b;
                                            float[] fArr3 = vVar.f19231c;
                                            int i28 = vVar.f19232d;
                                            vVar.d(iB2);
                                            Object[] objArr4 = vVar.b;
                                            float[] fArr4 = vVar.f19231c;
                                            int i29 = 0;
                                            while (i29 < i28) {
                                                if (((jArr5[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                                    Object obj2 = objArr3[i29];
                                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                                    i11 = i29;
                                                    int iB3 = vVar.b(i30 >>> 7);
                                                    long j23 = i30 & ModuleDescriptor.MODULE_VERSION;
                                                    long[] jArr6 = vVar.f19230a;
                                                    int i31 = iB3 >> 3;
                                                    int i32 = (iB3 & 7) << 3;
                                                    jArr6[i31] = (jArr6[i31] & (~(255 << i32))) | (j23 << i32);
                                                    int i33 = vVar.f19232d;
                                                    int i34 = ((iB3 - 7) & i33) + (i33 & 7);
                                                    int i35 = i34 >> 3;
                                                    int i36 = (i34 & 7) << 3;
                                                    jArr6[i35] = (jArr6[i35] & (~(255 << i36))) | (j23 << i36);
                                                    objArr4[iB3] = obj2;
                                                    fArr4[iB3] = fArr3[i11];
                                                } else {
                                                    i11 = i29;
                                                }
                                                i29 = i11 + 1;
                                                jArr5 = jArr5;
                                            }
                                        } else {
                                            long[] jArr7 = vVar.f19230a;
                                            int i37 = 0;
                                            int i38 = 0;
                                            for (int i39 = vVar.f19232d; i37 < i39; i39 = i39) {
                                                int i40 = i37 >> 3;
                                                int i41 = (i37 & 7) << 3;
                                                if (((jArr7[i40] >> i41) & 255) == 254) {
                                                    long[] jArr8 = vVar.f19230a;
                                                    jArr8[i40] = (jArr8[i40] & (~(255 << i41))) | (128 << i41);
                                                    int i42 = vVar.f19232d;
                                                    int i43 = ((i37 - 7) & i42) + (i42 & 7);
                                                    int i44 = i43 >> 3;
                                                    int i45 = (i43 & 7) << 3;
                                                    jArr8[i44] = (jArr8[i44] & (~(255 << i45))) | (128 << i45);
                                                    i38++;
                                                }
                                                i37++;
                                                jArr7 = jArr7;
                                            }
                                            vVar.f19234f += i38;
                                        }
                                        iB = vVar.b(i18);
                                    }
                                    vVar.f19233e++;
                                    int i46 = vVar.f19234f;
                                    long[] jArr9 = vVar.f19230a;
                                    int i47 = iB >> 3;
                                    long j24 = jArr9[i47];
                                    int i48 = (iB & 7) << 3;
                                    vVar.f19234f = i46 - (((j24 >> i48) & 255) != 128 ? 0 : 1);
                                    jArr9[i47] = (j24 & (~(255 << i48))) | (j20 << i48);
                                    int i49 = vVar.f19232d;
                                    int i50 = ((iB - 7) & i49) + (i49 & 7);
                                    int i51 = i50 >> 3;
                                    int i52 = (i50 & 7) << 3;
                                    jArr9[i51] = ((~(255 << i52)) & jArr9[i51]) | (j20 << i52);
                                    i10 = ~iB;
                                    break;
                                }
                                i22 += 8;
                                i21 = (i21 + i22) & i20;
                                jArr3 = jArr2;
                                j16 = j13;
                                i19 = i26;
                            }
                            if (i10 < 0) {
                                i10 = ~i10;
                            }
                            vVar.b[i10] = obj;
                            vVar.f19231c[i10] = f10;
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            j13 = j16;
                            j14 = j15;
                            i2 = i12;
                        }
                        j16 = j13 >> i2;
                        i15++;
                        i12 = i2;
                        fArr2 = fArr2;
                        j15 = j14;
                        objArr2 = objArr2;
                        jArr3 = jArr2;
                    }
                    objArr = objArr2;
                    fArr = fArr2;
                    jArr = jArr3;
                    j10 = j15;
                    if (i14 != i12) {
                        break;
                    }
                } else {
                    objArr = objArr2;
                    fArr = fArr2;
                    jArr = jArr3;
                    j10 = j15;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                fArr2 = fArr;
                j15 = j10;
                objArr2 = objArr;
                jArr3 = jArr;
                i12 = 8;
            }
        } else {
            j10 = -9187201950435737472L;
            c10 = 7;
            j11 = 255;
            j12 = 128;
        }
        vVar2.a();
        h1 h1Var = K0().B;
        if (h1Var != null && (snapshotObserver = ((h2.u) h1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(l1Var, e.f5472v, new bg.d(l1Var, 7, this));
        }
        Object[] objArr5 = vVar2.b;
        long[] jArr10 = vVar2.f19230a;
        int length2 = jArr10.length - 2;
        if (length2 >= 0) {
            int i53 = 0;
            while (true) {
                long j25 = jArr10[i53];
                if ((((~j25) << c10) & j25 & j10) != j10) {
                    int i54 = 8 - ((~(i53 - length2)) >>> 31);
                    for (int i55 = 0; i55 < i54; i55++) {
                        if ((j25 & j11) < j12) {
                            if (objArr5[(i53 << 3) + i55] != null) {
                                d8.m.o();
                                return;
                            }
                            if (vVar.c(null) < 0 && (p0VarM0 = M0()) != null) {
                                do {
                                    s.v vVar3 = p0VarM0.C;
                                    if (vVar3 != null && vVar3.c(null) >= 0) {
                                        break;
                                    } else {
                                        p0VarM0 = p0VarM0.M0();
                                    }
                                } while (p0VarM0 != null);
                            }
                        }
                        j25 >>= 8;
                    }
                    if (i54 == 8) {
                    }
                }
                if (i53 != length2) {
                    i53++;
                }
            }
        }
        vVar.a();
    }

    public abstract p0 H0();

    public abstract e2.r I0();

    public abstract boolean J0();

    public abstract e0 K0();

    public abstract e2.j0 L0();

    public abstract p0 M0();

    public abstract long N0();

    public abstract void P0();

    @Override // g2.u0
    public final void b0(boolean z10) {
        this.f5566y = z10;
    }

    @Override // e2.o
    public boolean d0() {
        return false;
    }

    @Override // e2.s0
    public final int l0(e2.n nVar) {
        int iB0;
        if (J0() && (iB0 = B0(nVar)) != Integer.MIN_VALUE) {
            return iB0 + ((int) (this.f4087x & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }
}
