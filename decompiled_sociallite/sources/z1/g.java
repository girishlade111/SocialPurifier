package z1;

import b3.o;
import g2.r1;
import h1.p;
import r0.x4;
import sf.w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p implements r1, a {
    public a G;
    public d H;
    public final String I;

    public g(a aVar, d dVar) {
        this.G = aVar;
        this.H = dVar == null ? new d() : dVar;
        this.I = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // h1.p
    public final void K0() {
        d dVar = this.H;
        dVar.f23786a = this;
        dVar.b = new x4(this, 16);
        dVar.f23787c = G0();
    }

    @Override // h1.p
    public final void L0() {
        d dVar = this.H;
        if (dVar.f23786a == this) {
            dVar.f23786a = null;
        }
    }

    @Override // z1.a
    public final long N(int i2, long j10) {
        boolean z10 = this.F;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) g2.f.j(this);
        }
        long jN = gVar != null ? gVar.N(i2, j10) : 0L;
        return n1.c.j(jN, this.G.N(i2, n1.c.i(j10, jN)));
    }

    public final w S0() {
        g gVar = this.F ? (g) g2.f.j(this) : null;
        if (gVar != null) {
            return gVar.S0();
        }
        w wVar = this.H.f23787c;
        if (wVar != null) {
            return wVar;
        }
        w4.d.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r13 == r5) goto L31;
     */
    @Override // z1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(long r11, xe.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof z1.f
            if (r0 == 0) goto L13
            r0 = r13
            z1.f r0 = (z1.f) r0
            int r1 = r0.f23798x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23798x = r1
            goto L1a
        L13:
            z1.f r0 = new z1.f
            ze.c r13 = (ze.c) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.f23796v
            int r1 = r0.f23798x
            r2 = 0
            r3 = 2
            r4 = 1
            ye.a r5 = ye.a.f23667t
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2f
            long r11 = r0.f23795u
            se.a.f(r13)
            goto L7e
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            w4.d.l(r11)
            r11 = 0
            return r11
        L36:
            long r11 = r0.f23795u
            z1.g r1 = r0.f23794t
            se.a.f(r13)
            goto L5f
        L3e:
            se.a.f(r13)
            boolean r13 = r10.F
            if (r13 == 0) goto L4e
            if (r13 == 0) goto L4e
            g2.r1 r13 = g2.f.j(r10)
            z1.g r13 = (z1.g) r13
            goto L4f
        L4e:
            r13 = r2
        L4f:
            if (r13 == 0) goto L67
            r0.f23794t = r10
            r0.f23795u = r11
            r0.f23798x = r4
            java.lang.Object r13 = r13.i0(r11, r0)
            if (r13 != r5) goto L5e
            goto L7d
        L5e:
            r1 = r10
        L5f:
            b3.o r13 = (b3.o) r13
            long r6 = r13.f1619a
        L63:
            r8 = r6
            r6 = r11
            r11 = r8
            goto L6b
        L67:
            r6 = 0
            r1 = r10
            goto L63
        L6b:
            z1.a r13 = r1.G
            long r6 = b3.o.d(r6, r11)
            r0.f23794t = r2
            r0.f23795u = r11
            r0.f23798x = r3
            java.lang.Object r13 = r13.i0(r6, r0)
            if (r13 != r5) goto L7e
        L7d:
            return r5
        L7e:
            b3.o r13 = (b3.o) r13
            long r0 = r13.f1619a
            long r11 = b3.o.e(r11, r0)
            b3.o r13 = new b3.o
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.g.i0(long, xe.d):java.lang.Object");
    }

    @Override // g2.r1
    public final Object n() {
        return this.I;
    }

    @Override // z1.a
    public final long q0(int i2, long j10, long j11) {
        long jQ0 = this.G.q0(i2, j10, j11);
        boolean z10 = this.F;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) g2.f.j(this);
        }
        g gVar2 = gVar;
        return n1.c.j(jQ0, gVar2 != null ? gVar2.q0(i2, n1.c.j(j10, jQ0), n1.c.i(j11, jQ0)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // z1.a
    public final Object s0(long j10, long j11, xe.d dVar) {
        e eVar;
        g gVar;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i2 = eVar.f23793y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f23793y = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, (ze.c) dVar);
            }
        } else {
            eVar = new e(this, (ze.c) dVar);
        }
        e eVar2 = eVar;
        Object objS0 = eVar2.f23791w;
        int i10 = eVar2.f23793y;
        ye.a aVar = ye.a.f23667t;
        if (i10 == 0) {
            se.a.f(objS0);
            a aVar2 = this.G;
            eVar2.f23788t = this;
            eVar2.f23789u = j10;
            eVar2.f23790v = j11;
            eVar2.f23793y = 1;
            objS0 = aVar2.s0(j10, j11, eVar2);
            if (objS0 != aVar) {
                gVar = this;
                j12 = j10;
                j13 = j11;
            }
            return aVar;
        }
        if (i10 == 1) {
            j13 = eVar2.f23790v;
            j12 = eVar2.f23789u;
            gVar = eVar2.f23788t;
            se.a.f(objS0);
        } else {
            if (i10 != 2) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j16 = eVar2.f23789u;
            se.a.f(objS0);
        }
        j15 = ((o) objS0).f1619a;
        j14 = j16;
        return new o(o.e(j14, j15));
        j14 = ((o) objS0).f1619a;
        boolean z10 = gVar.F;
        g gVar2 = (z10 && z10) ? (g) g2.f.j(gVar) : null;
        if (gVar2 != null) {
            long jE = o.e(j12, j14);
            long jD = o.d(j13, j14);
            eVar2.f23788t = null;
            eVar2.f23789u = j14;
            eVar2.f23793y = 2;
            objS0 = gVar2.s0(jE, jD, eVar2);
            if (objS0 != aVar) {
                j16 = j14;
                j15 = ((o) objS0).f1619a;
                j14 = j16;
            }
            return aVar;
        }
        j15 = 0;
        return new o(o.e(j14, j15));
    }
}
