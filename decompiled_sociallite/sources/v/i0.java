package v;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f21412a;

    public i0(h0 h0Var) {
        this.f21412a = h0Var;
    }

    @Override // v.v, v.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final n1 a(h1 h1Var) {
        int[] iArr;
        Object[] objArr;
        h0 h0Var = this.f21412a;
        s.r rVar = h0Var.b;
        s.q qVar = new s.q(rVar.f19215e + 2);
        s.r rVar2 = new s.r(rVar.f19215e);
        int[] iArr2 = rVar.b;
        Object[] objArr2 = rVar.f19213c;
        long[] jArr = rVar.f19212a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j10 = jArr[i2];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i2 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j10 & 255) < 128) {
                            int i13 = (i2 << 3) + i12;
                            int i14 = iArr2[i13];
                            g0 g0Var = (g0) objArr2[i13];
                            qVar.a(i14);
                            rVar2.h(i14, new m1((p) h1Var.f21403a.invoke(g0Var.f21398a), g0Var.b));
                        }
                        j10 >>= i10;
                        i12++;
                        iArr2 = iArr2;
                        i10 = i10;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i11 != i10) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!rVar.b(0)) {
            int i15 = qVar.b;
            if (i15 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + qVar.b);
            }
            qVar.b(i15 + 1);
            int[] iArr3 = qVar.f19211a;
            int i16 = qVar.b;
            if (i16 != 0) {
                te.j.N(1, 0, i16, iArr3, iArr3);
            }
            iArr3[0] = 0;
            qVar.b++;
        }
        if (!rVar.b(h0Var.f21402a)) {
            qVar.a(h0Var.f21402a);
        }
        int[] iArr4 = qVar.f19211a;
        int i17 = qVar.b;
        iArr4.getClass();
        Arrays.sort(iArr4, 0, i17);
        return new n1(qVar, rVar2, h0Var.f21402a, y.f21525d);
    }
}
