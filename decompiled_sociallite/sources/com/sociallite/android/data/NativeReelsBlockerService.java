package com.sociallite.android.data;

import a8.c;
import af.b;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.accessibilityservice.GestureDescription;
import android.app.KeyguardManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.FrameLayout;
import androidx.credentials.CredentialOption;
import androidx.lifecycle.z;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.j1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import d7.a;
import e4.w0;
import fe.l1;
import fe.s0;
import g5.w;
import ge.a5;
import ge.b5;
import ge.c2;
import ge.c3;
import ge.c7;
import ge.ca;
import ge.d2;
import ge.e4;
import ge.e5;
import ge.e7;
import ge.e8;
import ge.f3;
import ge.g6;
import ge.h3;
import ge.h8;
import ge.i3;
import ge.i7;
import ge.i8;
import ge.j8;
import ge.ja;
import ge.k8;
import ge.l5;
import ge.m7;
import ge.m8;
import ge.mb;
import ge.n4;
import ge.o4;
import ge.p8;
import ge.q1;
import ge.q6;
import ge.qa;
import ge.r8;
import ge.s7;
import ge.s8;
import ge.t4;
import ge.t7;
import ge.u2;
import ge.u6;
import ge.u7;
import ge.v4;
import ge.v5;
import ge.v6;
import ge.v7;
import ge.w4;
import ge.w6;
import ge.x4;
import ge.x6;
import ge.x7;
import ge.y4;
import ge.y6;
import ge.y7;
import ge.z4;
import ge.z6;
import ge.z9;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import k9.d;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;
import qf.e;
import qf.i;
import qf.k;
import qf.r;
import se.o;
import te.a0;
import te.j;
import te.s;
import te.t;
import u7.f;

/* JADX INFO: loaded from: classes.dex */
public final class NativeReelsBlockerService extends AccessibilityService {
    public static final i A0;
    public static final i B0;
    public static final i C0;
    public static final List D0;
    public static final List E0;
    public static final i F0;
    public static final i G0;
    public static final List H0;
    public static final Set I0;
    public static volatile boolean J0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final List f3486t0 = f.w("com.instagram.android:id/clips_viewer_view_pager", "com.instagram.android:id/clips_viewer_container", "com.instagram.android:id/clips_viewer_video_layout");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final List f3487u0 = f.w("com.google.android.youtube:id/reel_recycler", "com.google.android.youtube:id/reel_player_page_container", "com.google.android.youtube:id/shorts_player_container");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Set f3488v0 = a0.F("com.zhiliaoapp.musically", "com.ss.android.ugc.trill");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final List f3489w0 = f.w("Back to chat", "Reply privately");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final List f3490x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final List f3491y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final i f3492z0;
    public i3 C;
    public long D;
    public long E;
    public boolean F;
    public String I;
    public long J;
    public String R;
    public String U;
    public int V;
    public long W;
    public String X;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f3493a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public v5 f3494b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public h8 f3495c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public s7 f3496d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public m7 f3497e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e5 f3498f0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f3500h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ca f3501i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ca f3502j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public mb f3503k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public p8 f3504l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f3505m0;
    public long n0;
    public long p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f3506q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f3507r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final List f3508s0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FrameLayout f3510u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n4 f3511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t4 f3512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u7.i f3513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u7.i f3514y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f3515z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f3509t = new Handler(Looper.getMainLooper());
    public final x4 A = new x4(new y6(this, 0), new y6(this, 2));
    public final w6 B = new w6(new c7(this, 0), new y6(this, 7), new c(20), new z6(this, 5));
    public final l1 G = new l1(this, 2);
    public final d H = new d(this, 3);
    public String K = "";
    public final c2 L = new c2();
    public final a M = new a();
    public final g6 N = new g6();
    public final u6 O = new u6(0);
    public final u6 P = new u6(1);
    public final o Q = new o(new z6(this, 6));
    public final w S = new w();
    public final y7 T = new y7();
    public final b5 Y = new b5();
    public final u6 Z = new u6(1);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final o f3499g0 = new o(new z6(this, 7));
    public final o4 o0 = new o4(new z6(this, 8));

    static {
        f.w("message", "reply", "chat", "send", "conversation", "recipient", "seen", "delivered", "typing", "@", "shared with you", "sent by", "sent to", "sent you", "from ", "back to", "return to", "close", "friend", "friends", "your", "your reel", "your story", "shared", "swipe up", "swipe to reply");
        f3490x0 = f.w(" · original audio", "original audio", "'s reels", "audio original", " reels de ", "المقطع الصوتي الأصلي", "الصوت الأصلي", "ريلز", "originalton", " reels von ", " reel di ");
        f3491y0 = f.w("swipe up to see more", "navigate to your reels profile", "accedi al tuo profilo di reels", "reel details", "dettagli del reel");
        f3492z0 = new i("^(reels|ريلز|video|videos|vídeo|vidéo|watch|الفيديو)([,،]|$)", 0);
        A0 = new i("^(home|inicio|início|accueil|startseite|الرئيسية|الصفحة الرئيسية)([,،]|$)", 0);
        B0 = new i("^(marketplace|ماركت بليس)([,،]|$)", 0);
        C0 = new i("[,،]\\s*[^,،]*[\\d٠-٩۰-۹]+[^,،]*[\\d٠-٩۰-۹]+", 0);
        D0 = f.w("message", "message…", "aa message", "send a message", "message ", "type a message", "mensaje", "mensaje…", "escribe un mensaje", "escribir un mensaje", "écris un message", "écrire un message", "رسالة", "اكتب رسالة", "أرسل رسالة");
        E0 = f.w("search messenger", "search chats", "search messages", "buscar en messenger", "buscar en chats", "buscar mensajes", "rechercher dans messenger", "rechercher dans les chats", "rechercher un message", "بحث في messenger", "البحث في messenger", "بحث في الدردشات");
        F0 = new i("^(.+?)\\s*[·•]\\s*(Original audio|Audio original|Audio originale|Originalton|المقطع الصوتي الأصلي|الصوت الأصلي)", 0);
        G0 = new i("^(View\\s+(.+?)'s\\s+reels|Ver\\s+(?:los\\s+)?reels\\s+de\\s+(.+?)|Voir\\s+(?:les\\s+)?reels\\s+de\\s+(.+?)|Visualizza\\s+(?:i\\s+)?reel\\s+di\\s+(.+?)|(?:عرض|شاهد|مشاهدة)\\s+(?:(?:مقاطع|مقطع)\\s+)?ريلز\\s+(?:من\\s+)?(.+?))\\s*$", 0);
        H0 = f.w("chrome_subscribe_button", "AdsFloatingPillView", "sc_composer_ad_cta_tappable_view");
        f.w("for you", "foryou", "おすすめ", "para ti", "pour vous", "für dich", "fur dich", "para você", "para voce", "per te", "لك");
        f.w("following", "フォロー中", "siguiendo", "abonnements", "folge ich", "seguindo", "seguiti", "أتابعهم");
        f.w("home", "inicio", "início", "accueil", "startseite", "pagina iniziale", "الرئيسية", "الصفحة الرئيسية");
        I0 = a0.F("com.instagram.android", "com.google.android.youtube", "com.snapchat.android", "com.facebook.katana", "com.facebook.orca", "com.zhiliaoapp.musically", "com.ss.android.ugc.trill", "com.twitter.android", "com.twitter.android.lite");
    }

    public NativeReelsBlockerService() {
        new LinkedHashSet();
        this.f3508s0 = f.w("home", "inicio", "início", "accueil", "startseite", "الصفحة الرئيسية", "الرئيسية", "reels", "ريلز", "video", "videos", "vídeo", "vidéo", "watch", "الفيديو", "marketplace", "ماركت بليس", "notifications", "notification", "notificaciones", "notificações", "benachrichtigungen", "الإشعارات", "profile", "perfil", "profil", "الملف الشخصي", "menu", "menú", "menü", "القائمة", "friends", "amigos", "amis", "freunde", "الأصدقاء", "groups", "grupos", "groupes", "gruppen", "gruppi", "المجموعات", "グループ");
        new LinkedHashSet();
    }

    public static boolean A(Rect rect, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (!accessibilityNodeInfo.isVisibleToUser()) {
            return false;
        }
        Rect rectI = w0.i(accessibilityNodeInfo);
        return rectI.width() > rect.width() / 2 && rectI.height() > rect.height() / 2 && Rect.intersects(rectI, rect);
    }

