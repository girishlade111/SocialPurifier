package xf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23239t = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23240u = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23241v = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final j f() {
        j jVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23240u;
            j jVar2 = (j) atomicReferenceFieldUpdater2.get(this);
            jVar = jVar2;
            while (true) {
                j jVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f23239t;
                    obj = atomicReferenceFieldUpdater.get(jVar);
                    if (obj == this) {
                        if (jVar2 != jVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, jVar2, jVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != jVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (j()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof b) {
                        ((b) obj).b(jVar);
                        break;
                    }
                    if (!(obj instanceof p)) {
                        obj.getClass();
                        jVar3 = jVar;
                        jVar = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar = (j) atomicReferenceFieldUpdater2.get(jVar);
                    }
                }
                j jVar4 = ((p) obj).f23251a;
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar3, jVar, jVar4)) {
                    if (atomicReferenceFieldUpdater.get(jVar3) != jVar) {
                        break;
                    }
                }
                jVar = jVar3;
            }
        }
        return jVar;
    }

    public final void g(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23240u;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (h() != jVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (j()) {
                        jVar.f();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(jVar) == jVar2);
        }
    }

    public final Object h() {
        while (true) {
            Object obj = f23239t.get(this);
            if (!(obj instanceof b)) {
                return obj;
            }
            ((b) obj).b(this);
        }
    }

    public final j i() {
        Object objH = h();
        p pVar = objH instanceof p ? (p) objH : null;
        if (pVar != null) {
            return pVar.f23251a;
        }
        objH.getClass();
        return (j) objH;
    }

    public boolean j() {
        return h() instanceof p;
    }

    public String toString() {
        return new c0.n(1, 3, sf.y.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + sf.y.n(this);
    }
}
