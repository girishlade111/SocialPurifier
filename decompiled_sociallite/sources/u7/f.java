package u7;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.credentials.CredentialOption;
import androidx.lifecycle.t;
import androidx.security.crypto.MasterKey;
import b0.f1;
import b0.h2;
import b0.j1;
import b0.k1;
import c0.c0;
import e4.w0;
import h2.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jg.e0;
import ke.c1;
import kotlin.jvm.internal.w;
import o1.b1;
import o1.h0;
import o1.r0;
import o1.y0;
import o4.f0;
import se.a0;
import te.s;
import u.o0;
import v.u;
import v0.h1;
import w0.d0;
import y.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Constructor f21006a;
    public static Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f21007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u1.e f21008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u1.e f21009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static u1.e f21010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static u1.e f21011g;

    public static void A() throws ClassNotFoundException {
        if (f21006a == null || b == null || f21007c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f21006a = cls.getConstructor(null);
            b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f21007c = cls.getMethod("build", null);
        }
    }

    public static final void B(Object[] objArr, int i2, int i10) {
        objArr.getClass();
        while (i2 < i10) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final void C(d0 d0Var, int i2, int i10) {
        int i11 = 1 << i2;
        int i12 = d0Var.D;
        if ((i12 & i11) != 0) {
            v0.d.d0("Already pushed argument ".concat(d0Var.N().b(i2)));
            throw null;
        }
        d0Var.D = i11 | i12;
        d0Var.f22538z[(d0Var.A - d0Var.N().f22534a) + i2] = i10;
    }

    public static final void D(d0 d0Var, int i2, Object obj) {
        int i10 = 1 << i2;
        int i11 = d0Var.E;
        if ((i11 & i10) != 0) {
            v0.d.d0("Already pushed argument ".concat(d0Var.N().c(i2)));
            throw null;
        }
        d0Var.E = i10 | i11;
        d0Var.B[(d0Var.C - d0Var.N().b) + i2] = obj;
    }

    public static h1.q E(h1.q qVar, float f10, y0 y0Var, long j10, long j11, int i2) {
        boolean z10;
        if ((i2 & 2) != 0) {
            y0Var = r0.f15745a;
        }
        y0 y0Var2 = y0Var;
        if ((i2 & 4) != 0) {
            z10 = Float.compare(f10, (float) 0) > 0;
        } else {
            z10 = false;
        }
        if ((i2 & 8) != 0) {
            j10 = h0.f15721a;
        }
        long j12 = j10;
        if ((i2 & 16) != 0) {
            j11 = h0.f15721a;
        }
        return (Float.compare(f10, (float) 0) > 0 || z10) ? qVar.h(new ShadowGraphicsLayerElement(f10, y0Var2, z10, j12, j11)) : qVar;
    }

    public static f5.g F(int i2, i5.n nVar, r4.o oVar) throws f0 {
        f5.g gVarA = f5.g.a(nVar, oVar);
        while (true) {
            int i10 = gVarA.f4914a;
            if (i10 == i2) {
                return gVarA;
            }
            c1.v("Ignoring unknown WAV chunk: ", i10, "WavHeaderReader");
            long j10 = gVarA.b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw f0.b("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            nVar.l((int) j11);
            gVarA = f5.g.a(nVar, oVar);
        }
    }

    public static void G() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void H() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final long a(int i2) {
        long j10 = (((long) i2) << 32) | (((long) 0) & 4294967295L);
        int i10 = y1.a.f23598o;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public static final void b(h1.q qVar, c0 c0Var, j1 j1Var, b0.h hVar, h1.c cVar, n0 n0Var, boolean z10, hf.c cVar2, v0.n nVar, int i2, int i10) {
        int i11;
        c0 c0VarA;
        int i12;
        int i13;
        j1 k1Var;
        int i14;
        int i15;
        b0.h hVar2;
        int i16;
        h1.c cVar3;
        int i17;
        n0 n0Var2;
        int i18;
        int i19;
        boolean z11;
        u uVarA;
        boolean zF;
        Object objO;
        v0.q qVar2;
        j1 j1Var2;
        n0 n0Var3;
        boolean z12;
        h1.c cVar4;
        b0.h hVar3;
        h1 h1VarV;
        v0.q qVar3 = (v0.q) nVar;
        qVar3.b0(-740714857);
        if ((i2 & 6) == 0) {
            i11 = (qVar3.f(qVar) ? 4 : 2) | i2;
        } else {
            i11 = i2;
        }
        if ((i10 & 2) == 0) {
            c0VarA = c0Var;
            int i20 = qVar3.f(c0VarA) ? 32 : 16;
            i12 = i11 | i20;
            i13 = i10 & 4;
            if (i13 != 0) {
                if ((i2 & 384) == 0) {
                    k1Var = j1Var;
                    if (qVar3.f(k1Var)) {
                        i14 = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 3072;
                if ((i2 & 24576) == 0) {
                    if ((i10 & 16) == 0) {
                        hVar2 = hVar;
                        int i21 = qVar3.f(hVar2) ? 16384 : 8192;
                        i15 |= i21;
                    } else {
                        hVar2 = hVar;
                    }
                    i15 |= i21;
                } else {
                    hVar2 = hVar;
                }
                i16 = i10 & 32;
                if (i16 != 0) {
                    if ((196608 & i2) == 0) {
                        cVar3 = cVar;
                        if (qVar3.f(cVar3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i15 |= i17;
                    }
                    if ((i10 & 64) == 0) {
                        n0Var2 = n0Var;
                        int i22 = qVar3.f(n0Var2) ? 1048576 : 524288;
                        int i23 = i15 | i22 | 12582912;
                        if (qVar3.h(cVar2)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i19 = i23 | i18;
                        if ((38347923 & i19) == 38347922 || !qVar3.E()) {
                            qVar3.V();
                            if ((i2 & 1) != 0 || qVar3.C()) {
                                if ((i10 & 2) != 0) {
                                    c0VarA = c0.f0.a(0, qVar3, 3);
                                    i19 &= -113;
                                }
                                if (i13 != 0) {
                                    float f10 = 0;
                                    k1Var = new k1(f10, f10, f10, f10);
                                }
                                if ((i10 & 16) != 0) {
                                    i19 &= -57345;
                                    hVar2 = b0.j.f1460c;
                                }
                                if (i16 != 0) {
                                    cVar3 = h1.b.F;
                                }
                                if ((i10 & 64) != 0) {
                                    uVarA = o0.a(qVar3);
                                    zF = qVar3.f(uVarA);
                                    objO = qVar3.O();
                                    if (zF || objO == v0.m.f21654a) {
                                        objO = new y.l(uVarA);
                                        qVar3.i0(objO);
                                    }
                                    i19 &= -3670017;
                                    n0Var2 = (y.l) objO;
                                }
                                z11 = true;
                            } else {
                                qVar3.T();
                                if ((i10 & 2) != 0) {
                                    i19 &= -113;
                                }
                                if ((i10 & 16) != 0) {
                                    i19 &= -57345;
                                }
                                if ((i10 & 64) != 0) {
                                    i19 &= -3670017;
                                }
                                z11 = z10;
                            }
                            j1 j1Var3 = k1Var;
                            b0.h hVar4 = hVar2;
                            h1.c cVar5 = cVar3;
                            n0 n0Var4 = n0Var2;
                            qVar3.r();
                            qVar2 = qVar3;
                            u8.g.b(qVar, c0VarA, j1Var3, false, true, n0Var4, z11, cVar5, hVar4, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                            j1Var2 = j1Var3;
                            n0Var3 = n0Var4;
                            z12 = z11;
                            cVar4 = cVar5;
                            hVar3 = hVar4;
                        } else {
                            qVar3.T();
                            qVar2 = qVar3;
                            j1Var2 = k1Var;
                            hVar3 = hVar2;
                            cVar4 = cVar3;
                            n0Var3 = n0Var2;
                            z12 = z10;
                        }
                        h1VarV = qVar2.v();
                        if (h1VarV != null) {
                            h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                        }
                    }
                    n0Var2 = n0Var;
                    int i24 = i15 | i22 | 12582912;
                    if (qVar3.h(cVar2)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i19 = i24 | i18;
                    if ((38347923 & i19) == 38347922) {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f11 = 0;
                                k1Var = new k1(f11, f11, f11, f11);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f12 = 0;
                                k1Var = new k1(f12, f12, f12, f12);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var4 = k1Var;
                        b0.h hVar5 = hVar2;
                        h1.c cVar6 = cVar3;
                        n0 n0Var5 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var4, false, true, n0Var5, z11, cVar6, hVar5, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var4;
                        n0Var3 = n0Var5;
                        z12 = z11;
                        cVar4 = cVar6;
                        hVar3 = hVar5;
                    } else {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f13 = 0;
                                k1Var = new k1(f13, f13, f13, f13);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f14 = 0;
                                k1Var = new k1(f14, f14, f14, f14);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var5 = k1Var;
                        b0.h hVar6 = hVar2;
                        h1.c cVar7 = cVar3;
                        n0 n0Var6 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var5, false, true, n0Var6, z11, cVar7, hVar6, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var5;
                        n0Var3 = n0Var6;
                        z12 = z11;
                        cVar4 = cVar7;
                        hVar3 = hVar6;
                    }
                    h1VarV = qVar2.v();
                    if (h1VarV != null) {
                        h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                    }
                }
                i15 |= 196608;
                cVar3 = cVar;
                if ((i10 & 64) == 0) {
                    n0Var2 = n0Var;
                    if (qVar3.f(n0Var2)) {
                    }
                    int i25 = i15 | i22 | 12582912;
                    if (qVar3.h(cVar2)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i19 = i25 | i18;
                    if ((38347923 & i19) == 38347922) {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f15 = 0;
                                k1Var = new k1(f15, f15, f15, f15);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f16 = 0;
                                k1Var = new k1(f16, f16, f16, f16);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var6 = k1Var;
                        b0.h hVar7 = hVar2;
                        h1.c cVar8 = cVar3;
                        n0 n0Var7 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var6, false, true, n0Var7, z11, cVar8, hVar7, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var6;
                        n0Var3 = n0Var7;
                        z12 = z11;
                        cVar4 = cVar8;
                        hVar3 = hVar7;
                    } else {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f17 = 0;
                                k1Var = new k1(f17, f17, f17, f17);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f18 = 0;
                                k1Var = new k1(f18, f18, f18, f18);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var7 = k1Var;
                        b0.h hVar8 = hVar2;
                        h1.c cVar9 = cVar3;
                        n0 n0Var8 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var7, false, true, n0Var8, z11, cVar9, hVar8, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var7;
                        n0Var3 = n0Var8;
                        z12 = z11;
                        cVar4 = cVar9;
                        hVar3 = hVar8;
                    }
                    h1VarV = qVar2.v();
                    if (h1VarV != null) {
                        h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                    }
                }
                n0Var2 = n0Var;
                int i26 = i15 | i22 | 12582912;
                if (qVar3.h(cVar2)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i19 = i26 | i18;
                if ((38347923 & i19) == 38347922) {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f19 = 0;
                            k1Var = new k1(f19, f19, f19, f19);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f110 = 0;
                            k1Var = new k1(f110, f110, f110, f110);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var8 = k1Var;
                    b0.h hVar9 = hVar2;
                    h1.c cVar10 = cVar3;
                    n0 n0Var9 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var8, false, true, n0Var9, z11, cVar10, hVar9, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var8;
                    n0Var3 = n0Var9;
                    z12 = z11;
                    cVar4 = cVar10;
                    hVar3 = hVar9;
                } else {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f111 = 0;
                            k1Var = new k1(f111, f111, f111, f111);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f112 = 0;
                            k1Var = new k1(f112, f112, f112, f112);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var9 = k1Var;
                    b0.h hVar10 = hVar2;
                    h1.c cVar11 = cVar3;
                    n0 n0Var10 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var9, false, true, n0Var10, z11, cVar11, hVar10, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var9;
                    n0Var3 = n0Var10;
                    z12 = z11;
                    cVar4 = cVar11;
                    hVar3 = hVar10;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                }
            }
            i12 |= 384;
            k1Var = j1Var;
            i15 = i12 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    hVar2 = hVar;
                    if (qVar3.f(hVar2)) {
                    }
                    i15 |= i21;
                } else {
                    hVar2 = hVar;
                }
                i15 |= i21;
            } else {
                hVar2 = hVar;
            }
            i16 = i10 & 32;
            if (i16 != 0) {
                if ((196608 & i2) == 0) {
                    cVar3 = cVar;
                    if (qVar3.f(cVar3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                }
                if ((i10 & 64) == 0) {
                    n0Var2 = n0Var;
                    if (qVar3.f(n0Var2)) {
                    }
                    int i27 = i15 | i22 | 12582912;
                    if (qVar3.h(cVar2)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i19 = i27 | i18;
                    if ((38347923 & i19) == 38347922) {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f113 = 0;
                                k1Var = new k1(f113, f113, f113, f113);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f114 = 0;
                                k1Var = new k1(f114, f114, f114, f114);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var10 = k1Var;
                        b0.h hVar11 = hVar2;
                        h1.c cVar12 = cVar3;
                        n0 n0Var11 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var10, false, true, n0Var11, z11, cVar12, hVar11, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var10;
                        n0Var3 = n0Var11;
                        z12 = z11;
                        cVar4 = cVar12;
                        hVar3 = hVar11;
                    } else {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f115 = 0;
                                k1Var = new k1(f115, f115, f115, f115);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f116 = 0;
                                k1Var = new k1(f116, f116, f116, f116);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var11 = k1Var;
                        b0.h hVar12 = hVar2;
                        h1.c cVar13 = cVar3;
                        n0 n0Var12 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var11, false, true, n0Var12, z11, cVar13, hVar12, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var11;
                        n0Var3 = n0Var12;
                        z12 = z11;
                        cVar4 = cVar13;
                        hVar3 = hVar12;
                    }
                    h1VarV = qVar2.v();
                    if (h1VarV != null) {
                        h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                    }
                }
                n0Var2 = n0Var;
                int i28 = i15 | i22 | 12582912;
                if (qVar3.h(cVar2)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i19 = i28 | i18;
                if ((38347923 & i19) == 38347922) {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f117 = 0;
                            k1Var = new k1(f117, f117, f117, f117);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f118 = 0;
                            k1Var = new k1(f118, f118, f118, f118);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var12 = k1Var;
                    b0.h hVar13 = hVar2;
                    h1.c cVar14 = cVar3;
                    n0 n0Var13 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var12, false, true, n0Var13, z11, cVar14, hVar13, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var12;
                    n0Var3 = n0Var13;
                    z12 = z11;
                    cVar4 = cVar14;
                    hVar3 = hVar13;
                } else {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f119 = 0;
                            k1Var = new k1(f119, f119, f119, f119);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f1110 = 0;
                            k1Var = new k1(f1110, f1110, f1110, f1110);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var13 = k1Var;
                    b0.h hVar14 = hVar2;
                    h1.c cVar15 = cVar3;
                    n0 n0Var14 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var13, false, true, n0Var14, z11, cVar15, hVar14, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var13;
                    n0Var3 = n0Var14;
                    z12 = z11;
                    cVar4 = cVar15;
                    hVar3 = hVar14;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                }
            }
            i15 |= 196608;
            cVar3 = cVar;
            if ((i10 & 64) == 0) {
                n0Var2 = n0Var;
                if (qVar3.f(n0Var2)) {
                }
                int i29 = i15 | i22 | 12582912;
                if (qVar3.h(cVar2)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i19 = i29 | i18;
                if ((38347923 & i19) == 38347922) {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f1111 = 0;
                            k1Var = new k1(f1111, f1111, f1111, f1111);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f1112 = 0;
                            k1Var = new k1(f1112, f1112, f1112, f1112);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var14 = k1Var;
                    b0.h hVar15 = hVar2;
                    h1.c cVar16 = cVar3;
                    n0 n0Var15 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var14, false, true, n0Var15, z11, cVar16, hVar15, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var14;
                    n0Var3 = n0Var15;
                    z12 = z11;
                    cVar4 = cVar16;
                    hVar3 = hVar15;
                } else {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f1113 = 0;
                            k1Var = new k1(f1113, f1113, f1113, f1113);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f1114 = 0;
                            k1Var = new k1(f1114, f1114, f1114, f1114);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var15 = k1Var;
                    b0.h hVar16 = hVar2;
                    h1.c cVar17 = cVar3;
                    n0 n0Var16 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var15, false, true, n0Var16, z11, cVar17, hVar16, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var15;
                    n0Var3 = n0Var16;
                    z12 = z11;
                    cVar4 = cVar17;
                    hVar3 = hVar16;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                }
            }
            n0Var2 = n0Var;
            int i210 = i15 | i22 | 12582912;
            if (qVar3.h(cVar2)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i19 = i210 | i18;
            if ((38347923 & i19) == 38347922) {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1115 = 0;
                        k1Var = new k1(f1115, f1115, f1115, f1115);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1116 = 0;
                        k1Var = new k1(f1116, f1116, f1116, f1116);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var16 = k1Var;
                b0.h hVar17 = hVar2;
                h1.c cVar18 = cVar3;
                n0 n0Var17 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var16, false, true, n0Var17, z11, cVar18, hVar17, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var16;
                n0Var3 = n0Var17;
                z12 = z11;
                cVar4 = cVar18;
                hVar3 = hVar17;
            } else {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1117 = 0;
                        k1Var = new k1(f1117, f1117, f1117, f1117);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1118 = 0;
                        k1Var = new k1(f1118, f1118, f1118, f1118);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var17 = k1Var;
                b0.h hVar18 = hVar2;
                h1.c cVar19 = cVar3;
                n0 n0Var18 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var17, false, true, n0Var18, z11, cVar19, hVar18, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var17;
                n0Var3 = n0Var18;
                z12 = z11;
                cVar4 = cVar19;
                hVar3 = hVar18;
            }
            h1VarV = qVar2.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
            }
        }
        c0VarA = c0Var;
        i12 = i11 | i20;
        i13 = i10 & 4;
        if (i13 != 0) {
            if ((i2 & 384) == 0) {
                k1Var = j1Var;
                if (qVar3.f(k1Var)) {
                    i14 = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i12 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i10 & 16) == 0) {
                    hVar2 = hVar;
                    if (qVar3.f(hVar2)) {
                    }
                    i15 |= i21;
                } else {
                    hVar2 = hVar;
                }
                i15 |= i21;
            } else {
                hVar2 = hVar;
            }
            i16 = i10 & 32;
            if (i16 != 0) {
                if ((196608 & i2) == 0) {
                    cVar3 = cVar;
                    if (qVar3.f(cVar3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                }
                if ((i10 & 64) == 0) {
                    n0Var2 = n0Var;
                    if (qVar3.f(n0Var2)) {
                    }
                    int i211 = i15 | i22 | 12582912;
                    if (qVar3.h(cVar2)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i19 = i211 | i18;
                    if ((38347923 & i19) == 38347922) {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f1119 = 0;
                                k1Var = new k1(f1119, f1119, f1119, f1119);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f11110 = 0;
                                k1Var = new k1(f11110, f11110, f11110, f11110);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var18 = k1Var;
                        b0.h hVar19 = hVar2;
                        h1.c cVar110 = cVar3;
                        n0 n0Var19 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var18, false, true, n0Var19, z11, cVar110, hVar19, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var18;
                        n0Var3 = n0Var19;
                        z12 = z11;
                        cVar4 = cVar110;
                        hVar3 = hVar19;
                    } else {
                        qVar3.V();
                        if ((i2 & 1) != 0) {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f11111 = 0;
                                k1Var = new k1(f11111, f11111, f11111, f11111);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        } else {
                            if ((i10 & 2) != 0) {
                                c0VarA = c0.f0.a(0, qVar3, 3);
                                i19 &= -113;
                            }
                            if (i13 != 0) {
                                float f11112 = 0;
                                k1Var = new k1(f11112, f11112, f11112, f11112);
                            }
                            if ((i10 & 16) != 0) {
                                i19 &= -57345;
                                hVar2 = b0.j.f1460c;
                            }
                            if (i16 != 0) {
                                cVar3 = h1.b.F;
                            }
                            if ((i10 & 64) != 0) {
                                uVarA = o0.a(qVar3);
                                zF = qVar3.f(uVarA);
                                objO = qVar3.O();
                                if (zF) {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                } else {
                                    objO = new y.l(uVarA);
                                    qVar3.i0(objO);
                                }
                                i19 &= -3670017;
                                n0Var2 = (y.l) objO;
                            }
                            z11 = true;
                        }
                        j1 j1Var19 = k1Var;
                        b0.h hVar110 = hVar2;
                        h1.c cVar111 = cVar3;
                        n0 n0Var110 = n0Var2;
                        qVar3.r();
                        qVar2 = qVar3;
                        u8.g.b(qVar, c0VarA, j1Var19, false, true, n0Var110, z11, cVar111, hVar110, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                        j1Var2 = j1Var19;
                        n0Var3 = n0Var110;
                        z12 = z11;
                        cVar4 = cVar111;
                        hVar3 = hVar110;
                    }
                    h1VarV = qVar2.v();
                    if (h1VarV != null) {
                        h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                    }
                }
                n0Var2 = n0Var;
                int i212 = i15 | i22 | 12582912;
                if (qVar3.h(cVar2)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i19 = i212 | i18;
                if ((38347923 & i19) == 38347922) {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11113 = 0;
                            k1Var = new k1(f11113, f11113, f11113, f11113);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11114 = 0;
                            k1Var = new k1(f11114, f11114, f11114, f11114);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var110 = k1Var;
                    b0.h hVar111 = hVar2;
                    h1.c cVar112 = cVar3;
                    n0 n0Var111 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var110, false, true, n0Var111, z11, cVar112, hVar111, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var110;
                    n0Var3 = n0Var111;
                    z12 = z11;
                    cVar4 = cVar112;
                    hVar3 = hVar111;
                } else {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11115 = 0;
                            k1Var = new k1(f11115, f11115, f11115, f11115);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11116 = 0;
                            k1Var = new k1(f11116, f11116, f11116, f11116);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var111 = k1Var;
                    b0.h hVar112 = hVar2;
                    h1.c cVar113 = cVar3;
                    n0 n0Var112 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var111, false, true, n0Var112, z11, cVar113, hVar112, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var111;
                    n0Var3 = n0Var112;
                    z12 = z11;
                    cVar4 = cVar113;
                    hVar3 = hVar112;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                }
            }
            i15 |= 196608;
            cVar3 = cVar;
            if ((i10 & 64) == 0) {
                n0Var2 = n0Var;
                if (qVar3.f(n0Var2)) {
                }
                int i213 = i15 | i22 | 12582912;
                if (qVar3.h(cVar2)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i19 = i213 | i18;
                if ((38347923 & i19) == 38347922) {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11117 = 0;
                            k1Var = new k1(f11117, f11117, f11117, f11117);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11118 = 0;
                            k1Var = new k1(f11118, f11118, f11118, f11118);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var112 = k1Var;
                    b0.h hVar113 = hVar2;
                    h1.c cVar114 = cVar3;
                    n0 n0Var113 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var112, false, true, n0Var113, z11, cVar114, hVar113, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var112;
                    n0Var3 = n0Var113;
                    z12 = z11;
                    cVar4 = cVar114;
                    hVar3 = hVar113;
                } else {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f11119 = 0;
                            k1Var = new k1(f11119, f11119, f11119, f11119);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f111110 = 0;
                            k1Var = new k1(f111110, f111110, f111110, f111110);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var113 = k1Var;
                    b0.h hVar114 = hVar2;
                    h1.c cVar115 = cVar3;
                    n0 n0Var114 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var113, false, true, n0Var114, z11, cVar115, hVar114, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var113;
                    n0Var3 = n0Var114;
                    z12 = z11;
                    cVar4 = cVar115;
                    hVar3 = hVar114;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                }
            }
            n0Var2 = n0Var;
            int i214 = i15 | i22 | 12582912;
            if (qVar3.h(cVar2)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i19 = i214 | i18;
            if ((38347923 & i19) == 38347922) {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f111111 = 0;
                        k1Var = new k1(f111111, f111111, f111111, f111111);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f111112 = 0;
                        k1Var = new k1(f111112, f111112, f111112, f111112);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var114 = k1Var;
                b0.h hVar115 = hVar2;
                h1.c cVar116 = cVar3;
                n0 n0Var115 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var114, false, true, n0Var115, z11, cVar116, hVar115, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var114;
                n0Var3 = n0Var115;
                z12 = z11;
                cVar4 = cVar116;
                hVar3 = hVar115;
            } else {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f111113 = 0;
                        k1Var = new k1(f111113, f111113, f111113, f111113);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f111114 = 0;
                        k1Var = new k1(f111114, f111114, f111114, f111114);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var115 = k1Var;
                b0.h hVar116 = hVar2;
                h1.c cVar117 = cVar3;
                n0 n0Var116 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var115, false, true, n0Var116, z11, cVar117, hVar116, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var115;
                n0Var3 = n0Var116;
                z12 = z11;
                cVar4 = cVar117;
                hVar3 = hVar116;
            }
            h1VarV = qVar2.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
            }
        }
        i12 |= 384;
        k1Var = j1Var;
        i15 = i12 | 3072;
        if ((i2 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                hVar2 = hVar;
                if (qVar3.f(hVar2)) {
                }
                i15 |= i21;
            } else {
                hVar2 = hVar;
            }
            i15 |= i21;
        } else {
            hVar2 = hVar;
        }
        i16 = i10 & 32;
        if (i16 != 0) {
            if ((196608 & i2) == 0) {
                cVar3 = cVar;
                if (qVar3.f(cVar3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i15 |= i17;
            }
            if ((i10 & 64) == 0) {
                n0Var2 = n0Var;
                if (qVar3.f(n0Var2)) {
                }
                int i215 = i15 | i22 | 12582912;
                if (qVar3.h(cVar2)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i19 = i215 | i18;
                if ((38347923 & i19) == 38347922) {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f111115 = 0;
                            k1Var = new k1(f111115, f111115, f111115, f111115);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f111116 = 0;
                            k1Var = new k1(f111116, f111116, f111116, f111116);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var116 = k1Var;
                    b0.h hVar117 = hVar2;
                    h1.c cVar118 = cVar3;
                    n0 n0Var117 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var116, false, true, n0Var117, z11, cVar118, hVar117, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var116;
                    n0Var3 = n0Var117;
                    z12 = z11;
                    cVar4 = cVar118;
                    hVar3 = hVar117;
                } else {
                    qVar3.V();
                    if ((i2 & 1) != 0) {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f111117 = 0;
                            k1Var = new k1(f111117, f111117, f111117, f111117);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    } else {
                        if ((i10 & 2) != 0) {
                            c0VarA = c0.f0.a(0, qVar3, 3);
                            i19 &= -113;
                        }
                        if (i13 != 0) {
                            float f111118 = 0;
                            k1Var = new k1(f111118, f111118, f111118, f111118);
                        }
                        if ((i10 & 16) != 0) {
                            i19 &= -57345;
                            hVar2 = b0.j.f1460c;
                        }
                        if (i16 != 0) {
                            cVar3 = h1.b.F;
                        }
                        if ((i10 & 64) != 0) {
                            uVarA = o0.a(qVar3);
                            zF = qVar3.f(uVarA);
                            objO = qVar3.O();
                            if (zF) {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            } else {
                                objO = new y.l(uVarA);
                                qVar3.i0(objO);
                            }
                            i19 &= -3670017;
                            n0Var2 = (y.l) objO;
                        }
                        z11 = true;
                    }
                    j1 j1Var117 = k1Var;
                    b0.h hVar118 = hVar2;
                    h1.c cVar119 = cVar3;
                    n0 n0Var118 = n0Var2;
                    qVar3.r();
                    qVar2 = qVar3;
                    u8.g.b(qVar, c0VarA, j1Var117, false, true, n0Var118, z11, cVar119, hVar118, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                    j1Var2 = j1Var117;
                    n0Var3 = n0Var118;
                    z12 = z11;
                    cVar4 = cVar119;
                    hVar3 = hVar118;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
                }
            }
            n0Var2 = n0Var;
            int i216 = i15 | i22 | 12582912;
            if (qVar3.h(cVar2)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i19 = i216 | i18;
            if ((38347923 & i19) == 38347922) {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f111119 = 0;
                        k1Var = new k1(f111119, f111119, f111119, f111119);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111110 = 0;
                        k1Var = new k1(f1111110, f1111110, f1111110, f1111110);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var118 = k1Var;
                b0.h hVar119 = hVar2;
                h1.c cVar1110 = cVar3;
                n0 n0Var119 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var118, false, true, n0Var119, z11, cVar1110, hVar119, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var118;
                n0Var3 = n0Var119;
                z12 = z11;
                cVar4 = cVar1110;
                hVar3 = hVar119;
            } else {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111111 = 0;
                        k1Var = new k1(f1111111, f1111111, f1111111, f1111111);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111112 = 0;
                        k1Var = new k1(f1111112, f1111112, f1111112, f1111112);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var119 = k1Var;
                b0.h hVar1110 = hVar2;
                h1.c cVar1111 = cVar3;
                n0 n0Var1110 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var119, false, true, n0Var1110, z11, cVar1111, hVar1110, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var119;
                n0Var3 = n0Var1110;
                z12 = z11;
                cVar4 = cVar1111;
                hVar3 = hVar1110;
            }
            h1VarV = qVar2.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
            }
        }
        i15 |= 196608;
        cVar3 = cVar;
        if ((i10 & 64) == 0) {
            n0Var2 = n0Var;
            if (qVar3.f(n0Var2)) {
            }
            int i217 = i15 | i22 | 12582912;
            if (qVar3.h(cVar2)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i19 = i217 | i18;
            if ((38347923 & i19) == 38347922) {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111113 = 0;
                        k1Var = new k1(f1111113, f1111113, f1111113, f1111113);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111114 = 0;
                        k1Var = new k1(f1111114, f1111114, f1111114, f1111114);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var1110 = k1Var;
                b0.h hVar1111 = hVar2;
                h1.c cVar1112 = cVar3;
                n0 n0Var1111 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var1110, false, true, n0Var1111, z11, cVar1112, hVar1111, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var1110;
                n0Var3 = n0Var1111;
                z12 = z11;
                cVar4 = cVar1112;
                hVar3 = hVar1111;
            } else {
                qVar3.V();
                if ((i2 & 1) != 0) {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111115 = 0;
                        k1Var = new k1(f1111115, f1111115, f1111115, f1111115);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                } else {
                    if ((i10 & 2) != 0) {
                        c0VarA = c0.f0.a(0, qVar3, 3);
                        i19 &= -113;
                    }
                    if (i13 != 0) {
                        float f1111116 = 0;
                        k1Var = new k1(f1111116, f1111116, f1111116, f1111116);
                    }
                    if ((i10 & 16) != 0) {
                        i19 &= -57345;
                        hVar2 = b0.j.f1460c;
                    }
                    if (i16 != 0) {
                        cVar3 = h1.b.F;
                    }
                    if ((i10 & 64) != 0) {
                        uVarA = o0.a(qVar3);
                        zF = qVar3.f(uVarA);
                        objO = qVar3.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar3.i0(objO);
                        }
                        i19 &= -3670017;
                        n0Var2 = (y.l) objO;
                    }
                    z11 = true;
                }
                j1 j1Var1111 = k1Var;
                b0.h hVar1112 = hVar2;
                h1.c cVar1113 = cVar3;
                n0 n0Var1112 = n0Var2;
                qVar3.r();
                qVar2 = qVar3;
                u8.g.b(qVar, c0VarA, j1Var1111, false, true, n0Var1112, z11, cVar1113, hVar1112, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
                j1Var2 = j1Var1111;
                n0Var3 = n0Var1112;
                z12 = z11;
                cVar4 = cVar1113;
                hVar3 = hVar1112;
            }
            h1VarV = qVar2.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
            }
        }
        n0Var2 = n0Var;
        int i218 = i15 | i22 | 12582912;
        if (qVar3.h(cVar2)) {
            i18 = 67108864;
        } else {
            i18 = 33554432;
        }
        i19 = i218 | i18;
        if ((38347923 & i19) == 38347922) {
            qVar3.V();
            if ((i2 & 1) != 0) {
                if ((i10 & 2) != 0) {
                    c0VarA = c0.f0.a(0, qVar3, 3);
                    i19 &= -113;
                }
                if (i13 != 0) {
                    float f1111117 = 0;
                    k1Var = new k1(f1111117, f1111117, f1111117, f1111117);
                }
                if ((i10 & 16) != 0) {
                    i19 &= -57345;
                    hVar2 = b0.j.f1460c;
                }
                if (i16 != 0) {
                    cVar3 = h1.b.F;
                }
                if ((i10 & 64) != 0) {
                    uVarA = o0.a(qVar3);
                    zF = qVar3.f(uVarA);
                    objO = qVar3.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    }
                    i19 &= -3670017;
                    n0Var2 = (y.l) objO;
                }
                z11 = true;
            } else {
                if ((i10 & 2) != 0) {
                    c0VarA = c0.f0.a(0, qVar3, 3);
                    i19 &= -113;
                }
                if (i13 != 0) {
                    float f1111118 = 0;
                    k1Var = new k1(f1111118, f1111118, f1111118, f1111118);
                }
                if ((i10 & 16) != 0) {
                    i19 &= -57345;
                    hVar2 = b0.j.f1460c;
                }
                if (i16 != 0) {
                    cVar3 = h1.b.F;
                }
                if ((i10 & 64) != 0) {
                    uVarA = o0.a(qVar3);
                    zF = qVar3.f(uVarA);
                    objO = qVar3.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    }
                    i19 &= -3670017;
                    n0Var2 = (y.l) objO;
                }
                z11 = true;
            }
            j1 j1Var1112 = k1Var;
            b0.h hVar1113 = hVar2;
            h1.c cVar1114 = cVar3;
            n0 n0Var1113 = n0Var2;
            qVar3.r();
            qVar2 = qVar3;
            u8.g.b(qVar, c0VarA, j1Var1112, false, true, n0Var1113, z11, cVar1114, hVar1113, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
            j1Var2 = j1Var1112;
            n0Var3 = n0Var1113;
            z12 = z11;
            cVar4 = cVar1114;
            hVar3 = hVar1113;
        } else {
            qVar3.V();
            if ((i2 & 1) != 0) {
                if ((i10 & 2) != 0) {
                    c0VarA = c0.f0.a(0, qVar3, 3);
                    i19 &= -113;
                }
                if (i13 != 0) {
                    float f1111119 = 0;
                    k1Var = new k1(f1111119, f1111119, f1111119, f1111119);
                }
                if ((i10 & 16) != 0) {
                    i19 &= -57345;
                    hVar2 = b0.j.f1460c;
                }
                if (i16 != 0) {
                    cVar3 = h1.b.F;
                }
                if ((i10 & 64) != 0) {
                    uVarA = o0.a(qVar3);
                    zF = qVar3.f(uVarA);
                    objO = qVar3.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    }
                    i19 &= -3670017;
                    n0Var2 = (y.l) objO;
                }
                z11 = true;
            } else {
                if ((i10 & 2) != 0) {
                    c0VarA = c0.f0.a(0, qVar3, 3);
                    i19 &= -113;
                }
                if (i13 != 0) {
                    float f11111110 = 0;
                    k1Var = new k1(f11111110, f11111110, f11111110, f11111110);
                }
                if ((i10 & 16) != 0) {
                    i19 &= -57345;
                    hVar2 = b0.j.f1460c;
                }
                if (i16 != 0) {
                    cVar3 = h1.b.F;
                }
                if ((i10 & 64) != 0) {
                    uVarA = o0.a(qVar3);
                    zF = qVar3.f(uVarA);
                    objO = qVar3.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar3.i0(objO);
                    }
                    i19 &= -3670017;
                    n0Var2 = (y.l) objO;
                }
                z11 = true;
            }
            j1 j1Var1113 = k1Var;
            b0.h hVar1114 = hVar2;
            h1.c cVar1115 = cVar3;
            n0 n0Var1114 = n0Var2;
            qVar3.r();
            qVar2 = qVar3;
            u8.g.b(qVar, c0VarA, j1Var1113, false, true, n0Var1114, z11, cVar1115, hVar1114, null, null, cVar2, qVar2, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | 3072 | ((i19 >> 3) & 458752) | 1572864 | ((i19 << 9) & 234881024) | ((i19 << 15) & 1879048192), (i19 >> 18) & 896, 3200);
            j1Var2 = j1Var1113;
            n0Var3 = n0Var1114;
            z12 = z11;
            cVar4 = cVar1115;
            hVar3 = hVar1114;
        }
        h1VarV = qVar2.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new c0.b(qVar, c0VarA, j1Var2, hVar3, cVar4, n0Var3, z12, cVar2, i2, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void c(h1.q qVar, c0 c0Var, j1 j1Var, boolean z10, b0.f fVar, h1.h hVar, n0 n0Var, boolean z11, hf.c cVar, v0.n nVar, int i2, int i10) {
        h1.q qVar2;
        int i11;
        c0 c0VarA;
        int i12;
        int i13;
        j1 j1Var2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        h1.q qVar3;
        j1 k1Var;
        u uVarA;
        boolean zF;
        Object objO;
        h1.q qVar4;
        h1.h hVar2;
        int i19;
        j1 j1Var3;
        n0 n0Var2;
        boolean z13;
        v0.q qVar5;
        h1.q qVar6;
        c0 c0Var2;
        j1 j1Var4;
        boolean z14;
        n0 n0Var3;
        boolean z15;
        h1.h hVar3;
        h1 h1VarV;
        v0.q qVar7 = (v0.q) nVar;
        qVar7.b0(-1724297413);
        int i20 = i10 & 1;
        if (i20 != 0) {
            i11 = i2 | 6;
            qVar2 = qVar;
        } else if ((i2 & 6) == 0) {
            qVar2 = qVar;
            i11 = (qVar7.f(qVar2) ? 4 : 2) | i2;
        } else {
            qVar2 = qVar;
            i11 = i2;
        }
        if ((i10 & 2) == 0) {
            c0VarA = c0Var;
            int i21 = qVar7.f(c0VarA) ? 32 : 16;
            i12 = i11 | i21;
            i13 = i10 & 4;
            if (i13 != 0) {
                if ((i2 & 384) == 0) {
                    j1Var2 = j1Var;
                    if (qVar7.f(j1Var2)) {
                        i14 = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i10 & 8;
                if (i15 != 0) {
                    if ((i2 & 3072) == 0) {
                        z12 = z10;
                        if (qVar7.g(z12)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    int i22 = i12 | 13303808;
                    if (qVar7.h(cVar)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i18 = i22 | i17;
                    if ((38347923 & i18) == 38347922 || !qVar7.E()) {
                        qVar7.V();
                        if ((i2 & 1) != 0 || qVar7.C()) {
                            if (i20 != 0) {
                                qVar3 = h1.n.f7355t;
                            } else {
                                qVar3 = qVar2;
                            }
                            if ((i10 & 2) != 0) {
                                i18 &= -113;
                                c0VarA = c0.f0.a(0, qVar7, 3);
                            }
                            if (i13 != 0) {
                                float f10 = 0;
                                k1Var = new k1(f10, f10, f10, f10);
                            } else {
                                k1Var = j1Var2;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            h1.h hVar4 = h1.b.C;
                            uVarA = o0.a(qVar7);
                            zF = qVar7.f(uVarA);
                            objO = qVar7.O();
                            if (zF || objO == v0.m.f21654a) {
                                objO = new y.l(uVarA);
                                qVar7.i0(objO);
                            }
                            y.l lVar = (y.l) objO;
                            qVar4 = qVar3;
                            hVar2 = hVar4;
                            i19 = i18 & (-3670017);
                            j1Var3 = k1Var;
                            n0Var2 = lVar;
                            z13 = true;
                        } else {
                            qVar7.T();
                            if ((i10 & 2) != 0) {
                                i18 &= -113;
                            }
                            i19 = i18 & (-3670017);
                            hVar2 = hVar;
                            n0Var2 = n0Var;
                            z13 = z11;
                            qVar4 = qVar2;
                            j1Var3 = j1Var2;
                        }
                        c0 c0Var3 = c0VarA;
                        boolean z16 = z12;
                        qVar7.r();
                        qVar5 = qVar7;
                        u8.g.b(qVar4, c0Var3, j1Var3, z16, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                        qVar6 = qVar4;
                        c0Var2 = c0Var3;
                        j1Var4 = j1Var3;
                        z14 = z16;
                        n0Var3 = n0Var2;
                        z15 = z13;
                        hVar3 = hVar2;
                    } else {
                        qVar7.T();
                        n0Var3 = n0Var;
                        qVar5 = qVar7;
                        qVar6 = qVar2;
                        c0Var2 = c0VarA;
                        j1Var4 = j1Var2;
                        z14 = z12;
                        hVar3 = hVar;
                        z15 = z11;
                    }
                    h1VarV = qVar5.v();
                    if (h1VarV != null) {
                        h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
                    }
                }
                i12 |= 3072;
                z12 = z10;
                int i23 = i12 | 13303808;
                if (qVar7.h(cVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i18 = i23 | i17;
                if ((38347923 & i18) == 38347922) {
                    qVar7.V();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f11 = 0;
                            k1Var = new k1(f11, f11, f11, f11);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar5 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar2 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar5;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar2;
                        z13 = true;
                    } else {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f12 = 0;
                            k1Var = new k1(f12, f12, f12, f12);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar6 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar3 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar6;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar3;
                        z13 = true;
                    }
                    c0 c0Var4 = c0VarA;
                    boolean z17 = z12;
                    qVar7.r();
                    qVar5 = qVar7;
                    u8.g.b(qVar4, c0Var4, j1Var3, z17, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                    qVar6 = qVar4;
                    c0Var2 = c0Var4;
                    j1Var4 = j1Var3;
                    z14 = z17;
                    n0Var3 = n0Var2;
                    z15 = z13;
                    hVar3 = hVar2;
                } else {
                    qVar7.V();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f13 = 0;
                            k1Var = new k1(f13, f13, f13, f13);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar7 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar4 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar7;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar4;
                        z13 = true;
                    } else {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f14 = 0;
                            k1Var = new k1(f14, f14, f14, f14);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar8 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar5 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar8;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar5;
                        z13 = true;
                    }
                    c0 c0Var5 = c0VarA;
                    boolean z18 = z12;
                    qVar7.r();
                    qVar5 = qVar7;
                    u8.g.b(qVar4, c0Var5, j1Var3, z18, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                    qVar6 = qVar4;
                    c0Var2 = c0Var5;
                    j1Var4 = j1Var3;
                    z14 = z18;
                    n0Var3 = n0Var2;
                    z15 = z13;
                    hVar3 = hVar2;
                }
                h1VarV = qVar5.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
                }
            }
            i12 |= 384;
            j1Var2 = j1Var;
            i15 = i10 & 8;
            if (i15 != 0) {
                if ((i2 & 3072) == 0) {
                    z12 = z10;
                    if (qVar7.g(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                int i24 = i12 | 13303808;
                if (qVar7.h(cVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i18 = i24 | i17;
                if ((38347923 & i18) == 38347922) {
                    qVar7.V();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f15 = 0;
                            k1Var = new k1(f15, f15, f15, f15);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar9 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar6 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar9;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar6;
                        z13 = true;
                    } else {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f16 = 0;
                            k1Var = new k1(f16, f16, f16, f16);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar10 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar7 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar10;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar7;
                        z13 = true;
                    }
                    c0 c0Var6 = c0VarA;
                    boolean z19 = z12;
                    qVar7.r();
                    qVar5 = qVar7;
                    u8.g.b(qVar4, c0Var6, j1Var3, z19, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                    qVar6 = qVar4;
                    c0Var2 = c0Var6;
                    j1Var4 = j1Var3;
                    z14 = z19;
                    n0Var3 = n0Var2;
                    z15 = z13;
                    hVar3 = hVar2;
                } else {
                    qVar7.V();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f17 = 0;
                            k1Var = new k1(f17, f17, f17, f17);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar11 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar8 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar11;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar8;
                        z13 = true;
                    } else {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f18 = 0;
                            k1Var = new k1(f18, f18, f18, f18);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar12 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar9 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar12;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar9;
                        z13 = true;
                    }
                    c0 c0Var7 = c0VarA;
                    boolean z110 = z12;
                    qVar7.r();
                    qVar5 = qVar7;
                    u8.g.b(qVar4, c0Var7, j1Var3, z110, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                    qVar6 = qVar4;
                    c0Var2 = c0Var7;
                    j1Var4 = j1Var3;
                    z14 = z110;
                    n0Var3 = n0Var2;
                    z15 = z13;
                    hVar3 = hVar2;
                }
                h1VarV = qVar5.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
                }
            }
            i12 |= 3072;
            z12 = z10;
            int i25 = i12 | 13303808;
            if (qVar7.h(cVar)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i18 = i25 | i17;
            if ((38347923 & i18) == 38347922) {
                qVar7.V();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f19 = 0;
                        k1Var = new k1(f19, f19, f19, f19);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar13 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar10 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar13;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar10;
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f110 = 0;
                        k1Var = new k1(f110, f110, f110, f110);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar14 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar11 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar14;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar11;
                    z13 = true;
                }
                c0 c0Var8 = c0VarA;
                boolean z111 = z12;
                qVar7.r();
                qVar5 = qVar7;
                u8.g.b(qVar4, c0Var8, j1Var3, z111, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                qVar6 = qVar4;
                c0Var2 = c0Var8;
                j1Var4 = j1Var3;
                z14 = z111;
                n0Var3 = n0Var2;
                z15 = z13;
                hVar3 = hVar2;
            } else {
                qVar7.V();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f111 = 0;
                        k1Var = new k1(f111, f111, f111, f111);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar15 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar12 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar15;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar12;
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f112 = 0;
                        k1Var = new k1(f112, f112, f112, f112);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar16 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar13 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar16;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar13;
                    z13 = true;
                }
                c0 c0Var9 = c0VarA;
                boolean z112 = z12;
                qVar7.r();
                qVar5 = qVar7;
                u8.g.b(qVar4, c0Var9, j1Var3, z112, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                qVar6 = qVar4;
                c0Var2 = c0Var9;
                j1Var4 = j1Var3;
                z14 = z112;
                n0Var3 = n0Var2;
                z15 = z13;
                hVar3 = hVar2;
            }
            h1VarV = qVar5.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
            }
        }
        c0VarA = c0Var;
        i12 = i11 | i21;
        i13 = i10 & 4;
        if (i13 != 0) {
            if ((i2 & 384) == 0) {
                j1Var2 = j1Var;
                if (qVar7.f(j1Var2)) {
                    i14 = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i10 & 8;
            if (i15 != 0) {
                if ((i2 & 3072) == 0) {
                    z12 = z10;
                    if (qVar7.g(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                int i26 = i12 | 13303808;
                if (qVar7.h(cVar)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i18 = i26 | i17;
                if ((38347923 & i18) == 38347922) {
                    qVar7.V();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f113 = 0;
                            k1Var = new k1(f113, f113, f113, f113);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar17 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar14 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar17;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar14;
                        z13 = true;
                    } else {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f114 = 0;
                            k1Var = new k1(f114, f114, f114, f114);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar18 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar15 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar18;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar15;
                        z13 = true;
                    }
                    c0 c0Var10 = c0VarA;
                    boolean z113 = z12;
                    qVar7.r();
                    qVar5 = qVar7;
                    u8.g.b(qVar4, c0Var10, j1Var3, z113, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                    qVar6 = qVar4;
                    c0Var2 = c0Var10;
                    j1Var4 = j1Var3;
                    z14 = z113;
                    n0Var3 = n0Var2;
                    z15 = z13;
                    hVar3 = hVar2;
                } else {
                    qVar7.V();
                    if ((i2 & 1) != 0) {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f115 = 0;
                            k1Var = new k1(f115, f115, f115, f115);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar19 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar16 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar19;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar16;
                        z13 = true;
                    } else {
                        if (i20 != 0) {
                            qVar3 = h1.n.f7355t;
                        } else {
                            qVar3 = qVar2;
                        }
                        if ((i10 & 2) != 0) {
                            i18 &= -113;
                            c0VarA = c0.f0.a(0, qVar7, 3);
                        }
                        if (i13 != 0) {
                            float f116 = 0;
                            k1Var = new k1(f116, f116, f116, f116);
                        } else {
                            k1Var = j1Var2;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        h1.h hVar110 = h1.b.C;
                        uVarA = o0.a(qVar7);
                        zF = qVar7.f(uVarA);
                        objO = qVar7.O();
                        if (zF) {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        } else {
                            objO = new y.l(uVarA);
                            qVar7.i0(objO);
                        }
                        y.l lVar17 = (y.l) objO;
                        qVar4 = qVar3;
                        hVar2 = hVar110;
                        i19 = i18 & (-3670017);
                        j1Var3 = k1Var;
                        n0Var2 = lVar17;
                        z13 = true;
                    }
                    c0 c0Var11 = c0VarA;
                    boolean z114 = z12;
                    qVar7.r();
                    qVar5 = qVar7;
                    u8.g.b(qVar4, c0Var11, j1Var3, z114, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                    qVar6 = qVar4;
                    c0Var2 = c0Var11;
                    j1Var4 = j1Var3;
                    z14 = z114;
                    n0Var3 = n0Var2;
                    z15 = z13;
                    hVar3 = hVar2;
                }
                h1VarV = qVar5.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
                }
            }
            i12 |= 3072;
            z12 = z10;
            int i27 = i12 | 13303808;
            if (qVar7.h(cVar)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i18 = i27 | i17;
            if ((38347923 & i18) == 38347922) {
                qVar7.V();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f117 = 0;
                        k1Var = new k1(f117, f117, f117, f117);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar111 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar18 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar111;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar18;
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f118 = 0;
                        k1Var = new k1(f118, f118, f118, f118);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar112 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar19 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar112;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar19;
                    z13 = true;
                }
                c0 c0Var12 = c0VarA;
                boolean z115 = z12;
                qVar7.r();
                qVar5 = qVar7;
                u8.g.b(qVar4, c0Var12, j1Var3, z115, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                qVar6 = qVar4;
                c0Var2 = c0Var12;
                j1Var4 = j1Var3;
                z14 = z115;
                n0Var3 = n0Var2;
                z15 = z13;
                hVar3 = hVar2;
            } else {
                qVar7.V();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f119 = 0;
                        k1Var = new k1(f119, f119, f119, f119);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar113 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar110 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar113;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar110;
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f1110 = 0;
                        k1Var = new k1(f1110, f1110, f1110, f1110);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar114 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar111 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar114;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar111;
                    z13 = true;
                }
                c0 c0Var13 = c0VarA;
                boolean z116 = z12;
                qVar7.r();
                qVar5 = qVar7;
                u8.g.b(qVar4, c0Var13, j1Var3, z116, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                qVar6 = qVar4;
                c0Var2 = c0Var13;
                j1Var4 = j1Var3;
                z14 = z116;
                n0Var3 = n0Var2;
                z15 = z13;
                hVar3 = hVar2;
            }
            h1VarV = qVar5.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
            }
        }
        i12 |= 384;
        j1Var2 = j1Var;
        i15 = i10 & 8;
        if (i15 != 0) {
            if ((i2 & 3072) == 0) {
                z12 = z10;
                if (qVar7.g(z12)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            int i28 = i12 | 13303808;
            if (qVar7.h(cVar)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i18 = i28 | i17;
            if ((38347923 & i18) == 38347922) {
                qVar7.V();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f1111 = 0;
                        k1Var = new k1(f1111, f1111, f1111, f1111);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar115 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar112 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar115;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar112;
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f1112 = 0;
                        k1Var = new k1(f1112, f1112, f1112, f1112);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar116 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar113 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar116;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar113;
                    z13 = true;
                }
                c0 c0Var14 = c0VarA;
                boolean z117 = z12;
                qVar7.r();
                qVar5 = qVar7;
                u8.g.b(qVar4, c0Var14, j1Var3, z117, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                qVar6 = qVar4;
                c0Var2 = c0Var14;
                j1Var4 = j1Var3;
                z14 = z117;
                n0Var3 = n0Var2;
                z15 = z13;
                hVar3 = hVar2;
            } else {
                qVar7.V();
                if ((i2 & 1) != 0) {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f1113 = 0;
                        k1Var = new k1(f1113, f1113, f1113, f1113);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar117 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar114 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar117;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar114;
                    z13 = true;
                } else {
                    if (i20 != 0) {
                        qVar3 = h1.n.f7355t;
                    } else {
                        qVar3 = qVar2;
                    }
                    if ((i10 & 2) != 0) {
                        i18 &= -113;
                        c0VarA = c0.f0.a(0, qVar7, 3);
                    }
                    if (i13 != 0) {
                        float f1114 = 0;
                        k1Var = new k1(f1114, f1114, f1114, f1114);
                    } else {
                        k1Var = j1Var2;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    h1.h hVar118 = h1.b.C;
                    uVarA = o0.a(qVar7);
                    zF = qVar7.f(uVarA);
                    objO = qVar7.O();
                    if (zF) {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    } else {
                        objO = new y.l(uVarA);
                        qVar7.i0(objO);
                    }
                    y.l lVar115 = (y.l) objO;
                    qVar4 = qVar3;
                    hVar2 = hVar118;
                    i19 = i18 & (-3670017);
                    j1Var3 = k1Var;
                    n0Var2 = lVar115;
                    z13 = true;
                }
                c0 c0Var15 = c0VarA;
                boolean z118 = z12;
                qVar7.r();
                qVar5 = qVar7;
                u8.g.b(qVar4, c0Var15, j1Var3, z118, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
                qVar6 = qVar4;
                c0Var2 = c0Var15;
                j1Var4 = j1Var3;
                z14 = z118;
                n0Var3 = n0Var2;
                z15 = z13;
                hVar3 = hVar2;
            }
            h1VarV = qVar5.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
            }
        }
        i12 |= 3072;
        z12 = z10;
        int i29 = i12 | 13303808;
        if (qVar7.h(cVar)) {
            i17 = 67108864;
        } else {
            i17 = 33554432;
        }
        i18 = i29 | i17;
        if ((38347923 & i18) == 38347922) {
            qVar7.V();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    qVar3 = h1.n.f7355t;
                } else {
                    qVar3 = qVar2;
                }
                if ((i10 & 2) != 0) {
                    i18 &= -113;
                    c0VarA = c0.f0.a(0, qVar7, 3);
                }
                if (i13 != 0) {
                    float f1115 = 0;
                    k1Var = new k1(f1115, f1115, f1115, f1115);
                } else {
                    k1Var = j1Var2;
                }
                if (i15 != 0) {
                    z12 = false;
                }
                h1.h hVar119 = h1.b.C;
                uVarA = o0.a(qVar7);
                zF = qVar7.f(uVarA);
                objO = qVar7.O();
                if (zF) {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                } else {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                }
                y.l lVar116 = (y.l) objO;
                qVar4 = qVar3;
                hVar2 = hVar119;
                i19 = i18 & (-3670017);
                j1Var3 = k1Var;
                n0Var2 = lVar116;
                z13 = true;
            } else {
                if (i20 != 0) {
                    qVar3 = h1.n.f7355t;
                } else {
                    qVar3 = qVar2;
                }
                if ((i10 & 2) != 0) {
                    i18 &= -113;
                    c0VarA = c0.f0.a(0, qVar7, 3);
                }
                if (i13 != 0) {
                    float f1116 = 0;
                    k1Var = new k1(f1116, f1116, f1116, f1116);
                } else {
                    k1Var = j1Var2;
                }
                if (i15 != 0) {
                    z12 = false;
                }
                h1.h hVar1110 = h1.b.C;
                uVarA = o0.a(qVar7);
                zF = qVar7.f(uVarA);
                objO = qVar7.O();
                if (zF) {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                } else {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                }
                y.l lVar117 = (y.l) objO;
                qVar4 = qVar3;
                hVar2 = hVar1110;
                i19 = i18 & (-3670017);
                j1Var3 = k1Var;
                n0Var2 = lVar117;
                z13 = true;
            }
            c0 c0Var16 = c0VarA;
            boolean z119 = z12;
            qVar7.r();
            qVar5 = qVar7;
            u8.g.b(qVar4, c0Var16, j1Var3, z119, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
            qVar6 = qVar4;
            c0Var2 = c0Var16;
            j1Var4 = j1Var3;
            z14 = z119;
            n0Var3 = n0Var2;
            z15 = z13;
            hVar3 = hVar2;
        } else {
            qVar7.V();
            if ((i2 & 1) != 0) {
                if (i20 != 0) {
                    qVar3 = h1.n.f7355t;
                } else {
                    qVar3 = qVar2;
                }
                if ((i10 & 2) != 0) {
                    i18 &= -113;
                    c0VarA = c0.f0.a(0, qVar7, 3);
                }
                if (i13 != 0) {
                    float f1117 = 0;
                    k1Var = new k1(f1117, f1117, f1117, f1117);
                } else {
                    k1Var = j1Var2;
                }
                if (i15 != 0) {
                    z12 = false;
                }
                h1.h hVar1111 = h1.b.C;
                uVarA = o0.a(qVar7);
                zF = qVar7.f(uVarA);
                objO = qVar7.O();
                if (zF) {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                } else {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                }
                y.l lVar118 = (y.l) objO;
                qVar4 = qVar3;
                hVar2 = hVar1111;
                i19 = i18 & (-3670017);
                j1Var3 = k1Var;
                n0Var2 = lVar118;
                z13 = true;
            } else {
                if (i20 != 0) {
                    qVar3 = h1.n.f7355t;
                } else {
                    qVar3 = qVar2;
                }
                if ((i10 & 2) != 0) {
                    i18 &= -113;
                    c0VarA = c0.f0.a(0, qVar7, 3);
                }
                if (i13 != 0) {
                    float f1118 = 0;
                    k1Var = new k1(f1118, f1118, f1118, f1118);
                } else {
                    k1Var = j1Var2;
                }
                if (i15 != 0) {
                    z12 = false;
                }
                h1.h hVar1112 = h1.b.C;
                uVarA = o0.a(qVar7);
                zF = qVar7.f(uVarA);
                objO = qVar7.O();
                if (zF) {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                } else {
                    objO = new y.l(uVarA);
                    qVar7.i0(objO);
                }
                y.l lVar119 = (y.l) objO;
                qVar4 = qVar3;
                hVar2 = hVar1112;
                i19 = i18 & (-3670017);
                j1Var3 = k1Var;
                n0Var2 = lVar119;
                z13 = true;
            }
            c0 c0Var17 = c0VarA;
            boolean z1110 = z12;
            qVar7.r();
            qVar5 = qVar7;
            u8.g.b(qVar4, c0Var17, j1Var3, z1110, false, n0Var2, z13, null, null, hVar2, fVar, cVar, qVar5, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | 1572864, 54 | ((i19 >> 18) & 896), 896);
            qVar6 = qVar4;
            c0Var2 = c0Var17;
            j1Var4 = j1Var3;
            z14 = z1110;
            n0Var3 = n0Var2;
            z15 = z13;
            hVar3 = hVar2;
        }
        h1VarV = qVar5.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new c0.c(qVar6, c0Var2, j1Var4, z14, fVar, hVar3, n0Var3, z15, cVar, i2, i10);
        }
    }

    public static final void d(androidx.lifecycle.u uVar, hf.c cVar, hf.a aVar, v0.n nVar, int i2) {
        v0.q qVar = (v0.q) nVar;
        qVar.b0(-1868327245);
        int i10 = (qVar.h(uVar) ? 4 : 2) | i2 | (qVar.h(cVar) ? 32 : 16) | (qVar.h(aVar) ? 256 : 128);
        if ((i10 & 147) == 146 && qVar.E()) {
            qVar.T();
        } else {
            boolean zH = ((i10 & 112) == 32) | qVar.h(uVar) | ((i10 & 896) == 256);
            Object objO = qVar.O();
            if (zH || objO == v0.m.f21654a) {
                objO = new f1(uVar, cVar, aVar, 14);
                qVar.i0(objO);
            }
            v0.d.c(uVar, (hf.c) objO, qVar);
        }
        h1 h1VarV = qVar.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new q0(uVar, cVar, aVar, i2, 4);
        }
    }

    public static p2.a e(String str, p2.n0 n0Var, long j10, b3.b bVar, u2.h hVar, int i2, int i10) {
        s sVar = s.f20249t;
        return new p2.a(new x2.c(str, n0Var, sVar, sVar, hVar, bVar), i2, false, j10);
    }

    public static final void f(mg.a aVar, mg.c cVar, String str) {
        mg.d dVar = mg.d.f15015h;
        mg.d.f15016i.fine(cVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f15005a);
    }

    public static final String g(Object[] objArr, int i2, int i10, te.e eVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i2 + i11];
            if (obj == eVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static ArrayList h(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new te.h(objArr, true));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(androidx.lifecycle.o oVar, ze.c cVar) throws Throwable {
        n8.b bVar;
        androidx.lifecycle.o oVar2;
        w wVar;
        Throwable th;
        t tVar;
        t tVar2;
        if (cVar instanceof n8.b) {
            bVar = (n8.b) cVar;
            int i2 = bVar.f15466w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f15466w = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new n8.b(cVar);
            }
        } else {
            bVar = new n8.b(cVar);
        }
        Object obj = bVar.f15465v;
        int i10 = bVar.f15466w;
        a0 a0Var = a0.f19710a;
        if (i10 != 0) {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wVar = bVar.f15464u;
            oVar2 = bVar.f15463t;
            try {
                se.a.f(obj);
                tVar2 = (t) wVar.f9988t;
                if (tVar2 != null) {
                    oVar2.c(tVar2);
                }
                return a0Var;
            } catch (Throwable th2) {
                th = th2;
                tVar = (t) wVar.f9988t;
                if (tVar != null) {
                    oVar2.c(tVar);
                }
                throw th;
            }
        }
        se.a.f(obj);
        if (oVar.b().compareTo(androidx.lifecycle.n.f1299w) >= 0) {
            return a0Var;
        }
        w wVar2 = new w();
        try {
            bVar.f15463t = oVar;
            bVar.f15464u = wVar2;
            bVar.f15466w = 1;
            sf.g gVar = new sf.g(1, pf.l.D(bVar));
            gVar.s();
            n8.c cVar2 = new n8.c(gVar);
            wVar2.f9988t = cVar2;
            oVar.a(cVar2);
            Object objR = gVar.r();
            ye.a aVar = ye.a.f23667t;
            if (objR == aVar) {
                return aVar;
            }
            oVar2 = oVar;
            wVar = wVar2;
            tVar2 = (t) wVar.f9988t;
            if (tVar2 != null) {
                oVar2.c(tVar2);
            }
            return a0Var;
        } catch (Throwable th3) {
            oVar2 = oVar;
            wVar = wVar2;
            th = th3;
            tVar = (t) wVar.f9988t;
            if (tVar != null) {
                oVar2.c(tVar);
            }
            throw th;
        }
    }

    public static int j(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            w4.d.j(w0.n(0, size, "fromIndex (", ") is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            w4.d.g(w0.n(size, size2, "toIndex (", ") is greater than size (", ")."));
            return 0;
        }
        int i10 = size - 1;
        while (i2 <= i10) {
            int i11 = (i2 + i10) >>> 1;
            int iM = bb.a.M((Comparable) arrayList.get(i11), comparable);
            if (iM < 0) {
                i2 = i11 + 1;
            } else {
                if (iM <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static ue.b k(ue.b bVar) {
        bVar.j();
        bVar.f21263v = true;
        return bVar.f21262u > 0 ? bVar : ue.b.f21260w;
    }

    public static boolean l(i5.n nVar) {
        r4.o oVar = new r4.o(8);
        int i2 = f5.g.a(nVar, oVar).f4914a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        nVar.n(oVar.f18482a, 0, 4);
        oVar.F(0);
        int iG = oVar.g();
        if (iG == 1463899717) {
            return true;
        }
        r4.a.m("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static ue.b m() {
        return new ue.b(10);
    }

    public static final af.b n(Enum[] enumArr) {
        enumArr.getClass();
        return new af.b(enumArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static e0 o(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return e0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return e0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return e0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return e0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return e0.SSL_3_0;
        }
        w4.d.j("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final String p(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) CredentialOption.PRIORITY_PASSWORD_OR_SIMILAR)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) CredentialOption.PRIORITY_PASSWORD_OR_SIMILAR)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final u1.e q() {
        u1.e eVar = f21009e;
        if (eVar != null) {
            return eVar;
        }
        u1.d dVar = new u1.d("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = u1.f0.f20688a;
        b1 b1Var = new b1(o1.w.b);
        jg.m mVar = new jg.m(2);
        mVar.m(12.0f, 21.35f);
        mVar.l(-1.45f, -1.32f);
        mVar.g(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        mVar.g(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        mVar.h(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        mVar.g(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        mVar.g(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        mVar.h(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        mVar.k(12.0f, 21.35f);
        mVar.f();
        u1.d.a(dVar, mVar.f8904t, b1Var);
        u1.e eVarB = dVar.b();
        f21009e = eVarB;
        return eVarB;
    }

    public static nf.e r(Collection collection) {
        collection.getClass();
        return new nf.e(0, collection.size() - 1, 1);
    }

    public static int s(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final u1.e t() {
        u1.e eVar = f21010f;
        if (eVar != null) {
            return eVar;
        }
        u1.d dVar = new u1.d("Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = u1.f0.f20688a;
        b1 b1Var = new b1(o1.w.b);
        jg.m mVar = new jg.m(2);
        mVar.m(19.0f, 19.0f);
        mVar.i(5.0f);
        mVar.q(5.0f);
        mVar.j(7.0f);
        mVar.q(3.0f);
        mVar.i(5.0f);
        mVar.h(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mVar.r(14.0f);
        mVar.h(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mVar.j(14.0f);
        mVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mVar.r(-7.0f);
        mVar.j(-2.0f);
        mVar.r(7.0f);
        mVar.f();
        mVar.m(14.0f, 3.0f);
        mVar.r(2.0f);
        mVar.j(3.59f);
        mVar.l(-9.83f, 9.83f);
        mVar.l(1.41f, 1.41f);
        mVar.k(19.0f, 6.41f);
        mVar.q(10.0f);
        mVar.j(2.0f);
        mVar.q(3.0f);
        mVar.j(-7.0f);
        mVar.f();
        u1.d.a(dVar, mVar.f8904t, b1Var);
        u1.e eVarB = dVar.b();
        f21010f = eVarB;
        return eVarB;
    }

    public static boolean u(byte b10) {
        return b10 > -65;
    }

    public static List v(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List w(Object... objArr) {
        if (objArr.length <= 0) {
            return s.f20249t;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final l x(hf.e eVar, hf.c cVar) {
        h2 h2Var = new h2(eVar);
        kotlin.jvm.internal.a0.d(1, cVar);
        l lVar = e1.o.f4031a;
        return new l(h2Var, cVar, false, 3);
    }

    public static ArrayList y(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new te.h(objArr, true));
    }

    public static final List z(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : v(list.get(0));
        }
        return s.f20249t;
    }
}
