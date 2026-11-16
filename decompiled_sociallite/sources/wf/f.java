package wf;

import me.kt;
import me.lt;
import se.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vf.f f22840w;

    public f(vf.f fVar, xe.i iVar, int i2, uf.a aVar) {
        super(iVar, i2, aVar);
        this.f22840w = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[RETURN] */
    @Override // wf.e, vf.f
    public final Object a(vf.g gVar, xe.d dVar) {
        Object objA;
        int i2 = this.f22838u;
        ye.a aVar = ye.a.f23667t;
        if (i2 == -3) {
            xe.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            sf.q qVar = sf.q.f19801v;
            xe.i iVar = this.f22837t;
            xe.i iVarP = !((Boolean) iVar.O(bool, qVar)).booleanValue() ? context.p(iVar) : sf.y.k(context, iVar, false);
            if (kotlin.jvm.internal.l.a(iVarP, context)) {
                Object objF = f(gVar, dVar);
                if (objF == aVar) {
                    return objF;
                }
            } else {
                xe.e eVar = xe.e.f23210t;
                if (kotlin.jvm.internal.l.a(iVarP.l(eVar), context.l(eVar))) {
                    xe.i context2 = dVar.getContext();
                    if (!(gVar instanceof w ? true : gVar instanceof r)) {
                        gVar = new kt(gVar, context2);
                    }
                    Object objA2 = c.a(iVarP, gVar, xf.a.l(iVarP), new lt(this, null, 16), dVar);
                    if (objA2 == aVar) {
                        return objA2;
                    }
                } else {
                    objA = super.a(gVar, dVar);
                    if (objA == aVar) {
                        return objA;
                    }
                }
            }
        } else {
            objA = super.a(gVar, dVar);
            if (objA == aVar) {
                return objA;
            }
        }
        return a0.f19710a;
    }

    @Override // wf.e
    public final Object b(uf.q qVar, xe.d dVar) {
        Object objF = f(new w(qVar), dVar);
        return objF == ye.a.f23667t ? objF : a0.f19710a;
    }

    public abstract Object f(vf.g gVar, xe.d dVar);

    @Override // wf.e
    public final String toString() {
        return this.f22840w + " -> " + super.toString();
    }
}
