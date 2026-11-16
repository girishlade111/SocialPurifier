package xf;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sf.p0;
import sf.q0;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0[] f23265a;

    public final void a(p0 p0Var) {
        p0Var.d((q0) this);
        p0[] p0VarArr = this.f23265a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (p0VarArr == null) {
            p0VarArr = new p0[4];
            this.f23265a = p0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= p0VarArr.length) {
            p0VarArr = (p0[]) Arrays.copyOf(p0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f23265a = p0VarArr;
        }
        int i2 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i2 + 1);
        p0VarArr[i2] = p0Var;
        p0Var.f19799u = i2;
        c(i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final p0 b(int i2) {
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f23265a;
        objArr2.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i2 < atomicIntegerFieldUpdater.get(this)) {
            d(i2, atomicIntegerFieldUpdater.get(this));
            int i13 = (i2 - 1) / 2;
            if (i2 > 0) {
                p0 p0Var = objArr2[i2];
                p0Var.getClass();
                Object obj2 = objArr2[i13];
                obj2.getClass();
                if (p0Var.compareTo(obj2) < 0) {
                    d(i2, i13);
                    c(i13);
                } else {
                    while (true) {
                        i10 = i2 * 2;
                        i11 = i10 + 1;
                        if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f23265a;
                        objArr.getClass();
                        i12 = i10 + 2;
                        if (i12 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i12];
                            comparable3.getClass();
                            obj = objArr[i11];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i12 = i11;
                            }
                        } else {
                            i12 = i11;
                        }
                        comparable = objArr[i2];
                        comparable.getClass();
                        comparable2 = objArr[i12];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i2, i12);
                        i2 = i12;
                    }
                }
            } else {
                while (true) {
                    i10 = i2 * 2;
                    i11 = i10 + 1;
                    if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f23265a;
                    objArr.getClass();
                    i12 = i10 + 2;
                    if (i12 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i12];
                        comparable3.getClass();
                        obj = objArr[i11];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i12 = i11;
                        }
                    } else {
                        i12 = i11;
                    }
                    comparable = objArr[i2];
                    comparable.getClass();
                    comparable2 = objArr[i12];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i2, i12);
                    i2 = i12;
                }
            }
        }
        p0 p0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        p0Var2.getClass();
        p0Var2.d(null);
        p0Var2.f19799u = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return p0Var2;
    }

    public final void c(int i2) {
        while (i2 > 0) {
            p0[] p0VarArr = this.f23265a;
            p0VarArr.getClass();
            int i10 = (i2 - 1) / 2;
            p0 p0Var = p0VarArr[i10];
            p0Var.getClass();
            p0 p0Var2 = p0VarArr[i2];
            p0Var2.getClass();
            if (p0Var.compareTo(p0Var2) <= 0) {
                return;
            }
            d(i2, i10);
            i2 = i10;
        }
    }

    public final void d(int i2, int i10) {
        p0[] p0VarArr = this.f23265a;
        p0VarArr.getClass();
        p0 p0Var = p0VarArr[i10];
        p0Var.getClass();
        p0 p0Var2 = p0VarArr[i2];
        p0Var2.getClass();
        p0VarArr[i2] = p0Var;
        p0VarArr[i10] = p0Var2;
        p0Var.f19799u = i2;
        p0Var2.f19799u = i10;
    }
}
