package e8;

import android.content.Context;
import j8.k;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8.i f4534a;
    public final List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.i f4536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k8.g f4537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z7.c f4538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4539g;

    public j(j8.i iVar, List list, int i2, j8.i iVar2, k8.g gVar, z7.c cVar, boolean z10) {
        this.f4534a = iVar;
        this.b = list;
        this.f4535c = i2;
        this.f4536d = iVar2;
        this.f4537e = gVar;
        this.f4538f = cVar;
        this.f4539g = z10;
    }

    public final void a(j8.i iVar, h hVar) {
        Context context = iVar.f8649a;
        j8.i iVar2 = this.f4534a;
        if (context != iVar2.f8649a) {
            a6.d.q(hVar, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (iVar.b == k.f8673a) {
            a6.d.q(hVar, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (iVar.f8650c != iVar2.f8650c) {
            a6.d.q(hVar, "' cannot modify the request's target.", "Interceptor '");
        } else if (iVar.f8667u != iVar2.f8667u) {
            a6.d.q(hVar, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (iVar.f8668v == iVar2.f8668v) {
                return;
            }
            a6.d.q(hVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(j8.i iVar, ze.c cVar) {
        i iVar2;
        h hVar;
        j jVar;
        if (cVar instanceof i) {
            iVar2 = (i) cVar;
            int i2 = iVar2.f4533x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar2.f4533x = i2 - Integer.MIN_VALUE;
            } else {
                iVar2 = new i(this, cVar);
            }
        } else {
            iVar2 = new i(this, cVar);
        }
        Object obj = iVar2.f4531v;
        int i10 = iVar2.f4533x;
        if (i10 == 0) {
            se.a.f(obj);
            List list = this.b;
            int i11 = this.f4535c;
            if (i11 > 0) {
                a(iVar, (h) list.get(i11 - 1));
            }
            h hVar2 = (h) list.get(i11);
            j jVar2 = new j(this.f4534a, this.b, i11 + 1, iVar, this.f4537e, this.f4538f, this.f4539g);
            iVar2.f4529t = this;
            iVar2.f4530u = hVar2;
            iVar2.f4533x = 1;
            Object objD = hVar2.d(jVar2, iVar2);
            ye.a aVar = ye.a.f23667t;
            if (objD == aVar) {
                return aVar;
            }
            obj = objD;
            hVar = hVar2;
            jVar = this;
        } else {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar = iVar2.f4530u;
            jVar = iVar2.f4529t;
            se.a.f(obj);
        }
        j8.j jVar3 = (j8.j) obj;
        jVar.a(jVar3.a(), hVar);
        return jVar3;
    }
}
