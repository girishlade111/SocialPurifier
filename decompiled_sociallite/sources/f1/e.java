package f1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f4715n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hf.c f4716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hf.c f4717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s.c0 f4719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f4720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f4721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f4722k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4723m;

    public e(int i2, m mVar, hf.c cVar, hf.c cVar2) {
        super(i2, mVar);
        this.f4716e = cVar;
        this.f4717f = cVar2;
        this.f4721j = m.f4764x;
        this.f4722k = f4715n;
        this.l = 1;
    }

    public void A(s.c0 c0Var) {
        this.f4719h = c0Var;
    }

    public e B(hf.c cVar, hf.c cVar2) throws Throwable {
        if (this.f4739c) {
            v0.d.c0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f4723m && this.f4740d < 0) {
            v0.d.d0("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = p.b;
        synchronized (obj) {
            try {
                int i2 = p.f4776d;
                p.f4776d = i2 + 1;
                p.f4775c = p.f4775c.g(i2);
                m mVarE = e();
                r(mVarE.g(i2));
                try {
                    f fVar = new f(i2, p.e(mVarE, d() + 1, i2), p.l(true, cVar, f()), p.b(cVar2, i()), this);
                    if (this.f4723m || this.f4739c) {
                        return fVar;
                    }
                    int iD = d();
                    synchronized (obj) {
                        int i10 = p.f4776d;
                        p.f4776d = i10 + 1;
                        q(i10);
                        p.f4775c = p.f4775c.g(d());
                    }
                    r(p.e(e(), iD + 1, d()));
                    return fVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // f1.i
    public final void b() {
        p.f4775c = p.f4775c.c(d()).a(this.f4721j);
    }

    @Override // f1.i
    public void c() {
        if (this.f4739c) {
            return;
        }
        this.f4739c = true;
        synchronized (p.b) {
            int i2 = this.f4740d;
            if (i2 >= 0) {
                p.u(i2);
                this.f4740d = -1;
            }
        }
        l();
    }

    @Override // f1.i
    public boolean g() {
        return false;
    }

    @Override // f1.i
    public int h() {
        return this.f4718g;
    }

    @Override // f1.i
    public hf.c i() {
        return this.f4717f;
    }

    @Override // f1.i
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[LOOP:0: B:15:0x002b->B:32:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[EDGE_INSN: B:40:0x0083->B:35:0x0083 BREAK  A[LOOP:0: B:15:0x002b->B:32:0x007a], SYNTHETIC] */
    @Override // f1.i
    public void l() {
        int i2 = this.l;
        if (i2 <= 0) {
            v0.d.c0("no pending nested snapshots");
            throw null;
        }
        int i10 = i2 - 1;
        this.l = i10;
        if (i10 != 0 || this.f4723m) {
            return;
        }
        s.c0 c0VarW = w();
        if (c0VarW != null) {
            if (this.f4723m) {
                v0.d.d0("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int iD = d();
            Object[] objArr = c0VarW.b;
            long[] jArr = c0VarW.f19167a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                for (h0 h0VarA = ((f0) objArr[(i11 << 3) + i13]).a(); h0VarA != null; h0VarA = h0VarA.b) {
                                    int i14 = h0VarA.f4737a;
                                    if (i14 == iD || te.k.P(this.f4721j, Integer.valueOf(i14))) {
                                        h0VarA.f4737a = 0;
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // f1.i
    public void m() {
        if (this.f4723m || this.f4739c) {
            return;
        }
        u();
    }

    @Override // f1.i
    public void n(f0 f0Var) {
        s.c0 c0VarW = w();
        if (c0VarW == null) {
            int i2 = s.h0.f19185a;
            c0VarW = new s.c0();
            A(c0VarW);
        }
        c0VarW.a(f0Var);
    }

    @Override // f1.i
    public final void o() {
        int length = this.f4722k.length;
        for (int i2 = 0; i2 < length; i2++) {
            p.u(this.f4722k[i2]);
        }
        int i10 = this.f4740d;
        if (i10 >= 0) {
            p.u(i10);
            this.f4740d = -1;
        }
    }

    @Override // f1.i
    public void s(int i2) {
        this.f4718g = i2;
    }

    @Override // f1.i
    public i t(hf.c cVar) {
        g gVar;
        if (this.f4739c) {
            v0.d.c0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f4723m && this.f4740d < 0) {
            v0.d.d0("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iD = d();
        z(d());
        Object obj = p.b;
        synchronized (obj) {
            int i2 = p.f4776d;
            p.f4776d = i2 + 1;
            p.f4775c = p.f4775c.g(i2);
            gVar = new g(i2, p.e(e(), iD + 1, i2), p.l(true, cVar, f()), this);
        }
        if (this.f4723m || this.f4739c) {
            return gVar;
        }
        int iD2 = d();
        synchronized (obj) {
            int i10 = p.f4776d;
            p.f4776d = i10 + 1;
            q(i10);
            p.f4775c = p.f4775c.g(d());
        }
        r(p.e(e(), iD2 + 1, d()));
        return gVar;
    }

    public final void u() {
        z(d());
        if (this.f4723m || this.f4739c) {
            return;
        }
        int iD = d();
        synchronized (p.b) {
            int i2 = p.f4776d;
            p.f4776d = i2 + 1;
            q(i2);
            p.f4775c = p.f4775c.g(d());
        }
        r(p.e(e(), iD + 1, d()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015e A[EDGE_INSN: B:101:0x015e->B:77:0x015e BREAK  A[LOOP:4: B:66:0x012f->B:76:0x015b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x011c A[Catch: all -> 0x0112, LOOP:2: B:48:0x00ea->B:60:0x011c, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0106, B:57:0x0114, B:63:0x0125, B:66:0x012f, B:68:0x0139, B:70:0x0143, B:72:0x0149, B:73:0x0153, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:81:0x0169, B:82:0x0175, B:60:0x011c), top: B:90:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b A[Catch: all -> 0x0112, LOOP:4: B:66:0x012f->B:76:0x015b, LOOP_END, TryCatch #0 {all -> 0x0112, blocks: (B:43:0x00ce, B:45:0x00de, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0106, B:57:0x0114, B:63:0x0125, B:66:0x012f, B:68:0x0139, B:70:0x0143, B:72:0x0149, B:73:0x0153, B:76:0x015b, B:77:0x015e, B:79:0x0162, B:81:0x0169, B:82:0x0175, B:60:0x011c), top: B:90:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0123 A[EDGE_INSN: B:96:0x0123->B:62:0x0123 BREAK  A[LOOP:2: B:48:0x00ea->B:60:0x011c], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public w v() {
        HashMap mapC;
        s.c0 c0Var;
        ?? r9;
        long j10;
        long j11;
        s.c0 c0VarW = w();
        if (c0VarW != null) {
            AtomicReference atomicReference = p.f4781i;
            mapC = p.c((e) atomicReference.get(), this, p.f4775c.c(((d) atomicReference.get()).b));
        } else {
            mapC = null;
        }
        te.s sVar = te.s.f20249t;
        synchronized (p.b) {
            try {
                p.d(this);
                if (c0VarW == null || c0VarW.f19169d == 0) {
                    b();
                    d dVar = (d) p.f4781i.get();
                    p.v(dVar, n.f4770v);
                    c0Var = dVar.f4719h;
                    if (c0Var == null || !c0Var.h()) {
                        c0Var = null;
                        r9 = sVar;
                    } else {
                        r9 = p.f4779g;
                    }
                } else {
                    d dVar2 = (d) p.f4781i.get();
                    w wVarY = y(p.f4776d, mapC, p.f4775c.c(dVar2.b));
                    if (!wVarY.equals(k.f4747c)) {
                        return wVarY;
                    }
                    b();
                    p.v(dVar2, n.f4770v);
                    c0Var = dVar2.f4719h;
                    A(null);
                    dVar2.f4719h = null;
                    r9 = p.f4779g;
                }
                this.f4723m = true;
                if (c0Var != null) {
                    x0.f fVar = new x0.f(c0Var);
                    if (!c0Var.g()) {
                        int size = r9.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((hf.e) r9.get(i2)).invoke(fVar, this);
                        }
                    }
                }
                if (c0VarW != null && c0VarW.h()) {
                    x0.f fVar2 = new x0.f(c0VarW);
                    int size2 = r9.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((hf.e) r9.get(i10)).invoke(fVar2, this);
                    }
                }
                synchronized (p.b) {
                    try {
                        o();
                        p.g();
                        if (c0Var != null) {
                            Object[] objArr = c0Var.b;
                            long[] jArr = c0Var.f19167a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                j10 = 128;
                                while (true) {
                                    long j12 = jArr[i11];
                                    j11 = 255;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i11 != length) {
                                            break;
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((j12 & 255) < 128) {
                                                p.q((f0) objArr[(i11 << 3) + i13]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i12 != 8) {
                                            break;
                                        }
                                        if (i11 != length) {
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else {
                                j10 = 128;
                                j11 = 255;
                            }
                        } else {
                            j10 = 128;
                            j11 = 255;
                        }
                        if (c0VarW != null) {
                            Object[] objArr2 = c0VarW.b;
                            long[] jArr2 = c0VarW.f19167a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j13 = jArr2[i14];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 != length2) {
                                            break;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j13 & j11) < j10) {
                                                p.q((f0) objArr2[(i14 << 3) + i16]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                        if (i14 != length2) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f4720i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i17 = 0; i17 < size3; i17++) {
                                p.q((f0) arrayList.get(i17));
                            }
                        }
                        this.f4720i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return k.f4747c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s.c0 w() {
        return this.f4719h;
    }

    @Override // f1.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public hf.c f() {
        return this.f4716e;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182 A[LOOP:3: B:74:0x0180->B:75:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final w y(int i2, HashMap map, m mVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListH0;
        ArrayList arrayList3;
        int size;
        int i10;
        ArrayList arrayList4;
        int size2;
        int i11;
        f0 f0Var;
        h0 h0Var;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        int i13;
        h0 h0VarS;
        h0 h0VarG;
        m mVarE = e().g(d()).e(this.f4721j);
        s.c0 c0VarW = w();
        c0VarW.getClass();
        Object[] objArr3 = c0VarW.b;
        long[] jArr3 = c0VarW.f19167a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            arrayList3 = null;
            arrayListH0 = null;
            while (true) {
                long j10 = jArr3[i14];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j10 & 255) < 128) {
                            f0 f0Var2 = (f0) objArr3[(i14 << 3) + i17];
                            i13 = i15;
                            h0 h0VarA = f0Var2.a();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i12 = i17;
                            h0 h0VarS2 = p.s(h0VarA, i2, mVar);
                            if (h0VarS2 == null || (h0VarS = p.s(h0VarA, d(), mVarE)) == null) {
                                mVar3 = mVarE;
                            } else {
                                mVar3 = mVarE;
                                if (h0VarS.f4737a != 1 && !h0VarS2.equals(h0VarS)) {
                                    h0 h0VarS3 = p.s(h0VarA, d(), e());
                                    if (h0VarS3 == null) {
                                        p.r();
                                        throw null;
                                    }
                                    if (map == null || (h0VarG = (h0) map.get(h0VarS2)) == null) {
                                        h0VarG = f0Var2.g(h0VarS, h0VarS2, h0VarS3);
                                    }
                                    if (h0VarG == null) {
                                        return new j();
                                    }
                                    if (!h0VarG.equals(h0VarS3)) {
                                        if (h0VarG.equals(h0VarS2)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new se.k(f0Var2, h0VarS2.b()));
                                            if (arrayListH0 == null) {
                                                arrayListH0 = new ArrayList();
                                            }
                                            arrayListH0.add(f0Var2);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!h0VarG.equals(h0VarS) ? new se.k(f0Var2, h0VarG) : new se.k(f0Var2, h0VarS.b()));
                                        }
                                    }
                                }
                            }
                        } else {
                            mVar3 = mVarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i12 = i17;
                            i13 = i15;
                        }
                        j10 >>= i13;
                        i17 = i12 + 1;
                        i15 = i13;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        mVarE = mVar3;
                    }
                    mVar2 = mVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    mVar2 = mVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i14 != length) {
                    i14++;
                    objArr3 = objArr;
                    jArr3 = jArr;
                    mVarE = mVar2;
                } else {
                    arrayList2 = arrayList3;
                    arrayList = arrayListH0;
                }
            }
            if (arrayList3 != null) {
                u();
                size2 = arrayList3.size();
                for (i11 = 0; i11 < size2; i11++) {
                    se.k kVar = (se.k) arrayList3.get(i11);
                    f0Var = (f0) kVar.f19723t;
                    h0Var = (h0) kVar.f19724u;
                    h0Var.f4737a = d();
                    synchronized (p.b) {
                        h0Var.b = f0Var.a();
                        f0Var.e(h0Var);
                    }
                }
            }
            if (arrayListH0 != null) {
                size = arrayListH0.size();
                for (i10 = 0; i10 < size; i10++) {
                    c0VarW.j((f0) arrayListH0.get(i10));
                }
                arrayList4 = this.f4720i;
                if (arrayList4 != null) {
                    arrayListH0 = te.k.h0(arrayList4, arrayListH0);
                }
                this.f4720i = arrayListH0;
            }
            return k.f4747c;
        }
        arrayList = null;
        arrayList2 = null;
        arrayList3 = arrayList2;
        arrayListH0 = arrayList;
        if (arrayList3 != null) {
            u();
            size2 = arrayList3.size();
            while (i11 < size2) {
                se.k kVar2 = (se.k) arrayList3.get(i11);
                f0Var = (f0) kVar2.f19723t;
                h0Var = (h0) kVar2.f19724u;
                h0Var.f4737a = d();
                synchronized (p.b) {
                    h0Var.b = f0Var.a();
                    f0Var.e(h0Var);
                }
            }
        }
        if (arrayListH0 != null) {
            size = arrayListH0.size();
            while (i10 < size) {
                c0VarW.j((f0) arrayListH0.get(i10));
            }
            arrayList4 = this.f4720i;
            if (arrayList4 != null) {
                arrayListH0 = te.k.h0(arrayList4, arrayListH0);
            }
            this.f4720i = arrayListH0;
        }
        return k.f4747c;
    }

    public final void z(int i2) {
        synchronized (p.b) {
            this.f4721j = this.f4721j.g(i2);
        }
    }
}
