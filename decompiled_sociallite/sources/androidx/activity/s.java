package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements hf.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0 f878u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(b0 b0Var, int i2) {
        super(1);
        this.f877t = i2;
        this.f878u = b0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 java.lang.Object, still in use, count: 2, list:
          (r0v9 java.lang.Object) from 0x002d: PHI (r0 I:??) = (r0v6 java.lang.Object), (r0v9 java.lang.Object) binds: [B:12:0x002c, B:26:0x002d] A[DONT_GENERATE, DONT_INLINE]
          (r0v9 java.lang.Object) from 0x0025: CHECK_CAST (androidx.activity.r) (r0v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // hf.c
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f877t
            switch(r0) {
                case 0: goto L32;
                default: goto L5;
            }
        L5:
            androidx.activity.b r4 = (androidx.activity.b) r4
            r4.getClass()
            androidx.activity.b0 r4 = r3.f878u
            androidx.activity.r r0 = r4.f845c
            if (r0 != 0) goto L2f
            te.i r4 = r4.b
            int r0 = r4.a()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L1a:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r4.previous()
            r1 = r0
            androidx.activity.r r1 = (androidx.activity.r) r1
            boolean r1 = r1.f875a
            if (r1 == 0) goto L1a
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.activity.r r0 = (androidx.activity.r) r0
        L2f:
            se.a0 r4 = se.a0.f19710a
            return r4
        L32:
            androidx.activity.b r4 = (androidx.activity.b) r4
            r4.getClass()
            androidx.activity.b0 r4 = r3.f878u
            te.i r0 = r4.b
            int r1 = r0.a()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L43:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.r r2 = (androidx.activity.r) r2
            boolean r2 = r2.f875a
            if (r2 == 0) goto L43
            goto L56
        L55:
            r1 = 0
        L56:
            androidx.activity.r r1 = (androidx.activity.r) r1
            r4.f845c = r1
            se.a0 r4 = se.a0.f19710a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.s.invoke(java.lang.Object):java.lang.Object");
    }
}
