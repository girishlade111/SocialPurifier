package n6;

import androidx.security.crypto.MasterKey;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f15227w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15228a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i5.d0 f15233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i5.d0 f15234h;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15238m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15242q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15244s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i5.d0 f15246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15247v;
    public final f6.f b = new f6.f(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.o f15229c = new r4.o(Arrays.copyOf(f15227w, 10));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15235i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15236j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15237k = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15239n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15240o = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15243r = -9223372036854775807L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f15245t = -9223372036854775807L;

    public e(boolean z10, String str, int i2) {
        this.f15228a = z10;
        this.f15230d = str;
        this.f15231e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // n6.i
    public final void a(r4.o oVar) throws o4.f0 {
        byte b;
        int i2;
        int i10;
        char c10;
        int i11;
        char c11;
        int i12;
        int i13;
        int i14;
        this.f15233g.getClass();
        int i15 = r4.v.f18493a;
        while (oVar.a() > 0) {
            int i16 = this.f15235i;
            byte b10 = -1;
            r4.o oVar2 = this.f15229c;
            int i17 = 3;
            f6.f fVar = this.b;
            int i18 = 4;
            int i19 = 0;
            int i20 = 1;
            if (i16 == 0) {
                byte[] bArr = oVar.f18482a;
                int i21 = oVar.b;
                int i22 = oVar.f18483c;
                while (true) {
                    if (i21 < i22) {
                        int i23 = i21 + 1;
                        int i24 = i17;
                        byte b11 = bArr[i21];
                        int i25 = b11 & 255;
                        if (this.f15237k == 512 && ((65280 | (((byte) i25) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.f15238m) {
                                int i26 = i21 - 1;
                                oVar.F(i21);
                                byte[] bArr2 = fVar.b;
                                if (oVar.a() < i20) {
                                    b = -1;
                                } else {
                                    oVar.e(bArr2, i19, i20);
                                    fVar.p(i18);
                                    int i27 = fVar.i(i20);
                                    int i28 = this.f15239n;
                                    if (i28 == -1 || i27 == i28) {
                                        if (this.f15240o != -1) {
                                            byte[] bArr3 = fVar.b;
                                            if (oVar.a() >= i20) {
                                                oVar.e(bArr3, i19, i20);
                                                fVar.p(2);
                                                i12 = 4;
                                                if (fVar.i(4) != this.f15240o) {
                                                    b = -1;
                                                } else {
                                                    oVar.F(i23);
                                                }
                                            }
                                        } else {
                                            i12 = 4;
                                        }
                                        byte[] bArr4 = fVar.b;
                                        if (oVar.a() >= i12) {
                                            oVar.e(bArr4, i19, i12);
                                            fVar.p(14);
                                            int i29 = fVar.i(13);
                                            if (i29 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = oVar.f18482a;
                                                int i30 = oVar.f18483c;
                                                int i31 = i26 + i29;
                                                if (i31 < i30) {
                                                    byte b12 = bArr5[i31];
                                                    b = -1;
                                                    if (b12 == -1) {
                                                        int i32 = i31 + 1;
                                                        if (i32 != i30) {
                                                            byte b13 = bArr5[i32];
                                                            if (((65280 | (b13 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b13 & 8) >> 3) == i27) {
                                                            }
                                                        }
                                                    } else if (b12 == 73 && ((i13 = i31 + 1) == i30 || (bArr5[i13] == 68 && ((i14 = i31 + 2) == i30 || bArr5[i14] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i2 = 1;
                            }
                            this.f15241p = (b11 & 8) >> 3;
                            this.l = (b11 & 1) == 0;
                            if (this.f15238m) {
                                this.f15235i = i24;
                                this.f15236j = 0;
                            } else {
                                this.f15235i = 1;
                                this.f15236j = 0;
                            }
                            oVar.F(i23);
                        } else {
                            b = b10;
                            i2 = i20;
                        }
                        int i33 = this.f15237k;
                        int i34 = i25 | i33;
                        if (i34 == 329) {
                            i10 = 3;
                            c10 = 256;
                            i11 = 0;
                            c11 = 2;
                            this.f15237k = 768;
                        } else if (i34 == 511) {
                            i10 = 3;
                            c10 = 256;
                            i11 = 0;
                            c11 = 2;
                            this.f15237k = 512;
                        } else if (i34 == 836) {
                            i10 = 3;
                            c10 = 256;
                            i11 = 0;
                            c11 = 2;
                            this.f15237k = 1024;
                        } else if (i34 != 1075) {
                            c10 = 256;
                            if (i33 != 256) {
                                this.f15237k = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                                i10 = 3;
                                i11 = 0;
                                c11 = 2;
                            } else {
                                i10 = 3;
                                i11 = 0;
                                c11 = 2;
                            }
                            i20 = i2;
                            b10 = b;
                            i18 = 4;
                            i19 = i11;
                            i17 = i10;
                        } else {
                            this.f15235i = 2;
                            this.f15236j = 3;
                            this.f15244s = 0;
                            oVar2.F(0);
                            oVar.F(i23);
                        }
                        i21 = i23;
                        i20 = i2;
                        b10 = b;
                        i18 = 4;
                        i19 = i11;
                        i17 = i10;
                    } else {
                        oVar.F(i21);
                    }
                }
            } else if (i16 != 1) {
                if (i16 == 2) {
                    byte[] bArr6 = oVar2.f18482a;
                    int iMin = Math.min(oVar.a(), 10 - this.f15236j);
                    oVar.e(bArr6, this.f15236j, iMin);
                    int i35 = this.f15236j + iMin;
                    this.f15236j = i35;
                    if (i35 == 10) {
                        this.f15234h.c(oVar2, 10, 0);
                        oVar2.F(6);
                        i5.d0 d0Var = this.f15234h;
                        int iS = oVar2.s() + 10;
                        this.f15235i = 4;
                        this.f15236j = 10;
                        this.f15246u = d0Var;
                        this.f15247v = 0L;
                        this.f15244s = iS;
                    }
                } else if (i16 == 3) {
                    int i36 = this.l ? 7 : 5;
                    byte[] bArr7 = fVar.b;
                    int iMin2 = Math.min(oVar.a(), i36 - this.f15236j);
                    oVar.e(bArr7, this.f15236j, iMin2);
                    int i37 = this.f15236j + iMin2;
                    this.f15236j = i37;
                    if (i37 == i36) {
                        fVar.p(0);
                        if (this.f15242q) {
                            fVar.s(10);
                        } else {
                            int i38 = fVar.i(2) + 1;
                            if (i38 != 2) {
                                r4.a.v("AdtsReader", "Detected audio object type: " + i38 + ", but assuming AAC LC.");
                                i38 = 2;
                            }
                            fVar.s(5);
                            int i39 = fVar.i(3);
                            int i40 = this.f15240o;
                            byte[] bArr8 = {(byte) (((i38 << 3) & 248) | ((i40 >> 1) & 7)), (byte) (((i39 << 3) & 120) | ((i40 << 7) & 128))};
                            i5.a aVarM = i5.b.m(new f6.f(bArr8, 2), false);
                            o4.n nVar = new o4.n();
                            nVar.f15879a = this.f15232f;
                            nVar.l = o4.e0.h("audio/mp4a-latm");
                            nVar.f15886i = aVarM.f8334a;
                            nVar.f15901y = aVarM.f8335c;
                            nVar.f15902z = aVarM.b;
                            nVar.f15890n = Collections.singletonList(bArr8);
                            nVar.f15881d = this.f15230d;
                            nVar.f15883f = this.f15231e;
                            o4.o oVar3 = new o4.o(nVar);
                            this.f15243r = 1024000000 / ((long) oVar3.A);
                            this.f15233g.a(oVar3);
                            this.f15242q = true;
                        }
                        fVar.s(4);
                        int i41 = fVar.i(13);
                        int i42 = i41 - 7;
                        if (this.l) {
                            i42 = i41 - 9;
                        }
                        i5.d0 d0Var2 = this.f15233g;
                        long j10 = this.f15243r;
                        this.f15235i = 4;
                        this.f15236j = 0;
                        this.f15246u = d0Var2;
                        this.f15247v = j10;
                        this.f15244s = i42;
                    }
                } else {
                    if (i16 != 4) {
                        m0.n.m();
                        return;
                    }
                    int iMin3 = Math.min(oVar.a(), this.f15244s - this.f15236j);
                    this.f15246u.c(oVar, iMin3, 0);
                    int i43 = this.f15236j + iMin3;
                    this.f15236j = i43;
                    if (i43 == this.f15244s) {
                        r4.a.i(this.f15245t != -9223372036854775807L);
                        this.f15246u.d(this.f15245t, 1, this.f15244s, 0, null);
                        this.f15245t += this.f15247v;
                        this.f15235i = 0;
                        this.f15236j = 0;
                        this.f15237k = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                    }
                }
            } else if (oVar.a() != 0) {
                fVar.b[0] = oVar.f18482a[oVar.b];
                fVar.p(2);
                int i44 = fVar.i(4);
                int i45 = this.f15240o;
                if (i45 == -1 || i44 == i45) {
                    if (!this.f15238m) {
                        this.f15238m = true;
                        this.f15239n = this.f15241p;
                        this.f15240o = i44;
                    }
                    this.f15235i = 3;
                    this.f15236j = 0;
                } else {
                    this.f15238m = false;
                    this.f15235i = 0;
                    this.f15236j = 0;
                    this.f15237k = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
                }
            }
        }
    }

    @Override // n6.i
    public final void b() {
        this.f15245t = -9223372036854775807L;
        this.f15238m = false;
        this.f15235i = 0;
        this.f15236j = 0;
        this.f15237k = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
    }

    @Override // n6.i
    public final void c() {
    }

    @Override // n6.i
    public final void d(i5.o oVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f15232f = e0Var.f15251e;
        e0Var.b();
        i5.d0 d0VarV = oVar.v(e0Var.f15250d, 1);
        this.f15233g = d0VarV;
        this.f15246u = d0VarV;
        if (!this.f15228a) {
            this.f15234h = new i5.l();
            return;
        }
        e0Var.a();
        e0Var.b();
        i5.d0 d0VarV2 = oVar.v(e0Var.f15250d, 5);
        this.f15234h = d0VarV2;
        o4.n nVar = new o4.n();
        e0Var.b();
        nVar.f15879a = e0Var.f15251e;
        nVar.l = o4.e0.h("application/id3");
        d0VarV2.a(new o4.o(nVar));
    }

    @Override // n6.i
    public final void e(int i2, long j10) {
        this.f15245t = j10;
    }
}
