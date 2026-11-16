package androidx.compose.foundation.lazy.layout;

import c0.s;
import c0.w;
import d0.c0;
import d0.g;
import d0.v;
import d0.x;
import e2.s0;
import g2.t0;
import h1.p;
import h1.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.l;
import s.f0;
import s.h0;
import s.z;
import te.k;
import te.o;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f1019a;
    public c0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.c0 f1020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f1024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f1026i;

    public a() {
        long[] jArr = f0.f19180a;
        this.f1019a = new z();
        int i2 = h0.f19185a;
        this.f1020c = new s.c0();
        this.f1021d = new ArrayList();
        this.f1022e = new ArrayList();
        this.f1023f = new ArrayList();
        this.f1024g = new ArrayList();
        this.f1025h = new ArrayList();
        this.f1026i = new t0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final a f1012t;

            {
                this.f1012t = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && this.f1012t.equals(((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f1012t);
            }

            public final int hashCode() {
                return this.f1012t.hashCode();
            }

            @Override // g2.t0
            public final p j() {
                v vVar = new v();
                vVar.G = this.f1012t;
                return vVar;
            }

            @Override // g2.t0
            public final void n(p pVar) {
                v vVar = (v) pVar;
                a aVar = vVar.G;
                a aVar2 = this.f1012t;
                if (l.a(aVar, aVar2) || !vVar.f7356t.F) {
                    return;
                }
                vVar.G.c();
                vVar.G = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f1012t + ')';
            }
        };
    }

    public static int e(int[] iArr, w wVar) {
        wVar.getClass();
        int i2 = iArr[0] + wVar.f2011o;
        iArr[0] = i2;
        return Math.max(0, i2);
    }

    public final long a() {
        ArrayList arrayList = this.f1025h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        a5.z.o(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x00a3 A[EDGE_INSN: B:129:0x00a3->B:35:0x00a3 BREAK  A[LOOP:2: B:21:0x0066->B:33:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e A[LOOP:2: B:21:0x0066->B:33:0x009e, LOOP_END] */
    public final void b(int i2, int i10, ArrayList arrayList, a2.c0 c0Var, s sVar, boolean z10, boolean z11, int i11, int i12) {
        long j10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        char c10;
        int i13;
        long j11;
        int i14;
        int i15;
        c0 c0Var2 = this.b;
        this.b = c0Var;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            w wVar = (w) arrayList.get(i16);
            int size2 = wVar.b.size();
            for (int i17 = 0; i17 < size2; i17++) {
                ((s0) wVar.b.get(i17)).N();
            }
        }
        z zVar = this.f1019a;
        if (zVar.f19249e == 0) {
            c();
            return;
        }
        boolean z12 = z10 || !z11;
        Object[] objArr = zVar.b;
        long[] jArr = zVar.f19246a;
        int length = jArr.length - 2;
        s.c0 c0Var3 = this.f1020c;
        if (length >= 0) {
            int i18 = 0;
            j10 = 255;
            while (true) {
                long j12 = jArr[i18];
                int i19 = i18;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i19 != length) {
                        break;
                        break;
                    }
                    i18 = i19 + 1;
                } else {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    long j13 = j12;
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j13 & 255) < 128) {
                            c0Var3.a(objArr[(i19 << 3) + i21]);
                        }
                        j13 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    } else if (i19 != length) {
                        break;
                    } else {
                        i18 = i19 + 1;
                    }
                }
            }
        } else {
            j10 = 255;
        }
        int size3 = arrayList.size();
        for (int i22 = 0; i22 < size3; i22++) {
            w wVar2 = (w) arrayList.get(i22);
            Object obj = wVar2.f2007j;
            List list = wVar2.b;
            c0Var3.j(obj);
            int size4 = list.size();
            for (int i23 = 0; i23 < size4; i23++) {
                ((s0) list.get(i23)).N();
            }
            a5.z.o(this.f1019a.g(wVar2.f2007j));
        }
        int[] iArr = {0};
        ArrayList arrayList4 = this.f1022e;
        ArrayList arrayList5 = this.f1021d;
        if (z12 && c0Var2 != null) {
            if (!arrayList5.isEmpty()) {
                if (arrayList5.size() > 1) {
                    o.K(arrayList5, new d0.w(c0Var2, 1));
                }
                if (arrayList5.size() > 0) {
                    w wVar3 = (w) arrayList5.get(0);
                    e(iArr, wVar3);
                    Object objE = zVar.e(wVar3.f2007j);
                    objE.getClass();
                    a5.z.o(objE);
                    wVar3.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    o.K(arrayList4, new d0.w(c0Var2, 0));
                }
                if (arrayList4.size() > 0) {
                    w wVar4 = (w) arrayList4.get(0);
                    e(iArr, wVar4);
                    Object objE2 = zVar.e(wVar4.f2007j);
                    objE2.getClass();
                    a5.z.o(objE2);
                    wVar4.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr2 = c0Var3.b;
        long[] jArr2 = c0Var3.f19167a;
        int length2 = jArr2.length - 2;
        boolean z13 = z12;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j14 = jArr2[i24];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8;
                    int i26 = 8 - ((~(i24 - length2)) >>> 31);
                    long j15 = j14;
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j15 & j10) < 128) {
                            Object obj2 = objArr2[(i24 << 3) + i27];
                            Object objE3 = zVar.e(obj2);
                            objE3.getClass();
                            a5.z.o(objE3);
                            c0Var.a(obj2);
                            throw null;
                        }
                        j15 >>= i25;
                        i27++;
                        i25 = 8;
                    }
                    if (i26 != i25) {
                        break;
                    }
                }
                if (i24 == length2) {
                    break;
                }
                i24++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = this.f1023f;
        if (arrayList6.isEmpty()) {
            c10 = ' ';
            i13 = 1;
            j11 = 4294967295L;
        } else {
            if (arrayList6.size() > 1) {
                o.K(arrayList6, new x(c0Var, 1));
            }
            int size5 = arrayList6.size();
            for (int i28 = 0; i28 < size5; i28++) {
                w wVar5 = (w) arrayList6.get(i28);
                Object objE4 = zVar.e(wVar5.f2007j);
                objE4.getClass();
                a5.z.o(objE4);
                int iE = e(iArr, wVar5);
                if (z10) {
                    w wVar6 = (w) k.V(arrayList);
                    long jA = wVar6.a(0);
                    i15 = (int) (wVar6.f2000c ? jA & 4294967295L : jA >> 32);
                } else {
                    i15 = 0;
                }
                wVar5.c(i15 - iE, i2, i10);
                if (z13) {
                    d(wVar5, true);
                    throw null;
                }
            }
            c10 = ' ';
            i13 = 1;
            j11 = 4294967295L;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList7 = this.f1024g;
        if (!arrayList7.isEmpty()) {
            if (arrayList7.size() > i13) {
                o.K(arrayList7, new x(c0Var, 0));
            }
            int size6 = arrayList7.size();
            for (int i29 = 0; i29 < size6; i29++) {
                w wVar7 = (w) arrayList7.get(i29);
                Object objE5 = zVar.e(wVar7.f2007j);
                objE5.getClass();
                a5.z.o(objE5);
                int iE2 = e(iArr, wVar7);
                if (z10) {
                    w wVar8 = (w) k.d0(arrayList);
                    long jA2 = wVar8.a(0);
                    i14 = (int) (wVar8.f2000c ? jA2 & j11 : jA2 >> c10);
                } else {
                    i14 = 0 - wVar7.f2011o;
                }
                wVar7.c(i14 + iE2, i2, i10);
                if (z13) {
                    d(wVar7, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList7);
        arrayList3.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList7.clear();
        c0Var3.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[LOOP:0: B:7:0x0011->B:18:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[EDGE_INSN: B:23:0x004b->B:19:0x004b BREAK  A[LOOP:0: B:7:0x0011->B:18:0x0048], SYNTHETIC] */
    public final void c() {
        z zVar = this.f1019a;
        if (zVar.f19249e != 0) {
            Object[] objArr = zVar.f19247c;
            long[] jArr = zVar.f19246a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j10 = jArr[i2];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i10 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j10) < 128) {
                                a5.z.o(objArr[(i2 << 3) + i11]);
                                throw null;
                            }
                            j10 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            zVar.a();
        }
        this.b = g.f3568u;
    }

    public final void d(w wVar, boolean z10) {
        Object objE = this.f1019a.e(wVar.f2007j);
        objE.getClass();
        a5.z.o(objE);
        throw null;
    }
}
