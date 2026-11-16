package je;

import android.content.Context;
import android.util.Log;
import ge.hc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import se.a0;
import sf.h0;
import sf.r1;
import sf.y;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8808a;
    public final i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xf.e f8809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag.d f8810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f8811e;

    public w(Context context, i iVar, b bVar) {
        iVar.getClass();
        this.f8808a = context;
        this.b = iVar;
        zf.d dVar = h0.b;
        r1 r1VarE = y.e();
        dVar.getClass();
        this.f8809c = y.b(db.h.A(dVar, r1VarE));
        this.f8810d = new ag.d();
    }

    public final void a(f fVar) {
        y.v(this.f8809c, null, new s(this, fVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:14:0x0031, B:21:0x0041, B:48:0x00c8, B:50:0x00ce, B:53:0x00eb, B:22:0x0046, B:37:0x0087, B:40:0x0091, B:41:0x009c, B:43:0x00a2, B:45:0x00b1, B:46:0x00b9, B:47:0x00bf, B:34:0x0075), top: B:62:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:48:0x00c8->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ze.c cVar) throws Throwable {
        t tVar;
        Iterator it;
        Object objY;
        String str;
        List list;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i2 = tVar.f8796w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.f8796w = i2 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objY2 = tVar.f8794u;
        int i10 = tVar.f8796w;
        Object obj = ye.a.f23667t;
        i iVar = this.b;
        Object obj2 = a0.f19710a;
        try {
            if (i10 == 0) {
                se.a.f(objY2);
                if (ge.c.h(ge.c.D0(this.f8808a), ge.b.f5909u)) {
                    tVar.f8796w = 2;
                    objY2 = db.h.y(iVar.f8764a, true, false, new hc(3), tVar);
                    if (objY2 == obj) {
                    }
                } else {
                    tVar.f8796w = 1;
                    Object objY3 = db.h.y(iVar.f8764a, false, true, new hc(1), tVar);
                    if (objY3 != obj) {
                        objY3 = obj2;
                    }
                    if (objY3 != obj) {
                        return obj2;
                    }
                }
                return obj;
            }
            if (i10 == 1) {
                se.a.f(objY2);
                return obj2;
            }
            if (i10 == 2) {
                se.a.f(objY2);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        se.a.f(objY2);
                        return obj2;
                    }
                    w4.d.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = tVar.f8793t;
                se.a.f(objY2);
            }
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                str = (String) entry.getKey();
                list = (List) entry.getValue();
                tVar.f8793t = it;
                tVar.f8796w = 3;
                if (d(str, list, tVar) == obj) {
                    return obj;
                }
            }
            tVar.f8793t = null;
            tVar.f8796w = 4;
            objY = db.h.y(iVar.f8764a, false, true, new hc(2), tVar);
            if (objY != obj) {
                objY = obj2;
            }
            if (objY == obj) {
                return obj;
            }
            return obj2;
            List list2 = (List) objY2;
            if (!list2.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list2) {
                    String str2 = ((j) obj3).f8768e;
                    Object arrayList = linkedHashMap.get(str2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(str2, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                }
                it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    str = (String) entry2.getKey();
                    list = (List) entry2.getValue();
                    tVar.f8793t = it;
                    tVar.f8796w = 3;
                    if (d(str, list, tVar) == obj) {
                        return obj;
                    }
                }
                tVar.f8793t = null;
                tVar.f8796w = 4;
                objY = db.h.y(iVar.f8764a, false, true, new hc(2), tVar);
                if (objY != obj) {
                    objY = obj2;
                }
                if (objY == obj) {
                    return obj;
                }
            }
            return obj2;
        } catch (Exception e10) {
            Log.w("SyncDispatcher", "Flush failed (will retry on next trigger)", e10);
            return obj2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(f fVar, ze.c cVar) throws Throwable {
        u uVar;
        ag.a aVar;
        int i2;
        Throwable th;
        ag.a aVar2;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.f8801x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f8801x = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.f8799v;
        Object obj2 = ye.a.f23667t;
        int i11 = uVar.f8801x;
        try {
            if (i11 == 0) {
                se.a.f(obj);
                aVar = this.f8810d;
                uVar.f8797t = aVar;
                i2 = 0;
                uVar.f8798u = 0;
                uVar.f8801x = 1;
                if (aVar.a(uVar) != obj2) {
                }
                return obj2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    w4.d.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = uVar.f8797t;
                try {
                    se.a.f(obj);
                    aVar2.e(null);
                    return a0.f19710a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.e(null);
                    throw th;
                }
            }
            i2 = uVar.f8798u;
            ag.a aVar3 = uVar.f8797t;
            se.a.f(obj);
            aVar = aVar3;
            this.f8811e = System.currentTimeMillis();
            uVar.f8797t = aVar;
            uVar.f8798u = i2;
            uVar.f8801x = 2;
            if (b(uVar) != obj2) {
                aVar2 = aVar;
                aVar2.e(null);
                return a0.f19710a;
            }
            return obj2;
        } catch (Throwable th3) {
            ag.a aVar4 = aVar;
            th = th3;
            aVar2 = aVar4;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0306 A[LOOP:1: B:114:0x0300->B:116:0x0306, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0316  */
    /* JADX WARN: Code duplicated, block: B:121:0x0324  */
    /* JADX WARN: Code duplicated, block: B:123:0x033f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0348  */
    /* JADX WARN: Code duplicated, block: B:130:0x036b  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0398 A[LOOP:0: B:137:0x0392->B:139:0x0398, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:146:0x03db  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x041a  */
    /* JADX WARN: Code duplicated, block: B:153:0x041e  */
    /* JADX WARN: Code duplicated, block: B:156:0x042f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0449  */
    /* JADX WARN: Code duplicated, block: B:160:0x044f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0460  */
    /* JADX WARN: Code duplicated, block: B:165:0x0477  */
    /* JADX WARN: Code duplicated, block: B:167:0x047b  */
    /* JADX WARN: Code duplicated, block: B:169:0x049a  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036d, code lost:
    
        if (r1 == r4) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b2, code lost:
    
        if (r12.a(r1, r2) == r4) goto L162;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x047b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r22, java.util.List r23, ze.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je.w.d(java.lang.String, java.util.List, ze.c):java.lang.Object");
    }
}
