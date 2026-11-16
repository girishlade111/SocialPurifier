package f1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class v implements f0, List, RandomAccess, jf.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f4794t;

    public v() {
        z0.h hVar = z0.h.f23775u;
        s sVar = new s(hVar);
        if (p.f4774a.j() != null) {
            s sVar2 = new s(hVar);
            sVar2.f4737a = 1;
            sVar.b = sVar2;
        }
        this.f4794t = sVar;
    }

    @Override // f1.f0
    public final h0 a() {
        return this.f4794t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2;
        z0.b bVar;
        boolean z10;
        i iVarK;
        do {
            Object obj2 = w.f4795a;
            synchronized (obj2) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i2 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            z0.b bVarD = bVar.d(obj);
            z10 = false;
            if (bVarD.equals(bVar)) {
                return false;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj2) {
                    int i10 = sVar4.f4787d;
                    if (i10 == i2) {
                        sVar4.f4786c = bVarD;
                        sVar4.f4788e++;
                        sVar4.f4787d = i10 + 1;
                        z10 = true;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i2;
        z0.b bVar;
        boolean z10;
        i iVarK;
        do {
            Object obj = w.f4795a;
            synchronized (obj) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i2 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            z0.b bVarE = bVar.e(collection);
            z10 = false;
            if (kotlin.jvm.internal.l.a(bVarE, bVar)) {
                return false;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj) {
                    int i10 = sVar4.f4787d;
                    if (i10 == i2) {
                        sVar4.f4786c = bVarE;
                        sVar4.f4788e++;
                        sVar4.f4787d = i10 + 1;
                        z10 = true;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return true;
    }

    public final s c() {
        s sVar = this.f4794t;
        sVar.getClass();
        return (s) p.t(sVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i iVarK;
        s sVar = this.f4794t;
        sVar.getClass();
        synchronized (p.b) {
            iVarK = p.k();
            s sVar2 = (s) p.w(sVar, this, iVarK);
            synchronized (w.f4795a) {
                sVar2.f4786c = z0.h.f23775u;
                sVar2.f4787d++;
                sVar2.f4788e++;
            }
        }
        p.n(iVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().f4786c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return c().f4786c.containsAll(collection);
    }

    public final int d() {
        s sVar = this.f4794t;
        sVar.getClass();
        return ((s) p.i(sVar)).f4788e;
    }

    @Override // f1.f0
    public final void e(h0 h0Var) {
        h0Var.b = this.f4794t;
        this.f4794t = (s) h0Var;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return c().f4786c.get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().f4786c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().f4786c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final boolean j(hf.c cVar) {
        int i2;
        z0.b bVar;
        Object objInvoke;
        i iVarK;
        boolean z10;
        do {
            Object obj = w.f4795a;
            synchronized (obj) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i2 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            z0.e eVarG = bVar.g();
            objInvoke = cVar.invoke(eVarG);
            z0.b bVarD = eVarG.d();
            if (kotlin.jvm.internal.l.a(bVarD, bVar)) {
                break;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj) {
                    int i10 = sVar4.f4787d;
                    if (i10 == i2) {
                        sVar4.f4786c = bVarD;
                        sVar4.f4787d = i10 + 1;
                        z10 = true;
                        sVar4.f4788e++;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().f4786c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2;
        z0.b bVar;
        boolean z10;
        i iVarK;
        do {
            Object obj2 = w.f4795a;
            synchronized (obj2) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i2 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            int iIndexOf = bVar.indexOf(obj);
            z0.b bVarM = iIndexOf != -1 ? bVar.m(iIndexOf) : bVar;
            z10 = false;
            if (bVarM.equals(bVar)) {
                return false;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj2) {
                    int i10 = sVar4.f4787d;
                    if (i10 == i2) {
                        sVar4.f4786c = bVarM;
                        sVar4.f4788e++;
                        sVar4.f4787d = i10 + 1;
                        z10 = true;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2;
        z0.b bVar;
        boolean z10;
        i iVarK;
        do {
            Object obj = w.f4795a;
            synchronized (obj) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i2 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            z0.b bVarJ = bVar.j(new u(1, collection));
            z10 = false;
            if (kotlin.jvm.internal.l.a(bVarJ, bVar)) {
                return false;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj) {
                    int i10 = sVar4.f4787d;
                    if (i10 == i2) {
                        sVar4.f4786c = bVarJ;
                        sVar4.f4788e++;
                        sVar4.f4787d = i10 + 1;
                        z10 = true;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return j(new u(0, collection));
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        int i10;
        z0.b bVar;
        i iVarK;
        boolean z10;
        Object obj2 = get(i2);
        do {
            Object obj3 = w.f4795a;
            synchronized (obj3) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i10 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            z0.b bVarQ = bVar.q(i2, obj);
            if (bVarQ.equals(bVar)) {
                break;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj3) {
                    int i11 = sVar4.f4787d;
                    if (i11 == i10) {
                        sVar4.f4786c = bVarQ;
                        sVar4.f4787d = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return c().f4786c.a();
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        if (i2 >= 0 && i2 <= i10 && i10 <= size()) {
            return new j0(this, i2, i10);
        }
        v0.d.c0("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        s sVar = this.f4794t;
        sVar.getClass();
        return "SnapshotStateList(value=" + ((s) p.i(sVar)).f4786c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new c0(this, i2);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0050 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = f1.w.f4795a
            monitor-enter(r0)
            f1.s r1 = r7.f4794t     // Catch: java.lang.Throwable -> L56
            r1.getClass()     // Catch: java.lang.Throwable -> L56
            f1.h0 r1 = f1.p.i(r1)     // Catch: java.lang.Throwable -> L56
            f1.s r1 = (f1.s) r1     // Catch: java.lang.Throwable -> L56
            int r2 = r1.f4787d     // Catch: java.lang.Throwable -> L56
            z0.b r1 = r1.f4786c     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)
            r1.getClass()
            z0.b r3 = r1.c(r8, r9)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L21
            goto L4f
        L21:
            f1.s r1 = r7.f4794t
            r1.getClass()
            java.lang.Object r4 = f1.p.b
            monitor-enter(r4)
            f1.i r5 = f1.p.k()     // Catch: java.lang.Throwable -> L50
            f1.h0 r1 = f1.p.w(r1, r7, r5)     // Catch: java.lang.Throwable -> L50
            f1.s r1 = (f1.s) r1     // Catch: java.lang.Throwable -> L50
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L50
            int r6 = r1.f4787d     // Catch: java.lang.Throwable -> L45
            if (r6 != r2) goto L47
            r1.f4786c = r3     // Catch: java.lang.Throwable -> L45
            int r2 = r1.f4788e     // Catch: java.lang.Throwable -> L45
            r3 = 1
            int r2 = r2 + r3
            r1.f4788e = r2     // Catch: java.lang.Throwable -> L45
            int r6 = r6 + 1
            r1.f4787d = r6     // Catch: java.lang.Throwable -> L45
            goto L48
        L45:
            r8 = move-exception
            goto L52
        L47:
            r3 = 0
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r4)
            f1.p.n(r5, r7)
            if (r3 == 0) goto L0
        L4f:
            return
        L50:
            r8 = move-exception
            goto L54
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r8     // Catch: java.lang.Throwable -> L50
        L54:
            monitor-exit(r4)
            throw r8
        L56:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.v.add(int, java.lang.Object):void");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return j(new t(i2, collection));
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i10;
        z0.b bVar;
        i iVarK;
        boolean z10;
        Object obj = get(i2);
        do {
            Object obj2 = w.f4795a;
            synchronized (obj2) {
                s sVar = this.f4794t;
                sVar.getClass();
                s sVar2 = (s) p.i(sVar);
                i10 = sVar2.f4787d;
                bVar = sVar2.f4786c;
            }
            bVar.getClass();
            z0.b bVarM = bVar.m(i2);
            if (bVarM.equals(bVar)) {
                break;
            }
            s sVar3 = this.f4794t;
            sVar3.getClass();
            synchronized (p.b) {
                iVarK = p.k();
                s sVar4 = (s) p.w(sVar3, this, iVarK);
                synchronized (obj2) {
                    int i11 = sVar4.f4787d;
                    if (i11 == i10) {
                        sVar4.f4786c = bVarM;
                        z10 = true;
                        sVar4.f4788e++;
                        sVar4.f4787d = i11 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.n(iVarK, this);
        } while (!z10);
        return obj;
    }
}
