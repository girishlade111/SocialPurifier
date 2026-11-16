package com.appstack.attribution.internal.network;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2501d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.a f2502a;
    public volatile g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag.d f2503c;

    public static final class a extends kotlin.jvm.internal.m implements hf.a {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f2504t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f2505u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.f2504t = str;
            this.f2505u = str2;
        }

        @Override // hf.a
        public final Object invoke() {
            return new RetrofitClient(this.f2504t, this.f2505u);
        }
    }

    static {
        new b(null);
    }

    public c(String str, String str2, hf.a aVar) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.f2502a = aVar;
        this.f2503c = new ag.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (((com.appstack.attribution.internal.network.g) r7).a(r6, r0) == r4) goto L21;
     */
    @Override // com.appstack.attribution.internal.network.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.appstack.attribution.internal.model.EventServerLogRequest r6, ze.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appstack.attribution.internal.network.f
            if (r0 == 0) goto L13
            r0 = r7
            com.appstack.attribution.internal.network.f r0 = (com.appstack.attribution.internal.network.f) r0
            int r1 = r0.f2517w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2517w = r1
            goto L18
        L13:
            com.appstack.attribution.internal.network.f r0 = new com.appstack.attribution.internal.network.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2515u
            int r1 = r0.f2517w
            r2 = 2
            r3 = 1
            ye.a r4 = ye.a.f23667t
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            se.a.f(r7)
            goto L53
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            w4.d.l(r6)
            r6 = 0
            return r6
        L31:
            com.appstack.attribution.internal.model.EventServerLogRequest r6 = r0.f2514t
            se.a.f(r7)
            goto L45
        L37:
            se.a.f(r7)
            r0.f2514t = r6
            r0.f2517w = r3
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r4) goto L45
            goto L52
        L45:
            com.appstack.attribution.internal.network.g r7 = (com.appstack.attribution.internal.network.g) r7
            r1 = 0
            r0.f2514t = r1
            r0.f2517w = r2
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r4) goto L53
        L52:
            return r4
        L53:
            se.a0 r6 = se.a0.f19710a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appstack.attribution.internal.network.c.a(com.appstack.attribution.internal.model.EventServerLogRequest, ze.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.appstack.attribution.internal.network.g
    public final Object b(ze.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.f2508v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f2508v = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objC = dVar.f2506t;
        int i10 = dVar.f2508v;
        Object obj = ye.a.f23667t;
        if (i10 == 0) {
            se.a.f(objC);
            dVar.f2508v = 1;
            objC = c(dVar);
            if (objC != obj) {
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                se.a.f(objC);
                return objC;
            }
            w4.d.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        se.a.f(objC);
        dVar.f2508v = 2;
        Object objB = ((g) objC).b(dVar);
        return objB == obj ? obj : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(ze.c cVar) {
        e eVar;
        c cVar2;
        ag.d dVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.f2513x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f2513x = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f2511v;
        ye.a aVar = ye.a.f23667t;
        int i10 = eVar.f2513x;
        if (i10 == 0) {
            se.a.f(obj);
            g gVar = this.b;
            if (gVar != null) {
                return gVar;
            }
            ag.d dVar2 = this.f2503c;
            eVar.f2509t = this;
            eVar.f2510u = dVar2;
            eVar.f2513x = 1;
            if (dVar2.a(eVar) == aVar) {
                return aVar;
            }
            cVar2 = this;
            dVar = dVar2;
        } else {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = eVar.f2510u;
            cVar2 = eVar.f2509t;
            se.a.f(obj);
        }
        try {
            g gVar2 = cVar2.b;
            if (gVar2 == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                g gVar3 = (g) cVar2.f2502a.invoke();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                p8.m.f16755a.getClass();
                p8.m.a("LazyNetworkClient", "Network client initialized lazily in " + jCurrentTimeMillis2 + "ms");
                cVar2.b = gVar3;
                gVar2 = gVar3;
            }
            return gVar2;
        } finally {
            dVar.e(null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ c(String str, String str2, hf.a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? new a(str, str2) : aVar);
    }
}
