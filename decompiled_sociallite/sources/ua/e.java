package ua;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import va.h0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {
    public static final Status I = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status J = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object K = new Object();
    public static e L;
    public final AtomicInteger A;
    public final AtomicInteger B;
    public final ConcurrentHashMap C;
    public n D;
    public final s.f E;
    public final s.f F;
    public final q0 G;
    public volatile boolean H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public va.m f21148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xa.b f21149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f21150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sa.e f21151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j4 f21152z;

    public e(Context context, Looper looper) {
        sa.e eVar = sa.e.f19599d;
        this.f21146t = 10000L;
        this.f21147u = false;
        this.A = new AtomicInteger(1);
        this.B = new AtomicInteger(0);
        this.C = new ConcurrentHashMap(5, 0.75f, 1);
        this.D = null;
        this.E = new s.f(0);
        this.F = new s.f(0);
        this.H = true;
        this.f21150x = context;
        q0 q0Var = new q0(looper, this, 1);
        Looper.getMainLooper();
        this.G = q0Var;
        this.f21151y = eVar;
        this.f21152z = new j4(16);
        PackageManager packageManager = context.getPackageManager();
        if (ab.b.f468f == null) {
            ab.b.f468f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (ab.b.f468f.booleanValue()) {
            this.H = false;
        }
        q0Var.sendMessage(q0Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (K) {
            try {
                e eVar = L;
                if (eVar != null) {
                    eVar.B.incrementAndGet();
                    q0 q0Var = eVar.G;
                    q0Var.sendMessageAtFrontOfQueue(q0Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(a aVar, sa.b bVar) {
        return new Status(17, a5.z.j("API: ", (String) aVar.b.f21005u, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f19590v, bVar);
    }

    public static e g(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (K) {
            if (L == null) {
                synchronized (h0.f22239g) {
                    try {
                        handlerThread = h0.f22241i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            h0.f22241i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = h0.f22241i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = sa.e.f19598c;
                L = new e(applicationContext, looper);
            }
            eVar = L;
        }
        return eVar;
    }

    public final void b(n nVar) {
        synchronized (K) {
            try {
                if (this.D != nVar) {
                    this.D = nVar;
                    this.E.clear();
                }
                this.E.addAll(nVar.f21167y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f21147u) {
            return false;
        }
        va.l lVar = (va.l) va.k.d().f22256t;
        if (lVar != null && !lVar.f22258u) {
            return false;
        }
        int i2 = ((SparseIntArray) this.f21152z.f2774u).get(203400000, -1);
        return i2 == -1 || i2 == 0;
    }

    public final boolean d(sa.b bVar, int i2) {
        sa.e eVar = this.f21151y;
        eVar.getClass();
        Context context = this.f21150x;
        if (!bb.a.W(context)) {
            int i10 = bVar.f19589u;
            PendingIntent activity = bVar.f19590v;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = eVar.a(i10, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f2566u;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i2);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i10, PendingIntent.getActivity(context, 0, intent, lb.c.f10112a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final p f(ta.f fVar) {
        a aVar = fVar.f20209e;
        ConcurrentHashMap concurrentHashMap = this.C;
        p pVar = (p) concurrentHashMap.get(aVar);
        if (pVar == null) {
            pVar = new p(this, fVar);
            concurrentHashMap.put(aVar, pVar);
        }
        if (pVar.f21171h.k()) {
            this.F.add(aVar);
        }
        pVar.l();
        return pVar;
    }

    public final void h(sa.b bVar, int i2) {
        if (d(bVar, i2)) {
            return;
        }
        q0 q0Var = this.G;
        q0Var.sendMessage(q0Var.obtainMessage(5, i2, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0320  */
    /* JADX WARN: Code duplicated, block: B:164:0x0326  */
    /* JADX WARN: Code duplicated, block: B:166:0x0344  */
    /* JADX WARN: Code duplicated, block: B:168:0x034e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v5 ua.p, still in use, count: 2, list:
          (r5v5 ua.p) from 0x0318: IGET (r5v5 ua.p) A[WRAPPED] ua.p.m int
          (r5v5 ua.p) from 0x031e: PHI (r5 I:??) = (r5v2 ua.p), (r5v5 ua.p) binds: [B:160:0x031d, B:216:0x031e] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.e.handleMessage(android.os.Message):boolean");
    }
}