    public static boolean B(AccessibilityNodeInfo accessibilityNodeInfo, List list) {
        Rect rectI = w0.i(accessibilityNodeInfo);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId((String) it.next());
            if (listFindAccessibilityNodeInfosByViewId == null) {
                listFindAccessibilityNodeInfosByViewId = s.f20249t;
            }
            try {
                List<AccessibilityNodeInfo> list2 = listFindAccessibilityNodeInfosByViewId;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (AccessibilityNodeInfo accessibilityNodeInfo2 : list2) {
                        accessibilityNodeInfo2.getClass();
                        if (A(rectI, accessibilityNodeInfo2)) {
                            Iterator<T> it2 = listFindAccessibilityNodeInfosByViewId.iterator();
                            while (it2.hasNext()) {
                                ((AccessibilityNodeInfo) it2.next()).recycle();
                            }
                            return true;
                        }
                    }
                }
                Iterator<T> it3 = listFindAccessibilityNodeInfosByViewId.iterator();
                while (it3.hasNext()) {
                    ((AccessibilityNodeInfo) it3.next()).recycle();
                }
            } catch (Throwable th) {
                Iterator<T> it4 = listFindAccessibilityNodeInfosByViewId.iterator();
                while (it4.hasNext()) {
                    ((AccessibilityNodeInfo) it4.next()).recycle();
                }
                throw th;
            }
        }
        u uVar = new u();
        uVar.f9986t = 200;
        return C(uVar, list, rectI, accessibilityNodeInfo, 0);
    }

    public static final boolean C(u uVar, List list, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        if (i2 <= 32) {
            int i10 = uVar.f9986t;
            uVar.f9986t = i10 - 1;
            if (i10 > 0) {
                if (list.contains(accessibilityNodeInfo.getViewIdResourceName()) && A(rect, accessibilityNodeInfo)) {
                    return true;
                }
                int childCount = accessibilityNodeInfo.getChildCount();
                for (int i11 = 0; i11 < childCount && uVar.f9986t > 0; i11++) {
                    AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i11);
                    if (child != null) {
                        try {
                            boolean zC = C(uVar, list, rect, child, i2 + 1);
                            child.recycle();
                            if (zC) {
                                return true;
                            }
                        } catch (Throwable th) {
                            child.recycle();
                            throw th;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean D(AccessibilityNodeInfo accessibilityNodeInfo) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.snapchat.android:id/ngs_spotlight_icon_container");
        boolean z10 = false;
        if (listFindAccessibilityNodeInfosByViewId == null) {
            return false;
        }
        List<AccessibilityNodeInfo> list = listFindAccessibilityNodeInfosByViewId;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((AccessibilityNodeInfo) it.next()).isSelected()) {
                    z10 = true;
                    break;
                }
            }
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((AccessibilityNodeInfo) it2.next()).recycle();
        }
        return z10;
    }

    public static boolean E(AccessibilityNodeInfo accessibilityNodeInfo) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.instagram.android:id/clips_tab");
        boolean z10 = false;
        if (listFindAccessibilityNodeInfosByViewId != null) {
            List<AccessibilityNodeInfo> list = listFindAccessibilityNodeInfosByViewId;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((AccessibilityNodeInfo) it.next()).isSelected()) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        if (listFindAccessibilityNodeInfosByViewId != null) {
            Iterator<T> it2 = listFindAccessibilityNodeInfosByViewId.iterator();
            while (it2.hasNext()) {
                ((AccessibilityNodeInfo) it2.next()).recycle();
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0061 A[SYNTHETIC] */
    public static boolean Q(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        int childCount;
        int i10;
        AccessibilityNodeInfo child;
        boolean zQ;
        if (i2 <= 200) {
            if (!l.a(accessibilityNodeInfo.getViewIdResourceName(), "com.instagram.android:id/direct_tab")) {
                childCount = accessibilityNodeInfo.getChildCount();
                for (i10 = 0; i10 < childCount; i10++) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child == null) {
                        zQ = Q(child, i2 + 1);
                        child.recycle();
                        if (zQ) {
                        }
                    }
                }
            } else if (!accessibilityNodeInfo.isClickable() || !accessibilityNodeInfo.performAction(16)) {
                AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent();
                int i11 = 0;
                while (parent != null && i11 < 6) {
                    if (parent.isClickable()) {
                        boolean zPerformAction = parent.performAction(16);
                        parent.recycle();
                        if (!zPerformAction) {
                            break;
                        }
                    } else {
                        AccessibilityNodeInfo parent2 = parent.getParent();
                        parent.recycle();
                        i11++;
                        parent = parent2;
                    }
                }
                childCount = accessibilityNodeInfo.getChildCount();
                while (i10 < childCount) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child == null) {
                        zQ = Q(child, i2 + 1);
                        child.recycle();
                        if (zQ) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean R(u uVar, hf.c cVar, AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        if (i2 <= 120) {
            int i10 = uVar.f9986t;
            uVar.f9986t = i10 - 1;
            if (i10 > 0) {
                if (!((Boolean) cVar.invoke(accessibilityNodeInfo)).booleanValue()) {
                    int childCount = accessibilityNodeInfo.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i11);
                        if (child != null) {
                            try {
                                boolean zR = R(uVar, cVar, child, i2 + 1);
                                child.recycle();
                                if (zR) {
                                }
                            } catch (Throwable th) {
                                child.recycle();
                                throw th;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[EDGE_INSN: B:22:0x0045->B:30:0x005c BREAK  A[LOOP:0: B:17:0x002b->B:42:?], EDGE_INSN: B:24:0x004d->B:30:0x005c BREAK  A[LOOP:0: B:17:0x002b->B:42:?], EDGE_INSN: B:26:0x0053->B:30:0x005c BREAK  A[LOOP:0: B:17:0x002b->B:42:?], EDGE_INSN: B:28:0x0059->B:30:0x005c BREAK  A[LOOP:0: B:17:0x002b->B:42:?]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0076 A[SYNTHETIC] */
    public static boolean S(AccessibilityNodeInfo accessibilityNodeInfo, List list, Rect rect, int i2) {
        int childCount;
        int i10;
        AccessibilityNodeInfo child;
        boolean zS;
        if (i2 <= 120) {
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            String string = contentDescription != null ? contentDescription.toString() : null;
            if (string != null) {
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    childCount = accessibilityNodeInfo.getChildCount();
                    for (i10 = 0; i10 < childCount; i10++) {
                        child = accessibilityNodeInfo.getChild(i10);
                        if (child != null) {
                            zS = S(child, list, rect, i2 + 1);
                            child.recycle();
                            if (zS) {
                            }
                        }
                    }
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (k.t0(string, (String) it.next(), true)) {
                            Rect rectI = w0.i(accessibilityNodeInfo);
                            if (!accessibilityNodeInfo.isVisibleToUser() || rectI.width() <= 10 || rectI.height() <= 10 || !Rect.intersects(rectI, rect)) {
                                break;
                            }
                        }
                    }
                    childCount = accessibilityNodeInfo.getChildCount();
                    while (i10 < childCount) {
                        child = accessibilityNodeInfo.getChild(i10);
                        if (child != null) {
                            zS = S(child, list, rect, i2 + 1);
                            child.recycle();
                            if (zS) {
                            }
                        }
                    }
                }
            } else {
                childCount = accessibilityNodeInfo.getChildCount();
                while (i10 < childCount) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child != null) {
                        zS = S(child, list, rect, i2 + 1);
                        child.recycle();
                        if (zS) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[EDGE_INSN: B:18:0x003d->B:26:0x0054 BREAK  A[LOOP:0: B:13:0x0023->B:38:?], EDGE_INSN: B:20:0x0045->B:26:0x0054 BREAK  A[LOOP:0: B:13:0x0023->B:38:?], EDGE_INSN: B:22:0x004b->B:26:0x0054 BREAK  A[LOOP:0: B:13:0x0023->B:38:?], EDGE_INSN: B:24:0x0051->B:26:0x0054 BREAK  A[LOOP:0: B:13:0x0023->B:38:?]] */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e A[SYNTHETIC] */
    public static boolean T(AccessibilityNodeInfo accessibilityNodeInfo, List list, Rect rect, int i2) {
        int childCount;
        int i10;
        AccessibilityNodeInfo child;
        boolean zT;
        if (i2 <= 200) {
            String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
            if (viewIdResourceName != null) {
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    childCount = accessibilityNodeInfo.getChildCount();
                    for (i10 = 0; i10 < childCount; i10++) {
                        child = accessibilityNodeInfo.getChild(i10);
                        if (child != null) {
                            zT = T(child, list, rect, i2 + 1);
                            child.recycle();
                            if (zT) {
                            }
                        }
                    }
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (k.t0(viewIdResourceName, (String) it.next(), false)) {
                            Rect rectI = w0.i(accessibilityNodeInfo);
                            if (!accessibilityNodeInfo.isVisibleToUser() || rectI.width() <= 10 || rectI.height() <= 10 || !Rect.intersects(rectI, rect)) {
                                break;
                            }
                        }
                    }
                    childCount = accessibilityNodeInfo.getChildCount();
                    while (i10 < childCount) {
                        child = accessibilityNodeInfo.getChild(i10);
                        if (child != null) {
                            zT = T(child, list, rect, i2 + 1);
                            child.recycle();
                            if (zT) {
                            }
                        }
                    }
                }
            } else {
                childCount = accessibilityNodeInfo.getChildCount();
                while (i10 < childCount) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child != null) {
                        zT = T(child, list, rect, i2 + 1);
                        child.recycle();
                        if (zT) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4 A[SYNTHETIC] */
    public static boolean U(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        String string;
        String lowerCase;
        String lowerCase2;
        CharSequence text;
        String string2;
        CharSequence contentDescription;
        String string3;
        String string4;
        int childCount;
        int i10;
        AccessibilityNodeInfo child;
        boolean zU;
        if (i2 <= 120) {
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className == null || (string = className.toString()) == null) {
                string = "";
            }
            if ((accessibilityNodeInfo.isEditable() || k.t0(string, "EditText", true) || k.t0(string, "edittext", true)) && accessibilityNodeInfo.isVisibleToUser()) {
                CharSequence hintText = accessibilityNodeInfo.getHintText();
                String lowerCase3 = null;
                if (hintText == null || (string4 = hintText.toString()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = string4.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.isVisibleToUser() ? accessibilityNodeInfo : null;
                if (accessibilityNodeInfo2 == null || (contentDescription = accessibilityNodeInfo2.getContentDescription()) == null || (string3 = contentDescription.toString()) == null) {
                    lowerCase2 = null;
                } else {
                    lowerCase2 = string3.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                }
                AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo.isVisibleToUser() ? accessibilityNodeInfo : null;
                if (accessibilityNodeInfo3 != null && (text = accessibilityNodeInfo3.getText()) != null && (string2 = text.toString()) != null) {
                    lowerCase3 = string2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                }
                ArrayList arrayList = (ArrayList) j.X(new String[]{lowerCase, lowerCase2, lowerCase3});
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    String str = (String) obj;
                    if (!k.G0(str)) {
                        List<String> list = D0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (String str2 : list) {
                                if (str.equals(str2) || r.p0(str, str2, false)) {
                                }
                            }
                        }
                    }
                }
                childCount = accessibilityNodeInfo.getChildCount();
                for (i10 = 0; i10 < childCount; i10++) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child == null) {
                        zU = U(child, i2 + 1);
                        child.recycle();
                        if (zU) {
                        }
                    }
                }
            } else {
                childCount = accessibilityNodeInfo.getChildCount();
                while (i10 < childCount) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child == null) {
                        zU = U(child, i2 + 1);
                        child.recycle();
                        if (zU) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:1: B:46:0x008d->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba A[SYNTHETIC] */
    public static boolean V(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        String lowerCase;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        int childCount;
        int i10;
        AccessibilityNodeInfo child;
        boolean zV;
        List list;
        Iterator it;
        CharSequence text;
        String string;
        CharSequence contentDescription;
        String string2;
        if (i2 <= 120) {
            String lowerCase2 = null;
            AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo.isVisibleToUser() ? accessibilityNodeInfo : null;
            if (accessibilityNodeInfo3 == null || (contentDescription = accessibilityNodeInfo3.getContentDescription()) == null || (string2 = contentDescription.toString()) == null) {
                lowerCase = null;
            } else {
                lowerCase = string2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            List list2 = f3490x0;
            if (lowerCase != null) {
                List list3 = list2;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    if (accessibilityNodeInfo.isVisibleToUser()) {
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                    } else {
                        accessibilityNodeInfo2 = null;
                    }
                    if (accessibilityNodeInfo2 != null) {
                        lowerCase2 = string.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    }
                    if (lowerCase2 != null) {
                        list = list2;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (k.t0(lowerCase2, (String) it.next(), false)) {
                                }
                            }
                            childCount = accessibilityNodeInfo.getChildCount();
                            for (i10 = 0; i10 < childCount; i10++) {
                                child = accessibilityNodeInfo.getChild(i10);
                                if (child != null) {
                                    zV = V(child, i2 + 1);
                                    child.recycle();
                                    if (zV) {
                                    }
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (k.t0(lowerCase2, (String) it.next(), false)) {
                                }
                            }
                            childCount = accessibilityNodeInfo.getChildCount();
                            while (i10 < childCount) {
                                child = accessibilityNodeInfo.getChild(i10);
                                if (child != null) {
                                    zV = V(child, i2 + 1);
                                    child.recycle();
                                    if (zV) {
                                    }
                                }
                            }
                        }
                    } else {
                        childCount = accessibilityNodeInfo.getChildCount();
                        while (i10 < childCount) {
                            child = accessibilityNodeInfo.getChild(i10);
                            if (child != null) {
                                zV = V(child, i2 + 1);
                                child.recycle();
                                if (zV) {
                                }
                            }
                        }
                    }
                } else {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (k.t0(lowerCase, (String) it2.next(), false)) {
                        }
                    }
                    if (accessibilityNodeInfo.isVisibleToUser()) {
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                    } else {
                        accessibilityNodeInfo2 = null;
                    }
                    if (accessibilityNodeInfo2 != null && (text = accessibilityNodeInfo2.getText()) != null && (string = text.toString()) != null) {
                        lowerCase2 = string.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    }
                    if (lowerCase2 != null) {
                        list = list2;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (k.t0(lowerCase2, (String) it.next(), false)) {
                                }
                            }
                            childCount = accessibilityNodeInfo.getChildCount();
                            while (i10 < childCount) {
                                child = accessibilityNodeInfo.getChild(i10);
                                if (child != null) {
                                    zV = V(child, i2 + 1);
                                    child.recycle();
                                    if (zV) {
                                    }
                                }
                            }
                        } else {
                            childCount = accessibilityNodeInfo.getChildCount();
                            while (i10 < childCount) {
                                child = accessibilityNodeInfo.getChild(i10);
                                if (child != null) {
                                    zV = V(child, i2 + 1);
                                    child.recycle();
                                    if (zV) {
                                    }
                                }
                            }
                        }
                    } else {
                        childCount = accessibilityNodeInfo.getChildCount();
                        while (i10 < childCount) {
                            child = accessibilityNodeInfo.getChild(i10);
                            if (child != null) {
                                zV = V(child, i2 + 1);
                                child.recycle();
                                if (zV) {
                                }
                            }
                        }
                    }
                }
            } else {
                if (accessibilityNodeInfo.isVisibleToUser()) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                } else {
                    accessibilityNodeInfo2 = null;
                }
                if (accessibilityNodeInfo2 != null) {
                    lowerCase2 = string.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                }
                if (lowerCase2 != null) {
                    list = list2;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (k.t0(lowerCase2, (String) it.next(), false)) {
                            }
                        }
                        childCount = accessibilityNodeInfo.getChildCount();
                        while (i10 < childCount) {
                            child = accessibilityNodeInfo.getChild(i10);
                            if (child != null) {
                                zV = V(child, i2 + 1);
                                child.recycle();
                                if (zV) {
                                }
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (k.t0(lowerCase2, (String) it.next(), false)) {
                            }
                        }
                        childCount = accessibilityNodeInfo.getChildCount();
                        while (i10 < childCount) {
                            child = accessibilityNodeInfo.getChild(i10);
                            if (child != null) {
                                zV = V(child, i2 + 1);
                                child.recycle();
                                if (zV) {
                                }
                            }
                        }
                    }
                } else {
                    childCount = accessibilityNodeInfo.getChildCount();
                    while (i10 < childCount) {
                        child = accessibilityNodeInfo.getChild(i10);
                        if (child != null) {
                            zV = V(child, i2 + 1);
                            child.recycle();
                            if (zV) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean X(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        CharSequence text;
        String string;
        CharSequence contentDescription;
        String string2;
        if (i2 <= 120) {
            String string3 = null;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.isVisibleToUser() ? accessibilityNodeInfo : null;
            String string4 = (accessibilityNodeInfo2 == null || (contentDescription = accessibilityNodeInfo2.getContentDescription()) == null || (string2 = contentDescription.toString()) == null) ? null : k.Z0(string2).toString();
            AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo.isVisibleToUser() ? accessibilityNodeInfo : null;
            if (accessibilityNodeInfo3 != null && (text = accessibilityNodeInfo3.getText()) != null && (string = text.toString()) != null) {
                string3 = k.Z0(string).toString();
            }
            ArrayList arrayList = (ArrayList) j.X(new String[]{string4, string3});
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (!k.G0(str)) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    List list = E0;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (k.t0(lowerCase, (String) it.next(), false)) {
                                return true;
                            }
                        }
                    }
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i11);
                if (child != null) {
                    boolean zX = X(child, i2 + 1);
                    child.recycle();
                    if (zX) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean Y(AccessibilityNodeInfo accessibilityNodeInfo, int i2, String str) {
        if (i2 <= 200) {
            if (!l.a(accessibilityNodeInfo.getViewIdResourceName(), str) || !accessibilityNodeInfo.isVisibleToUser()) {
                int childCount = accessibilityNodeInfo.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i10);
                    if (child != null) {
                        boolean zY = Y(child, i2 + 1, str);
                        child.recycle();
                        if (zY) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[SYNTHETIC] */
    public static boolean Z(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, int i2) {
        int childCount;
        int i10;
        AccessibilityNodeInfo child;
        boolean Z;
        String string;
        String string2;
        if (i2 <= 200) {
            CharSequence text = accessibilityNodeInfo.getText();
            String string3 = null;
            String string4 = (text == null || (string2 = text.toString()) == null) ? null : k.Z0(string2).toString();
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if (contentDescription != null && (string = contentDescription.toString()) != null) {
                string3 = k.Z0(string).toString();
            }
            if ((string4 == null || !k.t0(string4, "View Profile", true)) && (string3 == null || !k.t0(string3, "View Profile", true))) {
                childCount = accessibilityNodeInfo.getChildCount();
                for (i10 = 0; i10 < childCount; i10++) {
                    child = accessibilityNodeInfo.getChild(i10);
                    if (child == null) {
                        Z = Z(child, rect, i2 + 1);
                        child.recycle();
                        if (Z) {
                        }
                    }
                }
            } else {
                Rect rectI = w0.i(accessibilityNodeInfo);
                if (!accessibilityNodeInfo.isVisibleToUser() || rectI.width() <= 10 || rectI.height() <= 10 || !Rect.intersects(rectI, rect)) {
                    childCount = accessibilityNodeInfo.getChildCount();
                    while (i10 < childCount) {
                        child = accessibilityNodeInfo.getChild(i10);
                        if (child == null) {
                            Z = Z(child, rect, i2 + 1);
                            child.recycle();
                            if (Z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String l(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == ',' || cCharAt == 1548) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            str = str.substring(0, i2);
        }
        String lowerCase = k.Z0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static String m(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        String str;
        CharSequence contentDescription;
        String string;
        if (i2 <= 120) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo.isVisibleToUser() ? accessibilityNodeInfo : null;
            String string2 = (accessibilityNodeInfo2 == null || (contentDescription = accessibilityNodeInfo2.getContentDescription()) == null || (string = contentDescription.toString()) == null) ? null : k.Z0(string).toString();
            if (string2 != null) {
                i iVar = F0;
                iVar.getClass();
                Matcher matcher = iVar.f17266t.matcher(string2);
                matcher.getClass();
                qf.f fVarE = a.a.e(matcher, 0, string2);
                if (fVarE != null && (str = (String) te.k.Y(1, fVarE.a())) != null && !k.G0(str)) {
                    return k.Z0(str).toString();
                }
                i iVar2 = G0;
                iVar2.getClass();
                Matcher matcher2 = iVar2.f17266t.matcher(string2);
                matcher2.getClass();
                qf.f fVarE2 = a.a.e(matcher2, 0, string2);
                if (fVarE2 != null) {
                    int iA = ((te.a) fVarE2.a()).a();
                    for (int i10 = 2; i10 < iA; i10++) {
                        String string3 = k.Z0((String) ((e) fVarE2.a()).get(i10)).toString();
                        if (!k.G0(string3)) {
                            return string3;
                        }
                    }
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i11);
                if (child != null) {
                    String strM = m(child, i2 + 1);
                    child.recycle();
                    if (strM != null) {
                        return strM;
                    }
                }
            }
        }
        return null;
    }

    public static String q(AccessibilityNodeInfo accessibilityNodeInfo, int i2, hf.c cVar) {
        String string;
        if (i2 <= 120) {
            CharSequence text = accessibilityNodeInfo.getText();
            String string2 = (text == null || (string = text.toString()) == null) ? null : k.Z0(string).toString();
            if (string2 != null && ((Boolean) cVar.invoke(string2)).booleanValue()) {
                return string2;
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i10);
                if (child != null) {
                    String strQ = q(child, i2 + 1, cVar);
                    child.recycle();
                    if (strQ != null) {
                        return strQ;
                    }
                }
            }
        }
        return null;
    }

    public static String r(AccessibilityNodeInfo accessibilityNodeInfo) {
        Set set = v6.f7033a;
        CharSequence packageName = accessibilityNodeInfo.getPackageName();
        if (!l.a(packageName != null ? packageName.toString() : null, "com.instagram.android")) {
            return null;
        }
        Rect rectI = w0.i(accessibilityNodeInfo);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.instagram.android:id/clips_author_username");
        if (listFindAccessibilityNodeInfosByViewId == null) {
            listFindAccessibilityNodeInfosByViewId = s.f20249t;
        }
        try {
            Iterator<T> it = listFindAccessibilityNodeInfosByViewId.iterator();
            while (it.hasNext()) {
                v6.d(rectI, linkedHashSet, (AccessibilityNodeInfo) it.next());
            }
            Iterator<T> it2 = listFindAccessibilityNodeInfosByViewId.iterator();
            while (it2.hasNext()) {
                ((AccessibilityNodeInfo) it2.next()).recycle();
            }
            if (listFindAccessibilityNodeInfosByViewId.isEmpty()) {
                u uVar = new u();
                uVar.f9986t = 100;
                v6.e(0, rectI, accessibilityNodeInfo, linkedHashSet, uVar);
            }
            return (String) te.k.l0(linkedHashSet);
        } catch (Throwable th) {
            Iterator<T> it3 = listFindAccessibilityNodeInfosByViewId.iterator();
            while (it3.hasNext()) {
                ((AccessibilityNodeInfo) it3.next()).recycle();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009d A[SYNTHETIC] */
    public static final boolean t(int i2, AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        int childCount;
        int i11;
        AccessibilityNodeInfo child;
        boolean zT;
        String lowerCase;
        String string;
        String string2;
        if (i10 <= 120) {
            Rect rectI = w0.i(accessibilityNodeInfo);
            if (!accessibilityNodeInfo.isVisibleToUser() || rectI.isEmpty() || rectI.centerY() >= i2) {
                childCount = accessibilityNodeInfo.getChildCount();
                for (i11 = 0; i11 < childCount; i11++) {
                    child = accessibilityNodeInfo.getChild(i11);
                    if (child != null) {
                        zT = t(i2, child, i10 + 1);
                        child.recycle();
                        if (zT) {
                        }
                    }
                }
            } else {
                List<CharSequence> listW = f.w(accessibilityNodeInfo.getText(), accessibilityNodeInfo.getContentDescription());
                if ((listW instanceof Collection) && listW.isEmpty()) {
                    childCount = accessibilityNodeInfo.getChildCount();
                    while (i11 < childCount) {
                        child = accessibilityNodeInfo.getChild(i11);
                        if (child != null) {
                            zT = t(i2, child, i10 + 1);
                            child.recycle();
                            if (zT) {
                            }
                        }
                    }
                } else {
                    for (CharSequence charSequence : listW) {
                        Set setF = a0.F("marketplace", "ماركت بليس");
                        if (charSequence == null || (string = charSequence.toString()) == null || (string2 = k.Z0(string).toString()) == null) {
                            lowerCase = null;
                        } else {
                            lowerCase = string2.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        if (te.k.P(setF, lowerCase)) {
                        }
                    }
                    childCount = accessibilityNodeInfo.getChildCount();
                    while (i11 < childCount) {
                        child = accessibilityNodeInfo.getChild(i11);
                        if (child != null) {
                            zT = t(i2, child, i10 + 1);
                            child.recycle();
                            if (zT) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (!accessibilityNodeInfo.isSelected()) {
            Rect rectI = w0.i(accessibilityNodeInfo);
            AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent();
            int i2 = 0;
            while (parent != null) {
                int i10 = i2 + 1;
                if (i2 >= 3) {
                    break;
                }
                Rect rectI2 = w0.i(parent);
                boolean z10 = !rectI2.isEmpty() && rectI2.width() <= rectI.width() * 2 && rectI2.height() <= rectI.height() * 2 && rectI2.contains(rectI);
                boolean z11 = z10 && parent.isVisibleToUser() && parent.isSelected();
                AccessibilityNodeInfo parent2 = (!z10 || z11) ? null : parent.getParent();
                parent.recycle();
                if (!z11) {
                    parent = parent2;
                    i2 = i10;
                }
            }
            if (parent != null) {
                parent.recycle();
            }
            return false;
        }
        return true;
    }

    public final boolean F() {
        i3 i3VarB = d2.B(this);
        return i3VarB.getBoolean("nativeReelsBlocking", false) && !l.a(i3VarB.f6283a.getString("accountType", "personal"), "kid") && ((PowerManager) getSystemService(PowerManager.class)).isInteractive() && !((KeyguardManager) getSystemService(KeyguardManager.class)).isKeyguardLocked();
    }

    public final void G() {
        if (this.K.length() > 0) {
            try {
                q1.b.G(this).e(this.K);
            } catch (Exception unused) {
            }
        }
    }

    public final void H(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10) {
        this.J = j10;
        if (((Boolean) x7.j(accessibilityNodeInfo, new c7(i3Var, 3))).booleanValue()) {
            G();
        } else {
            Log.w("NativeReelsBlocker", "TikTok navigation not ready; retry on the next check");
        }
    }

    public final void I() {
        FrameLayout frameLayout = this.f3510u;
        if (frameLayout != null) {
            try {
                Object systemService = getSystemService("window");
                WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                if (windowManager != null) {
                    windowManager.removeView(frameLayout);
                }
            } catch (Exception unused) {
            }
            this.f3510u = null;
        }
    }

    public final void J() {
        this.A.b();
        t4 t4Var = this.f3512w;
        if (t4Var != null) {
            t4Var.a();
        }
        u7.i iVar = this.f3513x;
        if (iVar != null) {
            iVar.t();
        }
        u7.i iVar2 = this.f3514y;
        if (iVar2 != null) {
            iVar2.t();
        }
    }

    public final void K() {
        this.p0 = 0L;
        this.f3506q0 = 0;
        this.f3507r0 = 0;
    }

    public final boolean L() {
        AccessibilityNodeInfo accessibilityNodeInfoN;
        u7.i iVar = this.f3513x;
        if (iVar != null && ((View) iVar.f21018w) != null) {
            x4 x4Var = this.A;
            if (!x4Var.a()) {
                i3 i3VarB = d2.B(this);
                if (i3VarB.getBoolean("nativeReelsBlocking", false) && i3VarB.getBoolean("nativeBlockFacebookFeedSuggested", false) && !i3VarB.getBoolean("nativeFbDmsOnlyMode", false) && !i3VarB.getBoolean("nativeFbMarketplaceOnlyMode", false) && mb.f6571i.c(this).O0() && (accessibilityNodeInfoN = n()) != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfoN.getBoundsInScreen(rect);
                    accessibilityNodeInfoN.recycle();
                    t4 t4Var = this.f3512w;
                    if (t4Var != null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        x4Var.f7151m = w4.f7077z;
                        x4Var.f7152n = ((long) 5000) + jUptimeMillis;
                        x4Var.f7149j = 0L;
                        x4Var.f7150k = 0;
                        x4Var.f7153o = jUptimeMillis;
                        t4Var.b(rect, true, false);
                        u7.i iVar2 = this.f3513x;
                        if (iVar2 != null) {
                            iVar2.t();
                        }
                        u7.i iVar3 = this.f3514y;
                        if (iVar3 != null) {
                            iVar3.t();
                        }
                        Log.w("FbReturnCheck", "return requested");
                        y6 y6Var = new y6(this, 1);
                        n4 n4Var = t4Var.b;
                        n4Var.getClass();
                        if (n4Var.f6606m) {
                            n4Var.a(y6Var);
                            return true;
                        }
                        y6Var.invoke(Boolean.FALSE);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ca M(AccessibilityNodeInfo accessibilityNodeInfo, String str, i3 i3Var) {
        boolean zS;
        z9 z9Var = z9.f7262a;
        if (z9.a(i3Var, str)) {
            return null;
        }
        boolean zB = true;
        switch (str.hashCode()) {
            case -2075712516:
                zB = !str.equals("com.google.android.youtube") ? false : B(accessibilityNodeInfo, f3487u0);
                break;
            case -1023018315:
                if (!str.equals("com.twitter.android.lite")) {
                    zB = false;
                } else if (!i3Var.getBoolean("nativeXDmsOnlyMode", false) || !u(accessibilityNodeInfo, "VideoTab")) {
                    zB = false;
                }
                break;
            case -662003450:
                if (!str.equals("com.instagram.android") || i3Var.getBoolean("nativeIgDmsOnlyMode", false) || !B(accessibilityNodeInfo, f3486t0)) {
                    zB = false;
                }
                break;
            case 10619783:
                if (!str.equals("com.twitter.android")) {
                    zB = false;
                } else if (!i3Var.getBoolean("nativeXDmsOnlyMode", false)) {
                    zB = false;
                }
                break;
            case 330586574:
                if (!str.equals("com.ss.android.ugc.trill")) {
                    zB = false;
                } else {
                    zS = S(accessibilityNodeInfo, f3489w0, w0.i(accessibilityNodeInfo), 0);
                    u7 u7VarR = w.r(this.S, accessibilityNodeInfo);
                    v7 v7Var = u7VarR.f6966a;
                    if (!zS && (!u7VarR.b || !v7Var.a() || !x7.a(v7Var, i3Var))) {
                        zB = false;
                    }
                }
                break;
            case 543597367:
                if (!str.equals("com.zhiliaoapp.musically")) {
                    zB = false;
                } else {
                    zS = S(accessibilityNodeInfo, f3489w0, w0.i(accessibilityNodeInfo), 0);
                    u7 u7VarR2 = w.r(this.S, accessibilityNodeInfo);
                    v7 v7Var2 = u7VarR2.f6966a;
                    if (!zS) {
                    }
                }
                break;
            case 714499313:
                if (!str.equals("com.facebook.katana") || i3Var.getBoolean("nativeFbDmsOnlyMode", false) || i3Var.getBoolean("nativeFbMarketplaceOnlyMode", false) || U(accessibilityNodeInfo, 0) || X(accessibilityNodeInfo, 0) || !w(accessibilityNodeInfo)) {
                    zB = false;
                }
                break;
            case 2094270320:
                if (!str.equals("com.snapchat.android")) {
                    zB = false;
                } else if (!B(accessibilityNodeInfo, f.v("com.snapchat.android:id/spotlight_container")) && !d2.A(accessibilityNodeInfo)) {
                    zB = false;
                }
                break;
            default:
                zB = false;
                break;
        }
        if (!zB) {
            return null;
        }
        switch (str.hashCode()) {
            case -2075712516:
                if (str.equals("com.google.android.youtube")) {
                    return ca.YOUTUBE;
                }
                return null;
            case -1023018315:
                if (!str.equals("com.twitter.android.lite")) {
                    return null;
                }
                return ca.TWITTER;
            case -662003450:
                if (str.equals("com.instagram.android")) {
                    return ca.INSTAGRAM;
                }
                return null;
            case 10619783:
                if (!str.equals("com.twitter.android")) {
                    return null;
                }
                return ca.TWITTER;
            case 330586574:
                if (!str.equals("com.ss.android.ugc.trill")) {
                    return null;
                }
                return ca.TIKTOK;
            case 543597367:
                if (!str.equals("com.zhiliaoapp.musically")) {
                    return null;
                }
                return ca.TIKTOK;
            case 714499313:
                if (str.equals("com.facebook.katana")) {
                    return ca.FACEBOOK;
                }
                return null;
            case 2094270320:
                if (str.equals("com.snapchat.android")) {
                    return ca.SNAPCHAT;
                }
                return null;
            default:
                return null;
        }
    }

    public final void N() {
        w6 w6Var = this.B;
        if (w6Var.a() || w6Var.a()) {
            return;
        }
        z zVar = new z(w6Var, 7);
        w6Var.f7086e = zVar;
        w6Var.f7083a.invoke(zVar, 0L);
    }

    public final void O() {
        e5 e5Var = this.f3498f0;
        if (e5Var != null) {
            e5Var.a();
        }
        i7 i7Var = (i7) this.f3499g0.getValue();
        i7Var.f6295d = null;
        i7Var.f6296e = 0L;
        w6 w6Var = this.B;
        z zVar = w6Var.f7086e;
        if (zVar != null) {
            w6Var.b.invoke(zVar);
        }
        w6Var.f7086e = null;
        K();
        this.o0.b();
        n4 n4Var = this.f3511v;
        if (n4Var != null) {
            n4Var.b();
        }
        p8 p8Var = this.f3504l0;
        if (p8Var != null) {
            p8Var.c();
        }
        J();
        this.Y.b();
        this.Z.b();
        this.L.h();
        this.N.d();
        this.O.b();
        this.P.b();
        u2 u2Var = (u2) this.Q.getValue();
        u2Var.getClass();
        u2Var.f6944c = System.currentTimeMillis();
        this.R = null;
        w wVar = this.S;
        wVar.f5742u = null;
        wVar.f5741t = 0L;
        this.T.b();
        this.W = 0L;
        this.X = null;
        this.U = null;
        v5 v5Var = this.f3494b0;
        if (v5Var != null) {
            v5Var.c();
        }
        h8 h8Var = this.f3495c0;
        if (h8Var != null) {
            h8Var.d();
        }
        m7 m7Var = this.f3497e0;
        if (m7Var != null) {
            m7Var.a();
        }
        s7 s7Var = this.f3496d0;
        if (s7Var != null) {
            s7Var.a();
        }
    }

    public final boolean P(AccessibilityNodeInfo accessibilityNodeInfo, int i2, i iVar) {
        boolean zDispatchGesture;
        if (i2 <= 120) {
            if (!x(accessibilityNodeInfo) || !iVar.a(accessibilityNodeInfo.getContentDescription().toString())) {
                int childCount = accessibilityNodeInfo.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i10);
                    if (child != null) {
                        boolean zP = P(child, i2 + 1, iVar);
                        child.recycle();
                        if (zP) {
                            return true;
                        }
                    }
                }
            } else if (!z(accessibilityNodeInfo)) {
                Rect rectI = w0.i(accessibilityNodeInfo);
                if (rectI.width() <= 0 || rectI.height() <= 0) {
                    zDispatchGesture = false;
                } else {
                    try {
                        Path path = new Path();
                        path.moveTo(rectI.exactCenterX(), rectI.exactCenterY());
                        zDispatchGesture = dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 60L)).build(), null, null);
                    } catch (Exception e10) {
                        a5.z.u("[FB-MP-TAP] gesture dispatch threw: ", e10.getMessage(), "NativeReelsBlocker");
                        zDispatchGesture = false;
                    }
                }
                return zDispatchGesture || accessibilityNodeInfo.performAction(16);
            }
        }
        return false;
    }

    public final boolean W(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        if (i2 <= 120) {
            if (!x(accessibilityNodeInfo)) {
                int childCount = accessibilityNodeInfo.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i10);
                    if (child != null) {
                        boolean zW = W(child, i2 + 1);
                        child.recycle();
                        if (zW) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void a(long j10, String str) {
        this.J = j10;
        G();
        performGlobalAction(1);
    }

    public final boolean a0(AccessibilityNodeInfo accessibilityNodeInfo, String str, Rect rect, int i2) {
        int i10;
        if (i2 <= 120 && (i10 = this.V) < 400) {
            this.V = i10 + 1;
            if (!l.a(accessibilityNodeInfo.getViewIdResourceName(), str) || !A(rect, accessibilityNodeInfo)) {
                int childCount = accessibilityNodeInfo.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i11);
                    if (child != null) {
                        boolean zA0 = a0(child, str, rect, i2 + 1);
                        child.recycle();
                        if (!zA0) {
                            if (this.V >= 400) {
                                break;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void b(boolean z10, long j10) {
        AccessibilityNodeInfo rootInActiveWindow;
        if (Build.VERSION.SDK_INT >= 33) {
            clearCache();
        }
        try {
            rootInActiveWindow = getRootInActiveWindow();
        } catch (Exception unused) {
            rootInActiveWindow = null;
        }
        if (rootInActiveWindow == null) {
            return;
        }
        boolean zPerformGlobalAction = false;
        try {
            String strP = p(rootInActiveWindow, 0);
            if (j10 - this.f3505m0 < 1200) {
                rootInActiveWindow.recycle();
                return;
            }
            if (strP != null && f3492z0.a(strP)) {
                zPerformGlobalAction = P(rootInActiveWindow, 0, A0);
            } else if (z10 && w(rootInActiveWindow)) {
                zPerformGlobalAction = performGlobalAction(1);
            }
            rootInActiveWindow.recycle();
            if (zPerformGlobalAction) {
                this.f3505m0 = j10;
                this.J = j10;
                G();
            }
        } catch (Throwable th) {
            rootInActiveWindow.recycle();
            throw th;
        }
    }

    public final void c(long j10, String str, boolean z10) {
        AccessibilityNodeInfo rootInActiveWindow;
        boolean zBooleanValue;
        this.J = j10;
        G();
        try {
            rootInActiveWindow = getRootInActiveWindow();
        } catch (Exception unused) {
            rootInActiveWindow = null;
        }
        if (rootInActiveWindow != null) {
            try {
                zBooleanValue = ((Boolean) x7.j(rootInActiveWindow, new v4(5, (byte) 0))).booleanValue();
                rootInActiveWindow.recycle();
            } catch (Throwable th) {
                rootInActiveWindow.recycle();
                throw th;
            }
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            Log.w("NativeReelsBlocker", "TikTok Inbox tab not found for " + str + " redirect — retry on next poll");
        }
        if (z10) {
            this.f3509t.post(new ad.a(this, 9, str));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v1 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void d(android.view.accessibility.AccessibilityNodeInfo r27, ge.i3 r28, long r29) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sociallite.android.data.NativeReelsBlockerService.d(android.view.accessibility.AccessibilityNodeInfo, ge.i3, long):void");
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String string;
        String string2;
        fileDescriptor.getClass();
        printWriter.getClass();
        super.dump(fileDescriptor, printWriter, strArr);
        w6 w6Var = this.B;
        printWriter.println("native_monitor polling=" + w6Var.a() + " scans=" + this.D + " rootReads=" + this.E + " scanFailures=" + w6Var.f7087f);
        h8 h8Var = this.f3495c0;
        String string3 = "not connected";
        if (h8Var != null) {
            boolean z10 = h8Var.f6250h != null;
            boolean z11 = h8Var.f6251i != null;
            boolean z12 = h8Var.f6252j != null;
            i8 i8Var = h8Var.f6257p;
            j8 j8Var = (j8) h8Var.f6263v.f89d;
            int i2 = h8Var.f6260s;
            boolean z13 = h8Var.f6262u;
            StringBuilder sbW = w0.w("visible=", " tabHidden=", " statusBackground=", z10, z11);
            sbW.append(z12);
            sbW.append(" action=");
            sbW.append(i8Var);
            sbW.append(" feed=");
            sbW.append(j8Var);
            sbW.append(" attempts=");
            sbW.append(i2);
            sbW.append(" failed=");
            sbW.append(z13);
            string = sbW.toString();
        } else {
            string = "not connected";
        }
        printWriter.println("X controls: ".concat(string));
        s7 s7Var = this.f3496d0;
        if (s7Var != null) {
            boolean z14 = s7Var.f6848j.f6092g != null;
            boolean zC = s7Var.c();
            boolean z15 = s7Var.f6846h;
            t7 t7Var = s7Var.f6845g;
            StringBuilder sbW2 = w0.w("visible=", " enabled=", " dark=", z14, zC);
            sbW2.append(z15);
            sbW2.append(" target=");
            sbW2.append(t7Var);
            string2 = sbW2.toString();
        } else {
            string2 = "not connected";
        }
        printWriter.println("Snapchat Spotlight lock: ".concat(string2));
        e5 e5Var = this.f3498f0;
        if (e5Var != null) {
            NativeReelsBlockerService nativeReelsBlockerService = e5Var.f6072a;
            mb mbVarC = mb.f6571i.c(nativeReelsBlockerService);
            i3 i3VarB = d2.B(nativeReelsBlockerService);
            boolean z16 = e5Var.f6075e.f6092g != null;
            int i10 = e5Var.f6073c;
            Rect rect = e5Var.f6074d;
            boolean zC2 = e5Var.c();
            boolean zO0 = mbVarC.O0();
            boolean zH0 = mbVarC.H0();
            boolean z17 = i3VarB.getBoolean("nativeReelsBlocking", false);
            boolean z18 = i3VarB.getBoolean("nativeBlockFacebookReels", false);
            boolean z19 = i3VarB.getBoolean("nativeFbDmsOnlyMode", false);
            StringBuilder sb2 = new StringBuilder("visible=");
            sb2.append(z16);
            sb2.append(" window=");
            sb2.append(i10);
            sb2.append(" area=");
            sb2.append(rect);
            sb2.append(" enabled=");
            sb2.append(zC2);
            sb2.append(" pro=");
            w0.A(sb2, zO0, " kid=", zH0, " master=");
            w0.A(sb2, z17, " reels=", z18, " dmsOnly=");
            sb2.append(z19);
            string3 = sb2.toString();
        }
        printWriter.println("Facebook Reels lock: ".concat(string3));
    }

    /* JADX WARN: Code duplicated, block: B:181:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:202:0x0358  */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    public final void e(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10) {
        boolean z10;
        boolean z11;
        u6 u6Var;
        boolean z12;
        boolean z13;
        c2 c2Var;
        boolean z14;
        Boolean boolA;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        c2 c2Var2;
        u6 u6Var2;
        Boolean bool;
        Boolean boolE;
        x6 x6Var;
        Object lVar;
        boolean z15;
        AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
        boolean z16 = i3Var.getBoolean("nativeIgDmsOnlyMode", false);
        u6 u6Var3 = this.P;
        if (z16) {
            u6Var3.b();
            AccessibilityNodeInfo rootInActiveWindow = accessibilityNodeInfo3 == null ? getRootInActiveWindow() : accessibilityNodeInfo3;
            if (rootInActiveWindow != null) {
                boolean zY = Y(rootInActiveWindow, 0, "com.instagram.android:id/direct_inbox_action_bar");
                boolean zY2 = Y(rootInActiveWindow, 0, "com.instagram.android:id/row_thread_composer_edittext");
                if (!zY && !zY2 && Q(rootInActiveWindow, 0)) {
                    this.J = j10;
                    if (rootInActiveWindow != accessibilityNodeInfo3) {
                        rootInActiveWindow.recycle();
                        return;
                    } else {
                        if (accessibilityNodeInfo3 != null) {
                            accessibilityNodeInfo3.recycle();
                            return;
                        }
                        return;
                    }
                }
                if (rootInActiveWindow != accessibilityNodeInfo3) {
                    rootInActiveWindow.recycle();
                }
            }
        }
        boolean z17 = l.a(i3Var.f6283a.getString("accountType", "personal"), "personal") && !i3Var.getBoolean("nativeIgDmsOnlyMode", false) && i3Var.getBoolean("nativeBlockInstagramReels", true);
        boolean z18 = i3Var.getBoolean("nativeIgHideStories", false);
        u6 u6Var4 = this.O;
        if (z18) {
            u6Var4.b();
        }
        o oVar = this.Q;
        g6 g6Var = this.N;
        if (z17) {
            u2 u2Var = (u2) oVar.getValue();
            u2Var.getClass();
            z10 = z17;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            z11 = z18;
            u6Var = u6Var4;
            long j11 = u2Var.f6945d;
            if (j11 < 0 || jElapsedRealtime - j11 >= 250) {
                u2Var.f6945d = jElapsedRealtime;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis < u2Var.f6944c) {
                    u2Var.f6944c = jCurrentTimeMillis;
                } else {
                    try {
                        UsageStatsManager usageStatsManager = u2Var.f6943a;
                        lVar = usageStatsManager != null ? usageStatsManager.queryEvents(Math.max(u2Var.b, jCurrentTimeMillis - HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS), jCurrentTimeMillis) : null;
                    } catch (Throwable th) {
                        lVar = new se.l(th);
                    }
                    if (lVar instanceof se.l) {
                        lVar = null;
                    }
                    UsageEvents usageEvents = (UsageEvents) lVar;
                    if (usageEvents != null) {
                        UsageEvents.Event event = new UsageEvents.Event();
                        z15 = false;
                        while (usageEvents.hasNextEvent()) {
                            usageEvents.getNextEvent(event);
                            if (event.getEventType() == 1 && l.a(event.getPackageName(), "com.instagram.android")) {
                                if (te.k.P(a0.F("com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity", "com.instagram.urlhandlers.media.MediaUrlHandlerActivity"), event.getClassName()) && event.getTimeStamp() > u2Var.f6944c) {
                                    u2Var.f6944c = event.getTimeStamp();
                                    z15 = true;
                                }
                            }
                        }
                    }
                }
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                g6Var.d();
                g6Var.f6183c = jElapsedRealtime2 + HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
            }
        } else {
            z10 = z17;
            z11 = z18;
            u6Var = u6Var4;
            g6Var.d();
            u6Var.b();
            u6Var3.b();
            u2 u2Var2 = (u2) oVar.getValue();
            u2Var2.getClass();
            u2Var2.f6944c = System.currentTimeMillis();
        }
        v5 v5Var = this.f3494b0;
        if (v5Var != null) {
            z12 = true;
            z13 = v5Var.i();
            c2Var = this.L;
            if (!z13 || !i3Var.getBoolean("nativeBlockInstagramReels", z12)) {
                u6Var.b();
                u6Var3.b();
                c2Var.h();
                if (accessibilityNodeInfo3 != null) {
                    accessibilityNodeInfo3.recycle();
                }
            }
            if (accessibilityNodeInfo3 == null) {
                try {
                    AccessibilityNodeInfo rootInActiveWindow2 = getRootInActiveWindow();
                    if (rootInActiveWindow2 == null) {
                        return;
                    } else {
                        accessibilityNodeInfo3 = rootInActiveWindow2;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e("NativeReelsBlocker", "IG check error: " + e.getMessage());
                    return;
                }
            }
            CharSequence packageName = accessibilityNodeInfo3.getPackageName();
            if (!l.a(packageName != null ? packageName.toString() : null, "com.instagram.android")) {
                accessibilityNodeInfo3.recycle();
                return;
            }
            a aVar = this.M;
            boolean z19 = !i3Var.getBoolean("nativeIgDmsOnlyMode", false);
            ca caVar = ca.INSTAGRAM;
            q6 q6VarF = aVar.f(accessibilityNodeInfo3, z19, v(caVar));
            if (q6VarF != q6.f6745t) {
                u6Var.b();
                g6Var.d();
                u6Var3.b();
                c2Var.h();
                accessibilityNodeInfo3.recycle();
                if (q6VarF != q6.f6746u) {
                    a(j10, "Reels");
                    return;
                } else {
                    this.J = j10;
                    G();
                    return;
                }
            }
            boolean zB = B(accessibilityNodeInfo3, f3486t0);
            if (!z10 || v(caVar)) {
                z14 = false;
                u6Var3.b();
                boolA = null;
            } else {
                CharSequence packageName2 = accessibilityNodeInfo3.getPackageName();
                if (l.a(packageName2 != null ? packageName2.toString() : null, "com.instagram.android")) {
                    z14 = false;
                    x6Var = (x6) d2.V(accessibilityNodeInfo3, new v4(3, (byte) 0));
                } else {
                    z14 = false;
                    x6Var = new x6(false, false, false, false);
                }
                boolean z20 = (zB || (x6Var.b && (x6Var.f7162c || u6Var3.b.b))) ? true : z14;
                boolA = this.P.a(SystemClock.elapsedRealtime(), zB ? r(accessibilityNodeInfo3) : null, x6Var.f7161a, z20, (z20 || !(x6Var.b || x6Var.f7163d || v6.b(accessibilityNodeInfo3))) ? z14 : true, E(accessibilityNodeInfo3));
            }
            if (!z10 || z11) {
                accessibilityNodeInfo2 = accessibilityNodeInfo3;
                c2Var2 = c2Var;
                u6Var2 = u6Var;
                bool = null;
                boolE = bool;
            } else {
                CharSequence packageName3 = accessibilityNodeInfo3.getPackageName();
                if (l.a(packageName3 != null ? packageName3.toString() : null, "com.instagram.android")) {
                    if (!zB && v6.b(accessibilityNodeInfo3)) {
                        z14 = true;
                    }
                    boolean zE = E(accessibilityNodeInfo3);
                    String strR = zB ? r(accessibilityNodeInfo3) : null;
                    accessibilityNodeInfo2 = accessibilityNodeInfo3;
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    u6Var2 = u6Var;
                    g6 g6Var2 = u6Var2.b;
                    if (zB) {
                        if (g6Var2.b) {
                            c2Var2 = c2Var;
                        } else {
                            Long l = u6Var2.f6965c;
                            c2Var2 = c2Var;
                            bool = null;
                            u6Var2.f6965c = null;
                            if (l != null) {
                                long jLongValue = jElapsedRealtime3 - l.longValue();
                                if (0 <= jLongValue && jLongValue < 1501 && !zE) {
                                    g6Var2.d();
                                    g6Var2.f6183c = jElapsedRealtime3 + HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
                                }
                            }
                        }
                        boolE = g6Var2.e(jElapsedRealtime3, strR, zE);
                    } else {
                        if (z14) {
                            g6Var2.d();
                            u6Var2.f6965c = Long.valueOf(jElapsedRealtime3);
                        } else {
                            u6Var2.f6965c = null;
                            g6Var2.d();
                        }
                        zB = zB;
                        c2Var2 = c2Var;
                        boolE = null;
                    }
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo3;
                    c2Var2 = c2Var;
                    u6Var2 = u6Var;
                    bool = null;
                }
                boolE = bool;
            }
            if (zB) {
                if (this.f3501i0 == caVar) {
                    u6Var2.b();
                    c2Var2.h();
                    accessibilityNodeInfo2.recycle();
                    return;
                } else if (this.f3502j0 != caVar) {
                    s(accessibilityNodeInfo2, i3Var, j10, boolE, boolA);
                    return;
                } else {
                    accessibilityNodeInfo2.recycle();
                    a(j10, "Reels");
                    return;
                }
            }
            try {
                g6Var.a(SystemClock.elapsedRealtime());
                c2Var2.h();
                accessibilityNodeInfo2.recycle();
                if (l.a(boolA, Boolean.TRUE)) {
                    a(j10, "Reels");
                    return;
                }
                return;
            } catch (Exception e11) {
                e = e11;
                Log.e("NativeReelsBlocker", "IG check error: " + e.getMessage());
                return;
            }
        }
        z12 = true;
        c2Var = this.L;
        if (!z13) {
        }
        u6Var.b();
        u6Var3.b();
        c2Var.h();
        if (accessibilityNodeInfo3 != null) {
            accessibilityNodeInfo3.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0279  */
    /* JADX WARN: Code duplicated, block: B:176:0x027d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0281  */
    /* JADX WARN: Code duplicated, block: B:183:0x0294 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0296  */
    /* JADX WARN: Code duplicated, block: B:187:0x029d  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:192:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:211:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:212:0x02de  */
    /* JADX WARN: Code duplicated, block: B:215:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:219:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:221:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:224:0x0307 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:225:0x0309  */
    /* JADX WARN: Code duplicated, block: B:226:0x030e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0322  */
    /* JADX WARN: Code duplicated, block: B:259:0x0373  */
    /* JADX WARN: Code duplicated, block: B:270:0x038e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0396  */
    /* JADX WARN: Code duplicated, block: B:273:0x0398  */
    /* JADX WARN: Code duplicated, block: B:276:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:277:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:311:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:318:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:319:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:322:0x050c  */
    /* JADX WARN: Code duplicated, block: B:323:0x050e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0515  */
    /* JADX WARN: Code duplicated, block: B:333:0x052e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:334:0x0530  */
    /* JADX WARN: Code duplicated, block: B:335:0x0535  */
    /* JADX WARN: Code duplicated, block: B:337:0x0548 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:340:0x0550  */
    /* JADX WARN: Code duplicated, block: B:343:0x0557  */
    /* JADX WARN: Code duplicated, block: B:346:0x0561  */
    /* JADX WARN: Code duplicated, block: B:349:0x056a  */
    /* JADX WARN: Code duplicated, block: B:350:0x056d  */
    /* JADX WARN: Code duplicated, block: B:353:0x0576  */
    /* JADX WARN: Code duplicated, block: B:357:0x0582  */
    /* JADX WARN: Code duplicated, block: B:360:0x058b  */
    /* JADX WARN: Code duplicated, block: B:361:0x058e  */
    /* JADX WARN: Code duplicated, block: B:363:0x0598  */
    /* JADX WARN: Code duplicated, block: B:364:0x059b  */
    /* JADX WARN: Code duplicated, block: B:368:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:370:0x05b5 A[PHI: r10 r12 r13
  0x05b5: PHI (r10v41 java.lang.Object) = (r10v6 java.lang.Object), (r10v42 java.lang.Object) binds: [B:369:0x05b3, B:339:0x054c] A[DONT_GENERATE, DONT_INLINE]
  0x05b5: PHI (r12v47 java.lang.Object) = (r12v2 java.lang.Object), (r12v48 java.lang.Object) binds: [B:369:0x05b3, B:339:0x054c] A[DONT_GENERATE, DONT_INLINE]
  0x05b5: PHI (r13v17 java.lang.Object) = (r13v4 java.lang.Object), (r13v18 java.lang.Object) binds: [B:369:0x05b3, B:339:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:371:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:374:0x05c7 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:375:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:378:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:385:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:387:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:388:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:391:0x0606  */
    /* JADX WARN: Code duplicated, block: B:392:0x060c  */
    /* JADX WARN: Code duplicated, block: B:395:0x0617 A[Catch: Exception -> 0x0666, TryCatch #4 {Exception -> 0x0666, blocks: (B:393:0x0611, B:395:0x0617, B:396:0x0619, B:397:0x061d, B:399:0x0623, B:402:0x0630, B:404:0x0636, B:406:0x063c, B:408:0x0642, B:409:0x0646, B:417:0x0662, B:412:0x064d, B:414:0x0654, B:416:0x065e), top: B:600:0x0611 }] */
    /* JADX WARN: Code duplicated, block: B:399:0x0623 A[Catch: Exception -> 0x0666, TryCatch #4 {Exception -> 0x0666, blocks: (B:393:0x0611, B:395:0x0617, B:396:0x0619, B:397:0x061d, B:399:0x0623, B:402:0x0630, B:404:0x0636, B:406:0x063c, B:408:0x0642, B:409:0x0646, B:417:0x0662, B:412:0x064d, B:414:0x0654, B:416:0x065e), top: B:600:0x0611 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x0636 A[Catch: Exception -> 0x0666, TryCatch #4 {Exception -> 0x0666, blocks: (B:393:0x0611, B:395:0x0617, B:396:0x0619, B:397:0x061d, B:399:0x0623, B:402:0x0630, B:404:0x0636, B:406:0x063c, B:408:0x0642, B:409:0x0646, B:417:0x0662, B:412:0x064d, B:414:0x0654, B:416:0x065e), top: B:600:0x0611 }] */
    /* JADX WARN: Code duplicated, block: B:405:0x063b  */
    /* JADX WARN: Code duplicated, block: B:412:0x064d A[Catch: Exception -> 0x0666, TryCatch #4 {Exception -> 0x0666, blocks: (B:393:0x0611, B:395:0x0617, B:396:0x0619, B:397:0x061d, B:399:0x0623, B:402:0x0630, B:404:0x0636, B:406:0x063c, B:408:0x0642, B:409:0x0646, B:417:0x0662, B:412:0x064d, B:414:0x0654, B:416:0x065e), top: B:600:0x0611 }] */
    /* JADX WARN: Code duplicated, block: B:414:0x0654 A[Catch: Exception -> 0x0666, TryCatch #4 {Exception -> 0x0666, blocks: (B:393:0x0611, B:395:0x0617, B:396:0x0619, B:397:0x061d, B:399:0x0623, B:402:0x0630, B:404:0x0636, B:406:0x063c, B:408:0x0642, B:409:0x0646, B:417:0x0662, B:412:0x064d, B:414:0x0654, B:416:0x065e), top: B:600:0x0611 }] */
    /* JADX WARN: Code duplicated, block: B:458:0x06f3 A[LOOP:9: B:457:0x06f1->B:458:0x06f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:462:0x0712  */
    /* JADX WARN: Code duplicated, block: B:463:0x0715 A[Catch: all -> 0x0696, Exception -> 0x0699, TryCatch #3 {Exception -> 0x0699, blocks: (B:422:0x066e, B:424:0x0675, B:427:0x0685, B:429:0x068f, B:441:0x06b3, B:443:0x06bd, B:445:0x06c3, B:447:0x06c9, B:460:0x0701, B:465:0x071b, B:463:0x0715, B:453:0x06e3, B:455:0x06e9), top: B:599:0x066e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:468:0x0727 A[LOOP:8: B:467:0x0725->B:468:0x0727, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:480:0x0785  */
    /* JADX WARN: Code duplicated, block: B:483:0x0794  */
    /* JADX WARN: Code duplicated, block: B:488:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:491:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:493:0x07b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:494:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:495:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:508:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:509:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:511:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:514:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:515:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:518:0x080a  */
    /* JADX WARN: Code duplicated, block: B:526:0x082b  */
    /* JADX WARN: Code duplicated, block: B:529:0x0837  */
    /* JADX WARN: Code duplicated, block: B:530:0x0839  */
    /* JADX WARN: Code duplicated, block: B:533:0x0845  */
    /* JADX WARN: Code duplicated, block: B:534:0x084a  */
    /* JADX WARN: Code duplicated, block: B:539:0x085f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:542:0x0867  */
    /* JADX WARN: Code duplicated, block: B:545:0x086c  */
    /* JADX WARN: Code duplicated, block: B:548:0x0871 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:551:0x087d A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:552:0x0882 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:554:0x0888 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:555:0x0890 A[Catch: Exception -> 0x0869, TRY_LEAVE, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:558:0x0896  */
    /* JADX WARN: Code duplicated, block: B:560:0x08a1 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:562:0x08a9 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:564:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:565:0x08b8 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:567:0x08c5 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:568:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:571:0x08d4 A[Catch: Exception -> 0x0869, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:572:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:577:0x08e7 A[Catch: Exception -> 0x0869, TRY_LEAVE, TryCatch #2 {Exception -> 0x0869, blocks: (B:540:0x0861, B:546:0x086d, B:548:0x0871, B:549:0x0874, B:551:0x087d, B:552:0x0882, B:554:0x0888, B:555:0x0890, B:559:0x0897, B:560:0x08a1, B:562:0x08a9, B:569:0x08cd, B:571:0x08d4, B:573:0x08d9, B:576:0x08e0, B:565:0x08b8, B:567:0x08c5, B:577:0x08e7), top: B:598:0x0861 }] */
    /* JADX WARN: Code duplicated, block: B:580:0x0909  */
    /* JADX WARN: Code duplicated, block: B:582:0x090d  */
    /* JADX WARN: Code duplicated, block: B:584:0x0912  */
    /* JADX WARN: Code duplicated, block: B:585:0x0916  */
    /* JADX WARN: Code duplicated, block: B:588:0x0922  */
    /* JADX WARN: Code duplicated, block: B:589:0x0926  */
    /* JADX WARN: Code duplicated, block: B:591:0x092c  */
    /* JADX WARN: Code duplicated, block: B:598:0x0861 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x065e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[LOOP:4: B:413:0x0652->B:627:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0701 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x071b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0573, code lost:
    
        if (r11.equals("com.zhiliaoapp.musically") == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x057c, code lost:
    
        if (r11.equals("com.ss.android.ugc.trill") == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x057f, code lost:
    
        r0 = "tiktok";
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x05a3, code lost:
    
        if (r11.equals("com.twitter.android.lite") == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0807, code lost:
    
        if (r11.equals("com.zhiliaoapp.musically") == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0812, code lost:
    
        if (r11.equals("com.ss.android.ugc.trill") == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x081d, code lost:
    
        if (r31.getBoolean("nativeBlockTikTok", false) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x081f, code lost:
    
        g(r12, r31, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0824, code lost:
    
        if (r12 == null) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0826, code lost:
    
        r12.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0852, code lost:
    
        if (r11.equals("com.twitter.android.lite") == false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v52, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v56, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.accessibilityservice.AccessibilityService, android.content.Context, com.sociallite.android.data.NativeReelsBlockerService] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sociallite.android.data.NativeReelsBlockerService.f():void");
    }

    public final void g(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10) {
        AccessibilityNodeInfo rootInActiveWindow;
        w wVar = this.S;
        if (accessibilityNodeInfo == null) {
            rootInActiveWindow = getRootInActiveWindow();
            if (rootInActiveWindow == null) {
                return;
            }
        } else {
            rootInActiveWindow = accessibilityNodeInfo;
        }
        try {
            Rect rect = new Rect();
            rootInActiveWindow.getBoundsInScreen(rect);
            u7 u7VarR = w.r(wVar, rootInActiveWindow);
            boolean z10 = u7VarR.b;
            v7 v7Var = u7VarR.f6966a;
            boolean zS = S(rootInActiveWindow, f3489w0, rect, 0);
            boolean z11 = !zS && (v7Var == v7.G || v7Var == v7.D);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            y7 y7Var = this.T;
            if (!z10 && v7Var == v7.D) {
                y7Var.b();
            }
            if (!z11) {
                y7Var.b();
            } else if (z10) {
                if (!y7Var.f7215a) {
                    y7Var.f7215a = true;
                    y7Var.f7216c = jElapsedRealtime;
                }
                y7Var.f7217d = jElapsedRealtime;
            } else if (jElapsedRealtime - y7Var.f7217d > 1200) {
                y7Var.b();
            }
            if (y7Var.f7215a && y7Var.b && !y7Var.f7221h && z10 && jElapsedRealtime - y7Var.f7217d <= 1000) {
                if (performGlobalAction(1)) {
                    y7Var.f7221h = true;
                    this.J = j10;
                    G();
                }
                return;
            }
            ca caVar = this.f3501i0;
            ca caVar2 = ca.TIKTOK;
            boolean z12 = caVar == caVar2 || v(caVar2);
            if (v7Var == v7.f7034v && x7.i(v7Var, i3Var, z12)) {
                this.R = null;
                H(rootInActiveWindow, i3Var, j10);
                return;
            }
            if (!zS) {
                this.R = null;
                if (x7.i(v7Var, i3Var, z12)) {
                    if (v7Var.a()) {
                        H(rootInActiveWindow, i3Var, j10);
                    } else {
                        c(j10, v7Var.name(), true);
                    }
                }
                return;
            }
            wVar.f5742u = null;
            wVar.f5741t = 0L;
            if (this.f3501i0 == caVar2) {
                this.R = null;
                return;
            }
            if (this.f3502j0 == caVar2 || !i3Var.getBoolean("nativeTikTokAllowSentDM", true)) {
                c(j10, "TikTok", false);
            } else {
                String strQ = q(rootInActiveWindow, 0, new c(19));
                String str = this.R;
                if (str == null) {
                    this.R = strQ;
                } else if (strQ != null && !strQ.equals(str)) {
                    c(j10, "TikTok", false);
                }
            }
        } catch (Exception e10) {
            Log.e("NativeReelsBlocker", "TikTok check error: " + e10.getMessage());
        } finally {
            rootInActiveWindow.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[Catch: all -> 0x0053, Exception -> 0x0055, Merged into TryCatch #0 {all -> 0x0053, Exception -> 0x0055, blocks: (B:22:0x0043, B:24:0x004b, B:26:0x004f, B:31:0x0057, B:33:0x005d, B:37:0x0068, B:39:0x006c, B:41:0x0074, B:45:0x007e, B:51:0x008e, B:53:0x0098, B:47:0x0084, B:56:0x009f, B:58:0x00a3, B:59:0x00a6), top: B:64:0x0043 }, TRY_LEAVE] */
    public final void h(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10) {
        r8 r8VarA;
        p8 p8Var;
        boolean z10 = true;
        boolean z11 = !l.a(i3Var.f6283a.getString("accountType", "personal"), "kid") && i3Var.getBoolean("nativeYoutubeSearchOnly", false);
        boolean z12 = i3Var.getBoolean("nativeBlockYoutubeShorts", true);
        if (!z11 && (p8Var = this.f3504l0) != null) {
            p8Var.c();
        }
        if (!z11 && !z12) {
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.recycle();
                return;
            }
            return;
        }
        if (accessibilityNodeInfo == null && (accessibilityNodeInfo = getRootInActiveWindow()) == null) {
            return;
        }
        try {
            if (B(accessibilityNodeInfo, f3487u0)) {
                p8 p8Var2 = this.f3504l0;
                if (p8Var2 != null) {
                    p8Var2.c();
                }
                if (this.f3501i0 != ca.YOUTUBE) {
                    a(j10, "Shorts");
                }
                return;
            }
            if (z11) {
                p8 p8Var3 = this.f3504l0;
                if (p8Var3 != null) {
                    Set set = s8.f6849a;
                    if (((Rect) p8Var3.f6717f) == null || p8Var3.b != accessibilityNodeInfo.getWindowId()) {
                        z10 = false;
                    }
                    r8VarA = s8.a(accessibilityNodeInfo, z10);
                    if (r8VarA == null) {
                        r8VarA = s8.a(accessibilityNodeInfo, false);
                    }
                } else {
                    r8VarA = s8.a(accessibilityNodeInfo, false);
                }
                p8 p8Var4 = this.f3504l0;
                if (r8VarA != null) {
                    if (p8Var4 != null) {
                        p8Var4.d(r8VarA, accessibilityNodeInfo.getWindowId());
                    }
                } else if (p8Var4 != null) {
                    p8Var4.c();
                }
            }
        } catch (Exception e10) {
            p8 p8Var5 = this.f3504l0;
            if (p8Var5 != null) {
                p8Var5.c();
            }
            Log.e("NativeReelsBlocker", "YT check error: " + e10.getMessage());
        } finally {
            accessibilityNodeInfo.recycle();
        }
    }

    public final void i(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i10, LinkedHashSet linkedHashSet, int[] iArr) {
        if (i2 <= 3) {
            int i11 = iArr[0];
            iArr[0] = i11 - 1;
            if (i11 <= 0 || linkedHashSet.size() >= 3) {
                return;
            }
            Rect rectI = w0.i(accessibilityNodeInfo);
            if (y(accessibilityNodeInfo) && i10 >= rectI.top && i10 < rectI.bottom) {
                linkedHashSet.add(l(accessibilityNodeInfo.getContentDescription().toString()));
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            int i12 = 0;
            while (i12 < childCount && iArr[0] > 0 && linkedHashSet.size() < 3) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i12);
                if (child != null) {
                    i(child, i2 + 1, i10, linkedHashSet, iArr);
                    child.recycle();
                }
                i12++;
                linkedHashSet = linkedHashSet;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a2 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a6 A[Catch: all -> 0x013b, TRY_ENTER, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c0 A[Catch: all -> 0x013b, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01e7 A[Catch: all -> 0x013b, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0 A[Catch: all -> 0x013b, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01f6 A[Catch: all -> 0x013b, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01fd A[Catch: all -> 0x013b, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0205 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #0 {all -> 0x013b, blocks: (B:64:0x012e, B:66:0x0133, B:78:0x0163, B:81:0x016b, B:83:0x016f, B:96:0x0196, B:102:0x01a6, B:103:0x01ba, B:105:0x01c0, B:109:0x01d6, B:112:0x01dc, B:114:0x01e7, B:120:0x0201, B:122:0x0205, B:116:0x01f0, B:118:0x01f6, B:119:0x01fd, B:93:0x018a, B:71:0x013e, B:72:0x0147, B:74:0x014d), top: B:132:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0209 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:134:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0 A[DONT_GENERATE, DONT_INVERT] */
    public final boolean j(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10) {
        z4 z4Var;
        boolean z10;
        Iterator it;
        Object next;
        y4 y4Var;
        y4 y4Var2;
        boolean zPerformGlobalAction = false;
        if (a5.a(i3Var)) {
            String strP = p(accessibilityNodeInfo, 0);
            AccessibilityNodeInfo accessibilityNodeInfo2 = null;
            if (strP == null || a5.f5885a.contains(a5.c(strP))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                u uVar = new u();
                uVar.f9986t = CredentialOption.PRIORITY_DEFAULT;
                a5.b(uVar, linkedHashMap, accessibilityNodeInfo, 0);
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                Collection<AccessibilityNodeInfo> collection = collectionValues;
                ArrayList arrayList = new ArrayList(te.l.I(collection, 10));
                for (AccessibilityNodeInfo accessibilityNodeInfo3 : collection) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo3.getBoundsInScreen(rect);
                    arrayList.add(rect);
                }
                if (arrayList.size() == 3) {
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        a6.d.d();
                        return false;
                    }
                    int i2 = ((Rect) it2.next()).top;
                    while (it2.hasNext()) {
                        int i10 = ((Rect) it2.next()).top;
                        if (i2 < i10) {
                            i2 = i10;
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    if (!it3.hasNext()) {
                        a6.d.d();
                        return false;
                    }
                    int i11 = ((Rect) it3.next()).bottom;
                    while (it3.hasNext()) {
                        int i12 = ((Rect) it3.next()).bottom;
                        if (i11 > i12) {
                            i11 = i12;
                        }
                    }
                    if (i2 < i11) {
                        Iterable iterableR = f.r(arrayList);
                        if (!(iterableR instanceof Collection) || !((Collection) iterableR).isEmpty()) {
                            nf.d it4 = iterableR.iterator();
                            while (true) {
                                if (it4.f15626v) {
                                    int iNextInt = it4.nextInt();
                                    Iterable iterableR2 = f.r(arrayList);
                                    if (!(iterableR2 instanceof Collection) || !((Collection) iterableR2).isEmpty()) {
                                        nf.d it5 = iterableR2.iterator();
                                        while (true) {
                                            if (it5.f15626v) {
                                                int iNextInt2 = it5.nextInt();
                                                if (iNextInt == iNextInt2 || !Rect.intersects((Rect) arrayList.get(iNextInt), (Rect) arrayList.get(iNextInt2))) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z4Var = new z4(linkedHashMap);
                    }
                }
                Collection collectionValues2 = linkedHashMap.values();
                collectionValues2.getClass();
                Iterator it6 = collectionValues2.iterator();
                while (it6.hasNext()) {
                    ((AccessibilityNodeInfo) it6.next()).recycle();
                }
                z4Var = null;
            } else {
                z4Var = null;
            }
            try {
                b bVar = y4.f7203z;
                if (bVar != null && bVar.isEmpty()) {
                    z10 = true;
                    break;
                }
                bVar.getClass();
                dg.f fVar = new dg.f(bVar, 7);
                while (true) {
                    if (!fVar.hasNext()) {
                        z10 = true;
                        break;
                    }
                    y4 y4Var3 = (y4) fVar.next();
                    Set set = a5.f5885a;
                    y4Var3.getClass();
                    if (!i3Var.getBoolean(y4Var3.f7204t, true)) {
                        z10 = false;
                        break;
                    }
                }
                y4 y4VarA = z4Var != null ? z4Var.a() : null;
                if (z10) {
                    Set set2 = a5.f5885a;
                    if (!(strP != null && a5.f5885a.contains(a5.c(strP))) && y4VarA == null) {
                        if (z4Var != null) {
                            return false;
                        }
                    }
                    if (j10 - this.n0 < 1500) {
                        it = f.w(y4.f7200w, y4.f7199v, y4.f7201x).iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            y4Var2 = (y4) next;
                            Set set3 = a5.f5885a;
                            y4Var2.getClass();
                        } while (i3Var.getBoolean(y4Var2.f7204t, true));
                        y4Var = (y4) next;
                        if (y4Var != null && z4Var != null) {
                            accessibilityNodeInfo2 = (AccessibilityNodeInfo) z4Var.f7243t.get(y4Var);
                        }
                        if (accessibilityNodeInfo2 != null) {
                            zPerformGlobalAction = accessibilityNodeInfo2.performAction(16);
                        } else if (z10) {
                            if (W(accessibilityNodeInfo, 0)) {
                                zPerformGlobalAction = P(accessibilityNodeInfo, 0, A0);
                            } else {
                                zPerformGlobalAction = performGlobalAction(1);
                            }
                        }
                        this.n0 = j10;
                        if (zPerformGlobalAction) {
                            this.J = j10;
                        }
                    } else if (z4Var != null) {
                        return true;
                    }
                    return true;
                }
                if (y4VarA != null) {
                    Set set4 = a5.f5885a;
                    if (!i3Var.getBoolean(y4VarA.f7204t, true)) {
                    }
                    if (j10 - this.n0 < 1500) {
                        it = f.w(y4.f7200w, y4.f7199v, y4.f7201x).iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            y4Var2 = (y4) next;
                            Set set5 = a5.f5885a;
                            y4Var2.getClass();
                        } while (i3Var.getBoolean(y4Var2.f7204t, true));
                        y4Var = (y4) next;
                        if (y4Var != null) {
                            accessibilityNodeInfo2 = (AccessibilityNodeInfo) z4Var.f7243t.get(y4Var);
                        }
                        if (accessibilityNodeInfo2 != null) {
                            zPerformGlobalAction = accessibilityNodeInfo2.performAction(16);
                        } else if (z10) {
                            if (W(accessibilityNodeInfo, 0)) {
                                zPerformGlobalAction = P(accessibilityNodeInfo, 0, A0);
                            } else {
                                zPerformGlobalAction = performGlobalAction(1);
                            }
                        }
                        this.n0 = j10;
                        if (zPerformGlobalAction) {
                            this.J = j10;
                        }
                    } else if (z4Var != null) {
                        return true;
                    }
                    return true;
                }
            } finally {
                if (z4Var != null) {
                    z4Var.close();
                }
            }
        }
        return false;
    }

    public final boolean k(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10, boolean z10) {
        if (!i3Var.getBoolean("nativeFbMarketplaceOnlyMode", false)) {
            K();
            return false;
        }
        String strP = p(accessibilityNodeInfo, 0);
        i iVar = B0;
        if (strP != null && iVar.a(strP)) {
            K();
            return false;
        }
        if (!z10) {
            if (strP != null) {
                if (j10 >= this.p0 && this.f3507r0 < 3) {
                    this.p0 = 1500 + j10;
                    if (this.f3506q0 < 2 && P(accessibilityNodeInfo, 0, iVar)) {
                        this.f3506q0++;
                        this.J = j10;
                        return true;
                    }
                    this.f3507r0++;
                    this.p0 = HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS + j10;
                    try {
                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://marketplace")).setPackage("com.facebook.katana").addFlags(268435456));
                        this.J = j10;
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        Log.w("NativeReelsBlocker", "[FB-MP-ONLY] native Marketplace route unavailable");
                    } catch (SecurityException unused2) {
                        Log.w("NativeReelsBlocker", "[FB-MP-ONLY] native Marketplace route denied");
                    }
                }
                return true;
            }
            if (!W(accessibilityNodeInfo, 0)) {
                Rect rectI = w0.i(accessibilityNodeInfo);
                if (t((rectI.height() / 6) + rectI.top, accessibilityNodeInfo, 0)) {
                    K();
                }
            }
        }
        return false;
    }

    public final AccessibilityNodeInfo n() {
        Object next;
        AccessibilityNodeInfo root;
        List<AccessibilityWindowInfo> windows = getWindows();
        try {
            windows.getClass();
            Iterator<T> it = windows.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AccessibilityWindowInfo accessibilityWindowInfo = (AccessibilityWindowInfo) next;
                if (accessibilityWindowInfo.isFocused() && accessibilityWindowInfo.getType() == 1) {
                    break;
                }
            }
            AccessibilityWindowInfo accessibilityWindowInfo2 = (AccessibilityWindowInfo) next;
            if (accessibilityWindowInfo2 != null && (root = accessibilityWindowInfo2.getRoot()) != null) {
                CharSequence packageName = root.getPackageName();
                if (l.a(packageName != null ? packageName.toString() : null, "com.facebook.katana")) {
                    i iVar = x4.f7135t;
                    byte b = 0;
                    if (((Boolean) ge.c.J0(root, new v4(b, b))).booleanValue()) {
                        return root;
                    }
                }
                root.recycle();
            }
            return null;
        } finally {
            windows.getClass();
            Iterator<T> it2 = windows.iterator();
            while (it2.hasNext()) {
                ((AccessibilityWindowInfo) it2.next()).recycle();
            }
        }
    }

    public final Rect o() {
        AccessibilityNodeInfo root;
        Rect rect = new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getSystemService(WindowManager.class)).getDefaultDisplay().getRealMetrics(displayMetrics);
        rect.right = displayMetrics.widthPixels;
        rect.bottom = displayMetrics.heightPixels;
        List<AccessibilityWindowInfo> windows = getWindows();
        try {
            Iterator<AccessibilityWindowInfo> it = windows.iterator();
            while (true) {
                Rect rectR = null;
                if (!it.hasNext()) {
                    Iterator<T> it2 = windows.iterator();
                    while (it2.hasNext()) {
                        ((AccessibilityWindowInfo) it2.next()).recycle();
                    }
                    return null;
                }
                AccessibilityWindowInfo next = it.next();
                if (next.getType() == 3 && (root = next.getRoot()) != null) {
                    try {
                        CharSequence packageName = root.getPackageName();
                        if (l.a(packageName != null ? packageName.toString() : null, "com.android.systemui")) {
                            u uVar = new u();
                            uVar.f9986t = 250;
                            rectR = d2.R(uVar, rect, root, 0);
                        }
                        root.recycle();
                        if (rectR != null) {
                            Iterator<T> it3 = windows.iterator();
                            while (it3.hasNext()) {
                                ((AccessibilityWindowInfo) it3.next()).recycle();
                            }
                            return rectR;
                        }
                    } catch (Throwable th) {
                        root.recycle();
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            windows.getClass();
            Iterator<T> it4 = windows.iterator();
            while (it4.hasNext()) {
                ((AccessibilityWindowInfo) it4.next()).recycle();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:321:0x048e A[PHI: r3
  0x048e: PHI (r3v2 java.lang.Object) = (r3v48 java.lang.Object), (r3v49 java.lang.Object), (r3v50 java.lang.Object), (r3v51 java.lang.Object) binds: [B:311:0x046f, B:313:0x0475, B:323:0x0495, B:319:0x048b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:378:0x05c3 A[Catch: all -> 0x04e1, TryCatch #1 {all -> 0x04e1, blocks: (B:324:0x0497, B:326:0x04c7, B:330:0x04d2, B:332:0x04da, B:337:0x04e8, B:339:0x04f1, B:341:0x0506, B:344:0x0511, B:346:0x051a, B:348:0x052f, B:350:0x0555, B:352:0x055b, B:354:0x0569, B:356:0x056f, B:358:0x057b, B:363:0x058c, B:365:0x0593, B:367:0x0599, B:369:0x05a5, B:378:0x05c3, B:381:0x05ce, B:383:0x05d7, B:370:0x05a9, B:372:0x05b5), top: B:459:0x0497 }] */
    /* JADX WARN: Code duplicated, block: B:379:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:381:0x05ce A[Catch: all -> 0x04e1, TryCatch #1 {all -> 0x04e1, blocks: (B:324:0x0497, B:326:0x04c7, B:330:0x04d2, B:332:0x04da, B:337:0x04e8, B:339:0x04f1, B:341:0x0506, B:344:0x0511, B:346:0x051a, B:348:0x052f, B:350:0x0555, B:352:0x055b, B:354:0x0569, B:356:0x056f, B:358:0x057b, B:363:0x058c, B:365:0x0593, B:367:0x0599, B:369:0x05a5, B:378:0x05c3, B:381:0x05ce, B:383:0x05d7, B:370:0x05a9, B:372:0x05b5), top: B:459:0x0497 }] */
    /* JADX WARN: Code duplicated, block: B:382:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #3 {all -> 0x0112, blocks: (B:49:0x009d, B:51:0x00a9, B:53:0x00af, B:55:0x00c6, B:57:0x00d8, B:59:0x00e8, B:61:0x00fa, B:63:0x00fe, B:69:0x010e, B:72:0x0114, B:80:0x012a, B:75:0x011b, B:78:0x0123), top: B:463:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Rect rect;
        String string;
        int i2;
        Object obj;
        AccessibilityNodeInfo rootInActiveWindow;
        AccessibilityNodeInfo source;
        AccessibilityNodeInfo source2;
        u6 u6Var;
        boolean z10;
        int scrollDeltaX;
        int scrollDeltaY;
        v5 v5Var;
        Object lVar;
        boolean z11;
        e5 e5Var;
        h8 h8Var;
        boolean z12;
        Integer num;
        boolean z13;
        if (accessibilityEvent == null) {
            return;
        }
        boolean zF = F();
        w6 w6Var = this.B;
        if (!zF) {
            if (w6Var.a()) {
                O();
                return;
            }
            return;
        }
        if (accessibilityEvent.getEventType() == 32 || accessibilityEvent.getEventType() == 4194304) {
            N();
        } else {
            Set set = I0;
            CharSequence packageName = accessibilityEvent.getPackageName();
            if (te.k.P(set, packageName != null ? packageName.toString() : null)) {
                N();
            }
        }
        if (w6Var.a()) {
            Set set2 = h8.B;
            CharSequence packageName2 = accessibilityEvent.getPackageName();
            if (te.k.P(set2, packageName2 != null ? packageName2.toString() : null) && (h8Var = this.f3495c0) != null) {
                AtomicLong atomicLong = h8Var.f6246d;
                a2.e eVar = h8Var.f6263v;
                CharSequence packageName3 = accessibilityEvent.getPackageName();
                if (te.k.P(set2, packageName3 != null ? packageName3.toString() : null) && h8Var.a()) {
                    int eventType = accessibilityEvent.getEventType();
                    j8 j8Var = j8.f6356t;
                    if (eventType == 4096) {
                        e8 e8Var = h8Var.f6264w;
                        AccessibilityNodeInfo source3 = accessibilityEvent.getSource();
                        if (e8Var != null) {
                            Rect rect2 = e8Var.b;
                            int i10 = e8Var.f6095a;
                            if (source3 != null) {
                                try {
                                    Rect rect3 = new Rect();
                                    source3.getBoundsInScreen(rect3);
                                    if (Build.VERSION.SDK_INT >= 28 && i10 == accessibilityEvent.getWindowId() && rect3.width() > ((double) rect2.width()) * 0.8d && rect3.height() > ((double) rect2.height()) * 0.5d && Math.abs(accessibilityEvent.getScrollDeltaX()) > h8Var.f(8) && Math.abs(accessibilityEvent.getScrollDeltaX()) > Math.abs(accessibilityEvent.getScrollDeltaY())) {
                                        Boolean bool = h8Var.f6266y;
                                        if (bool != null) {
                                            if ((accessibilityEvent.getScrollDeltaX() < 0) == bool.booleanValue()) {
                                                num = (Integer) eVar.f88c;
                                                if (num != null && num.intValue() == i10) {
                                                    eVar.f89d = j8Var;
                                                    eVar.b = true;
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    atomicLong.incrementAndGet();
                                                    h8Var.b(e8.a(e8Var, k8.a(e8Var.f6096c)));
                                                }
                                            } else {
                                                eVar.getClass();
                                            }
                                        } else {
                                            num = (Integer) eVar.f88c;
                                            if (num != null) {
                                                eVar.f89d = j8Var;
                                                eVar.b = true;
                                                z13 = true;
                                                if (z13) {
                                                    atomicLong.incrementAndGet();
                                                    h8Var.b(e8.a(e8Var, k8.a(e8Var.f6096c)));
                                                }
                                            }
                                            z13 = false;
                                            if (z13) {
                                                atomicLong.incrementAndGet();
                                                h8Var.b(e8.a(e8Var, k8.a(e8Var.f6096c)));
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    source3.recycle();
                                    throw th;
                                }
                            } else if (source3 != null) {
                            }
                            source3.recycle();
                        } else if (source3 != null) {
                            source3.recycle();
                        }
                        h8Var.i();
                    }
                    if (accessibilityEvent.getEventType() == 1 || accessibilityEvent.getEventType() == 4) {
                        e8 e8Var2 = h8Var.f6264w;
                        AccessibilityNodeInfo source4 = accessibilityEvent.getSource();
                        if (e8Var2 != null) {
                            int i11 = e8Var2.f6095a;
                            if (source4 == null) {
                                if (source4 != null) {
                                    break;
                                }
                            } else {
                                try {
                                    Rect rect4 = new Rect();
                                    source4.getBoundsInScreen(rect4);
                                    CharSequence text = source4.getText();
                                    String string2 = text != null ? text.toString() : null;
                                    String str = "";
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    CharSequence contentDescription = source4.getContentDescription();
                                    String string3 = contentDescription != null ? contentDescription.toString() : null;
                                    if (string3 != null) {
                                        str = string3;
                                    }
                                    List listW = f.w(string2, str);
                                    if (i11 == accessibilityEvent.getWindowId() && rect4.height() > 0) {
                                        Rect rect5 = e8Var2.b;
                                        int i12 = rect5.top;
                                        int iHeight = (int) ((rect5.height() * 0.25f) + i12);
                                        int iCenterY = rect4.centerY();
                                        if (i12 <= iCenterY && iCenterY <= iHeight) {
                                            List list = listW;
                                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    if (m8.a((String) it.next()) == j8Var) {
                                                        Integer num2 = (Integer) eVar.f88c;
                                                        if (num2 != null && num2.intValue() == i11) {
                                                            eVar.f89d = j8Var;
                                                            eVar.b = true;
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (!z12) {
                                                            break;
                                                        }
                                                        atomicLong.incrementAndGet();
                                                        h8Var.b(e8.a(e8Var2, k8.a(e8Var2.f6096c)));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    source4.recycle();
                                    throw th2;
                                }
                            }
                            source4.recycle();
                        } else if (source4 != null) {
                            source4.recycle();
                        }
                    }
                    h8Var.m();
                }
            }
            CharSequence packageName4 = accessibilityEvent.getPackageName();
            if (l.a(packageName4 != null ? packageName4.toString() : null, "com.facebook.katana") && accessibilityEvent.getEventType() == 4096 && (e5Var = this.f3498f0) != null) {
                NativeReelsBlockerService nativeReelsBlockerService = e5Var.f6072a;
                int i13 = Build.VERSION.SDK_INT;
                int scrollDeltaY2 = i13 >= 28 ? accessibilityEvent.getScrollDeltaY() : 0;
                int scrollDeltaX2 = i13 >= 28 ? accessibilityEvent.getScrollDeltaX() : 0;
                if (scrollDeltaY2 != 0 || (scrollDeltaX2 == 0 && (accessibilityEvent.getScrollY() > 0 || accessibilityEvent.getFromIndex() > 0))) {
                    AccessibilityNodeInfo source5 = accessibilityEvent.getSource();
                    if (source5 != null) {
                        try {
                            Rect rect6 = new Rect();
                            source5.getBoundsInScreen(rect6);
                            DisplayMetrics displayMetrics = nativeReelsBlockerService.getResources().getDisplayMetrics();
                            if (rect6.width() < displayMetrics.widthPixels / 2 || rect6.height() < displayMetrics.heightPixels / 3) {
                                source5.recycle();
                            } else {
                                source5.recycle();
                                rootInActiveWindow = nativeReelsBlockerService.getRootInActiveWindow();
                                try {
                                    try {
                                        e5Var.e(rootInActiveWindow, true);
                                        if (rootInActiveWindow != 0) {
                                            rootInActiveWindow.recycle();
                                        }
                                    } catch (RuntimeException unused) {
                                        e5Var.d();
                                        if (rootInActiveWindow != 0) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (rootInActiveWindow != 0) {
                                        rootInActiveWindow.recycle();
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            source5.recycle();
                            throw th4;
                        }
                    } else {
                        rootInActiveWindow = nativeReelsBlockerService.getRootInActiveWindow();
                        e5Var.e(rootInActiveWindow, true);
                        if (rootInActiveWindow != 0) {
                            rootInActiveWindow.recycle();
                        }
                    }
                }
            }
            String str2 = "com.instagram.android";
            if (accessibilityEvent.getEventType() == 32 || accessibilityEvent.getEventType() == 4194304) {
                v5 v5Var2 = this.f3494b0;
                if (v5Var2 != null) {
                    CharSequence packageName5 = accessibilityEvent.getPackageName();
                    String string4 = packageName5 != null ? packageName5.toString() : null;
                    v5Var2.f7028v.incrementAndGet();
                    if (string4 != null && !string4.equals("com.instagram.android") && !string4.equals(v5Var2.f7009a.getPackageName())) {
                        ((e7) v5Var2.f7014g.f9147u).a();
                        v5Var2.f7015h.f();
                        v5Var2.f7016i.b();
                    }
                    v5Var2.l();
                }
                h8 h8Var2 = this.f3495c0;
                if (h8Var2 != null) {
                    h8Var2.f6246d.incrementAndGet();
                    h8Var2.m();
                }
                e5 e5Var2 = this.f3498f0;
                if (e5Var2 != null && (rect = e5Var2.f6074d) != null && !e5Var2.b(e5Var2.f6073c, rect)) {
                    e5Var2.d();
                }
                s7 s7Var = this.f3496d0;
                if (s7Var != null) {
                    t7 t7Var = s7Var.f6845g;
                    if (t7Var != null && !s7Var.b(t7Var.f6910a, t7Var.b)) {
                        s7Var.a();
                    }
                    s7Var.d();
                }
            }
            CharSequence packageName6 = accessibilityEvent.getPackageName();
            if (l.a(packageName6 != null ? packageName6.toString() : null, "com.snapchat.android") || accessibilityEvent.getEventType() == 32 || accessibilityEvent.getEventType() == 4194304) {
                m7 m7Var = this.f3497e0;
                if (m7Var != null) {
                    m7Var.d();
                }
                s7 s7Var2 = this.f3496d0;
                if (s7Var2 != null) {
                    s7Var2.d();
                }
            }
            CharSequence packageName7 = accessibilityEvent.getPackageName();
            if (!l.a(packageName7 != null ? packageName7.toString() : null, "com.instagram.android") || (v5Var = this.f3494b0) == null) {
                string = null;
            } else {
                AccessibilityNodeInfo accessibilityNodeInfo = v5Var.f7032z;
                if (v5Var.f7017j != null && accessibilityNodeInfo != null && accessibilityEvent.getWindowId() == v5Var.A && accessibilityEvent.getEventType() == 2048) {
                    CharSequence className = accessibilityEvent.getClassName();
                    if (l.a(className != null ? className.toString() : null, "android.widget.FrameLayout")) {
                        try {
                            List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.instagram.android:id/" + v5Var.B);
                            try {
                                listFindAccessibilityNodeInfosByViewId.getClass();
                                List<AccessibilityNodeInfo> list2 = listFindAccessibilityNodeInfosByViewId;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it2 = list2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z11 = true;
                                            break;
                                        } else if (((AccessibilityNodeInfo) it2.next()).isVisibleToUser()) {
                                            z11 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    z11 = true;
                                    break;
                                }
                                Iterator<T> it3 = listFindAccessibilityNodeInfosByViewId.iterator();
                                while (it3.hasNext()) {
                                    ((AccessibilityNodeInfo) it3.next()).recycle();
                                }
                                lVar = Boolean.valueOf(z11);
                                if (lVar instanceof se.l) {
                                    lVar = null;
                                }
                                if (l.a((Boolean) lVar, Boolean.TRUE)) {
                                    v5Var.c();
                                    v5Var.l();
                                    string = null;
                                }
                            } catch (Throwable th5) {
                                listFindAccessibilityNodeInfosByViewId.getClass();
                                Iterator<T> it4 = listFindAccessibilityNodeInfosByViewId.iterator();
                                while (it4.hasNext()) {
                                    ((AccessibilityNodeInfo) it4.next()).recycle();
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            lVar = new se.l(th6);
                        }
                    }
                }
                if (accessibilityEvent.getEventType() == 32) {
                    v5Var.f7031y = true;
                    e4 e4Var = (e4) v5Var.f7013f.f6486f;
                    e4Var.b++;
                    string = null;
                    e4Var.f6071e = null;
                } else {
                    string = null;
                }
                v5Var.l();
            }
            CharSequence packageName8 = accessibilityEvent.getPackageName();
            Object obj2 = str2;
            if (l.a(packageName8 != null ? packageName8.toString() : string, "com.instagram.android") && accessibilityEvent.getEventType() == 4096) {
                boolean z14 = this.N.b;
                u6Var = this.P;
                u6 u6Var2 = this.O;
                if (z14 || u6Var2.b.b || u6Var.b.b) {
                    obj2 = str2;
                    obj2 = u6Var;
                    obj2 = str2;
                    obj2 = str2;
                    AccessibilityNodeInfo source6 = accessibilityEvent.getSource();
                    obj2 = u6Var;
                    if (source6 != null) {
                        try {
                            Rect rect7 = new Rect();
                            source6.getBoundsInScreen(rect7);
                            Set set3 = v6.f7033a;
                            boolean z15 = v6.f7033a.contains(source6.getViewIdResourceName()) && v6.a(new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels), source6);
                            g6 g6Var = this.N;
                            int i14 = Build.VERSION.SDK_INT;
                            g6Var.b(z15, i14 >= 28 ? accessibilityEvent.getScrollDeltaX() : 0, i14 >= 28 ? accessibilityEvent.getScrollDeltaY() : 0, accessibilityEvent.getFromIndex(), rect7.height(), SystemClock.elapsedRealtime());
                            u6Var2.b.b(z15, i14 >= 28 ? accessibilityEvent.getScrollDeltaX() : 0, i14 >= 28 ? accessibilityEvent.getScrollDeltaY() : 0, accessibilityEvent.getFromIndex(), rect7.height(), SystemClock.elapsedRealtime());
                            if (z15) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                                Rect rect8 = new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
                                if (l.a(source6.getViewIdResourceName(), "android:id/list") && source6.isScrollable()) {
                                    Rect rect9 = new Rect();
                                    source6.getBoundsInScreen(rect9);
                                    if (source6.isVisibleToUser() && rect9.intersect(rect8) && rect9.width() > rect8.width() / 2 && rect9.height() > rect8.height() / 2) {
                                        AccessibilityNodeInfo parent = source6.getParent();
                                        int i15 = 0;
                                        while (true) {
                                            if (parent != null) {
                                                int i16 = i15 + 1;
                                                if (i15 < 30) {
                                                    if (l.a(parent.getViewIdResourceName(), "com.instagram.android:id/layout_listview_parent_container")) {
                                                        parent.recycle();
                                                    } else {
                                                        AccessibilityNodeInfo parent2 = parent.getParent();
                                                        parent.recycle();
                                                        parent = parent2;
                                                        i15 = i16;
                                                    }
                                                }
                                            }
                                            if (parent != null) {
                                                parent.recycle();
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                if (i14 >= 28) {
                                    scrollDeltaX = accessibilityEvent.getScrollDeltaX();
                                } else {
                                    scrollDeltaX = i2;
                                }
                                if (i14 >= 28) {
                                    scrollDeltaY = accessibilityEvent.getScrollDeltaY();
                                } else {
                                    scrollDeltaY = i2;
                                }
                                u6Var.b.b(z10, scrollDeltaX, scrollDeltaY, accessibilityEvent.getFromIndex(), rect7.height(), SystemClock.elapsedRealtime());
                                source6.recycle();
                                obj = u6Var;
                            }
                            z10 = true;
                            if (i14 >= 28) {
                                scrollDeltaX = accessibilityEvent.getScrollDeltaX();
                            } else {
                                scrollDeltaX = i2;
                            }
                            if (i14 >= 28) {
                                scrollDeltaY = accessibilityEvent.getScrollDeltaY();
                            } else {
                                scrollDeltaY = i2;
                            }
                            u6Var.b.b(z10, scrollDeltaX, scrollDeltaY, accessibilityEvent.getFromIndex(), rect7.height(), SystemClock.elapsedRealtime());
                            source6.recycle();
                            obj = u6Var;
                        } catch (Throwable th7) {
                            source6.recycle();
                            throw th7;
                        }
                    } else {
                        obj2 = str2;
                        obj2 = u6Var;
                        obj2 = str2;
                        i2 = 0;
                        obj = obj2;
                    }
                } else {
                    obj2 = str2;
                    obj2 = u6Var;
                    obj2 = str2;
                    i2 = 0;
                    obj = obj2;
                }
            } else {
                obj2 = str2;
                obj2 = u6Var;
                obj2 = str2;
                i2 = 0;
                obj = obj2;
            }
            CharSequence packageName9 = accessibilityEvent.getPackageName();
            ?? r9 = obj;
            if (l.a(packageName9 != null ? packageName9.toString() : string, "com.facebook.katana") && accessibilityEvent.getEventType() == 4096) {
                boolean z16 = this.Y.f5926a;
                u6 u6Var3 = this.Z;
                if (z16 || u6Var3.b.b) {
                    r9 = obj;
                    r9 = obj;
                    r9 = obj;
                    long jUptimeMillis = SystemClock.uptimeMillis() - this.f3493a0;
                    r9 = jUptimeMillis;
                    if (jUptimeMillis < 1000 && (source2 = accessibilityEvent.getSource()) != null) {
                        try {
                            r9 = source2;
                            Rect rect10 = new Rect();
                            source2.getBoundsInScreen(rect10);
                            boolean z17 = (!source2.isVisibleToUser() || rect10.width() <= getResources().getDisplayMetrics().widthPixels / 2 || rect10.height() <= getResources().getDisplayMetrics().heightPixels / 2 || !w(source2)) ? i2 : 1;
                            b5 b5Var = this.Y;
                            int i17 = Build.VERSION.SDK_INT;
                            b5Var.a(z17, i17 >= 28 ? accessibilityEvent.getScrollDeltaX() : i2, i17 >= 28 ? accessibilityEvent.getScrollDeltaY() : i2, accessibilityEvent.getFromIndex(), rect10.height(), SystemClock.uptimeMillis());
                            u6Var3.b.b(z17, i17 >= 28 ? accessibilityEvent.getScrollDeltaX() : i2, i17 >= 28 ? accessibilityEvent.getScrollDeltaY() : i2, accessibilityEvent.getFromIndex(), rect10.height(), SystemClock.uptimeMillis());
                            source2.recycle();
                            r9 = source2;
                        } catch (Throwable th8) {
                            source2.recycle();
                            throw th8;
                        }
                    }
                }
            }
            r9 = source2;
            r9 = obj;
            r9 = obj;
            r9 = obj;
            Set set4 = f3488v0;
            CharSequence packageName10 = accessibilityEvent.getPackageName();
            if (packageName10 != null) {
                string = packageName10.toString();
            }
            rootInActiveWindow = r9;
            if (te.k.P(set4, string) && accessibilityEvent.getEventType() == 4096 && this.T.f7215a && (source = accessibilityEvent.getSource()) != null) {
                try {
                    rootInActiveWindow = r9;
                    rootInActiveWindow = r9;
                    rootInActiveWindow = r9;
                    Rect rect11 = new Rect();
                    source.getBoundsInScreen(rect11);
                    y7 y7Var = this.T;
                    boolean zG = x7.g(source);
                    int i18 = Build.VERSION.SDK_INT;
                    y7Var.a(zG, i18 >= 28 ? accessibilityEvent.getScrollDeltaX() : i2, i18 >= 28 ? accessibilityEvent.getScrollDeltaY() : i2, accessibilityEvent.getFromIndex(), rect11.height(), SystemClock.elapsedRealtime());
                } finally {
                    source.recycle();
                }
            }
            rootInActiveWindow = r9;
            rootInActiveWindow = r9;
            rootInActiveWindow = r9;
            rootInActiveWindow = r9;
            rootInActiveWindow = r9;
            rootInActiveWindow = r9;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        i3 i3Var = this.C;
        if (i3Var != null) {
            i3Var.unregisterOnSharedPreferenceChangeListener(this.G);
        }
        this.C = null;
        if (this.F) {
            unregisterReceiver(this.H);
            this.F = false;
        }
        p8 p8Var = this.f3504l0;
        if (p8Var != null) {
            p8Var.c();
            l5 l5Var = (l5) p8Var.f6714c;
            l5Var.b = true;
            if (!l5Var.f6482a) {
                ((ExecutorService) l5Var.f6485e).shutdown();
            }
        }
        this.f3504l0 = null;
        e5 e5Var = this.f3498f0;
        if (e5Var != null) {
            e5Var.a();
        }
        this.f3498f0 = null;
        n4 n4Var = this.f3511v;
        if (n4Var != null) {
            n4Var.b();
        }
        this.f3511v = null;
        J();
        this.f3512w = null;
        v5 v5Var = this.f3494b0;
        if (v5Var != null) {
            v5Var.C = true;
            v5Var.c();
            l5 l5Var2 = v5Var.f7013f;
            l5Var2.b = true;
            if (!l5Var2.f6482a) {
                ((ExecutorService) l5Var2.f6485e).shutdown();
            }
            v5Var.f7027u.shutdownNow();
        }
        this.f3494b0 = null;
        h8 h8Var = this.f3495c0;
        if (h8Var != null) {
            h8Var.f6256o = true;
            h8Var.d();
            h8Var.f6245c.shutdownNow();
        }
        this.f3495c0 = null;
        m7 m7Var = this.f3497e0;
        if (m7Var != null) {
            m7Var.l = true;
            m7Var.a();
            m7Var.f6553c.shutdown();
        }
        this.f3497e0 = null;
        s7 s7Var = this.f3496d0;
        if (s7Var != null) {
            s7Var.f6842d = true;
            s7Var.a();
            s7Var.f6841c.shutdown();
        }
        this.f3496d0 = null;
        super.onDestroy();
        J0 = false;
        Object obj = ja.f6363a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ja.d(applicationContext);
        qa qaVar = qa.f6764a;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        qa.b(applicationContext2);
        xf.e eVar = f3.f6132a;
        f3.b(this);
        c3 c3Var = c3.f5971a;
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        c3.b(applicationContext3);
        O();
        I();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
        e5 e5Var = this.f3498f0;
        if (e5Var != null) {
            e5Var.a();
        }
        p8 p8Var = this.f3504l0;
        if (p8Var != null) {
            p8Var.c();
        }
        J();
        i7 i7Var = (i7) this.f3499g0.getValue();
        i7Var.f6295d = null;
        i7Var.f6296e = 0L;
        I();
        n4 n4Var = this.f3511v;
        if (n4Var != null) {
            n4Var.b();
        }
        v5 v5Var = this.f3494b0;
        if (v5Var != null) {
            v5Var.c();
        }
        h8 h8Var = this.f3495c0;
        if (h8Var != null) {
            h8Var.d();
        }
        m7 m7Var = this.f3497e0;
        if (m7Var != null) {
            m7Var.a();
        }
        s7 s7Var = this.f3496d0;
        if (s7Var != null) {
            s7Var.a();
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final boolean onKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        long downTime = keyEvent.getDownTime();
        Long l = this.f3515z;
        if (l != null && downTime == l.longValue()) {
            if (keyEvent.getAction() == 1) {
                this.f3515z = null;
            }
            return true;
        }
        if (keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0 || !L()) {
            return false;
        }
        this.f3515z = Long.valueOf(keyEvent.getDownTime());
        return true;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        FirebaseAnalytics firebaseAnalytics;
        super.onServiceConnected();
        if (l.a(d2.B(this).f6283a.getString("accountType", "personal"), "kid")) {
            disableSelf();
            return;
        }
        v5 v5Var = this.f3494b0;
        int i2 = 1;
        if (v5Var != null) {
            v5Var.C = true;
            v5Var.c();
            l5 l5Var = v5Var.f7013f;
            l5Var.b = true;
            if (!l5Var.f6482a) {
                ((ExecutorService) l5Var.f6485e).shutdown();
            }
            v5Var.f7027u.shutdownNow();
        }
        this.f3494b0 = new v5(this);
        h8 h8Var = this.f3495c0;
        if (h8Var != null) {
            h8Var.f6256o = true;
            h8Var.d();
            h8Var.f6245c.shutdownNow();
        }
        this.f3495c0 = new h8(this);
        m7 m7Var = this.f3497e0;
        if (m7Var != null) {
            m7Var.l = true;
            m7Var.a();
            m7Var.f6553c.shutdown();
        }
        this.f3497e0 = new m7(this);
        s7 s7Var = this.f3496d0;
        if (s7Var != null) {
            s7Var.f6842d = true;
            s7Var.a();
            s7Var.f6841c.shutdown();
        }
        this.f3496d0 = new s7(this);
        e5 e5Var = this.f3498f0;
        if (e5Var != null) {
            e5Var.a();
        }
        this.f3498f0 = new e5(this);
        n4 n4Var = this.f3511v;
        if (n4Var != null) {
            n4Var.b();
        }
        p8 p8Var = this.f3504l0;
        if (p8Var != null) {
            p8Var.c();
            l5 l5Var2 = (l5) p8Var.f6714c;
            l5Var2.b = true;
            if (!l5Var2.f6482a) {
                ((ExecutorService) l5Var2.f6485e).shutdown();
            }
        }
        this.f3504l0 = new p8(this);
        int i10 = 0;
        this.f3511v = new n4(this, 0, 0, null, null, new z6(this, i10), 510);
        u7.i iVar = this.f3513x;
        if (iVar != null) {
            iVar.t();
        }
        this.f3513x = new u7.i(this, "Facebook Feeds Back", new z6(this, i2));
        u7.i iVar2 = this.f3514y;
        if (iVar2 != null) {
            iVar2.t();
        }
        this.f3514y = new u7.i(this, "Facebook System Back", new z6(this, 2));
        t4 t4Var = this.f3512w;
        if (t4Var != null) {
            t4Var.a();
        }
        this.f3512w = new t4(this, new z6(this, 3), new z6(this, 4));
        J0 = true;
        u2 u2Var = (u2) this.Q.getValue();
        u2Var.getClass();
        u2Var.f6944c = System.currentTimeMillis();
        Object obj = ja.f6363a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ja.d(applicationContext);
        qa qaVar = qa.f6764a;
        Context applicationContext2 = getApplicationContext();
        applicationContext2.getClass();
        qa.b(applicationContext2);
        c3 c3Var = c3.f5971a;
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        c3.b(applicationContext3);
        xf.e eVar = f3.f6132a;
        Context applicationContext4 = getApplicationContext();
        applicationContext4.getClass();
        f3.a(applicationContext4, this, new a8.z(8));
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        serviceInfo.eventTypes = 4200485;
        serviceInfo.feedbackType = 16;
        serviceInfo.flags |= 114;
        serviceInfo.notificationTimeout = 50L;
        serviceInfo.packageNames = null;
        setServiceInfo(serviceInfo);
        i3 i3VarB = d2.B(this);
        i3 i3Var = this.C;
        if (i3Var != null) {
            i3Var.unregisterOnSharedPreferenceChangeListener(this.G);
        }
        i3VarB.registerOnSharedPreferenceChangeListener(this.G);
        this.C = i3VarB;
        if (!this.F) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            int i11 = Build.VERSION.SDK_INT;
            d dVar = this.H;
            if (i11 >= 33) {
                registerReceiver(dVar, intentFilter, 4);
            } else {
                registerReceiver(dVar, intentFilter);
            }
            this.F = true;
        }
        if (F()) {
            N();
        }
        if (i3VarB.getBoolean("nativeReelsBlocking", false) && !i3VarB.getBoolean("analytics_native_blocking_enabled_fired", false)) {
            ge.d.d("native_blocking_enabled", t.f20250t);
            h3 h3Var = new h3(i3VarB);
            h3Var.putBoolean("analytics_native_blocking_enabled_fired", true);
            h3Var.a(false);
        }
        String str = i3VarB.getBoolean("nativeReelsBlocking", false) ? "enabled" : "granted_but_off";
        ge.b bVar = ge.b.f5908t;
        Context context = ge.c.f5950a;
        if (!(context != null ? ge.c.h(ge.c.D0(context), bVar) : false) || (firebaseAnalytics = ge.d.f6001a) == null) {
            return;
        }
        g1 g1Var = firebaseAnalytics.f3377a;
        g1Var.getClass();
        g1Var.b(new j1(g1Var, str, i10));
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        O();
        J0 = false;
        Object obj = ja.f6363a;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ja.d(applicationContext);
        return super.onUnbind(intent);
    }

    public final String p(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        if (i2 > 120) {
            return null;
        }
        if (x(accessibilityNodeInfo) && z(accessibilityNodeInfo)) {
            return accessibilityNodeInfo.getContentDescription().toString();
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i10);
            if (child != null) {
                String strP = p(child, i2 + 1);
                child.recycle();
                if (strP != null) {
                    return strP;
                }
            }
        }
        return null;
    }

    public final void s(AccessibilityNodeInfo accessibilityNodeInfo, i3 i3Var, long j10, Boolean bool, Boolean bool2) {
        boolean zBooleanValue;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("com.instagram.android:id/reel_viewer_message_composer");
        boolean z10 = false;
        boolean z11 = (listFindAccessibilityNodeInfosByViewId == null || listFindAccessibilityNodeInfosByViewId.isEmpty()) ? false : true;
        if (listFindAccessibilityNodeInfosByViewId != null) {
            Iterator<T> it = listFindAccessibilityNodeInfosByViewId.iterator();
            while (it.hasNext()) {
                ((AccessibilityNodeInfo) it.next()).recycle();
            }
        }
        Boolean boolE = this.N.e(SystemClock.elapsedRealtime(), r(accessibilityNodeInfo), E(accessibilityNodeInfo));
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (boolE != null) {
            zBooleanValue = boolE.booleanValue();
        } else {
            boolean zE = E(accessibilityNodeInfo);
            boolean z12 = i3Var.getBoolean("nativeAllowSentReel", true);
            String strR = z11 ? r(accessibilityNodeInfo) : null;
            c2 c2Var = this.L;
            c2Var.getClass();
            if (zE || !z12) {
                c2Var.h();
            } else {
                if (z11) {
                    c2Var.b = null;
                    if (((String) c2Var.f5970a) == null) {
                        c2Var.f5970a = strR;
                    }
                    if (strR != null && !strR.equals((String) c2Var.f5970a)) {
                    }
                } else {
                    Long l = (Long) c2Var.b;
                    if (l == null) {
                        c2Var.b = Long.valueOf(j10);
                    } else if (j10 - l.longValue() >= 600) {
                        c2Var.h();
                    }
                }
                zBooleanValue = z10;
            }
            z10 = true;
            zBooleanValue = z10;
        }
        accessibilityNodeInfo.recycle();
        if (zBooleanValue) {
            a(j10, "Reels");
        }
    }

    public final boolean u(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Rect rectI = w0.i(accessibilityNodeInfo);
        try {
            List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str);
            if (listFindAccessibilityNodeInfosByViewId != null && !listFindAccessibilityNodeInfosByViewId.isEmpty()) {
                boolean z10 = false;
                for (AccessibilityNodeInfo accessibilityNodeInfo2 : listFindAccessibilityNodeInfosByViewId) {
                    if (!z10) {
                        accessibilityNodeInfo2.getClass();
                        if (A(rectI, accessibilityNodeInfo2)) {
                            z10 = true;
                        }
                    }
                    accessibilityNodeInfo2.recycle();
                }
                if (z10) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        this.V = 0;
        return a0(accessibilityNodeInfo, str, rectI, 0);
    }

    public final boolean v(ca caVar) {
        mb mbVar = this.f3503k0;
        if (mbVar == null) {
            return false;
        }
        Object obj = i7.f6292g;
        return ge.c.T(caVar, mbVar) && ge.c.v0(caVar, mbVar) > 0;
    }

    public final boolean w(AccessibilityNodeInfo accessibilityNodeInfo) {
        Rect rectI = w0.i(accessibilityNodeInfo);
        if (!rectI.isEmpty()) {
            kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
            s0 s0Var = new s0(rectI, sVar, this);
            u uVar = new u();
            uVar.f9986t = CredentialOption.PRIORITY_DEFAULT;
            if (R(uVar, s0Var, accessibilityNodeInfo, 0)) {
                return true;
            }
            c cVar = new c(16);
            u uVar2 = new u();
            uVar2.f9986t = CredentialOption.PRIORITY_DEFAULT;
            if (!R(uVar2, cVar, accessibilityNodeInfo, 0) && sVar.f9984t && V(accessibilityNodeInfo, 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (y(accessibilityNodeInfo)) {
            Rect rectI = w0.i(accessibilityNodeInfo);
            AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent();
            int i2 = 0;
            while (parent != null) {
                int i10 = i2 + 1;
                if (i2 >= 3) {
                    break;
                }
                Rect rectI2 = w0.i(parent);
                if (rectI2.height() <= rectI.height() * 3 && rectI2.width() > rectI.width() * 2) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    i(parent, 0, rectI.centerY(), linkedHashSet, new int[]{60});
                    if (linkedHashSet.size() >= 3) {
                        parent.recycle();
                        return true;
                    }
                }
                AccessibilityNodeInfo parent2 = parent.getParent();
                parent.recycle();
                parent = parent2;
                i2 = i10;
            }
            if (parent != null) {
                parent.recycle();
            }
        }
        return false;
    }

    public final boolean y(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription != null && (string = contentDescription.toString()) != null && accessibilityNodeInfo.isVisibleToUser()) {
            String strL = l(string);
            if ((strL.length() == 0 ? false : this.f3508s0.contains(strL)) && C0.a(string)) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                if (!rect.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
