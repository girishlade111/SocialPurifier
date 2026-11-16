package u7;

import ah.x0;
import ah.z;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x;
import e2.i0;
import e4.w0;
import g2.e0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jg.a0;
import ke.c1;
import o1.z0;
import p2.m0;
import rb.b0;
import v0.b1;
import v2.y;

/* JADX INFO: loaded from: classes.dex */
public final class l implements jg.d, e1.n, h8.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f21021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f21022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f21023v;

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.f21021t = 8;
        int size = arrayList.size();
        this.f21022u = new int[size];
        this.f21023v = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f21022u)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f21023v)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static l e(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new l(channel, fileLockLock, false, 6);
                } catch (IOException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e11) {
                    e = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e12) {
                    e = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e13) {
                e = e13;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            channel = null;
            fileLockLock = null;
        }
    }

    public static void j(l lVar, e eVar) {
        mc.c cVar = (mc.c) lVar.f21022u;
        long[] jArr = (long[]) cVar.f10634u;
        mc.c cVar2 = (mc.c) eVar.f21004t;
        long[] jArr2 = (long[]) cVar2.f10634u;
        long[] jArr3 = (long[]) eVar.f21005u;
        sc.l.k(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) cVar.f10635v;
        long[] jArr5 = (long[]) cVar2.f10635v;
        long[] jArr6 = (long[]) cVar2.f10636w;
        sc.l.k(jArr4, jArr5, jArr6);
        sc.l.k((long[]) cVar.f10636w, jArr6, jArr3);
        sc.l.k((long[]) lVar.f21023v, (long[]) cVar2.f10634u, (long[]) cVar2.f10635v);
    }

    @Override // e1.n
    public Object a(Object obj) {
        return ((hf.c) this.f21023v).invoke(obj);
    }

    @Override // jg.d
    public void b(a0 a0Var) {
        ah.h hVar = (ah.h) this.f21022u;
        z zVar = (z) this.f21023v;
        try {
            try {
                hVar.l(zVar, zVar.c(a0Var));
            } catch (Throwable th) {
                x0.r(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            x0.r(th2);
            try {
                hVar.r(zVar, th2);
            } catch (Throwable th3) {
                x0.r(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // e1.n
    public Object c(e1.b bVar, Object obj) {
        return ((hf.e) this.f21022u).invoke(bVar, obj);
    }

    @Override // jg.d
    public void d(ng.i iVar, IOException iOException) {
        try {
            ((ah.h) this.f21022u).r((z) this.f21023v, iOException);
        } catch (Throwable th) {
            x0.r(th);
            th.printStackTrace();
        }
    }

    public void f(String str, Object obj) {
        ((ArrayList) this.f21022u).add(w0.r(str, "=", String.valueOf(obj)));
    }

    public y g(List list) {
        v2.i iVar;
        Exception e10;
        try {
            int size = list.size();
            int i2 = 0;
            iVar = null;
            while (i2 < size) {
                try {
                    v2.i iVar2 = (v2.i) list.get(i2);
                    try {
                        iVar2.a((b6.h) this.f21023v);
                        i2++;
                        iVar = iVar2;
                    } catch (Exception e11) {
                        e10 = e11;
                        iVar = iVar2;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(((b6.g) ((b6.h) this.f21023v).f1663f).f());
                        sb3.append(", composition=");
                        sb3.append(((b6.h) this.f21023v).f());
                        sb3.append(", selection=");
                        b6.h hVar = (b6.h) this.f21023v;
                        sb3.append((Object) m0.g(te.a0.a(hVar.b, hVar.f1660c)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        te.k.b0(list, sb2, new z0(iVar, this), 60);
                        throw new RuntimeException(sb2.toString(), e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            }
            b6.h hVar2 = (b6.h) this.f21023v;
            hVar2.getClass();
            p2.f fVar = new p2.f(6, ((b6.g) hVar2.f1663f).toString(), null);
            b6.h hVar3 = (b6.h) this.f21023v;
            long jA = te.a0.a(hVar3.b, hVar3.f1660c);
            m0 m0Var = m0.f(((y) this.f21022u).b) ? null : new m0(jA);
            y yVar = new y(fVar, m0Var != null ? m0Var.f16589a : te.a0.a(m0.d(jA), m0.e(jA)), ((b6.h) this.f21023v).f());
            this.f21022u = yVar;
            return yVar;
        } catch (Exception e13) {
            iVar = null;
            e10 = e13;
        }
    }

    public void h(int[] iArr, int i2) {
        wd.b bVar;
        wd.b bVar2;
        wd.b bVar3;
        wd.a aVar = (wd.a) this.f21022u;
        if (i2 == 0) {
            w4.d.j("No error correction bytes");
            return;
        }
        int length = iArr.length - i2;
        if (length <= 0) {
            w4.d.j("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.f21023v;
        int i10 = 1;
        int i11 = 0;
        if (i2 >= arrayList.size()) {
            wd.b bVar4 = (wd.b) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            while (size <= i2) {
                int[] iArr2 = {i10, aVar.f22824a[(size - 1) + aVar.f22828f]};
                if (iArr2[i11] == 0) {
                    int i12 = i10;
                    while (i12 < 2 && iArr2[i12] == 0) {
                        i12++;
                    }
                    if (i12 == 2) {
                        iArr2 = new int[]{i11};
                    } else {
                        int i13 = 2 - i12;
                        int[] iArr3 = new int[i13];
                        System.arraycopy(iArr2, i12, iArr3, i11, i13);
                        iArr2 = iArr3;
                    }
                }
                wd.a aVar2 = bVar4.f22829a;
                if (!aVar2.equals(aVar)) {
                    w4.d.j("GenericGFPolys do not have same GenericGF field");
                    return;
                }
                int[] iArr4 = bVar4.b;
                if (iArr4[i11] == 0 || iArr2[i11] == 0) {
                    bVar4 = aVar2.f22825c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i10];
                    for (int i14 = i11; i14 < length2; i14++) {
                        int i15 = iArr4[i14];
                        int i16 = 0;
                        while (i16 < length3) {
                            int i17 = i14 + i16;
                            int i18 = i16;
                            iArr5[i17] = iArr5[i17] ^ aVar2.a(i15, iArr2[i18]);
                            i16 = i18 + 1;
                        }
                    }
                    bVar4 = new wd.b(aVar2, iArr5);
                }
                arrayList.add(bVar4);
                size++;
                i10 = 1;
                i11 = 0;
            }
        }
        wd.b bVar5 = (wd.b) arrayList.get(i2);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            w4.d.b();
            return;
        }
        if (length > 1 && iArr6[0] == 0) {
            int i19 = 1;
            while (i19 < length && iArr6[i19] == 0) {
                i19++;
            }
            if (i19 == length) {
                iArr6 = new int[]{0};
            } else {
                int i20 = length - i19;
                int[] iArr7 = new int[i20];
                System.arraycopy(iArr6, i19, iArr7, 0, i20);
                iArr6 = iArr7;
            }
        }
        if (i2 < 0) {
            w4.d.b();
            return;
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i2];
        for (int i21 = 0; i21 < length4; i21++) {
            iArr8[i21] = aVar.a(iArr6[i21], 1);
        }
        wd.b bVar6 = new wd.b(aVar, iArr8);
        wd.a aVar3 = bVar5.f22829a;
        int[] iArr9 = bVar5.b;
        boolean zEquals = aVar.equals(aVar3);
        wd.b bVar7 = aVar.f22825c;
        if (!zEquals) {
            w4.d.j("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (iArr9[0] == 0) {
            w4.d.j("Divide by 0");
            return;
        }
        int i22 = iArr9[(iArr9.length - 1) - bVar5.b()];
        if (i22 == 0) {
            throw new ArithmeticException();
        }
        int i23 = aVar.f22824a[(aVar.f22826d - aVar.b[i22]) - 1];
        wd.b bVarA = bVar7;
        while (true) {
            int[] iArr10 = bVar6.b;
            if (bVar6.b() < bVar5.b() || iArr10[0] == 0) {
                break;
            }
            int iB = bVar6.b() - bVar5.b();
            int iA = aVar.a(iArr10[(iArr10.length - 1) - bVar6.b()], i23);
            wd.a aVar4 = bVar5.f22829a;
            if (iB < 0) {
                w4.d.b();
                return;
            }
            if (iA == 0) {
                bVar2 = aVar4.f22825c;
                bVar = bVar5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + iB];
                int i24 = 0;
                while (i24 < length5) {
                    iArr11[i24] = aVar4.a(iArr9[i24], iA);
                    i24++;
                    bVar5 = bVar5;
                }
                bVar = bVar5;
                bVar2 = new wd.b(aVar4, iArr11);
            }
            if (iB < 0) {
                w4.d.b();
                return;
            }
            if (iA == 0) {
                bVar3 = bVar7;
            } else {
                int[] iArr12 = new int[iB + 1];
                iArr12[0] = iA;
                bVar3 = new wd.b(aVar, iArr12);
            }
            bVarA = bVarA.a(bVar3);
            bVar6 = bVar6.a(bVar2);
            bVar5 = bVar;
        }
        int[] iArr13 = new wd.b[]{bVarA, bVar6}[1].b;
        int length6 = i2 - iArr13.length;
        for (int i25 = 0; i25 < length6; i25++) {
            iArr[length + i25] = 0;
        }
        System.arraycopy(iArr13, 0, iArr, length + length6, iArr13.length);
    }

    @Override // h8.g
    public void i(h8.a aVar, Bitmap bitmap, Map map) {
        int i2;
        int iL = jb.a.l(bitmap);
        h8.e eVar = (h8.e) this.f21023v;
        synchronized (eVar.f19202c) {
            i2 = eVar.f19201a;
        }
        h8.e eVar2 = (h8.e) this.f21023v;
        if (iL <= i2) {
            eVar2.d(aVar, new h8.d(bitmap, map, iL));
        } else {
            eVar2.e(aVar);
            ((a1.n) this.f21022u).p(aVar, bitmap, map, iL);
        }
    }

    public i0 k() {
        return (i0) ((b1) this.f21023v).getValue();
    }

    public void l() {
        try {
            ((FileLock) this.f21023v).release();
            ((FileChannel) this.f21022u).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:365:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:366:0x0c5e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, u7.i] */
    /* JADX WARN: Type inference failed for: r13v118, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r13v154, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v104, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r14v108, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v18, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v185, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v188, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r14v197 */
    /* JADX WARN: Type inference failed for: r14v218, types: [com.google.android.gms.internal.measurement.e] */
    /* JADX WARN: Type inference failed for: r14v223, types: [com.google.android.gms.internal.measurement.m] */
    /* JADX WARN: Type inference failed for: r14v226 */
    /* JADX WARN: Type inference failed for: r14v267, types: [com.google.android.gms.internal.measurement.p] */
    /* JADX WARN: Type inference failed for: r14v270 */
    /* JADX WARN: Type inference failed for: r14v271 */
    /* JADX WARN: Type inference failed for: r14v39, types: [com.google.android.gms.internal.measurement.g] */
    /* JADX WARN: Type inference failed for: r14v58, types: [com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.o] */
    /* JADX WARN: Type inference failed for: r14v70, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r14v98, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v58, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v59, types: [com.google.android.gms.internal.measurement.t] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v89, types: [com.google.android.gms.internal.measurement.h] */
    /* JADX WARN: Type inference failed for: r2v93, types: [com.google.android.gms.internal.measurement.h] */
    public com.google.android.gms.internal.measurement.n m(i iVar, com.google.android.gms.internal.measurement.n nVar) {
        com.google.android.gms.internal.measurement.n gVar;
        ?? gVar2;
        boolean zD;
        boolean zI;
        ?? r9;
        String str;
        HashMap map = (HashMap) this.f21022u;
        p0.h(iVar);
        if (!(nVar instanceof com.google.android.gms.internal.measurement.q)) {
            return nVar;
        }
        com.google.android.gms.internal.measurement.q qVar = (com.google.android.gms.internal.measurement.q) nVar;
        ArrayList arrayList = qVar.f2869u;
        String str2 = qVar.f2868t;
        s sVar = map.containsKey(str2) ? (s) map.get(str2) : (s) this.f21023v;
        switch (sVar.b) {
            case 0:
                switch (u.f2915a[p0.b(str2).ordinal()]) {
                    case 1:
                        p0.g(f0.BITWISE_AND, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue()) & p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue())));
                        return gVar;
                    case 2:
                        p0.g(f0.BITWISE_LEFT_SHIFT, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue()) << ((int) (((long) p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue())) & 31))));
                        return gVar;
                    case 3:
                        p0.g(f0.BITWISE_NOT, 1, arrayList);
                        gVar2 = new com.google.android.gms.internal.measurement.g(Double.valueOf(~p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue())));
                        return gVar2;
                    case 4:
                        p0.g(f0.BITWISE_OR, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue()) | p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue())));
                        return gVar;
                    case 5:
                        p0.g(f0.BITWISE_RIGHT_SHIFT, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue()) >> ((int) (((long) p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue())) & 31))));
                        return gVar;
                    case 6:
                        p0.g(f0.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList);
                        gVar2 = new com.google.android.gms.internal.measurement.g(Double.valueOf((((long) p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue())) & 4294967295L) >>> ((int) (((long) p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue())) & 31))));
                        return gVar2;
                    case 7:
                        p0.g(f0.BITWISE_XOR, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue()) ^ p0.j(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue())));
                        return gVar;
                    default:
                        sVar.c(str2);
                        throw null;
                }
            case 1:
                p0.f(2, arrayList, p0.b(str2).name());
                com.google.android.gms.internal.measurement.n nVarM = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                com.google.android.gms.internal.measurement.n nVarM2 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                switch (w.f2935a[p0.b(str2).ordinal()]) {
                    case 1:
                        zD = s.d(nVarM, nVarM2);
                        return zD ? com.google.android.gms.internal.measurement.n.f2831f : com.google.android.gms.internal.measurement.n.f2832g;
                    case 2:
                        zD = s.f(nVarM2, nVarM);
                        if (zD) {
                        }
                    case 3:
                        zD = s.g(nVarM2, nVarM);
                        if (zD) {
                        }
                    case 4:
                        zD = p0.i(nVarM, nVarM2);
                        if (zD) {
                        }
                    case 5:
                        zI = p0.i(nVarM, nVarM2);
                        zD = !zI;
                        if (zD) {
                        }
                    case 6:
                        zD = s.f(nVarM, nVarM2);
                        if (zD) {
                        }
                    case 7:
                        zD = s.g(nVarM, nVarM2);
                        if (zD) {
                        }
                    case 8:
                        zI = s.d(nVarM, nVarM2);
                        zD = !zI;
                        if (zD) {
                        }
                    default:
                        sVar.c(str2);
                        throw null;
                }
            case 2:
                switch (x.f2970a[p0.b(str2).ordinal()]) {
                    case 1:
                        p0.g(f0.APPLY, 3, arrayList);
                        com.google.android.gms.internal.measurement.n nVar2 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        l lVar = (l) iVar.f21016u;
                        l lVar2 = (l) iVar.f21016u;
                        com.google.android.gms.internal.measurement.n nVarM3 = lVar.m(iVar, nVar2);
                        String strD = lVar2.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).d();
                        com.google.android.gms.internal.measurement.n nVarM4 = lVar2.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        if (!(nVarM4 instanceof com.google.android.gms.internal.measurement.e)) {
                            w4.d.j(a5.z.i("Function arguments for Apply are not a list found ", nVarM4.getClass().getCanonicalName()));
                        } else {
                            if (!strD.isEmpty()) {
                                return nVarM3.m(strD, iVar, ((com.google.android.gms.internal.measurement.e) nVarM4).z());
                            }
                            w4.d.j("Function name for apply is undefined");
                        }
                        return null;
                    case 2:
                        return iVar.X().T(new com.google.android.gms.internal.measurement.e(arrayList));
                    case 3:
                        p0.g(f0.BREAK, 0, arrayList);
                        return com.google.android.gms.internal.measurement.n.f2829d;
                    case 4:
                    case 5:
                        if (!arrayList.isEmpty()) {
                            com.google.android.gms.internal.measurement.n nVarM5 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                            if (nVarM5 instanceof com.google.android.gms.internal.measurement.e) {
                                return iVar.T((com.google.android.gms.internal.measurement.e) nVarM5);
                            }
                        }
                        return com.google.android.gms.internal.measurement.n.f2827a;
                    case 6:
                        p0.g(f0.BREAK, 0, arrayList);
                        return com.google.android.gms.internal.measurement.n.f2828c;
                    case 7:
                        p0.l(f0.DEFINE_FUNCTION, 2, arrayList);
                        gVar2 = s.b(iVar, arrayList);
                        String str3 = gVar2.f2767t;
                        if (str3 == null) {
                            iVar.b0("", gVar2);
                        } else {
                            iVar.b0(str3, gVar2);
                        }
                        return gVar2;
                    case 8:
                        return s.b(iVar, arrayList);
                    case 9:
                        p0.l(f0.IF, 2, arrayList);
                        com.google.android.gms.internal.measurement.n nVar3 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        l lVar3 = (l) iVar.f21016u;
                        l lVar4 = (l) iVar.f21016u;
                        com.google.android.gms.internal.measurement.n nVarM6 = lVar3.m(iVar, nVar3);
                        com.google.android.gms.internal.measurement.n nVarM7 = lVar4.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        com.google.android.gms.internal.measurement.n nVarM8 = arrayList.size() > 2 ? lVar4.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2)) : null;
                        t tVar = com.google.android.gms.internal.measurement.n.f2827a;
                        com.google.android.gms.internal.measurement.n nVarT = nVarM6.e().booleanValue() ? iVar.T((com.google.android.gms.internal.measurement.e) nVarM7) : nVarM8 != null ? iVar.T((com.google.android.gms.internal.measurement.e) nVarM8) : tVar;
                        return nVarT instanceof com.google.android.gms.internal.measurement.h ? nVarT : tVar;
                    case 10:
                        return new com.google.android.gms.internal.measurement.e(arrayList);
                    case 11:
                        if (arrayList.isEmpty()) {
                            return com.google.android.gms.internal.measurement.n.f2830e;
                        }
                        p0.g(f0.RETURN, 1, arrayList);
                        gVar2 = new com.google.android.gms.internal.measurement.h("return", ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)));
                        return gVar2;
                    case 12:
                        p0.g(f0.SWITCH, 3, arrayList);
                        com.google.android.gms.internal.measurement.n nVar4 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        l lVar5 = (l) iVar.f21016u;
                        l lVar6 = (l) iVar.f21016u;
                        com.google.android.gms.internal.measurement.n nVarM9 = lVar5.m(iVar, nVar4);
                        com.google.android.gms.internal.measurement.n nVarM10 = lVar6.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        com.google.android.gms.internal.measurement.n nVarM11 = lVar6.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        if (!(nVarM10 instanceof com.google.android.gms.internal.measurement.e)) {
                            w4.d.j("Malformed SWITCH statement, cases are not a list");
                        } else {
                            if (nVarM11 instanceof com.google.android.gms.internal.measurement.e) {
                                com.google.android.gms.internal.measurement.e eVar = (com.google.android.gms.internal.measurement.e) nVarM10;
                                com.google.android.gms.internal.measurement.e eVar2 = (com.google.android.gms.internal.measurement.e) nVarM11;
                                boolean z10 = false;
                                for (int i2 = 0; i2 < eVar.t(); i2++) {
                                    if (z10 || nVarM9.equals(lVar6.m(iVar, eVar.r(i2)))) {
                                        com.google.android.gms.internal.measurement.n nVarM12 = lVar6.m(iVar, eVar2.r(i2));
                                        if (nVarM12 instanceof com.google.android.gms.internal.measurement.h) {
                                            if (!((com.google.android.gms.internal.measurement.h) nVarM12).f2749u.equals("break")) {
                                                return nVarM12;
                                            }
                                            return com.google.android.gms.internal.measurement.n.f2827a;
                                        }
                                        z10 = true;
                                    }
                                }
                                if (eVar.t() + 1 == eVar2.t()) {
                                    com.google.android.gms.internal.measurement.n nVarM13 = lVar6.m(iVar, eVar2.r(eVar.t()));
                                    if (nVarM13 instanceof com.google.android.gms.internal.measurement.h) {
                                        String str4 = ((com.google.android.gms.internal.measurement.h) nVarM13).f2749u;
                                        if (str4.equals("return") || str4.equals("continue")) {
                                            return nVarM13;
                                        }
                                    }
                                }
                                return com.google.android.gms.internal.measurement.n.f2827a;
                            }
                            w4.d.j("Malformed SWITCH statement, case statements are not a list");
                        }
                        return null;
                    case 13:
                        p0.g(f0.TERNARY, 3, arrayList);
                        com.google.android.gms.internal.measurement.n nVar5 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        l lVar7 = (l) iVar.f21016u;
                        l lVar8 = (l) iVar.f21016u;
                        return lVar7.m(iVar, nVar5).e().booleanValue() ? lVar8.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)) : lVar8.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2));
                    default:
                        sVar.c(str2);
                        throw null;
                }
            case 3:
                int i10 = com.google.android.gms.internal.measurement.z.f2993a[p0.b(str2).ordinal()];
                if (i10 == 1) {
                    p0.g(f0.AND, 2, arrayList);
                    gVar2 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    if (gVar2.e().booleanValue()) {
                        return ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                    }
                } else if (i10 == 2) {
                    p0.g(f0.NOT, 1, arrayList);
                    gVar2 = new com.google.android.gms.internal.measurement.f(Boolean.valueOf(!((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).e().booleanValue()));
                } else {
                    if (i10 != 3) {
                        sVar.c(str2);
                        throw null;
                    }
                    p0.g(f0.OR, 2, arrayList);
                    gVar2 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    if (!gVar2.e().booleanValue()) {
                        return ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                    }
                }
                return gVar2;
            case 4:
                switch (com.google.android.gms.internal.measurement.a0.f2590a[p0.b(str2).ordinal()]) {
                    case 1:
                        p0.g(f0.FOR_IN, 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.p)) {
                            w4.d.j("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strD2 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).d();
                        com.google.android.gms.internal.measurement.n nVarM14 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        com.google.android.gms.internal.measurement.n nVarM15 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        Iterator itC = nVarM14.c();
                        if (itC != null) {
                            while (itC.hasNext()) {
                                iVar.Z(strD2, (com.google.android.gms.internal.measurement.n) itC.next());
                                com.google.android.gms.internal.measurement.n nVarT2 = iVar.T((com.google.android.gms.internal.measurement.e) nVarM15);
                                if (nVarT2 instanceof com.google.android.gms.internal.measurement.h) {
                                    r9 = (com.google.android.gms.internal.measurement.h) nVarT2;
                                    String str5 = r9.f2749u;
                                    if ("break".equals(str5)) {
                                        r9 = com.google.android.gms.internal.measurement.n.f2827a;
                                    } else if ("return".equals(str5)) {
                                    }
                                }
                            }
                            r9 = com.google.android.gms.internal.measurement.n.f2827a;
                        } else {
                            r9 = com.google.android.gms.internal.measurement.n.f2827a;
                        }
                        return r9;
                    case 2:
                        p0.g(f0.FOR_IN_CONST, 3, arrayList);
                        if (arrayList.get(0) instanceof com.google.android.gms.internal.measurement.p) {
                            return s.a(new r((Object) iVar, ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).d()), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).c(), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2)));
                        }
                        w4.d.j("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 3:
                        p0.g(f0.FOR_IN_LET, 3, arrayList);
                        if (!(arrayList.get(0) instanceof com.google.android.gms.internal.measurement.p)) {
                            w4.d.j("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strD3 = ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).d();
                        com.google.android.gms.internal.measurement.n nVarM16 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        com.google.android.gms.internal.measurement.n nVarM17 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        Iterator itC2 = nVarM16.c();
                        if (itC2 != null) {
                            while (itC2.hasNext()) {
                                com.google.android.gms.internal.measurement.n nVar6 = (com.google.android.gms.internal.measurement.n) itC2.next();
                                i iVarX = iVar.X();
                                iVarX.Z(strD3, nVar6);
                                com.google.android.gms.internal.measurement.n nVarT3 = iVarX.T((com.google.android.gms.internal.measurement.e) nVarM17);
                                if (nVarT3 instanceof com.google.android.gms.internal.measurement.h) {
                                    r9 = (com.google.android.gms.internal.measurement.h) nVarT3;
                                    String str6 = r9.f2749u;
                                    if ("break".equals(str6)) {
                                        r9 = com.google.android.gms.internal.measurement.n.f2827a;
                                    } else if ("return".equals(str6)) {
                                    }
                                }
                            }
                            r9 = com.google.android.gms.internal.measurement.n.f2827a;
                        } else {
                            r9 = com.google.android.gms.internal.measurement.n.f2827a;
                        }
                        return r9;
                    case 4:
                        p0.g(f0.FOR_LET, 4, arrayList);
                        com.google.android.gms.internal.measurement.n nVar7 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        l lVar9 = (l) iVar.f21016u;
                        l lVar10 = (l) iVar.f21016u;
                        com.google.android.gms.internal.measurement.n nVarM18 = lVar9.m(iVar, nVar7);
                        if (!(nVarM18 instanceof com.google.android.gms.internal.measurement.e)) {
                            w4.d.j("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        com.google.android.gms.internal.measurement.e eVar3 = (com.google.android.gms.internal.measurement.e) nVarM18;
                        com.google.android.gms.internal.measurement.n nVar8 = (com.google.android.gms.internal.measurement.n) arrayList.get(1);
                        com.google.android.gms.internal.measurement.n nVar9 = (com.google.android.gms.internal.measurement.n) arrayList.get(2);
                        com.google.android.gms.internal.measurement.n nVarM19 = lVar10.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(3));
                        i iVarX2 = iVar.X();
                        for (int i11 = 0; i11 < eVar3.t(); i11++) {
                            String strD4 = eVar3.r(i11).d();
                            iVarX2.b0(strD4, iVar.V(strD4));
                        }
                        while (lVar10.m(iVar, nVar8).e().booleanValue()) {
                            com.google.android.gms.internal.measurement.n nVarT4 = iVar.T((com.google.android.gms.internal.measurement.e) nVarM19);
                            if (nVarT4 instanceof com.google.android.gms.internal.measurement.h) {
                                com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) nVarT4;
                                String str7 = hVar.f2749u;
                                if ("break".equals(str7)) {
                                    return com.google.android.gms.internal.measurement.n.f2827a;
                                }
                                if ("return".equals(str7)) {
                                    return hVar;
                                }
                            }
                            i iVarX3 = iVar.X();
                            for (int i12 = 0; i12 < eVar3.t(); i12++) {
                                String strD5 = eVar3.r(i12).d();
                                iVarX3.b0(strD5, iVarX2.V(strD5));
                            }
                            iVarX3.U(nVar9);
                            iVarX2 = iVarX3;
                        }
                        return com.google.android.gms.internal.measurement.n.f2827a;
                    case 5:
                        p0.g(f0.FOR_OF, 3, arrayList);
                        if (arrayList.get(0) instanceof com.google.android.gms.internal.measurement.p) {
                            return s.e(new k0.o(iVar, 3, ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).d()), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2)));
                        }
                        w4.d.j("Variable name in FOR_OF must be a string");
                        return null;
                    case 6:
                        p0.g(f0.FOR_OF_CONST, 3, arrayList);
                        if (arrayList.get(0) instanceof com.google.android.gms.internal.measurement.p) {
                            return s.e(new r((Object) iVar, ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).d()), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2)));
                        }
                        w4.d.j("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 7:
                        p0.g(f0.FOR_OF_LET, 3, arrayList);
                        if (arrayList.get(0) instanceof com.google.android.gms.internal.measurement.p) {
                            return s.e(new j4(iVar, 3, ((com.google.android.gms.internal.measurement.n) arrayList.get(0)).d()), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)), ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2)));
                        }
                        w4.d.j("Variable name in FOR_OF_LET must be a string");
                        return null;
                    case 8:
                        p0.g(f0.WHILE, 4, arrayList);
                        com.google.android.gms.internal.measurement.n nVar10 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        com.google.android.gms.internal.measurement.n nVar11 = (com.google.android.gms.internal.measurement.n) arrayList.get(1);
                        com.google.android.gms.internal.measurement.n nVar12 = (com.google.android.gms.internal.measurement.n) arrayList.get(2);
                        com.google.android.gms.internal.measurement.n nVar13 = (com.google.android.gms.internal.measurement.n) arrayList.get(3);
                        l lVar11 = (l) iVar.f21016u;
                        l lVar12 = (l) iVar.f21016u;
                        com.google.android.gms.internal.measurement.n nVarM20 = lVar11.m(iVar, nVar13);
                        if (lVar12.m(iVar, nVar12).e().booleanValue()) {
                            com.google.android.gms.internal.measurement.n nVarT5 = iVar.T((com.google.android.gms.internal.measurement.e) nVarM20);
                            if (nVarT5 instanceof com.google.android.gms.internal.measurement.h) {
                                r9 = (com.google.android.gms.internal.measurement.h) nVarT5;
                                String str8 = r9.f2749u;
                                if (!"break".equals(str8)) {
                                    if (!"return".equals(str8)) {
                                    }
                                    return r9;
                                }
                                return com.google.android.gms.internal.measurement.n.f2827a;
                            }
                        }
                        while (lVar12.m(iVar, nVar10).e().booleanValue()) {
                            com.google.android.gms.internal.measurement.n nVarT6 = iVar.T((com.google.android.gms.internal.measurement.e) nVarM20);
                            if (nVarT6 instanceof com.google.android.gms.internal.measurement.h) {
                                r9 = (com.google.android.gms.internal.measurement.h) nVarT6;
                                String str9 = r9.f2749u;
                                if ("break".equals(str9)) {
                                    return com.google.android.gms.internal.measurement.n.f2827a;
                                }
                                if ("return".equals(str9)) {
                                    return r9;
                                }
                            }
                            iVar.U(nVar11);
                        }
                        return com.google.android.gms.internal.measurement.n.f2827a;
                    default:
                        sVar.c(str2);
                        throw null;
                }
            case 5:
                switch (c0.f2632a[p0.b(str2).ordinal()]) {
                    case 1:
                        p0.g(f0.ADD, 2, arrayList);
                        com.google.android.gms.internal.measurement.n nVarM21 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        com.google.android.gms.internal.measurement.n nVarM22 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        gVar = ((nVarM21 instanceof com.google.android.gms.internal.measurement.i) || (nVarM21 instanceof com.google.android.gms.internal.measurement.p) || (nVarM22 instanceof com.google.android.gms.internal.measurement.i) || (nVarM22 instanceof com.google.android.gms.internal.measurement.p)) ? new com.google.android.gms.internal.measurement.p(a5.z.t(nVarM21.d(), nVarM22.d())) : new com.google.android.gms.internal.measurement.g(Double.valueOf(nVarM22.g().doubleValue() + nVarM21.g().doubleValue()));
                        return gVar;
                    case 2:
                        p0.g(f0.DIVIDE, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue() / ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue()));
                        return gVar;
                    case 3:
                        p0.g(f0.MODULUS, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue() % ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue()));
                        return gVar;
                    case 4:
                        p0.g(f0.MULTIPLY, 2, arrayList);
                        gVar = new com.google.android.gms.internal.measurement.g(Double.valueOf(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue() * ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue()));
                        return gVar;
                    case 5:
                        p0.g(f0.NEGATE, 1, arrayList);
                        gVar2 = new com.google.android.gms.internal.measurement.g(Double.valueOf(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue() * (-1.0d)));
                        return gVar2;
                    case 6:
                    case 7:
                        p0.f(2, arrayList, str2);
                        gVar2 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        iVar.U((com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        return gVar2;
                    case 8:
                    case 9:
                        p0.f(1, arrayList, str2);
                        return ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                    case 10:
                        p0.g(f0.SUBTRACT, 2, arrayList);
                        return new com.google.android.gms.internal.measurement.g(Double.valueOf(((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).g().doubleValue() + (((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1)).g().doubleValue() * (-1.0d))));
                    default:
                        sVar.c(str2);
                        throw null;
                }
            case 6:
                if (str2 == null || str2.isEmpty() || !iVar.a0(str2)) {
                    w4.d.j(a5.z.i("Command not found: ", str2));
                } else {
                    com.google.android.gms.internal.measurement.n nVarV = iVar.V(str2);
                    if (nVarV instanceof com.google.android.gms.internal.measurement.j) {
                        return ((com.google.android.gms.internal.measurement.j) nVarV).f(iVar, arrayList);
                    }
                    w4.d.j(t8.c.i("Function ", str2, " is not defined"));
                }
                return null;
            default:
                int i13 = 0;
                switch (d0.f2655a[p0.b(str2).ordinal()]) {
                    case 1:
                        p0.g(f0.ASSIGN, 2, arrayList);
                        com.google.android.gms.internal.measurement.n nVarM23 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        if (nVarM23 instanceof com.google.android.gms.internal.measurement.p) {
                            String str10 = ((com.google.android.gms.internal.measurement.p) nVarM23).f2860t;
                            if (iVar.a0(str10)) {
                                gVar = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                                iVar.b0(str10, gVar);
                                return gVar;
                            }
                            w4.d.j(a5.z.i("Attempting to assign undefined value ", str10));
                        } else {
                            w4.d.j(a5.z.i("Expected string for assign var. got ", nVarM23.getClass().getCanonicalName()));
                        }
                        return null;
                    case 2:
                        p0.l(f0.CONST, 2, arrayList);
                        if (arrayList.size() % 2 == 0) {
                            while (i13 < arrayList.size() - 1) {
                                com.google.android.gms.internal.measurement.n nVarM24 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(i13));
                                if (nVarM24 instanceof com.google.android.gms.internal.measurement.p) {
                                    String str11 = ((com.google.android.gms.internal.measurement.p) nVarM24).f2860t;
                                    iVar.Z(str11, ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(i13 + 1)));
                                    ((HashMap) iVar.f21018w).put(str11, Boolean.TRUE);
                                    i13 += 2;
                                } else {
                                    w4.d.j(a5.z.i("Expected string for const name. got ", nVarM24.getClass().getCanonicalName()));
                                }
                            }
                            return com.google.android.gms.internal.measurement.n.f2827a;
                        }
                        w4.d.j(c1.i("CONST requires an even number of arguments, found ", arrayList.size()));
                        return null;
                    case 3:
                        if (arrayList.isEmpty()) {
                            return new com.google.android.gms.internal.measurement.e();
                        }
                        gVar2 = new com.google.android.gms.internal.measurement.e();
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            com.google.android.gms.internal.measurement.n nVarM25 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) obj);
                            if (nVarM25 instanceof com.google.android.gms.internal.measurement.h) {
                                w4.d.l("Failed to evaluate array element");
                                return null;
                            }
                            gVar2.w(i13, nVarM25);
                            i13++;
                        }
                        return gVar2;
                    case 4:
                        if (arrayList.isEmpty()) {
                            return new com.google.android.gms.internal.measurement.m();
                        }
                        if (arrayList.size() % 2 == 0) {
                            gVar2 = new com.google.android.gms.internal.measurement.m();
                            while (i13 < arrayList.size() - 1) {
                                com.google.android.gms.internal.measurement.n nVarM26 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(i13));
                                com.google.android.gms.internal.measurement.n nVarM27 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(i13 + 1));
                                if ((nVarM26 instanceof com.google.android.gms.internal.measurement.h) || (nVarM27 instanceof com.google.android.gms.internal.measurement.h)) {
                                    w4.d.l("Failed to evaluate map entry");
                                } else {
                                    gVar2.j(nVarM26.d(), nVarM27);
                                    i13 += 2;
                                }
                            }
                            return gVar2;
                        }
                        w4.d.j(c1.i("CREATE_OBJECT requires an even number of arguments, found ", arrayList.size()));
                        return null;
                    case 5:
                        p0.l(f0.EXPRESSION_LIST, 1, arrayList);
                        gVar2 = com.google.android.gms.internal.measurement.n.f2827a;
                        while (i13 < arrayList.size()) {
                            com.google.android.gms.internal.measurement.n nVarM28 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(i13));
                            if (nVarM28 instanceof com.google.android.gms.internal.measurement.h) {
                                w4.d.l("ControlValue cannot be in an expression list");
                                return null;
                            }
                            i13++;
                            gVar2 = nVarM28;
                        }
                        return gVar2;
                    case 6:
                        p0.g(f0.GET, 1, arrayList);
                        com.google.android.gms.internal.measurement.n nVarM29 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        if (nVarM29 instanceof com.google.android.gms.internal.measurement.p) {
                            return iVar.V(((com.google.android.gms.internal.measurement.p) nVarM29).f2860t);
                        }
                        w4.d.j(a5.z.i("Expected string for get var. got ", nVarM29.getClass().getCanonicalName()));
                        return null;
                    case 7:
                    case 8:
                        p0.g(f0.GET_PROPERTY, 2, arrayList);
                        com.google.android.gms.internal.measurement.n nVarM30 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        com.google.android.gms.internal.measurement.n nVarM31 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        if ((nVarM30 instanceof com.google.android.gms.internal.measurement.e) && p0.m(nVarM31)) {
                            return ((com.google.android.gms.internal.measurement.e) nVarM30).r(nVarM31.g().intValue());
                        }
                        if (nVarM30 instanceof com.google.android.gms.internal.measurement.i) {
                            return ((com.google.android.gms.internal.measurement.i) nVarM30).a(nVarM31.d());
                        }
                        if (nVarM30 instanceof com.google.android.gms.internal.measurement.p) {
                            if ("length".equals(nVarM31.d())) {
                                return new com.google.android.gms.internal.measurement.g(Double.valueOf(((com.google.android.gms.internal.measurement.p) nVarM30).f2860t.length()));
                            }
                            if (p0.m(nVarM31)) {
                                double dDoubleValue = nVarM31.g().doubleValue();
                                String str12 = ((com.google.android.gms.internal.measurement.p) nVarM30).f2860t;
                                if (dDoubleValue < str12.length()) {
                                    gVar = new com.google.android.gms.internal.measurement.p(String.valueOf(str12.charAt(nVarM31.g().intValue())));
                                    return gVar;
                                }
                            }
                        }
                        return com.google.android.gms.internal.measurement.n.f2827a;
                    case 9:
                        p0.g(f0.NULL, 0, arrayList);
                        return com.google.android.gms.internal.measurement.n.b;
                    case 10:
                        p0.g(f0.SET_PROPERTY, 3, arrayList);
                        com.google.android.gms.internal.measurement.n nVar14 = (com.google.android.gms.internal.measurement.n) arrayList.get(0);
                        l lVar13 = (l) iVar.f21016u;
                        l lVar14 = (l) iVar.f21016u;
                        com.google.android.gms.internal.measurement.n nVarM32 = lVar13.m(iVar, nVar14);
                        com.google.android.gms.internal.measurement.n nVarM33 = lVar14.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
                        com.google.android.gms.internal.measurement.n nVarM34 = lVar14.m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(2));
                        if (nVarM32 == com.google.android.gms.internal.measurement.n.f2827a || nVarM32 == com.google.android.gms.internal.measurement.n.b) {
                            w4.d.l(a5.z.j("Can't set property ", nVarM33.d(), " of ", nVarM32.d()));
                            return null;
                        }
                        if ((nVarM32 instanceof com.google.android.gms.internal.measurement.e) && (nVarM33 instanceof com.google.android.gms.internal.measurement.g)) {
                            ((com.google.android.gms.internal.measurement.e) nVarM32).w(((com.google.android.gms.internal.measurement.g) nVarM33).f2733t.intValue(), nVarM34);
                            return nVarM34;
                        }
                        if (!(nVarM32 instanceof com.google.android.gms.internal.measurement.i)) {
                            return nVarM34;
                        }
                        ((com.google.android.gms.internal.measurement.i) nVarM32).j(nVarM33.d(), nVarM34);
                        return nVarM34;
                    case 11:
                        p0.g(f0.TYPEOF, 1, arrayList);
                        com.google.android.gms.internal.measurement.n nVarM35 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
                        if (nVarM35 instanceof t) {
                            str = "undefined";
                        } else if (nVarM35 instanceof com.google.android.gms.internal.measurement.f) {
                            str = "boolean";
                        } else if (nVarM35 instanceof com.google.android.gms.internal.measurement.g) {
                            str = "number";
                        } else if (nVarM35 instanceof com.google.android.gms.internal.measurement.p) {
                            str = "string";
                        } else if (nVarM35 instanceof com.google.android.gms.internal.measurement.o) {
                            str = "function";
                        } else {
                            if ((nVarM35 instanceof com.google.android.gms.internal.measurement.q) || (nVarM35 instanceof com.google.android.gms.internal.measurement.h)) {
                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", nVarM35));
                            }
                            str = "object";
                        }
                        gVar2 = new com.google.android.gms.internal.measurement.p(str);
                        return gVar2;
                    case 12:
                        p0.g(f0.UNDEFINED, 0, arrayList);
                        return com.google.android.gms.internal.measurement.n.f2827a;
                    case 13:
                        p0.l(f0.VAR, 1, arrayList);
                        int size2 = arrayList.size();
                        while (i13 < size2) {
                            Object obj2 = arrayList.get(i13);
                            i13++;
                            com.google.android.gms.internal.measurement.n nVarM36 = ((l) iVar.f21016u).m(iVar, (com.google.android.gms.internal.measurement.n) obj2);
                            if (!(nVarM36 instanceof com.google.android.gms.internal.measurement.p)) {
                                w4.d.j(a5.z.i("Expected string for var name. got ", nVarM36.getClass().getCanonicalName()));
                                return null;
                            }
                            iVar.Z(((com.google.android.gms.internal.measurement.p) nVarM36).f2860t, com.google.android.gms.internal.measurement.n.f2827a);
                        }
                        return com.google.android.gms.internal.measurement.n.f2827a;
                    default:
                        sVar.c(str2);
                        throw null;
                }
        }
    }

    @Override // h8.g
    public h8.b n(h8.a aVar) {
        h8.d dVar = (h8.d) ((h8.e) this.f21023v).c(aVar);
        if (dVar != null) {
            return new h8.b(dVar.f7736a, dVar.b);
        }
        return null;
    }

    @Override // h8.g
    public void o(int i2) {
        int i10;
        if (i2 >= 40) {
            ((h8.e) this.f21023v).h(-1);
            return;
        }
        if (10 > i2 || i2 >= 20) {
            return;
        }
        h8.e eVar = (h8.e) this.f21023v;
        synchronized (eVar.f19202c) {
            i10 = eVar.f19203d;
        }
        eVar.h(i10 / 2);
    }

    public void p(s sVar) {
        ArrayList arrayList = sVar.f2894a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((HashMap) this.f21022u).put(((f0) obj).toString(), sVar);
        }
    }

    public String toString() {
        switch (this.f21021t) {
            case 15:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f21023v.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f21022u;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb2.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(Object obj, int i2, Object obj2) {
        this.f21021t = i2;
        this.f21023v = obj;
        this.f21022u = obj2;
    }

    public /* synthetic */ l(Object obj, Object obj2, boolean z10, int i2) {
        this.f21021t = i2;
        this.f21022u = obj;
        this.f21023v = obj2;
    }

    public /* synthetic */ l(Object obj) {
        this.f21021t = 15;
        this.f21023v = obj;
        this.f21022u = new ArrayList();
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f21021t = 0;
        this.f21022u = workDatabase_Impl;
        this.f21023v = new b(workDatabase_Impl, 3);
    }

    public l(e0 e0Var, i0 i0Var) {
        this.f21021t = 4;
        this.f21022u = e0Var;
        this.f21023v = v0.d.Q(i0Var, v0.p0.f21675y);
    }

    public l(wd.a aVar) {
        this.f21021t = 16;
        this.f21022u = aVar;
        ArrayList arrayList = new ArrayList();
        this.f21023v = arrayList;
        arrayList.add(new wd.b(aVar, new int[]{1}));
    }

    public l(int i2, a1.n nVar) {
        this.f21021t = 5;
        this.f21022u = nVar;
        this.f21023v = new h8.e(i2, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i2) {
        this(new mc.c(10), new long[10], false, 12);
        this.f21021t = i2;
        switch (i2) {
            case 13:
                this.f21022u = new b0(25);
                this.f21023v = new qg.c(16);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(e eVar) {
        this(12);
        this.f21021t = 12;
        j(this, eVar);
    }

    public /* synthetic */ l(int i2, boolean z10) {
        this.f21021t = i2;
    }

    public l(int i2, int i10) {
        this.f21021t = 8;
        this.f21022u = new int[]{i2, i10};
        this.f21023v = new float[]{0.0f, 1.0f};
    }

    public l(int i2, int i10, int i11) {
        this.f21021t = 8;
        this.f21022u = new int[]{i2, i10, i11};
        this.f21023v = new float[]{0.0f, 0.5f, 1.0f};
    }
}
