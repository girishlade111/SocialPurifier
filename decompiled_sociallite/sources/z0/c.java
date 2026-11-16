package z0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f23756v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f23757w;

    public c(Object[] objArr, int i2, int i10) {
        super(i2, i10);
        this.f23757w = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f23756v) {
            case 0:
                if (!hasNext()) {
                    a6.d.d();
                    return null;
                }
                Object[] objArr = (Object[]) this.f23757w;
                int i2 = this.f23754t;
                this.f23754t = i2 + 1;
                return objArr[i2];
            default:
                if (hasNext()) {
                    this.f23754t++;
                    return this.f23757w;
                }
                a6.d.d();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f23756v) {
            case 0:
                if (!hasPrevious()) {
                    a6.d.d();
                    return null;
                }
                Object[] objArr = (Object[]) this.f23757w;
                int i2 = this.f23754t - 1;
                this.f23754t = i2;
                return objArr[i2];
            default:
                if (hasPrevious()) {
                    this.f23754t--;
                    return this.f23757w;
                }
                a6.d.d();
                return null;
        }
    }

    public c(Object obj, int i2) {
        super(i2, 1);
        this.f23757w = obj;
    }
}
