package d8;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import com.google.android.gms.internal.play_billing.b2;
import java.io.IOException;
import java.util.Map;
import jg.a0;
import jg.c0;
import jg.r;
import jg.v;
import jg.z;
import ke.c1;
import lc.p;
import me.y9;
import rb.b0;
import se.o;
import xg.e0;
import xg.g0;
import xg.w;
import xg.y;

/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final jg.c f3715f = new jg.c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final jg.c f3716g = new jg.c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3717a;
    public final j8.m b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f3718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f3719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3720e;

    public l(String str, j8.m mVar, o oVar, o oVar2, boolean z10) {
        this.f3717a = str;
        this.b = mVar;
        this.f3718c = oVar;
        this.f3719d = oVar2;
        this.f3720e = z10;
    }

    public static String d(String str, r rVar) {
        String strB;
        String str2 = rVar != null ? rVar.f8925a : null;
        if ((str2 == null || qf.r.p0(str2, "text/plain", false)) && (strB = n8.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return qf.k.W0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01fe A[Catch: Exception -> 0x01fb, TryCatch #2 {Exception -> 0x01fb, blocks: (B:93:0x01cf, B:95:0x01d5, B:99:0x01f7, B:103:0x01fe, B:104:0x0203), top: B:120:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0217  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d5 A[Catch: Exception -> 0x01fb, TryCatch #2 {Exception -> 0x01fb, blocks: (B:93:0x01cf, B:95:0x01d5, B:99:0x01f7, B:103:0x01fe, B:104:0x0203), top: B:120:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f6  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, se.h] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, se.h] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, se.h] */
    @Override // d8.g
    public final Object a(xe.d dVar) throws Exception {
        k kVar;
        c8.j jVar;
        c8.j jVar2;
        i8.d dVarA;
        i8.d dVar2;
        l lVar;
        c8.a aVar;
        a0 a0Var;
        a0 a0Var2;
        Exception e10;
        c8.j jVar3;
        l lVar2;
        c0 c0Var;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i2 = kVar.f3714y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.f3714y = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, (ze.c) dVar);
            }
        } else {
            kVar = new k(this, (ze.c) dVar);
        }
        Object obj = kVar.f3712w;
        int i10 = kVar.f3714y;
        b8.e eVar = b8.e.f1801w;
        b8.e eVar2 = b8.e.f1800v;
        ye.a aVar2 = ye.a.f23667t;
        if (i10 == 0) {
            se.a.f(obj);
            j8.m mVar = this.b;
            boolean z10 = mVar.f8685n.f8614t;
            String str = this.f3717a;
            if (!z10 || (aVar = (c8.a) this.f3719d.getValue()) == null) {
                jVar = null;
            } else {
                String str2 = mVar.f8681i;
                if (str2 == null) {
                    str2 = str;
                }
                c8.h hVar = ((c8.k) aVar).b;
                xg.i iVar = xg.i.f23299w;
                c8.e eVarF = hVar.f(b0.p(str2).b("SHA-256").d());
                if (eVarF != null) {
                    jVar = new c8.j(eVarF);
                } else {
                    jVar = null;
                }
            }
            try {
                if (jVar != null) {
                    xg.l lVarC = c();
                    c8.e eVar3 = jVar.f2341t;
                    if (eVar3.f2328u) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l = lVarC.h((w) eVar3.f2327t.f2320c.get(0)).f23314d;
                    if (l != null && l.longValue() == 0) {
                        return new n(g(jVar), d(str, null), eVar2);
                    }
                    if (!this.f3720e) {
                        b8.l lVarG = g(jVar);
                        i8.b bVarF = f(jVar);
                        return new n(lVarG, d(str, bVarF != null ? (r) bVarF.b.getValue() : null), eVar2);
                    }
                    dVarA = new i8.c(e(), f(jVar)).a();
                    i8.b bVar = dVarA.b;
                    if (dVarA.f8514a == null && bVar != null) {
                        return new n(g(jVar), d(str, (r) bVar.b.getValue()), eVar2);
                    }
                } else {
                    dVarA = new i8.c(e(), null).a();
                }
                p pVar = dVarA.f8514a;
                pVar.getClass();
                kVar.f3709t = this;
                kVar.f3710u = jVar;
                kVar.f3711v = dVarA;
                kVar.f3714y = 1;
                Object objB = b(pVar, kVar);
                if (objB != aVar2) {
                    c8.j jVar4 = jVar;
                    dVar2 = dVarA;
                    obj = objB;
                    jVar2 = jVar4;
                    lVar = this;
                }
                return aVar2;
            } catch (Exception e11) {
                e = e11;
                jVar2 = jVar;
                if (jVar2 != null) {
                    n8.e.a(jVar2);
                }
                throw e;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a0Var2 = (a0) kVar.f3711v;
            jVar3 = kVar.f3710u;
            lVar2 = kVar.f3709t;
            try {
                se.a.f(obj);
                a0Var = (a0) obj;
                try {
                    Bitmap.Config[] configArr = n8.e.f15469a;
                    c0Var = a0Var.f8830z;
                    if (c0Var != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    lVar2.getClass();
                    xg.h hVarF = c0Var.f();
                    Context context = lVar2.b.f8674a;
                    b8.o oVar = new b8.o(hVarF, null);
                    String strD = d(lVar2.f3717a, c0Var.e());
                    if (a0Var.A != null) {
                        eVar = eVar2;
                    }
                    return new n(oVar, strD, eVar);
                } catch (Exception e12) {
                    e = e12;
                    a0Var2 = a0Var;
                    e10 = e;
                    try {
                        n8.e.a(a0Var2);
                        throw e10;
                    } catch (Exception e13) {
                        e = e13;
                        jVar2 = jVar3;
                        if (jVar2 != null) {
                            n8.e.a(jVar2);
                        }
                        throw e;
                    }
                }
            } catch (Exception e14) {
                e10 = e14;
                n8.e.a(a0Var2);
                throw e10;
            }
        }
        dVar2 = (i8.d) kVar.f3711v;
        jVar2 = kVar.f3710u;
        lVar = kVar.f3709t;
        try {
            se.a.f(obj);
        } catch (Exception e15) {
            e = e15;
            if (jVar2 != null) {
                n8.e.a(jVar2);
            }
            throw e;
        }
        a0Var = (a0) obj;
        Bitmap.Config[] configArr2 = n8.e.f15469a;
        c0 c0Var2 = a0Var.f8830z;
        if (c0Var2 == null) {
            throw new IllegalStateException("response body == null");
        }
        try {
            c8.j jVarH = lVar.h(jVar2, dVar2.f8514a, a0Var, dVar2.b);
            String str3 = lVar.f3717a;
            try {
                if (jVarH != null) {
                    b8.l lVarG2 = lVar.g(jVarH);
                    i8.b bVarF2 = lVar.f(jVarH);
                    return new n(lVarG2, d(str3, bVarF2 != null ? (r) bVarF2.b.getValue() : null), eVar);
                }
                if (c0Var2.f().G(1L)) {
                    xg.h hVarF2 = c0Var2.f();
                    Context context2 = lVar.b.f8674a;
                    b8.o oVar2 = new b8.o(hVarF2, null);
                    String strD2 = d(str3, c0Var2.e());
                    if (a0Var.A == null) {
                        eVar = eVar2;
                    }
                    return new n(oVar2, strD2, eVar);
                }
                n8.e.a(a0Var);
                p pVarE = lVar.e();
                kVar.f3709t = lVar;
                kVar.f3710u = jVarH;
                kVar.f3711v = a0Var;
                kVar.f3714y = 2;
                Object objB2 = lVar.b(pVarE, kVar);
                if (objB2 != aVar2) {
                    jVar3 = jVarH;
                    a0Var2 = a0Var;
                    obj = objB2;
                    lVar2 = lVar;
                    a0Var = (a0) obj;
                    Bitmap.Config[] configArr3 = n8.e.f15469a;
                    c0Var = a0Var.f8830z;
                    if (c0Var != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    lVar2.getClass();
                    xg.h hVarF3 = c0Var.f();
                    Context context3 = lVar2.b.f8674a;
                    b8.o oVar3 = new b8.o(hVarF3, null);
                    String strD3 = d(lVar2.f3717a, c0Var.e());
                    if (a0Var.A != null) {
                        eVar = eVar2;
                    }
                    return new n(oVar3, strD3, eVar);
                }
                return aVar2;
            } catch (Exception e16) {
                e = e16;
                jVar3 = jVarH;
                a0Var2 = a0Var;
                e10 = e;
                n8.e.a(a0Var2);
                throw e10;
            }
        } catch (Exception e17) {
            a0Var2 = a0Var;
            e10 = e17;
            jVar3 = jVar2;
            n8.e.a(a0Var2);
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p pVar, ze.c cVar) {
        j jVar;
        a0 a0VarF;
        boolean zE;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.f3708v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f3708v = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objR = jVar.f3706t;
        int i10 = jVar.f3708v;
        if (i10 == 0) {
            se.a.f(objR);
            Bitmap.Config[] configArr = n8.e.f15469a;
            boolean zA = kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper());
            o oVar = this.f3718c;
            if (!zA) {
                v vVar = (v) oVar.getValue();
                vVar.getClass();
                pVar.getClass();
                ng.i iVar = new ng.i(vVar, pVar);
                jVar.f3708v = 1;
                sf.g gVar = new sf.g(1, pf.l.D(jVar));
                gVar.s();
                y9 y9Var = new y9(iVar, 2, gVar);
                iVar.d(y9Var);
                gVar.v(y9Var);
                objR = gVar.r();
                ye.a aVar = ye.a.f23667t;
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (this.b.f8686o.f8614t) {
                    throw new NetworkOnMainThreadException();
                }
                v vVar2 = (v) oVar.getValue();
                vVar2.getClass();
                pVar.getClass();
                a0VarF = new ng.i(vVar2, pVar).f();
            }
            zE = a0VarF.e();
            int i11 = a0VarF.f8827w;
            if (!zE || i11 == 304) {
                return a0VarF;
            }
            c0 c0Var = a0VarF.f8830z;
            if (c0Var != null) {
                n8.e.a(c0Var);
            }
            StringBuilder sbK = c1.k("HTTP ", i11, ": ");
            sbK.append(a0VarF.f8826v);
            throw new ah.p(sbK.toString());
        }
        if (i10 != 1) {
            w4.d.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        se.a.f(objR);
        a0VarF = (a0) objR;
        zE = a0VarF.e();
        int i12 = a0VarF.f8827w;
        if (zE) {
        }
        return a0VarF;
    }

    public final xg.l c() {
        Object value = this.f3719d.getValue();
        value.getClass();
        return ((c8.k) ((c8.a) value)).f2342a;
    }

    public final p e() {
        fa.c cVar = new fa.c(3);
        String strConcat = this.f3717a;
        strConcat.getClass();
        if (qf.r.p0(strConcat, "ws:", true)) {
            strConcat = "http:".concat(strConcat.substring(3));
        } else if (qf.r.p0(strConcat, "wss:", true)) {
            strConcat = "https:".concat(strConcat.substring(4));
        }
        jg.o oVar = new jg.o();
        oVar.f(null, strConcat);
        cVar.f5054t = oVar.c();
        j8.m mVar = this.b;
        jg.n nVar = mVar.f8682j;
        nVar.getClass();
        cVar.f5056v = nVar.d();
        for (Map.Entry entry : mVar.f8683k.f8696a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            cVar.A((Class) key, entry.getValue());
        }
        j8.b bVar = mVar.f8685n;
        boolean z10 = bVar.f8614t;
        boolean z11 = mVar.f8686o.f8614t;
        if (!z11 && z10) {
            cVar.r(jg.c.f8838o);
        } else if (!z11 || z10) {
            if (!z11 && !z10) {
                cVar.r(f3716g);
            }
        } else if (bVar.f8615u) {
            cVar.r(jg.c.f8837n);
        } else {
            cVar.r(f3715f);
        }
        return cVar.q();
    }

    public final i8.b f(c8.j jVar) throws Throwable {
        Throwable th;
        i8.b bVar;
        try {
            xg.l lVarC = c();
            c8.e eVar = jVar.f2341t;
            if (eVar.f2328u) {
                throw new IllegalStateException("snapshot is closed");
            }
            g0 g0VarL = lVarC.l((w) eVar.f2327t.f2320c.get(0));
            g0VarL.getClass();
            xg.a0 a0Var = new xg.a0(g0VarL);
            try {
                bVar = new i8.b(a0Var);
                try {
                    a0Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    a0Var.close();
                } catch (Throwable th4) {
                    se.a.a(th3, th4);
                }
                th = th3;
                bVar = null;
            }
            if (th == null) {
                return bVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final b8.l g(c8.j jVar) {
        c8.e eVar = jVar.f2341t;
        if (eVar.f2328u) {
            w4.d.l("snapshot is closed");
            return null;
        }
        w wVar = (w) eVar.f2327t.f2320c.get(1);
        xg.l lVarC = c();
        String str = this.b.f8681i;
        if (str == null) {
            str = this.f3717a;
        }
        return new b8.l(wVar, lVarC, str, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:96:0x016a  */
    public final c8.j h(c8.j jVar, p pVar, a0 a0Var, i8.b bVar) {
        k7.i iVar;
        c8.c cVarE;
        Throwable th = null;
        if (this.b.f8685n.f8615u) {
            if (this.f3720e) {
                if (!pVar.h().b) {
                    jg.c cVarS = a0Var.G;
                    if (cVarS == null) {
                        jg.c cVar = jg.c.f8837n;
                        cVarS = b2.s(a0Var.f8829y);
                        a0Var.G = cVarS;
                    }
                    if (cVarS.b || kotlin.jvm.internal.l.a(a0Var.f8829y.a("Vary"), "*")) {
                    }
                }
                if (jVar != null) {
                    n8.e.a(jVar);
                }
            }
            int i2 = 7;
            if (jVar != null) {
                c8.e eVar = jVar.f2341t;
                c8.h hVar = eVar.f2329v;
                synchronized (hVar) {
                    eVar.close();
                    cVarE = hVar.e(eVar.f2327t.f2319a);
                }
                if (cVarE != null) {
                    iVar = new k7.i(cVarE, i2);
                } else {
                    iVar = null;
                }
            } else {
                c8.a aVar = (c8.a) this.f3719d.getValue();
                if (aVar == null) {
                    iVar = null;
                } else {
                    String str = this.b.f8681i;
                    if (str == null) {
                        str = this.f3717a;
                    }
                    c8.h hVar2 = ((c8.k) aVar).b;
                    xg.i iVar2 = xg.i.f23299w;
                    c8.c cVarE2 = hVar2.e(b0.p(str).b("SHA-256").d());
                    if (cVarE2 != null) {
                        iVar = new k7.i(cVarE2, i2);
                    } else {
                        iVar = null;
                    }
                }
            }
            if (iVar != null) {
                try {
                    try {
                        if (a0Var.f8827w != 304 || bVar == null) {
                            e0 e0VarK = c().k(((c8.c) iVar.f9147u).e(0));
                            e0VarK.getClass();
                            y yVar = new y(e0VarK);
                            try {
                                new i8.b(a0Var).a(yVar);
                                try {
                                    yVar.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    yVar.close();
                                } catch (Throwable th4) {
                                    se.a.a(th, th4);
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                            e0 e0VarK2 = c().k(((c8.c) iVar.f9147u).e(1));
                            e0VarK2.getClass();
                            y yVar2 = new y(e0VarK2);
                            try {
                                c0 c0Var = a0Var.f8830z;
                                c0Var.getClass();
                                c0Var.f().P(yVar2);
                                try {
                                    yVar2.close();
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                try {
                                    yVar2.close();
                                } catch (Throwable th7) {
                                    se.a.a(th, th7);
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                        } else {
                            z zVarF = a0Var.f();
                            zVarF.f8973f = a.a.h(bVar.f8503f, a0Var.f8829y).d();
                            a0 a0VarA = zVarF.a();
                            e0 e0VarK3 = c().k(((c8.c) iVar.f9147u).e(0));
                            e0VarK3.getClass();
                            y yVar3 = new y(e0VarK3);
                            try {
                                new i8.b(a0VarA).a(yVar3);
                                try {
                                    yVar3.close();
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                try {
                                    yVar3.close();
                                } catch (Throwable th10) {
                                    se.a.a(th, th10);
                                }
                            }
                            if (th != null) {
                                throw th;
                            }
                        }
                        c8.j jVarS = iVar.s();
                        n8.e.a(a0Var);
                        return jVarS;
                    } catch (Throwable th11) {
                        n8.e.a(a0Var);
                        throw th11;
                    }
                } catch (Exception e10) {
                    Bitmap.Config[] configArr = n8.e.f15469a;
                    try {
                        ((c8.c) iVar.f9147u).c(false);
                    } catch (Exception unused) {
                    }
                    throw e10;
                }
            }
        } else if (jVar != null) {
            n8.e.a(jVar);
        }
        return null;
    }
}
