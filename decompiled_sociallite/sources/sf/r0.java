package sf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends m0 implements d0 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19805z = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_isCompleted$volatile");

    @Override // sf.d0
    public final void B(long j10, g gVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            n0 n0Var = new n0(this, j11 + jNanoTime, gVar);
            n0(jNanoTime, n0Var);
            gVar.w(new e(n0Var, 2));
        }
    }

    @Override // sf.d0
    public j0 Q(long j10, v1 v1Var, xe.i iVar) {
        return a0.f19746a.Q(j10, v1Var, iVar);
    }

    @Override // sf.t
    public final void Z(xe.i iVar, Runnable runnable) {
        i0(runnable);
    }

    @Override // sf.m0
    public final long g0() {
        Runnable runnable;
        p0 p0Var;
        p0 p0VarB;
        if (!h0()) {
            q0 q0Var = (q0) A.get(this);
            if (q0Var != null && xf.y.b.get(q0Var) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (q0Var) {
                        try {
                            p0[] p0VarArr = q0Var.f23265a;
                            p0 p0Var2 = p0VarArr != null ? p0VarArr[0] : null;
                            if (p0Var2 == null) {
                                p0VarB = null;
                            } else {
                                p0VarB = ((jNanoTime - p0Var2.f19798t) > 0L ? 1 : ((jNanoTime - p0Var2.f19798t) == 0L ? 0 : -1)) >= 0 ? j0(p0Var2) : false ? q0Var.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (p0VarB != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19805z;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof xf.m) {
                        xf.m mVar = (xf.m) obj;
                        Object objD = mVar.d();
                        if (objD != xf.m.f23246g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        xf.m mVarC = mVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != y.f19833c) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            te.i iVar = this.f19787x;
            if (((iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f19805z.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof xf.m) {
                        long j10 = xf.m.f23245f.get((xf.m) obj2);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == y.f19833c) {
                        return Long.MAX_VALUE;
                    }
                }
                q0 q0Var2 = (q0) A.get(this);
                if (q0Var2 != null) {
                    synchronized (q0Var2) {
                        p0[] p0VarArr2 = q0Var2.f23265a;
                        p0Var = p0VarArr2 != null ? p0VarArr2[0] : null;
                    }
                    if (p0Var != null) {
                        long jNanoTime2 = p0Var.f19798t - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void i0(Runnable runnable) {
        if (!j0(runnable)) {
            z.C.i0(runnable);
            return;
        }
        Thread threadK0 = k0();
        if (Thread.currentThread() != threadK0) {
            LockSupport.unpark(threadK0);
        }
    }

    public final boolean j0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19805z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (B.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof xf.m)) {
                if (obj == y.f19833c) {
                    return false;
                }
                xf.m mVar = new xf.m(8, true);
                mVar.a((Runnable) obj);
                mVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            xf.m mVar2 = (xf.m) obj;
            int iA = mVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                xf.m mVarC = mVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public abstract Thread k0();

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean l0() {
        Object obj;
        long j10;
        te.i iVar = this.f19787x;
        if (iVar != null ? iVar.isEmpty() : true) {
            q0 q0Var = (q0) A.get(this);
            if (q0Var == null) {
                obj = f19805z.get(this);
                if (obj != null) {
                    if (obj instanceof xf.m) {
                        j10 = xf.m.f23245f.get((xf.m) obj);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == y.f19833c) {
                    }
                }
                return true;
            }
            if (xf.y.b.get(q0Var) == 0) {
                obj = f19805z.get(this);
                if (obj != null) {
                    if (obj instanceof xf.m) {
                        j10 = xf.m.f23245f.get((xf.m) obj);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == y.f19833c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void m0(long j10, p0 p0Var) {
        z.C.n0(j10, p0Var);
    }

    public final void n0(long j10, p0 p0Var) {
        int iA;
        Thread threadK0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        p0 p0Var2 = null;
        if (B.get(this) != 0) {
            iA = 1;
        } else {
            q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
            if (q0Var == null) {
                q0 q0Var2 = new q0();
                q0Var2.f19803c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, q0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                q0Var = (q0) obj;
            }
            iA = p0Var.a(j10, q0Var, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                m0(j10, p0Var);
                return;
            } else {
                if (iA == 2) {
                    return;
                }
                w4.d.l("unexpected result");
                return;
            }
        }
        q0 q0Var3 = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var3 != null) {
            synchronized (q0Var3) {
                p0[] p0VarArr = q0Var3.f23265a;
                p0Var2 = p0VarArr != null ? p0VarArr[0] : null;
            }
        }
        if (p0Var2 != p0Var || Thread.currentThread() == (threadK0 = k0())) {
            return;
        }
        LockSupport.unpark(threadK0);
    }

    @Override // sf.m0
    public void shutdown() {
        p0 p0VarB;
        s1.f19808a.set(null);
        B.set(this, 1);
        hg.v vVar = y.f19833c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19805z;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof xf.m) {
                ((xf.m) obj).b();
                break;
            } else {
                if (obj == vVar) {
                    break;
                }
                xf.m mVar = new xf.m(8, true);
                mVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (g0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            q0 q0Var = (q0) A.get(this);
            if (q0Var == null) {
                return;
            }
            synchronized (q0Var) {
                p0VarB = xf.y.b.get(q0Var) > 0 ? q0Var.b(0) : null;
            }
            if (p0VarB == null) {
                return;
            } else {
                m0(jNanoTime, p0VarB);
            }
        }
    }
}
