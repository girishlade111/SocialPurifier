package a2;

import g2.m1;
import java.util.ArrayList;
import sf.q1;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends h1.p implements b3.b, m1 {
    public Object G;
    public Object H;
    public hf.e I;
    public q1 J;
    public j N;
    public j K = h0.f101a;
    public final x0.d L = new x0.d(new l0[16]);
    public final x0.d M = new x0.d(new l0[16]);
    public long O = 0;

    public o0(Object obj, Object obj2, hf.e eVar) {
        this.G = obj;
        this.H = obj2;
        this.I = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // g2.m1
    public final void I() {
        j jVar = this.N;
        if (jVar == null) {
            return;
        }
        ?? r9 = jVar.f111a;
        int size = r9.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((v) r9.get(i2)).f146d) {
                ArrayList arrayList = new ArrayList(r9.size());
                int size2 = r9.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    v vVar = (v) r9.get(i10);
                    long j10 = vVar.f144a;
                    long j11 = vVar.f145c;
                    long j12 = vVar.b;
                    float f10 = vVar.f147e;
                    boolean z10 = vVar.f146d;
                    arrayList.add(new v(j10, j12, j11, false, f10, j12, j11, z10, z10, 1, 0L));
                }
                j jVar2 = new j(arrayList, null);
                this.K = jVar2;
                T0(jVar2, k.f118t);
                T0(jVar2, k.f119u);
                T0(jVar2, k.f120v);
                this.N = null;
                return;
            }
        }
    }

    @Override // h1.p
    public final void L0() {
        U0();
    }

    public final Object S0(hf.e eVar, xe.d dVar) {
        sf.g gVar = new sf.g(1, pf.l.D(dVar));
        gVar.s();
        l0 l0Var = new l0(this, gVar);
        synchronized (this.L) {
            this.L.b(l0Var);
            new xe.k(pf.l.D(pf.l.k(eVar, l0Var, l0Var)), ye.a.f23667t).resumeWith(se.a0.f19710a);
        }
        gVar.v(new m0(l0Var, 0));
        return gVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    public final void T0(j jVar, k kVar) {
        x0.d dVar;
        int i2;
        Object[] objArr;
        int i10;
        l0 l0Var;
        sf.g gVar;
        sf.g gVar2;
        synchronized (this.L) {
            x0.d dVar2 = this.M;
            dVar2.d(dVar2.f22907v, this.L);
        }
        try {
            int iOrdinal = kVar.ordinal();
            if (iOrdinal == 0) {
                dVar = this.M;
                i2 = dVar.f22907v;
                if (i2 > 0) {
                    objArr = dVar.f22905t;
                    i10 = 0;
                    do {
                        l0Var = (l0) objArr[i10];
                        if (kVar == l0Var.f128w && (gVar = l0Var.f127v) != null) {
                            l0Var.f127v = null;
                            gVar.resumeWith(jVar);
                        }
                        i10++;
                    } while (i10 < i2);
                }
            } else if (iOrdinal == 1) {
                x0.d dVar3 = this.M;
                int i11 = dVar3.f22907v;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    Object[] objArr2 = dVar3.f22905t;
                    do {
                        l0 l0Var2 = (l0) objArr2[i12];
                        if (kVar == l0Var2.f128w && (gVar2 = l0Var2.f127v) != null) {
                            l0Var2.f127v = null;
                            gVar2.resumeWith(jVar);
                        }
                        i12--;
                    } while (i12 >= 0);
                }
            } else if (iOrdinal == 2) {
                dVar = this.M;
                i2 = dVar.f22907v;
                if (i2 > 0) {
                    objArr = dVar.f22905t;
                    i10 = 0;
                    do {
                        l0Var = (l0) objArr[i10];
                        if (kVar == l0Var.f128w) {
                            l0Var.f127v = null;
                            gVar.resumeWith(jVar);
                        }
                        i10++;
                    } while (i10 < i2);
                }
            }
        } finally {
            this.M.i();
        }
    }

    public final void U0() {
        q1 q1Var = this.J;
        if (q1Var != null) {
            q1Var.A(new z("Pointer input was reset", 0));
            this.J = null;
        }
    }

    @Override // g2.m1
    public final void Z() {
        U0();
    }

    @Override // b3.b
    public final float a0() {
        return g2.f.u(this).K.a0();
    }

    @Override // b3.b
    public final float b() {
        return g2.f.u(this).K.b();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // g2.m1
    public final void b0(j jVar, k kVar, long j10) {
        this.O = j10;
        if (kVar == k.f118t) {
            this.K = jVar;
        }
        xe.d dVar = null;
        if (this.J == null) {
            this.J = sf.y.v(G0(), null, new n0(this, dVar, 0), 1);
        }
        T0(jVar, kVar);
        ?? r9 = jVar.f111a;
        int size = r9.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!t.c((v) r9.get(i2))) {
                this.N = jVar;
            }
        }
        jVar = null;
        this.N = jVar;
    }

    @Override // g2.m1
    public final void x0() {
        U0();
    }
}
