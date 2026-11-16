package b0;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends h1.p implements g2.x {
    public float G;
    public float H;
    public float I;
    public float J;
    public boolean K;

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public final long S0(e2.k0 k0Var) {
        int iR0;
        int iR1;
        int iR2;
        int i2 = 0;
        if (b3.e.a(this.I, Float.NaN)) {
            iR0 = Integer.MAX_VALUE;
        } else {
            iR0 = k0Var.r0(this.I);
            if (iR0 < 0) {
                iR0 = 0;
            }
        }
        if (b3.e.a(this.J, Float.NaN)) {
            iR1 = Integer.MAX_VALUE;
        } else {
            iR1 = k0Var.r0(this.J);
            if (iR1 < 0) {
                iR1 = 0;
            }
        }
        if (b3.e.a(this.G, Float.NaN)) {
            iR2 = 0;
        } else {
            iR2 = k0Var.r0(this.G);
            if (iR2 > iR0) {
                iR2 = iR0;
            }
            if (iR2 < 0) {
                iR2 = 0;
            }
            if (iR2 == Integer.MAX_VALUE) {
                iR2 = 0;
            }
        }
        if (!b3.e.a(this.H, Float.NaN)) {
            int iR3 = k0Var.r0(this.H);
            if (iR3 > iR1) {
                iR3 = iR1;
            }
            if (iR3 < 0) {
                iR3 = 0;
            }
            if (iR3 != Integer.MAX_VALUE) {
                i2 = iR3;
            }
        }
        return w8.c.a(iR2, iR0, i2, iR1);
    }

    @Override // g2.x
    public final e2.j0 a(e2.k0 k0Var, e2.h0 h0Var, long j10) {
        int iJ;
        int iH;
        int i2;
        int iG;
        long jA;
        long jS0 = S0(k0Var);
        if (this.K) {
            jA = w8.c.n(j10, jS0);
        } else {
            if (b3.e.a(this.G, Float.NaN)) {
                iJ = b3.a.j(j10);
                int iH2 = b3.a.h(jS0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = b3.a.j(jS0);
            }
            if (b3.e.a(this.I, Float.NaN)) {
                iH = b3.a.h(j10);
                int iJ2 = b3.a.j(jS0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = b3.a.h(jS0);
            }
            if (b3.e.a(this.H, Float.NaN)) {
                i2 = b3.a.i(j10);
                int iG2 = b3.a.g(jS0);
                if (i2 > iG2) {
                    i2 = iG2;
                }
            } else {
                i2 = b3.a.i(jS0);
            }
            if (b3.e.a(this.J, Float.NaN)) {
                iG = b3.a.g(j10);
                int i10 = b3.a.i(jS0);
                if (iG < i10) {
                    iG = i10;
                }
            } else {
                iG = b3.a.g(jS0);
            }
            jA = w8.c.a(iJ, iH, i2, iG);
        }
        e2.s0 s0VarK = h0Var.K(jA);
        return k0Var.S(s0VarK.f4083t, s0VarK.f4084u, te.t.f20250t, new k(s0VarK, 3));
    }

    @Override // g2.x
    public final int c(g2.p0 p0Var, e2.h0 h0Var, int i2) {
        long jS0 = S0(p0Var);
        return b3.a.e(jS0) ? b3.a.g(jS0) : w8.c.o(h0Var.a(i2), jS0);
    }

    @Override // g2.x
    public final int d(g2.p0 p0Var, e2.h0 h0Var, int i2) {
        long jS0 = S0(p0Var);
        return b3.a.f(jS0) ? b3.a.h(jS0) : w8.c.q(h0Var.I(i2), jS0);
    }

    @Override // g2.x
    public final int e(g2.p0 p0Var, e2.h0 h0Var, int i2) {
        long jS0 = S0(p0Var);
        return b3.a.f(jS0) ? b3.a.h(jS0) : w8.c.q(h0Var.w(i2), jS0);
    }

    @Override // g2.x
    public final int g(g2.p0 p0Var, e2.h0 h0Var, int i2) {
        long jS0 = S0(p0Var);
        return b3.a.e(jS0) ? b3.a.g(jS0) : w8.c.o(h0Var.i0(i2), jS0);
    }
}
