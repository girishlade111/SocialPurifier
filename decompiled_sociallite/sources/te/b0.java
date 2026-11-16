package te;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ze.h implements hf.e {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Iterator C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f20232u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Iterator f20233v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20234w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20235x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20236y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f20237z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i2, int i10, Iterator it, xe.d dVar) {
        super(2, dVar);
        this.A = i2;
        this.B = i10;
        this.C = it;
    }

    @Override // ze.a
    public final xe.d create(Object obj, xe.d dVar) {
        b0 b0Var = new b0(this.A, this.B, this.C, dVar);
        b0Var.f20237z = obj;
        return b0Var;
    }

    @Override // hf.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((pf.j) obj, (xe.d) obj2)).invokeSuspend(se.a0.f19710a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0083 A[SYNTHETIC] */
    @Override // ze.a
    public final Object invokeSuspend(Object obj) {
        int i2;
        int i10;
        int i11;
        Iterator it;
        z zVar;
        ArrayList arrayList;
        int i12;
        Iterator it2;
        int i13;
        Object next;
        int i14;
        Object[] objArr;
        int i15;
        z zVar2;
        Object next2;
        boolean z10;
        int i16;
        Object[] array;
        pf.j jVar = (pf.j) this.f20237z;
        int i17 = this.f20236y;
        int i18 = this.B;
        boolean z11 = true;
        int i19 = this.A;
        ye.a aVar = ye.a.f23667t;
        if (i17 == 0) {
            se.a.f(obj);
            int i20 = i19 <= 1024 ? i19 : 1024;
            i2 = i18 - i19;
            Iterator it3 = this.C;
            if (i2 >= 0) {
                arrayList = new ArrayList(i20);
                i12 = i20;
                it2 = it3;
                i13 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i13 > 0) {
                        i13--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i19) {
                            this.f20237z = jVar;
                            this.f20232u = arrayList;
                            this.f20233v = it2;
                            this.f20234w = i12;
                            this.f20235x = i2;
                            this.f20236y = 1;
                            jVar.e(arrayList, this);
                            return aVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f20237z = null;
                    this.f20232u = null;
                    this.f20233v = null;
                    this.f20234w = i12;
                    this.f20235x = i2;
                    this.f20236y = 2;
                    jVar.e(arrayList, this);
                    return aVar;
                }
            } else {
                z zVar3 = new z(0, new Object[i20]);
                i10 = i20;
                i11 = i2;
                it = it3;
                zVar = zVar3;
                while (true) {
                    i14 = zVar.f20259u;
                    objArr = zVar.f20258t;
                    if (it.hasNext()) {
                        i15 = i10;
                        zVar2 = zVar;
                        break;
                    }
                    next2 = it.next();
                    z10 = z11;
                    if (zVar.a() != i14) {
                        w4.d.l("ring buffer is full");
                        return null;
                    }
                    int i21 = zVar.f20260v;
                    int i22 = zVar.f20261w;
                    objArr[(i21 + i22) % i14] = next2;
                    zVar.f20261w = i22 + 1;
                    if (zVar.a() != i14) {
                        if (zVar.f20261w < i19) {
                            ArrayList arrayList2 = new ArrayList(zVar);
                            this.f20237z = jVar;
                            this.f20232u = zVar;
                            this.f20233v = it;
                            this.f20234w = i10;
                            this.f20235x = i11;
                            this.f20236y = 3;
                            jVar.e(arrayList2, this);
                            return aVar;
                        }
                        i16 = i14 + (i14 >> 1) + 1;
                        if (i16 > i19) {
                            i16 = i19;
                        }
                        if (zVar.f20260v == 0) {
                            array = Arrays.copyOf(objArr, i16);
                        } else {
                            array = zVar.toArray(new Object[i16]);
                        }
                        zVar = new z(zVar.f20261w, array);
                    }
                    z11 = z10;
                }
                if (zVar2.f20261w > i18) {
                    ArrayList arrayList3 = new ArrayList(zVar2);
                    this.f20237z = jVar;
                    this.f20232u = zVar2;
                    this.f20233v = null;
                    this.f20234w = i15;
                    this.f20235x = i11;
                    this.f20236y = 4;
                    jVar.e(arrayList3, this);
                    return aVar;
                }
                if (!zVar2.isEmpty()) {
                    this.f20237z = null;
                    this.f20232u = null;
                    this.f20233v = null;
                    this.f20234w = i15;
                    this.f20235x = i11;
                    this.f20236y = 5;
                    jVar.e(zVar2, this);
                    return aVar;
                }
            }
        } else if (i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3) {
                    i11 = this.f20235x;
                    i10 = this.f20234w;
                    it = this.f20233v;
                    zVar = (z) this.f20232u;
                    se.a.f(obj);
                    zVar.c(i18);
                    while (true) {
                        i14 = zVar.f20259u;
                        objArr = zVar.f20258t;
                        if (it.hasNext()) {
                            i15 = i10;
                            zVar2 = zVar;
                            break;
                        }
                        next2 = it.next();
                        z10 = z11;
                        if (zVar.a() != i14) {
                            w4.d.l("ring buffer is full");
                            return null;
                        }
                        int i23 = zVar.f20260v;
                        int i24 = zVar.f20261w;
                        objArr[(i23 + i24) % i14] = next2;
                        zVar.f20261w = i24 + 1;
                        if (zVar.a() != i14) {
                            if (zVar.f20261w < i19) {
                                ArrayList arrayList4 = new ArrayList(zVar);
                                this.f20237z = jVar;
                                this.f20232u = zVar;
                                this.f20233v = it;
                                this.f20234w = i10;
                                this.f20235x = i11;
                                this.f20236y = 3;
                                jVar.e(arrayList4, this);
                                return aVar;
                            }
                            i16 = i14 + (i14 >> 1) + 1;
                            if (i16 > i19) {
                                i16 = i19;
                            }
                            if (zVar.f20260v == 0) {
                                array = Arrays.copyOf(objArr, i16);
                            } else {
                                array = zVar.toArray(new Object[i16]);
                            }
                            zVar = new z(zVar.f20261w, array);
                        }
                        z11 = z10;
                    }
                } else if (i17 == 4) {
                    i11 = this.f20235x;
                    i15 = this.f20234w;
                    zVar2 = (z) this.f20232u;
                    se.a.f(obj);
                    zVar2.c(i18);
                } else {
                    if (i17 != 5) {
                        w4.d.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (zVar2.f20261w > i18) {
                    ArrayList arrayList5 = new ArrayList(zVar2);
                    this.f20237z = jVar;
                    this.f20232u = zVar2;
                    this.f20233v = null;
                    this.f20234w = i15;
                    this.f20235x = i11;
                    this.f20236y = 4;
                    jVar.e(arrayList5, this);
                    return aVar;
                }
                if (!zVar2.isEmpty()) {
                    this.f20237z = null;
                    this.f20232u = null;
                    this.f20233v = null;
                    this.f20234w = i15;
                    this.f20235x = i11;
                    this.f20236y = 5;
                    jVar.e(zVar2, this);
                    return aVar;
                }
            }
            se.a.f(obj);
        } else {
            i13 = this.f20235x;
            i12 = this.f20234w;
            it2 = this.f20233v;
            se.a.f(obj);
            arrayList = new ArrayList(i19);
            i2 = i13;
            while (it2.hasNext()) {
                next = it2.next();
                if (i13 > 0) {
                    i13--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i19) {
                        this.f20237z = jVar;
                        this.f20232u = arrayList;
                        this.f20233v = it2;
                        this.f20234w = i12;
                        this.f20235x = i2;
                        this.f20236y = 1;
                        jVar.e(arrayList, this);
                        return aVar;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f20237z = null;
                this.f20232u = null;
                this.f20233v = null;
                this.f20234w = i12;
                this.f20235x = i2;
                this.f20236y = 2;
                jVar.e(arrayList, this);
                return aVar;
            }
        }
        return se.a0.f19710a;
    }
}
