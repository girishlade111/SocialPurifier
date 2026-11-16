package ac;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object[] f549t;

    public n0(Object[] objArr) {
        this.f549t = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f549t;
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? o0.q(objArr.length, (Object[]) objArr.clone()) : new o1(objArr[0]);
        }
        return h1.C;
    }
}
