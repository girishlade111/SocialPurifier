package u6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me.dq;
import me.kk;
import me.lt;
import p2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f20925k = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f20926a;
    public final HashMap b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3.m f20928d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f20930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c8.c f20931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f20932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f20933i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hf.a f20934j = new kk(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f20929e = new LinkedHashMap();

    public g0(q qVar, HashMap map, HashMap map2, String[] strArr, boolean z10, e3.m mVar) {
        String lowerCase;
        this.f20926a = qVar;
        this.b = map;
        this.f20927c = z10;
        this.f20928d = mVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f20929e.put(lowerCase2, Integer.valueOf(i2));
            String str2 = (String) this.b.get(strArr[i2]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
        }
        this.f20930f = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f20929e.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.f20929e;
                linkedHashMap.put(lowerCase4, te.x.I(lowerCase3, linkedHashMap));
            }
        }
        this.f20931g = new c8.c(this.f20930f.length, 8);
        this.f20932h = new h0(this.f20930f.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(g0 g0Var, k kVar, ze.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i2 = zVar.f20997w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.f20997w = i2 - Integer.MIN_VALUE;
            } else {
                zVar = new z(g0Var, cVar);
            }
        } else {
            zVar = new z(g0Var, cVar);
        }
        Object objD = zVar.f20995u;
        int i10 = zVar.f20997w;
        ye.a aVar = ye.a.f23667t;
        if (i10 == 0) {
            se.a.f(objD);
            dq dqVar = new dq(17);
            zVar.f20994t = kVar;
            zVar.f20997w = 1;
            objD = kVar.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", dqVar, zVar);
            if (objD != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) zVar.f20994t;
            se.a.f(objD);
            return set;
        }
        kVar = (k) zVar.f20994t;
        se.a.f(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            zVar.f20994t = set2;
            zVar.f20997w = 2;
            if (l.b(kVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", zVar) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(g0 g0Var, ze.c cVar) throws Throwable {
        a0 a0Var;
        u7.c cVar2;
        Object objV;
        Throwable th;
        u7.c cVar3;
        Object value;
        int[] iArr;
        q qVar = g0Var.f20926a;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i2 = a0Var.f20885x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.f20885x = i2 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(g0Var, cVar);
            }
        } else {
            a0Var = new a0(g0Var, cVar);
        }
        Object obj = a0Var.f20883v;
        int i10 = a0Var.f20885x;
        if (i10 == 0) {
            se.a.f(obj);
            cVar2 = qVar.f20967g;
            boolean zF = cVar2.f();
            te.u uVar = te.u.f20251t;
            if (!zF) {
                return uVar;
            }
            try {
                if (!g0Var.f20933i.compareAndSet(true, false)) {
                    cVar2.s();
                    return uVar;
                }
                if (!((Boolean) g0Var.f20934j.invoke()).booleanValue()) {
                    cVar2.s();
                    return uVar;
                }
                b0 b0Var = new b0(g0Var, null, 1);
                a0Var.f20881t = g0Var;
                a0Var.f20882u = cVar2;
                a0Var.f20885x = 1;
                objV = qVar.v(false, b0Var, a0Var);
                ye.a aVar = ye.a.f23667t;
                if (objV == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                u7.c cVar4 = cVar2;
                th = th2;
                cVar3 = cVar4;
                cVar3.s();
                throw th;
            }
        } else {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar3 = a0Var.f20882u;
            g0 g0Var2 = a0Var.f20881t;
            try {
                se.a.f(obj);
                cVar2 = cVar3;
                g0Var = g0Var2;
                objV = obj;
            } catch (Throwable th3) {
                th = th3;
                cVar3.s();
                throw th;
            }
        }
        Set set = (Set) objV;
        if (!set.isEmpty()) {
            h0 h0Var = g0Var.f20932h;
            h0Var.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                vf.d0 d0Var = (vf.d0) h0Var.f16564u;
                do {
                    value = d0Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr[i11] = set.contains(Integer.valueOf(i11)) ? iArr2[i11] + 1 : iArr2[i11];
                    }
                } while (!d0Var.i(value, iArr));
            }
            g0Var.f20928d.invoke(set);
        }
        cVar2.s();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (u6.l.b(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (u6.l.b(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00de -> B:28:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(u6.g0 r17, u6.y r18, int r19, ze.c r20) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g0.c(u6.g0, u6.y, int, ze.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(u6.g0 r7, u6.y r8, int r9, ze.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof u6.d0
            if (r0 == 0) goto L16
            r0 = r10
            u6.d0 r0 = (u6.d0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.A = r1
            goto L1b
        L16:
            u6.d0 r0 = new u6.d0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f20904y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.f20903x
            int r8 = r0.f20902w
            java.lang.String[] r9 = r0.f20901v
            java.lang.String r1 = r0.f20900u
            u6.k r3 = r0.f20899t
            se.a.f(r10)
            r10 = r9
            r9 = r3
            goto L84
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            w4.d.l(r7)
            r7 = 0
            return r7
        L3b:
            se.a.f(r10)
            java.lang.String[] r7 = r7.f20930f
            r7 = r7[r9]
            java.lang.String[] r9 = u6.g0.f20925k
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L86
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = e4.w0.m(r5, r4, r3)
            r0.f20899t = r9
            r0.f20900u = r1
            r0.f20901v = r10
            r0.f20902w = r8
            r0.f20903x = r7
            r0.A = r2
            java.lang.Object r3 = u6.l.b(r9, r3, r0)
            ye.a r4 = ye.a.f23667t
            if (r3 != r4) goto L84
            return r4
        L84:
            int r8 = r8 + r2
            goto L4d
        L86:
            se.a0 r7 = se.a0.f19710a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g0.d(u6.g0, u6.y, int, ze.c):java.lang.Object");
    }

    public final void e(hf.a aVar, hf.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (this.f20933i.compareAndSet(false, true)) {
            aVar.invoke();
            xf.e eVar = this.f20926a.f20962a;
            xe.d dVar = null;
            if (eVar != null) {
                sf.y.v(eVar, new sf.v(), new lt(this, aVar2, dVar, 7), 2);
            } else {
                kotlin.jvm.internal.l.e("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ze.c cVar) {
        e0 e0Var;
        u7.c cVar2;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i2 = e0Var.f20910w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.f20910w = i2 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.f20908u;
        int i10 = e0Var.f20910w;
        if (i10 == 0) {
            se.a.f(obj);
            q qVar = this.f20926a;
            u7.c cVar3 = qVar.f20967g;
            if (cVar3.f()) {
                try {
                    b0 b0Var = new b0(this, null, 2);
                    e0Var.f20907t = cVar3;
                    e0Var.f20910w = 1;
                    Object objV = qVar.v(false, b0Var, e0Var);
                    ye.a aVar = ye.a.f23667t;
                    if (objV == aVar) {
                        return aVar;
                    }
                    cVar2 = cVar3;
                    cVar2.s();
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar3;
                    cVar2.s();
                    throw th;
                }
            }
        } else {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar2 = e0Var.f20907t;
            try {
                se.a.f(obj);
                cVar2.s();
            } catch (Throwable th2) {
                th = th2;
                cVar2.s();
                throw th;
            }
        }
        return se.a0.f19710a;
    }
}
