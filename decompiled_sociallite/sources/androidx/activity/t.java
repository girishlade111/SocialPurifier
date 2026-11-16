package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements hf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b0 f880u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b0 b0Var, int i2) {
        super(0);
        this.f879t = i2;
        this.f880u = b0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 java.lang.Object, still in use, count: 2, list:
          (r3v5 java.lang.Object) from 0x0031: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:14:0x0030, B:21:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r3v5 java.lang.Object) from 0x0029: CHECK_CAST (androidx.activity.r) (r3v5 java.lang.Object)
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
    @Override // hf.a
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.f879t
            switch(r0) {
                case 0: goto L38;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            androidx.activity.b0 r0 = r5.f880u
            r0.b()
            se.a0 r0 = se.a0.f19710a
            return r0
        Ld:
            androidx.activity.b0 r0 = r5.f880u
            androidx.activity.r r1 = r0.f845c
            r2 = 0
            if (r1 != 0) goto L33
            te.i r1 = r0.b
            int r3 = r1.a()
            java.util.ListIterator r1 = r1.listIterator(r3)
        L1e:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.previous()
            r4 = r3
            androidx.activity.r r4 = (androidx.activity.r) r4
            boolean r4 = r4.f875a
            if (r4 == 0) goto L1e
            goto L31
        L30:
            r3 = r2
        L31:
            androidx.activity.r r3 = (androidx.activity.r) r3
        L33:
            r0.f845c = r2
            se.a0 r0 = se.a0.f19710a
            return r0
        L38:
            androidx.activity.b0 r0 = r5.f880u
            r0.b()
            se.a0 r0 = se.a0.f19710a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.t.invoke():java.lang.Object");
    }
}
