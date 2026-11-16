package k1;

import android.view.DragEvent;
import b0.f1;
import g2.f;
import g2.r1;
import h1.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p implements r1 {
    public d G;

    @Override // h1.p
    public final void L0() {
        this.G = null;
    }

    public final boolean S0(od.c cVar) {
        d dVar = this.G;
        if (dVar == null) {
            return false;
        }
        return dVar.S0(cVar);
    }

    public final void T0(od.c cVar) {
        d dVar = this.G;
        if (dVar != null) {
            dVar.T0(cVar);
        }
    }

    public final void U0(od.c cVar) {
        d dVar = this.G;
        if (dVar != null) {
            dVar.U0(cVar);
        }
        this.G = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final void V0(od.c cVar) {
        r1 r1Var;
        d dVar;
        d dVar2 = this.G;
        if (dVar2 != null) {
            DragEvent dragEvent = (DragEvent) cVar.f16138u;
            if (uc.b.f(dVar2, a.a.d(dragEvent.getX(), dragEvent.getY()))) {
                dVar = dVar2;
            } else {
                if (this.f7356t.F) {
                    w wVar = new w();
                    f.y(this, new f1(wVar, this, cVar, 11));
                    r1Var = (r1) wVar.f9988t;
                } else {
                    r1Var = null;
                }
                dVar = (d) r1Var;
            }
        } else {
            if (this.f7356t.F) {
                r1Var = null;
            } else {
                w wVar2 = new w();
                f.y(this, new f1(wVar2, this, cVar, 11));
                r1Var = (r1) wVar2.f9988t;
            }
            dVar = (d) r1Var;
        }
        if (dVar != null && dVar2 == null) {
            dVar.T0(cVar);
            dVar.V0(cVar);
        } else if (dVar == null && dVar2 != null) {
            dVar2.U0(cVar);
        } else if (!l.a(dVar, dVar2)) {
            if (dVar != null) {
                dVar.T0(cVar);
                dVar.V0(cVar);
            }
            if (dVar2 != null) {
                dVar2.U0(cVar);
            }
        } else if (dVar != null) {
            dVar.V0(cVar);
        }
        this.G = dVar;
    }

    public final void W0(od.c cVar) {
        d dVar = this.G;
        if (dVar != null) {
            dVar.W0(cVar);
        }
    }

    @Override // g2.r1
    public final Object n() {
        return c.f9041a;
    }
}
