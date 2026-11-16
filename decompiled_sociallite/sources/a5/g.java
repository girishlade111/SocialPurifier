package a5;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i0;
import androidx.work.CoroutineWorker;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper;
import com.sociallite.android.TimerFocusLockActivity;
import com.sociallite.android.data.AppBlockerService;
import com.sociallite.android.data.NativeReelsBlockerService;
import ge.d2;
import ge.e7;
import ge.h8;
import ge.k6;
import ge.l5;
import ge.lc;
import ge.m7;
import ge.n6;
import ge.q7;
import ge.s7;
import ge.v5;
import h2.f0;
import h2.n2;
import h2.o2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f228u;

    public /* synthetic */ g(Object obj, int i2) {
        this.f227t = i2;
        this.f228u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v11, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        long j11;
        long[] jArr;
        n2.p pVar;
        s.r rVar;
        n2.p pVar2;
        s.r rVar2;
        char c11;
        int i2;
        n2.p pVar3 = null;
        switch (this.f227t) {
            case 0:
                h hVar = (h) this.f228u;
                synchronized (hVar.f229a) {
                    try {
                        if (hVar.f239m) {
                            return;
                        }
                        long j12 = hVar.l - 1;
                        hVar.l = j12;
                        if (j12 > 0) {
                            return;
                        }
                        if (j12 >= 0) {
                            hVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (hVar.f229a) {
                            hVar.f240n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                ((androidx.activity.n) this.f228u).invalidateMenu();
                return;
            case 2:
                androidx.activity.m mVar = (androidx.activity.m) this.f228u;
                Runnable runnable = mVar.f867u;
                if (runnable != null) {
                    runnable.run();
                    mVar.f867u = null;
                    return;
                }
                return;
            case 3:
                androidx.activity.p.a((androidx.activity.p) this.f228u);
                return;
            case 4:
                i0 i0Var = (i0) this.f228u;
                androidx.lifecycle.w wVar = i0Var.f1273y;
                if (i0Var.f1269u == 0) {
                    i0Var.f1270v = true;
                    wVar.f(androidx.lifecycle.m.ON_PAUSE);
                }
                if (i0Var.f1268t == 0 && i0Var.f1270v) {
                    wVar.f(androidx.lifecycle.m.ON_STOP);
                    i0Var.f1271w = true;
                    return;
                }
                return;
            case 5:
                com.appstack.attribution.internal.network.h hVar2 = (com.appstack.attribution.internal.network.h) this.f228u;
                int i10 = com.appstack.attribution.internal.network.h.f2518c;
                ConnectivityManager connectivityManager = hVar2.f2519a;
                if (connectivityManager == null) {
                    return;
                }
                try {
                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new com.appstack.attribution.internal.network.i(hVar2));
                    p8.m.f16755a.getClass();
                    p8.m.a("NetworkConnectivity", "Registered network connectivity callback");
                    return;
                } catch (SecurityException unused) {
                    p8.m.f16755a.getClass();
                    p8.m.h("NetworkConnectivity", "Cannot register network callback - permission denied");
                    return;
                } catch (Exception e10) {
                    p8.m mVar2 = p8.m.f16755a;
                    String str = "Failed to register network callback: " + e10.getMessage();
                    mVar2.getClass();
                    p8.m.h("NetworkConnectivity", str);
                    return;
                }
            case 6:
                ((hf.c) this.f228u).invoke(null);
                return;
            case 7:
                ((AmazonBilling) this.f228u).startConnection();
                return;
            case 8:
                Dispatcher.enqueue$lambda$3$lambda$2$lambda$1((Throwable) this.f228u);
                return;
            case 9:
                ((SimulatedStoreBillingWrapper) this.f228u).startConnection();
                return;
            case 10:
                TimerFocusLockActivity timerFocusLockActivity = (TimerFocusLockActivity) this.f228u;
                int i11 = TimerFocusLockActivity.A;
                if (timerFocusLockActivity.c() == null) {
                    timerFocusLockActivity.finish();
                    return;
                }
                return;
            case 11:
                u7.i iVar = (u7.i) this.f228u;
                ((ha.f) iVar.f21018w).l(new x(iVar, 11));
                return;
            case 12:
                ((AppBlockerService) this.f228u).requestDailyLimitCheck();
                return;
            case 13:
                l5 l5Var = (l5) this.f228u;
                l5Var.f6482a = false;
                if (l5Var.b) {
                    ((ExecutorService) l5Var.f6485e).shutdown();
                    return;
                }
                return;
            case 14:
                final v5 v5Var = (v5) this.f228u;
                v5Var.f7024r = false;
                k6 k6Var = v5Var.f7015h;
                if (v5Var.C || !v5Var.g()) {
                    v5Var.c();
                    return;
                }
                if (v5Var.f7029w) {
                    v5Var.f7030x = true;
                    return;
                }
                v5Var.f7029w = true;
                final long j13 = v5Var.f7028v.get();
                final boolean z10 = v5Var.f7031y;
                v5Var.f7031y = false;
                final boolean z11 = (v5Var.f7017j == null && ((e7) v5Var.f7014g.f9147u).f6092g == null && !k6Var.e() && v5Var.f7016i.f6903e == null) ? false : true;
                final boolean z12 = ((n6) k6Var.f6422e.f5669d) != null;
                final boolean z13 = d2.B(v5Var.f7009a).getBoolean("nativeIgStopAtCaughtUp", true);
                v5Var.f7027u.execute(new Runnable() { // from class: ge.u5
                    /* JADX WARN: Code duplicated, block: B:11:0x002d A[Catch: all -> 0x0025, TryCatch #1 {all -> 0x0025, blocks: (B:4:0x001d, B:6:0x0021, B:9:0x0029, B:11:0x002d, B:37:0x0075, B:62:0x00c6, B:63:0x00cf, B:65:0x00d5, B:66:0x00df, B:12:0x0032, B:38:0x0079, B:39:0x0083, B:41:0x0089, B:43:0x0096, B:49:0x00a0, B:51:0x00a4), top: B:86:0x001d, inners: #3 }] */
                    /* JADX WARN: Code duplicated, block: B:12:0x0032 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #1 {all -> 0x0025, blocks: (B:4:0x001d, B:6:0x0021, B:9:0x0029, B:11:0x002d, B:37:0x0075, B:62:0x00c6, B:63:0x00cf, B:65:0x00d5, B:66:0x00df, B:12:0x0032, B:38:0x0079, B:39:0x0083, B:41:0x0089, B:43:0x0096, B:49:0x00a0, B:51:0x00a4), top: B:86:0x001d, inners: #3 }] */
                    /* JADX WARN: Code duplicated, block: B:15:0x003a A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:41:0x0089 A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:38:0x0079, B:39:0x0083, B:41:0x0089, B:43:0x0096, B:49:0x00a0, B:51:0x00a4), top: B:89:0x0079, outer: #1 }] */
                    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #3 {all -> 0x009d, blocks: (B:38:0x0079, B:39:0x0083, B:41:0x0089, B:43:0x0096, B:49:0x00a0, B:51:0x00a4), top: B:89:0x0079, outer: #1 }] */
                    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
                    /* JADX WARN: Code duplicated, block: B:57:0x00b7 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:54:0x00ab, B:55:0x00b1, B:57:0x00b7), top: B:84:0x00ab }] */
                    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[Catch: all -> 0x0047, PHI: r6
  0x00e0: PHI (r6v8 android.view.accessibility.AccessibilityNodeInfo) = 
  (r6v7 android.view.accessibility.AccessibilityNodeInfo)
  (r6v7 android.view.accessibility.AccessibilityNodeInfo)
  (r6v7 android.view.accessibility.AccessibilityNodeInfo)
  (r6v18 android.view.accessibility.AccessibilityNodeInfo)
 binds: [B:14:0x0038, B:23:0x0053, B:34:0x006e, B:61:0x00c4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:69:0x00e8 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:72:0x00f6 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:16:0x003c, B:18:0x0042, B:22:0x004b, B:25:0x0057, B:29:0x0061, B:33:0x006b, B:36:0x0072, B:67:0x00e0, B:69:0x00e8, B:72:0x00f6, B:74:0x0100), top: B:87:0x003c }] */
                    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
                    /* JADX WARN: Code duplicated, block: B:87:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:91:0x009f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:92:0x0096 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:95:0x0083 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccessibilityNodeInfo rootInActiveWindow;
                        Object lVar;
                        a6 a6VarB;
                        CharSequence packageName;
                        String string;
                        AccessibilityWindowInfo window;
                        boolean z14;
                        List<AccessibilityWindowInfo> windows;
                        Iterator<T> it;
                        Object next;
                        AccessibilityWindowInfo accessibilityWindowInfo;
                        AccessibilityNodeInfo root;
                        Iterator<T> it2;
                        AccessibilityWindowInfo accessibilityWindowInfo2;
                        v5 v5Var2 = v5Var;
                        NativeReelsBlockerService nativeReelsBlockerService = v5Var2.f7009a;
                        boolean z15 = z12;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                        vVar.f9987t = jElapsedRealtime;
                        boolean z16 = z10;
                        long j14 = j13;
                        if (z16) {
                            try {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    nativeReelsBlockerService.clearCache();
                                }
                                if (Build.VERSION.SDK_INT >= 33) {
                                    rootInActiveWindow = nativeReelsBlockerService.getRootInActiveWindow(0);
                                } else {
                                    rootInActiveWindow = nativeReelsBlockerService.getRootInActiveWindow();
                                }
                                if (!z11) {
                                    vVar.f9987t = SystemClock.elapsedRealtime();
                                    if (rootInActiveWindow != null) {
                                        a6VarB = c6.b(rootInActiveWindow, new n5(v5Var2, j14, 2));
                                        lVar = a6VarB;
                                        if (z13 && v5Var2.f7028v.get() == j14) {
                                            lVar = a6VarB;
                                            l6 l6VarK = d2.K(rootInActiveWindow, a6VarB, z15);
                                            int i12 = a6VarB.f5886a;
                                            Rect rect = a6VarB.b;
                                            Map map = a6VarB.f5887c;
                                            e6 e6Var = a6VarB.f5888d;
                                            Rect rect2 = a6VarB.f5890f;
                                            rect.getClass();
                                            map.getClass();
                                            e6Var.getClass();
                                            lVar = new a6(i12, rect, map, e6Var, l6VarK, rect2);
                                        }
                                    } else {
                                        lVar = null;
                                    }
                                } else if (rootInActiveWindow != null) {
                                    try {
                                        packageName = rootInActiveWindow.getPackageName();
                                        if (packageName != null) {
                                            string = packageName.toString();
                                        } else {
                                            string = null;
                                        }
                                        if (kotlin.jvm.internal.l.a(string, nativeReelsBlockerService.getPackageName())) {
                                            if (rootInActiveWindow != null) {
                                                window = rootInActiveWindow.getWindow();
                                            } else {
                                                window = null;
                                            }
                                            z14 = false;
                                            if (window != null && window.getType() == 4) {
                                                z14 = true;
                                            }
                                            if (window != null) {
                                                window.recycle();
                                            }
                                            if (z14) {
                                                if (rootInActiveWindow != null) {
                                                    rootInActiveWindow.recycle();
                                                }
                                                windows = nativeReelsBlockerService.getWindows();
                                                try {
                                                    windows.getClass();
                                                    it = windows.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it.next();
                                                        accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                                                        if (!accessibilityWindowInfo2.isFocused() && accessibilityWindowInfo2.getType() == 1) {
                                                            break;
                                                        }
                                                    }
                                                    accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                                    if (accessibilityWindowInfo != null) {
                                                        root = accessibilityWindowInfo.getRoot();
                                                    } else {
                                                        root = null;
                                                    }
                                                    try {
                                                        it2 = windows.iterator();
                                                        while (it2.hasNext()) {
                                                            ((AccessibilityWindowInfo) it2.next()).recycle();
                                                        }
                                                        rootInActiveWindow = root;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        rootInActiveWindow = root;
                                                        lVar = new se.l(th);
                                                    }
                                                } catch (Throwable th3) {
                                                    windows.getClass();
                                                    Iterator<T> it3 = windows.iterator();
                                                    while (it3.hasNext()) {
                                                        ((AccessibilityWindowInfo) it3.next()).recycle();
                                                    }
                                                    throw th3;
                                                }
                                            }
                                        }
                                        vVar.f9987t = SystemClock.elapsedRealtime();
                                        if (rootInActiveWindow != null) {
                                            a6VarB = c6.b(rootInActiveWindow, new n5(v5Var2, j14, 2));
                                            lVar = a6VarB;
                                            if (z13) {
                                                lVar = a6VarB;
                                                l6 l6VarK2 = d2.K(rootInActiveWindow, a6VarB, z15);
                                                int i13 = a6VarB.f5886a;
                                                Rect rect3 = a6VarB.b;
                                                Map map2 = a6VarB.f5887c;
                                                e6 e6Var2 = a6VarB.f5888d;
                                                Rect rect4 = a6VarB.f5890f;
                                                rect3.getClass();
                                                map2.getClass();
                                                e6Var2.getClass();
                                                lVar = new a6(i13, rect3, map2, e6Var2, l6VarK2, rect4);
                                            }
                                        } else {
                                            lVar = null;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        lVar = new se.l(th);
                                        lVar = a6VarB;
                                        v5Var2.b.post(new m5(v5Var2, j14, rootInActiveWindow, (a6) (lVar instanceof se.l ? null : lVar), jElapsedRealtime, vVar, SystemClock.elapsedRealtime()));
                                    }
                                } else {
                                    string = null;
                                    if (kotlin.jvm.internal.l.a(string, nativeReelsBlockerService.getPackageName())) {
                                        if (rootInActiveWindow != null) {
                                            window = rootInActiveWindow.getWindow();
                                        } else {
                                            window = null;
                                        }
                                        z14 = false;
                                        if (window != null) {
                                            z14 = true;
                                        }
                                        if (window != null) {
                                            window.recycle();
                                        }
                                        if (z14) {
                                            if (rootInActiveWindow != null) {
                                                rootInActiveWindow.recycle();
                                            }
                                            windows = nativeReelsBlockerService.getWindows();
                                            windows.getClass();
                                            it = windows.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = null;
                                                    break;
                                                } else {
                                                    next = it.next();
                                                    accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                                                    if (!accessibilityWindowInfo2.isFocused()) {
                                                    }
                                                }
                                            }
                                            accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                            if (accessibilityWindowInfo != null) {
                                                root = accessibilityWindowInfo.getRoot();
                                            } else {
                                                root = null;
                                            }
                                            it2 = windows.iterator();
                                            while (it2.hasNext()) {
                                                ((AccessibilityWindowInfo) it2.next()).recycle();
                                            }
                                            rootInActiveWindow = root;
                                        }
                                    }
                                    vVar.f9987t = SystemClock.elapsedRealtime();
                                    if (rootInActiveWindow != null) {
                                        a6VarB = c6.b(rootInActiveWindow, new n5(v5Var2, j14, 2));
                                        lVar = a6VarB;
                                        if (z13) {
                                            lVar = a6VarB;
                                            l6 l6VarK3 = d2.K(rootInActiveWindow, a6VarB, z15);
                                            int i14 = a6VarB.f5886a;
                                            Rect rect5 = a6VarB.b;
                                            Map map3 = a6VarB.f5887c;
                                            e6 e6Var3 = a6VarB.f5888d;
                                            Rect rect6 = a6VarB.f5890f;
                                            rect5.getClass();
                                            map3.getClass();
                                            e6Var3.getClass();
                                            lVar = new a6(i14, rect5, map3, e6Var3, l6VarK3, rect6);
                                        }
                                    } else {
                                        lVar = null;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                rootInActiveWindow = null;
                                lVar = new se.l(th);
                                lVar = a6VarB;
                                v5Var2.b.post(new m5(v5Var2, j14, rootInActiveWindow, (a6) (lVar instanceof se.l ? null : lVar), jElapsedRealtime, vVar, SystemClock.elapsedRealtime()));
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                rootInActiveWindow = nativeReelsBlockerService.getRootInActiveWindow(0);
                            } else {
                                rootInActiveWindow = nativeReelsBlockerService.getRootInActiveWindow();
                            }
                            if (!z11) {
                                vVar.f9987t = SystemClock.elapsedRealtime();
                                if (rootInActiveWindow != null) {
                                    a6VarB = c6.b(rootInActiveWindow, new n5(v5Var2, j14, 2));
                                    lVar = a6VarB;
                                    if (z13) {
                                        lVar = a6VarB;
                                        l6 l6VarK4 = d2.K(rootInActiveWindow, a6VarB, z15);
                                        int i15 = a6VarB.f5886a;
                                        Rect rect7 = a6VarB.b;
                                        Map map4 = a6VarB.f5887c;
                                        e6 e6Var4 = a6VarB.f5888d;
                                        Rect rect8 = a6VarB.f5890f;
                                        rect7.getClass();
                                        map4.getClass();
                                        e6Var4.getClass();
                                        lVar = new a6(i15, rect7, map4, e6Var4, l6VarK4, rect8);
                                    }
                                } else {
                                    lVar = null;
                                }
                            } else if (rootInActiveWindow != null) {
                                packageName = rootInActiveWindow.getPackageName();
                                if (packageName != null) {
                                    string = packageName.toString();
                                } else {
                                    string = null;
                                }
                                if (kotlin.jvm.internal.l.a(string, nativeReelsBlockerService.getPackageName())) {
                                    if (rootInActiveWindow != null) {
                                        window = rootInActiveWindow.getWindow();
                                    } else {
                                        window = null;
                                    }
                                    z14 = false;
                                    if (window != null) {
                                        z14 = true;
                                    }
                                    if (window != null) {
                                        window.recycle();
                                    }
                                    if (z14) {
                                        if (rootInActiveWindow != null) {
                                            rootInActiveWindow.recycle();
                                        }
                                        windows = nativeReelsBlockerService.getWindows();
                                        windows.getClass();
                                        it = windows.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            } else {
                                                next = it.next();
                                                accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                                                if (!accessibilityWindowInfo2.isFocused()) {
                                                }
                                            }
                                        }
                                        accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                        if (accessibilityWindowInfo != null) {
                                            root = accessibilityWindowInfo.getRoot();
                                        } else {
                                            root = null;
                                        }
                                        it2 = windows.iterator();
                                        while (it2.hasNext()) {
                                            ((AccessibilityWindowInfo) it2.next()).recycle();
                                        }
                                        rootInActiveWindow = root;
                                    }
                                }
                                vVar.f9987t = SystemClock.elapsedRealtime();
                                if (rootInActiveWindow != null) {
                                    a6VarB = c6.b(rootInActiveWindow, new n5(v5Var2, j14, 2));
                                    lVar = a6VarB;
                                    if (z13) {
                                        lVar = a6VarB;
                                        l6 l6VarK5 = d2.K(rootInActiveWindow, a6VarB, z15);
                                        int i16 = a6VarB.f5886a;
                                        Rect rect9 = a6VarB.b;
                                        Map map5 = a6VarB.f5887c;
                                        e6 e6Var5 = a6VarB.f5888d;
                                        Rect rect10 = a6VarB.f5890f;
                                        rect9.getClass();
                                        map5.getClass();
                                        e6Var5.getClass();
                                        lVar = new a6(i16, rect9, map5, e6Var5, l6VarK5, rect10);
                                    }
                                } else {
                                    lVar = null;
                                }
                            } else {
                                string = null;
                                if (kotlin.jvm.internal.l.a(string, nativeReelsBlockerService.getPackageName())) {
                                    if (rootInActiveWindow != null) {
                                        window = rootInActiveWindow.getWindow();
                                    } else {
                                        window = null;
                                    }
                                    z14 = false;
                                    if (window != null) {
                                        z14 = true;
                                    }
                                    if (window != null) {
                                        window.recycle();
                                    }
                                    if (z14) {
                                        if (rootInActiveWindow != null) {
                                            rootInActiveWindow.recycle();
                                        }
                                        windows = nativeReelsBlockerService.getWindows();
                                        windows.getClass();
                                        it = windows.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = null;
                                                break;
                                            } else {
                                                next = it.next();
                                                accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                                                if (!accessibilityWindowInfo2.isFocused()) {
                                                }
                                            }
                                        }
                                        accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                        if (accessibilityWindowInfo != null) {
                                            root = accessibilityWindowInfo.getRoot();
                                        } else {
                                            root = null;
                                        }
                                        it2 = windows.iterator();
                                        while (it2.hasNext()) {
                                            ((AccessibilityWindowInfo) it2.next()).recycle();
                                        }
                                        rootInActiveWindow = root;
                                    }
                                }
                                vVar.f9987t = SystemClock.elapsedRealtime();
                                if (rootInActiveWindow != null) {
                                    a6VarB = c6.b(rootInActiveWindow, new n5(v5Var2, j14, 2));
                                    lVar = a6VarB;
                                    if (z13) {
                                        lVar = a6VarB;
                                        l6 l6VarK6 = d2.K(rootInActiveWindow, a6VarB, z15);
                                        int i17 = a6VarB.f5886a;
                                        Rect rect11 = a6VarB.b;
                                        Map map6 = a6VarB.f5887c;
                                        e6 e6Var6 = a6VarB.f5888d;
                                        Rect rect12 = a6VarB.f5890f;
                                        rect11.getClass();
                                        map6.getClass();
                                        e6Var6.getClass();
                                        lVar = new a6(i17, rect11, map6, e6Var6, l6VarK6, rect12);
                                    }
                                } else {
                                    lVar = null;
                                }
                            }
                        }
                        lVar = a6VarB;
                        v5Var2.b.post(new m5(v5Var2, j14, rootInActiveWindow, (a6) (lVar instanceof se.l ? null : lVar), jElapsedRealtime, vVar, SystemClock.elapsedRealtime()));
                    }
                });
                return;
            case 15:
                final m7 m7Var = (m7) this.f228u;
                if (m7Var.l || !m7Var.c()) {
                    m7Var.a();
                    return;
                }
                if (m7Var.f6562m) {
                    return;
                }
                m7Var.f6562m = true;
                final int i12 = m7Var.f6563n;
                final boolean z14 = m7Var.f6555e != null;
                final boolean z15 = m7Var.f6559i > 0 && SystemClock.uptimeMillis() >= m7Var.f6561k;
                final boolean z16 = m7Var.f6559i == m7Var.f6560j;
                final boolean z17 = m7Var.f6564o;
                m7Var.f6564o = false;
                m7Var.f6553c.execute(new Runnable() { // from class: ge.j7
                    /* JADX WARN: Code duplicated, block: B:101:0x008e A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
                    /* JADX WARN: Code duplicated, block: B:29:0x005a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:31:0x005f A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:32:0x0061 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:37:0x0078 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:34:0x0068, B:35:0x0072, B:37:0x0078, B:39:0x0085, B:45:0x008f, B:47:0x0093), top: B:97:0x0068, outer: #3 }] */
                    /* JADX WARN: Code duplicated, block: B:47:0x0093 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #2 {all -> 0x008c, blocks: (B:34:0x0068, B:35:0x0072, B:37:0x0078, B:39:0x0085, B:45:0x008f, B:47:0x0093), top: B:97:0x0068, outer: #3 }] */
                    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
                    /* JADX WARN: Code duplicated, block: B:53:0x00a6 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:50:0x009a, B:51:0x00a0, B:53:0x00a6), top: B:93:0x009a }] */
                    /* JADX WARN: Code duplicated, block: B:64:0x00d2 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:66:0x00d8 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
                    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
                    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
                    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
                    /* JADX WARN: Code duplicated, block: B:75:0x00ef A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:77:0x0116  */
                    /* JADX WARN: Code duplicated, block: B:79:0x011a A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002b, B:14:0x0031, B:18:0x003a, B:21:0x0046, B:25:0x0050, B:29:0x005a, B:32:0x0061, B:64:0x00d2, B:66:0x00d8, B:68:0x00de, B:75:0x00ef, B:80:0x0135, B:79:0x011a), top: B:95:0x002b }] */
                    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
                    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccessibilityNodeInfo rootInActiveWindow;
                        Object lVar;
                        CharSequence packageName;
                        String string;
                        AccessibilityNodeInfo accessibilityNodeInfo;
                        String string2;
                        AccessibilityWindowInfo window;
                        boolean z18;
                        List<AccessibilityWindowInfo> windows;
                        Iterator<T> it;
                        Object next;
                        AccessibilityWindowInfo accessibilityWindowInfo;
                        AccessibilityNodeInfo root;
                        Iterator<T> it2;
                        AccessibilityWindowInfo accessibilityWindowInfo2;
                        final m7 m7Var2 = m7Var;
                        NativeReelsBlockerService nativeReelsBlockerService = m7Var2.f6552a;
                        final boolean z19 = z15;
                        boolean z20 = z16;
                        final kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                        o7 o7Var = o7.f6665v;
                        wVar2.f9988t = o7Var;
                        try {
                            rootInActiveWindow = Build.VERSION.SDK_INT >= 33 ? nativeReelsBlockerService.getRootInActiveWindow(0) : nativeReelsBlockerService.getRootInActiveWindow();
                            if (z14) {
                                if (rootInActiveWindow != null) {
                                    try {
                                        CharSequence packageName2 = rootInActiveWindow.getPackageName();
                                        if (packageName2 != null) {
                                            string2 = packageName2.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        if (kotlin.jvm.internal.l.a(string2, nativeReelsBlockerService.getPackageName())) {
                                            if (rootInActiveWindow != null) {
                                                window = rootInActiveWindow.getWindow();
                                            } else {
                                                window = null;
                                            }
                                            z18 = false;
                                            if (window != null && window.getType() == 4) {
                                                z18 = true;
                                            }
                                            if (window != null) {
                                                window.recycle();
                                            }
                                            if (z18) {
                                                if (rootInActiveWindow != null) {
                                                    rootInActiveWindow.recycle();
                                                }
                                                windows = nativeReelsBlockerService.getWindows();
                                                try {
                                                    windows.getClass();
                                                    it = windows.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it.next();
                                                        accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                                                        if (!accessibilityWindowInfo2.isFocused() && accessibilityWindowInfo2.getType() == 1) {
                                                            break;
                                                        }
                                                    }
                                                    accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                                    if (accessibilityWindowInfo != null) {
                                                        root = accessibilityWindowInfo.getRoot();
                                                    } else {
                                                        root = null;
                                                    }
                                                    try {
                                                        it2 = windows.iterator();
                                                        while (it2.hasNext()) {
                                                            ((AccessibilityWindowInfo) it2.next()).recycle();
                                                        }
                                                        rootInActiveWindow = root;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        rootInActiveWindow = root;
                                                        lVar = new se.l(th);
                                                    }
                                                } catch (Throwable th3) {
                                                    windows.getClass();
                                                    Iterator<T> it3 = windows.iterator();
                                                    while (it3.hasNext()) {
                                                        ((AccessibilityWindowInfo) it3.next()).recycle();
                                                    }
                                                    throw th3;
                                                }
                                            }
                                        }
                                        if (rootInActiveWindow == null) {
                                            lVar = null;
                                        } else {
                                            packageName = rootInActiveWindow.getPackageName();
                                            if (packageName != null) {
                                                string = packageName.toString();
                                            } else {
                                                string = null;
                                            }
                                            if (kotlin.jvm.internal.l.a(string, "com.snapchat.android")) {
                                                accessibilityNodeInfo = rootInActiveWindow;
                                            } else {
                                                accessibilityNodeInfo = null;
                                            }
                                            if (accessibilityNodeInfo != null) {
                                                if (z19) {
                                                    kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                                                    wVar3.f9988t = o7Var;
                                                    n7 n7Var = new n7(wVar3, z20);
                                                    kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                                                    uVar.f9986t = RCHTTPStatusCodes.UNSUCCESSFUL;
                                                    Rect rect = new Rect();
                                                    accessibilityNodeInfo.getBoundsInScreen(rect);
                                                    d2.U(uVar, rect, n7Var, accessibilityNodeInfo, 0, false);
                                                    wVar2.f9988t = (o7) wVar3.f9988t;
                                                } else if (z17) {
                                                    a8.c cVar = new a8.c(21);
                                                    kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                                                    uVar2.f9986t = RCHTTPStatusCodes.UNSUCCESSFUL;
                                                    Rect rect2 = new Rect();
                                                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                                                    d2.U(uVar2, rect2, cVar, accessibilityNodeInfo, 0, false);
                                                }
                                                lVar = d2.d(accessibilityNodeInfo);
                                            } else {
                                                lVar = null;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        lVar = new se.l(th);
                                        final Rect rect3 = (Rect) (lVar instanceof se.l ? null : lVar);
                                        if (rootInActiveWindow != null) {
                                            rootInActiveWindow.recycle();
                                        }
                                        Handler handler = m7Var2.b;
                                        final int i13 = i12;
                                        handler.post(new Runnable() { // from class: ge.k7
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i14;
                                                final m7 m7Var3 = m7Var2;
                                                WindowManager windowManager = m7Var3.f6554d;
                                                m7Var3.f6562m = false;
                                                a5.g gVar = m7Var3.f6565p;
                                                Handler handler2 = m7Var3.b;
                                                if (!m7Var3.l) {
                                                    if (i13 == m7Var3.f6563n) {
                                                        if (z19) {
                                                            m7Var3.f6561k = SystemClock.uptimeMillis() + ((long) RCHTTPStatusCodes.UNSUCCESSFUL);
                                                            if (wVar2.f9988t != o7.f6664u || (i14 = m7Var3.f6559i - 1) < 0) {
                                                                i14 = 0;
                                                            }
                                                            m7Var3.f6559i = i14;
                                                        }
                                                        Rect rect4 = rect3;
                                                        if (rect4 == null || !m7Var3.c()) {
                                                            m7Var3.f6559i = 0;
                                                            View view = m7Var3.f6555e;
                                                            if (view != null) {
                                                                try {
                                                                    windowManager.removeViewImmediate(view);
                                                                } catch (Throwable unused2) {
                                                                }
                                                            }
                                                            m7Var3.f6555e = null;
                                                            m7Var3.f6556f = null;
                                                            m7Var3.f6557g = null;
                                                            m7Var3.f6558h = null;
                                                        } else {
                                                            NativeReelsBlockerService nativeReelsBlockerService2 = m7Var3.f6552a;
                                                            boolean z21 = (Resources.getSystem().getConfiguration().uiMode & 48) == 32;
                                                            int i15 = z21 ? -1 : -15067116;
                                                            LinearLayout linearLayout = m7Var3.f6555e;
                                                            if (linearLayout == null) {
                                                                LinearLayout linearLayout2 = new LinearLayout(nativeReelsBlockerService2);
                                                                linearLayout2.setOrientation(1);
                                                                linearLayout2.setGravity(17);
                                                                linearLayout2.setClickable(true);
                                                                linearLayout2.setPadding(m7Var3.b(24), m7Var3.b(16), m7Var3.b(24), m7Var3.b(16));
                                                                final kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
                                                                final kotlin.jvm.internal.t tVar2 = new kotlin.jvm.internal.t();
                                                                linearLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: ge.l7
                                                                    @Override // android.view.View.OnTouchListener
                                                                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                                                        int actionMasked = motionEvent.getActionMasked();
                                                                        kotlin.jvm.internal.t tVar3 = tVar;
                                                                        kotlin.jvm.internal.t tVar4 = tVar2;
                                                                        if (actionMasked == 0) {
                                                                            tVar3.f9985t = motionEvent.getX();
                                                                            tVar4.f9985t = motionEvent.getY();
                                                                            return true;
                                                                        }
                                                                        if (actionMasked != 1) {
                                                                            return true;
                                                                        }
                                                                        float y10 = motionEvent.getY() - tVar4.f9985t;
                                                                        m7 m7Var4 = m7Var3;
                                                                        if (y10 <= m7Var4.b(48) || motionEvent.getY() - tVar4.f9985t <= Math.abs(motionEvent.getX() - tVar3.f9985t)) {
                                                                            view2.performClick();
                                                                            return true;
                                                                        }
                                                                        m7Var4.f6564o = true;
                                                                        m7Var4.d();
                                                                        return true;
                                                                    }
                                                                });
                                                                ImageView imageView = new ImageView(nativeReelsBlockerService2);
                                                                imageView.setImageResource(R.drawable.ic_lock_lock);
                                                                linearLayout2.addView(imageView, new LinearLayout.LayoutParams(m7Var3.b(28), m7Var3.b(28)));
                                                                m7Var3.f6557g = imageView;
                                                                TextView textView = new TextView(nativeReelsBlockerService2);
                                                                textView.setText(com.sociallite.android.R.string.platform_sheet_locked_target_discover);
                                                                textView.setTextSize(18.0f);
                                                                textView.setGravity(17);
                                                                textView.setTypeface(null, 1);
                                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                                                layoutParams.topMargin = m7Var3.b(12);
                                                                linearLayout2.addView(textView, layoutParams);
                                                                m7Var3.f6556f = textView;
                                                                Button button = new Button(nativeReelsBlockerService2);
                                                                button.setText(com.sociallite.android.R.string.ig_native_show_stories);
                                                                button.setAllCaps(false);
                                                                button.setTextSize(16.0f);
                                                                button.setGravity(17);
                                                                button.setMinHeight(m7Var3.b(48));
                                                                button.setMinimumHeight(m7Var3.b(48));
                                                                button.setPadding(m7Var3.b(22), m7Var3.b(12), m7Var3.b(22), m7Var3.b(12));
                                                                GradientDrawable gradientDrawable = new GradientDrawable();
                                                                gradientDrawable.setCornerRadius(m7Var3.b(16));
                                                                button.setBackground(gradientDrawable);
                                                                button.setOnClickListener(new p4(m7Var3, 2));
                                                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                                                layoutParams2.topMargin = m7Var3.b(16);
                                                                linearLayout2.addView(button, layoutParams2);
                                                                m7Var3.f6558h = button;
                                                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(rect4.width(), rect4.height(), rect4.left, rect4.top, 2032, 296, -1);
                                                                layoutParams3.gravity = 51;
                                                                layoutParams3.setTitle("SocialLite Snapchat Discover");
                                                                try {
                                                                    windowManager.addView(linearLayout2, layoutParams3);
                                                                    m7Var3.f6555e = linearLayout2;
                                                                } catch (RuntimeException unused3) {
                                                                    m7Var3.f6556f = null;
                                                                    m7Var3.f6557g = null;
                                                                    m7Var3.f6558h = null;
                                                                }
                                                            } else {
                                                                ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                                                                layoutParams4.getClass();
                                                                WindowManager.LayoutParams layoutParams5 = (WindowManager.LayoutParams) layoutParams4;
                                                                if (layoutParams5.x != rect4.left || layoutParams5.y != rect4.top || layoutParams5.width != rect4.width() || layoutParams5.height != rect4.height()) {
                                                                    layoutParams5.x = rect4.left;
                                                                    layoutParams5.y = rect4.top;
                                                                    layoutParams5.width = rect4.width();
                                                                    layoutParams5.height = rect4.height();
                                                                    try {
                                                                        windowManager.updateViewLayout(m7Var3.f6555e, layoutParams5);
                                                                    } catch (Throwable unused4) {
                                                                    }
                                                                }
                                                            }
                                                            LinearLayout linearLayout3 = m7Var3.f6555e;
                                                            if (linearLayout3 != null) {
                                                                linearLayout3.setBackgroundColor(z21 ? -16777216 : -1);
                                                            }
                                                            TextView textView2 = m7Var3.f6556f;
                                                            if (textView2 != null) {
                                                                textView2.setTextColor(i15);
                                                            }
                                                            ImageView imageView2 = m7Var3.f6557g;
                                                            if (imageView2 != null) {
                                                                imageView2.setColorFilter(i15);
                                                            }
                                                            ImageView imageView3 = m7Var3.f6557g;
                                                            if (imageView3 != null) {
                                                                imageView3.setVisibility(rect4.height() >= m7Var3.b(208) ? 0 : 8);
                                                            }
                                                            TextView textView3 = m7Var3.f6556f;
                                                            if (textView3 != null) {
                                                                textView3.setVisibility(rect4.height() >= m7Var3.b(160) ? 0 : 8);
                                                            }
                                                            Button button2 = m7Var3.f6558h;
                                                            if (button2 != null) {
                                                                button2.setVisibility(rect4.height() >= m7Var3.b(96) ? 0 : 8);
                                                                button2.setEnabled(m7Var3.f6559i == 0);
                                                                button2.setTextColor(z21 ? -16777216 : -1);
                                                                Drawable background = button2.getBackground();
                                                                background.getClass();
                                                                ((GradientDrawable) background).setColor(i15);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (m7Var3.l || m7Var3.f6555e == null) {
                                                    return;
                                                }
                                                handler2.removeCallbacks(gVar);
                                                handler2.postDelayed(gVar, m7Var3.f6559i > 0 ? 300L : 150L);
                                            }
                                        });
                                    }
                                } else {
                                    string2 = null;
                                    if (kotlin.jvm.internal.l.a(string2, nativeReelsBlockerService.getPackageName())) {
                                        if (rootInActiveWindow != null) {
                                            window = rootInActiveWindow.getWindow();
                                        } else {
                                            window = null;
                                        }
                                        z18 = false;
                                        if (window != null) {
                                            z18 = true;
                                        }
                                        if (window != null) {
                                            window.recycle();
                                        }
                                        if (z18) {
                                            if (rootInActiveWindow != null) {
                                                rootInActiveWindow.recycle();
                                            }
                                            windows = nativeReelsBlockerService.getWindows();
                                            windows.getClass();
                                            it = windows.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = null;
                                                    break;
                                                } else {
                                                    next = it.next();
                                                    accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                                                    if (!accessibilityWindowInfo2.isFocused()) {
                                                    }
                                                }
                                            }
                                            accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                            if (accessibilityWindowInfo != null) {
                                                root = accessibilityWindowInfo.getRoot();
                                            } else {
                                                root = null;
                                            }
                                            it2 = windows.iterator();
                                            while (it2.hasNext()) {
                                                ((AccessibilityWindowInfo) it2.next()).recycle();
                                            }
                                            rootInActiveWindow = root;
                                        }
                                    }
                                    if (rootInActiveWindow == null) {
                                        lVar = null;
                                    } else {
                                        packageName = rootInActiveWindow.getPackageName();
                                        if (packageName != null) {
                                            string = packageName.toString();
                                        } else {
                                            string = null;
                                        }
                                        if (kotlin.jvm.internal.l.a(string, "com.snapchat.android")) {
                                            accessibilityNodeInfo = rootInActiveWindow;
                                        } else {
                                            accessibilityNodeInfo = null;
                                        }
                                        if (accessibilityNodeInfo != null) {
                                            if (z19) {
                                                kotlin.jvm.internal.w wVar4 = new kotlin.jvm.internal.w();
                                                wVar4.f9988t = o7Var;
                                                n7 n7Var2 = new n7(wVar4, z20);
                                                kotlin.jvm.internal.u uVar3 = new kotlin.jvm.internal.u();
                                                uVar3.f9986t = RCHTTPStatusCodes.UNSUCCESSFUL;
                                                Rect rect4 = new Rect();
                                                accessibilityNodeInfo.getBoundsInScreen(rect4);
                                                d2.U(uVar3, rect4, n7Var2, accessibilityNodeInfo, 0, false);
                                                wVar2.f9988t = (o7) wVar4.f9988t;
                                            } else if (z17) {
                                                a8.c cVar2 = new a8.c(21);
                                                kotlin.jvm.internal.u uVar4 = new kotlin.jvm.internal.u();
                                                uVar4.f9986t = RCHTTPStatusCodes.UNSUCCESSFUL;
                                                Rect rect5 = new Rect();
                                                accessibilityNodeInfo.getBoundsInScreen(rect5);
                                                d2.U(uVar4, rect5, cVar2, accessibilityNodeInfo, 0, false);
                                            }
                                            lVar = d2.d(accessibilityNodeInfo);
                                        } else {
                                            lVar = null;
                                        }
                                    }
                                }
                            } else if (rootInActiveWindow == null) {
                                lVar = null;
                            } else {
                                packageName = rootInActiveWindow.getPackageName();
                                if (packageName != null) {
                                    string = packageName.toString();
                                } else {
                                    string = null;
                                }
                                if (kotlin.jvm.internal.l.a(string, "com.snapchat.android")) {
                                    accessibilityNodeInfo = rootInActiveWindow;
                                } else {
                                    accessibilityNodeInfo = null;
                                }
                                if (accessibilityNodeInfo != null) {
                                    if (z19) {
                                        kotlin.jvm.internal.w wVar5 = new kotlin.jvm.internal.w();
                                        wVar5.f9988t = o7Var;
                                        n7 n7Var3 = new n7(wVar5, z20);
                                        kotlin.jvm.internal.u uVar5 = new kotlin.jvm.internal.u();
                                        uVar5.f9986t = RCHTTPStatusCodes.UNSUCCESSFUL;
                                        Rect rect6 = new Rect();
                                        accessibilityNodeInfo.getBoundsInScreen(rect6);
                                        d2.U(uVar5, rect6, n7Var3, accessibilityNodeInfo, 0, false);
                                        wVar2.f9988t = (o7) wVar5.f9988t;
                                    } else if (z17) {
                                        a8.c cVar3 = new a8.c(21);
                                        kotlin.jvm.internal.u uVar6 = new kotlin.jvm.internal.u();
                                        uVar6.f9986t = RCHTTPStatusCodes.UNSUCCESSFUL;
                                        Rect rect7 = new Rect();
                                        accessibilityNodeInfo.getBoundsInScreen(rect7);
                                        d2.U(uVar6, rect7, cVar3, accessibilityNodeInfo, 0, false);
                                    }
                                    lVar = d2.d(accessibilityNodeInfo);
                                } else {
                                    lVar = null;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            rootInActiveWindow = null;
                        }
                        final Rect rect8 = (Rect) (lVar instanceof se.l ? null : lVar);
                        if (rootInActiveWindow != null) {
                            rootInActiveWindow.recycle();
                        }
                        Handler handler2 = m7Var2.b;
                        final int i14 = i12;
                        handler2.post(new Runnable() { // from class: ge.k7
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i15;
                                final m7 m7Var3 = m7Var2;
                                WindowManager windowManager = m7Var3.f6554d;
                                m7Var3.f6562m = false;
                                a5.g gVar = m7Var3.f6565p;
                                Handler handler3 = m7Var3.b;
                                if (!m7Var3.l) {
                                    if (i14 == m7Var3.f6563n) {
                                        if (z19) {
                                            m7Var3.f6561k = SystemClock.uptimeMillis() + ((long) RCHTTPStatusCodes.UNSUCCESSFUL);
                                            if (wVar2.f9988t != o7.f6664u || (i15 = m7Var3.f6559i - 1) < 0) {
                                                i15 = 0;
                                            }
                                            m7Var3.f6559i = i15;
                                        }
                                        Rect rect9 = rect8;
                                        if (rect9 == null || !m7Var3.c()) {
                                            m7Var3.f6559i = 0;
                                            View view = m7Var3.f6555e;
                                            if (view != null) {
                                                try {
                                                    windowManager.removeViewImmediate(view);
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            m7Var3.f6555e = null;
                                            m7Var3.f6556f = null;
                                            m7Var3.f6557g = null;
                                            m7Var3.f6558h = null;
                                        } else {
                                            NativeReelsBlockerService nativeReelsBlockerService2 = m7Var3.f6552a;
                                            boolean z21 = (Resources.getSystem().getConfiguration().uiMode & 48) == 32;
                                            int i16 = z21 ? -1 : -15067116;
                                            LinearLayout linearLayout = m7Var3.f6555e;
                                            if (linearLayout == null) {
                                                LinearLayout linearLayout2 = new LinearLayout(nativeReelsBlockerService2);
                                                linearLayout2.setOrientation(1);
                                                linearLayout2.setGravity(17);
                                                linearLayout2.setClickable(true);
                                                linearLayout2.setPadding(m7Var3.b(24), m7Var3.b(16), m7Var3.b(24), m7Var3.b(16));
                                                final kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
                                                final kotlin.jvm.internal.t tVar2 = new kotlin.jvm.internal.t();
                                                linearLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: ge.l7
                                                    @Override // android.view.View.OnTouchListener
                                                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                                        int actionMasked = motionEvent.getActionMasked();
                                                        kotlin.jvm.internal.t tVar3 = tVar;
                                                        kotlin.jvm.internal.t tVar4 = tVar2;
                                                        if (actionMasked == 0) {
                                                            tVar3.f9985t = motionEvent.getX();
                                                            tVar4.f9985t = motionEvent.getY();
                                                            return true;
                                                        }
                                                        if (actionMasked != 1) {
                                                            return true;
                                                        }
                                                        float y10 = motionEvent.getY() - tVar4.f9985t;
                                                        m7 m7Var4 = m7Var3;
                                                        if (y10 <= m7Var4.b(48) || motionEvent.getY() - tVar4.f9985t <= Math.abs(motionEvent.getX() - tVar3.f9985t)) {
                                                            view2.performClick();
                                                            return true;
                                                        }
                                                        m7Var4.f6564o = true;
                                                        m7Var4.d();
                                                        return true;
                                                    }
                                                });
                                                ImageView imageView = new ImageView(nativeReelsBlockerService2);
                                                imageView.setImageResource(R.drawable.ic_lock_lock);
                                                linearLayout2.addView(imageView, new LinearLayout.LayoutParams(m7Var3.b(28), m7Var3.b(28)));
                                                m7Var3.f6557g = imageView;
                                                TextView textView = new TextView(nativeReelsBlockerService2);
                                                textView.setText(com.sociallite.android.R.string.platform_sheet_locked_target_discover);
                                                textView.setTextSize(18.0f);
                                                textView.setGravity(17);
                                                textView.setTypeface(null, 1);
                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                                layoutParams.topMargin = m7Var3.b(12);
                                                linearLayout2.addView(textView, layoutParams);
                                                m7Var3.f6556f = textView;
                                                Button button = new Button(nativeReelsBlockerService2);
                                                button.setText(com.sociallite.android.R.string.ig_native_show_stories);
                                                button.setAllCaps(false);
                                                button.setTextSize(16.0f);
                                                button.setGravity(17);
                                                button.setMinHeight(m7Var3.b(48));
                                                button.setMinimumHeight(m7Var3.b(48));
                                                button.setPadding(m7Var3.b(22), m7Var3.b(12), m7Var3.b(22), m7Var3.b(12));
                                                GradientDrawable gradientDrawable = new GradientDrawable();
                                                gradientDrawable.setCornerRadius(m7Var3.b(16));
                                                button.setBackground(gradientDrawable);
                                                button.setOnClickListener(new p4(m7Var3, 2));
                                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                                layoutParams2.topMargin = m7Var3.b(16);
                                                linearLayout2.addView(button, layoutParams2);
                                                m7Var3.f6558h = button;
                                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(rect9.width(), rect9.height(), rect9.left, rect9.top, 2032, 296, -1);
                                                layoutParams3.gravity = 51;
                                                layoutParams3.setTitle("SocialLite Snapchat Discover");
                                                try {
                                                    windowManager.addView(linearLayout2, layoutParams3);
                                                    m7Var3.f6555e = linearLayout2;
                                                } catch (RuntimeException unused3) {
                                                    m7Var3.f6556f = null;
                                                    m7Var3.f6557g = null;
                                                    m7Var3.f6558h = null;
                                                }
                                            } else {
                                                ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                                                layoutParams4.getClass();
                                                WindowManager.LayoutParams layoutParams5 = (WindowManager.LayoutParams) layoutParams4;
                                                if (layoutParams5.x != rect9.left || layoutParams5.y != rect9.top || layoutParams5.width != rect9.width() || layoutParams5.height != rect9.height()) {
                                                    layoutParams5.x = rect9.left;
                                                    layoutParams5.y = rect9.top;
                                                    layoutParams5.width = rect9.width();
                                                    layoutParams5.height = rect9.height();
                                                    try {
                                                        windowManager.updateViewLayout(m7Var3.f6555e, layoutParams5);
                                                    } catch (Throwable unused4) {
                                                    }
                                                }
                                            }
                                            LinearLayout linearLayout3 = m7Var3.f6555e;
                                            if (linearLayout3 != null) {
                                                linearLayout3.setBackgroundColor(z21 ? -16777216 : -1);
                                            }
                                            TextView textView2 = m7Var3.f6556f;
                                            if (textView2 != null) {
                                                textView2.setTextColor(i16);
                                            }
                                            ImageView imageView2 = m7Var3.f6557g;
                                            if (imageView2 != null) {
                                                imageView2.setColorFilter(i16);
                                            }
                                            ImageView imageView3 = m7Var3.f6557g;
                                            if (imageView3 != null) {
                                                imageView3.setVisibility(rect9.height() >= m7Var3.b(208) ? 0 : 8);
                                            }
                                            TextView textView3 = m7Var3.f6556f;
                                            if (textView3 != null) {
                                                textView3.setVisibility(rect9.height() >= m7Var3.b(160) ? 0 : 8);
                                            }
                                            Button button2 = m7Var3.f6558h;
                                            if (button2 != null) {
                                                button2.setVisibility(rect9.height() >= m7Var3.b(96) ? 0 : 8);
                                                button2.setEnabled(m7Var3.f6559i == 0);
                                                button2.setTextColor(z21 ? -16777216 : -1);
                                                Drawable background = button2.getBackground();
                                                background.getClass();
                                                ((GradientDrawable) background).setColor(i16);
                                            }
                                        }
                                    }
                                }
                                if (m7Var3.l || m7Var3.f6555e == null) {
                                    return;
                                }
                                handler3.removeCallbacks(gVar);
                                handler3.postDelayed(gVar, m7Var3.f6559i > 0 ? 300L : 150L);
                            }
                        });
                    }
                });
                return;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                s7 s7Var = (s7) this.f228u;
                if (!s7Var.c()) {
                    s7Var.a();
                    return;
                } else {
                    if (s7Var.f6843e) {
                        return;
                    }
                    s7Var.f6843e = true;
                    s7Var.f6841c.execute(new q7(s7Var.f6844f, 0, s7Var));
                    return;
                }
            case 17:
                h8 h8Var = (h8) this.f228u;
                if (h8Var.f6256o || !h8Var.a()) {
                    h8Var.d();
                    return;
                } else {
                    if (h8Var.f6255n) {
                        return;
                    }
                    h8Var.f6255n = true;
                    h8Var.f6245c.execute(new e9.b(h8Var, h8Var.f6246d.get()));
                    return;
                }
            case 18:
                try {
                    i0.B.f1273y.a(new b7.c((lc) this.f228u, 3));
                    return;
                } catch (Exception e11) {
                    z.u("[USAGE-LIFECYCLE-V2] ProcessLifecycleOwner observer install failed: ", e11.getMessage(), "UsageTracker");
                    return;
                }
            case 19:
                h2.u uVar = (h2.u) this.f228u;
                uVar.M0 = false;
                MotionEvent motionEvent = uVar.G0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    uVar.C(motionEvent);
                    return;
                } else {
                    w4.d.l("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 20:
                f0 f0Var = (f0) this.f228u;
                Trace.beginSection("measureAndLayout");
                try {
                    f0Var.f7432d.p(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        f0Var.j();
                        Trace.endSection();
                        f0Var.J = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 21:
                h5.k kVar = (h5.k) this.f228u;
                Surface surface = kVar.A;
                if (surface != null) {
                    Iterator it = kVar.f7712t.iterator();
                    while (it.hasNext()) {
                        ((v4.u) it.next()).f22061t.p(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f7718z;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f7718z = null;
                kVar.A = null;
                return;
            case 22:
                i9.e eVar = (i9.e) this.f228u;
                if (p9.a.f16774a.contains(i9.e.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = eVar.f8529t;
                    View viewB = e9.e.b((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewB != null && activity != null) {
                        ArrayList arrayListA = i9.c.a(viewB);
                        int size = arrayListA.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayListA.get(i13);
                            i13++;
                            View view = (View) obj;
                            if (!y8.f.b(view)) {
                                String strD = i9.c.d(view);
                                if (strD.length() > 0 && strD.length() <= 300) {
                                    HashSet hashSet = i9.f.f8532e;
                                    String localClassName = activity.getLocalClassName();
                                    localClassName.getClass();
                                    i9.a.b(view, viewB, localClassName);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                } catch (Throwable th4) {
                    p9.a.a(th4, i9.e.class);
                    return;
                }
            case 23:
                j1.c cVar = (j1.c) this.f228u;
                boolean zE = cVar.e();
                s.r rVar3 = cVar.G;
                h2.u uVar2 = cVar.f8574t;
                if (zE) {
                    uVar2.p(true);
                    cVar.i(uVar2.getSemanticsOwner().a(), cVar.H);
                    cVar.g(uVar2.getSemanticsOwner().a(), cVar.H);
                    s.r rVarD = cVar.d();
                    int[] iArr = rVarD.b;
                    long[] jArr2 = rVarD.f19212a;
                    int length = jArr2.length - 2;
                    char c12 = 7;
                    int i14 = 8;
                    if (length >= 0) {
                        int i15 = 0;
                        j10 = 128;
                        j11 = 255;
                        while (true) {
                            long j14 = jArr2[i15];
                            int[] iArr2 = iArr;
                            if ((((~j14) << c12) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i16 = 8 - ((~(i15 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j14 & 255) < 128) {
                                        int i18 = iArr2[(i15 << 3) + i17];
                                        c11 = c12;
                                        n2 n2Var = (n2) rVar3.f(i18);
                                        o2 o2Var = (o2) rVarD.f(i18);
                                        n2.p pVar4 = o2Var != null ? o2Var.f7553a : pVar3;
                                        if (pVar4 == null) {
                                            ?? r23 = pVar3;
                                            bb.a.f0("no value for specified key");
                                            throw r23;
                                        }
                                        pVar2 = pVar3;
                                        int i19 = pVar4.f15090g;
                                        n2.k kVar2 = pVar4.f15087d;
                                        i2 = i14;
                                        LinkedHashMap linkedHashMap = kVar2.f15079t;
                                        if (n2Var == null) {
                                            Iterator it2 = kVar2.iterator();
                                            while (it2.hasNext()) {
                                                Object key = ((Map.Entry) it2.next()).getKey();
                                                s.r rVar4 = rVarD;
                                                n2.v vVar = n2.s.f15117u;
                                                if (kotlin.jvm.internal.l.a(key, vVar)) {
                                                    Object obj2 = linkedHashMap.get(vVar);
                                                    if (obj2 == null) {
                                                        obj2 = pVar2;
                                                    }
                                                    List list = (List) obj2;
                                                    cVar.h(i19, String.valueOf(list != null ? (p2.f) te.k.X(list) : pVar2));
                                                }
                                                rVarD = rVar4;
                                            }
                                            rVar2 = rVarD;
                                        } else {
                                            rVar2 = rVarD;
                                            Iterator it3 = kVar2.iterator();
                                            while (it3.hasNext()) {
                                                n2.v vVar2 = (n2.v) ((Map.Entry) it3.next()).getKey();
                                                Iterator it4 = it3;
                                                n2.v vVar3 = n2.s.f15117u;
                                                if (kotlin.jvm.internal.l.a(vVar2, vVar3)) {
                                                    Object obj3 = n2Var.f7542a.f15079t.get(vVar3);
                                                    if (obj3 == null) {
                                                        obj3 = pVar2;
                                                    }
                                                    List list2 = (List) obj3;
                                                    Object obj4 = list2 != null ? (p2.f) te.k.X(list2) : pVar2;
                                                    Object obj5 = linkedHashMap.get(vVar3);
                                                    if (obj5 == null) {
                                                        obj5 = pVar2;
                                                    }
                                                    List list3 = (List) obj5;
                                                    Object obj6 = list3 != null ? (p2.f) te.k.X(list3) : pVar2;
                                                    if (!kotlin.jvm.internal.l.a(obj4, obj6)) {
                                                        cVar.h(i19, String.valueOf(obj6));
                                                    }
                                                }
                                                it3 = it4;
                                            }
                                        }
                                    } else {
                                        pVar2 = pVar3;
                                        rVar2 = rVarD;
                                        c11 = c12;
                                        i2 = i14;
                                    }
                                    j14 >>= i2;
                                    i17++;
                                    pVar3 = pVar2;
                                    c12 = c11;
                                    i14 = i2;
                                    rVarD = rVar2;
                                }
                                pVar = pVar3;
                                rVar = rVarD;
                                c10 = c12;
                                if (i16 == i14) {
                                }
                            } else {
                                pVar = pVar3;
                                rVar = rVarD;
                                c10 = c12;
                            }
                            if (i15 != length) {
                                i15++;
                                iArr = iArr2;
                                pVar3 = pVar;
                                c12 = c10;
                                rVarD = rVar;
                                i14 = 8;
                            }
                        }
                    } else {
                        c10 = 7;
                        j10 = 128;
                        j11 = 255;
                    }
                    rVar3.a();
                    s.r rVarD2 = cVar.d();
                    int[] iArr3 = rVarD2.b;
                    Object[] objArr = rVarD2.f19213c;
                    long[] jArr3 = rVarD2.f19212a;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i20 = 0;
                        while (true) {
                            long j15 = jArr3[i20];
                            if ((((~j15) << c10) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                int i22 = 0;
                                while (i22 < i21) {
                                    if ((j15 & j11) < j10) {
                                        int i23 = (i20 << 3) + i22;
                                        rVar3.h(iArr3[i23], new n2(((o2) objArr[i23]).f7553a, cVar.d()));
                                    }
                                    j15 >>= 8;
                                    i22++;
                                    jArr3 = jArr3;
                                }
                                jArr = jArr3;
                                if (i21 == 8) {
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i20 != length2) {
                                i20++;
                                jArr3 = jArr;
                            }
                        }
                    }
                    cVar.H = new n2(uVar2.getSemanticsOwner().a(), cVar.d());
                    cVar.I = false;
                    return;
                }
                return;
            case 24:
                k3.c cVar2 = (k3.c) this.f228u;
                if (!cVar2.f9046v) {
                    w4.d.l("bindService must be called before unbind");
                    return;
                } else {
                    cVar2.f9046v = false;
                    cVar2.f9045u.unbindService(cVar2);
                    return;
                }
            case 25:
                k9.m.g((k9.m) this.f228u);
                return;
            case 26:
                k9.p pVar5 = (k9.p) this.f228u;
                k9.n nVar = pVar5.f9238a;
                k9.q qVar = k9.q.f9240a;
                nVar.g(k9.q.b(pVar5.b));
                return;
            case 27:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f228u;
                if (coroutineWorker.f1359y.f22732t instanceof w7.a) {
                    coroutineWorker.f1358x.e(null);
                    return;
                }
                return;
            case 28:
                oe.q.b((oe.q) this.f228u);
                return;
            default:
                ((oe.z) this.f228u).b(false);
                return;
        }
    }
}
