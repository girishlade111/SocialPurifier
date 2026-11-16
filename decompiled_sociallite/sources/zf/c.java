package zf;

import a5.z;
import e4.w0;
import hg.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sf.y;
import xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final v D = new v("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f24107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f24108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f24109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f24110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f24111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q f24112z;

    public c(int i2, int i10, long j10, String str) {
        this.f24106t = i2;
        this.f24107u = i10;
        this.f24108v = j10;
        this.f24109w = str;
        if (i2 < 1) {
            w4.d.e(t8.c.h("Core pool size ", i2, " should be at least 1"));
            throw null;
        }
        if (i10 < i2) {
            w4.d.e(w0.q("Max pool size ", i10, i2, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i10 > 2097150) {
            w4.d.e(t8.c.h("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f24110x = new f();
        this.f24111y = new f();
        this.f24112z = new q((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void f(c cVar, Runnable runnable, int i2) {
        cVar.e(runnable, j.f24126g, (i2 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f24112z) {
            try {
                if (C.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = B;
                long j10 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j10 & 2097151);
                int i10 = i2 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f24106t) {
                    return 0;
                }
                if (i2 >= this.f24107u) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f24112z.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f24112z.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        h hVarA;
        if (C.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !aVar.A.equals(this)) {
                aVar = null;
            }
            synchronized (this.f24112z) {
                i2 = (int) (B.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i10 = 1;
                while (true) {
                    Object objB = this.f24112z.b(i10);
                    objB.getClass();
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f24093t;
                        f fVar = this.f24111y;
                        lVar.getClass();
                        h hVar = (h) l.b.getAndSet(lVar, null);
                        if (hVar != null) {
                            fVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = lVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                fVar.a(hVarB);
                            }
                        }
                    }
                    if (i10 == i2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f24111y.b();
            this.f24110x.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f24110x.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f24110x.d();
                    if (hVarA == null && (hVarA = (h) this.f24111y.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f24104x);
            }
            A.set(this, 0L);
            B.set(this, 0L);
        }
    }

    public final void e(Runnable runnable, db.l lVar, boolean z10) {
        h iVar;
        b bVar;
        j.f24125f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f24118t = jNanoTime;
            iVar.f24119u = lVar;
        } else {
            iVar = new i(runnable, jNanoTime, lVar);
        }
        boolean z11 = false;
        boolean z12 = iVar.f24119u.f3785t == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !aVar.A.equals(this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f24095v) != b.f24104x && (iVar.f24119u.f3785t != 0 || bVar != b.f24101u)) {
            aVar.f24099z = true;
            l lVar2 = aVar.f24093t;
            if (z10) {
                iVar = lVar2.a(iVar);
            } else {
                lVar2.getClass();
                h hVar = (h) l.b.getAndSet(lVar2, iVar);
                iVar = hVar == null ? null : lVar2.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f24119u.f3785t == 1 ? this.f24111y.a(iVar) : this.f24110x.a(iVar))) {
                throw new RejectedExecutionException(z.l(new StringBuilder(), this.f24109w, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z11 = true;
        }
        if (z12) {
            if (z11 || l() || k(jAddAndGet)) {
                return;
            }
            l();
            return;
        }
        if (z11 || l() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        l();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(this, runnable, 6);
    }

    public final void j(a aVar, int i2, int i10) {
        while (true) {
            long j10 = A.get(this);
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i11 == i2) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == D) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (A.compareAndSet(this, j10, ((long) i11) | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j10) {
        int i2 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i10 = this.f24106t;
        if (i2 < i10) {
            int iA = a();
            if (iA == 1 && i10 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        v vVar;
        int iB;
        while (true) {
            long j10 = A.get(this);
            a aVar = (a) this.f24112z.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    vVar = D;
                    if (objC == vVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (A.compareAndSet(this, j10, ((long) iB) | j11)) {
                        aVar.g(vVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.B.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f24112z;
        int iA = qVar.a();
        int i2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) qVar.b(i14);
            if (aVar != null) {
                l lVar = aVar.f24093t;
                lVar.getClass();
                int i15 = l.b.get(lVar) != null ? (l.f24129c.get(lVar) - l.f24130d.get(lVar)) + 1 : l.f24129c.get(lVar) - l.f24130d.get(lVar);
                int iOrdinal = aVar.f24095v.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (iOrdinal == 4) {
                    i13++;
                }
            }
        }
        long j10 = B.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f24109w);
        sb5.append('@');
        sb5.append(y.n(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f24106t;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f24107u);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i2);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f24110x.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f24111y.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
