package ge;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.FrameLayout;
import com.sociallite.android.data.NativeReelsBlockerService;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q7 implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f6751v;

    public /* synthetic */ q7(int i2, int i10, Object obj) {
        this.f6749t = i10;
        this.f6751v = obj;
        this.f6750u = i2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x0166 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:57:0x00c1, B:59:0x00c7, B:64:0x00d5, B:68:0x00df, B:72:0x00e8, B:75:0x00ef, B:76:0x00f2, B:93:0x0127, B:94:0x012d, B:96:0x0133, B:97:0x013d, B:98:0x0146, B:100:0x014c, B:101:0x0156, B:110:0x0166, B:106:0x015f, B:107:0x0162, B:62:0x00cf, B:77:0x00f6, B:78:0x0100, B:80:0x0106, B:82:0x0113, B:88:0x011d, B:90:0x0121, B:103:0x0159), top: B:121:0x00c1, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Object lVar;
        Object next;
        switch (this.f6749t) {
            case 0:
                s7 s7Var = (s7) this.f6751v;
                NativeReelsBlockerService nativeReelsBlockerService = s7Var.f6840a;
                try {
                    AccessibilityNodeInfo rootInActiveWindow = Build.VERSION.SDK_INT >= 33 ? nativeReelsBlockerService.getRootInActiveWindow(0) : nativeReelsBlockerService.getRootInActiveWindow();
                    AccessibilityWindowInfo window = rootInActiveWindow != null ? rootInActiveWindow.getWindow() : null;
                    boolean z10 = false;
                    if (window != null && window.getType() == 1) {
                        z10 = true;
                    }
                    if (window != null) {
                        window.recycle();
                    }
                    if (z10) {
                        if (rootInActiveWindow != null) {
                            try {
                                lVar = c.P(rootInActiveWindow);
                            } catch (Throwable th) {
                                rootInActiveWindow.recycle();
                                throw th;
                            }
                        } else {
                            lVar = null;
                        }
                        if (rootInActiveWindow != null) {
                            rootInActiveWindow.recycle();
                        }
                    } else {
                        if (rootInActiveWindow != null) {
                            rootInActiveWindow.recycle();
                        }
                        List<AccessibilityWindowInfo> windows = nativeReelsBlockerService.getWindows();
                        try {
                            windows.getClass();
                            Iterator<T> it = windows.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    AccessibilityWindowInfo accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                                    if (!accessibilityWindowInfo.isFocused() || accessibilityWindowInfo.getType() != 1) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            AccessibilityWindowInfo accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
                            rootInActiveWindow = accessibilityWindowInfo2 != null ? accessibilityWindowInfo2.getRoot() : null;
                            Iterator<T> it2 = windows.iterator();
                            while (it2.hasNext()) {
                                ((AccessibilityWindowInfo) it2.next()).recycle();
                            }
                            if (rootInActiveWindow != null) {
                                lVar = c.P(rootInActiveWindow);
                            } else {
                                lVar = null;
                            }
                            if (rootInActiveWindow != null) {
                                rootInActiveWindow.recycle();
                            }
                        } catch (Throwable th2) {
                            windows.getClass();
                            Iterator<T> it3 = windows.iterator();
                            while (it3.hasNext()) {
                                ((AccessibilityWindowInfo) it3.next()).recycle();
                            }
                            throw th2;
                        }
                    }
                    break;
                } catch (Throwable th3) {
                    lVar = new se.l(th3);
                }
                s7Var.b.post(new r7(s7Var, this.f6750u, (t7) (lVar instanceof se.l ? null : lVar), 0));
                return;
            case 1:
                ((IntConsumer) this.f6751v).accept(this.f6750u);
                return;
            case 2:
                ((b6.g) this.f6751v).l(this.f6750u);
                return;
            case 3:
                oe.q qVar = (oe.q) this.f6751v;
                if (!qVar.H && qVar.G == this.f6750u && qVar.D.getVisibility() == 0) {
                    qVar.v();
                    return;
                }
                return;
            case 4:
                oe.r0 r0Var = (oe.r0) this.f6751v;
                if (this.f6750u == r0Var.M && r0Var.L) {
                    r0Var.p();
                    return;
                }
                return;
            case 5:
                oe.r1 r1Var = (oe.r1) this.f6751v;
                if (this.f6750u != r1Var.K || r1Var.f16325b0) {
                    return;
                }
                r1Var.C.setVisibility(8);
                return;
            default:
                v4.c cVar = ((v4.b) this.f6751v).b;
                int i2 = this.f6750u;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        cVar.b(3);
                        return;
                    }
                    v4.u uVar = cVar.f21866c;
                    if (uVar != null) {
                        v4.x xVar = uVar.f22061t;
                        boolean zJ = xVar.j();
                        xVar.r(0, zJ ? 2 : 1, zJ);
                    }
                    cVar.b(2);
                    return;
                }
                if (i2 == -1) {
                    v4.u uVar2 = cVar.f21866c;
                    if (uVar2 != null) {
                        v4.x xVar2 = uVar2.f22061t;
                        boolean zJ2 = xVar2.j();
                        xVar2.r(-1, zJ2 ? 2 : 1, zJ2);
                    }
                    cVar.a();
                    return;
                }
                if (i2 != 1) {
                    ke.c1.v("Unknown focus change type: ", i2, "AudioFocusManager");
                    return;
                }
                cVar.b(1);
                v4.u uVar3 = cVar.f21866c;
                if (uVar3 != null) {
                    v4.x xVar3 = uVar3.f22061t;
                    xVar3.r(1, 1, xVar3.j());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ q7(int i2, FrameLayout frameLayout, int i10) {
        this.f6749t = i10;
        this.f6750u = i2;
        this.f6751v = frameLayout;
    }
}
