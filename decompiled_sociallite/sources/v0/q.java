package v0;

import android.os.Trace;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q implements n {
    public int A;
    public boolean B;
    public final f1.z C;
    public final jg.m D;
    public boolean E;
    public q1 F;
    public r1 G;
    public t1 H;
    public boolean I;
    public d1.d J;
    public w0.a K;
    public final w0.b L;
    public c M;
    public w0.c N;
    public boolean O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u7.m f21678a;
    public final s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f21679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.b0 f21680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0.a f21681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0.a f21682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f21683g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d1 f21685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21687k;
    public int l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f21689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s.p f21690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21692q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p2.h0 f21696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21697v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21699x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21701z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jg.m f21684h = new jg.m(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2.u f21688m = new g2.u();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f21693r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g2.u f21694s = new g2.u();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d1.d f21695t = d1.d.f3665w;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g2.u f21698w = new g2.u();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21700y = -1;

    public q(u7.m mVar, s sVar, r1 r1Var, s.b0 b0Var, w0.a aVar, w0.a aVar2, u uVar) {
        this.f21678a = mVar;
        this.b = sVar;
        this.f21679c = r1Var;
        this.f21680d = b0Var;
        this.f21681e = aVar;
        this.f21682f = aVar2;
        this.f21683g = uVar;
        this.B = sVar.e() || sVar.c();
        this.C = new f1.z(this, 1);
        this.D = new jg.m(4);
        q1 q1VarD = r1Var.d();
        q1VarD.c();
        this.F = q1VarD;
        r1 r1Var2 = new r1();
        if (sVar.e()) {
            r1Var2.c();
        }
        if (sVar.c()) {
            r1Var2.C = new s.r();
        }
        this.G = r1Var2;
        t1 t1VarE = r1Var2.e();
        t1VarE.e(true);
        this.H = t1VarE;
        this.L = new w0.b(this, aVar);
        q1 q1VarD2 = this.G.d();
        try {
            c cVarA = q1VarD2.a(0);
            q1VarD2.c();
            this.M = cVarA;
            this.N = new w0.c();
        } catch (Throwable th) {
            q1VarD2.c();
            throw th;
        }
    }

    public static final int Q(q qVar, int i2, boolean z10, int i10) {
        q1 q1Var = qVar.F;
        w0.b bVar = qVar.L;
        int[] iArr = q1Var.b;
        int i11 = i2 * 5;
        if ((iArr[i11 + 1] & 134217728) != 0) {
            int i12 = iArr[i11];
            Object objJ = q1Var.j(iArr, i2);
            if (i12 == 206 && kotlin.jvm.internal.l.a(objJ, d.f21559e)) {
                Object objG = q1Var.g(i2, 0);
                o oVar = objG instanceof o ? (o) objG : null;
                if (oVar != null) {
                    for (q qVar2 : oVar.f21662t.f21668e) {
                        w0.b bVar2 = qVar2.L;
                        r1 r1Var = qVar2.f21679c;
                        if (r1Var.f21715u > 0 && d.l(r1Var.f21714t, 0)) {
                            w0.a aVar = new w0.a();
                            qVar2.K = aVar;
                            q1 q1VarD = r1Var.d();
                            try {
                                qVar2.F = q1VarD;
                                w0.a aVar2 = bVar2.b;
                                try {
                                    bVar2.b = aVar;
                                    qVar2.P(0);
                                    bVar2.b();
                                    if (bVar2.f22522c) {
                                        bVar2.b.f22519x.O(w0.w.f22561c);
                                        if (bVar2.f22522c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.b.f22519x.O(w0.i.f22543c);
                                            bVar2.f22522c = false;
                                        }
                                    }
                                    bVar2.b = aVar2;
                                    q1VarD.c();
                                } catch (Throwable th) {
                                    bVar2.b = aVar2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                q1VarD.c();
                                throw th2;
                            }
                        }
                        qVar.b.l(qVar2.f21683g);
                    }
                }
                return d.r(iArr, i2);
            }
            if (!d.p(iArr, i2)) {
                return d.r(iArr, i2);
            }
        } else if (d.l(iArr, i2)) {
            int i13 = iArr[i11 + 3] + i2;
            int iQ = 0;
            for (int i14 = i2 + 1; i14 < i13; i14 += iArr[(i14 * 5) + 3]) {
                boolean zP = d.p(iArr, i14);
                if (zP) {
                    bVar.c();
                    Object objI = q1Var.i(i14);
                    bVar.c();
                    bVar.f22527h.f8904t.add(objI);
                }
                iQ += Q(qVar, i14, zP || z10, zP ? 0 : i10 + iQ);
                if (zP) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!d.p(iArr, i2)) {
                return iQ;
            }
        } else if (!d.p(iArr, i2)) {
            return d.r(iArr, i2);
        }
        return 1;
    }

    public final d1.d A() {
        return m();
    }

    public final h1 B() {
        if (this.f21701z != 0) {
            return null;
        }
        jg.m mVar = this.D;
        if (mVar.f8904t.isEmpty()) {
            return null;
        }
        ArrayList arrayList = mVar.f8904t;
        return (h1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean C() {
        if (!E() || this.f21697v) {
            return true;
        }
        h1 h1VarB = B();
        return (h1VarB == null || (h1VarB.f21592a & 4) == 0) ? false : true;
    }

    public final boolean D() {
        return this.O;
    }

    public final boolean E() {
        h1 h1VarB;
        return (this.O || this.f21699x || this.f21697v || (h1VarB = B()) == null || (h1VarB.f21592a & 8) != 0) ? false : true;
    }

    public final void F(ArrayList arrayList) {
        w0.a aVar = this.f21682f;
        w0.b bVar = this.L;
        w0.a aVar2 = bVar.b;
        try {
            bVar.b = aVar;
            aVar.f22519x.O(w0.u.f22559c);
            if (arrayList.size() <= 0) {
                bVar.b.f22519x.O(w0.j.f22544c);
                bVar.f22525f = 0;
                bVar.b = aVar2;
            } else {
                se.k kVar = (se.k) arrayList.get(0);
                s0 s0Var = (s0) kVar.f19723t;
                s0Var.getClass();
                throw null;
            }
        } catch (Throwable th) {
            bVar.b = aVar2;
            throw th;
        }
    }

    public final Object G(Object obj, Object obj2) {
        q1 q1Var = this.F;
        int i2 = q1Var.f21707g;
        Object objI = d.I(i2 < q1Var.f21708h ? q1Var.j(q1Var.b, i2) : null, obj, obj2);
        return objI == null ? new l0(obj, obj2) : objI;
    }

    public final Object H() {
        if (!this.O) {
            Object objH = this.F.h();
            if (!this.f21699x || (objH instanceof o)) {
                return objH;
            }
        } else if (this.f21692q) {
            d.y("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return m.f21654a;
    }

    public final int I(int i2) {
        int i10 = this.F.b[(i2 * 5) + 2] + 1;
        int i11 = 0;
        while (i10 < i2) {
            if (!d.o(this.F.b, i10)) {
                i11++;
            }
            i10 += this.F.b[(i10 * 5) + 3];
        }
        return i11;
    }

    public final boolean J(sc.p pVar) {
        w0.d0 d0Var = this.f21681e.f22519x;
        if (!d0Var.L()) {
            d.y("Expected applyChanges() to have been called");
            throw null;
        }
        if (((s.z) pVar.f19685t).f19249e <= 0 && this.f21693r.isEmpty()) {
            return false;
        }
        o(pVar, null);
        return d0Var.M();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:170:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x011f A[LOOP:6: B:37:0x00c8->B:56:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0182
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void K() {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.q.K():void");
    }

    public final void L() {
        P(this.F.f21707g);
        w0.b bVar = this.L;
        bVar.d(false);
        g2.u uVar = bVar.f22523d;
        q qVar = bVar.f22521a;
        q1 q1Var = qVar.F;
        if (q1Var.f21703c > 0) {
            int i2 = q1Var.f21709i;
            int i10 = uVar.b;
            if ((i10 > 0 ? uVar.f5593a[i10 - 1] : -2) != i2) {
                if (!bVar.f22522c && bVar.f22524e) {
                    bVar.d(false);
                    bVar.b.f22519x.O(w0.l.f22546c);
                    bVar.f22522c = true;
                }
                if (i2 > 0) {
                    c cVarA = q1Var.a(i2);
                    uVar.b(i2);
                    bVar.d(false);
                    w0.d0 d0Var = bVar.b.f22519x;
                    w0.k kVar = w0.k.f22545c;
                    int i11 = kVar.b;
                    d0Var.P(kVar);
                    u7.f.D(d0Var, 0, cVarA);
                    int i12 = d0Var.D;
                    int i13 = kVar.f22534a;
                    if (i12 != w0.d0.I(d0Var, i13) || d0Var.E != w0.d0.I(d0Var, i11)) {
                        StringBuilder sb2 = new StringBuilder();
                        int i14 = 0;
                        for (int i15 = 0; i15 < i13; i15++) {
                            if (((1 << i15) & d0Var.D) != 0) {
                                if (i14 > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(kVar.b(i15));
                                i14++;
                            }
                        }
                        String string = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        int i16 = 0;
                        for (int i17 = 0; i17 < i11; i17++) {
                            if (((1 << i17) & d0Var.E) != 0) {
                                if (i14 > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(kVar.c(i17));
                                i16++;
                            }
                        }
                        String string2 = sb3.toString();
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(kVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        sb4.append(i14);
                        sb4.append(" int arguments (");
                        t8.c.u(sb4, string, ") and ", i16, " object arguments (");
                        t8.c.t(sb4, string2, ").");
                        throw null;
                    }
                    bVar.f22522c = true;
                }
            }
        }
        bVar.b.f22519x.O(w0.s.f22557c);
        int i18 = bVar.f22525f;
        q1 q1Var2 = qVar.F;
        bVar.f22525f = q1Var2.b[(q1Var2.f21707g * 5) + 3] + i18;
    }

    public final void M(d1.d dVar) {
        p2.h0 h0Var = this.f21696u;
        if (h0Var == null) {
            h0Var = new p2.h0(18, (byte) 0);
            this.f21696u = h0Var;
        }
        ((SparseArray) h0Var.f16564u).put(this.F.f21707g, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    public final void N(int i2, int i10, int i11) {
        q1 q1Var = this.F;
        if (i2 == i10) {
            i11 = i2;
        } else if (i2 != i11 && i10 != i11) {
            int[] iArr = q1Var.b;
            int[] iArr2 = q1Var.b;
            int i12 = iArr[(i2 * 5) + 2];
            if (i12 == i10) {
                i11 = i10;
            } else {
                int i13 = iArr[(i10 * 5) + 2];
                if (i13 == i2) {
                    i11 = i2;
                } else if (i12 == i13) {
                    i11 = i12;
                } else {
                    int i14 = i2;
                    int i15 = 0;
                    while (i14 > 0 && i14 != i11) {
                        i14 = iArr2[(i14 * 5) + 2];
                        i15++;
                    }
                    int i16 = i10;
                    int i17 = 0;
                    while (i16 > 0 && i16 != i11) {
                        i16 = iArr2[(i16 * 5) + 2];
                        i17++;
                    }
                    int i18 = i15 - i17;
                    int i19 = i2;
                    for (int i20 = 0; i20 < i18; i20++) {
                        i19 = iArr[(i19 * 5) + 2];
                    }
                    int i21 = i17 - i15;
                    int i22 = i10;
                    for (int i23 = 0; i23 < i21; i23++) {
                        i22 = iArr[(i22 * 5) + 2];
                    }
                    i11 = i19;
                    for (int i24 = i22; i11 != i24; i24 = iArr[(i24 * 5) + 2]) {
                        i11 = iArr[(i11 * 5) + 2];
                    }
                }
            }
        }
        while (i2 > 0 && i2 != i11) {
            if (d.p(q1Var.b, i2)) {
                this.L.a();
            }
            i2 = q1Var.b[(i2 * 5) + 2];
        }
        p(i10, i11);
    }

    public final Object O() {
        if (!this.O) {
            Object objH = this.F.h();
            if (!this.f21699x || (objH instanceof o)) {
                return objH instanceof n1 ? ((n1) objH).f21661a : objH;
            }
        } else if (this.f21692q) {
            d.y("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return m.f21654a;
    }

    public final void P(int i2) {
        Q(this, i2, false, 0);
        this.L.c();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    public final void R() {
        int iRotateLeft;
        if (this.f21693r.isEmpty()) {
            this.f21687k = this.F.l() + this.f21687k;
            return;
        }
        q1 q1Var = this.F;
        int iF = q1Var.f();
        int[] iArr = q1Var.b;
        int i2 = q1Var.f21707g;
        Object objJ = i2 < q1Var.f21708h ? q1Var.j(iArr, i2) : null;
        Object objE = q1Var.e();
        int i10 = this.l;
        p0 p0Var = m.f21654a;
        if (objJ == null) {
            if (objE == null || iF != 207 || objE.equals(p0Var)) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ iF, 3) ^ i10;
            } else {
                this.P = Integer.rotateLeft(objE.hashCode() ^ Integer.rotateLeft(this.P, 3), 3) ^ i10;
            }
            Y(null, d.p(iArr, q1Var.f21707g));
            K();
            q1Var.d();
            if (objJ != null) {
                if (objJ instanceof Enum) {
                    this.P = Integer.rotateRight(Integer.hashCode(((Enum) objJ).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
                } else {
                    this.P = Integer.rotateRight(Integer.hashCode(objJ.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
                }
            }
            if (objE != null || iF != 207 || objE.equals(p0Var)) {
                this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i10, 3) ^ Integer.hashCode(iF), 3);
            } else {
                this.P = Integer.rotateRight(Integer.hashCode(objE.hashCode()) ^ Integer.rotateRight(this.P ^ i10, 3), 3);
                return;
            }
        }
        iRotateLeft = Integer.rotateLeft((objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        this.P = iRotateLeft;
        Y(null, d.p(iArr, q1Var.f21707g));
        K();
        q1Var.d();
        if (objJ != null) {
            if (objE != null) {
            }
            this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i10, 3) ^ Integer.hashCode(iF), 3);
        } else if (objJ instanceof Enum) {
            this.P = Integer.rotateRight(Integer.hashCode(((Enum) objJ).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
        } else {
            this.P = Integer.rotateRight(Integer.hashCode(objJ.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
        }
    }

    public final void S() {
        q1 q1Var = this.F;
        int i2 = q1Var.f21709i;
        this.f21687k = i2 >= 0 ? d.r(q1Var.b, i2) : 0;
        this.F.m();
    }

    public final void T() {
        if (this.f21687k != 0) {
            d.y("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        h1 h1VarB = B();
        if (h1VarB != null) {
            h1VarB.f21592a |= 16;
        }
        if (this.f21693r.isEmpty()) {
            S();
        } else {
            K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:223:0x0454  */
    /* JADX WARN: Code duplicated, block: B:226:0x046f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0475 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0477 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x0479  */
    /* JADX WARN: Code duplicated, block: B:231:0x047f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0482  */
    /* JADX WARN: Code duplicated, block: B:237:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:238:0x04af  */
    /* JADX WARN: Code duplicated, block: B:240:0x04b5 A[PHI: r0
  0x04b5: PHI (r0v1 v0.q) = (r0v0 v0.q), (r0v3 v0.q) binds: [B:76:0x014d, B:220:0x043b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v5, types: [d1.d] */
    public final void U(Object obj, int i2, Object obj2, int i10) throws Throwable {
        int iRotateLeft;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        d1 d1Var;
        d1 d1Var2;
        ArrayList arrayList;
        s.r rVar;
        int i11;
        Object objValueOf;
        s.z zVar;
        Object objE;
        ?? r9;
        t1 t1Var;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        int i15;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i16;
        q1 q1Var;
        int[] iArr;
        ArrayList arrayList2;
        int i17;
        boolean z15;
        ?? R;
        q1 q1Var2;
        int i18;
        Object objJ;
        t1 t1Var2;
        int i19;
        d1 d1Var3;
        q qVar = this;
        Object obj3 = obj;
        Throwable th = null;
        if (qVar.f21692q) {
            d.y("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i20 = qVar.l;
        p0 p0Var = m.f21654a;
        if (obj3 == null) {
            if (obj2 == null || i2 != 207 || obj2.equals(p0Var)) {
                iRotateLeft = i20 ^ Integer.rotateLeft(Integer.rotateLeft(qVar.P, 3) ^ i2, 3);
            } else {
                qVar.P = i20 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(qVar.P, 3), 3);
            }
            z10 = true;
            if (obj3 == null) {
                qVar.l++;
            }
            if (i10 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (qVar.O) {
                qVar.F.f21711k++;
                t1Var2 = qVar.H;
                i19 = t1Var2.f21742s;
                if (z11) {
                    t1Var2.G(p0Var, p0Var, true, i2);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = p0Var;
                    }
                    t1Var2.G(obj3, obj2, false, i2);
                } else {
                    if (obj3 == null) {
                        obj3 = p0Var;
                    }
                    t1Var2.G(obj3, p0Var, false, i2);
                }
                d1Var3 = qVar.f21685i;
                if (d1Var3 != null) {
                    int i21 = (-2) - i19;
                    m0 m0Var = new m0(-1, i2, i21, -1);
                    d1Var3.f21568e.h(i21, new h0(-1, qVar.f21686j - d1Var3.b, 0));
                    d1Var3.f21567d.add(m0Var);
                }
                qVar.y(z11, null);
                return;
            }
            if (i10 != 1 && qVar.f21699x) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (qVar.f21685i == null) {
                int iF = qVar.F.f();
                if (!z12 && iF == i2) {
                    q1Var2 = qVar.F;
                    i18 = q1Var2.f21707g;
                    if (i18 < q1Var2.f21708h) {
                        objJ = q1Var2.j(q1Var2.b, i18);
                    } else {
                        objJ = null;
                    }
                    if (kotlin.jvm.internal.l.a(obj3, objJ)) {
                        qVar.Y(obj2, z11);
                        z13 = z12;
                        z14 = true;
                        th = null;
                    }
                }
                q1Var = qVar.F;
                iArr = q1Var.b;
                arrayList2 = new ArrayList();
                if (q1Var.f21711k > 0) {
                    i17 = q1Var.f21707g;
                    while (i17 < q1Var.f21708h) {
                        int i22 = i17 * 5;
                        z15 = z10;
                        int i23 = iArr[i22];
                        Object objJ2 = q1Var.j(iArr, i17);
                        if (d.p(iArr, i17)) {
                            R = z15;
                        } else {
                            R = d.r(iArr, i17);
                        }
                        arrayList2.add(new m0(objJ2, i23, i17, R));
                        i17 += iArr[i22 + 3];
                        z12 = z12;
                        z10 = z15;
                    }
                }
                z13 = z12;
                z14 = z10;
                qVar.f21685i = new d1(qVar.f21686j, arrayList2);
            } else {
                z13 = z12;
                z14 = true;
                th = null;
            }
            d1Var = qVar.f21685i;
            if (d1Var != null) {
                arrayList = d1Var.f21567d;
                rVar = d1Var.f21568e;
                i11 = d1Var.b;
                if (obj3 != null) {
                    objValueOf = new l0(Integer.valueOf(i2), obj3);
                } else {
                    objValueOf = Integer.valueOf(i2);
                }
                zVar = ((t0) d1Var.f21569f.getValue()).f21725a;
                objE = zVar.e(objValueOf);
                if (objE != null) {
                    if ((objE instanceof List) || ((objE instanceof jf.a) && !(objE instanceof jf.c))) {
                        zVar.g(objValueOf);
                    } else {
                        List listB = kotlin.jvm.internal.a0.b(objE);
                        Object objRemove = listB.remove(0);
                        if (listB.isEmpty()) {
                            zVar.g(objValueOf);
                        }
                        objE = objRemove;
                    }
                    objE.getClass();
                } else {
                    objE = th;
                }
                m0 m0Var2 = (m0) objE;
                if (!z13 || m0Var2 == null) {
                    qVar.F.f21711k++;
                    qVar.O = true;
                    r9 = th;
                    qVar.J = r9;
                    if (qVar.H.f21745v) {
                        t1 t1VarE = qVar.G.e();
                        qVar.H = t1VarE;
                        t1VarE.C();
                        qVar.I = false;
                        qVar.J = r9;
                    }
                    qVar.H.d();
                    t1Var = qVar.H;
                    int i24 = t1Var.f21742s;
                    if (z11) {
                        t1Var.G(p0Var, p0Var, true, i2);
                        i12 = 0;
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = p0Var;
                        }
                        i12 = 0;
                        t1Var.G(obj3, obj2, false, i2);
                    } else {
                        i12 = 0;
                        if (obj3 == null) {
                            obj3 = p0Var;
                        }
                        t1Var.G(obj3, p0Var, false, i2);
                    }
                    qVar.M = qVar.H.b(i24);
                    int i25 = (-2) - i24;
                    m0 m0Var3 = new m0(-1, i2, i25, -1);
                    rVar.h(i25, new h0(-1, qVar.f21686j - i11, i12));
                    arrayList.add(m0Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z11) {
                        i13 = i12;
                    } else {
                        i13 = qVar.f21686j;
                    }
                    d1Var2 = new d1(i13, arrayList3);
                } else {
                    int i26 = m0Var2.f21656c;
                    arrayList.add(m0Var2);
                    h0 h0Var = (h0) rVar.f(i26);
                    qVar.f21686j = (h0Var != null ? h0Var.b : -1) + i11;
                    h0 h0Var2 = (h0) rVar.f(i26);
                    int i27 = h0Var2 != null ? h0Var2.f21590a : -1;
                    int i28 = d1Var.f21566c;
                    int i29 = i27 - i28;
                    int i30 = 8;
                    if (i27 > i28) {
                        Object[] objArr5 = rVar.f19213c;
                        long[] jArr = rVar.f19212a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i31 = 0;
                            while (true) {
                                long j10 = jArr[i31];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i32 = 8 - ((~(i31 - length)) >>> 31);
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        if ((j10 & 255) < 128) {
                                            i16 = i30;
                                            h0 h0Var3 = (h0) objArr5[(i31 << 3) + i33];
                                            objArr4 = objArr5;
                                            int i34 = h0Var3.f21590a;
                                            if (i34 == i27) {
                                                h0Var3.f21590a = i28;
                                            } else if (i28 <= i34 && i34 < i27) {
                                                h0Var3.f21590a = i34 + 1;
                                            }
                                        } else {
                                            objArr4 = objArr5;
                                            i16 = i30;
                                        }
                                        j10 >>= i16;
                                        i33++;
                                        i30 = i16;
                                        objArr5 = objArr4;
                                    }
                                    objArr3 = objArr5;
                                    if (i32 != i30) {
                                        break;
                                    }
                                } else {
                                    objArr3 = objArr5;
                                }
                                if (i31 == length) {
                                    break;
                                }
                                i31++;
                                objArr5 = objArr3;
                                i30 = 8;
                            }
                        }
                    } else if (i28 > i27) {
                        Object[] objArr6 = rVar.f19213c;
                        long[] jArr2 = rVar.f19212a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i35 = 0;
                            while (true) {
                                long j11 = jArr2[i35];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        if ((j11 & 255) < 128) {
                                            h0 h0Var4 = (h0) objArr6[(i35 << 3) + i37];
                                            objArr2 = objArr6;
                                            int i38 = h0Var4.f21590a;
                                            if (i38 == i27) {
                                                h0Var4.f21590a = i28;
                                                i15 = i27;
                                            } else {
                                                i15 = i27;
                                                if (i15 + 1 <= i38 && i38 < i28) {
                                                    h0Var4.f21590a = i38 - 1;
                                                }
                                            }
                                        } else {
                                            i15 = i27;
                                            objArr2 = objArr6;
                                        }
                                        j11 >>= 8;
                                        i37++;
                                        i27 = i15;
                                        objArr6 = objArr2;
                                    }
                                    i14 = i27;
                                    objArr = objArr6;
                                    if (i36 != 8) {
                                        break;
                                    }
                                } else {
                                    i14 = i27;
                                    objArr = objArr6;
                                }
                                if (i35 == length2) {
                                    break;
                                }
                                i35++;
                                i27 = i14;
                                objArr6 = objArr;
                            }
                        }
                    }
                    w0.b bVar = qVar.L;
                    int i39 = bVar.f22525f;
                    q qVar2 = bVar.f22521a;
                    bVar.f22525f = (i26 - qVar2.F.f21707g) + i39;
                    qVar.F.k(i26);
                    if (i29 > 0) {
                        bVar.d(false);
                        g2.u uVar = bVar.f22523d;
                        q1 q1Var3 = qVar2.F;
                        if (q1Var3.f21703c > 0) {
                            int i40 = q1Var3.f21709i;
                            int i41 = uVar.b;
                            if ((i41 > 0 ? uVar.f5593a[i41 - 1] : -2) != i40) {
                                if (!bVar.f22522c && bVar.f22524e) {
                                    bVar.d(false);
                                    bVar.b.f22519x.O(w0.l.f22546c);
                                    bVar.f22522c = z14;
                                }
                                if (i40 > 0) {
                                    c cVarA = q1Var3.a(i40);
                                    uVar.b(i40);
                                    bVar.d(false);
                                    w0.d0 d0Var = bVar.b.f22519x;
                                    w0.k kVar = w0.k.f22545c;
                                    int i42 = kVar.b;
                                    d0Var.P(kVar);
                                    u7.f.D(d0Var, 0, cVarA);
                                    int i43 = d0Var.D;
                                    int i44 = kVar.f22534a;
                                    if (i43 != w0.d0.I(d0Var, i44) || d0Var.E != w0.d0.I(d0Var, i42)) {
                                        int i45 = 1;
                                        StringBuilder sb2 = new StringBuilder();
                                        int i46 = 0;
                                        int i47 = 0;
                                        while (i46 < i44) {
                                            if ((d0Var.D & (i45 << i46)) != 0) {
                                                if (i47 > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(kVar.b(i46));
                                                i47++;
                                            }
                                            i46++;
                                            i45 = 1;
                                        }
                                        String string = sb2.toString();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i48 = 0;
                                        int i49 = 0;
                                        while (i48 < i42) {
                                            int i50 = i42;
                                            if ((d0Var.E & (1 << i48)) != 0) {
                                                if (i47 > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(kVar.c(i48));
                                                i49++;
                                            }
                                            i48++;
                                            i42 = i50;
                                        }
                                        String string2 = sb3.toString();
                                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                        sb4.append(kVar);
                                        sb4.append(". Not all arguments were provided. Missing ");
                                        sb4.append(i47);
                                        sb4.append(" int arguments (");
                                        t8.c.u(sb4, string, ") and ", i49, " object arguments (");
                                        t8.c.t(sb4, string2, ").");
                                        throw th;
                                    }
                                    bVar.f22522c = true;
                                }
                            }
                        }
                        w0.d0 d0Var2 = bVar.b.f22519x;
                        w0.p pVar = w0.p.f22554c;
                        int i51 = pVar.b;
                        d0Var2.P(pVar);
                        u7.f.C(d0Var2, 0, i29);
                        int i52 = d0Var2.D;
                        int i53 = pVar.f22534a;
                        if (i52 != w0.d0.I(d0Var2, i53) || d0Var2.E != w0.d0.I(d0Var2, i51)) {
                            StringBuilder sb5 = new StringBuilder();
                            int i54 = 0;
                            for (int i55 = 0; i55 < i53; i55++) {
                                if (((1 << i55) & d0Var2.D) != 0) {
                                    if (i54 > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(pVar.b(i55));
                                    i54++;
                                }
                            }
                            String string3 = sb5.toString();
                            StringBuilder sb6 = new StringBuilder();
                            int i56 = 0;
                            int i57 = 0;
                            while (i56 < i51) {
                                int i58 = i51;
                                if ((d0Var2.E & (1 << i56)) != 0) {
                                    if (i54 > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(pVar.c(i56));
                                    i57++;
                                }
                                i56++;
                                i51 = i58;
                            }
                            String string4 = sb6.toString();
                            StringBuilder sb7 = new StringBuilder("Error while pushing ");
                            sb7.append(pVar);
                            sb7.append(". Not all arguments were provided. Missing ");
                            sb7.append(i54);
                            sb7.append(" int arguments (");
                            t8.c.u(sb7, string3, ") and ", i57, " object arguments (");
                            t8.c.t(sb7, string4, ").");
                            throw th;
                        }
                    }
                    qVar = this;
                    qVar.Y(obj2, z11);
                    d1Var2 = null;
                }
            } else {
                d1Var2 = null;
            }
            qVar.y(z11, d1Var2);
        }
        iRotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()) ^ Integer.rotateLeft(qVar.P, 3), 3);
        qVar.P = iRotateLeft;
        z10 = true;
        if (obj3 == null) {
            qVar.l++;
        }
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar.O) {
            qVar.F.f21711k++;
            t1Var2 = qVar.H;
            i19 = t1Var2.f21742s;
            if (z11) {
                t1Var2.G(p0Var, p0Var, true, i2);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = p0Var;
                }
                t1Var2.G(obj3, obj2, false, i2);
            } else {
                if (obj3 == null) {
                    obj3 = p0Var;
                }
                t1Var2.G(obj3, p0Var, false, i2);
            }
            d1Var3 = qVar.f21685i;
            if (d1Var3 != null) {
                int i210 = (-2) - i19;
                m0 m0Var4 = new m0(-1, i2, i210, -1);
                d1Var3.f21568e.h(i210, new h0(-1, qVar.f21686j - d1Var3.b, 0));
                d1Var3.f21567d.add(m0Var4);
            }
            qVar.y(z11, null);
            return;
        }
        if (i10 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (qVar.f21685i == null) {
            int iF2 = qVar.F.f();
            if (!z12) {
                q1Var2 = qVar.F;
                i18 = q1Var2.f21707g;
                if (i18 < q1Var2.f21708h) {
                    objJ = q1Var2.j(q1Var2.b, i18);
                } else {
                    objJ = null;
                }
                if (kotlin.jvm.internal.l.a(obj3, objJ)) {
                    qVar.Y(obj2, z11);
                    z13 = z12;
                    z14 = true;
                    th = null;
                }
            }
            q1Var = qVar.F;
            iArr = q1Var.b;
            arrayList2 = new ArrayList();
            if (q1Var.f21711k > 0) {
                i17 = q1Var.f21707g;
                while (i17 < q1Var.f21708h) {
                    int i211 = i17 * 5;
                    z15 = z10;
                    int i212 = iArr[i211];
                    Object objJ3 = q1Var.j(iArr, i17);
                    if (d.p(iArr, i17)) {
                        R = z15;
                    } else {
                        R = d.r(iArr, i17);
                    }
                    arrayList2.add(new m0(objJ3, i212, i17, R));
                    i17 += iArr[i211 + 3];
                    z12 = z12;
                    z10 = z15;
                }
            }
            z13 = z12;
            z14 = z10;
            qVar.f21685i = new d1(qVar.f21686j, arrayList2);
        } else {
            z13 = z12;
            z14 = true;
            th = null;
        }
        d1Var = qVar.f21685i;
        if (d1Var != null) {
            arrayList = d1Var.f21567d;
            rVar = d1Var.f21568e;
            i11 = d1Var.b;
            if (obj3 != null) {
                objValueOf = new l0(Integer.valueOf(i2), obj3);
            } else {
                objValueOf = Integer.valueOf(i2);
            }
            zVar = ((t0) d1Var.f21569f.getValue()).f21725a;
            objE = zVar.e(objValueOf);
            if (objE != null) {
                if (objE instanceof List) {
                    zVar.g(objValueOf);
                } else {
                    zVar.g(objValueOf);
                }
                objE.getClass();
            } else {
                objE = th;
            }
            m0 m0Var5 = (m0) objE;
            if (z13) {
            }
            qVar.F.f21711k++;
            qVar.O = true;
            r9 = th;
            qVar.J = r9;
            if (qVar.H.f21745v) {
                t1 t1VarE2 = qVar.G.e();
                qVar.H = t1VarE2;
                t1VarE2.C();
                qVar.I = false;
                qVar.J = r9;
            }
            qVar.H.d();
            t1Var = qVar.H;
            int i213 = t1Var.f21742s;
            if (z11) {
                t1Var.G(p0Var, p0Var, true, i2);
                i12 = 0;
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = p0Var;
                }
                i12 = 0;
                t1Var.G(obj3, obj2, false, i2);
            } else {
                i12 = 0;
                if (obj3 == null) {
                    obj3 = p0Var;
                }
                t1Var.G(obj3, p0Var, false, i2);
            }
            qVar.M = qVar.H.b(i213);
            int i214 = (-2) - i213;
            m0 m0Var6 = new m0(-1, i2, i214, -1);
            rVar.h(i214, new h0(-1, qVar.f21686j - i11, i12));
            arrayList.add(m0Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z11) {
                i13 = i12;
            } else {
                i13 = qVar.f21686j;
            }
            d1Var2 = new d1(i13, arrayList4);
        } else {
            d1Var2 = null;
        }
        qVar.y(z11, d1Var2);
    }

    public final void V() {
        U(null, -127, null, 0);
    }

    public final void W(int i2, v0 v0Var) throws Throwable {
        U(v0Var, i2, null, 0);
    }

    public final void X(int i2, Object obj) throws Throwable {
        U(obj, i2, null, 0);
    }

    public final void Y(Object obj, boolean z10) {
        if (z10) {
            q1 q1Var = this.F;
            if (q1Var.f21711k <= 0) {
                if (d.p(q1Var.b, q1Var.f21707g)) {
                    q1Var.n();
                    return;
                } else {
                    d.c0("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            w0.b bVar = this.L;
            bVar.getClass();
            bVar.d(false);
            w0.d0 d0Var = bVar.b.f22519x;
            w0.y yVar = w0.y.f22563c;
            int i2 = yVar.b;
            d0Var.P(yVar);
            u7.f.D(d0Var, 0, obj);
            int i10 = d0Var.D;
            int i11 = yVar.f22534a;
            if (i10 != w0.d0.I(d0Var, i11) || d0Var.E != w0.d0.I(d0Var, i2)) {
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    if (((1 << i13) & d0Var.D) != 0) {
                        if (i12 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(yVar.b(i13));
                        i12++;
                    }
                }
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                int i14 = 0;
                for (int i15 = 0; i15 < i2; i15++) {
                    if (((1 << i15) & d0Var.E) != 0) {
                        if (i12 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(yVar.c(i15));
                        i14++;
                    }
                }
                String string2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(yVar);
                sb4.append(". Not all arguments were provided. Missing ");
                sb4.append(i12);
                sb4.append(" int arguments (");
                t8.c.u(sb4, string, ") and ", i14, " object arguments (");
                t8.c.t(sb4, string2, ").");
                throw null;
            }
        }
        this.F.n();
    }

    public final void Z(int i2) {
        int i10;
        int i11;
        if (this.f21685i != null) {
            U(null, i2, null, 0);
            return;
        }
        if (this.f21692q) {
            d.y("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.P = this.l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i2, 3);
        this.l++;
        q1 q1Var = this.F;
        boolean z10 = this.O;
        p0 p0Var = m.f21654a;
        if (z10) {
            q1Var.f21711k++;
            this.H.G(p0Var, p0Var, false, i2);
            y(false, null);
            return;
        }
        if (q1Var.f() == i2 && ((i11 = q1Var.f21707g) >= q1Var.f21708h || !d.o(q1Var.b, i11))) {
            q1Var.n();
            y(false, null);
            return;
        }
        if (q1Var.f21711k <= 0 && (i10 = q1Var.f21707g) != q1Var.f21708h) {
            int i12 = this.f21686j;
            L();
            this.L.e(i12, q1Var.l());
            d.t(i10, q1Var.f21707g, this.f21693r);
        }
        q1Var.f21711k++;
        this.O = true;
        this.J = null;
        if (this.H.f21745v) {
            t1 t1VarE = this.G.e();
            this.H = t1VarE;
            t1VarE.C();
            this.I = false;
            this.J = null;
        }
        t1 t1Var = this.H;
        t1Var.d();
        int i13 = t1Var.f21742s;
        t1Var.G(p0Var, p0Var, false, i2);
        this.M = t1Var.b(i13);
        y(false, null);
    }

    public final void a() {
        i();
        this.f21684h.f8904t.clear();
        this.f21688m.b = 0;
        this.f21694s.b = 0;
        this.f21698w.b = 0;
        this.f21696u = null;
        w0.c cVar = this.N;
        cVar.f22533y.J();
        cVar.f22532x.J();
        this.P = 0;
        this.f21701z = 0;
        this.f21692q = false;
        this.O = false;
        this.f21699x = false;
        this.E = false;
        this.f21700y = -1;
        q1 q1Var = this.F;
        if (!q1Var.f21706f) {
            q1Var.c();
        }
        if (this.H.f21745v) {
            return;
        }
        z();
    }

    public final void a0(int i2) throws Throwable {
        U(null, i2, null, 0);
    }

    public final void b(Object obj, hf.e eVar) {
        if (this.O) {
            w0.d0 d0Var = this.N.f22532x;
            w0.z zVar = w0.z.f22564c;
            int i2 = zVar.b;
            d0Var.P(zVar);
            u7.f.D(d0Var, 0, obj);
            eVar.getClass();
            kotlin.jvm.internal.a0.d(2, eVar);
            u7.f.D(d0Var, 1, eVar);
            int i10 = d0Var.D;
            int i11 = zVar.f22534a;
            if (i10 == w0.d0.I(d0Var, i11) && d0Var.E == w0.d0.I(d0Var, i2)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                if (((1 << i13) & d0Var.D) != 0) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(zVar.b(i13));
                    i12++;
                }
            }
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            int i14 = 0;
            int i15 = 0;
            while (i15 < i2) {
                int i16 = i2;
                if (((1 << i15) & d0Var.E) != 0) {
                    if (i12 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(zVar.c(i15));
                    i14++;
                }
                i15++;
                i2 = i16;
            }
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(zVar);
            sb4.append(". Not all arguments were provided. Missing ");
            sb4.append(i12);
            sb4.append(" int arguments (");
            t8.c.u(sb4, string, ") and ", i14, " object arguments (");
            t8.c.t(sb4, string2, ").");
            throw null;
        }
        w0.b bVar = this.L;
        bVar.b();
        w0.d0 d0Var2 = bVar.b.f22519x;
        w0.z zVar2 = w0.z.f22564c;
        int i17 = zVar2.b;
        d0Var2.P(zVar2);
        u7.f.D(d0Var2, 0, obj);
        eVar.getClass();
        kotlin.jvm.internal.a0.d(2, eVar);
        u7.f.D(d0Var2, 1, eVar);
        int i18 = d0Var2.D;
        int i19 = zVar2.f22534a;
        if (i18 == w0.d0.I(d0Var2, i19) && d0Var2.E == w0.d0.I(d0Var2, i17)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        int i20 = 0;
        for (int i21 = 0; i21 < i19; i21++) {
            if (((1 << i21) & d0Var2.D) != 0) {
                if (i20 > 0) {
                    sb5.append(", ");
                }
                sb5.append(zVar2.b(i21));
                i20++;
            }
        }
        String string3 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        int i22 = 0;
        for (int i23 = 0; i23 < i17; i23++) {
            if (((1 << i23) & d0Var2.E) != 0) {
                if (i20 > 0) {
                    sb6.append(", ");
                }
                sb6.append(zVar2.c(i23));
                i22++;
            }
        }
        String string4 = sb6.toString();
        StringBuilder sb7 = new StringBuilder("Error while pushing ");
        sb7.append(zVar2);
        sb7.append(". Not all arguments were provided. Missing ");
        sb7.append(i20);
        sb7.append(" int arguments (");
        t8.c.u(sb7, string3, ") and ", i22, " object arguments (");
        t8.c.t(sb7, string4, ").");
        throw null;
    }

    public final q b0(int i2) {
        h1 h1Var;
        Z(i2);
        boolean z10 = this.O;
        jg.m mVar = this.D;
        u uVar = this.f21683g;
        if (z10) {
            h1 h1Var2 = new h1(uVar);
            mVar.f8904t.add(h1Var2);
            j0(h1Var2);
            h1Var2.f21595e = this.A;
            h1Var2.f21592a &= -17;
            return this;
        }
        int i10 = this.F.f21709i;
        ArrayList arrayList = this.f21693r;
        int iG = d.G(i10, arrayList);
        k0 k0Var = iG >= 0 ? (k0) arrayList.remove(iG) : null;
        Object objH = this.F.h();
        if (kotlin.jvm.internal.l.a(objH, m.f21654a)) {
            h1Var = new h1(uVar);
            j0(h1Var);
        } else {
            objH.getClass();
            h1Var = (h1) objH;
        }
        boolean z11 = true;
        if (k0Var == null) {
            int i11 = h1Var.f21592a;
            boolean z12 = (i11 & 64) != 0;
            if (z12) {
                h1Var.f21592a = i11 & (-65);
            }
            if (!z12) {
                z11 = false;
            }
        }
        int i12 = h1Var.f21592a;
        if (z11) {
            h1Var.f21592a = i12 | 8;
        } else {
            h1Var.f21592a = i12 & (-9);
        }
        mVar.f8904t.add(h1Var);
        h1Var.f21595e = this.A;
        h1Var.f21592a &= -17;
        return this;
    }

    public final boolean c(float f10) {
        Object objH = H();
        if ((objH instanceof Float) && f10 == ((Number) objH).floatValue()) {
            return false;
        }
        j0(Float.valueOf(f10));
        return true;
    }

    public final void c0(Object obj) throws Throwable {
        if (!this.O && this.F.f() == 207 && !kotlin.jvm.internal.l.a(this.F.e(), obj) && this.f21700y < 0) {
            this.f21700y = this.F.f21707g;
            this.f21699x = true;
        }
        U(null, 207, obj, 0);
    }

    public final boolean d(int i2) {
        Object objH = H();
        if ((objH instanceof Integer) && i2 == ((Number) objH).intValue()) {
            return false;
        }
        j0(Integer.valueOf(i2));
        return true;
    }

    public final void d0() {
        U(null, 125, null, 2);
        this.f21692q = true;
    }

    public final boolean e(long j10) {
        Object objH = H();
        if ((objH instanceof Long) && j10 == ((Number) objH).longValue()) {
            return false;
        }
        j0(Long.valueOf(j10));
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e0() throws Throwable {
        this.l = 0;
        r1 r1Var = this.f21679c;
        this.F = r1Var.d();
        U(null, 100, null, 0);
        s sVar = this.b;
        sVar.m();
        this.f21695t = sVar.f();
        this.f21698w.b(this.f21697v ? 1 : 0);
        this.f21697v = f(this.f21695t);
        this.J = null;
        if (!this.f21691p) {
            this.f21691p = sVar.d();
        }
        if (!this.B) {
            this.B = sVar.e();
        }
        Set set = (Set) d.U(this.f21695t, g1.b.f5455a);
        if (set != null) {
            set.add(r1Var);
            sVar.j(set);
        }
        U(null, sVar.g(), null, 0);
    }

    public final boolean f(Object obj) {
        if (kotlin.jvm.internal.l.a(H(), obj)) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final boolean f0(h1 h1Var, Object obj) {
        c cVar = h1Var.f21593c;
        if (cVar == null) {
            return false;
        }
        int iA = this.F.f21702a.a(cVar);
        if (!this.E || iA < this.F.f21707g) {
            return false;
        }
        ArrayList arrayList = this.f21693r;
        int iG = d.G(iA, arrayList);
        if (iG < 0) {
            int i2 = -(iG + 1);
            if (!(obj instanceof c0)) {
                obj = null;
            }
            arrayList.add(i2, new k0(h1Var, iA, obj));
            return true;
        }
        k0 k0Var = (k0) arrayList.get(iG);
        if (!(obj instanceof c0)) {
            k0Var.f21623c = null;
            return true;
        }
        Object obj2 = k0Var.f21623c;
        if (obj2 == null) {
            k0Var.f21623c = obj;
            return true;
        }
        if (obj2 instanceof s.c0) {
            ((s.c0) obj2).a(obj);
            return true;
        }
        int i10 = s.h0.f19185a;
        s.c0 c0Var = new s.c0(2);
        c0Var.b[c0Var.d(obj2)] = obj2;
        c0Var.b[c0Var.d(obj)] = obj;
        k0Var.f21623c = c0Var;
        return true;
    }

    public final boolean g(boolean z10) {
        Object objH = H();
        if ((objH instanceof Boolean) && z10 == ((Boolean) objH).booleanValue()) {
            return false;
        }
        j0(Boolean.valueOf(z10));
        return true;
    }

    public final void g0(int i2, int i10) {
        if (k0(i2) != i10) {
            if (i2 < 0) {
                s.p pVar = this.f21690o;
                if (pVar == null) {
                    pVar = new s.p();
                    this.f21690o = pVar;
                }
                pVar.g(i2, i10);
                return;
            }
            int[] iArr = this.f21689n;
            if (iArr == null) {
                int i11 = this.F.f21703c;
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, 0, i11, -1);
                this.f21689n = iArr2;
                iArr = iArr2;
            }
            iArr[i2] = i10;
        }
    }

    public final boolean h(Object obj) {
        if (H() == obj) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void h0(int i2, int i10) {
        int iK0 = k0(i2);
        if (iK0 != i10) {
            int i11 = i10 - iK0;
            jg.m mVar = this.f21684h;
            int size = mVar.f8904t.size() - 1;
            while (i2 != -1) {
                int iK1 = k0(i2) + i11;
                g0(i2, iK1);
                for (int i12 = size; -1 < i12; i12--) {
                    d1 d1Var = (d1) mVar.f8904t.get(i12);
                    if (d1Var != null && d1Var.a(i2, iK1)) {
                        size = i12 - 1;
                        break;
                    }
                }
                q1 q1Var = this.F;
                if (i2 < 0) {
                    i2 = q1Var.f21709i;
                } else if (d.p(q1Var.b, i2)) {
                    return;
                } else {
                    i2 = this.F.b[(i2 * 5) + 2];
                }
            }
        }
    }

    public final void i() {
        this.f21685i = null;
        this.f21686j = 0;
        this.f21687k = 0;
        this.P = 0;
        this.f21692q = false;
        w0.b bVar = this.L;
        bVar.f22522c = false;
        bVar.f22523d.b = 0;
        bVar.f22525f = 0;
        this.D.f8904t.clear();
        this.f21689n = null;
        this.f21690o = null;
    }

    public final void i0(Object obj) {
        int i2;
        q1 q1Var;
        int i10;
        t1 t1Var;
        if (obj instanceof m1) {
            c cVarA = null;
            if (this.O) {
                w0.d0 d0Var = this.L.b.f22519x;
                w0.r rVar = w0.r.f22556c;
                int i11 = rVar.b;
                d0Var.P(rVar);
                u7.f.D(d0Var, 0, (m1) obj);
                int i12 = d0Var.D;
                int i13 = rVar.f22534a;
                if (i12 != w0.d0.I(d0Var, i13) || d0Var.E != w0.d0.I(d0Var, i11)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i14 = 0;
                    for (int i15 = 0; i15 < i13; i15++) {
                        if (((1 << i15) & d0Var.D) != 0) {
                            if (i14 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(rVar.b(i15));
                            i14++;
                        }
                    }
                    String string = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i16 = 0;
                    for (int i17 = 0; i17 < i11; i17++) {
                        if (((1 << i17) & d0Var.E) != 0) {
                            if (i14 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(rVar.c(i17));
                            i16++;
                        }
                    }
                    String string2 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(rVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    sb4.append(i14);
                    sb4.append(" int arguments (");
                    t8.c.u(sb4, string, ") and ", i16, " object arguments (");
                    t8.c.t(sb4, string2, ").");
                    throw null;
                }
            }
            this.f21680d.add(obj);
            m1 m1Var = (m1) obj;
            if (this.O) {
                t1 t1Var2 = this.H;
                int i18 = t1Var2.f21742s;
                if (i18 > t1Var2.f21744u + 1) {
                    int i19 = i18 - 1;
                    int iX = t1Var2.x(t1Var2.b, i19);
                    while (true) {
                        i10 = i19;
                        i19 = iX;
                        t1Var = this.H;
                        if (i19 == t1Var.f21744u || i19 < 0) {
                            break;
                        } else {
                            iX = t1Var.x(t1Var.b, i19);
                        }
                    }
                    cVarA = t1Var.b(i10);
                }
            } else {
                q1 q1Var2 = this.F;
                int i20 = q1Var2.f21707g;
                if (i20 > q1Var2.f21709i + 1) {
                    int i21 = i20 - 1;
                    int i22 = q1Var2.b[(i21 * 5) + 2];
                    while (true) {
                        i2 = i21;
                        i21 = i22;
                        q1Var = this.F;
                        if (i21 == q1Var.f21709i || i21 < 0) {
                            break;
                        } else {
                            i22 = q1Var.b[(i21 * 5) + 2];
                        }
                    }
                    cVarA = q1Var.a(i2);
                }
            }
            n1 n1Var = new n1();
            n1Var.f21661a = m1Var;
            n1Var.b = cVarA;
            obj = n1Var;
        }
        j0(obj);
    }

    public final int j(int i2, int i10, int i11, int i12) {
        int iHashCode;
        Object objB;
        if (i2 == i11) {
            return i12;
        }
        q1 q1Var = this.F;
        int[] iArr = q1Var.b;
        if (d.o(iArr, i2)) {
            Object objJ = q1Var.j(iArr, i2);
            if (objJ != null) {
                iHashCode = objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode();
            } else {
                iHashCode = 0;
            }
        } else {
            int i13 = q1Var.b[i2 * 5];
            iHashCode = (i13 != 207 || (objB = q1Var.b(iArr, i2)) == null || objB.equals(m.f21654a)) ? i13 : objB.hashCode();
        }
        if (iHashCode == 126665345) {
            return iHashCode;
        }
        int i14 = this.F.b[(i2 * 5) + 2];
        if (i14 != i11) {
            i12 = j(i14, I(i14), i11, i12);
        }
        if (d.o(this.F.b, i2)) {
            i10 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i12, 3) ^ iHashCode, 3) ^ i10;
    }

    public final void j0(Object obj) {
        int i2;
        int i10;
        if (this.O) {
            t1 t1Var = this.H;
            if (t1Var.f21737n > 0) {
                t1Var.s(1, t1Var.f21744u);
            }
            Object[] objArr = t1Var.f21727c;
            int i11 = t1Var.f21733i;
            t1Var.f21733i = i11 + 1;
            Object obj2 = objArr[t1Var.g(i11)];
            int i12 = t1Var.f21733i;
            if (i12 <= t1Var.f21734j) {
                t1Var.f21727c[t1Var.g(i12 - 1)] = obj;
                return;
            } else {
                d.y("Writing to an invalid slot");
                throw null;
            }
        }
        q1 q1Var = this.F;
        boolean z10 = q1Var.f21713n;
        w0.b bVar = this.L;
        int i13 = 0;
        if (!z10) {
            c cVarA = q1Var.a(q1Var.f21709i);
            w0.d0 d0Var = bVar.b.f22519x;
            w0.e eVar = w0.e.f22539c;
            int i14 = eVar.b;
            d0Var.P(eVar);
            u7.f.D(d0Var, 0, cVarA);
            u7.f.D(d0Var, 1, obj);
            int i15 = d0Var.D;
            int i16 = eVar.f22534a;
            if (i15 == w0.d0.I(d0Var, i16) && d0Var.E == w0.d0.I(d0Var, i14)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i17 = 0;
            for (int i18 = 0; i18 < i16; i18++) {
                if (((1 << i18) & d0Var.D) != 0) {
                    if (i17 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(eVar.b(i18));
                    i17++;
                }
            }
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            int i19 = 0;
            for (int i20 = 0; i20 < i14; i20++) {
                if (((1 << i20) & d0Var.E) != 0) {
                    if (i17 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(eVar.c(i20));
                    i19++;
                }
            }
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(eVar);
            sb4.append(". Not all arguments were provided. Missing ");
            sb4.append(i17);
            sb4.append(" int arguments (");
            t8.c.u(sb4, string, ") and ", i19, " object arguments (");
            t8.c.t(sb4, string2, ").");
            throw null;
        }
        int iU = (q1Var.l - d.u(q1Var.b, q1Var.f21709i)) - 1;
        if (bVar.f22521a.F.f21709i - bVar.f22525f >= 0) {
            bVar.d(true);
            w0.d0 d0Var2 = bVar.b.f22519x;
            w0.m mVar = w0.m.f22550g;
            d0Var2.P(mVar);
            u7.f.D(d0Var2, 0, obj);
            u7.f.C(d0Var2, 0, iU);
            if (d0Var2.D == w0.d0.I(d0Var2, 1) && d0Var2.E == w0.d0.I(d0Var2, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((d0Var2.D & 1) != 0) {
                sb5.append(mVar.b(0));
                i2 = 1;
            } else {
                i2 = 0;
            }
            String string3 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            if ((d0Var2.E & 1) != 0) {
                if (i2 > 0) {
                    sb6.append(", ");
                }
                sb6.append(mVar.c(0));
                i13 = 1;
            }
            String string4 = sb6.toString();
            StringBuilder sb7 = new StringBuilder("Error while pushing ");
            sb7.append(mVar);
            sb7.append(". Not all arguments were provided. Missing ");
            sb7.append(i2);
            sb7.append(" int arguments (");
            t8.c.u(sb7, string3, ") and ", i13, " object arguments (");
            t8.c.t(sb7, string4, ").");
            throw null;
        }
        q1 q1Var2 = this.F;
        c cVarA2 = q1Var2.a(q1Var2.f21709i);
        w0.d0 d0Var3 = bVar.b.f22519x;
        w0.m mVar2 = w0.m.f22549f;
        d0Var3.P(mVar2);
        u7.f.D(d0Var3, 0, obj);
        u7.f.D(d0Var3, 1, cVarA2);
        u7.f.C(d0Var3, 0, iU);
        if (d0Var3.D == w0.d0.I(d0Var3, 1) && d0Var3.E == w0.d0.I(d0Var3, 2)) {
            return;
        }
        StringBuilder sb8 = new StringBuilder();
        if ((d0Var3.D & 1) != 0) {
            sb8.append(mVar2.b(0));
            i10 = 1;
        } else {
            i10 = 0;
        }
        String string5 = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        int i21 = 0;
        for (int i22 = 2; i13 < i22; i22 = 2) {
            if (((1 << i13) & d0Var3.E) != 0) {
                if (i10 > 0) {
                    sb9.append(", ");
                }
                sb9.append(mVar2.c(i13));
                i21++;
            }
            i13++;
        }
        String string6 = sb9.toString();
        StringBuilder sb10 = new StringBuilder("Error while pushing ");
        sb10.append(mVar2);
        sb10.append(". Not all arguments were provided. Missing ");
        sb10.append(i10);
        sb10.append(" int arguments (");
        t8.c.u(sb10, string5, ") and ", i21, " object arguments (");
        t8.c.t(sb10, string6, ").");
        throw null;
    }

    public final Object k(f1 f1Var) {
        return d.U(m(), f1Var);
    }

    public final int k0(int i2) {
        int i10;
        if (i2 >= 0) {
            int[] iArr = this.f21689n;
            return (iArr == null || (i10 = iArr[i2]) < 0) ? d.r(this.F.b, i2) : i10;
        }
        s.p pVar = this.f21690o;
        if (pVar == null || pVar.c(i2) < 0) {
            return 0;
        }
        return pVar.d(i2);
    }

    public final void l(hf.a aVar) {
        int i2;
        int i10;
        int i11;
        int i12;
        if (!this.f21692q) {
            d.y("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f21692q = false;
        if (!this.O) {
            d.y("createNode() can only be called when inserting");
            throw null;
        }
        g2.u uVar = this.f21688m;
        int i13 = uVar.f5593a[uVar.b - 1];
        t1 t1Var = this.H;
        c cVarB = t1Var.b(t1Var.f21744u);
        this.f21687k++;
        w0.c cVar = this.N;
        w0.d0 d0Var = cVar.f22532x;
        w0.m mVar = w0.m.f22547d;
        d0Var.P(mVar);
        u7.f.D(d0Var, 0, aVar);
        u7.f.C(d0Var, 0, i13);
        u7.f.D(d0Var, 1, cVarB);
        if (d0Var.D != w0.d0.I(d0Var, 1) || d0Var.E != w0.d0.I(d0Var, 2)) {
            StringBuilder sb2 = new StringBuilder();
            if ((1 & d0Var.D) != 0) {
                i2 = 0;
                sb2.append(mVar.b(0));
                i10 = 1;
            } else {
                i2 = 0;
                i10 = 0;
            }
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            int i14 = i2;
            for (int i15 = 2; i2 < i15; i15 = 2) {
                if (((1 << i2) & d0Var.E) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(mVar.c(i2));
                    i14++;
                }
                i2++;
            }
            String string2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            sb4.append(i10);
            sb4.append(" int arguments (");
            t8.c.u(sb4, string, ") and ", i14, " object arguments (");
            t8.c.t(sb4, string2, ").");
            throw null;
        }
        w0.d0 d0Var2 = cVar.f22533y;
        w0.m mVar2 = w0.m.f22548e;
        d0Var2.P(mVar2);
        u7.f.C(d0Var2, 0, i13);
        u7.f.D(d0Var2, 0, cVarB);
        if (d0Var2.D == w0.d0.I(d0Var2, 1) && d0Var2.E == w0.d0.I(d0Var2, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((d0Var2.D & 1) != 0) {
            sb5.append(mVar2.b(0));
            i11 = 1;
        } else {
            i11 = 0;
        }
        String string3 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        if ((d0Var2.E & 1) != 0) {
            if (i11 > 0) {
                sb6.append(", ");
            }
            sb6.append(mVar2.c(0));
            i12 = 1;
        } else {
            i12 = 0;
        }
        String string4 = sb6.toString();
        StringBuilder sb7 = new StringBuilder("Error while pushing ");
        sb7.append(mVar2);
        sb7.append(". Not all arguments were provided. Missing ");
        sb7.append(i11);
        sb7.append(" int arguments (");
        t8.c.u(sb7, string3, ") and ", i12, " object arguments (");
        t8.c.t(sb7, string4, ").");
        throw null;
    }

    public final void l0() {
        if (!this.f21692q) {
            d.y("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f21692q = false;
        if (this.O) {
            d.y("useNode() called while inserting");
            throw null;
        }
        q1 q1Var = this.F;
        Object objI = q1Var.i(q1Var.f21709i);
        w0.b bVar = this.L;
        bVar.c();
        bVar.f22527h.f8904t.add(objI);
        if (this.f21699x && (objI instanceof k)) {
            bVar.b();
            bVar.b.f22519x.O(w0.b0.f22531c);
        }
    }

    public final d1.d m() {
        d1.d dVar;
        Object obj;
        Object obj2;
        int i2;
        d1.d dVar2 = this.J;
        if (dVar2 != null) {
            return dVar2;
        }
        int i10 = this.F.f21709i;
        v0 v0Var = d.f21557c;
        if (this.O && this.I) {
            int iX = this.H.f21744u;
            while (iX > 0) {
                t1 t1Var = this.H;
                if (t1Var.b[t1Var.p(iX) * 5] == 202) {
                    t1 t1Var2 = this.H;
                    int iP = t1Var2.p(iX);
                    int i11 = 0;
                    if (d.o(t1Var2.b, iP)) {
                        Object[] objArr = t1Var2.f21727c;
                        int[] iArr = t1Var2.b;
                        int i12 = iP * 5;
                        int i13 = iArr[i12 + 4];
                        switch (iArr[i12 + 1] >> 30) {
                            case 0:
                                i2 = 0;
                                break;
                            case 1:
                            case 2:
                            case 4:
                                i2 = 1;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i2 = 2;
                                break;
                            default:
                                i2 = 3;
                                break;
                        }
                        obj = objArr[i2 + i13];
                    } else {
                        obj = null;
                    }
                    if (kotlin.jvm.internal.l.a(obj, v0Var)) {
                        t1 t1Var3 = this.H;
                        int iP2 = t1Var3.p(iX);
                        if (d.n(t1Var3.b, iP2)) {
                            Object[] objArr2 = t1Var3.f21727c;
                            int[] iArr2 = t1Var3.b;
                            int iF = t1Var3.f(iArr2, iP2);
                            switch (iArr2[(iP2 * 5) + 1] >> 29) {
                                case 0:
                                    break;
                                case 1:
                                case 2:
                                case 4:
                                    i11 = 1;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                    i11 = 2;
                                    break;
                                default:
                                    i11 = 3;
                                    break;
                            }
                            obj2 = objArr2[i11 + iF];
                        } else {
                            obj2 = m.f21654a;
                        }
                        obj2.getClass();
                        d1.d dVar3 = (d1.d) obj2;
                        this.J = dVar3;
                        return dVar3;
                    }
                }
                t1 t1Var4 = this.H;
                iX = t1Var4.x(t1Var4.b, iX);
            }
        }
        if (this.F.f21703c > 0) {
            while (i10 > 0) {
                q1 q1Var = this.F;
                int[] iArr3 = q1Var.b;
                int i14 = i10 * 5;
                if (iArr3[i14] == 202 && kotlin.jvm.internal.l.a(q1Var.j(iArr3, i10), v0Var)) {
                    p2.h0 h0Var = this.f21696u;
                    if (h0Var == null || (dVar = (d1.d) ((SparseArray) h0Var.f16564u).get(i10)) == null) {
                        q1 q1Var2 = this.F;
                        Object objB = q1Var2.b(q1Var2.b, i10);
                        objB.getClass();
                        dVar = (d1.d) objB;
                    }
                    this.J = dVar;
                    return dVar;
                }
                i10 = this.F.b[i14 + 2];
            }
        }
        d1.d dVar4 = this.f21695t;
        this.J = dVar4;
        return dVar4;
    }

    public final void n(boolean z10) {
        if (this.f21687k != 0) {
            d.y("No nodes can be emitted before calling dactivateToEndGroup");
            throw null;
        }
        if (this.O) {
            return;
        }
        if (!z10) {
            S();
            return;
        }
        q1 q1Var = this.F;
        int i2 = q1Var.f21707g;
        int i10 = q1Var.f21708h;
        w0.b bVar = this.L;
        bVar.getClass();
        bVar.d(false);
        bVar.b.f22519x.O(w0.f.f22540c);
        d.t(i2, i10, this.f21693r);
        this.F.m();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    public final void o(sc.p pVar, d1.a aVar) {
        long[] jArr;
        Object obj;
        v0 v0Var = d.f21556a;
        Object obj2 = null;
        if (this.E) {
            d.y("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = f1.p.k().d();
            this.f21696u = null;
            s.z zVar = (s.z) pVar.f19685t;
            Object[] objArr = zVar.b;
            Object[] objArr2 = zVar.f19247c;
            long[] jArr2 = zVar.f19246a;
            int length = jArr2.length - 2;
            ArrayList arrayList = this.f21693r;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j10 = jArr2[i2];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i2 - length)) >>> 31);
                        obj = obj2;
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j10 & 255) < 128) {
                                int i13 = (i2 << 3) + i12;
                                Object obj3 = objArr[i13];
                                Object obj4 = objArr2[i13];
                                obj3.getClass();
                                c cVar = ((h1) obj3).f21593c;
                                if (cVar != null) {
                                    int i14 = cVar.f21547a;
                                    h1 h1Var = (h1) obj3;
                                    if (obj4 == p0.f21674x) {
                                        obj4 = obj;
                                    }
                                    arrayList.add(new k0(h1Var, i14, obj4));
                                }
                            }
                            j10 >>= i10;
                            i12++;
                            jArr2 = jArr2;
                            i10 = i10;
                        }
                        jArr = jArr2;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        obj = obj2;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    obj2 = obj;
                    jArr2 = jArr;
                }
            }
            te.o.K(arrayList, d.f21560f);
            this.f21686j = 0;
            this.E = true;
            try {
                e0();
                Object objH = H();
                if (objH != aVar && aVar != null) {
                    j0(aVar);
                }
                f1.z zVar2 = this.C;
                x0.d dVarD = d.D();
                try {
                    dVarD.b(zVar2);
                    if (aVar != null) {
                        W(200, v0Var);
                        d.K(this, aVar);
                        q(false);
                    } else if (!this.f21697v || objH == null || objH.equals(m.f21654a)) {
                        R();
                    } else {
                        W(200, v0Var);
                        kotlin.jvm.internal.a0.d(2, objH);
                        d.K(this, (hf.e) objH);
                        q(false);
                    }
                    dVarD.q(dVarD.f22907v - 1);
                    x();
                    this.E = false;
                    arrayList.clear();
                    d.Y(this.H.f21745v);
                    z();
                    Trace.endSection();
                } catch (Throwable th) {
                    dVarD.q(dVarD.f22907v - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.E = false;
                arrayList.clear();
                a();
                d.Y(this.H.f21745v);
                z();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void p(int i2, int i10) {
        if (i2 <= 0 || i2 == i10) {
            return;
        }
        p(this.F.b[(i2 * 5) + 2], i10);
        if (d.p(this.F.b, i2)) {
            Object objI = this.F.i(i2);
            w0.b bVar = this.L;
            bVar.c();
            bVar.f22527h.f8904t.add(objI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03de  */
    /* JADX WARN: Code duplicated, block: B:248:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:250:0x05ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:256:0x060b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0616 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0618  */
    /* JADX WARN: Code duplicated, block: B:300:0x0725  */
    /* JADX WARN: Code duplicated, block: B:372:0x08de  */
    /* JADX WARN: Code duplicated, block: B:455:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q(boolean z10) {
        int iHashCode;
        g2.u uVar;
        int i2;
        int i10;
        Throwable th;
        q qVar;
        int i11;
        int i12;
        w0.d0 d0Var;
        w0.n nVar;
        int i13;
        int i14;
        int i15;
        StringBuilder sb2;
        int i16;
        int i17;
        StringBuilder sb3;
        int i18;
        int i19;
        int i20;
        g2.u uVar2;
        int i21;
        d1 d1Var;
        HashSet hashSet;
        int i22;
        int i23;
        int i24;
        ArrayList arrayList;
        int i25;
        int i26;
        int i27;
        Object[] objArr;
        int i28;
        int i29;
        Object[] objArr2;
        long[] jArr;
        long j10;
        long[] jArr2;
        Object obj;
        Object obj2;
        int iHashCode2;
        int i30;
        int i31;
        q qVar2 = this;
        g2.u uVar3 = qVar2.f21688m;
        int i32 = 2;
        int i33 = uVar3.f5593a[uVar3.b - 2] - 1;
        boolean z11 = qVar2.O;
        p0 p0Var = m.f21654a;
        if (z11) {
            t1 t1Var = qVar2.H;
            int i34 = t1Var.f21744u;
            int i35 = t1Var.b[t1Var.p(i34) * 5];
            t1 t1Var2 = qVar2.H;
            int iP = t1Var2.p(i34);
            if (d.o(t1Var2.b, iP)) {
                Object[] objArr3 = t1Var2.f21727c;
                int[] iArr = t1Var2.b;
                int i36 = iP * 5;
                int i37 = iArr[i36 + 4];
                switch (iArr[i36 + 1] >> 30) {
                    case 0:
                        i31 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i31 = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i31 = 2;
                        break;
                    default:
                        i31 = 3;
                        break;
                }
                obj = objArr3[i31 + i37];
            } else {
                obj = null;
            }
            t1 t1Var3 = qVar2.H;
            int iP2 = t1Var3.p(i34);
            if (d.n(t1Var3.b, iP2)) {
                Object[] objArr4 = t1Var3.f21727c;
                int[] iArr2 = t1Var3.b;
                int iF = t1Var3.f(iArr2, iP2);
                switch (iArr2[(iP2 * 5) + 1] >> 29) {
                    case 0:
                        i30 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i30 = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i30 = 2;
                        break;
                    default:
                        i30 = 3;
                        break;
                }
                obj2 = objArr4[i30 + iF];
            } else {
                obj2 = p0Var;
            }
            if (obj != null) {
                iHashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(qVar2.P, 3);
            } else if (obj2 == null || i35 != 207 || obj2.equals(p0Var)) {
                iHashCode2 = Integer.rotateRight(i33 ^ qVar2.P, 3) ^ Integer.hashCode(i35);
            } else {
                qVar2.P = Integer.rotateRight(Integer.rotateRight(i33 ^ qVar2.P, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            qVar2.P = Integer.rotateRight(iHashCode2, 3);
        } else {
            q1 q1Var = qVar2.F;
            int i38 = q1Var.f21709i;
            int[] iArr3 = q1Var.b;
            int i39 = iArr3[i38 * 5];
            Object objJ = q1Var.j(iArr3, i38);
            q1 q1Var2 = qVar2.F;
            Object objB = q1Var2.b(q1Var2.b, i38);
            if (objJ != null) {
                iHashCode = Integer.hashCode(objJ instanceof Enum ? ((Enum) objJ).ordinal() : objJ.hashCode()) ^ Integer.rotateRight(qVar2.P, 3);
            } else if (objB == null || i39 != 207 || objB.equals(p0Var)) {
                iHashCode = Integer.rotateRight(i33 ^ qVar2.P, 3) ^ Integer.hashCode(i39);
            } else {
                qVar2.P = Integer.rotateRight(Integer.rotateRight(i33 ^ qVar2.P, 3) ^ Integer.hashCode(objB.hashCode()), 3);
            }
            qVar2.P = Integer.rotateRight(iHashCode, 3);
        }
        int i40 = qVar2.f21687k;
        d1 d1Var2 = qVar2.f21685i;
        ArrayList arrayList2 = qVar2.f21693r;
        w0.b bVar = qVar2.L;
        if (d1Var2 != null) {
            s.r rVar = d1Var2.f21568e;
            int i41 = d1Var2.b;
            ArrayList arrayList3 = d1Var2.f21565a;
            if (arrayList3.size() > 0) {
                ArrayList arrayList4 = d1Var2.f21567d;
                i10 = -1;
                th = null;
                HashSet hashSet2 = new HashSet(arrayList4.size());
                int size = arrayList4.size();
                int i42 = 0;
                while (i42 < size) {
                    hashSet2.add(arrayList4.get(i42));
                    i42++;
                    i32 = i32;
                }
                i2 = i32;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size2 = arrayList4.size();
                int size3 = arrayList3.size();
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                while (i43 < size3) {
                    m0 m0Var = (m0) arrayList3.get(i43);
                    if (hashSet2.contains(m0Var)) {
                        uVar2 = uVar3;
                        i21 = i43;
                        if (!linkedHashSet.contains(m0Var)) {
                            int i46 = i44;
                            if (i46 < size2) {
                                m0 m0Var2 = (m0) arrayList4.get(i46);
                                if (m0Var2 != m0Var) {
                                    h0 h0Var = (h0) rVar.f(m0Var2.f21656c);
                                    int i47 = h0Var != null ? h0Var.b : -1;
                                    linkedHashSet.add(m0Var2);
                                    i25 = i45;
                                    if (i47 != i25) {
                                        h0 h0Var2 = (h0) rVar.f(m0Var2.f21656c);
                                        int i48 = h0Var2 != null ? h0Var2.f21591c : m0Var2.f21657d;
                                        d1Var = d1Var2;
                                        int i49 = i47 + i41;
                                        hashSet = hashSet2;
                                        int i50 = i25 + i41;
                                        if (i48 > 0) {
                                            i22 = size2;
                                            int i51 = bVar.l;
                                            if (i51 > 0) {
                                                i23 = size3;
                                                if (bVar.f22529j == i49 - i51 && bVar.f22530k == i50 - i51) {
                                                    bVar.l = i51 + i48;
                                                }
                                            } else {
                                                i23 = size3;
                                            }
                                            bVar.c();
                                            bVar.f22529j = i49;
                                            bVar.f22530k = i50;
                                            bVar.l = i48;
                                        } else {
                                            i22 = size2;
                                            i23 = size3;
                                            bVar.getClass();
                                        }
                                        if (i47 > i25) {
                                            Object[] objArr5 = rVar.f19213c;
                                            long[] jArr3 = rVar.f19212a;
                                            int length = jArr3.length - 2;
                                            if (length >= 0) {
                                                int i52 = i48;
                                                int i53 = 0;
                                                while (true) {
                                                    long j11 = jArr3[i53];
                                                    i24 = i41;
                                                    arrayList = arrayList3;
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i54 = 8 - ((~(i53 - length)) >>> 31);
                                                        int i55 = 0;
                                                        while (i55 < i54) {
                                                            if ((j11 & 255) < 128) {
                                                                j10 = j11;
                                                                h0 h0Var3 = (h0) objArr5[(i53 << 3) + i55];
                                                                int i56 = h0Var3.b;
                                                                jArr2 = jArr3;
                                                                if (i47 <= i56 && i56 < i47 + i52) {
                                                                    h0Var3.b = (i56 - i47) + i25;
                                                                } else if (i25 <= i56 && i56 < i47) {
                                                                    h0Var3.b = i56 + i52;
                                                                }
                                                            } else {
                                                                j10 = j11;
                                                                jArr2 = jArr3;
                                                            }
                                                            j11 = j10 >> 8;
                                                            i55++;
                                                            jArr3 = jArr2;
                                                        }
                                                        jArr = jArr3;
                                                        if (i54 == 8) {
                                                        }
                                                    } else {
                                                        jArr = jArr3;
                                                    }
                                                    if (i53 != length) {
                                                        i53++;
                                                        i41 = i24;
                                                        arrayList3 = arrayList;
                                                        jArr3 = jArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i57 = i48;
                                            i24 = i41;
                                            arrayList = arrayList3;
                                            if (i25 > i47) {
                                                Object[] objArr6 = rVar.f19213c;
                                                long[] jArr4 = rVar.f19212a;
                                                int length2 = jArr4.length - 2;
                                                if (length2 >= 0) {
                                                    int i58 = 0;
                                                    while (true) {
                                                        long j12 = jArr4[i58];
                                                        Object[] objArr7 = objArr6;
                                                        long[] jArr5 = jArr4;
                                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i59 = 8 - ((~(i58 - length2)) >>> 31);
                                                            int i60 = 0;
                                                            while (i60 < i59) {
                                                                if ((j12 & 255) < 128) {
                                                                    i28 = i60;
                                                                    h0 h0Var4 = (h0) objArr7[(i58 << 3) + i60];
                                                                    objArr2 = objArr7;
                                                                    int i61 = h0Var4.b;
                                                                    i29 = i47;
                                                                    if (i47 <= i61 && i61 < i29 + i57) {
                                                                        h0Var4.b = (i61 - i29) + i25;
                                                                    } else if (i29 + 1 <= i61 && i61 < i25) {
                                                                        h0Var4.b = i61 - i57;
                                                                    }
                                                                } else {
                                                                    i28 = i60;
                                                                    i29 = i47;
                                                                    objArr2 = objArr7;
                                                                }
                                                                j12 >>= 8;
                                                                i60 = i28 + 1;
                                                                objArr7 = objArr2;
                                                                i47 = i29;
                                                            }
                                                            i27 = i47;
                                                            objArr = objArr7;
                                                            if (i59 == 8) {
                                                            }
                                                        } else {
                                                            i27 = i47;
                                                            objArr = objArr7;
                                                        }
                                                        if (i58 != length2) {
                                                            i58++;
                                                            jArr4 = jArr5;
                                                            objArr6 = objArr;
                                                            i47 = i27;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i26 = i21;
                                    } else {
                                        d1Var = d1Var2;
                                        hashSet = hashSet2;
                                        i22 = size2;
                                        i23 = size3;
                                    }
                                    i24 = i41;
                                    arrayList = arrayList3;
                                    i26 = i21;
                                } else {
                                    d1Var = d1Var2;
                                    hashSet = hashSet2;
                                    i22 = size2;
                                    i23 = size3;
                                    i24 = i41;
                                    arrayList = arrayList3;
                                    i25 = i45;
                                    i26 = i21 + 1;
                                }
                                i44 = i46 + 1;
                                h0 h0Var5 = (h0) rVar.f(m0Var2.f21656c);
                                int i62 = i25 + (h0Var5 != null ? h0Var5.f21591c : m0Var2.f21657d);
                                i43 = i26;
                                linkedHashSet = linkedHashSet;
                                d1Var2 = d1Var;
                                hashSet2 = hashSet;
                                size2 = i22;
                                size3 = i23;
                                i41 = i24;
                                arrayList3 = arrayList;
                                i45 = i62;
                                uVar3 = uVar2;
                            } else {
                                i44 = i46;
                                uVar3 = uVar2;
                                i43 = i21;
                            }
                        }
                    } else {
                        uVar2 = uVar3;
                        h0 h0Var6 = (h0) rVar.f(m0Var.f21656c);
                        int i63 = h0Var6 != null ? h0Var6.b : -1;
                        int i64 = m0Var.f21656c;
                        i21 = i43;
                        bVar.e(i63 + i41, m0Var.f21657d);
                        d1Var2.a(i64, 0);
                        bVar.f22525f = (i64 - bVar.f22521a.F.f21707g) + bVar.f22525f;
                        qVar2.F.k(i64);
                        qVar2.L();
                        qVar2.F.l();
                        d.t(i64, qVar2.F.b[(i64 * 5) + 3] + i64, arrayList2);
                    }
                    i43 = i21 + 1;
                    uVar3 = uVar2;
                }
                uVar = uVar3;
                bVar.c();
                if (arrayList3.size() > 0) {
                    q1 q1Var3 = qVar2.F;
                    bVar.f22525f = (q1Var3.f21708h - bVar.f22521a.F.f21707g) + bVar.f22525f;
                    q1Var3.m();
                }
            } else {
                uVar = uVar3;
                i2 = 2;
                i10 = -1;
                th = null;
            }
        } else {
            uVar = uVar3;
            i2 = 2;
            i10 = -1;
            th = null;
        }
        int i65 = qVar2.f21686j;
        while (true) {
            q1 q1Var4 = qVar2.F;
            if (q1Var4.f21711k <= 0 && (i20 = q1Var4.f21707g) != q1Var4.f21708h) {
                q qVar3 = qVar2;
                qVar3.L();
                bVar.e(i65, qVar3.F.l());
                d.t(i20, qVar3.F.f21707g, arrayList2);
                qVar2 = qVar3;
            }
        }
        boolean z12 = qVar2.O;
        if (z12) {
            if (z10) {
                w0.c cVar = qVar2.N;
                w0.d0 d0Var2 = cVar.f22533y;
                if (!d0Var2.M()) {
                    d.y("Cannot end node insertion, there are no pending operations that can be realized.");
                    throw th;
                }
                w0.d0 d0Var3 = cVar.f22532x;
                if (d0Var2.L()) {
                    p1.n.o("Cannot pop(), because the stack is empty.");
                    return;
                }
                w0.c0[] c0VarArr = d0Var2.f22536x;
                int i66 = d0Var2.f22537y - 1;
                d0Var2.f22537y = i66;
                w0.c0 c0Var = c0VarArr[i66];
                c0Var.getClass();
                int i67 = c0Var.f22534a;
                int i68 = c0Var.b;
                i11 = -2;
                d0Var2.f22536x[d0Var2.f22537y] = th;
                d0Var3.P(c0Var);
                int i69 = d0Var2.C;
                int i70 = d0Var3.C;
                int i71 = 0;
                while (i71 < i68) {
                    i70--;
                    int i72 = i69 - 1;
                    Object[] objArr8 = d0Var3.B;
                    Object[] objArr9 = d0Var2.B;
                    objArr8[i70] = objArr9[i72];
                    objArr9[i72] = th;
                    i71++;
                    i69 = i72;
                }
                int i73 = d0Var2.A;
                int i74 = d0Var3.A;
                int i75 = 0;
                while (i75 < i67) {
                    i74--;
                    int i76 = i73 - 1;
                    int[] iArr4 = d0Var3.f22538z;
                    int[] iArr5 = d0Var2.f22538z;
                    iArr4[i74] = iArr5[i76];
                    iArr5[i76] = 0;
                    i75++;
                    i73 = i76;
                }
                d0Var2.C -= i68;
                d0Var2.A -= i67;
                i40 = 1;
            } else {
                i11 = -2;
            }
            q1 q1Var5 = qVar2.F;
            int i77 = q1Var5.f21711k;
            if (i77 <= 0) {
                d.c0("Unbalanced begin/end empty");
                throw th;
            }
            q1Var5.f21711k = i77 - 1;
            t1 t1Var4 = qVar2.H;
            int i78 = t1Var4.f21744u;
            t1Var4.i();
            if (qVar2.F.f21711k > 0) {
                qVar = qVar2;
            } else {
                int i79 = (-2) - i78;
                qVar2.H.j();
                qVar2.H.e(true);
                c cVar2 = qVar2.M;
                boolean zL = qVar2.N.f22532x.L();
                r1 r1Var = qVar2.G;
                if (zL) {
                    bVar.b();
                    bVar.d(false);
                    g2.u uVar4 = bVar.f22523d;
                    q1 q1Var6 = bVar.f22521a.F;
                    if (q1Var6.f21703c > 0) {
                        int i80 = q1Var6.f21709i;
                        i12 = i40;
                        int i81 = uVar4.b;
                        if ((i81 > 0 ? uVar4.f5593a[i81 - 1] : i11) != i80) {
                            if (!bVar.f22522c && bVar.f22524e) {
                                bVar.d(false);
                                bVar.b.f22519x.O(w0.l.f22546c);
                                bVar.f22522c = true;
                            }
                            if (i80 > 0) {
                                c cVarA = q1Var6.a(i80);
                                uVar4.b(i80);
                                bVar.d(false);
                                w0.d0 d0Var4 = bVar.b.f22519x;
                                w0.k kVar = w0.k.f22545c;
                                int i82 = kVar.b;
                                d0Var4.P(kVar);
                                u7.f.D(d0Var4, 0, cVarA);
                                int i83 = d0Var4.D;
                                int i84 = kVar.f22534a;
                                if (i83 != w0.d0.I(d0Var4, i84) || d0Var4.E != w0.d0.I(d0Var4, i82)) {
                                    int i85 = 1;
                                    StringBuilder sb4 = new StringBuilder();
                                    int i86 = 0;
                                    int i87 = 0;
                                    while (i86 < i84) {
                                        if ((d0Var4.D & (i85 << i86)) != 0) {
                                            if (i87 > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(kVar.b(i86));
                                            i87++;
                                        }
                                        i86++;
                                        i85 = 1;
                                    }
                                    String string = sb4.toString();
                                    StringBuilder sb5 = new StringBuilder();
                                    int i88 = 0;
                                    for (int i89 = 0; i89 < i82; i89++) {
                                        if (((1 << i89) & d0Var4.E) != 0) {
                                            if (i87 > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(kVar.c(i89));
                                            i88++;
                                        }
                                    }
                                    String string2 = sb5.toString();
                                    StringBuilder sb6 = new StringBuilder("Error while pushing ");
                                    sb6.append(kVar);
                                    sb6.append(". Not all arguments were provided. Missing ");
                                    sb6.append(i87);
                                    sb6.append(" int arguments (");
                                    t8.c.u(sb6, string, ") and ", i88, " object arguments (");
                                    t8.c.t(sb6, string2, ").");
                                    throw th;
                                }
                                bVar.f22522c = true;
                            }
                        }
                        bVar.c();
                        d0Var = bVar.b.f22519x;
                        nVar = w0.n.f22552c;
                        i13 = nVar.b;
                        d0Var.P(nVar);
                        u7.f.D(d0Var, 0, cVar2);
                        u7.f.D(d0Var, 1, r1Var);
                        i14 = d0Var.D;
                        i15 = nVar.f22534a;
                        if (i14 == w0.d0.I(d0Var, i15) || d0Var.E != w0.d0.I(d0Var, i13)) {
                            sb2 = new StringBuilder();
                            i17 = 0;
                            for (i16 = 0; i16 < i15; i16++) {
                                if (((1 << i16) & d0Var.D) == 0) {
                                    if (i17 > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(nVar.b(i16));
                                    i17++;
                                }
                            }
                            String string3 = sb2.toString();
                            sb3 = new StringBuilder();
                            i18 = 0;
                            i19 = 0;
                            while (i18 < i13) {
                                int i90 = i13;
                                if ((d0Var.E & (1 << i18)) == 0) {
                                    if (i17 > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(nVar.c(i18));
                                    i19++;
                                }
                                i18++;
                                i13 = i90;
                            }
                            String string4 = sb3.toString();
                            StringBuilder sb7 = new StringBuilder("Error while pushing ");
                            sb7.append(nVar);
                            sb7.append(". Not all arguments were provided. Missing ");
                            sb7.append(i17);
                            sb7.append(" int arguments (");
                            t8.c.u(sb7, string3, ") and ", i19, " object arguments (");
                            t8.c.t(sb7, string4, ").");
                            throw th;
                        }
                        qVar = this;
                    } else {
                        i12 = i40;
                    }
                    i79 = i79;
                    bVar.c();
                    d0Var = bVar.b.f22519x;
                    nVar = w0.n.f22552c;
                    i13 = nVar.b;
                    d0Var.P(nVar);
                    u7.f.D(d0Var, 0, cVar2);
                    u7.f.D(d0Var, 1, r1Var);
                    i14 = d0Var.D;
                    i15 = nVar.f22534a;
                    if (i14 == w0.d0.I(d0Var, i15)) {
                    }
                    sb2 = new StringBuilder();
                    i17 = 0;
                    while (i16 < i15) {
                        if (((1 << i16) & d0Var.D) == 0) {
                            if (i17 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(nVar.b(i16));
                            i17++;
                        }
                    }
                    String string5 = sb2.toString();
                    sb3 = new StringBuilder();
                    i18 = 0;
                    i19 = 0;
                    while (i18 < i13) {
                        int i91 = i13;
                        if ((d0Var.E & (1 << i18)) == 0) {
                            if (i17 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(nVar.c(i18));
                            i19++;
                        }
                        i18++;
                        i13 = i91;
                    }
                    String string6 = sb3.toString();
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(nVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    sb8.append(i17);
                    sb8.append(" int arguments (");
                    t8.c.u(sb8, string5, ") and ", i19, " object arguments (");
                    t8.c.t(sb8, string6, ").");
                    throw th;
                }
                i12 = i40;
                i79 = i79;
                w0.c cVar3 = qVar2.N;
                bVar.b();
                bVar.d(false);
                g2.u uVar5 = bVar.f22523d;
                q1 q1Var7 = bVar.f22521a.F;
                if (q1Var7.f21703c > 0) {
                    int i92 = q1Var7.f21709i;
                    int i93 = uVar5.b;
                    if ((i93 > 0 ? uVar5.f5593a[i93 - 1] : i11) != i92) {
                        if (!bVar.f22522c && bVar.f22524e) {
                            bVar.d(false);
                            bVar.b.f22519x.O(w0.l.f22546c);
                            bVar.f22522c = true;
                        }
                        if (i92 > 0) {
                            c cVarA2 = q1Var7.a(i92);
                            uVar5.b(i92);
                            bVar.d(false);
                            w0.d0 d0Var5 = bVar.b.f22519x;
                            w0.k kVar2 = w0.k.f22545c;
                            int i94 = kVar2.b;
                            d0Var5.P(kVar2);
                            u7.f.D(d0Var5, 0, cVarA2);
                            int i95 = d0Var5.D;
                            int i96 = kVar2.f22534a;
                            if (i95 != w0.d0.I(d0Var5, i96) || d0Var5.E != w0.d0.I(d0Var5, i94)) {
                                int i97 = 1;
                                StringBuilder sb9 = new StringBuilder();
                                int i98 = 0;
                                int i99 = 0;
                                while (i98 < i96) {
                                    if ((d0Var5.D & (i97 << i98)) != 0) {
                                        if (i99 > 0) {
                                            sb9.append(", ");
                                        }
                                        sb9.append(kVar2.b(i98));
                                        i99++;
                                    }
                                    i98++;
                                    i97 = 1;
                                }
                                String string7 = sb9.toString();
                                StringBuilder sb10 = new StringBuilder();
                                int i100 = 0;
                                for (int i101 = 0; i101 < i94; i101++) {
                                    if (((1 << i101) & d0Var5.E) != 0) {
                                        if (i99 > 0) {
                                            sb10.append(", ");
                                        }
                                        sb10.append(kVar2.c(i101));
                                        i100++;
                                    }
                                }
                                String string8 = sb10.toString();
                                StringBuilder sb11 = new StringBuilder("Error while pushing ");
                                sb11.append(kVar2);
                                sb11.append(". Not all arguments were provided. Missing ");
                                sb11.append(i99);
                                sb11.append(" int arguments (");
                                t8.c.u(sb11, string7, ") and ", i100, " object arguments (");
                                t8.c.t(sb11, string8, ").");
                                throw th;
                            }
                            bVar.f22522c = true;
                        }
                    }
                }
                bVar.c();
                w0.d0 d0Var6 = bVar.b.f22519x;
                w0.o oVar = w0.o.f22553c;
                int i102 = oVar.b;
                d0Var6.P(oVar);
                u7.f.D(d0Var6, 0, cVar2);
                u7.f.D(d0Var6, 1, r1Var);
                u7.f.D(d0Var6, i2, cVar3);
                int i103 = d0Var6.D;
                int i104 = oVar.f22534a;
                if (i103 != w0.d0.I(d0Var6, i104) || d0Var6.E != w0.d0.I(d0Var6, i102)) {
                    StringBuilder sb12 = new StringBuilder();
                    int i105 = 0;
                    int i106 = 0;
                    while (i105 < i104) {
                        int i107 = i104;
                        if ((d0Var6.D & (1 << i105)) != 0) {
                            if (i106 > 0) {
                                sb12.append(", ");
                            }
                            sb12.append(oVar.b(i105));
                            i106++;
                        }
                        i105++;
                        i104 = i107;
                    }
                    String string9 = sb12.toString();
                    StringBuilder sb13 = new StringBuilder();
                    int i108 = 0;
                    int i109 = 0;
                    while (i108 < i102) {
                        int i110 = i102;
                        if (((1 << i108) & d0Var6.E) != 0) {
                            if (i106 > 0) {
                                sb13.append(", ");
                            }
                            sb13.append(oVar.c(i108));
                            i109++;
                        }
                        i108++;
                        i102 = i110;
                    }
                    String string10 = sb13.toString();
                    StringBuilder sb14 = new StringBuilder("Error while pushing ");
                    sb14.append(oVar);
                    sb14.append(". Not all arguments were provided. Missing ");
                    sb14.append(i106);
                    sb14.append(" int arguments (");
                    t8.c.u(sb14, string9, ") and ", i109, " object arguments (");
                    t8.c.t(sb14, string10, ").");
                    throw th;
                }
                qVar = this;
                qVar.N = new w0.c();
                qVar.O = false;
                if (qVar.f21679c.f21715u == 0) {
                    i40 = i12;
                } else {
                    int i111 = i79;
                    qVar.g0(i111, 0);
                    i40 = i12;
                    qVar.h0(i111, i40);
                }
            }
        } else {
            qVar = qVar2;
            z12 = z12;
            if (z10) {
                bVar.a();
            }
            q1 q1Var8 = qVar.F;
            int i112 = q1Var8.f21712m - q1Var8.l;
            if (i112 <= 0) {
                i40 = i40;
            } else if (i112 > 0) {
                bVar.d(false);
                g2.u uVar6 = bVar.f22523d;
                q1 q1Var9 = bVar.f22521a.F;
                if (q1Var9.f21703c > 0) {
                    int i113 = q1Var9.f21709i;
                    int i114 = uVar6.b;
                    if ((i114 > 0 ? uVar6.f5593a[i114 - 1] : -2) != i113) {
                        if (!bVar.f22522c && bVar.f22524e) {
                            bVar.d(false);
                            bVar.b.f22519x.O(w0.l.f22546c);
                            bVar.f22522c = true;
                        }
                        if (i113 > 0) {
                            c cVarA3 = q1Var9.a(i113);
                            uVar6.b(i113);
                            bVar.d(false);
                            w0.d0 d0Var7 = bVar.b.f22519x;
                            w0.k kVar3 = w0.k.f22545c;
                            int i115 = kVar3.b;
                            d0Var7.P(kVar3);
                            u7.f.D(d0Var7, 0, cVarA3);
                            int i116 = d0Var7.D;
                            int i117 = kVar3.f22534a;
                            if (i116 != w0.d0.I(d0Var7, i117) || d0Var7.E != w0.d0.I(d0Var7, i115)) {
                                int i118 = 1;
                                StringBuilder sb15 = new StringBuilder();
                                int i119 = 0;
                                int i120 = 0;
                                while (i119 < i117) {
                                    if (((i118 << i119) & d0Var7.D) != 0) {
                                        if (i120 > 0) {
                                            sb15.append(", ");
                                        }
                                        sb15.append(kVar3.b(i119));
                                        i120++;
                                    }
                                    i119++;
                                    i118 = 1;
                                }
                                String string11 = sb15.toString();
                                StringBuilder sb16 = new StringBuilder();
                                int i121 = 0;
                                int i122 = 0;
                                while (i121 < i115) {
                                    int i123 = i115;
                                    if (((1 << i121) & d0Var7.E) != 0) {
                                        if (i120 > 0) {
                                            sb16.append(", ");
                                        }
                                        sb16.append(kVar3.c(i121));
                                        i122++;
                                    }
                                    i121++;
                                    i115 = i123;
                                }
                                String string12 = sb16.toString();
                                StringBuilder sb17 = new StringBuilder("Error while pushing ");
                                sb17.append(kVar3);
                                sb17.append(". Not all arguments were provided. Missing ");
                                sb17.append(i120);
                                sb17.append(" int arguments (");
                                t8.c.u(sb17, string11, ") and ", i122, " object arguments (");
                                t8.c.t(sb17, string12, ").");
                                throw th;
                            }
                            bVar.f22522c = true;
                        }
                    }
                }
                w0.d0 d0Var8 = bVar.b.f22519x;
                w0.x xVar = w0.x.f22562c;
                int i124 = xVar.b;
                d0Var8.P(xVar);
                u7.f.C(d0Var8, 0, i112);
                int i125 = d0Var8.D;
                int i126 = xVar.f22534a;
                if (i125 != w0.d0.I(d0Var8, i126) || d0Var8.E != w0.d0.I(d0Var8, i124)) {
                    StringBuilder sb18 = new StringBuilder();
                    int i127 = 0;
                    int i128 = 0;
                    while (i127 < i126) {
                        int i129 = i126;
                        if ((d0Var8.D & (1 << i127)) != 0) {
                            if (i128 > 0) {
                                sb18.append(", ");
                            }
                            sb18.append(xVar.b(i127));
                            i128++;
                        }
                        i127++;
                        i126 = i129;
                    }
                    String string13 = sb18.toString();
                    StringBuilder sb19 = new StringBuilder();
                    int i130 = 0;
                    int i131 = 0;
                    while (i130 < i124) {
                        int i132 = i124;
                        if (((1 << i130) & d0Var8.E) != 0) {
                            if (i128 > 0) {
                                sb19.append(", ");
                            }
                            sb19.append(xVar.c(i130));
                            i131++;
                        }
                        i130++;
                        i124 = i132;
                    }
                    String string14 = sb19.toString();
                    StringBuilder sb20 = new StringBuilder("Error while pushing ");
                    sb20.append(xVar);
                    sb20.append(". Not all arguments were provided. Missing ");
                    sb20.append(i128);
                    sb20.append(" int arguments (");
                    t8.c.u(sb20, string13, ") and ", i131, " object arguments (");
                    t8.c.t(sb20, string14, ").");
                    throw th;
                }
            } else {
                i40 = i40;
                bVar.getClass();
            }
            int i133 = bVar.f22521a.F.f21709i;
            g2.u uVar7 = bVar.f22523d;
            int i134 = uVar7.b;
            if ((i134 > 0 ? uVar7.f5593a[i134 - 1] : i10) > i133) {
                d.y("Missed recording an endGroup");
                throw th;
            }
            if ((i134 > 0 ? uVar7.f5593a[i134 - 1] : i10) == i133) {
                bVar.d(false);
                uVar7.a();
                bVar.b.f22519x.O(w0.i.f22543c);
            }
            int i135 = qVar.F.f21709i;
            i40 = i40;
            if (i40 != qVar.k0(i135)) {
                qVar.h0(i135, i40);
            }
            if (z10) {
                i40 = 1;
            }
            qVar.F.d();
            bVar.c();
        }
        ArrayList arrayList5 = qVar.f21684h.f8904t;
        d1 d1Var3 = (d1) arrayList5.remove(arrayList5.size() - 1);
        if (d1Var3 != null && !z12) {
            d1Var3.f21566c++;
        }
        qVar.f21685i = d1Var3;
        qVar.f21686j = uVar.a() + i40;
        qVar.l = uVar.a();
        qVar.f21687k = uVar.a() + i40;
    }

    public final void r() {
        q(false);
        h1 h1VarB = B();
        if (h1VarB != null) {
            int i2 = h1VarB.f21592a;
            if ((i2 & 1) != 0) {
                h1VarB.f21592a = i2 | 2;
            }
        }
    }

    public final void s() {
        q(false);
    }

    public final void t() {
        q(true);
    }

    public final void u() {
        q(false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final h1 v() {
        h1 h1Var;
        Throwable th;
        h1 h1Var2;
        c cVarA;
        Object k1Var;
        jg.m mVar = this.D;
        if (mVar.f8904t.isEmpty()) {
            h1Var = null;
        } else {
            ArrayList arrayList = mVar.f8904t;
            h1Var = (h1) arrayList.remove(arrayList.size() - 1);
        }
        if (h1Var != null) {
            h1Var.f21592a &= -9;
        }
        if (h1Var != null) {
            int i2 = this.A;
            s.w wVar = h1Var.f21596f;
            if (wVar == null || (h1Var.f21592a & 16) != 0) {
                th = null;
                k1Var = th;
                break;
            }
            Object[] objArr = wVar.b;
            int[] iArr = wVar.f19236c;
            long[] jArr = wVar.f19235a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        th = null;
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j10 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                if (iArr[i13] != i2) {
                                    k1Var = new i0.k1(h1Var, i2, wVar, 1);
                                    break loop0;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 == 8) {
                        }
                    } else {
                        th = null;
                    }
                    if (i10 != length) {
                        i10++;
                    }
                }
            } else {
                th = null;
            }
            k1Var = th;
            break;
            if (k1Var != null) {
                w0.d0 d0Var = this.L.b.f22519x;
                w0.h hVar = w0.h.f22542c;
                int i14 = hVar.b;
                d0Var.P(hVar);
                u7.f.D(d0Var, 0, k1Var);
                u7.f.D(d0Var, 1, this.f21683g);
                int i15 = d0Var.D;
                int i16 = hVar.f22534a;
                if (i15 != w0.d0.I(d0Var, i16) || d0Var.E != w0.d0.I(d0Var, i14)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i17 = 0;
                    for (int i18 = 0; i18 < i16; i18++) {
                        if (((1 << i18) & d0Var.D) != 0) {
                            if (i17 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(hVar.b(i18));
                            i17++;
                        }
                    }
                    String string = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i19 = 0;
                    for (int i20 = 0; i20 < i14; i20++) {
                        if (((1 << i20) & d0Var.E) != 0) {
                            if (i17 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(hVar.c(i20));
                            i19++;
                        }
                    }
                    String string2 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(hVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    sb4.append(i17);
                    sb4.append(" int arguments (");
                    t8.c.u(sb4, string, ") and ", i19, " object arguments (");
                    t8.c.t(sb4, string2, ").");
                    throw th;
                }
            }
        } else {
            th = null;
        }
        if (h1Var != null) {
            int i21 = h1Var.f21592a;
            if ((i21 & 16) == 0 && ((i21 & 1) != 0 || this.f21691p)) {
                if (h1Var.f21593c == null) {
                    if (this.O) {
                        t1 t1Var = this.H;
                        cVarA = t1Var.b(t1Var.f21744u);
                    } else {
                        q1 q1Var = this.F;
                        cVarA = q1Var.a(q1Var.f21709i);
                    }
                    h1Var.f21593c = cVarA;
                }
                h1Var.f21592a &= -5;
                h1Var2 = h1Var;
            } else {
                h1Var2 = th;
            }
        } else {
            h1Var2 = th;
        }
        q(false);
        return h1Var2;
    }

    public final void w() {
        if (this.f21699x && this.F.f21709i == this.f21700y) {
            this.f21700y = -1;
            this.f21699x = false;
        }
        q(false);
    }

    public final void x() {
        q(false);
        this.b.b();
        q(false);
        w0.b bVar = this.L;
        if (bVar.f22522c) {
            bVar.d(false);
            bVar.d(false);
            bVar.b.f22519x.O(w0.i.f22543c);
            bVar.f22522c = false;
        }
        bVar.b();
        if (bVar.f22523d.b != 0) {
            d.y("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f21684h.f8904t.isEmpty()) {
            d.y("Start/end imbalance");
            throw null;
        }
        i();
        this.F.c();
        this.f21697v = this.f21698w.a() != 0;
    }

    public final void y(boolean z10, d1 d1Var) {
        this.f21684h.f8904t.add(this.f21685i);
        this.f21685i = d1Var;
        int i2 = this.f21687k;
        g2.u uVar = this.f21688m;
        uVar.b(i2);
        uVar.b(this.l);
        uVar.b(this.f21686j);
        if (z10) {
            this.f21686j = 0;
        }
        this.f21687k = 0;
        this.l = 0;
    }

    public final void z() {
        r1 r1Var = new r1();
        if (this.B) {
            r1Var.c();
        }
        if (this.b.c()) {
            r1Var.C = new s.r();
        }
        this.G = r1Var;
        t1 t1VarE = r1Var.e();
        t1VarE.e(true);
        this.H = t1VarE;
    }
}
