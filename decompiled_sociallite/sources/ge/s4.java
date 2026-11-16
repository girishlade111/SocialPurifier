package ge;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s4 implements hf.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6835t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6837v;

    public /* synthetic */ s4(int i2, int i10, Object obj) {
        this.f6835t = i10;
        this.f6837v = obj;
        this.f6836u = i2;
    }

    @Override // hf.c
    public final Object invoke(Object obj) {
        switch (this.f6835t) {
            case 0:
                t4 t4Var = (t4) this.f6837v;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (t4Var.f6894c == this.f6836u && !t4Var.f6895d) {
                    t4Var.f6897f = false;
                    if (zBooleanValue) {
                        t4Var.b.b();
                    }
                }
                return se.a0.f19710a;
            case 1:
                final List list = (List) this.f6837v;
                c0.j jVar = (c0.j) obj;
                jVar.getClass();
                int size = list.size();
                final int i2 = this.f6836u;
                c0.j.S(jVar, size, null, new d1.a(new hf.g() { // from class: me.kh
                    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
                    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
                    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
                    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
                    @Override // hf.g
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue;
                        boolean z10;
                        v0.q qVar;
                        int i10;
                        g2.i iVar;
                        g2.h hVar;
                        int i11;
                        u2.s sVar;
                        long jC;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        v0.n nVar = (v0.n) obj4;
                        int iIntValue3 = ((Integer) obj5).intValue();
                        ((c0.d) obj2).getClass();
                        if ((iIntValue3 & 48) == 0) {
                            iIntValue3 |= ((v0.q) nVar).d(iIntValue2) ? 32 : 16;
                        }
                        if ((iIntValue3 & 145) == 144) {
                            v0.q qVar2 = (v0.q) nVar;
                            if (qVar2.E()) {
                                qVar2.T();
                            } else {
                                iIntValue = ((Number) list.get(iIntValue2)).intValue();
                                if (iIntValue == i2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                h1.q qVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.g(h1.n.f7355t, 1.0f), 44);
                                e2.i0 i0VarE = b0.q.e(h1.b.f7342x, false);
                                qVar = (v0.q) nVar;
                                i10 = qVar.P;
                                d1.d dVarM = qVar.m();
                                h1.q qVarC = h1.a.c(qVarI, nVar);
                                g2.k.f5534k.getClass();
                                iVar = g2.j.b;
                                qVar.d0();
                                if (qVar.O) {
                                    qVar.l(iVar);
                                } else {
                                    qVar.l0();
                                }
                                v0.d.a0(g2.j.f5523f, i0VarE, nVar);
                                v0.d.a0(g2.j.f5522e, dVarM, nVar);
                                hVar = g2.j.f5524g;
                                if (qVar.O || !kotlin.jvm.internal.l.a(qVar.O(), Integer.valueOf(i10))) {
                                    t8.c.r(i10, qVar, i10, hVar);
                                }
                                v0.d.a0(g2.j.f5521d, qVarC, nVar);
                                String strValueOf = String.valueOf(iIntValue);
                                if (z10) {
                                    i11 = 24;
                                } else {
                                    i11 = 18;
                                }
                                long jT = bb.a.T(i11);
                                if (z10) {
                                    sVar = u2.s.B;
                                } else {
                                    sVar = u2.s.f20819y;
                                }
                                if (z10) {
                                    jC = ph.k();
                                } else {
                                    jC = o1.w.c(0.5f, ph.i());
                                }
                                r0.c6.b(strValueOf, null, jC, jT, sVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131026);
                                qVar.q(true);
                            }
                        } else {
                            iIntValue = ((Number) list.get(iIntValue2)).intValue();
                            if (iIntValue == i2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            h1.q qVarI2 = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.g(h1.n.f7355t, 1.0f), 44);
                            e2.i0 i0VarE2 = b0.q.e(h1.b.f7342x, false);
                            qVar = (v0.q) nVar;
                            i10 = qVar.P;
                            d1.d dVarM2 = qVar.m();
                            h1.q qVarC2 = h1.a.c(qVarI2, nVar);
                            g2.k.f5534k.getClass();
                            iVar = g2.j.b;
                            qVar.d0();
                            if (qVar.O) {
                                qVar.l(iVar);
                            } else {
                                qVar.l0();
                            }
                            v0.d.a0(g2.j.f5523f, i0VarE2, nVar);
                            v0.d.a0(g2.j.f5522e, dVarM2, nVar);
                            hVar = g2.j.f5524g;
                            if (qVar.O) {
                                t8.c.r(i10, qVar, i10, hVar);
                            } else {
                                t8.c.r(i10, qVar, i10, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC2, nVar);
                            String strValueOf2 = String.valueOf(iIntValue);
                            if (z10) {
                                i11 = 24;
                            } else {
                                i11 = 18;
                            }
                            long jT2 = bb.a.T(i11);
                            if (z10) {
                                sVar = u2.s.B;
                            } else {
                                sVar = u2.s.f20819y;
                            }
                            if (z10) {
                                jC = ph.k();
                            } else {
                                jC = o1.w.c(0.5f, ph.i());
                            }
                            r0.c6.b(strValueOf2, null, jC, jT2, sVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131026);
                            qVar.q(true);
                        }
                        return se.a0.f19710a;
                    }
                }, true, 510149879), 6);
                break;
            default:
                e2.s0 s0Var = (e2.s0) this.f6837v;
                e2.r0 r0Var = (e2.r0) obj;
                r0Var.getClass();
                e2.r0.f(r0Var, s0Var, this.f6836u, 0);
                break;
        }
        return se.a0.f19710a;
    }
}
