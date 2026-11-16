package rb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.y6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import ge.pa;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends u0 {
    public final Object A;
    public PriorityQueue B;
    public boolean C;
    public u1 D;
    public final AtomicLong E;
    public long F;
    public final y0 G;
    public boolean H;
    public h2 I;
    public e2 J;
    public h2 K;
    public final qa.i L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pa f18587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u7.l f18588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f18589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicReference f18591z;

    public a2(f1 f1Var) {
        super(f1Var);
        this.f18589x = new CopyOnWriteArraySet();
        this.A = new Object();
        this.H = true;
        this.L = new qa.i(this, 28);
        this.f18591z = new AtomicReference();
        this.D = u1.f18943c;
        this.F = -1L;
        this.E = new AtomicLong(0L);
        y0 y0Var = new y0();
        y0Var.f19074a = f1Var;
        this.G = y0Var;
    }

    public static void E(a2 a2Var, u1 u1Var, long j10, boolean z10, boolean z11) {
        int i2 = u1Var.b;
        a2Var.m();
        f1 f1Var = (f1) a2Var.f10116t;
        a2Var.q();
        u1 u1VarU = a2Var.k().u();
        if (j10 <= a2Var.F && u1.h(u1VarU.b, i2)) {
            a2Var.f().E.d("Dropped out-of-date consent setting, proposed settings", u1Var);
            return;
        }
        v0 v0VarK = a2Var.k();
        v0VarK.m();
        if (!u1.h(i2, v0VarK.t().getInt("consent_source", 100))) {
            a2Var.f().E.d("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        SharedPreferences.Editor editorEdit = v0VarK.t().edit();
        editorEdit.putString("consent_settings", u1Var.m());
        editorEdit.putInt("consent_source", i2);
        editorEdit.apply();
        a2Var.f().G.d("Setting storage consent(FE)", u1Var);
        a2Var.F = j10;
        t2 t2VarQ = f1Var.q();
        t2VarQ.m();
        t2VarQ.q();
        if (t2VarQ.C() && t2VarQ.l().q0() < 241200) {
            f1Var.q().x(z10);
        } else {
            t2 t2VarQ2 = f1Var.q();
            t2VarQ2.m();
            t2VarQ2.q();
            y6.a();
            f1 f1Var2 = (f1) t2VarQ2.f10116t;
            if (!f1Var2.f18708z.x(null, v.V0) && z10) {
                f1Var2.o().v();
            }
            s2 s2Var = new s2(0);
            s2Var.f18912u = t2VarQ2;
            t2VarQ2.t(s2Var);
        }
        if (z11) {
            f1Var.q().u(new AtomicReference());
        }
    }

    public static void F(a2 a2Var, u1 u1Var, u1 u1Var2) {
        y6.a();
        f1 f1Var = (f1) a2Var.f10116t;
        if (f1Var.f18708z.x(null, v.V0)) {
            return;
        }
        t1 t1Var = t1.ANALYTICS_STORAGE;
        t1 t1Var2 = t1.AD_STORAGE;
        t1[] t1VarArr = {t1Var, t1Var2};
        boolean z10 = false;
        for (int i2 = 0; i2 < 2; i2++) {
            t1 t1Var3 = t1VarArr[i2];
            if (!u1Var2.i(t1Var3) && u1Var.i(t1Var3)) {
                z10 = true;
                break;
            }
        }
        boolean zK = u1Var.k(u1Var2, t1Var, t1Var2);
        if (z10 || zK) {
            f1Var.n().v();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public final void A(String str, String str2, Object obj, boolean z10, long j10) {
        int iF0;
        int length;
        f1 f1Var = (f1) this.f10116t;
        String str3 = str == null ? "app" : str;
        if (z10) {
            iF0 = l().f0(str2);
        } else {
            a4 a4VarL = l();
            if (!a4VarL.m0("user property", str2)) {
                iF0 = 6;
            } else if (!a4VarL.b0("user property", x1.f19056e, null, str2)) {
                iF0 = 15;
            } else if (a4VarL.W("user property", 24, str2)) {
                iF0 = 0;
            } else {
                iF0 = 6;
            }
        }
        qa.i iVar = this.L;
        if (iF0 != 0) {
            l();
            String strA = a4.A(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            f1Var.r();
            a4.Q(iVar, null, iF0, "_ev", strA, length);
            return;
        }
        if (obj == null) {
            g().v(new m1(this, str3, str2, null, j10, 1));
            return;
        }
        int iR = l().r(str2, obj);
        if (iR == 0) {
            Object objL0 = l().l0(str2, obj);
            if (objL0 != null) {
                g().v(new m1(this, str3, str2, objL0, j10, 1));
                return;
            }
            return;
        }
        l();
        String strA2 = a4.A(str2, true, 24);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        f1Var.r();
        a4.Q(iVar, null, iR, "_ev", strA2, length);
    }

    public final void B(m mVar, boolean z10) {
        ad.l lVar = new ad.l((Object) this, (Object) mVar, false, 17);
        if (!z10) {
            g().v(lVar);
        } else {
            m();
            lVar.run();
        }
    }

    public final void C(u1 u1Var) {
        m();
        boolean z10 = (u1Var.i(t1.ANALYTICS_STORAGE) && u1Var.i(t1.AD_STORAGE)) || ((f1) this.f10116t).q().B();
        f1 f1Var = (f1) this.f10116t;
        c1 c1Var = f1Var.C;
        f1.d(c1Var);
        c1Var.m();
        if (z10 != f1Var.W) {
            f1 f1Var2 = (f1) this.f10116t;
            c1 c1Var2 = f1Var2.C;
            f1.d(c1Var2);
            c1Var2.m();
            f1Var2.W = z10;
            v0 v0VarK = k();
            v0VarK.m();
            Boolean boolValueOf = v0VarK.t().contains("measurement_enabled_from_api") ? Boolean.valueOf(v0VarK.t().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                w(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void D(u1 u1Var, long j10, boolean z10) {
        u1 u1Var2;
        boolean z11;
        u1 u1VarJ;
        boolean zK;
        boolean z12;
        q();
        int i2 = u1Var.b;
        if (i2 != -10) {
            w1 w1Var = (w1) u1Var.f18944a.get(t1.AD_STORAGE);
            if (w1Var == null) {
                w1Var = w1.UNINITIALIZED;
            }
            w1 w1Var2 = w1.UNINITIALIZED;
            if (w1Var == w1Var2) {
                w1 w1Var3 = (w1) u1Var.f18944a.get(t1.ANALYTICS_STORAGE);
                if (w1Var3 == null) {
                    w1Var3 = w1Var2;
                }
                if (w1Var3 == w1Var2) {
                    f().D.c("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.A) {
            try {
                u1Var2 = this.D;
                z11 = false;
                if (u1.h(i2, u1Var2.b)) {
                    zK = u1Var.k(this.D, (t1[]) u1Var.f18944a.keySet().toArray(new t1[0]));
                    t1 t1Var = t1.ANALYTICS_STORAGE;
                    if (u1Var.i(t1Var) && !this.D.i(t1Var)) {
                        z11 = true;
                    }
                    u1VarJ = u1Var.j(this.D);
                    this.D = u1VarJ;
                    z12 = z11;
                    z11 = true;
                } else {
                    u1VarJ = u1Var;
                    zK = false;
                    z12 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            f().E.d("Ignoring lower-priority consent settings, proposed settings", u1VarJ);
            return;
        }
        long andIncrement = this.E.getAndIncrement();
        if (zK) {
            P(null);
            k2 k2Var = new k2(this, u1VarJ, j10, andIncrement, z12, u1Var2);
            if (!z10) {
                g().w(k2Var);
                return;
            } else {
                m();
                k2Var.run();
                return;
            }
        }
        l2 l2Var = new l2(this, u1VarJ, andIncrement, z12, u1Var2);
        if (z10) {
            m();
            l2Var.run();
        } else if (i2 == 30 || i2 == -10) {
            g().w(l2Var);
        } else {
            g().v(l2Var);
        }
    }

    public final void G(boolean z10, long j10) {
        f1 f1Var = (f1) this.f10116t;
        m();
        q();
        f().F.c("Resetting analytics data (FE)");
        e3 e3VarP = p();
        e3VarP.m();
        b6.e eVar = e3VarP.f18668y;
        ((i3) eVar.f1653v).a();
        f1 f1Var2 = (f1) ((e3) eVar.f1654w).f10116t;
        if (f1Var2.f18708z.x(null, v.Z0)) {
            f1Var2.G.getClass();
            eVar.f1651t = SystemClock.elapsedRealtime();
        } else {
            eVar.f1651t = 0L;
        }
        eVar.f1652u = eVar.f1651t;
        f1Var.n().v();
        boolean zI = f1Var.i();
        v0 v0VarK = k();
        v0VarK.f19009z.h(j10);
        if (!TextUtils.isEmpty(v0VarK.k().P.j())) {
            v0VarK.P.k(null);
        }
        v0VarK.J.h(0L);
        v0VarK.K.h(0L);
        Boolean boolV = ((f1) v0VarK.f10116t).f18708z.v("firebase_analytics_collection_deactivated");
        if (boolV == null || !boolV.booleanValue()) {
            v0VarK.r(!zI);
        }
        v0VarK.Q.k(null);
        v0VarK.R.h(0L);
        v0VarK.S.Y(null);
        if (z10) {
            t2 t2VarQ = f1Var.q();
            t2VarQ.m();
            t2VarQ.q();
            t3 t3VarF = t2VarQ.F(false);
            ((f1) t2VarQ.f10116t).o().v();
            t2VarQ.t(new x2(t2VarQ, t3VarF, 0));
        }
        p().f18667x.p();
        this.H = !zI;
    }

    public final PriorityQueue H() {
        if (this.B == null) {
            this.B = new PriorityQueue(Comparator.comparing(new z1(), new a7.f(6)));
        }
        return this.B;
    }

    public final void I() {
        m();
        q();
        f1 f1Var = (f1) this.f10116t;
        if (f1Var.j()) {
            Boolean boolV = f1Var.f18708z.v("google_analytics_deferred_deep_link_enabled");
            if (boolV != null && boolV.booleanValue()) {
                f().F.c("Deferred Deep Link feature enabled.");
                c1 c1VarG = g();
                i1 i1Var = new i1(1);
                i1Var.f18748u = this;
                c1VarG.v(i1Var);
            }
            t2 t2VarQ = f1Var.q();
            t2VarQ.m();
            t2VarQ.q();
            t3 t3VarF = t2VarQ.F(true);
            ((f1) t2VarQ.f10116t).o().u(new byte[0], 3);
            t2VarQ.t(new x2(t2VarQ, t3VarF, 1));
            this.H = false;
            v0 v0VarK = k();
            v0VarK.m();
            String string = v0VarK.t().getString("previous_os_version", null);
            ((f1) v0VarK.f10116t).m().n();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = v0VarK.t().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f1Var.m().n();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            Q("auto", "_ou", bundle);
        }
    }

    public final void J() {
        f1 f1Var = (f1) this.f10116t;
        if (!(f1Var.f18702t.getApplicationContext() instanceof Application) || this.f18587v == null) {
            return;
        }
        ((Application) f1Var.f18702t.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f18587v);
    }

    public final void K() {
        h8.a();
        if (((f1) this.f10116t).f18708z.x(null, v.H0)) {
            if (g().x()) {
                f().f18845y.c("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (r6.d.a()) {
                f().f18845y.c("Cannot get trigger URIs from main thread");
                return;
            }
            q();
            f().G.c("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            c1 c1VarG = g();
            b2 b2Var = new b2();
            b2Var.f18609v = this;
            b2Var.f18608u = atomicReference;
            c1VarG.q(atomicReference, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, "get trigger URIs", b2Var);
            List list = (List) atomicReference.get();
            if (list == null) {
                f().f18845y.c("Timed out waiting for get trigger URIs");
                return;
            }
            c1 c1VarG2 = g();
            ad.l lVar = new ad.l(13);
            lVar.f630u = this;
            lVar.f631v = list;
            c1VarG2.v(lVar);
        }
    }

    public final void L() {
        String string;
        int i2;
        int i10;
        int i11;
        String string2;
        int i12;
        int i13;
        Bundle bundle;
        int i14;
        Bundle bundle2;
        m();
        f().F.c("Handle tcf update.");
        SharedPreferences sharedPreferencesS = k().s();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesS.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i2 = sharedPreferencesS.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        if (i2 != -1) {
            map.put("gdprApplies", String.valueOf(i2));
        }
        try {
            i10 = sharedPreferencesS.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i10 = -1;
        }
        if (i10 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i10));
        }
        try {
            i11 = sharedPreferencesS.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i11 = -1;
        }
        if (i11 != -1) {
            map.put("PolicyVersion", String.valueOf(i11));
        }
        try {
            string2 = sharedPreferencesS.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i12 = sharedPreferencesS.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i12 = -1;
        }
        if (i12 != -1) {
            map.put("CmpSdkID", String.valueOf(i12));
        }
        j3 j3Var = new j3(map);
        f().G.d("Tcf preferences read", j3Var);
        v0 v0VarK = k();
        v0VarK.m();
        String string3 = v0VarK.t().getString("stored_tcf_param", "");
        String strA = j3Var.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = v0VarK.t().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = j3Var.f18775a;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = j3Var.b();
            if (iB < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    bundle = new Bundle();
                    String str2 = "denied";
                    if (str.length() > 0) {
                        bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str.length() > 3) {
                        bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str.length() <= 6 || iB < 4) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                            str2 = "granted";
                        }
                        bundle.putString("ad_user_data", str2);
                    }
                }
            }
            bundle = bundle2;
            i13 = 0;
        } else {
            i13 = 0;
            bundle = Bundle.EMPTY;
        }
        f().G.d("Consent generated from Tcf", bundle);
        if (bundle != Bundle.EMPTY) {
            ((f1) this.f10116t).G.getClass();
            v(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle3 = new Bundle();
        StringBuilder sb2 = new StringBuilder("1");
        try {
            String str3 = (String) map2.get("CmpSdkID");
            i14 = !TextUtils.isEmpty(str3) ? Integer.parseInt(str3) : -1;
        } catch (NumberFormatException unused7) {
        }
        if (i14 < 0 || i14 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i14 >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i14 & 63));
        }
        int iB2 = j3Var.b();
        if (iB2 < 0 || iB2 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        int i15 = "1".equals(map2.get("gdprApplies")) ? 2 : i13;
        int i16 = i15 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i16 = i15 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16));
        bundle3.putString("_tcfd", sb2.toString());
        Q("auto", "_tcf", bundle3);
    }

    public final void M() {
        m();
        this.C = false;
        if (H().isEmpty() || ((k3) H().poll()) == null) {
            return;
        }
        l().x0();
    }

    public final void N() {
        a2 a2Var;
        f1 f1Var = (f1) this.f10116t;
        m();
        String strJ = k().G.j();
        if (strJ == null) {
            a2Var = this;
        } else if ("unset".equals(strJ)) {
            f1Var.G.getClass();
            a2Var = this;
            a2Var.u(System.currentTimeMillis(), null, "app", "_npa");
        } else {
            Long lValueOf = Long.valueOf("true".equals(strJ) ? 1L : 0L);
            f1Var.G.getClass();
            u(System.currentTimeMillis(), lValueOf, "app", "_npa");
            a2Var = this;
        }
        if (f1Var.i() && a2Var.H) {
            f().F.c("Recording app launch after enabling measurement for the first time (FE)");
            I();
            p().f18667x.p();
            g().v(new i1(this));
            return;
        }
        f().F.c("Updating Scion state (FE)");
        t2 t2VarQ = f1Var.q();
        t2VarQ.m();
        t2VarQ.q();
        t2VarQ.t(new x2(t2VarQ, t2VarQ.F(true), 3));
    }

    public final void O(Bundle bundle, long j10) {
        f1 f1Var = (f1) this.f10116t;
        va.x.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            f().B.c("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        x1.a(bundle2, "app_id", String.class, null);
        x1.a(bundle2, "origin", String.class, null);
        x1.a(bundle2, DiagnosticsEntry.NAME_KEY, String.class, null);
        x1.a(bundle2, "value", Object.class, null);
        x1.a(bundle2, "trigger_event_name", String.class, null);
        x1.a(bundle2, "trigger_timeout", Long.class, 0L);
        x1.a(bundle2, "timed_out_event_name", String.class, null);
        x1.a(bundle2, "timed_out_event_params", Bundle.class, null);
        x1.a(bundle2, "triggered_event_name", String.class, null);
        x1.a(bundle2, "triggered_event_params", Bundle.class, null);
        x1.a(bundle2, "time_to_live", Long.class, 0L);
        x1.a(bundle2, "expired_event_name", String.class, null);
        x1.a(bundle2, "expired_event_params", Bundle.class, null);
        va.x.e(bundle2.getString(DiagnosticsEntry.NAME_KEY));
        va.x.e(bundle2.getString("origin"));
        va.x.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString(DiagnosticsEntry.NAME_KEY);
        Object obj = bundle2.get("value");
        if (l().f0(string) != 0) {
            f().f18845y.d("Invalid conditional user property name", f1Var.F.g(string));
            return;
        }
        if (l().r(string, obj) != 0) {
            f().f18845y.b(f1Var.F.g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objL0 = l().l0(string, obj);
        if (objL0 == null) {
            f().f18845y.b(f1Var.F.g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        x1.e(bundle2, objL0);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            f().f18845y.b(f1Var.F.g(string), Long.valueOf(j11), "Invalid conditional user property timeout");
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            f().f18845y.b(f1Var.F.g(string), Long.valueOf(j12), "Invalid conditional user property time to live");
        } else {
            g().v(new c2(this, bundle2, 2));
        }
    }

    public final void P(String str) {
        this.f18591z.set(str);
    }

    public final void Q(String str, String str2, Bundle bundle) {
        m();
        ((f1) this.f10116t).G.getClass();
        t(System.currentTimeMillis(), bundle, str, str2);
    }

    @Override // rb.u0
    public final boolean s() {
        return false;
    }

    public final void t(long j10, Bundle bundle, String str, String str2) {
        m();
        x(str, str2, j10, bundle, true, this.f18588w == null || a4.r0(str2), true);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public final void u(long j10, Object obj, String str, String str2) {
        f1 f1Var = (f1) this.f10116t;
        va.x.e(str);
        va.x.e(str2);
        m();
        q();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L;
                    obj = Long.valueOf(j11);
                    k().G.k(j11 == 1 ? "true" : "false");
                } else if (obj == null) {
                    k().G.k("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                k().G.k("unset");
                str2 = "_npa";
            }
            f().G.b("non_personalized_ads(_npa)", obj, "Setting user property(FE)");
        }
        Object obj2 = obj;
        String str4 = str2;
        if (!f1Var.i()) {
            f().G.c("User property not set since app measurement is disabled");
            return;
        }
        if (f1Var.j()) {
            x3 x3Var = new x3(j10, obj2, str4, str);
            t2 t2VarQ = f1Var.q();
            t2VarQ.m();
            t2VarQ.q();
            i0 i0VarO = ((f1) t2VarQ.f10116t).o();
            i0VarO.getClass();
            Parcel parcelObtain = Parcel.obtain();
            boolean zU = false;
            x3Var.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                i0VarO.f().f18846z.c("User property too long for local database. Sending directly to service");
            } else {
                zU = i0VarO.u(bArrMarshall, 1);
            }
            t2VarQ.t(new w2(t2VarQ, t2VarQ.F(true), zU, x3Var, 0));
        }
    }

    public final void v(Bundle bundle, int i2, long j10) {
        String string;
        w1 w1Var;
        Boolean bool;
        q();
        u1 u1Var = u1.f18943c;
        t1[] t1VarArr = v1.STORAGE.f19013t;
        int length = t1VarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                string = null;
                break;
            }
            t1 t1Var = t1VarArr[i10];
            if (bundle.containsKey(t1Var.f18925t) && (string = bundle.getString(t1Var.f18925t)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else {
                    bool = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool == null) {
                    break;
                }
            }
            i10++;
        }
        if (string != null) {
            f().D.d("Ignoring invalid consent setting", string);
            f().D.c("Valid consent values are 'granted', 'denied'");
        }
        boolean zX = g().x();
        u1 u1VarC = u1.c(i2, bundle);
        Iterator it = u1VarC.f18944a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            w1Var = w1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((w1) it.next()) != w1Var) {
                D(u1VarC, j10, zX);
                break;
            }
        }
        m mVarB = m.b(i2, bundle);
        Iterator it2 = mVarB.f18813e.values().iterator();
        while (it2.hasNext()) {
            if (((w1) it2.next()) != w1Var) {
                B(mVarB, zX);
                break;
            }
        }
        Boolean boolA = m.a(bundle);
        if (boolA != null) {
            String str = i2 == -30 ? "tcf" : "app";
            if (((f1) this.f10116t).f18708z.x(null, v.Q0) && zX) {
                u(j10, boolA.toString(), str, "allow_personalized_ads");
            } else {
                A(str, "allow_personalized_ads", boolA.toString(), false, j10);
            }
        }
    }

    public final void w(Boolean bool, boolean z10) {
        m();
        q();
        f().F.d("Setting app measurement enabled (FE)", bool);
        v0 v0VarK = k();
        v0VarK.m();
        SharedPreferences.Editor editorEdit = v0VarK.t().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z10) {
            v0 v0VarK2 = k();
            v0VarK2.m();
            SharedPreferences.Editor editorEdit2 = v0VarK2.t().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        f1 f1Var = (f1) this.f10116t;
        c1 c1Var = f1Var.C;
        f1.d(c1Var);
        c1Var.m();
        if (f1Var.W || !(bool == null || bool.booleanValue())) {
            N();
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v44 ??, new type: com.google.android.gms.internal.measurement.y0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v23 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void x(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a2.x(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    public final void y(String str, String str2, Bundle bundle) {
        ((f1) this.f10116t).G.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        va.x.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(DiagnosticsEntry.NAME_KEY, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g().v(new c2(this, bundle2, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r3 > 500) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4 > 500) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r16, java.lang.String r17, android.os.Bundle r18, boolean r19, boolean r20, long r21) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a2.z(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }
}
