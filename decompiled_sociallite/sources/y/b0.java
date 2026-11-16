package y;

import b0.h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f23361a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:23:0x0068->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0080 A[EDGE_INSN: B:54:0x0080->B:29:0x0080 BREAK  A[LOOP:0: B:23:0x0068->B:27:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:22:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(a2.l0 r12, long r13, ze.c r15) {
        /*
            boolean r0 = r15 instanceof y.t
            if (r0 == 0) goto L13
            r0 = r15
            y.t r0 = (y.t) r0
            int r1 = r0.f23510w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23510w = r1
            goto L18
        L13:
            y.t r0 = new y.t
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f23509v
            int r1 = r0.f23510w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            kotlin.jvm.internal.v r12 = r0.f23508u
            a2.l0 r13 = r0.f23507t
            se.a.f(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5e
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            w4.d.l(r12)
            r12 = 0
            return r12
        L34:
            se.a.f(r15)
            a2.o0 r15 = r12.f129x
            a2.j r15 = r15.K
            boolean r15 = h(r15, r13)
            if (r15 == 0) goto L43
            goto Lc3
        L43:
            kotlin.jvm.internal.v r15 = new kotlin.jvm.internal.v
            r15.<init>()
            r15.f9987t = r13
        L4a:
            r0.f23507t = r12
            r0.f23508u = r15
            r0.f23510w = r2
            a2.k r13 = a2.k.f119u
            java.lang.Object r13 = r12.d(r13, r0)
            ye.a r14 = ye.a.f23667t
            if (r13 != r14) goto L5b
            return r14
        L5b:
            r11 = r15
            r15 = r13
            r13 = r11
        L5e:
            a2.j r15 = (a2.j) r15
            java.lang.Object r14 = r15.f111a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L68:
            if (r5 >= r1) goto L7f
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            a2.v r7 = (a2.v) r7
            long r7 = r7.f144a
            long r9 = r13.f9987t
            boolean r7 = a2.u.a(r7, r9)
            if (r7 == 0) goto L7c
            goto L80
        L7c:
            int r5 = r5 + 1
            goto L68
        L7f:
            r6 = r3
        L80:
            a2.v r6 = (a2.v) r6
            if (r6 != 0) goto L86
            r6 = r3
            goto Lba
        L86:
            boolean r14 = a2.t.c(r6)
            if (r14 == 0) goto Lae
            java.lang.Object r14 = r15.f111a
            int r15 = r14.size()
        L92:
            if (r4 >= r15) goto La3
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            a2.v r5 = (a2.v) r5
            boolean r5 = r5.f146d
            if (r5 == 0) goto La0
            goto La4
        La0:
            int r4 = r4 + 1
            goto L92
        La3:
            r1 = r3
        La4:
            a2.v r1 = (a2.v) r1
            if (r1 != 0) goto La9
            goto Lba
        La9:
            long r14 = r1.f144a
            r13.f9987t = r14
            goto Lc4
        Lae:
            long r14 = a2.t.g(r6, r2)
            r4 = 0
            boolean r14 = n1.c.d(r14, r4)
            if (r14 != 0) goto Lc4
        Lba:
            if (r6 == 0) goto Lc3
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc3
            return r6
        Lc3:
            return r3
        Lc4:
            r15 = r13
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b0.a(a2.l0, long, ze.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[LOOP:0: B:26:0x00ac->B:30:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0 A[EDGE_INSN: B:69:0x00d0->B:32:0x00d0 BREAK  A[LOOP:0: B:26:0x00ac->B:30:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0148 -> B:63:0x014e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(a2.l0 r18, long r19, ge.c7 r21, ze.a r22) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b0.b(a2.l0, long, ge.c7, ze.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    public static final Object c(a2.l0 l0Var, long j10, ze.c cVar) {
        v vVar;
        Object obj;
        a2.v vVar2;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i2 = vVar.f23533w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.f23533w = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(cVar);
            }
        } else {
            vVar = new v(cVar);
        }
        Object obj2 = vVar.f23532v;
        int i10 = vVar.f23533w;
        if (i10 == 0) {
            se.a.f(obj2);
            if (!h(l0Var.f129x.K, j10)) {
                ?? r11 = l0Var.f129x.K.f111a;
                int size = r11.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj = null;
                        break;
                    }
                    obj = r11.get(i11);
                    if (a2.u.a(((a2.v) obj).f144a, j10)) {
                        break;
                    }
                    i11++;
                }
                vVar2 = (a2.v) obj;
                if (vVar2 != null) {
                    kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                    kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                    wVar3.f9988t = vVar2;
                    long jB = l0Var.g().b();
                    try {
                        hf.e wVar4 = new w(wVar3, wVar2, null);
                        vVar.f23530t = vVar2;
                        vVar.f23531u = wVar2;
                        vVar.f23533w = 1;
                        Object objH = l0Var.h(jB, wVar4, vVar);
                        Object obj3 = ye.a.f23667t;
                        if (objH == obj3) {
                            return obj3;
                        }
                    } catch (a2.l unused) {
                        wVar = wVar2;
                    }
                }
            }
            return null;
        }
        if (i10 != 1) {
            w4.d.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wVar = vVar.f23531u;
        vVar2 = vVar.f23530t;
        try {
            se.a.f(obj2);
            return null;
        } catch (a2.l unused2) {
        }
        a2.v vVar3 = (a2.v) wVar.f9988t;
        return vVar3 == null ? vVar2 : vVar3;
    }

    public static final Object d(a2.o0 o0Var, hf.c cVar, hf.a aVar, hf.a aVar2, hf.e eVar, ze.i iVar) {
        Object objD = rg.d.d(o0Var, new y(x.f23546v, null, new h2(cVar, 26), eVar, aVar2, new m0.m0(aVar, 5), null), iVar);
        se.a0 a0Var = se.a0.f19710a;
        ye.a aVar3 = ye.a.f23667t;
        if (objD != aVar3) {
            objD = a0Var;
        }
        return objD == aVar3 ? objD : a0Var;
    }

    public static /* synthetic */ Object e(a2.o0 o0Var, fe.c0 c0Var, hf.a aVar, hf.e eVar, ze.i iVar, int i2) {
        hf.c cVar = c0Var;
        if ((i2 & 1) != 0) {
            cVar = e.f23383v;
        }
        return d(o0Var, cVar, aVar, x.f23545u, eVar, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(a2.l0 r4, long r5, hf.c r7, ze.a r8) {
        /*
            boolean r0 = r8 instanceof y.z
            if (r0 == 0) goto L13
            r0 = r8
            y.z r0 = (y.z) r0
            int r1 = r0.f23574w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23574w = r1
            goto L18
        L13:
            y.z r0 = new y.z
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23573v
            int r1 = r0.f23574w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            hf.c r4 = r0.f23572u
            a2.l0 r5 = r0.f23571t
            se.a.f(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            w4.d.l(r4)
            r4 = 0
            return r4
        L32:
            se.a.f(r8)
        L35:
            r0.f23571t = r4
            r0.f23572u = r7
            r0.f23574w = r2
            java.lang.Object r8 = a(r4, r5, r0)
            ye.a r5 = ye.a.f23667t
            if (r8 != r5) goto L44
            return r5
        L44:
            a2.v r8 = (a2.v) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = a2.t.c(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f144a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b0.f(a2.l0, long, hf.c, ze.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a A[LOOP:0: B:24:0x0086->B:28:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x009e A[EDGE_INSN: B:71:0x009e->B:30:0x009e BREAK  A[LOOP:0: B:24:0x0086->B:28:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(a2.l0 r17, long r18, me.x3 r20, ze.a r21) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b0.g(a2.l0, long, me.x3, ze.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean h(a2.j jVar, long j10) {
        Object obj;
        ?? r9 = jVar.f111a;
        int size = r9.size();
        boolean z10 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = r9.get(i2);
            if (a2.u.a(((a2.v) obj).f144a, j10)) {
                break;
            }
            i2++;
        }
        a2.v vVar = (a2.v) obj;
        if (vVar != null && vVar.f146d) {
            z10 = true;
        }
        return true ^ z10;
    }
}
