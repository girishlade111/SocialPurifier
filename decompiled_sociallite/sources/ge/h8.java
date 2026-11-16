package ge;

import android.accessibilityservice.GestureDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.sociallite.android.R;
import com.sociallite.android.data.NativeReelsBlockerService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class h8 {
    public static final Set B = te.a0.F("com.twitter.android", "com.twitter.android.lite");
    public final a5.g A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeReelsBlockerService f6244a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f6245c = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f6246d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowManager f6247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final se.o f6248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final se.o f6249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f6250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f6251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f6252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f6253k;
    public TextView l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f6254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i8 f6257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a2.e f6263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e8 f6264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f6266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f6267z;

    public h8(NativeReelsBlockerService nativeReelsBlockerService) {
        this.f6244a = nativeReelsBlockerService;
        Object systemService = nativeReelsBlockerService.getSystemService("window");
        systemService.getClass();
        this.f6247e = (WindowManager) systemService;
        this.f6248f = new se.o(new d8(this, 0));
        this.f6249g = new se.o(new d8(this, 1));
        this.f6257p = i8.f6298t;
        this.f6263v = new a2.e(1);
        this.A = new a5.g(this, 17);
    }

    public static final void g(h8 h8Var) {
        LinearLayout linearLayout = h8Var.f6250h;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.getClass();
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.flags &= -17;
            try {
                h8Var.f6247e.updateViewLayout(linearLayout, layoutParams2);
            } catch (Throwable unused) {
            }
        }
    }

    public static e8 k(AccessibilityNodeInfo accessibilityNodeInfo, g gVar) {
        Map map;
        Object next;
        l8 l8Var;
        l8 l8Var2;
        Rect rectI = e4.w0.i(accessibilityNodeInfo);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar4 = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar5 = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.w wVar6 = new kotlin.jvm.internal.w();
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar3 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar4 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar5 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar6 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar7 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.s sVar8 = new kotlin.jvm.internal.s();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f9986t = 500;
        l(uVar, gVar, rectI, sVar3, sVar4, sVar5, sVar6, sVar7, wVar4, wVar5, sVar8, sVar2, sVar, wVar3, wVar2, wVar6, wVar, linkedHashMap, accessibilityNodeInfo, 0, false, null, te.s.f20249t);
        Map map2 = linkedHashMap;
        int size = map2.size();
        l8 l8Var3 = l8.f6492t;
        if (size < 3 || !map2.containsKey(l8Var3)) {
            map2 = te.t.f20250t;
        }
        Iterator it = map2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                map = map2;
                next = null;
                break;
            }
            next = it.next();
            map = map2;
            if (((f8) ((Map.Entry) next).getValue()).b) {
                break;
            }
            map2 = map;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (l8Var2 = (l8) entry.getKey()) == null) {
            if (!map.isEmpty() && sVar8.f9984t) {
                l8Var3 = l8.f6495w;
            } else if (!sVar4.f9984t) {
                l8Var = null;
            }
            l8Var = l8Var3;
        } else {
            l8Var = l8Var2;
        }
        if (wVar6.f9988t == null && sVar.f9984t && wVar2.f9988t != null && sVar2.f9984t) {
            wVar6.f9988t = j8.f6358v;
        }
        return new e8(accessibilityNodeInfo.getWindowId(), rectI, new k8(sVar3.f9984t, l8Var, sVar5.f9984t, sVar6.f9984t, sVar7.f9984t, sVar4.f9984t, (j8) wVar6.f9988t), map, (f8) wVar.f9988t, (f8) wVar2.f9988t, (f8) wVar3.f9988t, (f8) wVar4.f9988t, (f8) wVar5.f9988t);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:142:0x0321  */
    /* JADX WARN: Code duplicated, block: B:144:0x0339  */
    /* JADX WARN: Code duplicated, block: B:147:0x0343  */
    /* JADX WARN: Code duplicated, block: B:150:0x034d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0359  */
    /* JADX WARN: Code duplicated, block: B:154:0x0375  */
    /* JADX WARN: Code duplicated, block: B:157:0x038d A[LOOP:2: B:148:0x0347->B:157:0x038d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:181:0x0424  */
    /* JADX WARN: Code duplicated, block: B:182:0x0433  */
    /* JADX WARN: Code duplicated, block: B:185:0x043d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0457  */
    /* JADX WARN: Code duplicated, block: B:193:0x0462  */
    /* JADX WARN: Code duplicated, block: B:205:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0202  */
    /* JADX WARN: Code duplicated, block: B:94:0x020b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x0375, please report this as an issue */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.Map] */
    public static final void l(kotlin.jvm.internal.u uVar, g gVar, Rect rect, kotlin.jvm.internal.s sVar, kotlin.jvm.internal.s sVar2, kotlin.jvm.internal.s sVar3, kotlin.jvm.internal.s sVar4, kotlin.jvm.internal.s sVar5, kotlin.jvm.internal.w wVar, kotlin.jvm.internal.w wVar2, kotlin.jvm.internal.s sVar6, kotlin.jvm.internal.s sVar7, kotlin.jvm.internal.s sVar8, kotlin.jvm.internal.w wVar3, kotlin.jvm.internal.w wVar4, kotlin.jvm.internal.w wVar5, kotlin.jvm.internal.w wVar6, LinkedHashMap linkedHashMap, AccessibilityNodeInfo accessibilityNodeInfo, int i2, boolean z10, f8 f8Var, List list) {
        kotlin.jvm.internal.s sVar9;
        kotlin.jvm.internal.s sVar10;
        f8 f8Var2;
        kotlin.jvm.internal.w wVar7;
        String str;
        double d2;
        boolean z11;
        CharSequence contentDescription;
        String string;
        String str2;
        kotlin.jvm.internal.s sVar11;
        kotlin.jvm.internal.w wVar8;
        kotlin.jvm.internal.w wVar9;
        int i10;
        int childCount;
        int i11;
        AccessibilityNodeInfo child;
        boolean z12;
        f8 f8Var3;
        Set setF;
        String lowerCase;
        Rect rect2;
        String strP;
        Iterator it;
        Object obj;
        Map.Entry entry;
        l8 l8Var;
        f8 f8Var4;
        Object next;
        List list2;
        Iterator it2;
        String str3;
        Object obj2;
        Iterator it3;
        StringBuilder sb2;
        kotlin.jvm.internal.u uVar2 = uVar;
        kotlin.jvm.internal.s sVar12 = sVar4;
        if (i2 <= 32) {
            int i12 = uVar2.f9986t;
            uVar2.f9986t = i12 - 1;
            if (i12 <= 0 || !((Boolean) gVar.invoke()).booleanValue()) {
                return;
            }
            Rect rectI = e4.w0.i(accessibilityNodeInfo);
            if (accessibilityNodeInfo.isVisibleToUser() && Rect.intersects(rect, rectI)) {
                String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
                if (viewIdResourceName == null) {
                    viewIdResourceName = "";
                }
                String strT0 = qf.k.T0(viewIdResourceName, ":id/", viewIdResourceName);
                if (rectI.width() > rect.width() / 2 && rectI.height() > rect.height() / 3) {
                    if (strT0.equals("MainLanding")) {
                        sVar.f9984t = true;
                    }
                    if (strT0.equals("scaffold_home_tabbed")) {
                        sVar9 = sVar2;
                        sVar9.f9984t = true;
                    } else {
                        sVar9 = sVar2;
                    }
                    Object obj3 = m8.f6566a;
                    if (qf.r.p0(strT0, "xchat_", false) || te.a0.F("ConversationListSearch", "NewDm", "RootDm", "DMConversation", "DMInbox", "dm_conversation", "dm_inbox").contains(strT0)) {
                        sVar10 = sVar3;
                        sVar10.f9984t = true;
                    } else {
                        sVar10 = sVar3;
                    }
                    if (te.a0.F("SearchQuery", "Search", "SearchResults", "SearchLanding", "search_screen").contains(strT0)) {
                        sVar12.f9984t = true;
                    }
                    if (te.a0.F("PostDetail", "Article", "VideoTab", "Profile", "ProfileScreen", "UserProfile", "UserProfileScreen").contains(strT0)) {
                        sVar5.f9984t = true;
                    }
                    f8Var2 = ((!accessibilityNodeInfo.isClickable() || accessibilityNodeInfo.isSelected()) && rectI.height() < rect.height() / 6) ? new f8(new Rect(rectI), accessibilityNodeInfo.isSelected(), list) : f8Var;
                    if (strT0.equals("home_navigation_bar_title") || !accessibilityNodeInfo.isClickable()) {
                        wVar7 = wVar;
                    } else {
                        wVar7 = wVar;
                        wVar7.f9988t = new f8(new Rect(rectI), false, list);
                    }
                    if (accessibilityNodeInfo.isScrollable()) {
                        str = "";
                        if (rectI.width() <= ((double) rect.width()) * 0.7d && rectI.height() > ((double) rect.height()) * 0.5d) {
                            List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
                            actionList.getClass();
                            List<AccessibilityNodeInfo.AccessibilityAction> list3 = actionList;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it4 = list3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (((AccessibilityNodeInfo.AccessibilityAction) it4.next()).getId() == AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP.getId()) {
                                            wVar2.f9988t = new f8(new Rect(rectI), false, list);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (accessibilityNodeInfo.isSelected()) {
                            d2 = 0.18d;
                            if (rectI.top <= ((double) rect.bottom) - (((double) rect.height()) * 0.18d) && rectI.width() < rect.width() / 3 && rectI.height() < rect.height() / 6) {
                                sVar6.f9984t = true;
                            }
                        } else {
                            d2 = 0.18d;
                        }
                        if (!z10 || accessibilityNodeInfo.isSelected()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        contentDescription = accessibilityNodeInfo.getContentDescription();
                        if (contentDescription != null) {
                            string = contentDescription.toString();
                        } else {
                            string = null;
                        }
                        if (string == null) {
                            string = str;
                        }
                        str2 = string;
                        if (rectI.centerY() < (((double) rect.height()) * 0.25d) + ((double) rect.top) || f8Var2 == null) {
                            sVar11 = sVar8;
                            wVar8 = wVar5;
                            rectI = rectI;
                        } else {
                            List list4 = f8Var2.f6152c;
                            Rect rect3 = f8Var2.f6151a;
                            if (rect3.height() >= rect.height() / 8 || rect3.width() >= ((double) rect.width()) * 0.75d) {
                                sVar11 = sVar8;
                                wVar8 = wVar5;
                                rectI = rectI;
                            } else {
                                if (accessibilityNodeInfo.isSelected()) {
                                    sVar7.f9984t = true;
                                }
                                j8 j8VarA = m8.a(str2);
                                if (j8VarA == null) {
                                    CharSequence text = accessibilityNodeInfo.getText();
                                    String string2 = text != null ? text.toString() : null;
                                    if (string2 == null) {
                                        string2 = str;
                                    }
                                    j8VarA = m8.a(string2);
                                }
                                if (j8VarA == j8.f6356t) {
                                    sVar11 = sVar8;
                                    sVar11.f9984t = true;
                                    wVar3.f9988t = new f8(rect3, z11, list4);
                                } else {
                                    sVar11 = sVar8;
                                }
                                if (j8VarA == j8.f6357u) {
                                    wVar4.f9988t = new f8(rect3, z11, list4);
                                }
                                if (!z11 || j8VarA == null) {
                                    wVar8 = wVar5;
                                } else {
                                    wVar8 = wVar5;
                                    wVar8.f9988t = j8VarA;
                                }
                            }
                        }
                        if (rectI.centerY() > ((double) rect.bottom) - (((double) rect.height()) * 0.15d) && f8Var2 != null) {
                            rect2 = f8Var2.f6151a;
                            if (rect2.top > ((double) rect.bottom) - (((double) rect.height()) * d2)) {
                                Object obj4 = m8.f6566a;
                                String string3 = qf.k.Z0(str2).toString();
                                Locale locale = Locale.ROOT;
                                strP = t8.c.p(locale, string3, locale);
                                it = m8.f6566a.entrySet().iterator();
                                loop1: while (true) {
                                    if (it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    next = it.next();
                                    list2 = (List) ((Map.Entry) next).getValue();
                                    Iterator it5 = it;
                                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                        it2 = list2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                str3 = (String) it2.next();
                                                if (strP.equals(str3)) {
                                                    obj2 = next;
                                                } else {
                                                    it3 = it2;
                                                    sb2 = new StringBuilder();
                                                    sb2.append(str3);
                                                    obj2 = next;
                                                    sb2.append(",");
                                                    if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                        if (!qf.r.p0(strP, str3 + " (", false)) {
                                                            it2 = it3;
                                                            next = obj2;
                                                        }
                                                    }
                                                }
                                                obj = obj2;
                                                break loop1;
                                            }
                                            continue;
                                        }
                                    }
                                    it = it5;
                                }
                                entry = (Map.Entry) obj;
                                if (entry != null) {
                                    l8Var = (l8) entry.getKey();
                                } else {
                                    l8Var = null;
                                }
                                if (l8Var != null && ((f8Var4 = (f8) linkedHashMap.get(l8Var)) == null || !f8Var4.b || z11)) {
                                    linkedHashMap.put(l8Var, new f8(rect2, z11, f8Var2.f6152c));
                                }
                            }
                        }
                        if (rectI.centerY() >= (((double) rect.height()) * 0.23d) + ((double) rect.top)) {
                            wVar9 = wVar6;
                            i10 = 0;
                        } else {
                            if (accessibilityNodeInfo.isEditable()) {
                                sVar12.f9984t = true;
                            }
                            if (f8Var2 != null) {
                                Object obj5 = m8.f6566a;
                                setF = te.a0.F("search", "search x", "search twitter", "buscar", "rechercher", "suchen", "cerca", "pesquisar", "検索", "بحث");
                                String string4 = qf.k.Z0(str2).toString();
                                Locale locale2 = Locale.ROOT;
                                locale2.getClass();
                                lowerCase = string4.toLowerCase(locale2);
                                lowerCase.getClass();
                                if (setF.contains(lowerCase)) {
                                    i10 = 0;
                                    wVar9 = wVar6;
                                    wVar9.f9988t = new f8(f8Var2.f6151a, false, f8Var2.f6152c);
                                } else {
                                    wVar9 = wVar6;
                                    i10 = 0;
                                }
                            } else {
                                wVar9 = wVar6;
                                i10 = 0;
                            }
                        }
                        i11 = i10;
                        for (childCount = accessibilityNodeInfo.getChildCount(); i11 < childCount && uVar2.f9986t > 0 && ((Boolean) gVar.invoke()).booleanValue(); childCount = childCount) {
                            child = accessibilityNodeInfo.getChild(i11);
                            if (child == null) {
                                z12 = z11;
                                f8Var3 = f8Var2;
                            } else {
                                try {
                                    z12 = z11;
                                    f8Var3 = f8Var2;
                                    l(uVar2, gVar, rect, sVar, sVar9, sVar10, sVar12, sVar5, wVar7, wVar2, sVar6, sVar7, sVar11, wVar3, wVar4, wVar8, wVar9, linkedHashMap, child, i2 + 1, z12, f8Var3, te.k.i0(list, Integer.valueOf(i11)));
                                    child.recycle();
                                } catch (Throwable th) {
                                    child.recycle();
                                    throw th;
                                }
                            }
                            i11++;
                            uVar2 = uVar;
                            sVar9 = sVar2;
                            sVar10 = sVar3;
                            sVar12 = sVar4;
                            wVar7 = wVar;
                            sVar11 = sVar8;
                            wVar8 = wVar5;
                            wVar9 = wVar6;
                            z11 = z12;
                            f8Var2 = f8Var3;
                        }
                        return;
                    }
                    str = "";
                    if (accessibilityNodeInfo.isSelected()) {
                        d2 = 0.18d;
                        if (rectI.top <= ((double) rect.bottom) - (((double) rect.height()) * 0.18d)) {
                        }
                    } else {
                        d2 = 0.18d;
                    }
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    contentDescription = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription != null) {
                        string = contentDescription.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = str;
                    }
                    str2 = string;
                    if (rectI.centerY() < (((double) rect.height()) * 0.25d) + ((double) rect.top)) {
                        sVar11 = sVar8;
                        wVar8 = wVar5;
                        rectI = rectI;
                    } else {
                        sVar11 = sVar8;
                        wVar8 = wVar5;
                        rectI = rectI;
                    }
                    if (rectI.centerY() > ((double) rect.bottom) - (((double) rect.height()) * 0.15d)) {
                        rect2 = f8Var2.f6151a;
                        if (rect2.top > ((double) rect.bottom) - (((double) rect.height()) * d2)) {
                            Object obj6 = m8.f6566a;
                            String string5 = qf.k.Z0(str2).toString();
                            Locale locale3 = Locale.ROOT;
                            strP = t8.c.p(locale3, string5, locale3);
                            it = m8.f6566a.entrySet().iterator();
                            loop1: while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next = it.next();
                                list2 = (List) ((Map.Entry) next).getValue();
                                Iterator it6 = it;
                                if (list2 instanceof Collection) {
                                    it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            str3 = (String) it2.next();
                                            if (strP.equals(str3)) {
                                                it3 = it2;
                                                sb2 = new StringBuilder();
                                                sb2.append(str3);
                                                obj2 = next;
                                                sb2.append(",");
                                                if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                    if (!qf.r.p0(strP, str3 + " (", false)) {
                                                        it2 = it3;
                                                        next = obj2;
                                                    }
                                                }
                                            } else {
                                                obj2 = next;
                                            }
                                            obj = obj2;
                                            break loop1;
                                        }
                                        continue;
                                    }
                                } else {
                                    it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            str3 = (String) it2.next();
                                            if (strP.equals(str3)) {
                                                it3 = it2;
                                                sb2 = new StringBuilder();
                                                sb2.append(str3);
                                                obj2 = next;
                                                sb2.append(",");
                                                if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                    if (!qf.r.p0(strP, str3 + " (", false)) {
                                                        it2 = it3;
                                                        next = obj2;
                                                    }
                                                }
                                            } else {
                                                obj2 = next;
                                            }
                                            obj = obj2;
                                            break loop1;
                                        }
                                        continue;
                                    }
                                }
                                it = it6;
                            }
                            entry = (Map.Entry) obj;
                            if (entry != null) {
                                l8Var = (l8) entry.getKey();
                            } else {
                                l8Var = null;
                            }
                            if (l8Var != null) {
                                linkedHashMap.put(l8Var, new f8(rect2, z11, f8Var2.f6152c));
                            }
                        }
                    }
                    if (rectI.centerY() >= (((double) rect.height()) * 0.23d) + ((double) rect.top)) {
                        wVar9 = wVar6;
                        i10 = 0;
                    } else {
                        if (accessibilityNodeInfo.isEditable()) {
                            sVar12.f9984t = true;
                        }
                        if (f8Var2 != null) {
                            Object obj7 = m8.f6566a;
                            setF = te.a0.F("search", "search x", "search twitter", "buscar", "rechercher", "suchen", "cerca", "pesquisar", "検索", "بحث");
                            String string6 = qf.k.Z0(str2).toString();
                            Locale locale4 = Locale.ROOT;
                            locale4.getClass();
                            lowerCase = string6.toLowerCase(locale4);
                            lowerCase.getClass();
                            if (setF.contains(lowerCase)) {
                                i10 = 0;
                                wVar9 = wVar6;
                                wVar9.f9988t = new f8(f8Var2.f6151a, false, f8Var2.f6152c);
                            } else {
                                wVar9 = wVar6;
                                i10 = 0;
                            }
                        } else {
                            wVar9 = wVar6;
                            i10 = 0;
                        }
                    }
                    i11 = i10;
                    while (i11 < childCount) {
                        child = accessibilityNodeInfo.getChild(i11);
                        if (child == null) {
                            z12 = z11;
                            f8Var3 = f8Var2;
                        } else {
                            z12 = z11;
                            f8Var3 = f8Var2;
                            l(uVar2, gVar, rect, sVar, sVar9, sVar10, sVar12, sVar5, wVar7, wVar2, sVar6, sVar7, sVar11, wVar3, wVar4, wVar8, wVar9, linkedHashMap, child, i2 + 1, z12, f8Var3, te.k.i0(list, Integer.valueOf(i11)));
                            child.recycle();
                        }
                        i11++;
                        uVar2 = uVar;
                        sVar9 = sVar2;
                        sVar10 = sVar3;
                        sVar12 = sVar4;
                        wVar7 = wVar;
                        sVar11 = sVar8;
                        wVar8 = wVar5;
                        wVar9 = wVar6;
                        z11 = z12;
                        f8Var2 = f8Var3;
                    }
                }
                sVar9 = sVar2;
                sVar10 = sVar3;
                if (accessibilityNodeInfo.isClickable()) {
                }
                if (strT0.equals("home_navigation_bar_title")) {
                    wVar7 = wVar;
                } else {
                    wVar7 = wVar;
                }
                if (accessibilityNodeInfo.isScrollable()) {
                    str = "";
                    if (rectI.width() <= ((double) rect.width()) * 0.7d) {
                    }
                    if (accessibilityNodeInfo.isSelected()) {
                        d2 = 0.18d;
                        if (rectI.top <= ((double) rect.bottom) - (((double) rect.height()) * 0.18d)) {
                        }
                    } else {
                        d2 = 0.18d;
                    }
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    contentDescription = accessibilityNodeInfo.getContentDescription();
                    if (contentDescription != null) {
                        string = contentDescription.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = str;
                    }
                    str2 = string;
                    if (rectI.centerY() < (((double) rect.height()) * 0.25d) + ((double) rect.top)) {
                        sVar11 = sVar8;
                        wVar8 = wVar5;
                        rectI = rectI;
                    } else {
                        sVar11 = sVar8;
                        wVar8 = wVar5;
                        rectI = rectI;
                    }
                    if (rectI.centerY() > ((double) rect.bottom) - (((double) rect.height()) * 0.15d)) {
                        rect2 = f8Var2.f6151a;
                        if (rect2.top > ((double) rect.bottom) - (((double) rect.height()) * d2)) {
                            Object obj8 = m8.f6566a;
                            String string7 = qf.k.Z0(str2).toString();
                            Locale locale5 = Locale.ROOT;
                            strP = t8.c.p(locale5, string7, locale5);
                            it = m8.f6566a.entrySet().iterator();
                            loop1: while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next = it.next();
                                list2 = (List) ((Map.Entry) next).getValue();
                                Iterator it7 = it;
                                if (list2 instanceof Collection) {
                                    it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            str3 = (String) it2.next();
                                            if (strP.equals(str3)) {
                                                it3 = it2;
                                                sb2 = new StringBuilder();
                                                sb2.append(str3);
                                                obj2 = next;
                                                sb2.append(",");
                                                if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                    if (!qf.r.p0(strP, str3 + " (", false)) {
                                                        it2 = it3;
                                                        next = obj2;
                                                    }
                                                }
                                            } else {
                                                obj2 = next;
                                            }
                                            obj = obj2;
                                            break loop1;
                                        }
                                        continue;
                                    }
                                } else {
                                    it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            str3 = (String) it2.next();
                                            if (strP.equals(str3)) {
                                                it3 = it2;
                                                sb2 = new StringBuilder();
                                                sb2.append(str3);
                                                obj2 = next;
                                                sb2.append(",");
                                                if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                    if (!qf.r.p0(strP, str3 + " (", false)) {
                                                        it2 = it3;
                                                        next = obj2;
                                                    }
                                                }
                                            } else {
                                                obj2 = next;
                                            }
                                            obj = obj2;
                                            break loop1;
                                        }
                                        continue;
                                    }
                                }
                                it = it7;
                            }
                            entry = (Map.Entry) obj;
                            if (entry != null) {
                                l8Var = (l8) entry.getKey();
                            } else {
                                l8Var = null;
                            }
                            if (l8Var != null) {
                                linkedHashMap.put(l8Var, new f8(rect2, z11, f8Var2.f6152c));
                            }
                        }
                    }
                    if (rectI.centerY() >= (((double) rect.height()) * 0.23d) + ((double) rect.top)) {
                        wVar9 = wVar6;
                        i10 = 0;
                    } else {
                        if (accessibilityNodeInfo.isEditable()) {
                            sVar12.f9984t = true;
                        }
                        if (f8Var2 != null) {
                            Object obj9 = m8.f6566a;
                            setF = te.a0.F("search", "search x", "search twitter", "buscar", "rechercher", "suchen", "cerca", "pesquisar", "検索", "بحث");
                            String string8 = qf.k.Z0(str2).toString();
                            Locale locale6 = Locale.ROOT;
                            locale6.getClass();
                            lowerCase = string8.toLowerCase(locale6);
                            lowerCase.getClass();
                            if (setF.contains(lowerCase)) {
                                i10 = 0;
                                wVar9 = wVar6;
                                wVar9.f9988t = new f8(f8Var2.f6151a, false, f8Var2.f6152c);
                            } else {
                                wVar9 = wVar6;
                                i10 = 0;
                            }
                        } else {
                            wVar9 = wVar6;
                            i10 = 0;
                        }
                    }
                    i11 = i10;
                    while (i11 < childCount) {
                        child = accessibilityNodeInfo.getChild(i11);
                        if (child == null) {
                            z12 = z11;
                            f8Var3 = f8Var2;
                        } else {
                            z12 = z11;
                            f8Var3 = f8Var2;
                            l(uVar2, gVar, rect, sVar, sVar9, sVar10, sVar12, sVar5, wVar7, wVar2, sVar6, sVar7, sVar11, wVar3, wVar4, wVar8, wVar9, linkedHashMap, child, i2 + 1, z12, f8Var3, te.k.i0(list, Integer.valueOf(i11)));
                            child.recycle();
                        }
                        i11++;
                        uVar2 = uVar;
                        sVar9 = sVar2;
                        sVar10 = sVar3;
                        sVar12 = sVar4;
                        wVar7 = wVar;
                        sVar11 = sVar8;
                        wVar8 = wVar5;
                        wVar9 = wVar6;
                        z11 = z12;
                        f8Var2 = f8Var3;
                    }
                }
                str = "";
                if (accessibilityNodeInfo.isSelected()) {
                    d2 = 0.18d;
                    if (rectI.top <= ((double) rect.bottom) - (((double) rect.height()) * 0.18d)) {
                    }
                } else {
                    d2 = 0.18d;
                }
                if (z10) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                contentDescription = accessibilityNodeInfo.getContentDescription();
                if (contentDescription != null) {
                    string = contentDescription.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = str;
                }
                str2 = string;
                if (rectI.centerY() < (((double) rect.height()) * 0.25d) + ((double) rect.top)) {
                    sVar11 = sVar8;
                    wVar8 = wVar5;
                    rectI = rectI;
                } else {
                    sVar11 = sVar8;
                    wVar8 = wVar5;
                    rectI = rectI;
                }
                if (rectI.centerY() > ((double) rect.bottom) - (((double) rect.height()) * 0.15d)) {
                    rect2 = f8Var2.f6151a;
                    if (rect2.top > ((double) rect.bottom) - (((double) rect.height()) * d2)) {
                        Object obj10 = m8.f6566a;
                        String string9 = qf.k.Z0(str2).toString();
                        Locale locale7 = Locale.ROOT;
                        strP = t8.c.p(locale7, string9, locale7);
                        it = m8.f6566a.entrySet().iterator();
                        loop1: while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            }
                            next = it.next();
                            list2 = (List) ((Map.Entry) next).getValue();
                            Iterator it8 = it;
                            if (list2 instanceof Collection) {
                                it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        str3 = (String) it2.next();
                                        if (strP.equals(str3)) {
                                            it3 = it2;
                                            sb2 = new StringBuilder();
                                            sb2.append(str3);
                                            obj2 = next;
                                            sb2.append(",");
                                            if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                if (!qf.r.p0(strP, str3 + " (", false)) {
                                                    it2 = it3;
                                                    next = obj2;
                                                }
                                            }
                                        } else {
                                            obj2 = next;
                                        }
                                        obj = obj2;
                                        break loop1;
                                    }
                                    continue;
                                }
                            } else {
                                it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        str3 = (String) it2.next();
                                        if (strP.equals(str3)) {
                                            it3 = it2;
                                            sb2 = new StringBuilder();
                                            sb2.append(str3);
                                            obj2 = next;
                                            sb2.append(",");
                                            if (!qf.r.p0(strP, sb2.toString(), false)) {
                                                if (!qf.r.p0(strP, str3 + " (", false)) {
                                                    it2 = it3;
                                                    next = obj2;
                                                }
                                            }
                                        } else {
                                            obj2 = next;
                                        }
                                        obj = obj2;
                                        break loop1;
                                    }
                                    continue;
                                }
                            }
                            it = it8;
                        }
                        entry = (Map.Entry) obj;
                        if (entry != null) {
                            l8Var = (l8) entry.getKey();
                        } else {
                            l8Var = null;
                        }
                        if (l8Var != null) {
                            linkedHashMap.put(l8Var, new f8(rect2, z11, f8Var2.f6152c));
                        }
                    }
                }
                if (rectI.centerY() >= (((double) rect.height()) * 0.23d) + ((double) rect.top)) {
                    wVar9 = wVar6;
                    i10 = 0;
                } else {
                    if (accessibilityNodeInfo.isEditable()) {
                        sVar12.f9984t = true;
                    }
                    if (f8Var2 != null) {
                        Object obj11 = m8.f6566a;
                        setF = te.a0.F("search", "search x", "search twitter", "buscar", "rechercher", "suchen", "cerca", "pesquisar", "検索", "بحث");
                        String string10 = qf.k.Z0(str2).toString();
                        Locale locale8 = Locale.ROOT;
                        locale8.getClass();
                        lowerCase = string10.toLowerCase(locale8);
                        lowerCase.getClass();
                        if (setF.contains(lowerCase)) {
                            i10 = 0;
                            wVar9 = wVar6;
                            wVar9.f9988t = new f8(f8Var2.f6151a, false, f8Var2.f6152c);
                        } else {
                            wVar9 = wVar6;
                            i10 = 0;
                        }
                    } else {
                        wVar9 = wVar6;
                        i10 = 0;
                    }
                }
                i11 = i10;
                while (i11 < childCount) {
                    child = accessibilityNodeInfo.getChild(i11);
                    if (child == null) {
                        z12 = z11;
                        f8Var3 = f8Var2;
                    } else {
                        z12 = z11;
                        f8Var3 = f8Var2;
                        l(uVar2, gVar, rect, sVar, sVar9, sVar10, sVar12, sVar5, wVar7, wVar2, sVar6, sVar7, sVar11, wVar3, wVar4, wVar8, wVar9, linkedHashMap, child, i2 + 1, z12, f8Var3, te.k.i0(list, Integer.valueOf(i11)));
                        child.recycle();
                    }
                    i11++;
                    uVar2 = uVar;
                    sVar9 = sVar2;
                    sVar10 = sVar3;
                    sVar12 = sVar4;
                    wVar7 = wVar;
                    sVar11 = sVar8;
                    wVar8 = wVar5;
                    wVar9 = wVar6;
                    z11 = z12;
                    f8Var2 = f8Var3;
                }
            }
        }
    }

    public final boolean a() {
        NativeReelsBlockerService nativeReelsBlockerService = this.f6244a;
        i3 i3VarB = d2.B(nativeReelsBlockerService);
        return !kotlin.jvm.internal.l.a(i3VarB.f6283a.getString("accountType", "personal"), "kid") && mb.f6571i.c(nativeReelsBlockerService).O0() && i3VarB.getBoolean("nativeReelsBlocking", false) && i3VarB.getBoolean("nativeBlockTwitter", false) && (i3VarB.getBoolean("nativeBlockTwitterExplore", false) || i3VarB.getBoolean("nativeXDmsOnlyMode", false) || i3VarB.getBoolean("nativeBlockTwitterForYou", true));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0187  */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x030b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0315  */
    /* JADX WARN: Code duplicated, block: B:194:0x031f  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    public final void b(final e8 e8Var) {
        i8 i8Var;
        boolean z10;
        i8 i8Var2;
        h8 h8Var;
        i8 i8Var3;
        long jElapsedRealtime;
        long j10;
        int i2;
        boolean zQ;
        f8 f8Var;
        boolean z11;
        i8 i8Var4;
        this.f6264w = e8Var;
        f8 f8Var2 = e8Var.f6100g;
        Map map = e8Var.f6097d;
        Rect rect = e8Var.b;
        k8 k8Var = e8Var.f6096c;
        boolean z12 = k8Var.f6441a;
        boolean z13 = k8Var.f6445f;
        boolean z14 = k8Var.f6442c;
        boolean z15 = k8Var.f6444e;
        boolean z16 = k8Var.f6443d;
        l8 l8Var = k8Var.b;
        f8 f8Var3 = e8Var.f6099f;
        if (f8Var2 != null && f8Var3 != null) {
            this.f6266y = Boolean.valueOf(f8Var2.f6151a.centerX() < f8Var3.f6151a.centerX());
        }
        NativeReelsBlockerService nativeReelsBlockerService = this.f6244a;
        i3 i3VarB = d2.B(nativeReelsBlockerService);
        boolean z17 = i3VarB.getBoolean("nativeXDmsOnlyMode", false);
        int i10 = e8Var.f6095a;
        boolean z18 = i3VarB.getBoolean("nativeBlockTwitterForYou", true) && !z17;
        a2.e eVar = this.f6263v;
        eVar.getClass();
        l8 l8Var2 = l8.f6492t;
        boolean z19 = (z13 || (z12 && l8Var == l8Var2)) && (l8Var == null || l8Var == l8Var2);
        i8 i8Var5 = i8.f6299u;
        l8 l8Var3 = l8.f6493u;
        l8 l8Var4 = l8.f6494v;
        i8 i8Var6 = i8.f6301w;
        j8 j8Var = j8.f6356t;
        i8 i8Var7 = i8.f6300v;
        i8 i8Var8 = i8.f6298t;
        if (z18 && z19 && !z14 && !z16 && !z15) {
            i8Var = i8Var6;
            Integer num = (Integer) eVar.f88c;
            if (num == null || num.intValue() != i10) {
                eVar.f88c = null;
                eVar.f89d = null;
                eVar.b = false;
                eVar.f88c = Integer.valueOf(i10);
            }
            j8 j8Var2 = k8Var.f6446g;
            if (j8Var2 != null && (!eVar.b || j8Var2 == j8Var)) {
                eVar.f89d = j8Var2;
                eVar.b = false;
            }
            j8 j8Var3 = (j8) eVar.f89d;
            if (j8Var3 == null || j8Var3 == j8Var) {
                i8Var2 = i8Var;
            } else {
                z10 = false;
            }
            if (i8Var2 == i8Var8) {
                h();
                n();
                this.f6265x = false;
                this.f6257p = i8Var2;
                if (i3VarB.getBoolean("nativeBlockTwitterForYou", true) || z17) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                f8 f8Var4 = e8Var.f6100g;
                if (z11 || !z13 || l8Var != l8Var2 || z14 || z16 || z15 || f8Var4 == null || f8Var3 == null) {
                    i();
                    return;
                }
                Rect rect2 = new Rect(f8Var4.f6151a);
                if (!rect2.intersect(e(rect)) || rect2.isEmpty()) {
                    i();
                    return;
                } else {
                    this.f6251i = c(this.f6251i, rect2, "SocialLite X For you hidden", 2032, (Resources.getSystem().getConfiguration().uiMode & 48) == 32, this.f6247e);
                    return;
                }
            }
            h8Var = this;
            h8Var.i();
            if (h8Var.f6257p != i8Var2) {
                h8Var.h();
                h8Var.n();
                h8Var.f6257p = i8Var2;
            }
            i8Var3 = i8Var;
            if (i8Var2 != i8Var5 || i8Var2 == i8Var3 || h8Var.f6262u) {
                h8Var.o(e8Var, i8Var2);
            } else {
                h8Var.h();
            }
            jElapsedRealtime = SystemClock.elapsedRealtime();
            if (i8Var2 != i8Var3 && !h8Var.f6262u) {
                if (h8Var.f6259r == 0) {
                    h8Var.f6259r = jElapsedRealtime;
                }
                if (jElapsedRealtime - h8Var.f6259r > 4000 || h8Var.f6260s >= 4) {
                    h8Var.f6262u = true;
                    h8Var.p();
                    return;
                }
                if (((j8) eVar.f89d) == j8Var && !h8Var.f6265x) {
                    h8Var.f6265x = true;
                    try {
                        q1.b.G(nativeReelsBlockerService).e("twitter");
                    } catch (Throwable unused) {
                    }
                }
                if (jElapsedRealtime - h8Var.f6258q >= 650) {
                    if (f8Var3 == null) {
                        f8 f8Var5 = e8Var.f6101h;
                        if (f8Var5 == null) {
                            f8Var5 = (f8) map.get(l8Var2);
                        }
                        if ((f8Var5 == null || !h8Var.j(e8Var, f8Var5, 16)) && (f8Var = e8Var.f6102i) != null) {
                            h8Var.j(e8Var, f8Var, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP.getId());
                        }
                    } else if (h8Var.j(e8Var, f8Var3, 16)) {
                        eVar.b = false;
                    }
                    h8Var.f6258q = jElapsedRealtime;
                    h8Var.f6260s++;
                    return;
                }
                return;
            }
            if (i8Var2 == i8Var7 || h8Var.f6262u) {
                if (h8Var.f6261t) {
                    if (jElapsedRealtime - h8Var.f6259r <= HTTPTimeoutManager.REDUCED_TIMEOUT_MS) {
                        h8Var.f6261t = false;
                        h8Var.f6262u = true;
                        h8Var.p();
                    }
                    if (jElapsedRealtime - h8Var.f6258q >= 500 || h8Var.f6260s >= 2) {
                    }
                    f8 f8Var6 = e8Var.f6098e;
                    if (f8Var6 == null) {
                        f8Var6 = (f8) map.get(l8Var3);
                    }
                    if (f8Var6 != null) {
                        final Path path = new Path();
                        Rect rect3 = f8Var6.f6151a;
                        path.moveTo(rect3.exactCenterX(), rect3.exactCenterY());
                        final a8.z zVar = new a8.z(11);
                        final long j11 = 60;
                        h8Var = this;
                        h8Var.q(e8Var, new hf.a() { // from class: ge.a8
                            @Override // hf.a
                            public final Object invoke() {
                                final h8 h8Var2 = this.f5893t;
                                LinearLayout linearLayout = h8Var2.f6250h;
                                if (linearLayout != null) {
                                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                    layoutParams.getClass();
                                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                                    layoutParams2.flags |= 16;
                                    try {
                                        h8Var2.f6247e.updateViewLayout(linearLayout, layoutParams2);
                                    } catch (Throwable unused2) {
                                    }
                                }
                                final LinearLayout linearLayout2 = h8Var2.f6250h;
                                final i8 i8Var9 = h8Var2.f6257p;
                                Handler handler = h8Var2.b;
                                final e8 e8Var2 = e8Var;
                                final Path path2 = path;
                                final long j12 = j11;
                                final a8.z zVar2 = zVar;
                                handler.postDelayed(new Runnable() { // from class: ge.b8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final h8 h8Var3 = h8Var2;
                                        if (!h8Var3.f6256o && h8Var3.f6250h == linearLayout2 && h8Var3.f6257p == i8Var9) {
                                            final Path path3 = path2;
                                            final long j13 = j12;
                                            final a8.z zVar3 = zVar2;
                                            if (h8Var3.q(e8Var2, new hf.a() { // from class: ge.c8
                                                @Override // hf.a
                                                public final Object invoke() {
                                                    h8 h8Var4 = h8Var3;
                                                    return Boolean.valueOf(h8Var4.f6244a.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path3, 0L, j13)).build(), new g8(zVar3, h8Var4), h8Var4.b));
                                                }
                                            })) {
                                                return;
                                            }
                                        }
                                        h8.g(h8Var3);
                                    }
                                }, 80L);
                                return Boolean.TRUE;
                            }
                        });
                    }
                    h8Var.f6258q = jElapsedRealtime;
                    h8Var.f6260s++;
                    return;
                }
            }
            if (h8Var.f6259r == 0) {
                h8Var.f6259r = jElapsedRealtime;
            }
            if (jElapsedRealtime - h8Var.f6259r > 2500 || h8Var.f6260s >= 3) {
                h8Var.f6262u = true;
                h8Var.o(e8Var, i8Var2);
                return;
            }
            if (jElapsedRealtime - h8Var.f6258q >= 700) {
                f8 f8Var7 = (f8) map.get(l8Var4);
                if (f8Var7 == null) {
                    j10 = jElapsedRealtime;
                    if (z15 || z16) {
                        i2 = 2;
                        zQ = h8Var.q(e8Var, new d8(h8Var, i2));
                    } else if (l8Var == l8Var2) {
                        final Path path2 = new Path();
                        float fExactCenterX = rect.exactCenterX();
                        path2.moveTo(fExactCenterX, (rect.height() * 0.35f) + rect.top);
                        path2.lineTo(fExactCenterX, (rect.height() * 0.6f) + rect.top);
                        final a8.z zVar2 = new a8.z(11);
                        final long j12 = 300;
                        h8Var = this;
                        zQ = h8Var.q(e8Var, new hf.a() { // from class: ge.a8
                            @Override // hf.a
                            public final Object invoke() {
                                final h8 h8Var2 = this.f5893t;
                                LinearLayout linearLayout = h8Var2.f6250h;
                                if (linearLayout != null) {
                                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                    layoutParams.getClass();
                                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                                    layoutParams2.flags |= 16;
                                    try {
                                        h8Var2.f6247e.updateViewLayout(linearLayout, layoutParams2);
                                    } catch (Throwable unused2) {
                                    }
                                }
                                final LinearLayout linearLayout2 = h8Var2.f6250h;
                                final i8 i8Var9 = h8Var2.f6257p;
                                Handler handler = h8Var2.b;
                                final e8 e8Var2 = e8Var;
                                final Path path3 = path2;
                                final long j13 = j12;
                                final a8.z zVar3 = zVar2;
                                handler.postDelayed(new Runnable() { // from class: ge.b8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final h8 h8Var3 = h8Var2;
                                        if (!h8Var3.f6256o && h8Var3.f6250h == linearLayout2 && h8Var3.f6257p == i8Var9) {
                                            final Path path4 = path3;
                                            final long j14 = j13;
                                            final a8.z zVar4 = zVar3;
                                            if (h8Var3.q(e8Var2, new hf.a() { // from class: ge.c8
                                                @Override // hf.a
                                                public final Object invoke() {
                                                    h8 h8Var4 = h8Var3;
                                                    return Boolean.valueOf(h8Var4.f6244a.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path4, 0L, j14)).build(), new g8(zVar4, h8Var4), h8Var4.b));
                                                }
                                            })) {
                                                return;
                                            }
                                        }
                                        h8.g(h8Var3);
                                    }
                                }, 80L);
                                return Boolean.TRUE;
                            }
                        });
                    } else {
                        zQ = false;
                    }
                    h8Var.f6258q = j10;
                    int i11 = h8Var.f6260s + 1;
                    h8Var.f6260s = i11;
                    if (!zQ || i11 < i2) {
                        return;
                    }
                    h8Var.f6262u = true;
                    h8Var.o(e8Var, i8Var2);
                    return;
                }
                final Path path3 = new Path();
                Rect rect4 = f8Var7.f6151a;
                path3.moveTo(rect4.exactCenterX(), rect4.exactCenterY());
                final a8.z zVar3 = new a8.z(11);
                final long j13 = 60;
                j10 = jElapsedRealtime;
                h8Var = this;
                zQ = h8Var.q(e8Var, new hf.a() { // from class: ge.a8
                    @Override // hf.a
                    public final Object invoke() {
                        final h8 h8Var2 = this.f5893t;
                        LinearLayout linearLayout = h8Var2.f6250h;
                        if (linearLayout != null) {
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            layoutParams.getClass();
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            layoutParams2.flags |= 16;
                            try {
                                h8Var2.f6247e.updateViewLayout(linearLayout, layoutParams2);
                            } catch (Throwable unused2) {
                            }
                        }
                        final LinearLayout linearLayout2 = h8Var2.f6250h;
                        final i8 i8Var9 = h8Var2.f6257p;
                        Handler handler = h8Var2.b;
                        final e8 e8Var2 = e8Var;
                        final Path path4 = path3;
                        final long j14 = j13;
                        final a8.z zVar4 = zVar3;
                        handler.postDelayed(new Runnable() { // from class: ge.b8
                            @Override // java.lang.Runnable
                            public final void run() {
                                final h8 h8Var3 = h8Var2;
                                if (!h8Var3.f6256o && h8Var3.f6250h == linearLayout2 && h8Var3.f6257p == i8Var9) {
                                    final Path path5 = path4;
                                    final long j15 = j14;
                                    final a8.z zVar5 = zVar4;
                                    if (h8Var3.q(e8Var2, new hf.a() { // from class: ge.c8
                                        @Override // hf.a
                                        public final Object invoke() {
                                            h8 h8Var4 = h8Var3;
                                            return Boolean.valueOf(h8Var4.f6244a.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path5, 0L, j15)).build(), new g8(zVar5, h8Var4), h8Var4.b));
                                        }
                                    })) {
                                        return;
                                    }
                                }
                                h8.g(h8Var3);
                            }
                        }, 80L);
                        return Boolean.TRUE;
                    }
                });
                i2 = 2;
                h8Var.f6258q = j10;
                int i12 = h8Var.f6260s + 1;
                h8Var.f6260s = i12;
                if (zQ) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        i8Var = i8Var6;
        eVar.f88c = null;
        eVar.f89d = null;
        z10 = false;
        eVar.b = false;
        Object obj = m8.f6566a;
        boolean z20 = i3VarB.getBoolean("nativeBlockTwitterExplore", z10);
        if (z17 && z15) {
            i8Var4 = i8Var7;
        } else if (z15 || z14) {
            i8Var4 = i8Var8;
        } else if ((z17 && z12 && l8Var != null && l8Var != l8Var4) || (z17 && z16)) {
            i8Var4 = i8Var7;
        } else if (!z17 && z20 && z12 && l8Var == l8Var3 && !z16) {
            i8Var4 = i8Var5;
        } else {
            i8Var4 = i8Var8;
        }
        i8Var2 = i8Var4;
        if (i8Var2 == i8Var8) {
            h();
            n();
            this.f6265x = false;
            this.f6257p = i8Var2;
            if (i3VarB.getBoolean("nativeBlockTwitterForYou", true)) {
                z11 = false;
            } else {
                z11 = false;
            }
            f8 f8Var8 = e8Var.f6100g;
            if (z11) {
            }
            i();
            return;
        }
        h8Var = this;
        h8Var.i();
        if (h8Var.f6257p != i8Var2) {
            h8Var.h();
            h8Var.n();
            h8Var.f6257p = i8Var2;
        }
        i8Var3 = i8Var;
        if (i8Var2 != i8Var5) {
            h8Var.o(e8Var, i8Var2);
        } else {
            h8Var.o(e8Var, i8Var2);
        }
        jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i8Var2 != i8Var3) {
        }
        if (i8Var2 == i8Var7) {
        }
        if (h8Var.f6261t) {
            if (jElapsedRealtime - h8Var.f6259r <= HTTPTimeoutManager.REDUCED_TIMEOUT_MS) {
                if (jElapsedRealtime - h8Var.f6258q >= 500) {
                }
            } else {
                h8Var.f6261t = false;
                h8Var.f6262u = true;
                h8Var.p();
            }
        }
    }

    public final View c(View view, Rect rect, String str, int i2, boolean z10, WindowManager windowManager) {
        View view2;
        Context context;
        if (view == null) {
            if (i2 == 2038) {
                Object value = this.f6248f.getValue();
                value.getClass();
                context = (Context) value;
            } else {
                context = this.f6244a;
            }
            view2 = new View(context);
            view2.setClickable(true);
            view2.setImportantForAccessibility(2);
        } else {
            view2 = view;
        }
        view2.setBackgroundColor(z10 ? -16777216 : -1);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(rect.width(), rect.height(), rect.left, rect.top, i2, 296, -1);
        layoutParams.gravity = 51;
        layoutParams.setTitle(str);
        layoutParams.windowAnimations = 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            layoutParams.setFitInsetsTypes(0);
            layoutParams.layoutInDisplayCutoutMode = 3;
        } else if (i10 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            if (view == null) {
                windowManager.addView(view2, layoutParams);
                return view2;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            WindowManager.LayoutParams layoutParams3 = (WindowManager.LayoutParams) layoutParams2;
            if (layoutParams3.x == layoutParams.x && layoutParams3.y == layoutParams.y && layoutParams3.width == layoutParams.width && layoutParams3.height == layoutParams.height) {
                return view2;
            }
            windowManager.updateViewLayout(view2, layoutParams);
            return view2;
        } catch (RuntimeException unused) {
            return view;
        }
    }

    public final void d() {
        this.f6246d.incrementAndGet();
        this.b.removeCallbacks(this.A);
        h();
        i();
        n();
        a2.e eVar = this.f6263v;
        eVar.f88c = null;
        eVar.f89d = null;
        eVar.b = false;
        this.f6264w = null;
        this.f6265x = false;
        this.f6266y = null;
        this.f6257p = i8.f6298t;
    }

    public final Rect e(Rect rect) {
        if (Build.VERSION.SDK_INT < 30) {
            NativeReelsBlockerService nativeReelsBlockerService = this.f6244a;
            int identifier = nativeReelsBlockerService.getResources().getIdentifier("status_bar_height", "dimen", "android");
            Rect rect2 = new Rect(rect);
            rect2.top = Math.max(rect2.top, identifier != 0 ? nativeReelsBlockerService.getResources().getDimensionPixelSize(identifier) : f(24));
            return rect2;
        }
        WindowMetrics maximumWindowMetrics = this.f6247e.getMaximumWindowMetrics();
        maximumWindowMetrics.getClass();
        Insets insetsIgnoringVisibility = maximumWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        insetsIgnoringVisibility.getClass();
        Rect rect3 = new Rect(rect);
        rect3.top = Math.max(rect3.top, insetsIgnoringVisibility.top + maximumWindowMetrics.getBounds().top);
        rect3.bottom = Math.min(rect3.bottom, maximumWindowMetrics.getBounds().bottom - insetsIgnoringVisibility.bottom);
        return rect3;
    }

    public final int f(int i2) {
        return (int) (i2 * this.f6244a.getResources().getDisplayMetrics().density);
    }

    public final void h() {
        LinearLayout linearLayout = this.f6250h;
        if (linearLayout != null) {
            try {
                this.f6247e.removeViewImmediate(linearLayout);
            } catch (Throwable unused) {
            }
        }
        this.f6250h = null;
        this.f6253k = null;
        this.l = null;
        this.f6254m = null;
        View view = this.f6252j;
        if (view != null) {
            try {
                ((WindowManager) this.f6249g.getValue()).removeViewImmediate(view);
            } catch (Throwable unused2) {
            }
        }
        this.f6252j = null;
    }

    public final void i() {
        View view = this.f6251i;
        if (view != null) {
            try {
                this.f6247e.removeViewImmediate(view);
            } catch (Throwable unused) {
            }
        }
        this.f6251i = null;
    }

    public final boolean j(e8 e8Var, f8 f8Var, int i2) {
        CharSequence packageName;
        int i10 = Build.VERSION.SDK_INT;
        NativeReelsBlockerService nativeReelsBlockerService = this.f6244a;
        AccessibilityNodeInfo rootInActiveWindow = i10 >= 33 ? nativeReelsBlockerService.getRootInActiveWindow(0) : nativeReelsBlockerService.getRootInActiveWindow();
        try {
            boolean zP = te.k.P(B, (rootInActiveWindow == null || (packageName = rootInActiveWindow.getPackageName()) == null) ? null : packageName.toString());
            boolean z10 = false;
            if (zP && rootInActiveWindow != null && rootInActiveWindow.getWindowId() == e8Var.f6095a && a()) {
                Iterator it = f8Var.f6152c.iterator();
                while (it.hasNext()) {
                    AccessibilityNodeInfo child = rootInActiveWindow.getChild(((Number) it.next()).intValue());
                    rootInActiveWindow.recycle();
                    if (child != null) {
                        rootInActiveWindow = child;
                    }
                }
                Rect rect = new Rect();
                rootInActiveWindow.getBoundsInScreen(rect);
                if (rootInActiveWindow.isVisibleToUser() && rect.equals(f8Var.f6151a) && rootInActiveWindow.performAction(i2)) {
                    z10 = true;
                }
                rootInActiveWindow.recycle();
                return z10;
            }
            if (rootInActiveWindow != null) {
                rootInActiveWindow.recycle();
            }
            return false;
        } catch (Throwable th) {
            if (rootInActiveWindow != null) {
                rootInActiveWindow.recycle();
            }
            throw th;
        }
    }

    public final void m() {
        if (this.f6256o) {
            return;
        }
        Handler handler = this.b;
        a5.g gVar = this.A;
        handler.removeCallbacks(gVar);
        handler.post(gVar);
    }

    public final void n() {
        this.f6259r = 0L;
        this.f6260s = 0;
        this.f6258q = 0L;
        this.f6261t = false;
        this.f6262u = false;
    }

    public final void o(e8 e8Var, i8 i8Var) {
        Integer numValueOf;
        int i2;
        Rect rectE = e(e8Var.b);
        Iterator it = e8Var.f6097d.values().iterator();
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((f8) it.next()).f6151a.top);
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((f8) it.next()).f6151a.top);
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : rectE.bottom;
        int i10 = rectE.bottom;
        if (iIntValue > i10) {
            iIntValue = i10;
        }
        Rect rect = new Rect(rectE.left, rectE.top, rectE.right, iIntValue);
        if (rect.height() < f(150)) {
            h();
            return;
        }
        boolean z10 = (Resources.getSystem().getConfiguration().uiMode & 48) == 32;
        int i11 = z10 ? -1 : -15067116;
        Rect rect2 = e8Var.b;
        int i12 = rectE.top;
        int i13 = rect2.top;
        NativeReelsBlockerService nativeReelsBlockerService = this.f6244a;
        if (i13 < i12 && Settings.canDrawOverlays(nativeReelsBlockerService)) {
            this.f6252j = c(this.f6252j, new Rect(rect2.left, rect2.top, rect2.right, i12), "SocialLite X status background", 2038, z10, (WindowManager) this.f6249g.getValue());
        }
        LinearLayout linearLayout = this.f6250h;
        WindowManager windowManager = this.f6247e;
        if (linearLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(nativeReelsBlockerService);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(17);
            linearLayout2.setClickable(true);
            linearLayout2.setPadding(f(28), f(24), f(28), f(24));
            TextView textView = new TextView(nativeReelsBlockerService);
            textView.setTextSize(21.0f);
            textView.setGravity(17);
            textView.setTypeface(null, 1);
            linearLayout2.addView(textView, new LinearLayout.LayoutParams(-1, -2));
            this.f6253k = textView;
            TextView textView2 = new TextView(nativeReelsBlockerService);
            textView2.setTextSize(16.0f);
            textView2.setGravity(17);
            textView2.setMinHeight(f(48));
            textView2.setClickable(true);
            textView2.setFocusable(true);
            textView2.setPadding(f(22), f(15), f(22), f(15));
            textView2.setOnClickListener(new q5(this, 1, i8Var));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = f(24);
            linearLayout2.addView(textView2, layoutParams);
            this.l = textView2;
            TextView textView3 = new TextView(nativeReelsBlockerService);
            textView3.setTextSize(14.0f);
            textView3.setGravity(17);
            textView3.setText(R.string.native_x_action_failed);
            i2 = -1;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = f(12);
            linearLayout2.addView(textView3, layoutParams2);
            this.f6254m = textView3;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(rect.width(), rect.height(), rect.left, rect.top, 2032, 264, -1);
            layoutParams3.gravity = 51;
            layoutParams3.setTitle("SocialLite X controls");
            if (Build.VERSION.SDK_INT >= 30) {
                layoutParams3.setFitInsetsTypes(0);
            }
            try {
                windowManager.addView(linearLayout2, layoutParams3);
                this.f6250h = linearLayout2;
            } catch (Exception unused) {
                return;
            }
        } else {
            i2 = -1;
            ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            layoutParams4.getClass();
            WindowManager.LayoutParams layoutParams5 = (WindowManager.LayoutParams) layoutParams4;
            if (layoutParams5.width != rect.width() || layoutParams5.height != rect.height() || layoutParams5.y != rect.top) {
                layoutParams5.x = rect.left;
                layoutParams5.y = rect.top;
                layoutParams5.width = rect.width();
                layoutParams5.height = rect.height();
                try {
                    windowManager.updateViewLayout(this.f6250h, layoutParams5);
                } catch (Throwable unused2) {
                }
            }
        }
        LinearLayout linearLayout3 = this.f6250h;
        if (linearLayout3 != null) {
            linearLayout3.setBackgroundColor(z10 ? -16777216 : i2);
        }
        TextView textView4 = this.f6253k;
        if (textView4 != null) {
            textView4.setTextColor(i11);
        }
        TextView textView5 = this.f6254m;
        if (textView5 != null) {
            textView5.setTextColor(i11);
        }
        TextView textView6 = this.l;
        if (textView6 != null) {
            textView6.setTextColor(z10 ? -15658735 : i2);
        }
        TextView textView7 = this.l;
        if (textView7 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(f(16));
            gradientDrawable.setColor(i11);
            textView7.setBackground(gradientDrawable);
        }
        p();
    }

    public final void p() {
        int i2;
        int i10;
        TextView textView = this.f6253k;
        if (textView != null) {
            int iOrdinal = this.f6257p.ordinal();
            if (iOrdinal != 2) {
                i10 = iOrdinal != 3 ? R.string.ig_explore_curtain_title : R.string.native_x_following_feed;
            } else {
                i10 = R.string.native_x_dms_only;
            }
            textView.setText(i10);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            if (this.f6261t) {
                i2 = R.string.usage_chart_loading;
            } else {
                i8 i8Var = this.f6257p;
                if (i8Var == i8.f6300v) {
                    i2 = R.string.native_x_open_messages;
                } else {
                    i2 = i8Var == i8.f6301w ? R.string.native_x_open_following : R.string.kid_web_search;
                }
            }
            textView2.setText(i2);
        }
        TextView textView3 = this.l;
        if (textView3 != null) {
            textView3.setEnabled(!this.f6261t);
        }
        TextView textView4 = this.f6254m;
        if (textView4 != null) {
            textView4.setVisibility(this.f6262u ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    public final boolean q(e8 e8Var, hf.a aVar) {
        boolean z10;
        int i2 = Build.VERSION.SDK_INT;
        NativeReelsBlockerService nativeReelsBlockerService = this.f6244a;
        AccessibilityNodeInfo rootInActiveWindow = i2 >= 33 ? nativeReelsBlockerService.getRootInActiveWindow(0) : nativeReelsBlockerService.getRootInActiveWindow();
        if (rootInActiveWindow != null) {
            try {
                Set set = B;
                CharSequence packageName = rootInActiveWindow.getPackageName();
                if (te.k.P(set, packageName != null ? packageName.toString() : null) && rootInActiveWindow.getWindowId() == e8Var.f6095a && a() && ((Boolean) aVar.invoke()).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                rootInActiveWindow.recycle();
                throw th;
            }
        } else {
            z10 = false;
        }
        if (rootInActiveWindow != null) {
            rootInActiveWindow.recycle();
        }
        return z10;
    }
}
