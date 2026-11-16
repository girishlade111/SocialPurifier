package v;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21342a;
    public final n0 b;

    public b0(float f10, float f11, float f12) {
        this.f21342a = f12;
        n0 n0Var = new n0();
        n0Var.f21437a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        n0Var.b = dSqrt;
        n0Var.f21442g = 1.0f;
        if (f10 < 0.0f) {
            w4.d.j("Damping ratio must be non-negative");
            throw null;
        }
        n0Var.f21442g = f10;
        n0Var.f21438c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            w4.d.j("Spring stiffness constant must be positive.");
            throw null;
        }
        n0Var.b = Math.sqrt(f11);
        n0Var.f21438c = false;
        this.b = n0Var;
    }

    @Override // v.a0
    public final float b(long j10, float f10, float f11, float f12) {
        n0 n0Var = this.b;
        n0Var.f21437a = f11;
        return Float.intBitsToFloat((int) (n0Var.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    @Override // v.a0
    public final long c(float f10, float f11, float f12) {
        double dLog;
        long j10;
        n0 n0Var = this.b;
        double d2 = n0Var.b;
        float f13 = (float) (d2 * d2);
        float f14 = n0Var.f21442g;
        float f15 = this.f21342a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == 0.0f) {
            j10 = 9223372036854L;
        } else {
            double d3 = f13;
            double d10 = f14;
            double d11 = f17;
            double d12 = f16;
            double d13 = 1.0f;
            double dSqrt = d10 * 2.0d * Math.sqrt(d3);
            double d14 = (dSqrt * dSqrt) - (d3 * 4.0d);
            double d15 = -dSqrt;
            s sVar = d14 < 0.0d ? new s(0.0d, Math.sqrt(Math.abs(d14))) : new s(Math.sqrt(d14), 0.0d);
            sVar.f21482a = (sVar.f21482a + d15) * 0.5d;
            sVar.b *= 0.5d;
            s sVar2 = d14 < 0.0d ? new s(0.0d, Math.sqrt(Math.abs(d14))) : new s(Math.sqrt(d14), 0.0d);
            double d16 = -1;
            double d17 = sVar2.f21482a * d16;
            double d18 = sVar2.b * d16;
            sVar2.f21482a = (d17 + d15) * 0.5d;
            sVar2.b = d18 * 0.5d;
            if (d12 == 0.0d && d11 == 0.0d) {
                j10 = 0;
            } else {
                if (d12 < 0.0d) {
                    d11 = -d11;
                }
                double dAbs = Math.abs(d12);
                double d19 = sVar.f21482a;
                double dAbs2 = Double.MAX_VALUE;
                if (d10 > 1.0d) {
                    double d20 = sVar2.f21482a;
                    double d21 = (d19 * dAbs) - d11;
                    double d22 = d19 - d20;
                    double d23 = d21 / d22;
                    double d24 = dAbs - d23;
                    dLog = Math.log(Math.abs(d13 / d24)) / d19;
                    double dLog2 = Math.log(Math.abs(d13 / d23)) / d20;
                    if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                        dLog = dLog2;
                    } else if (!Double.isInfinite(dLog2) && !Double.isNaN(dLog2)) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d25 = d24 * d19;
                    double dLog3 = Math.log(d25 / ((-d23) * d20)) / (d20 - d19);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d13 = -d13;
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d20) * d23) + (Math.exp(d19 * dLog3) * d24))) < d13) {
                                if (d23 > 0.0d && d24 < 0.0d) {
                                    dLog = 0.0d;
                                }
                                d13 = -d13;
                            }
                        }
                        dLog = Math.log((-((d23 * d20) * d20)) / (d25 * d19)) / d22;
                    }
                    double d26 = d23 * d20;
                    if (Math.abs((Math.exp(d20 * dLog) * d26) + (Math.exp(d19 * dLog) * d25)) >= 1.0E-4d) {
                        int i2 = 0;
                        while (dAbs2 > 0.001d && i2 < 100) {
                            i2++;
                            double d27 = d19 * dLog;
                            double d28 = d20 * dLog;
                            double dExp = dLog - ((((Math.exp(d28) * d23) + (Math.exp(d27) * d24)) + d13) / ((Math.exp(d28) * d26) + (Math.exp(d27) * d25)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d10 < 1.0d) {
                    double d29 = (d11 - (d19 * dAbs)) / sVar.b;
                    dLog = Math.log(d13 / Math.sqrt((d29 * d29) + (dAbs * dAbs))) / d19;
                } else {
                    double d30 = d19 * dAbs;
                    double d31 = d11 - d30;
                    double dLog4 = Math.log(Math.abs(d13 / dAbs)) / d19;
                    double dLog5 = Math.log(Math.abs(d13 / d31));
                    double dLog6 = dLog5;
                    for (int i10 = 0; i10 < 6; i10++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d19));
                    }
                    double d32 = dLog6 / d19;
                    if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                        dLog4 = d32;
                    } else if (!Double.isInfinite(d32) && !Double.isNaN(d32)) {
                        dLog4 = Math.max(dLog4, d32);
                    }
                    double d33 = (-(d30 + d31)) / (d19 * d31);
                    double d34 = d19 * d33;
                    double dExp2 = (Math.exp(d34) * d31 * d33) + (Math.exp(d34) * dAbs);
                    if (Double.isNaN(d33) || d33 <= 0.0d) {
                        d13 = -d13;
                    } else if (d33 <= 0.0d || (-dExp2) >= d13) {
                        dLog4 = (-(2.0d / d19)) - (dAbs / d31);
                    } else {
                        if (d31 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d13 = -d13;
                    }
                    int i11 = 0;
                    while (dAbs2 > 0.001d && i11 < 100) {
                        i11++;
                        double d35 = d19 * dLog4;
                        double dExp3 = dLog4 - (((Math.exp(d35) * ((d31 * dLog4) + dAbs)) + d13) / (Math.exp(d35) * (((((double) 1) + d35) * d31) + d30)));
                        dAbs2 = Math.abs(dLog4 - dExp3);
                        dLog4 = dExp3;
                    }
                    dLog = dLog4;
                }
                j10 = (long) (dLog * 1000.0d);
            }
        }
        return j10 * 1000000;
    }

    @Override // v.a0
    public final float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // v.a0
    public final float e(long j10, float f10, float f11, float f12) {
        n0 n0Var = this.b;
        n0Var.f21437a = f11;
        return Float.intBitsToFloat((int) (n0Var.a(f10, f12, j10 / 1000000) >> 32));
    }
}
