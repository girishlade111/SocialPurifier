package v4;

import ac.b1;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.credentials.CredentialOption;
import c5.d1;
import c5.e1;
import c5.x0;
import c5.y0;
import c5.z0;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import rb.w0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Handler.Callback, c5.w {
    public final r4.s A;
    public final HandlerThread B;
    public final Looper C;
    public final o4.n0 D;
    public final o4.m0 E;
    public final long F;
    public final i G;
    public final ArrayList H;
    public final r4.q I;
    public final o J;
    public final j0 K;
    public final p0 L;
    public final g M;
    public final long N;
    public v0 O;
    public q0 P;
    public a0 Q;
    public boolean R;
    public boolean T;
    public boolean U;
    public boolean W;
    public int X;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21878a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f21879b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f21880c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c0 f21881d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f21882e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f21883f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f21884g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public j f21885h0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d[] f21887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Set f21888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d[] f21889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e5.r f21890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e5.v f21891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f21892y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f5.f f21893z;
    public boolean Y = false;
    public boolean S = false;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f21886i0 = -9223372036854775807L;
    public long V = -9223372036854775807L;

    public d0(d[] dVarArr, e5.r rVar, e5.v vVar, h hVar, f5.f fVar, int i2, w4.f fVar2, v0 v0Var, g gVar, long j10, Looper looper, r4.q qVar, o oVar, w4.m mVar) {
        this.J = oVar;
        this.f21887t = dVarArr;
        this.f21890w = rVar;
        this.f21891x = vVar;
        this.f21892y = hVar;
        this.f21893z = fVar;
        this.X = i2;
        this.O = v0Var;
        this.M = gVar;
        this.N = j10;
        this.I = qVar;
        this.F = hVar.f21929g;
        q0 q0VarH = q0.h(vVar);
        this.P = q0VarH;
        this.Q = new a0(q0VarH);
        this.f21889v = new d[dVarArr.length];
        rVar.getClass();
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d dVar = dVarArr[i10];
            dVar.f21875x = i10;
            dVar.f21876y = mVar;
            dVar.f21877z = qVar;
            dVar.p();
            d[] dVarArr2 = this.f21889v;
            d dVar2 = dVarArr[i10];
            dVar2.getClass();
            dVarArr2[i10] = dVar2;
            d dVar3 = this.f21889v[i10];
            synchronized (dVar3.f21871t) {
                dVar3.J = rVar;
            }
        }
        this.G = new i(this, qVar);
        this.H = new ArrayList();
        this.f21888u = Collections.newSetFromMap(new IdentityHashMap());
        this.D = new o4.n0();
        this.E = new o4.m0();
        rVar.f4410a = this;
        rVar.b = fVar;
        this.f21884g0 = true;
        r4.s sVarA = qVar.a(looper, null);
        this.K = new j0(fVar2, sVarA, new a5.x(this, 27));
        this.L = new p0(this, fVar2, sVarA, mVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.B = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.C = looper2;
        this.A = qVar.a(looper2, this);
    }

    public static Pair F(o4.o0 o0Var, c0 c0Var, boolean z10, int i2, boolean z11, o4.n0 n0Var, o4.m0 m0Var) {
        Object objG;
        o4.o0 o0Var2 = c0Var.f21869a;
        if (o0Var.p()) {
            return null;
        }
        o4.o0 o0Var3 = o0Var2.p() ? o0Var : o0Var2;
        try {
            Pair pairI = o0Var3.i(n0Var, m0Var, c0Var.b, c0Var.f21870c);
            if (!o0Var.equals(o0Var3)) {
                if (o0Var.b(pairI.first) == -1) {
                    if (!z10 || (objG = G(n0Var, m0Var, i2, z11, pairI.first, o0Var3, o0Var)) == null) {
                        return null;
                    }
                    return o0Var.i(n0Var, m0Var, o0Var.g(objG, m0Var).f15874c, -9223372036854775807L);
                }
                if (o0Var3.g(pairI.first, m0Var).f15877f && o0Var3.m(m0Var.f15874c, n0Var, 0L).f15916n == o0Var3.b(pairI.first)) {
                    return o0Var.i(n0Var, m0Var, o0Var.g(pairI.first, m0Var).f15874c, c0Var.f21870c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object G(o4.n0 n0Var, o4.m0 m0Var, int i2, boolean z10, Object obj, o4.o0 o0Var, o4.o0 o0Var2) {
        int iB = o0Var.b(obj);
        int iH = o0Var.h();
        int i10 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i10 < iH && iB2 == -1) {
            o4.n0 n0Var2 = n0Var;
            o4.m0 m0Var2 = m0Var;
            int i11 = i2;
            boolean z11 = z10;
            o4.o0 o0Var3 = o0Var;
            iD = o0Var3.d(iD, m0Var2, n0Var2, i11, z11);
            if (iD == -1) {
                break;
            }
            iB2 = o0Var2.b(o0Var3.l(iD));
            i10++;
            o0Var = o0Var3;
            m0Var = m0Var2;
            n0Var = n0Var2;
            i2 = i11;
            z10 = z11;
        }
        if (iB2 == -1) {
            return null;
        }
        return o0Var2.l(iB2);
    }

    public static void M(d dVar, long j10) {
        dVar.G = true;
        if (dVar instanceof d5.f) {
            d5.f fVar = (d5.f) dVar;
            r4.a.i(fVar.G);
            fVar.f3688d0 = j10;
        }
    }

    public static boolean q(d dVar) {
        return dVar.A != 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void A() throws j {
        int i2;
        int i10;
        float f10 = this.G.e().f15852a;
        j0 j0Var = this.K;
        h0 h0Var = j0Var.f21971i;
        h0 h0Var2 = j0Var.f21972j;
        e5.v vVar = null;
        h0 h0Var3 = h0Var;
        boolean z10 = true;
        while (h0Var3 != null && h0Var3.f21934d) {
            e5.v vVarH = h0Var3.h(f10, this.P.f22024a);
            e5.v vVar2 = h0Var3 == this.K.f21971i ? vVarH : vVar;
            e5.v vVar3 = h0Var3.f21943n;
            e5.t[] tVarArr = vVarH.f4424c;
            if (vVar3 != null && vVar3.f4424c.length == tVarArr.length) {
                int i11 = 0;
                while (true) {
                    if (i11 >= tVarArr.length) {
                        if (h0Var3 == h0Var2) {
                            z10 = false;
                        }
                        h0Var3 = h0Var3.l;
                        vVar = vVar2;
                    } else if (vVarH.a(vVar3, i11)) {
                        i11++;
                    }
                }
            }
            j0 j0Var2 = this.K;
            if (!z10) {
                i2 = 4;
                j0Var2.k(h0Var3);
                if (h0Var3.f21934d) {
                    i10 = 4;
                    h0Var3.a(vVarH, Math.max(h0Var3.f21936f.b, this.f21882e0 - h0Var3.f21944o), false, new boolean[h0Var3.f21939i.length]);
                }
                k(true);
                if (this.P.f22027e != i10) {
                    s();
                    e0();
                    this.A.d(2);
                    return;
                }
                return;
            }
            h0 h0Var4 = j0Var2.f21971i;
            boolean zK = j0Var2.k(h0Var4);
            boolean[] zArr = new boolean[this.f21887t.length];
            vVar2.getClass();
            long jA = h0Var4.a(vVar2, this.P.f22039r, zK, zArr);
            q0 q0Var = this.P;
            boolean z11 = (q0Var.f22027e == 4 || jA == q0Var.f22039r) ? false : true;
            q0 q0Var2 = this.P;
            i2 = 4;
            this.P = o(q0Var2.b, jA, q0Var2.f22025c, q0Var2.f22026d, z11, 5);
            if (z11) {
                D(jA);
            }
            boolean[] zArr2 = new boolean[this.f21887t.length];
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f21887t;
                if (i12 >= dVarArr.length) {
                    break;
                }
                d dVar = dVarArr[i12];
                boolean zQ = q(dVar);
                zArr2[i12] = zQ;
                x0 x0Var = h0Var4.f21933c[i12];
                if (zQ) {
                    if (x0Var != dVar.B) {
                        b(dVar);
                    } else if (zArr[i12]) {
                        long j10 = this.f21882e0;
                        dVar.G = false;
                        dVar.E = j10;
                        dVar.F = j10;
                        dVar.q(false, j10);
                    }
                }
                i12++;
            }
            f(zArr2, this.f21882e0);
            i10 = i2;
            k(true);
            if (this.P.f22027e != i10) {
                s();
                e0();
                this.A.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[PHI: r5 r6 r8
  0x00c2: PHI (r5v4 c5.z) = (r5v3 c5.z), (r5v8 c5.z) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r6v2 long) = (r6v1 long), (r6v14 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r8v3 long) = (r8v2 long), (r8v11 long) binds: [B:35:0x0098, B:37:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    public final void B(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        boolean z14;
        o4.o0 t0Var;
        c5.z zVar;
        q0 q0Var;
        e1 e1Var;
        e5.v vVar;
        List list;
        this.A.f18488a.removeMessages(2);
        this.f21885h0 = null;
        g0(false, true);
        i iVar = this.G;
        iVar.f21950y = false;
        w0 w0Var = iVar.f21945t;
        if (w0Var.f19026t) {
            w0Var.d(w0Var.b());
            w0Var.f19026t = false;
        }
        this.f21882e0 = 1000000000000L;
        for (d dVar : this.f21887t) {
            try {
                b(dVar);
            } catch (RuntimeException | j e10) {
                r4.a.n("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (d dVar2 : this.f21887t) {
                if (this.f21888u.remove(dVar2)) {
                    try {
                        dVar2.z();
                    } catch (RuntimeException e11) {
                        r4.a.n("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f21880c0 = 0;
        q0 q0Var2 = this.P;
        c5.z zVar2 = q0Var2.b;
        long jLongValue = q0Var2.f22039r;
        if (this.P.b.b()) {
            j10 = this.P.f22025c;
        } else {
            q0 q0Var3 = this.P;
            o4.m0 m0Var = this.E;
            c5.z zVar3 = q0Var3.b;
            o4.o0 o0Var = q0Var3.f22024a;
            if (o0Var.p() || o0Var.g(zVar3.f2261a, m0Var).f15877f) {
                j10 = this.P.f22025c;
            } else {
                j10 = this.P.f22039r;
            }
        }
        if (z11) {
            this.f21881d0 = null;
            Pair pairH = h(this.P.f22024a);
            zVar2 = (c5.z) pairH.first;
            jLongValue = ((Long) pairH.second).longValue();
            j10 = -9223372036854775807L;
            z14 = zVar2.equals(this.P.b) ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        this.K.b();
        this.W = false;
        o4.o0 o0Var2 = this.P.f22024a;
        if (z12 && (o0Var2 instanceof t0)) {
            t0 t0Var2 = (t0) o0Var2;
            z0 z0Var = this.L.f22018j;
            o4.o0[] o0VarArr = t0Var2.f22058h;
            o4.o0[] o0VarArr2 = new o4.o0[o0VarArr.length];
            for (int i2 = 0; i2 < o0VarArr.length; i2++) {
                o0VarArr2[i2] = new d1(o0VarArr[i2]);
            }
            t0Var = new t0(o0VarArr2, t0Var2.f22059i, z0Var);
            if (zVar2.b != -1) {
                t0Var.g(zVar2.f2261a, this.E);
                int i10 = this.E.f15874c;
                o4.n0 n0Var = this.D;
                t0Var.m(i10, n0Var, 0L);
                if (n0Var.a()) {
                    zVar = new c5.z(zVar2.f2263d, zVar2.f2261a);
                }
            }
            q0Var = this.P;
            int i11 = q0Var.f22027e;
            j jVar = z13 ? null : q0Var.f22028f;
            if (z14) {
                e1Var = e1.f2110d;
            } else {
                e1Var = q0Var.f22030h;
            }
            e1 e1Var2 = e1Var;
            if (z14) {
                vVar = this.f21891x;
            } else {
                vVar = q0Var.f22031i;
            }
            e5.v vVar2 = vVar;
            if (z14) {
                ac.f0 f0Var = ac.i0.f523u;
                list = b1.f480x;
            } else {
                list = q0Var.f22032j;
            }
            this.P = new q0(t0Var, zVar, j12, j11, i11, jVar, false, e1Var2, vVar2, list, zVar, q0Var.l, q0Var.f22034m, q0Var.f22035n, j11, 0L, j11, 0L, false);
            if (z12) {
                p0 p0Var = this.L;
                HashMap map = p0Var.f22014f;
                for (n0 n0Var2 : map.values()) {
                    try {
                        n0Var2.f22001a.n(n0Var2.b);
                    } catch (RuntimeException e12) {
                        r4.a.n("MediaSourceList", "Failed to release child source.", e12);
                    }
                    c5.a aVar = n0Var2.f22001a;
                    k0.o oVar = n0Var2.f22002c;
                    aVar.q(oVar);
                    n0Var2.f22001a.p(oVar);
                }
                map.clear();
                p0Var.f22015g.clear();
                p0Var.f22019k = false;
            }
        }
        t0Var = o0Var2;
        zVar = zVar2;
        q0Var = this.P;
        int i12 = q0Var.f22027e;
        j jVar2 = z13 ? null : q0Var.f22028f;
        if (z14) {
            e1Var = e1.f2110d;
        } else {
            e1Var = q0Var.f22030h;
        }
        e1 e1Var3 = e1Var;
        if (z14) {
            vVar = this.f21891x;
        } else {
            vVar = q0Var.f22031i;
        }
        e5.v vVar3 = vVar;
        if (z14) {
            ac.f0 f0Var2 = ac.i0.f523u;
            list = b1.f480x;
        } else {
            list = q0Var.f22032j;
        }
        this.P = new q0(t0Var, zVar, j12, j11, i12, jVar2, false, e1Var3, vVar3, list, zVar, q0Var.l, q0Var.f22034m, q0Var.f22035n, j11, 0L, j11, 0L, false);
        if (z12) {
            p0 p0Var2 = this.L;
            HashMap map2 = p0Var2.f22014f;
            while (r5.hasNext()) {
                n0Var2.f22001a.n(n0Var2.b);
                c5.a aVar2 = n0Var2.f22001a;
                k0.o oVar2 = n0Var2.f22002c;
                aVar2.q(oVar2);
                n0Var2.f22001a.p(oVar2);
            }
            map2.clear();
            p0Var2.f22015g.clear();
            p0Var2.f22019k = false;
        }
    }

    public final void C() {
        h0 h0Var = this.K.f21971i;
        this.T = h0Var != null && h0Var.f21936f.f21957h && this.S;
    }

    public final void D(long j10) {
        h0 h0Var = this.K.f21971i;
        long j11 = j10 + (h0Var == null ? 1000000000000L : h0Var.f21944o);
        this.f21882e0 = j11;
        this.G.f21945t.d(j11);
        for (d dVar : this.f21887t) {
            if (q(dVar)) {
                long j12 = this.f21882e0;
                dVar.G = false;
                dVar.E = j12;
                dVar.F = j12;
                dVar.q(false, j12);
            }
        }
        for (h0 h0Var2 = r0.f21971i; h0Var2 != null; h0Var2 = h0Var2.l) {
            for (e5.t tVar : h0Var2.f21943n.f4424c) {
                if (tVar != null) {
                    tVar.j();
                }
            }
        }
    }

    public final void E(o4.o0 o0Var, o4.o0 o0Var2) {
        if (o0Var.p() && o0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.H;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a5.z.o(arrayList.get(size));
            throw null;
        }
    }

    public final void H(boolean z10) throws j {
        c5.z zVar = this.K.f21971i.f21936f.f21951a;
        long J = J(zVar, this.P.f22039r, true, false);
        if (J != this.P.f22039r) {
            q0 q0Var = this.P;
            this.P = o(zVar, J, q0Var.f22025c, q0Var.f22026d, z10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:31:0x00ae, B:33:0x00b2, B:34:0x00b5, B:36:0x00bd, B:40:0x00cb, B:44:0x00d3), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:31:0x00ae, B:33:0x00b2, B:34:0x00b5, B:36:0x00bd, B:40:0x00cb, B:44:0x00d3), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:31:0x00ae, B:33:0x00b2, B:34:0x00b5, B:36:0x00bd, B:40:0x00cb, B:44:0x00d3), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:31:0x00ae, B:33:0x00b2, B:34:0x00b5, B:36:0x00bd, B:40:0x00cb, B:44:0x00d3), top: B:98:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Type inference failed for: r0v15, types: [c5.x, java.lang.Object] */
    public final void I(c0 c0Var) throws Throwable {
        long jLongValue;
        c5.z zVarM;
        long j10;
        boolean z10;
        long j11;
        long j12;
        q0 q0Var;
        h0 h0Var;
        long jI;
        q0 q0Var2;
        int i2;
        long j13;
        c5.z zVar;
        int i10;
        long j14;
        boolean z11;
        j0 j0Var;
        boolean z12;
        long J;
        boolean z13;
        c5.z zVar2;
        long j15;
        d0 d0Var = this;
        d0Var.Q.a(1);
        Pair pairF = F(d0Var.P.f22024a, c0Var, true, d0Var.X, d0Var.Y, d0Var.D, d0Var.E);
        try {
            if (pairF != null) {
                Object obj = pairF.first;
                jLongValue = ((Long) pairF.second).longValue();
                long j16 = c0Var.f21870c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                zVarM = d0Var.K.m(d0Var.P.f22024a, obj, jLongValue);
                if (zVarM.b()) {
                    d0Var.P.f22024a.g(zVarM.f2261a, d0Var.E);
                    if (d0Var.E.e(zVarM.b) == zVarM.f2262c) {
                        d0Var.E.f15878g.getClass();
                    }
                    z10 = true;
                    j11 = j16;
                    jLongValue = 0;
                } else {
                    j10 = 0;
                    z10 = c0Var.f21870c == -9223372036854775807L;
                    j11 = j16;
                }
                if (d0Var.P.f22024a.p()) {
                    q0Var = d0Var.P;
                    if (pairF == null) {
                        if (q0Var.f22027e != 1) {
                            d0Var.V(4);
                        }
                        d0Var.B(false, true, false, true);
                    } else {
                        if (zVarM.equals(q0Var.b)) {
                            try {
                                h0Var = d0Var.K.f21971i;
                                if (h0Var == null && h0Var.f21934d && jLongValue != j10) {
                                    jI = h0Var.f21932a.i(jLongValue, d0Var.O);
                                } else {
                                    jI = jLongValue;
                                }
                                if (r4.v.J(jI) != r4.v.J(d0Var.P.f22039r) && ((i2 = (q0Var2 = d0Var.P).f22027e) == 2 || i2 == 3)) {
                                    j13 = q0Var2.f22039r;
                                    z10 = z10;
                                    zVar = zVarM;
                                    i10 = 2;
                                    j14 = j13;
                                }
                            } catch (Throwable th) {
                                th = th;
                                zVarM = zVarM;
                                j12 = jLongValue;
                                d0Var.P = d0Var.o(zVarM, j12, j11, j12, z10, 2);
                                throw th;
                            }
                        } else {
                            jI = jLongValue;
                        }
                        try {
                            if (d0Var.P.f22027e == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            j0Var = d0Var.K;
                            if (j0Var.f21971i != j0Var.f21972j) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            J = d0Var.J(zVarM, jI, z12, z11);
                            if (jLongValue != J) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z10 |= z13;
                            try {
                                q0 q0Var3 = d0Var.P;
                                zVar2 = zVarM;
                                try {
                                    o4.o0 o0Var = q0Var3.f22024a;
                                    j15 = j11;
                                    try {
                                        d0Var.f0(o0Var, zVar2, o0Var, q0Var3.b, j15, true);
                                        zVar = zVar2;
                                        j11 = j15;
                                        j13 = J;
                                        i10 = 2;
                                        j14 = j13;
                                        d0Var = this;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        zVarM = zVar2;
                                        j11 = j15;
                                        j12 = J;
                                        d0Var.P = d0Var.o(zVarM, j12, j11, j12, z10, 2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zVarM = zVar2;
                                    j11 = j11;
                                    j12 = J;
                                    d0Var.P = d0Var.o(zVarM, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j11 = j11;
                            j12 = jLongValue;
                            d0Var.P = d0Var.o(zVarM, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    d0Var.P = d0Var.o(zVar, j13, j11, j14, z10, i10);
                    return;
                }
                d0Var.f21881d0 = c0Var;
                z10 = z10;
                zVar = zVarM;
                j13 = jLongValue;
                i10 = 2;
                j14 = j13;
                d0Var = this;
                d0Var.P = d0Var.o(zVar, j13, j11, j14, z10, i10);
                return;
            }
            Pair pairH = d0Var.h(d0Var.P.f22024a);
            zVarM = (c5.z) pairH.first;
            jLongValue = ((Long) pairH.second).longValue();
            z10 = !d0Var.P.f22024a.p();
            j11 = -9223372036854775807L;
            if (d0Var.P.f22024a.p()) {
                q0Var = d0Var.P;
                if (pairF == null) {
                    if (q0Var.f22027e != 1) {
                        d0Var.V(4);
                    }
                    d0Var.B(false, true, false, true);
                } else {
                    if (zVarM.equals(q0Var.b)) {
                        h0Var = d0Var.K.f21971i;
                        if (h0Var == null) {
                            jI = jLongValue;
                        } else {
                            jI = jLongValue;
                        }
                        if (r4.v.J(jI) != r4.v.J(d0Var.P.f22039r)) {
                        }
                    } else {
                        jI = jLongValue;
                    }
                    if (d0Var.P.f22027e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j0Var = d0Var.K;
                    if (j0Var.f21971i != j0Var.f21972j) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    J = d0Var.J(zVarM, jI, z12, z11);
                    if (jLongValue != J) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z10 |= z13;
                    q0 q0Var4 = d0Var.P;
                    zVar2 = zVarM;
                    o4.o0 o0Var2 = q0Var4.f22024a;
                    j15 = j11;
                    d0Var.f0(o0Var2, zVar2, o0Var2, q0Var4.b, j15, true);
                    zVar = zVar2;
                    j11 = j15;
                    j13 = J;
                    i10 = 2;
                    j14 = j13;
                    d0Var = this;
                }
                d0Var.P = d0Var.o(zVar, j13, j11, j14, z10, i10);
                return;
            }
            d0Var.f21881d0 = c0Var;
            z10 = z10;
            zVar = zVarM;
            j13 = jLongValue;
            i10 = 2;
            j14 = j13;
            d0Var = this;
            d0Var.P = d0Var.o(zVar, j13, j11, j14, z10, i10);
            return;
        } catch (Throwable th6) {
            th = th6;
        }
        j10 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [c5.x, java.lang.Object] */
    public final long J(c5.z zVar, long j10, boolean z10, boolean z11) throws j {
        a0();
        g0(false, true);
        if (z11 || this.P.f22027e == 3) {
            V(2);
        }
        j0 j0Var = this.K;
        h0 h0Var = j0Var.f21971i;
        h0 h0Var2 = h0Var;
        while (h0Var2 != null && !zVar.equals(h0Var2.f21936f.f21951a)) {
            h0Var2 = h0Var2.l;
        }
        if (z10 || h0Var != h0Var2 || (h0Var2 != null && h0Var2.f21944o + j10 < 0)) {
            d[] dVarArr = this.f21887t;
            for (d dVar : dVarArr) {
                b(dVar);
            }
            if (h0Var2 != null) {
                while (j0Var.f21971i != h0Var2) {
                    j0Var.a();
                }
                j0Var.k(h0Var2);
                h0Var2.f21944o = 1000000000000L;
                f(new boolean[dVarArr.length], j0Var.f21972j.e());
            }
        }
        if (h0Var2 != null) {
            ?? r9 = h0Var2.f21932a;
            j0Var.k(h0Var2);
            if (!h0Var2.f21934d) {
                h0Var2.f21936f = h0Var2.f21936f.b(j10);
            } else if (h0Var2.f21935e) {
                j10 = r9.f(j10);
                r9.g(j10 - this.F);
            }
            D(j10);
            s();
        } else {
            j0Var.b();
            D(j10);
        }
        k(false);
        this.A.d(2);
        return j10;
    }

    public final void K(s0 s0Var) {
        r4.s sVar = this.A;
        if (s0Var.f22047f != this.C) {
            sVar.a(15, s0Var).b();
            return;
        }
        synchronized (s0Var) {
        }
        try {
            s0Var.f22043a.d(s0Var.f22045d, s0Var.f22046e);
            s0Var.b(true);
            int i2 = this.P.f22027e;
            if (i2 == 3 || i2 == 2) {
                sVar.d(2);
            }
        } catch (Throwable th) {
            s0Var.b(true);
            throw th;
        }
    }

    public final void L(s0 s0Var) {
        Looper looper = s0Var.f22047f;
        if (looper.getThread().isAlive()) {
            this.I.a(looper, null).c(new oe.w0(this, s0Var));
        } else {
            r4.a.v("TAG", "Trying to send message on a dead thread.");
            s0Var.b(false);
        }
    }

    public final void N(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.Z != z10) {
            this.Z = z10;
            if (!z10) {
                for (d dVar : this.f21887t) {
                    if (!q(dVar) && this.f21888u.remove(dVar)) {
                        dVar.z();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(z zVar) throws Throwable {
        this.Q.a(1);
        int i2 = zVar.f22097c;
        z0 z0Var = zVar.b;
        ArrayList arrayList = zVar.f22096a;
        if (i2 != -1) {
            this.f21881d0 = new c0(new t0(arrayList, z0Var), zVar.f22097c, zVar.f22098d);
        }
        p0 p0Var = this.L;
        ArrayList arrayList2 = p0Var.b;
        p0Var.g(0, arrayList2.size());
        l(p0Var.a(arrayList2.size(), arrayList, z0Var), false);
    }

    public final void P(boolean z10) throws j {
        this.S = z10;
        C();
        if (this.T) {
            j0 j0Var = this.K;
            if (j0Var.f21972j != j0Var.f21971i) {
                H(true);
                k(false);
            }
        }
    }

    public final void Q(int i2, int i10, boolean z10, boolean z11) {
        this.Q.a(z11 ? 1 : 0);
        a0 a0Var = this.Q;
        a0Var.f21853a = true;
        a0Var.f21857f = true;
        a0Var.f21858g = i10;
        this.P = this.P.d(i2, z10);
        g0(false, false);
        for (h0 h0Var = this.K.f21971i; h0Var != null; h0Var = h0Var.l) {
            for (e5.t tVar : h0Var.f21943n.f4424c) {
                if (tVar != null) {
                    tVar.b(z10);
                }
            }
        }
        if (!W()) {
            a0();
            e0();
            return;
        }
        int i11 = this.P.f22027e;
        r4.s sVar = this.A;
        if (i11 != 3) {
            if (i11 == 2) {
                sVar.d(2);
            }
        } else {
            g0(false, false);
            i iVar = this.G;
            iVar.f21950y = true;
            iVar.f21945t.f();
            Y();
            sVar.d(2);
        }
    }

    public final void R(o4.h0 h0Var) {
        this.A.f18488a.removeMessages(16);
        i iVar = this.G;
        iVar.a(h0Var);
        o4.h0 h0VarE = iVar.e();
        n(h0VarE, h0VarE.f15852a, true, true);
    }

    public final void S(int i2) throws j {
        this.X = i2;
        o4.o0 o0Var = this.P.f22024a;
        j0 j0Var = this.K;
        j0Var.f21969g = i2;
        if (!j0Var.n(o0Var)) {
            H(true);
        }
        k(false);
    }

    public final void T(boolean z10) throws j {
        this.Y = z10;
        o4.o0 o0Var = this.P.f22024a;
        j0 j0Var = this.K;
        j0Var.f21970h = z10;
        if (!j0Var.n(o0Var)) {
            H(true);
        }
        k(false);
    }

    public final void U(z0 z0Var) throws Throwable {
        this.Q.a(1);
        p0 p0Var = this.L;
        int size = p0Var.b.size();
        if (z0Var.b.length != size) {
            z0Var = new z0(new Random(z0Var.f2265a.nextLong())).a(size);
        }
        p0Var.f22018j = z0Var;
        l(p0Var.b(), false);
    }

    public final void V(int i2) {
        q0 q0Var = this.P;
        if (q0Var.f22027e != i2) {
            if (i2 != 2) {
                this.f21886i0 = -9223372036854775807L;
            }
            this.P = q0Var.f(i2);
        }
    }

    public final boolean W() {
        q0 q0Var = this.P;
        return q0Var.l && q0Var.f22034m == 0;
    }

    public final boolean X(o4.o0 o0Var, c5.z zVar) {
        if (zVar.b() || o0Var.p()) {
            return false;
        }
        int i2 = o0Var.g(zVar.f2261a, this.E).f15874c;
        o4.n0 n0Var = this.D;
        o0Var.n(i2, n0Var);
        return n0Var.a() && n0Var.f15911h && n0Var.f15908e != -9223372036854775807L;
    }

    public final void Y() {
        h0 h0Var = this.K.f21971i;
        if (h0Var == null) {
            return;
        }
        e5.v vVar = h0Var.f21943n;
        int i2 = 0;
        while (true) {
            d[] dVarArr = this.f21887t;
            if (i2 >= dVarArr.length) {
                return;
            }
            if (vVar.b(i2)) {
                d dVar = dVarArr[i2];
                int i10 = dVar.A;
                if (i10 == 1) {
                    r4.a.i(i10 == 1);
                    dVar.A = 2;
                    dVar.t();
                }
            }
            i2++;
        }
    }

    public final void Z(boolean z10, boolean z11) {
        B(z10 || !this.Z, false, true, false);
        this.Q.a(z11 ? 1 : 0);
        this.f21892y.b(true);
        V(1);
    }

    public final void a(z zVar, int i2) throws Throwable {
        this.Q.a(1);
        p0 p0Var = this.L;
        if (i2 == -1) {
            i2 = p0Var.b.size();
        }
        l(p0Var.a(i2, zVar.f22096a, zVar.b), false);
    }

    public final void a0() {
        int i2;
        i iVar = this.G;
        iVar.f21950y = false;
        w0 w0Var = iVar.f21945t;
        if (w0Var.f19026t) {
            w0Var.d(w0Var.b());
            w0Var.f19026t = false;
        }
        for (d dVar : this.f21887t) {
            if (q(dVar) && (i2 = dVar.A) == 2) {
                r4.a.i(i2 == 2);
                dVar.A = 1;
                dVar.u();
            }
        }
    }

    public final void b(d dVar) {
        if (q(dVar)) {
            i iVar = this.G;
            if (dVar == iVar.f21947v) {
                iVar.f21948w = null;
                iVar.f21947v = null;
                iVar.f21949x = true;
            }
            int i2 = dVar.A;
            if (i2 == 2) {
                r4.a.i(i2 == 2);
                dVar.A = 1;
                dVar.u();
            }
            r4.a.i(dVar.A == 1);
            dVar.f21873v.b();
            dVar.A = 0;
            dVar.B = null;
            dVar.C = null;
            dVar.G = false;
            dVar.n();
            this.f21880c0--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [c5.y0, java.lang.Object] */
    public final void b0() {
        h0 h0Var = this.K.f21973k;
        boolean z10 = this.W || (h0Var != null && h0Var.f21932a.h());
        q0 q0Var = this.P;
        if (z10 != q0Var.f22029g) {
            this.P = new q0(q0Var.f22024a, q0Var.b, q0Var.f22025c, q0Var.f22026d, q0Var.f22027e, q0Var.f22028f, z10, q0Var.f22030h, q0Var.f22031i, q0Var.f22032j, q0Var.f22033k, q0Var.l, q0Var.f22034m, q0Var.f22035n, q0Var.f22037p, q0Var.f22038q, q0Var.f22039r, q0Var.f22040s, q0Var.f22036o);
        }
    }

    @Override // c5.w
    public final void c(y0 y0Var) {
        this.A.a(9, (c5.x) y0Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c0(e5.v vVar) {
        o4.o0 o0Var = this.P.f22024a;
        e5.t[] tVarArr = vVar.f4424c;
        h hVar = this.f21892y;
        int iMax = hVar.f21928f;
        if (iMax == -1) {
            int i2 = 0;
            int i10 = 0;
            while (true) {
                d[] dVarArr = this.f21887t;
                int i11 = 13107200;
                if (i2 < dVarArr.length) {
                    if (tVarArr[i2] != null) {
                        switch (dVarArr[i2].f21872u) {
                            case 0:
                                i11 = 144310272;
                                i10 += i11;
                                break;
                            case 1:
                                i10 += i11;
                                break;
                            case 2:
                                i11 = 131072000;
                                i10 += i11;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i11 = 131072;
                                i10 += i11;
                                break;
                            default:
                                w4.d.b();
                                break;
                        }
                        return;
                    }
                    i2++;
                } else {
                    iMax = Math.max(13107200, i10);
                }
            }
        }
        hVar.f21930h = iMax;
        hVar.f21924a.a(iMax);
    }

    @Override // c5.w
    public final void d(c5.x xVar) {
        this.A.a(8, xVar).b();
    }

    public final void d0(int i2, int i10, List list) throws Throwable {
        this.Q.a(1);
        p0 p0Var = this.L;
        p0Var.getClass();
        ArrayList arrayList = p0Var.b;
        r4.a.e(i2 >= 0 && i2 <= i10 && i10 <= arrayList.size());
        r4.a.e(list.size() == i10 - i2);
        for (int i11 = i2; i11 < i10; i11++) {
            ((o0) arrayList.get(i11)).f22004a.r((o4.y) list.get(i11 - i2));
        }
        l(p0Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0389  */
    /* JADX WARN: Code duplicated, block: B:306:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:392:0x0621  */
    /* JADX WARN: Code duplicated, block: B:395:0x0627  */
    /* JADX WARN: Code duplicated, block: B:397:0x062f  */
    /* JADX WARN: Code duplicated, block: B:403:0x064a  */
    /* JADX WARN: Code duplicated, block: B:408:0x065b  */
    /* JADX WARN: Code duplicated, block: B:410:0x065e  */
    /* JADX WARN: Code duplicated, block: B:411:0x0666  */
    /* JADX WARN: Code duplicated, block: B:413:0x0673  */
    /* JADX WARN: Code duplicated, block: B:414:0x067d  */
    /* JADX WARN: Code duplicated, block: B:418:0x0693  */
    /* JADX WARN: Code duplicated, block: B:421:0x069c  */
    /* JADX WARN: Code duplicated, block: B:424:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:428:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:431:0x06af  */
    /* JADX WARN: Code duplicated, block: B:433:0x0706  */
    /* JADX WARN: Code duplicated, block: B:436:0x070f  */
    /* JADX WARN: Code duplicated, block: B:441:0x071a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:448:0x0730  */
    /* JADX WARN: Code duplicated, block: B:451:0x073d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0644 A[EDGE_INSN: B:478:0x0644->B:401:0x0644 BREAK  A[LOOP:5: B:393:0x0622->B:400:0x0641], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0641 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [e5.v] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r2v18, types: [c5.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [c5.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v63, types: [c5.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v77, types: [int] */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r6v42, types: [c5.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [c5.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [e5.t[]] */
    /* JADX WARN: Type inference failed for: r7v53, types: [e5.t] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
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
    public final void e() throws j {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        int i2;
        boolean zR;
        boolean z14;
        long j12;
        r4.q qVar;
        boolean z15;
        q0 q0Var;
        boolean z16;
        int i10;
        int i11;
        d[] dVarArr;
        q0 q0Var2;
        x0 x0Var;
        i0 i0VarC;
        boolean z17;
        long j13;
        h0 h0Var;
        h0 h0Var2;
        boolean z18;
        d[] dVarArr2;
        this.I.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.A.f18488a.removeMessages(2);
        long j14 = -9223372036854775807L;
        if (this.P.f22024a.p() || !this.L.f22019k) {
            j10 = -9223372036854775807L;
            z10 = true;
        } else {
            j0 j0Var = this.K;
            long j15 = this.f21882e0;
            h0 h0Var3 = j0Var.f21973k;
            if (h0Var3 != null) {
                r4.a.i(h0Var3.l == null);
                if (h0Var3.f21934d) {
                    h0Var3.f21932a.o(j15 - h0Var3.f21944o);
                }
            }
            j0 j0Var2 = this.K;
            h0 h0Var4 = j0Var2.f21973k;
            if (h0Var4 == null || (!h0Var4.f21936f.f21958i && h0Var4.f() && j0Var2.f21973k.f21936f.f21954e != -9223372036854775807L && j0Var2.l < 100)) {
                j0 j0Var3 = this.K;
                long j16 = this.f21882e0;
                q0 q0Var3 = this.P;
                h0 h0Var5 = j0Var3.f21973k;
                if (h0Var5 == null) {
                    z10 = true;
                    i0VarC = j0Var3.d(q0Var3.f22024a, q0Var3.b, q0Var3.f22025c, q0Var3.f22039r);
                } else {
                    z10 = true;
                    i0VarC = j0Var3.c(q0Var3.f22024a, h0Var5, j16);
                }
                if (i0VarC != null) {
                    j0 j0Var4 = this.K;
                    h0 h0Var6 = j0Var4.f21973k;
                    long j17 = h0Var6 == null ? 1000000000000L : (h0Var6.f21944o + h0Var6.f21936f.f21954e) - i0VarC.b;
                    d0 d0Var = (d0) j0Var4.f21967e.f288u;
                    h0 h0Var7 = new h0(d0Var.f21889v, j17, d0Var.f21890w, d0Var.f21892y.f21924a, d0Var.L, i0VarC, d0Var.f21891x);
                    h0 h0Var8 = j0Var4.f21973k;
                    if (h0Var8 == null) {
                        j0Var4.f21971i = h0Var7;
                        j0Var4.f21972j = h0Var7;
                    } else if (h0Var7 != h0Var8.l) {
                        h0Var8.b();
                        h0Var8.l = h0Var7;
                        h0Var8.c();
                    }
                    j0Var4.f21974m = null;
                    j0Var4.f21973k = h0Var7;
                    j0Var4.l++;
                    j0Var4.j();
                    h0Var7.f21932a.n(this, i0VarC.b);
                    if (this.K.f21971i == h0Var7) {
                        D(i0VarC.b);
                    }
                    k(false);
                }
            } else {
                z10 = true;
            }
            if (this.W) {
                this.W = p();
                b0();
            } else {
                s();
            }
            d[] dVarArr3 = this.f21887t;
            j0 j0Var5 = this.K;
            h0 h0Var9 = j0Var5.f21972j;
            if (h0Var9 == null) {
                z17 = false;
                j13 = -9223372036854775807L;
            } else if (h0Var9.l == null || this.T) {
                z17 = false;
                j13 = -9223372036854775807L;
                if (h0Var9.f21936f.f21958i || this.T) {
                    for (int i12 = 0; i12 < dVarArr3.length; i12++) {
                        d dVar = dVarArr3[i12];
                        x0 x0Var2 = h0Var9.f21933c[i12];
                        if (x0Var2 != null && dVar.B == x0Var2 && dVar.k()) {
                            long j18 = h0Var9.f21936f.f21954e;
                            M(dVar, (j18 == -9223372036854775807L || j18 == Long.MIN_VALUE) ? -9223372036854775807L : h0Var9.f21944o + j18);
                        }
                    }
                }
            } else if (h0Var9.f21934d) {
                int i13 = 0;
                while (true) {
                    if (i13 < dVarArr3.length) {
                        d dVar2 = dVarArr3[i13];
                        x0 x0Var3 = h0Var9.f21933c[i13];
                        if (dVar2.B == x0Var3) {
                            if (x0Var3 == null || dVar2.k()) {
                                j13 = j14;
                            } else {
                                h0 h0Var10 = h0Var9.l;
                                if (h0Var9.f21936f.f21955f && h0Var10.f21934d) {
                                    if ((dVar2 instanceof d5.f) || (dVar2 instanceof b5.b)) {
                                        j13 = j14;
                                    } else {
                                        j13 = j14;
                                        if (dVar2.F >= h0Var10.e()) {
                                        }
                                    }
                                }
                            }
                            i13++;
                            j14 = j13;
                        }
                        j13 = j14;
                    } else {
                        j13 = j14;
                        h0 h0Var11 = h0Var9.l;
                        if (h0Var11.f21934d || this.f21882e0 >= h0Var11.e()) {
                            e5.v vVar = h0Var9.f21943n;
                            h0 h0Var12 = j0Var5.f21972j;
                            r4.a.j(h0Var12);
                            j0Var5.f21972j = h0Var12.l;
                            j0Var5.j();
                            h0 h0Var13 = j0Var5.f21972j;
                            r4.a.j(h0Var13);
                            e5.v vVar2 = h0Var13.f21943n;
                            o4.o0 o0Var = this.P.f22024a;
                            z17 = false;
                            f0(o0Var, h0Var13.f21936f.f21951a, o0Var, h0Var9.f21936f.f21951a, -9223372036854775807L, false);
                            if (!h0Var13.f21934d || h0Var13.f21932a.j() == j13) {
                                for (int i14 = 0; i14 < dVarArr3.length; i14++) {
                                    boolean zB = vVar.b(i14);
                                    boolean zB2 = vVar2.b(i14);
                                    if (zB && !dVarArr3[i14].G) {
                                        boolean z19 = this.f21889v[i14].f21872u == -2 ? z10 : false;
                                        u0 u0Var = vVar.b[i14];
                                        u0 u0Var2 = vVar2.b[i14];
                                        if (!zB2 || !u0Var2.equals(u0Var) || z19) {
                                            M(dVarArr3[i14], h0Var13.e());
                                        }
                                    }
                                }
                            } else {
                                long jE = h0Var13.e();
                                for (d dVar3 : dVarArr3) {
                                    if (dVar3.B != null) {
                                        M(dVar3, jE);
                                    }
                                }
                                if (!h0Var13.f()) {
                                    j0Var5.k(h0Var13);
                                    k(false);
                                    s();
                                }
                            }
                        }
                    }
                    z17 = false;
                }
            } else {
                z17 = false;
                j13 = -9223372036854775807L;
            }
            j0 j0Var6 = this.K;
            h0 h0Var14 = j0Var6.f21972j;
            if (h0Var14 != null && j0Var6.f21971i != h0Var14 && !h0Var14.f21937g) {
                ?? r9 = h0Var14.f21943n;
                x0[] x0VarArr = h0Var14.f21933c;
                boolean z20 = z17;
                boolean z21 = z20;
                ?? r10 = z20;
                while (true) {
                    dVarArr2 = this.f21887t;
                    if (r10 >= dVarArr2.length) {
                        break;
                    }
                    d dVar4 = dVarArr2[r10];
                    if (q(dVar4)) {
                        boolean z22 = dVar4.B != x0VarArr[r10] ? z10 : z17;
                        if (!r9.b(r10) || z22) {
                            if (!dVar4.G) {
                                ?? r11 = r9.f4424c[r10];
                                int length = r11 != 0 ? r11.length() : z17;
                                o4.o[] oVarArr = new o4.o[length];
                                for (?? r12 = z17; r12 < length; r12++) {
                                    oVarArr[r12] = r11.c(r12);
                                }
                                dVar4.y(oVarArr, x0VarArr[r10], h0Var14.e(), h0Var14.f21944o, h0Var14.f21936f.f21951a);
                                boolean z23 = this.f21879b0;
                                if (z23 && z23) {
                                    this.f21879b0 = z17;
                                    if (this.P.f22036o) {
                                        this.A.d(2);
                                    }
                                }
                            } else if (dVar4.l()) {
                                b(dVar4);
                            } else {
                                z21 = z10;
                            }
                        }
                    }
                    r10++;
                    z21 = z21;
                }
                if (!z21) {
                    f(new boolean[dVarArr2.length], this.K.f21972j.e());
                }
            }
            j0 j0Var7 = this.K;
            boolean z24 = z17;
            while (W() && !this.T && (h0Var = j0Var7.f21971i) != null && (h0Var2 = h0Var.l) != null && this.f21882e0 >= h0Var2.e() && h0Var2.f21937g) {
                if (z24) {
                    t();
                }
                h0 h0VarA = j0Var7.a();
                h0VarA.getClass();
                if (this.P.b.f2261a.equals(h0VarA.f21936f.f21951a.f2261a)) {
                    c5.z zVar = this.P.b;
                    if (zVar.b == -1) {
                        c5.z zVar2 = h0VarA.f21936f.f21951a;
                        if (zVar2.b != -1 || zVar.f2264e == zVar2.f2264e) {
                            z18 = z17;
                        } else {
                            z18 = z10;
                        }
                    } else {
                        z18 = z17;
                    }
                } else {
                    z18 = z17;
                }
                i0 i0Var = h0VarA.f21936f;
                c5.z zVar3 = i0Var.f21951a;
                boolean z25 = z18;
                long j19 = i0Var.b;
                long j20 = j13;
                this.P = o(zVar3, j19, i0Var.f21952c, j19, !z25, 0);
                C();
                e0();
                if (this.P.f22027e == 3) {
                    Y();
                }
                d[] dVarArr4 = this.f21887t;
                e5.v vVar3 = j0Var7.f21971i.f21943n;
                for (int i15 = 0; i15 < dVarArr4.length; i15++) {
                    if (vVar3.b(i15)) {
                        dVarArr4[i15].h();
                    }
                }
                j13 = j20;
                z24 = z10;
                z17 = false;
            }
            j10 = j13;
        }
        int i16 = this.P.f22027e;
        if (i16 == z10 || i16 == 4) {
            return;
        }
        h0 h0Var15 = this.K.f21971i;
        if (h0Var15 == null) {
            this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            return;
        }
        r4.a.b("doSomeWork");
        e0();
        if (h0Var15.f21934d) {
            this.I.getClass();
            long jB = r4.v.B(SystemClock.elapsedRealtime());
            h0Var15.f21932a.g(this.P.f22039r - this.F);
            int i17 = 0;
            boolean z26 = true;
            z12 = true;
            while (true) {
                d[] dVarArr5 = this.f21887t;
                if (i17 >= dVarArr5.length) {
                    break;
                }
                d dVar5 = dVarArr5[i17];
                if (q(dVar5)) {
                    dVar5.x(this.f21882e0, jB);
                    z26 = z26 && dVar5.l();
                    boolean z27 = h0Var15.f21933c[i17] != dVar5.B;
                    boolean z28 = z27 || (!z27 && dVar5.k()) || dVar5.m() || dVar5.l();
                    z12 = z12 && z28;
                    if (!z28) {
                        x0 x0Var4 = dVar5.B;
                        x0Var4.getClass();
                        x0Var4.c();
                    }
                }
                i17++;
            }
            z11 = z26;
        } else {
            h0Var15.f21932a.e();
            z11 = true;
            z12 = true;
        }
        long j21 = h0Var15.f21936f.f21954e;
        boolean z29 = z11 && h0Var15.f21934d && (j21 == j10 || j21 <= this.P.f22039r);
        if (z29 && this.T) {
            this.T = false;
            Q(this.P.f22034m, 5, false, false);
        }
        if (!z29 || !h0Var15.f21936f.f21958i) {
            q0 q0Var4 = this.P;
            if (q0Var4.f22027e == 2) {
                j0 j0Var8 = this.K;
                if (this.f21880c0 == 0) {
                    zR = r();
                    jUptimeMillis = jUptimeMillis;
                    j11 = j10;
                } else {
                    if (z12) {
                        if (q0Var4.f22029g) {
                            long j22 = X(q0Var4.f22024a, j0Var8.f21971i.f21936f.f21951a) ? this.M.f21918h : j10;
                            h0 h0Var16 = j0Var8.f21973k;
                            boolean z30 = h0Var16.f() && h0Var16.f21936f.f21958i;
                            boolean z31 = h0Var16.f21936f.f21951a.b() && !h0Var16.f21934d;
                            if (z30 || z31) {
                                jUptimeMillis = jUptimeMillis;
                                j11 = j10;
                            } else {
                                h hVar = this.f21892y;
                                q0 q0Var5 = this.P;
                                o4.o0 o0Var2 = q0Var5.f22024a;
                                long j23 = q0Var5.f22037p;
                                h0 h0Var17 = this.K.f21973k;
                                j11 = j10;
                                long jMax = h0Var17 == null ? 0L : Math.max(0L, j23 - (this.f21882e0 - h0Var17.f21944o));
                                float f10 = this.G.e().f15852a;
                                boolean z32 = this.U;
                                hVar.getClass();
                                if (f10 != 1.0f) {
                                    jMax = Math.round(jMax / ((double) f10));
                                }
                                long jMin = z32 ? hVar.f21927e : hVar.f21926d;
                                if (j22 != j11) {
                                    jMin = Math.min(j22 / 2, jMin);
                                }
                                if (jMin > 0 && jMax < jMin) {
                                    f5.d dVar6 = hVar.f21924a;
                                    synchronized (dVar6) {
                                        i2 = dVar6.f4892d * dVar6.b;
                                    }
                                    if (i2 >= hVar.f21930h) {
                                    }
                                }
                            }
                        } else {
                            jUptimeMillis = jUptimeMillis;
                            j11 = j10;
                        }
                        zR = true;
                    } else {
                        jUptimeMillis = jUptimeMillis;
                        j11 = j10;
                    }
                    zR = false;
                }
                if (zR) {
                    V(3);
                    this.f21885h0 = null;
                    if (W()) {
                        g0(false, false);
                        i iVar = this.G;
                        z13 = true;
                        iVar.f21950y = true;
                        iVar.f21945t.f();
                        Y();
                    }
                }
                if (this.P.f22027e == 2) {
                    i11 = 0;
                    while (true) {
                        dVarArr = this.f21887t;
                        if (i11 >= dVarArr.length) {
                            break;
                        }
                        if (!q(dVarArr[i11]) && (x0Var = this.f21887t[i11].B) == h0Var15.f21933c[i11]) {
                            x0Var.getClass();
                            x0Var.c();
                        }
                        i11++;
                    }
                    q0Var2 = this.P;
                    if (q0Var2.f22029g && q0Var2.f22038q < 500000 && p()) {
                        z14 = z13;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    j12 = this.f21886i0;
                    qVar = this.I;
                    if (j12 == -9223372036854775807L) {
                        qVar.getClass();
                        this.f21886i0 = SystemClock.elapsedRealtime();
                    } else {
                        qVar.getClass();
                        if (SystemClock.elapsedRealtime() - this.f21886i0 >= 4000) {
                            w4.d.l("Playback stuck buffering and not loading");
                            return;
                        }
                    }
                } else {
                    this.f21886i0 = -9223372036854775807L;
                }
                if (W() || this.P.f22027e != 3) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (this.f21879b0 || !this.f21878a0 || !z15) {
                    z13 = false;
                }
                q0Var = this.P;
                if (q0Var.f22036o != z13) {
                    z16 = z13;
                    this.P = new q0(q0Var.f22024a, q0Var.b, q0Var.f22025c, q0Var.f22026d, q0Var.f22027e, q0Var.f22028f, q0Var.f22029g, q0Var.f22030h, q0Var.f22031i, q0Var.f22032j, q0Var.f22033k, q0Var.l, q0Var.f22034m, q0Var.f22035n, q0Var.f22037p, q0Var.f22038q, q0Var.f22039r, q0Var.f22040s, z16);
                } else {
                    z16 = z13;
                }
                this.f21878a0 = false;
                if (!z16 && (i10 = this.P.f22027e) != 4) {
                    if (!z15 || i10 == 2) {
                        this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
                    } else if (i10 == 3 && this.f21880c0 != 0) {
                        this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 1000);
                    }
                }
                r4.a.o();
            }
            jUptimeMillis = jUptimeMillis;
            j11 = j10;
            z13 = true;
            if (this.P.f22027e == 3 && (this.f21880c0 != 0 ? !z12 : !r())) {
                g0(W(), false);
                V(2);
                if (this.U) {
                    for (h0 h0Var18 = this.K.f21971i; h0Var18 != null; h0Var18 = h0Var18.l) {
                        for (e5.t tVar : h0Var18.f21943n.f4424c) {
                            if (tVar != null) {
                                tVar.k();
                            }
                        }
                    }
                    g gVar = this.M;
                    long j24 = gVar.f21918h;
                    if (j24 != j11) {
                        long j25 = j24 + gVar.b;
                        gVar.f21918h = j25;
                        long j26 = gVar.f21917g;
                        if (j26 != j11 && j25 > j26) {
                            gVar.f21918h = j26;
                        }
                        gVar.l = j11;
                    }
                }
                a0();
            }
            if (this.P.f22027e == 2) {
                i11 = 0;
                while (true) {
                    dVarArr = this.f21887t;
                    if (i11 >= dVarArr.length) {
                        break;
                        break;
                    } else {
                        if (!q(dVarArr[i11])) {
                        }
                        i11++;
                    }
                }
                q0Var2 = this.P;
                if (q0Var2.f22029g) {
                    z14 = false;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (z14) {
                this.f21886i0 = -9223372036854775807L;
            } else {
                j12 = this.f21886i0;
                qVar = this.I;
                if (j12 == -9223372036854775807L) {
                    qVar.getClass();
                    this.f21886i0 = SystemClock.elapsedRealtime();
                } else {
                    qVar.getClass();
                    if (SystemClock.elapsedRealtime() - this.f21886i0 >= 4000) {
                        w4.d.l("Playback stuck buffering and not loading");
                        return;
                    }
                }
            }
            if (W()) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (this.f21879b0) {
                z13 = false;
            } else {
                z13 = false;
            }
            q0Var = this.P;
            if (q0Var.f22036o != z13) {
                z16 = z13;
                this.P = new q0(q0Var.f22024a, q0Var.b, q0Var.f22025c, q0Var.f22026d, q0Var.f22027e, q0Var.f22028f, q0Var.f22029g, q0Var.f22030h, q0Var.f22031i, q0Var.f22032j, q0Var.f22033k, q0Var.l, q0Var.f22034m, q0Var.f22035n, q0Var.f22037p, q0Var.f22038q, q0Var.f22039r, q0Var.f22040s, z16);
            } else {
                z16 = z13;
            }
            this.f21878a0 = false;
            if (!z16) {
                if (z15) {
                    this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
                } else {
                    this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
                }
            }
            r4.a.o();
        }
        V(4);
        a0();
        jUptimeMillis = jUptimeMillis;
        z13 = true;
        if (this.P.f22027e == 2) {
            i11 = 0;
            while (true) {
                dVarArr = this.f21887t;
                if (i11 >= dVarArr.length) {
                    break;
                    break;
                } else {
                    if (!q(dVarArr[i11])) {
                    }
                    i11++;
                }
            }
            q0Var2 = this.P;
            if (q0Var2.f22029g) {
                z14 = false;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z14) {
            this.f21886i0 = -9223372036854775807L;
        } else {
            j12 = this.f21886i0;
            qVar = this.I;
            if (j12 == -9223372036854775807L) {
                qVar.getClass();
                this.f21886i0 = SystemClock.elapsedRealtime();
            } else {
                qVar.getClass();
                if (SystemClock.elapsedRealtime() - this.f21886i0 >= 4000) {
                    w4.d.l("Playback stuck buffering and not loading");
                    return;
                }
            }
        }
        if (W()) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (this.f21879b0) {
            z13 = false;
        } else {
            z13 = false;
        }
        q0Var = this.P;
        if (q0Var.f22036o != z13) {
            z16 = z13;
            this.P = new q0(q0Var.f22024a, q0Var.b, q0Var.f22025c, q0Var.f22026d, q0Var.f22027e, q0Var.f22028f, q0Var.f22029g, q0Var.f22030h, q0Var.f22031i, q0Var.f22032j, q0Var.f22033k, q0Var.l, q0Var.f22034m, q0Var.f22035n, q0Var.f22037p, q0Var.f22038q, q0Var.f22039r, q0Var.f22040s, z16);
        } else {
            z16 = z13;
        }
        this.f21878a0 = false;
        if (!z16) {
            if (z15) {
                this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            } else {
                this.A.f18488a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            }
        }
        r4.a.o();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v23, types: [c5.x, java.lang.Object] */
    public final void e0() {
        o4.h0 h0VarE;
        int i2;
        long jMax;
        h0 h0Var = this.K.f21971i;
        if (h0Var == null) {
            return;
        }
        long j10 = h0Var.f21934d ? h0Var.f21932a.j() : -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (!h0Var.f()) {
                this.K.k(h0Var);
                k(false);
                s();
            }
            D(j10);
            if (j10 != this.P.f22039r) {
                q0 q0Var = this.P;
                this.P = o(q0Var.b, j10, q0Var.f22025c, j10, true, 5);
            }
        } else {
            i iVar = this.G;
            boolean z10 = h0Var != this.K.f21972j;
            w0 w0Var = iVar.f21945t;
            d dVar = iVar.f21947v;
            if (dVar == null || dVar.l() || ((z10 && iVar.f21947v.A != 2) || (!iVar.f21947v.m() && (z10 || iVar.f21947v.k())))) {
                iVar.f21949x = true;
                if (iVar.f21950y) {
                    w0Var.f();
                }
            } else {
                g0 g0Var = iVar.f21948w;
                g0Var.getClass();
                long jB = g0Var.b();
                if (!iVar.f21949x) {
                    w0Var.d(jB);
                    h0VarE = g0Var.e();
                    if (!h0VarE.equals((o4.h0) w0Var.f19030x)) {
                        w0Var.a(h0VarE);
                        iVar.f21946u.A.a(16, h0VarE).b();
                    }
                } else if (jB >= w0Var.b()) {
                    iVar.f21949x = false;
                    if (iVar.f21950y) {
                        w0Var.f();
                    }
                    w0Var.d(jB);
                    h0VarE = g0Var.e();
                    if (!h0VarE.equals((o4.h0) w0Var.f19030x)) {
                        w0Var.a(h0VarE);
                        iVar.f21946u.A.a(16, h0VarE).b();
                    }
                } else if (w0Var.f19026t) {
                    w0Var.d(w0Var.b());
                    w0Var.f19026t = false;
                }
            }
            long jB2 = iVar.b();
            this.f21882e0 = jB2;
            long j11 = jB2 - h0Var.f21944o;
            long j12 = this.P.f22039r;
            if (!this.H.isEmpty() && !this.P.b.b()) {
                if (this.f21884g0) {
                    this.f21884g0 = false;
                }
                q0 q0Var2 = this.P;
                q0Var2.f22024a.b(q0Var2.b.f2261a);
                int iMin = Math.min(this.f21883f0, this.H.size());
                if (iMin > 0 && this.H.get(iMin - 1) != null) {
                    d8.m.o();
                    return;
                } else {
                    if (iMin < this.H.size() && this.H.get(iMin) != null) {
                        d8.m.o();
                        return;
                    }
                    this.f21883f0 = iMin;
                }
            }
            boolean zC = this.G.c();
            q0 q0Var3 = this.P;
            if (zC) {
                this.P = o(q0Var3.b, j11, q0Var3.f22025c, j11, true, 6);
            } else {
                q0Var3.f22039r = j11;
                q0Var3.f22040s = SystemClock.elapsedRealtime();
            }
        }
        this.P.f22037p = this.K.f21973k.d();
        q0 q0Var4 = this.P;
        long j13 = q0Var4.f22037p;
        h0 h0Var2 = this.K.f21973k;
        q0Var4.f22038q = h0Var2 == null ? 0L : Math.max(0L, j13 - (this.f21882e0 - h0Var2.f21944o));
        q0 q0Var5 = this.P;
        if (q0Var5.l && q0Var5.f22027e == 3 && X(q0Var5.f22024a, q0Var5.b)) {
            q0 q0Var6 = this.P;
            float f10 = 1.0f;
            if (q0Var6.f22035n.f15852a == 1.0f) {
                g gVar = this.M;
                long jG = g(q0Var6.f22024a, q0Var6.b.f2261a, q0Var6.f22039r);
                long j14 = this.P.f22037p;
                h0 h0Var3 = this.K.f21973k;
                if (h0Var3 == null) {
                    jMax = 0;
                    i2 = 1;
                } else {
                    i2 = 1;
                    jMax = Math.max(0L, j14 - (this.f21882e0 - h0Var3.f21944o));
                }
                if (gVar.f21913c != r10) {
                    long j15 = jG - jMax;
                    long j16 = gVar.f21922m;
                    if (j16 == r10) {
                        gVar.f21922m = j15;
                        gVar.f21923n = 0L;
                    } else {
                        long jMax2 = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                        gVar.f21922m = jMax2;
                        gVar.f21923n = (long) ((9.999871E-4f * Math.abs(j15 - jMax2)) + (0.999f * gVar.f21923n));
                    }
                    if (gVar.l == r10 || SystemClock.elapsedRealtime() - gVar.l >= 1000) {
                        gVar.l = SystemClock.elapsedRealtime();
                        long j17 = (gVar.f21923n * 3) + gVar.f21922m;
                        if (gVar.f21918h > j17) {
                            float fB = r4.v.B(1000L);
                            long j18 = ((long) ((gVar.f21921k - 1.0f) * fB)) + ((long) ((gVar.f21919i - 1.0f) * fB));
                            long j19 = gVar.f21915e;
                            long j20 = gVar.f21918h - j18;
                            long[] jArr = new long[3];
                            jArr[r15] = j17;
                            jArr[i2] = j19;
                            jArr[2] = j20;
                            long j21 = jArr[r15];
                            for (int i10 = i2; i10 < 3; i10++) {
                                long j22 = jArr[i10];
                                if (j22 > j21) {
                                    j21 = j22;
                                }
                            }
                            gVar.f21918h = j21;
                        } else {
                            long jH = r4.v.h(jG - ((long) (Math.max(0.0f, gVar.f21921k - 1.0f) / 1.0E-7f)), gVar.f21918h, j17);
                            gVar.f21918h = jH;
                            long j23 = gVar.f21917g;
                            if (j23 != -9223372036854775807 && jH > j23) {
                                gVar.f21918h = j23;
                            }
                        }
                        long j24 = jG - gVar.f21918h;
                        if (Math.abs(j24) < gVar.f21912a) {
                            gVar.f21921k = 1.0f;
                        } else {
                            gVar.f21921k = r4.v.f((1.0E-7f * j24) + 1.0f, gVar.f21920j, gVar.f21919i);
                        }
                        f10 = gVar.f21921k;
                    } else {
                        f10 = gVar.f21921k;
                    }
                }
                if (this.G.e().f15852a != f10) {
                    o4.h0 h0Var4 = new o4.h0(f10, this.P.f22035n.b);
                    this.A.f18488a.removeMessages(16);
                    this.G.a(h0Var4);
                    n(this.P.f22035n, this.G.e().f15852a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    public final void f(boolean[] zArr, long j10) throws j {
        d[] dVarArr;
        Set set;
        j0 j0Var;
        g0 g0Var;
        j0 j0Var2 = this.K;
        h0 h0Var = j0Var2.f21972j;
        e5.v vVar = h0Var.f21943n;
        int i2 = 0;
        while (true) {
            dVarArr = this.f21887t;
            int length = dVarArr.length;
            set = this.f21888u;
            if (i2 >= length) {
                break;
            }
            if (!vVar.b(i2) && set.remove(dVarArr[i2])) {
                dVarArr[i2].z();
            }
            i2++;
        }
        int i10 = 0;
        while (i10 < dVarArr.length) {
            if (vVar.b(i10)) {
                boolean z10 = zArr[i10];
                d dVar = dVarArr[i10];
                if (q(dVar)) {
                    j0Var = j0Var2;
                } else {
                    h0 h0Var2 = j0Var2.f21972j;
                    boolean z11 = h0Var2 == j0Var2.f21971i;
                    e5.v vVar2 = h0Var2.f21943n;
                    u0 u0Var = vVar2.b[i10];
                    e5.t tVar = vVar2.f4424c[i10];
                    int length2 = tVar != null ? tVar.length() : 0;
                    o4.o[] oVarArr = new o4.o[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        oVarArr[i11] = tVar.c(i11);
                    }
                    boolean z12 = W() && this.P.f22027e == 3;
                    boolean z13 = !z10 && z12;
                    this.f21880c0++;
                    set.add(dVar);
                    x0 x0Var = h0Var2.f21933c[i10];
                    j0Var = j0Var2;
                    long j11 = h0Var2.f21944o;
                    c5.z zVar = h0Var2.f21936f.f21951a;
                    r4.a.i(dVar.A == 0);
                    dVar.f21874w = u0Var;
                    dVar.A = 1;
                    dVar.o(z13, z11);
                    boolean z14 = z11;
                    dVar.y(oVarArr, x0Var, j10, j11, zVar);
                    dVar.G = false;
                    dVar.E = j10;
                    dVar.F = j10;
                    dVar.q(z13, j10);
                    dVar.d(11, new y(this));
                    i iVar = this.G;
                    iVar.getClass();
                    g0 g0VarI = dVar.i();
                    if (g0VarI != null && g0VarI != (g0Var = iVar.f21948w)) {
                        if (g0Var != null) {
                            throw new j(2, new IllegalStateException("Multiple renderer media clocks enabled."), CredentialOption.PRIORITY_PASSWORD_OR_SIMILAR);
                        }
                        iVar.f21948w = g0VarI;
                        iVar.f21947v = dVar;
                        ((x4.j0) g0VarI).a((o4.h0) iVar.f21945t.f19030x);
                    }
                    if (z12 && z14) {
                        r4.a.i(dVar.A == 1);
                        dVar.A = 2;
                        dVar.t();
                    }
                }
            } else {
                j0Var = j0Var2;
            }
            i10++;
            j0Var2 = j0Var;
        }
        h0Var.f21937g = true;
    }

    public final void f0(o4.o0 o0Var, c5.z zVar, o4.o0 o0Var2, c5.z zVar2, long j10, boolean z10) {
        boolean zX = X(o0Var, zVar);
        Object obj = zVar.f2261a;
        if (!zX) {
            o4.h0 h0Var = zVar.b() ? o4.h0.f15851d : this.P.f22035n;
            i iVar = this.G;
            if (iVar.e().equals(h0Var)) {
                return;
            }
            this.A.f18488a.removeMessages(16);
            iVar.a(h0Var);
            n(this.P.f22035n, h0Var.f15852a, false, false);
            return;
        }
        o4.m0 m0Var = this.E;
        int i2 = o0Var.g(obj, m0Var).f15874c;
        o4.n0 n0Var = this.D;
        o0Var.n(i2, n0Var);
        o4.u uVar = n0Var.f15913j;
        g gVar = this.M;
        gVar.getClass();
        gVar.f21913c = r4.v.B(uVar.f15989a);
        gVar.f21916f = r4.v.B(uVar.b);
        gVar.f21917g = r4.v.B(uVar.f15990c);
        float f10 = uVar.f15991d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        gVar.f21920j = f10;
        float f11 = uVar.f15992e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        gVar.f21919i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            gVar.f21913c = -9223372036854775807L;
        }
        gVar.a();
        if (j10 != -9223372036854775807L) {
            gVar.f21914d = g(o0Var, obj, j10);
            gVar.a();
            return;
        }
        if (!r4.v.a(!o0Var2.p() ? o0Var2.m(o0Var2.g(zVar2.f2261a, m0Var).f15874c, n0Var, 0L).f15905a : null, n0Var.f15905a) || z10) {
            gVar.f21914d = -9223372036854775807L;
            gVar.a();
        }
    }

    public final long g(o4.o0 o0Var, Object obj, long j10) {
        o4.m0 m0Var = this.E;
        int i2 = o0Var.g(obj, m0Var).f15874c;
        o4.n0 n0Var = this.D;
        o0Var.n(i2, n0Var);
        if (n0Var.f15908e == -9223372036854775807L || !n0Var.a() || !n0Var.f15911h) {
            return -9223372036854775807L;
        }
        long j11 = n0Var.f15909f;
        return r4.v.B((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - n0Var.f15908e) - (j10 + m0Var.f15876e);
    }

    public final void g0(boolean z10, boolean z11) {
        long jElapsedRealtime;
        this.U = z10;
        if (z11) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.I.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.V = jElapsedRealtime;
    }

    public final Pair h(o4.o0 o0Var) {
        long j10 = 0;
        if (o0Var.p()) {
            return Pair.create(q0.f22023t, 0L);
        }
        int iA = o0Var.a(this.Y);
        Pair pairI = o0Var.i(this.D, this.E, iA, -9223372036854775807L);
        c5.z zVarM = this.K.m(o0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (zVarM.b()) {
            Object obj = zVarM.f2261a;
            o4.m0 m0Var = this.E;
            o0Var.g(obj, m0Var);
            if (zVarM.f2262c == m0Var.e(zVarM.b)) {
                m0Var.f15878g.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zVarM, Long.valueOf(j10));
    }

    public final synchronized void h0(c5.m mVar, long j10) {
        this.I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) mVar.get()).booleanValue() && j10 > 0) {
            try {
                this.I.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            this.I.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z10;
        boolean z11;
        h0 h0Var;
        int i2;
        h0 h0Var2;
        int i10;
        int i11 = CredentialOption.PRIORITY_PASSWORD_OR_SIMILAR;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((c0) message.obj);
                    break;
                case 4:
                    R((o4.h0) message.obj);
                    break;
                case 5:
                    this.O = (v0) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((c5.x) message.obj);
                    break;
                case 9:
                    i((c5.x) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    S(message.arg1);
                    break;
                case 12:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    s0 s0Var = (s0) message.obj;
                    s0Var.getClass();
                    K(s0Var);
                    break;
                case 15:
                    L((s0) message.obj);
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                    o4.h0 h0Var3 = (o4.h0) message.obj;
                    n(h0Var3, h0Var3.f15852a, true, false);
                    break;
                case 17:
                    O((z) message.obj);
                    break;
                case 18:
                    a((z) message.obj, message.arg1);
                    break;
                case 19:
                    a5.z.o(message.obj);
                    v();
                    throw null;
                case 20:
                    z(message.arg1, message.arg2, (z0) message.obj);
                    break;
                case 21:
                    U((z0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    A();
                    H(true);
                    break;
                case 26:
                    A();
                    H(true);
                    break;
                case 27:
                    d0(message.arg1, message.arg2, (List) message.obj);
                    break;
            }
        } catch (RuntimeException e10) {
            if ((e10 instanceof IllegalStateException) || (e10 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            j jVar = new j(2, e10, i11);
            r4.a.n("ExoPlayerImplInternal", "Playback error", jVar);
            Z(true, false);
            this.P = this.P.e(jVar);
        } catch (o4.f0 e11) {
            boolean z12 = e11.f15836t;
            int i12 = e11.f15837u;
            if (i12 == 1) {
                i10 = z12 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z12 ? 3002 : 3004;
                }
                j(i11, e11);
            }
            i11 = i10;
            j(i11, e11);
        } catch (t4.i e12) {
            j(e12.f20020t, e12);
        } catch (IOException e13) {
            j(CredentialOption.PRIORITY_DEFAULT, e13);
        } catch (j e14) {
            e = e14;
            int i13 = e.f21959v;
            j0 j0Var = this.K;
            if (i13 == 1 && (h0Var2 = j0Var.f21972j) != null) {
                e = new j(e.getMessage(), e.getCause(), e.f15842t, e.f21959v, e.f21960w, e.f21961x, e.f21962y, e.f21963z, h0Var2.f21936f.f21951a, e.f15843u, e.B);
            }
            if (e.B && (this.f21885h0 == null || (i2 = e.f15842t) == 5004 || i2 == 5003)) {
                r4.a.w("ExoPlayerImplInternal", "Recoverable renderer error", e);
                j jVar2 = this.f21885h0;
                if (jVar2 != null) {
                    jVar2.addSuppressed(e);
                    e = this.f21885h0;
                } else {
                    this.f21885h0 = e;
                }
                r4.s sVar = this.A;
                r4.r rVarA = sVar.a(25, e);
                Handler handler = sVar.f18488a;
                Message message2 = rVarA.f18487a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                rVarA.a();
                z10 = true;
            } else {
                j jVar3 = this.f21885h0;
                if (jVar3 != null) {
                    jVar3.addSuppressed(e);
                    e = this.f21885h0;
                }
                r4.a.n("ExoPlayerImplInternal", "Playback error", e);
                z10 = true;
                if (e.f21959v == 1) {
                    if (j0Var.f21971i != j0Var.f21972j) {
                        while (true) {
                            h0Var = j0Var.f21971i;
                            if (h0Var == j0Var.f21972j) {
                                break;
                            }
                            j0Var.a();
                        }
                        h0Var.getClass();
                        i0 i0Var = h0Var.f21936f;
                        c5.z zVar = i0Var.f21951a;
                        long j10 = i0Var.b;
                        this.P = o(zVar, j10, i0Var.f21952c, j10, true, 0);
                    }
                    z11 = false;
                    z10 = true;
                } else {
                    z11 = false;
                }
                Z(z10, z11);
                this.P = this.P.e(e);
            }
        } catch (y4.c e15) {
            j(e15.f23608t, e15);
        }
        z10 = true;
        t();
        return z10;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [c5.y0, java.lang.Object] */
    public final void i(c5.x xVar) {
        h0 h0Var = this.K.f21973k;
        if (h0Var == null || h0Var.f21932a != xVar) {
            return;
        }
        long j10 = this.f21882e0;
        if (h0Var != null) {
            r4.a.i(h0Var.l == null);
            if (h0Var.f21934d) {
                h0Var.f21932a.o(j10 - h0Var.f21944o);
            }
        }
        s();
    }

    public final void j(int i2, IOException iOException) {
        j jVar = new j(0, iOException, i2);
        h0 h0Var = this.K.f21971i;
        if (h0Var != null) {
            c5.z zVar = h0Var.f21936f.f21951a;
            jVar = new j(jVar.getMessage(), jVar.getCause(), jVar.f15842t, jVar.f21959v, jVar.f21960w, jVar.f21961x, jVar.f21962y, jVar.f21963z, zVar, jVar.f15843u, jVar.B);
        }
        r4.a.n("ExoPlayerImplInternal", "Playback error", jVar);
        Z(false, false);
        this.P = this.P.e(jVar);
    }

    public final void k(boolean z10) {
        h0 h0Var = this.K.f21973k;
        c5.z zVar = h0Var == null ? this.P.b : h0Var.f21936f.f21951a;
        boolean zEquals = this.P.f22033k.equals(zVar);
        if (!zEquals) {
            this.P = this.P.b(zVar);
        }
        q0 q0Var = this.P;
        q0Var.f22037p = h0Var == null ? q0Var.f22039r : h0Var.d();
        q0 q0Var2 = this.P;
        long j10 = q0Var2.f22037p;
        h0 h0Var2 = this.K.f21973k;
        q0Var2.f22038q = h0Var2 != null ? Math.max(0L, j10 - (this.f21882e0 - h0Var2.f21944o)) : 0L;
        if ((!zEquals || z10) && h0Var != null && h0Var.f21934d) {
            c0(h0Var.f21943n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0364  */
    /* JADX WARN: Code duplicated, block: B:197:0x0366  */
    /* JADX WARN: Code duplicated, block: B:204:0x037c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x039b  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:221:0x03cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [o4.o0] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r2v23, types: [o4.o0] */
    /* JADX WARN: Type inference failed for: r2v28, types: [v4.q0] */
    /* JADX WARN: Type inference failed for: r2v52, types: [v4.j0] */
    /* JADX WARN: Type inference failed for: r38v0, types: [v4.d0] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v33, types: [o4.o0] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v21 */
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
    public final void l(o4.o0 o0Var, boolean z10) throws Throwable {
        Object obj;
        o4.n0 n0Var;
        long j10;
        int iA;
        int i2;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        o4.o0 o0Var2;
        long j11;
        long jLongValue;
        long j12;
        b0 b0Var;
        int i10;
        long jLongValue2;
        boolean z15;
        int i11;
        boolean z16;
        boolean z17;
        long j13;
        int iA3;
        boolean z18;
        ?? r11;
        c5.z zVar;
        long j14;
        ?? r12;
        int i12;
        int i13;
        char c10;
        ?? r9;
        long j15;
        d[] dVarArr;
        j0 j0Var;
        boolean z19;
        long j16;
        c5.z zVar2;
        Object obj2;
        ?? r10;
        int i14;
        q0 q0Var = this.P;
        c0 c0Var = this.f21881d0;
        j0 j0Var2 = this.K;
        int i15 = this.X;
        boolean z20 = this.Y;
        o4.n0 n0Var2 = this.D;
        o4.m0 m0Var = this.E;
        char c11 = 4;
        if (o0Var.p()) {
            o0Var2 = o0Var;
            b0Var = new b0(q0.f22023t, 0L, -9223372036854775807L, false, true, false);
            j10 = 0;
        } else {
            c5.z zVar3 = q0Var.b;
            Object obj3 = zVar3.f2261a;
            o4.o0 o0Var3 = q0Var.f22024a;
            boolean z21 = o0Var3.p() || o0Var3.g(zVar3.f2261a, m0Var).f15877f;
            long jLongValue3 = (q0Var.b.b() || z21) ? q0Var.f22025c : q0Var.f22039r;
            if (c0Var != null) {
                Pair pairF = F(o0Var, c0Var, true, i15, z20, n0Var2, m0Var);
                if (pairF == null) {
                    iA3 = o0Var.a(z20);
                    j13 = jLongValue3;
                    obj = obj3;
                    z17 = false;
                    z18 = true;
                    z16 = false;
                } else {
                    long j17 = c0Var.f21870c;
                    obj = pairF.first;
                    if (j17 == -9223372036854775807L) {
                        int i16 = o0Var.g(obj, m0Var).f15874c;
                        jLongValue2 = jLongValue3;
                        obj = obj3;
                        z15 = false;
                        i11 = i16;
                    } else {
                        jLongValue2 = ((Long) pairF.second).longValue();
                        z15 = true;
                        i11 = -1;
                    }
                    z16 = z15;
                    z17 = q0Var.f22027e == 4;
                    j13 = jLongValue2;
                    iA3 = i11;
                    z18 = false;
                }
                z11 = z17;
                z12 = z18;
                z13 = z16;
                iA = iA3;
                i2 = -1;
                j10 = 0;
                jLongValue3 = j13;
                n0Var = n0Var2;
            } else {
                obj = obj3;
                if (q0Var.f22024a.p()) {
                    iA = o0Var.a(z20);
                    n0Var = n0Var2;
                } else if (o0Var.b(obj) == -1) {
                    Object objG = G(n0Var2, m0Var, i15, z20, obj, q0Var.f22024a, o0Var);
                    n0Var = n0Var2;
                    if (objG == null) {
                        m0Var = m0Var;
                        iA2 = o0Var.a(z20);
                        z14 = true;
                    } else {
                        m0Var = m0Var;
                        iA2 = o0Var.g(objG, m0Var).f15874c;
                        z14 = false;
                    }
                    iA = iA2;
                    z12 = z14;
                    jLongValue3 = jLongValue3;
                    obj = obj;
                    i2 = -1;
                    j10 = 0;
                    z11 = false;
                    z13 = false;
                } else {
                    n0Var = n0Var2;
                    if (jLongValue3 == -9223372036854775807L) {
                        iA = o0Var.g(obj, m0Var).f15874c;
                    } else if (z21) {
                        q0Var.f22024a.g(zVar3.f2261a, m0Var);
                        if (q0Var.f22024a.m(m0Var.f15874c, n0Var, 0L).f15916n == q0Var.f22024a.b(zVar3.f2261a)) {
                            j10 = 0;
                            Pair pairI = o0Var.i(n0Var, m0Var, o0Var.g(obj, m0Var).f15874c, jLongValue3 + m0Var.f15876e);
                            obj = pairI.first;
                            jLongValue3 = ((Long) pairI.second).longValue();
                        } else {
                            j10 = 0;
                            jLongValue3 = jLongValue3;
                            obj = obj;
                        }
                        iA = -1;
                        i2 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        j10 = 0;
                        iA = -1;
                        i2 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                i2 = -1;
                j10 = 0;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (iA != i2) {
                int i17 = iA;
                o0Var2 = o0Var;
                Pair pairI2 = o0Var2.i(n0Var, m0Var, i17, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                o0Var2 = o0Var;
                j11 = jLongValue3;
                jLongValue = j11;
            }
            c5.z zVarM = j0Var2.m(o0Var2, obj, jLongValue);
            int i18 = zVarM.f2264e;
            boolean z22 = zVar3.f2261a.equals(obj) && !zVar3.b() && !zVarM.b() && (i18 == i2 || ((i10 = zVar3.f2264e) != i2 && i18 >= i10));
            o4.m0 m0VarG = o0Var2.g(obj, m0Var);
            if (!z21 && jLongValue3 == j11) {
                Object obj4 = zVar3.f2261a;
                int i19 = zVar3.b;
                if (obj4.equals(zVarM.f2261a)) {
                    if (zVar3.b()) {
                        m0VarG.g(i19);
                    }
                    if (zVarM.b()) {
                        m0VarG.g(zVarM.b);
                    }
                }
            }
            if (z22) {
                zVarM = zVar3;
            }
            if (!zVarM.b()) {
                j12 = jLongValue;
            } else if (zVarM.equals(zVar3)) {
                j12 = q0Var.f22039r;
            } else {
                o0Var2.g(zVarM.f2261a, m0Var);
                if (zVarM.f2262c == m0Var.e(zVarM.b)) {
                    m0Var.f15878g.getClass();
                }
                j12 = j10;
            }
            b0Var = new b0(zVarM, j12, j11, z11, z12, z13);
        }
        c5.z zVar4 = b0Var.f21860a;
        long j18 = b0Var.f21861c;
        boolean z23 = b0Var.f21862d;
        long J = b0Var.b;
        boolean z24 = (this.P.b.equals(zVar4) && J == this.P.f22039r) ? false : true;
        try {
            if (b0Var.f21863e) {
                try {
                    i12 = 1;
                    if (this.P.f22027e != 1) {
                        try {
                            V(4);
                        } catch (Throwable th) {
                            th = th;
                            r11 = o0Var2;
                            zVar = zVar4;
                            j14 = j18;
                            iA3 = 1;
                            r12 = 0;
                        }
                    }
                    i13 = 0;
                    try {
                        B(false, false, false, true);
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = o0Var2;
                        zVar = zVar4;
                        j14 = j18;
                        iA3 = i12;
                        r12 = i13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i12 = 1;
                    i13 = 0;
                    r11 = o0Var2;
                    zVar = zVar4;
                    j14 = j18;
                    iA3 = i12;
                    r12 = i13;
                }
            } else {
                i12 = 1;
                i13 = 0;
            }
            d[] dVarArr2 = this.f21887t;
            ?? length = dVarArr2.length;
            for (int i20 = i13; i20 < length; i20++) {
                d dVar = dVarArr2[i20];
                if (!r4.v.a(dVar.I, o0Var2)) {
                    dVar.I = o0Var2;
                }
            }
            try {
                if (z24) {
                    length = o0Var2;
                    z19 = false;
                    z19 = false;
                    c10 = 0;
                    c11 = 0;
                    iA3 = 1;
                    if (length.p()) {
                        zVar = zVar4;
                    } else {
                        for (h0 h0Var = this.K.f21971i; h0Var != null; h0Var = h0Var.l) {
                            if (h0Var.f21936f.f21951a.equals(zVar4)) {
                                h0Var.f21936f = this.K.g(length, h0Var.f21936f);
                                h0Var.i();
                            }
                        }
                        try {
                            j0 j0Var3 = this.K;
                            zVar = zVar4;
                            try {
                                J = J(zVar, J, j0Var3.f21971i != j0Var3.f21972j, z23);
                            } catch (Throwable th4) {
                                th = th4;
                                J = J;
                                r9 = length;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            zVar = zVar4;
                            r9 = length;
                            c10 = c11;
                        }
                    }
                    q0 q0Var2 = this.P;
                    o4.o0 o0Var4 = q0Var2.f22024a;
                    c5.z zVar5 = q0Var2.b;
                    if (b0Var.f21864f) {
                        j16 = J;
                    } else {
                        j16 = -9223372036854775807L;
                    }
                    zVar2 = zVar;
                    f0(o0Var, zVar2, o0Var4, zVar5, j16, false);
                    if (z24) {
                        q0 q0Var3 = this.P;
                        obj2 = q0Var3.b.f2261a;
                        o4.o0 o0Var5 = q0Var3.f22024a;
                        if (z24) {
                            r10 = z19;
                        } else {
                            r10 = z19;
                        }
                        long j19 = this.P.f22026d;
                        if (o0Var.b(obj2) == -1) {
                            i14 = 4;
                        } else {
                            i14 = 3;
                        }
                        this.P = o(zVar2, J, j18, j19, r10, i14);
                    } else {
                        q0 q0Var4 = this.P;
                        obj2 = q0Var4.b.f2261a;
                        o4.o0 o0Var6 = q0Var4.f22024a;
                        if (z24) {
                            r10 = z19;
                        } else {
                            r10 = z19;
                        }
                        long j110 = this.P.f22026d;
                        if (o0Var.b(obj2) == -1) {
                            i14 = 4;
                        } else {
                            i14 = 3;
                        }
                        this.P = o(zVar2, J, j18, j110, r10, i14);
                    }
                    C();
                    E(r2, this.P.f22024a);
                    this.P = this.P.g(r2);
                    if (!o0Var.p()) {
                        this.f21881d0 = null;
                    }
                    k(z19);
                    return;
                }
                try {
                    j0 j0Var4 = this.K;
                    long j20 = this.f21882e0;
                    try {
                        d[] dVarArr3 = this.f21887t;
                        h0 h0Var2 = j0Var4.f21972j;
                        if (h0Var2 != null) {
                            j15 = h0Var2.f21944o;
                            if (h0Var2.f21934d) {
                                long jMax = j15;
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= dVarArr3.length) {
                                        j15 = jMax;
                                        j20 = j20;
                                        break;
                                    }
                                    if (q(dVarArr3[i21])) {
                                        d dVar2 = dVarArr3[i21];
                                        dVarArr = dVarArr3;
                                        if (dVar2.B == h0Var2.f21933c[i21]) {
                                            j0Var = j0Var4;
                                            long j21 = dVar2.F;
                                            if (j21 == Long.MIN_VALUE) {
                                                j0Var4 = j0Var;
                                                j20 = j20;
                                                j15 = Long.MIN_VALUE;
                                                break;
                                            }
                                            jMax = Math.max(j21, jMax);
                                            zVar = zVar4;
                                            r9 = length;
                                            c10 = c11;
                                            j14 = j18;
                                            r11 = r9;
                                            r12 = c10;
                                        }
                                        i21++;
                                        j0Var4 = j0Var;
                                        h0Var2 = h0Var2;
                                        dVarArr3 = dVarArr;
                                    } else {
                                        dVarArr = dVarArr3;
                                    }
                                    j0Var = j0Var4;
                                    i21++;
                                    j0Var4 = j0Var;
                                    h0Var2 = h0Var2;
                                    dVarArr3 = dVarArr;
                                }
                            }
                        } else {
                            j15 = j10;
                        }
                        c11 = 0;
                        z19 = false;
                        z19 = false;
                        iA3 = 1;
                        try {
                            if (!j0Var4.o(o0Var, j20, j15)) {
                                H(false);
                            }
                            zVar = zVar4;
                            q0 q0Var5 = this.P;
                            o4.o0 o0Var7 = q0Var5.f22024a;
                            c5.z zVar6 = q0Var5.b;
                            if (b0Var.f21864f) {
                                j16 = J;
                            } else {
                                j16 = -9223372036854775807L;
                            }
                            zVar2 = zVar;
                            f0(o0Var, zVar2, o0Var7, zVar6, j16, false);
                            if (z24 || j18 != this.P.f22025c) {
                                q0 q0Var6 = this.P;
                                obj2 = q0Var6.b.f2261a;
                                o4.o0 o0Var8 = q0Var6.f22024a;
                                if (z24 || !z10 || o0Var8.p() || o0Var8.g(obj2, this.E).f15877f) {
                                    r10 = z19;
                                } else {
                                    r10 = iA3;
                                }
                                long j111 = this.P.f22026d;
                                if (o0Var.b(obj2) == -1) {
                                    i14 = 4;
                                } else {
                                    i14 = 3;
                                }
                                this.P = o(zVar2, J, j18, j111, r10, i14);
                            }
                            C();
                            E(r2, this.P.f22024a);
                            this.P = this.P.g(r2);
                            if (!o0Var.p()) {
                                this.f21881d0 = null;
                            }
                            k(z19);
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            length = o0Var;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        length = o0Var;
                        c11 = 0;
                        iA3 = 1;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            r11 = o0Var2;
            zVar = zVar4;
            j14 = j18;
            r12 = 0;
            iA3 = 1;
        }
        q0 q0Var7 = this.P;
        o4.o0 o0Var9 = q0Var7.f22024a;
        c5.z zVar7 = q0Var7.b;
        c5.z zVar8 = zVar;
        f0(r11, zVar8, o0Var9, zVar7, b0Var.f21864f ? J : -9223372036854775807L, false);
        if (z24 || j14 != this.P.f22025c) {
            q0 q0Var8 = this.P;
            Object obj5 = q0Var8.b.f2261a;
            o4.o0 o0Var10 = q0Var8.f22024a;
            this.P = o(zVar8, J, j14, this.P.f22026d, (!z24 || !z10 || o0Var10.p() || o0Var10.g(obj5, this.E).f15877f) ? r12 : iA3, r11.b(obj5) == -1 ? 4 : 3);
        }
        C();
        E(r11, this.P.f22024a);
        this.P = this.P.g(r11);
        if (!r11.p()) {
            this.f21881d0 = null;
        }
        k(r12);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [c5.x, java.lang.Object] */
    public final void m(c5.x xVar) throws j {
        j0 j0Var = this.K;
        h0 h0Var = j0Var.f21973k;
        if (h0Var == null || h0Var.f21932a != xVar) {
            return;
        }
        float f10 = this.G.e().f15852a;
        o4.o0 o0Var = this.P.f22024a;
        h0Var.f21934d = true;
        h0Var.f21942m = h0Var.f21932a.k();
        e5.v vVarH = h0Var.h(f10, o0Var);
        i0 i0Var = h0Var.f21936f;
        long jMax = i0Var.b;
        long j10 = i0Var.f21954e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = h0Var.a(vVarH, jMax, false, new boolean[h0Var.f21939i.length]);
        long j11 = h0Var.f21944o;
        i0 i0Var2 = h0Var.f21936f;
        h0Var.f21944o = (i0Var2.b - jA) + j11;
        h0Var.f21936f = i0Var2.b(jA);
        c0(h0Var.f21943n);
        if (h0Var == j0Var.f21971i) {
            D(h0Var.f21936f.b);
            f(new boolean[this.f21887t.length], j0Var.f21972j.e());
            q0 q0Var = this.P;
            c5.z zVar = q0Var.b;
            long j12 = h0Var.f21936f.b;
            this.P = o(zVar, j12, q0Var.f22025c, j12, false, 5);
        }
        s();
    }

    public final void n(o4.h0 h0Var, float f10, boolean z10, boolean z11) {
        o4.h0 h0Var2;
        int i2;
        if (z10) {
            if (z11) {
                this.Q.a(1);
            }
            q0 q0Var = this.P;
            q0 q0Var2 = new q0(q0Var.f22024a, q0Var.b, q0Var.f22025c, q0Var.f22026d, q0Var.f22027e, q0Var.f22028f, q0Var.f22029g, q0Var.f22030h, q0Var.f22031i, q0Var.f22032j, q0Var.f22033k, q0Var.l, q0Var.f22034m, h0Var, q0Var.f22037p, q0Var.f22038q, q0Var.f22039r, q0Var.f22040s, q0Var.f22036o);
            h0Var2 = h0Var;
            this.P = q0Var2;
        } else {
            h0Var2 = h0Var;
        }
        float f11 = h0Var2.f15852a;
        h0 h0Var3 = this.K.f21971i;
        while (true) {
            i2 = 0;
            if (h0Var3 == null) {
                break;
            }
            e5.t[] tVarArr = h0Var3.f21943n.f4424c;
            int length = tVarArr.length;
            while (i2 < length) {
                e5.t tVar = tVarArr[i2];
                if (tVar != null) {
                    tVar.i(f11);
                }
                i2++;
            }
            h0Var3 = h0Var3.l;
        }
        d[] dVarArr = this.f21887t;
        int length2 = dVarArr.length;
        while (i2 < length2) {
            d dVar = dVarArr[i2];
            if (dVar != null) {
                dVar.A(f10, h0Var2.f15852a);
            }
            i2++;
        }
    }

    public final q0 o(c5.z zVar, long j10, long j11, long j12, boolean z10, int i2) {
        b1 b1VarF;
        boolean z11;
        this.f21884g0 = (!this.f21884g0 && j10 == this.P.f22039r && zVar.equals(this.P.b)) ? false : true;
        C();
        q0 q0Var = this.P;
        e1 e1Var = q0Var.f22030h;
        e5.v vVar = q0Var.f22031i;
        List list = q0Var.f22032j;
        if (this.L.f22019k) {
            h0 h0Var = this.K.f21971i;
            e1Var = h0Var == null ? e1.f2110d : h0Var.f21942m;
            vVar = h0Var == null ? this.f21891x : h0Var.f21943n;
            e5.t[] tVarArr = vVar.f4424c;
            ac.e0 e0Var = new ac.e0();
            boolean z12 = false;
            for (e5.t tVar : tVarArr) {
                if (tVar != null) {
                    o4.d0 d0Var = tVar.c(0).f15928k;
                    if (d0Var == null) {
                        e0Var.a(new o4.d0(new o4.c0[0]));
                    } else {
                        e0Var.a(d0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                b1VarF = e0Var.f();
            } else {
                ac.f0 f0Var = ac.i0.f523u;
                b1VarF = b1.f480x;
            }
            list = b1VarF;
            if (h0Var != null) {
                i0 i0Var = h0Var.f21936f;
                if (i0Var.f21952c != j11) {
                    h0Var.f21936f = i0Var.a(j11);
                }
            }
            d[] dVarArr = this.f21887t;
            h0 h0Var2 = this.K.f21971i;
            if (h0Var2 != null) {
                e5.v vVar2 = h0Var2.f21943n;
                int i10 = 0;
                boolean z13 = false;
                while (true) {
                    if (i10 >= dVarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (vVar2.b(i10)) {
                        if (dVarArr[i10].f21872u != 1) {
                            z11 = false;
                            break;
                        }
                        if (vVar2.b[i10].f22063a != 0) {
                            z13 = true;
                        }
                    }
                    i10++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.f21879b0) {
                    this.f21879b0 = z14;
                    if (!z14 && this.P.f22036o) {
                        this.A.d(2);
                    }
                }
            }
        } else if (!zVar.equals(q0Var.b)) {
            e1Var = e1.f2110d;
            vVar = this.f21891x;
            list = b1.f480x;
        }
        e1 e1Var2 = e1Var;
        e5.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            a0 a0Var = this.Q;
            if (!a0Var.f21855d || a0Var.f21856e == 5) {
                a0Var.f21853a = true;
                a0Var.f21855d = true;
                a0Var.f21856e = i2;
            } else {
                r4.a.e(i2 == 5);
            }
        }
        q0 q0Var2 = this.P;
        long j13 = q0Var2.f22037p;
        h0 h0Var3 = this.K.f21973k;
        return q0Var2.c(zVar, j10, j11, j12, h0Var3 == null ? 0L : Math.max(0L, j13 - (this.f21882e0 - h0Var3.f21944o)), e1Var2, vVar3, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c5.y0, java.lang.Object] */
    public final boolean p() {
        h0 h0Var = this.K.f21973k;
        if (h0Var == null) {
            return false;
        }
        return (!h0Var.f21934d ? 0L : h0Var.f21932a.a()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        h0 h0Var = this.K.f21971i;
        long j10 = h0Var.f21936f.f21954e;
        if (h0Var.f21934d) {
            return j10 == -9223372036854775807L || this.P.f22039r < j10 || !W();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [c5.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [c5.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [c5.y0, java.lang.Object] */
    public final void s() {
        boolean zC;
        if (p()) {
            h0 h0Var = this.K.f21973k;
            long jA = !h0Var.f21934d ? 0L : h0Var.f21932a.a();
            h0 h0Var2 = this.K.f21973k;
            long jMax = h0Var2 == null ? 0L : Math.max(0L, jA - (this.f21882e0 - h0Var2.f21944o));
            h0 h0Var3 = this.K.f21971i;
            zC = this.f21892y.c(this.G.e().f15852a, jMax);
            if (!zC && jMax < 500000 && this.F > 0) {
                this.K.f21971i.f21932a.g(this.P.f22039r);
                zC = this.f21892y.c(this.G.e().f15852a, jMax);
            }
        } else {
            zC = false;
        }
        this.W = zC;
        if (zC) {
            h0 h0Var4 = this.K.f21973k;
            long j10 = this.f21882e0;
            float f10 = this.G.e().f15852a;
            long j11 = this.V;
            r4.a.i(h0Var4.l == null);
            long j12 = j10 - h0Var4.f21944o;
            ?? r9 = h0Var4.f21932a;
            e0 e0Var = new e0();
            e0Var.b = -3.4028235E38f;
            e0Var.f21905c = -9223372036854775807L;
            e0Var.f21904a = j12;
            r4.a.e(f10 > 0.0f || f10 == -3.4028235E38f);
            e0Var.b = f10;
            r4.a.e(j11 >= 0 || j11 == -9223372036854775807L);
            e0Var.f21905c = j11;
            r9.b(new f0(e0Var));
        }
        b0();
    }

    public final void t() {
        a0 a0Var = this.Q;
        q0 q0Var = this.P;
        boolean z10 = a0Var.f21853a | (a0Var.b != q0Var);
        a0Var.f21853a = z10;
        a0Var.b = q0Var;
        if (z10) {
            x xVar = this.J.f22003t;
            xVar.f22078i.c(new ad.a(xVar, 26, a0Var));
            this.Q = new a0(this.P);
        }
    }

    public final void u() throws Throwable {
        l(this.L.b(), true);
    }

    public final void v() {
        this.Q.a(1);
        throw null;
    }

    public final void w() {
        this.Q.a(1);
        B(false, false, false, true);
        this.f21892y.b(false);
        V(this.P.f22024a.p() ? 4 : 2);
        f5.f fVar = this.f21893z;
        fVar.getClass();
        p0 p0Var = this.L;
        ArrayList arrayList = p0Var.b;
        r4.a.i(!p0Var.f22019k);
        p0Var.l = fVar;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            o0 o0Var = (o0) arrayList.get(i2);
            p0Var.e(o0Var);
            p0Var.f22015g.add(o0Var);
        }
        p0Var.f22019k = true;
        this.A.d(2);
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            this.f21892y.b(true);
            V(1);
            HandlerThread handlerThread = this.B;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.R = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.B;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.R = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i2 = 0; i2 < this.f21887t.length; i2++) {
            d dVar = this.f21889v[i2];
            synchronized (dVar.f21871t) {
                dVar.J = null;
            }
            d dVar2 = this.f21887t[i2];
            r4.a.i(dVar2.A == 0);
            dVar2.r();
        }
    }

    public final void z(int i2, int i10, z0 z0Var) throws Throwable {
        this.Q.a(1);
        p0 p0Var = this.L;
        p0Var.getClass();
        r4.a.e(i2 >= 0 && i2 <= i10 && i10 <= p0Var.b.size());
        p0Var.f22018j = z0Var;
        p0Var.g(i2, i10);
        l(p0Var.b(), false);
    }
}
