package i0;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u7.l f8200f = u7.f.x(t1.f8198t, i.E);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.x0 f8201a;
    public final v0.x0 b = v0.d.M(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1.d f8202c = n1.d.f15034e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8203d = p2.m0.b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0.b1 f8204e;

    public u1(y.p0 p0Var, float f10) {
        this.f8201a = v0.d.M(f10);
        this.f8204e = v0.d.Q(p0Var, v0.p0.f21675y);
    }

    public final void a(y.p0 p0Var, n1.d dVar, int i2, int i10) {
        float f10;
        float f11 = i10 - i2;
        this.b.k(f11);
        float f12 = dVar.f15035a;
        float f13 = dVar.b;
        n1.d dVar2 = this.f8202c;
        float f14 = dVar2.f15035a;
        v0.x0 x0Var = this.f8201a;
        if (f12 != f14 || f13 != dVar2.b) {
            boolean z10 = p0Var == y.p0.f23474t;
            if (z10) {
                f12 = f13;
            }
            float f15 = z10 ? dVar.f15037d : dVar.f15036c;
            float fI = x0Var.i();
            float f16 = i2;
            float f17 = fI + f16;
            if (f15 <= f17 && (f12 >= fI || f15 - f12 <= f16)) {
                f10 = (f12 >= fI || f15 - f12 > f16) ? 0.0f : f12 - fI;
            } else {
                f10 = f15 - f17;
            }
            x0Var.k(x0Var.i() + f10);
            this.f8202c = dVar;
        }
        x0Var.k(u8.l.i(x0Var.i(), 0.0f, f11));
    }
}
