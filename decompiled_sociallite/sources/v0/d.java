package v0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import ge.p3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f21556a = new v0("provider");
    public static final v0 b = new v0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0 f21557c = new v0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v0 f21558d = new v0("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v0 f21559e = new v0("reference");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e5.c f21560f = new e5.c(21);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f21561g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f0 f21562h = new f0();

    public static final xf.e A(n nVar) {
        sf.u uVar = sf.u.f19815u;
        xe.i iVarH = ((q) nVar).b.h();
        return sf.y.b(iVarH.p(new sf.e1((sf.b1) iVarH.l(uVar))).p(xe.j.f23216t));
    }

    public static final long B() {
        return Thread.currentThread().getId();
    }

    public static final void C(t1 t1Var, g2.w0 w0Var) {
        int i2;
        int iC;
        int iO;
        int i10 = t1Var.f21742s;
        int i11 = t1Var.f21743t;
        while (i10 < i11) {
            Object objW = t1Var.w(i10);
            if (objW instanceof k) {
                w0Var.h((k) objW, t1Var.o() - t1Var.D(t1Var.b, t1Var.p(i10)), -1, -1);
            }
            int iD = t1Var.D(t1Var.b, t1Var.p(i10));
            int i12 = i10 + 1;
            int iF = t1Var.f(t1Var.b, t1Var.p(i12));
            int i13 = iD;
            while (i13 < iF) {
                int i14 = i13 - iD;
                Object obj = t1Var.f21727c[t1Var.g(i13)];
                boolean z10 = obj instanceof n1;
                p0 p0Var = m.f21654a;
                if (z10) {
                    n1 n1Var = (n1) obj;
                    m1 m1Var = n1Var.f21661a;
                    if (m1Var instanceof o) {
                        i2 = i11;
                    } else {
                        int iG = t1Var.g(t1Var.E(i10, i14));
                        Object[] objArr = t1Var.f21727c;
                        i2 = i11;
                        Object obj2 = objArr[iG];
                        objArr[iG] = p0Var;
                        if (obj != obj2) {
                            y("Slot table is out of sync");
                            throw null;
                        }
                        int iO2 = t1Var.o() - i14;
                        c cVar = n1Var.b;
                        if (cVar == null || !cVar.a()) {
                            iC = -1;
                            iO = -1;
                        } else {
                            iC = t1Var.c(cVar);
                            iO = t1Var.o() - t1Var.f(t1Var.b, t1Var.p(t1Var.q(iC) + iC));
                        }
                        w0Var.h(m1Var, iO2, iC, iO);
                    }
                } else {
                    i2 = i11;
                    if (obj instanceof h1) {
                        int iG2 = t1Var.g(t1Var.E(i10, i14));
                        Object[] objArr2 = t1Var.f21727c;
                        Object obj3 = objArr2[iG2];
                        objArr2[iG2] = p0Var;
                        if (obj != obj3) {
                            y("Slot table is out of sync");
                            throw null;
                        }
                        ((h1) obj).c();
                    } else {
                        continue;
                    }
                }
                i13++;
                i11 = i2;
            }
            i10 = i12;
        }
    }

    public static final x0.d D() {
        mc.c cVar = y1.b;
        x0.d dVar = (x0.d) cVar.j();
        if (dVar != null) {
            return dVar;
        }
        x0.d dVar2 = new x0.d(new f1.z[0]);
        cVar.p(dVar2);
        return dVar2;
    }

    public static final c0 E(hf.a aVar) {
        mc.c cVar = y1.f21766a;
        return new c0(aVar, null);
    }

    public static final c0 F(hf.a aVar, p0 p0Var) {
        mc.c cVar = y1.f21766a;
        return new c0(aVar, p0Var);
    }

    public static final int G(int i2, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iB = kotlin.jvm.internal.l.b(((k0) list.get(i11)).b, i2);
            if (iB < 0) {
                i10 = i11 + 1;
            } else {
                if (iB <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int H(n nVar) {
        return ((q) nVar).P;
    }

    public static final Object I(Object obj, Object obj2, Object obj3) {
        l0 l0Var = obj instanceof l0 ? (l0) obj : null;
        if (l0Var == null) {
            return null;
        }
        Object obj4 = l0Var.b;
        Object obj5 = l0Var.f21632a;
        if (obj5.equals(obj2) && kotlin.jvm.internal.l.a(obj4, obj3)) {
            return obj;
        }
        Object objI = I(obj5, obj2, obj3);
        return objI == null ? I(obj4, obj2, obj3) : objI;
    }

    public static final q0 J(xe.i iVar) {
        q0 q0Var = (q0) iVar.l(p0.f21671u);
        if (q0Var != null) {
            return q0Var;
        }
        w4.d.l("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void K(q qVar, hf.e eVar) {
        eVar.getClass();
        kotlin.jvm.internal.a0.d(2, eVar);
        eVar.invoke(qVar, 1);
    }

    public static List L(t1 t1Var, int i2, t1 t1Var2, boolean z10, boolean z11, boolean z12) {
        List list;
        boolean z13;
        c cVarH;
        int iQ = t1Var.q(i2);
        int i10 = i2 + iQ;
        int iF = t1Var.f(t1Var.b, t1Var.p(i2));
        int iF2 = t1Var.f(t1Var.b, t1Var.p(i10));
        int i11 = iF2 - iF;
        boolean z14 = i2 >= 0 && (t1Var.b[(t1Var.p(i2) * 5) + 1] & 201326592) != 0;
        t1Var2.r(iQ);
        t1Var2.s(i11, t1Var2.f21742s);
        if (t1Var.f21731g < i10) {
            t1Var.u(i10);
        }
        if (t1Var.f21735k < iF2) {
            t1Var.v(iF2, i10);
        }
        int[] iArr = t1Var2.b;
        int i12 = t1Var2.f21742s;
        int i13 = i12 * 5;
        te.j.N(i13, i2 * 5, i10 * 5, t1Var.b, iArr);
        Object[] objArr = t1Var2.f21727c;
        int i14 = t1Var2.f21733i;
        te.j.O(i14, iF, iF2, t1Var.f21727c, objArr);
        int i15 = t1Var2.f21744u;
        iArr[i13 + 2] = i15;
        int i16 = i12 - i2;
        int i17 = i12 + iQ;
        int iF3 = i14 - t1Var2.f(iArr, i12);
        int i18 = t1Var2.f21736m;
        int i19 = t1Var2.l;
        int length = objArr.length;
        boolean z15 = z14;
        int i20 = i18;
        int i21 = i12;
        while (i21 < i17) {
            if (i21 != i12) {
                int i22 = (i21 * 5) + 2;
                iArr[i22] = iArr[i22] + i16;
            }
            int i23 = i16;
            iArr[(i21 * 5) + 4] = t1.h(t1Var2.f(iArr, i21) + iF3, i20 < i21 ? 0 : t1Var2.f21735k, i19, length);
            if (i21 == i20) {
                i20++;
            }
            i21++;
            i17 = i17;
            i16 = i23;
        }
        int i24 = i16;
        int i25 = i17;
        t1Var2.f21736m = i20;
        int iQ2 = q(i2, t1Var.n(), t1Var.f21728d);
        int iQ3 = q(i10, t1Var.n(), t1Var.f21728d);
        if (iQ2 < iQ3) {
            ArrayList arrayList = t1Var.f21728d;
            ArrayList arrayList2 = new ArrayList(iQ3 - iQ2);
            for (int i26 = iQ2; i26 < iQ3; i26++) {
                c cVar = (c) arrayList.get(i26);
                cVar.f21547a += i24;
                arrayList2.add(cVar);
            }
            t1Var2.f21728d.addAll(q(t1Var2.f21742s, t1Var2.n(), t1Var2.f21728d), arrayList2);
            arrayList.subList(iQ2, iQ3).clear();
            list = arrayList2;
        } else {
            list = te.s.f20249t;
        }
        if (!list.isEmpty()) {
            HashMap map = t1Var.f21729e;
            HashMap map2 = t1Var2.f21729e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = t1Var2.f21744u;
        HashMap map3 = t1Var2.f21729e;
        if (map3 != null && (cVarH = t1Var2.H(i15)) != null) {
        }
        int iX = t1Var.x(t1Var.b, i2);
        if (!z12) {
            z13 = false;
        } else if (z10) {
            boolean z16 = iX >= 0;
            if (z16) {
                t1Var.F();
                t1Var.a(iX - t1Var.f21742s);
                t1Var.F();
            }
            t1Var.a(i2 - t1Var.f21742s);
            boolean z17 = t1Var.z();
            if (z16) {
                t1Var.C();
                t1Var.i();
                t1Var.C();
                t1Var.i();
            }
            z13 = z17;
        } else {
            boolean zA = t1Var.A(i2, iQ);
            t1Var.B(iF, i11, i2 - 1);
            z13 = zA;
        }
        if (z13) {
            y("Unexpectedly removed anchors");
            throw null;
        }
        t1Var2.f21738o += p(iArr, i12) ? 1 : r(iArr, i12);
        if (z11) {
            t1Var2.f21742s = i25;
            t1Var2.f21733i = i14 + i11;
        }
        if (z15) {
            t1Var2.J(i15);
        }
        return list;
    }

    public static final x0 M(float f10) {
        int i2 = b.b;
        return new x0(f10);
    }

    public static final y0 N(int i2) {
        int i10 = b.b;
        return new y0(i2);
    }

    public static final z0 O(long j10) {
        int i2 = b.b;
        return new z0(j10);
    }

    public static final f1.y P() {
        return new f1.y();
    }

    public static final b1 Q(Object obj, p0 p0Var) {
        int i2 = b.b;
        return new b1(obj, p0Var);
    }

    public static final u0 S(p3 p3Var, Object obj, hf.e eVar, n nVar, int i2) {
        q qVar = (q) nVar;
        Object objO = qVar.O();
        p0 p0Var = m.f21654a;
        if (objO == p0Var) {
            objO = Q(p3Var, p0.f21675y);
            qVar.i0(objO);
        }
        u0 u0Var = (u0) objO;
        boolean zH = qVar.h(eVar);
        Object objO2 = qVar.O();
        if (zH || objO2 == p0Var) {
            objO2 = new z1(eVar, u0Var, null, 1);
            qVar.i0(objO2);
        }
        g((hf.e) objO2, obj, qVar);
        return u0Var;
    }

    public static final u0 T(Object obj, Object obj2, Object obj3, hf.e eVar, n nVar, int i2) {
        q qVar = (q) nVar;
        Object objO = qVar.O();
        p0 p0Var = m.f21654a;
        if (objO == p0Var) {
            objO = Q(obj, p0.f21675y);
            qVar.i0(objO);
        }
        u0 u0Var = (u0) objO;
        boolean zH = qVar.h(eVar);
        Object objO2 = qVar.O();
        if (zH || objO2 == p0Var) {
            objO2 = new z1(eVar, u0Var, null, 2);
            qVar.i0(objO2);
        }
        h(obj2, obj3, (hf.e) objO2, qVar);
        return u0Var;
    }

    public static final Object U(d1.d dVar, f1 f1Var) {
        f1Var.getClass();
        Object objB = dVar.get(f1Var);
        if (objB == null) {
            objB = f1Var.b();
        }
        return ((f2) objB).a(dVar);
    }

    public static final p V(n nVar) {
        q qVar = (q) nVar;
        qVar.W(206, f21559e);
        if (qVar.O) {
            t1 t1Var = qVar.H;
            int i2 = t1Var.f21744u;
            int iP = t1Var.p(i2);
            int[] iArr = t1Var.b;
            int i10 = (iP * 5) + 1;
            int i11 = iArr[i10];
            if ((i11 & 134217728) == 0) {
                iArr[i10] = i11 | 134217728;
                if (!l(iArr, iP)) {
                    t1Var.J(t1Var.x(t1Var.b, i2));
                }
            }
        }
        Object objH = qVar.H();
        o oVar = objH instanceof o ? (o) objH : null;
        if (oVar == null) {
            oVar = new o(new p(qVar, qVar.P, qVar.f21691p, qVar.B, qVar.f21683g.I));
            qVar.j0(oVar);
        }
        p pVar = oVar.f21662t;
        pVar.f21669f.setValue(qVar.m());
        qVar.q(false);
        return pVar;
    }

    public static final u0 W(Object obj, n nVar) {
        q qVar = (q) nVar;
        Object objO = qVar.O();
        if (objO == m.f21654a) {
            objO = Q(obj, p0.f21675y);
            qVar.i0(objO);
        }
        u0 u0Var = (u0) objO;
        u0Var.setValue(obj);
        return u0Var;
    }

    public static final void X(t1 t1Var, g2.w0 w0Var) {
        int iO;
        int[] iArr = t1Var.b;
        int i2 = t1Var.f21742s;
        int iF = t1Var.f(iArr, t1Var.p(t1Var.q(i2) + i2));
        for (int iF2 = t1Var.f(t1Var.b, t1Var.p(t1Var.f21742s)); iF2 < iF; iF2++) {
            Object obj = t1Var.f21727c[t1Var.g(iF2)];
            int iC = -1;
            if (obj instanceof k) {
                int iO2 = t1Var.o() - iF2;
                k kVar = (k) obj;
                s.c0 c0Var = (s.c0) w0Var.f5610f;
                if (c0Var == null) {
                    int i10 = s.h0.f19185a;
                    c0Var = new s.c0();
                    w0Var.f5610f = c0Var;
                }
                c0Var.b[c0Var.d(kVar)] = kVar;
                w0Var.h(kVar, iO2, -1, -1);
            }
            if (obj instanceof n1) {
                int iO3 = t1Var.o() - iF2;
                n1 n1Var = (n1) obj;
                c cVar = n1Var.b;
                if (cVar == null || !cVar.a()) {
                    iO = -1;
                } else {
                    iC = t1Var.c(cVar);
                    iO = t1Var.o() - t1Var.f(t1Var.b, t1Var.p(t1Var.q(iC) + iC));
                }
                w0Var.h(n1Var.f21661a, iO3, iC, iO);
            }
            if (obj instanceof h1) {
                ((h1) obj).c();
            }
        }
        t1Var.z();
    }

    public static final void Y(boolean z10) {
        if (z10) {
            return;
        }
        y("Check failed");
        throw null;
    }

    public static final int Z(int i2, int i10, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((c) arrayList.get(i12)).f21547a;
            if (i13 < 0) {
                i13 += i10;
            }
            int iB = kotlin.jvm.internal.l.b(i13, i2);
            if (iB < 0) {
                i11 = i12 + 1;
            } else {
                if (iB <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
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
    public static final void a(g1 g1Var, hf.e eVar, n nVar, int i2) {
        f2 f2Var;
        boolean z10;
        h1 h1VarV;
        a1.n nVarU;
        q qVar = (q) nVar;
        qVar.b0(-1350970552);
        g2.u uVar = qVar.f21698w;
        d1.d dVarM = qVar.m();
        qVar.W(RCHTTPStatusCodes.CREATED, b);
        Object objO = qVar.O();
        if (kotlin.jvm.internal.l.a(objO, m.f21654a)) {
            f2Var = null;
        } else {
            objO.getClass();
            f2Var = (f2) objO;
        }
        f1 f1Var = g1Var.f21579a;
        Object objC = f1Var.c(g1Var, f2Var);
        boolean zEquals = objC.equals(f2Var);
        if (!zEquals) {
            qVar.i0(objC);
        }
        if (!qVar.O) {
            q1 q1Var = qVar.F;
            Object objB = q1Var.b(q1Var.b, q1Var.f21707g);
            objB.getClass();
            d1.d dVar = (d1.d) objB;
            if (!(qVar.E() && zEquals) && (g1Var.f21583f || !dVarM.containsKey(f1Var))) {
                a1.n nVarU2 = dVarM.f34t.u(f1Var, f1Var.hashCode(), objC, 0);
                if (nVarU2 != null) {
                    dVarM = new d1.d((a1.o) nVarU2.f60v, dVarM.f35u + nVarU2.f59u);
                }
            } else {
                dVarM = dVar;
            }
            if (qVar.f21699x || dVar != dVarM) {
                z10 = true;
            }
            if (z10 && !qVar.O) {
                qVar.M(dVarM);
            }
            uVar.b(qVar.f21697v ? 1 : 0);
            qVar.f21697v = z10;
            qVar.J = dVarM;
            qVar.U(f21557c, 202, dVarM, 0);
            eVar.invoke(qVar, Integer.valueOf((i2 >> 3) & 14));
            qVar.q(false);
            qVar.q(false);
            qVar.f21697v = uVar.a() != 0;
            qVar.J = null;
            h1VarV = qVar.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new c0.l(g1Var, eVar, i2, 10);
            }
        }
        if ((g1Var.f21583f || !dVarM.containsKey(f1Var)) && (nVarU = dVarM.f34t.u(f1Var, f1Var.hashCode(), objC, 0)) != null) {
            dVarM = new d1.d((a1.o) nVarU.f60v, dVarM.f35u + nVarU.f59u);
        }
        qVar.I = true;
        z10 = false;
        if (z10) {
            qVar.M(dVarM);
        }
        uVar.b(qVar.f21697v ? 1 : 0);
        qVar.f21697v = z10;
        qVar.J = dVarM;
        qVar.U(f21557c, 202, dVarM, 0);
        eVar.invoke(qVar, Integer.valueOf((i2 >> 3) & 14));
        qVar.q(false);
        qVar.q(false);
        qVar.f21697v = uVar.a() != 0;
        qVar.J = null;
        h1VarV = qVar.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new c0.l(g1Var, eVar, i2, 10);
        }
    }

    public static final void a0(hf.e eVar, Object obj, n nVar) {
        q qVar = (q) nVar;
        if (qVar.O || !kotlin.jvm.internal.l.a(qVar.O(), obj)) {
            qVar.i0(obj);
            qVar.b(obj, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(g1[] g1VarArr, hf.e eVar, n nVar, int i2) {
        d1.d dVarE;
        boolean z10;
        h1 h1VarV;
        q qVar = (q) nVar;
        qVar.b0(-1390796515);
        g2.u uVar = qVar.f21698w;
        d1.d dVarM = qVar.m();
        qVar.W(RCHTTPStatusCodes.CREATED, b);
        boolean z11 = qVar.O;
        v0 v0Var = f21558d;
        if (z11) {
            d1.d dVarF0 = f0(g1VarArr, dVarM, d1.d.f3665w);
            dVarM.getClass();
            d1.c cVar = new d1.c(dVarM);
            cVar.f3664z = dVarM;
            cVar.putAll(dVarF0);
            dVarE = cVar.a();
            qVar.W(204, v0Var);
            qVar.H();
            qVar.j0(dVarE);
            qVar.H();
            qVar.j0(dVarF0);
            qVar.q(false);
            qVar.I = true;
        } else {
            q1 q1Var = qVar.F;
            Object objG = q1Var.g(q1Var.f21707g, 0);
            objG.getClass();
            d1.d dVar = (d1.d) objG;
            q1 q1Var2 = qVar.F;
            Object objG2 = q1Var2.g(q1Var2.f21707g, 1);
            objG2.getClass();
            d1.d dVar2 = (d1.d) objG2;
            d1.d dVarF1 = f0(g1VarArr, dVarM, dVar2);
            if (!qVar.E() || qVar.f21699x || !dVar2.equals(dVarF1)) {
                dVarM.getClass();
                d1.c cVar2 = new d1.c(dVarM);
                cVar2.f3664z = dVarM;
                cVar2.putAll(dVarF1);
                dVarE = cVar2.a();
                qVar.W(204, v0Var);
                qVar.H();
                qVar.j0(dVarE);
                qVar.H();
                qVar.j0(dVarF1);
                qVar.q(false);
                if (qVar.f21699x || !kotlin.jvm.internal.l.a(dVarE, dVar)) {
                    z10 = true;
                }
                if (z10 && !qVar.O) {
                    qVar.M(dVarE);
                }
                uVar.b(qVar.f21697v ? 1 : 0);
                qVar.f21697v = z10;
                qVar.J = dVarE;
                qVar.U(f21557c, 202, dVarE, 0);
                eVar.invoke(qVar, Integer.valueOf((i2 >> 3) & 14));
                qVar.q(false);
                qVar.q(false);
                qVar.f21697v = uVar.a() != 0;
                qVar.J = null;
                h1VarV = qVar.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new c0.l(g1VarArr, eVar, i2, 9);
                }
            }
            qVar.f21687k = qVar.F.l() + qVar.f21687k;
            dVarE = dVar;
        }
        z10 = false;
        if (z10) {
            qVar.M(dVarE);
        }
        uVar.b(qVar.f21697v ? 1 : 0);
        qVar.f21697v = z10;
        qVar.J = dVarE;
        qVar.U(f21557c, 202, dVarE, 0);
        eVar.invoke(qVar, Integer.valueOf((i2 >> 3) & 14));
        qVar.q(false);
        qVar.q(false);
        qVar.f21697v = uVar.a() != 0;
        qVar.J = null;
        h1VarV = qVar.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new c0.l(g1VarArr, eVar, i2, 9);
        }
    }

    public static final q7.h b0(hf.a aVar) {
        return new q7.h(new e8.d(aVar, null));
    }

    public static final void c(Object obj, hf.c cVar, n nVar) {
        q qVar = (q) nVar;
        boolean zF = qVar.f(obj);
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            objO = new d0(cVar);
            qVar.i0(objO);
        }
    }

    public static final void c0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(Object obj, Object obj2, hf.c cVar, n nVar) {
        q qVar = (q) nVar;
        boolean zF = qVar.f(obj) | qVar.f(obj2);
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            objO = new d0(cVar);
            qVar.i0(objO);
        }
    }

    public static final void d0(String str) {
        throw new IllegalStateException(str);
    }

    public static final void e(Object obj, Object obj2, Object obj3, hf.c cVar, n nVar) {
        q qVar = (q) nVar;
        boolean zF = qVar.f(obj) | qVar.f(obj2) | qVar.f(obj3);
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            objO = new d0(cVar);
            qVar.i0(objO);
        }
    }

    public static final int e0(int i2) {
        int i10 = 306783378 & i2;
        int i11 = 613566756 & i2;
        return (i2 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    public static final void f(Object[] objArr, hf.c cVar, n nVar) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((q) nVar).f(obj);
        }
        q qVar = (q) nVar;
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            qVar.i0(new d0(cVar));
        }
    }

    public static final d1.d f0(g1[] g1VarArr, d1.d dVar, d1.d dVar2) {
        d1.d dVar3 = d1.d.f3665w;
        d1.c cVar = new d1.c(dVar3);
        cVar.f3664z = dVar3;
        for (g1 g1Var : g1VarArr) {
            f1 f1Var = g1Var.f21579a;
            if (g1Var.f21583f || !dVar.containsKey(f1Var)) {
                cVar.put(f1Var, f1Var.c(g1Var, (f2) dVar2.get(f1Var)));
            }
        }
        return cVar.a();
    }

    public static final void g(hf.e eVar, Object obj, n nVar) {
        q qVar = (q) nVar;
        xe.i iVarH = qVar.b.h();
        boolean zF = qVar.f(obj);
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            objO = new n0(iVarH, eVar);
            qVar.i0(objO);
        }
    }

    public static final void h(Object obj, Object obj2, hf.e eVar, n nVar) {
        q qVar = (q) nVar;
        xe.i iVarH = qVar.b.h();
        boolean zF = qVar.f(obj) | qVar.f(obj2);
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            objO = new n0(iVarH, eVar);
            qVar.i0(objO);
        }
    }

    public static final void i(Object obj, Object obj2, Object obj3, hf.e eVar, n nVar) {
        q qVar = (q) nVar;
        xe.i iVarH = qVar.b.h();
        boolean zF = qVar.f(obj) | qVar.f(obj2) | qVar.f(obj3);
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            objO = new n0(iVarH, eVar);
            qVar.i0(objO);
        }
    }

    public static final void j(Object[] objArr, hf.e eVar, n nVar) {
        q qVar = (q) nVar;
        xe.i iVarH = qVar.b.h();
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= qVar.f(obj);
        }
        Object objO = qVar.O();
        if (zF || objO == m.f21654a) {
            qVar.i0(new n0(iVarH, eVar));
        }
    }

    public static final void k(hf.a aVar, n nVar) {
        w0.d0 d0Var = ((q) nVar).L.b.f22519x;
        w0.v vVar = w0.v.f22560c;
        int i2 = vVar.b;
        d0Var.P(vVar);
        u7.f.D(d0Var, 0, aVar);
        int i10 = d0Var.D;
        int i11 = vVar.f22534a;
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
                sb2.append(vVar.b(i13));
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
                sb3.append(vVar.c(i15));
                i14++;
            }
        }
        String string2 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(vVar);
        sb4.append(". Not all arguments were provided. Missing ");
        sb4.append(i12);
        sb4.append(" int arguments (");
        t8.c.u(sb4, string, ") and ", i14, " object arguments (");
        t8.c.t(sb4, string2, ").");
        throw null;
    }

    public static final boolean l(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 67108864) != 0;
    }

    public static final int m(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final boolean n(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean o(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean p(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 1073741824) != 0;
    }

    public static final int q(int i2, int i10, ArrayList arrayList) {
        int iZ = Z(i2, i10, arrayList);
        return iZ >= 0 ? iZ : -(iZ + 1);
    }

    public static final int r(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & 67108863;
    }

    public static final int s(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    public static final void t(int i2, int i10, ArrayList arrayList) {
        int iG = G(i2, arrayList);
        if (iG < 0) {
            iG = -(iG + 1);
        }
        while (iG < arrayList.size() && ((k0) arrayList.get(iG)).b < i10) {
            arrayList.remove(iG);
        }
    }

    public static final int u(int[] iArr, int i2) {
        int i10 = i2 * 5;
        int i11 = iArr[i10 + 4];
        int i12 = 1;
        switch (iArr[i10 + 1] >> 28) {
            case 0:
                i12 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        return i12 + i11;
    }

    public static final void v(int i2, int i10, int[] iArr) {
        Y(i10 >= 0);
        iArr[(i2 * 5) + 3] = i10;
    }

    public static final void w(int i2, int i10, int[] iArr) {
        Y(i10 >= 0 && i10 < 67108863);
        int i11 = (i2 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final u0 x(vf.b0 b0Var, n nVar) {
        Object value = b0Var.getValue();
        q qVar = (q) nVar;
        xe.j jVar = xe.j.f23216t;
        boolean zH = qVar.h(jVar) | qVar.h(b0Var);
        Object objO = qVar.O();
        if (zH || objO == m.f21654a) {
            objO = new u.p(jVar, b0Var, (xe.d) null, 2);
            qVar.i0(objO);
        }
        return T(value, b0Var, jVar, (hf.e) objO, qVar, 0);
    }

    public static final void y(String str) {
        throw new l(t8.c.i("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void z(String str) {
        throw new l(t8.c.i("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
}
