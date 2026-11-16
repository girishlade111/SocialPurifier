package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterator {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2885u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2886v;

    public /* synthetic */ r(Object obj, int i2) {
        this.f2884t = i2;
        this.f2886v = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2884t) {
            case 0:
                return this.f2885u < ((p) this.f2886v).f2860t.length();
            case 1:
                return this.f2885u < ((p) this.f2886v).f2860t.length();
            default:
                return this.f2885u < ((e) this.f2886v).t();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f2884t) {
            case 0:
                int i2 = this.f2885u;
                String str = ((p) this.f2886v).f2860t;
                if (i2 >= str.length()) {
                    a6.d.d();
                    return null;
                }
                int i10 = this.f2885u;
                this.f2885u = i10 + 1;
                return new p(String.valueOf(str.charAt(i10)));
            case 1:
                if (this.f2885u >= ((p) this.f2886v).f2860t.length()) {
                    a6.d.d();
                    return null;
                }
                int i11 = this.f2885u;
                this.f2885u = i11 + 1;
                return new p(String.valueOf(i11));
            default:
                int i12 = this.f2885u;
                e eVar = (e) this.f2886v;
                int iT = eVar.t();
                int i13 = this.f2885u;
                if (i12 < iT) {
                    this.f2885u = i13 + 1;
                    return eVar.r(i13);
                }
                p1.n.o(ke.c1.i("Out of bounds index: ", i13));
                return null;
        }
    }
}
