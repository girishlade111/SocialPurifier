package ag;

import hg.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pf.l;
import se.a0;
import sf.y;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d() {
        super(1);
        this.owner$volatile = e.f647a;
    }

    @Override // ag.a
    public final Object a(xe.d dVar) {
        boolean zF = f();
        a0 a0Var = a0.f19710a;
        if (!zF) {
            sf.g gVarP = y.p(l.D(dVar));
            try {
                c cVar = new c(this, gVarP);
                while (true) {
                    int andDecrement = h.f654z.getAndDecrement(this);
                    if (andDecrement <= this.f655t) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                            d dVar2 = cVar.f646u;
                            atomicReferenceFieldUpdater.set(dVar2, null);
                            cVar.f645t.o(new b(dVar2, cVar, 0), a0Var);
                            break;
                        }
                        if (c(cVar)) {
                            break;
                        }
                    }
                }
                Object objR = gVarP.r();
                ye.a aVar = ye.a.f23667t;
                if (objR != aVar) {
                    objR = a0Var;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th) {
                gVarP.A();
                throw th;
            }
        }
        return a0Var;
    }

    @Override // ag.a
    public final void e(Object obj) {
        while (Math.max(h.f654z.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = e.f647a;
            if (obj2 != vVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
                        d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        w4.d.l("This mutex is not locked");
    }

    public final boolean f() {
        int i2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f654z;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f655t;
            if (i10 > i11) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    A.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(y.n(this));
        sb2.append("[isLocked=");
        sb2.append(Math.max(h.f654z.get(this), 0) == 0);
        sb2.append(",owner=");
        sb2.append(A.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
