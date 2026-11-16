package qg;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg.f f17284a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17285c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17290h;
    public int b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17286d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f17287e = new b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17288f = 7;

    public d(xg.f fVar) {
        this.f17284a = fVar;
    }

    public final void a(int i2) {
        int i10;
        if (i2 > 0) {
            int length = this.f17287e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f17288f;
                if (length < i10 || i2 <= 0) {
                    break;
                }
                b bVar = this.f17287e[length];
                bVar.getClass();
                i2 -= bVar.f17276c;
                int i12 = this.f17290h;
                b bVar2 = this.f17287e[length];
                bVar2.getClass();
                this.f17290h = i12 - bVar2.f17276c;
                this.f17289g--;
                i11++;
                length--;
            }
            b[] bVarArr = this.f17287e;
            int i13 = i10 + 1;
            System.arraycopy(bVarArr, i13, bVarArr, i13 + i11, this.f17289g);
            b[] bVarArr2 = this.f17287e;
            int i14 = this.f17288f + 1;
            Arrays.fill(bVarArr2, i14, i14 + i11, (Object) null);
            this.f17288f += i11;
        }
    }

    public final void b(b bVar) {
        int i2 = bVar.f17276c;
        int i10 = this.f17286d;
        if (i2 > i10) {
            b[] bVarArr = this.f17287e;
            te.j.U(0, bVarArr.length, null, bVarArr);
            this.f17288f = this.f17287e.length - 1;
            this.f17289g = 0;
            this.f17290h = 0;
            return;
        }
        a((this.f17290h + i2) - i10);
        int i11 = this.f17289g + 1;
        b[] bVarArr2 = this.f17287e;
        if (i11 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f17288f = this.f17287e.length - 1;
            this.f17287e = bVarArr3;
        }
        int i12 = this.f17288f;
        this.f17288f = i12 - 1;
        this.f17287e[i12] = bVar;
        this.f17289g++;
        this.f17290h += i2;
    }

    public final void c(xg.i iVar) throws EOFException {
        iVar.getClass();
        int[] iArr = x.f17366a;
        int iC = iVar.c();
        long j10 = 0;
        long j11 = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            byte bH = iVar.h(i2);
            byte[] bArr = kg.b.f9964a;
            j11 += (long) x.b[bH & 255];
        }
        int i10 = (int) ((j11 + ((long) 7)) >> 3);
        int iC2 = iVar.c();
        xg.f fVar = this.f17284a;
        if (i10 >= iC2) {
            e(iVar.c(), ModuleDescriptor.MODULE_VERSION, 0);
            fVar.b0(iVar);
            return;
        }
        xg.f fVar2 = new xg.f();
        int[] iArr2 = x.f17366a;
        int iC3 = iVar.c();
        int i11 = 0;
        for (int i12 = 0; i12 < iC3; i12++) {
            byte bH2 = iVar.h(i12);
            byte[] bArr2 = kg.b.f9964a;
            int i13 = bH2 & 255;
            int i14 = x.f17366a[i13];
            byte b = x.b[i13];
            j10 = (j10 << b) | ((long) i14);
            i11 += b;
            while (i11 >= 8) {
                i11 -= 8;
                fVar2.e0((int) (j10 >> i11));
            }
        }
        if (i11 > 0) {
            fVar2.e0((int) ((j10 << (8 - i11)) | (255 >>> i11)));
        }
        xg.i iVarG = fVar2.g(fVar2.f23297u);
        e(iVarG.c(), ModuleDescriptor.MODULE_VERSION, 128);
        fVar.b0(iVarG);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f17285c) {
            int i2 = this.b;
            if (i2 < this.f17286d) {
                e(i2, 31, 32);
            }
            this.f17285c = false;
            this.b = Integer.MAX_VALUE;
            e(this.f17286d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            xg.i iVarO = bVar.f17275a.o();
            xg.i iVar = bVar.b;
            Integer num = (Integer) e.b.get(iVarO);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    b[] bVarArr = e.f17291a;
                    if (kotlin.jvm.internal.l.a(bVarArr[iIntValue].b, iVar)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.l.a(bVarArr[length2].b, iVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f17287e.length;
                for (int i11 = this.f17288f + 1; i11 < length3; i11++) {
                    b bVar2 = this.f17287e[i11];
                    bVar2.getClass();
                    if (kotlin.jvm.internal.l.a(bVar2.f17275a, iVarO)) {
                        b bVar3 = this.f17287e[i11];
                        bVar3.getClass();
                        if (kotlin.jvm.internal.l.a(bVar3.b, iVar)) {
                            length2 = e.f17291a.length + (i11 - this.f17288f);
                            break;
                        } else if (length == -1) {
                            length = (i11 - this.f17288f) + e.f17291a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, ModuleDescriptor.MODULE_VERSION, 128);
            } else if (length == -1) {
                this.f17284a.e0(64);
                c(iVarO);
                c(iVar);
                b(bVar);
            } else {
                xg.i iVar2 = b.f17269d;
                iVarO.getClass();
                iVar2.getClass();
                if (!iVarO.l(0, iVar2, iVar2.c()) || kotlin.jvm.internal.l.a(b.f17274i, iVarO)) {
                    e(length, 63, 64);
                    c(iVar);
                    b(bVar);
                } else {
                    e(length, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i2, int i10, int i11) {
        xg.f fVar = this.f17284a;
        if (i2 < i10) {
            fVar.e0(i2 | i11);
            return;
        }
        fVar.e0(i11 | i10);
        int i12 = i2 - i10;
        while (i12 >= 128) {
            fVar.e0(128 | (i12 & ModuleDescriptor.MODULE_VERSION));
            i12 >>>= 7;
        }
        fVar.e0(i12);
    }
}
