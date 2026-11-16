package pf;

import a5.z;
import a8.b0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.ExtractedText;
import androidx.security.crypto.MasterKey;
import b0.w;
import b0.x;
import b3.j;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.Constants;
import com.sociallite.android.R;
import e4.w0;
import g2.i;
import g2.k;
import h1.q;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import k9.i0;
import ke.c1;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.l;
import o1.b1;
import o1.r0;
import oe.r1;
import org.json.JSONException;
import org.json.JSONObject;
import p2.l0;
import p2.m0;
import p2.n0;
import r0.c6;
import u1.f0;
import u1.t;
import u2.s;
import v0.h1;
import v0.n;
import v2.y;
import vf.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f16903a;
    public static Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u1.e f16904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u1.e f16905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u1.e f16906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static u1.e f16907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static u1.e f16908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static u1.e f16909h;

    public static d0 A() {
        return r1.f16322l0;
    }

    public static d0 B() {
        return r1.n0;
    }

    public static int C(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static xe.d D(xe.d dVar) {
        xe.d<Object> dVarIntercepted;
        dVar.getClass();
        ze.c cVar = dVar instanceof ze.c ? (ze.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT >= 29) {
            return h7.a.a();
        }
        try {
            if (b == null) {
                f16903a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(f16903a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            d8.m.n(cause);
            return false;
        }
    }

    public static j F(hf.e eVar) {
        j jVar = new j();
        jVar.f16902v = k(eVar, jVar, jVar);
        return jVar;
    }

    public static final String G(int i2, boolean z10) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i10 = i2 / 3600;
        int i11 = (i2 % 3600) / 60;
        int i12 = i2 % 60;
        if (i10 <= 0 && !z10) {
            return i11 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + qf.k.L0(2, String.valueOf(i12));
        }
        return i10 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + qf.k.L0(2, String.valueOf(i11)) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + qf.k.L0(2, String.valueOf(i12));
    }

    public static boolean H(Parcel parcel, int i2) {
        S(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder I(Parcel parcel, int i2) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iL);
        return strongBinder;
    }

    public static int J(Parcel parcel, int i2) {
        S(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long K(Parcel parcel, int i2) {
        S(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int L(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void M(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + L(parcel, i2));
    }

    public static final ExtractedText N(y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f21847a.f16547t;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = yVar.b;
        extractedText.selectionStart = m0.e(j10);
        extractedText.selectionEnd = m0.d(j10);
        extractedText.flags = !qf.k.u0(yVar.f21847a.f16547t, '\n') ? 1 : 0;
        return extractedText;
    }

    public static int O(Parcel parcel) {
        int i2 = parcel.readInt();
        int iL = L(parcel, i2);
        char c10 = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new wa.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i10 = iL + iDataPosition;
        if (i10 < iDataPosition || i10 > parcel.dataSize()) {
            throw new wa.b(w0.q("Size read is invalid start=", iDataPosition, i10, " end="), parcel);
        }
        return i10;
    }

    public static String P(String str) {
        Object lVar;
        String queryParameter;
        str.getClass();
        try {
            Uri uri = Uri.parse(str);
            if (kotlin.jvm.internal.l.a(uri.getScheme(), "https") && te.k.P(u7.f.w("m.youtube.com", "youtube.com", "www.youtube.com", "youtu.be"), uri.getHost())) {
                if (kotlin.jvm.internal.l.a(uri.getHost(), "youtu.be")) {
                    List<String> pathSegments = uri.getPathSegments();
                    pathSegments.getClass();
                    queryParameter = (String) te.k.X(pathSegments);
                } else {
                    queryParameter = kotlin.jvm.internal.l.a(uri.getPath(), "/watch") ? uri.getQueryParameter("v") : null;
                }
                if (queryParameter != null) {
                    Pattern patternCompile = Pattern.compile("[A-Za-z0-9_-]{1,128}");
                    patternCompile.getClass();
                    if (patternCompile.matcher(queryParameter).matches()) {
                        if (kotlin.jvm.internal.l.a(uri.getHost(), "youtu.be")) {
                            lVar = "https://m.youtube.com/watch?v=".concat(queryParameter);
                        } else {
                            lVar = uri.buildUpon().authority("m.youtube.com").build().toString();
                            lVar.getClass();
                        }
                        return (String) (lVar instanceof se.l ? null : lVar);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            lVar = new se.l(th);
        }
    }

    public static Object Q(hf.e eVar, Object obj, xe.d dVar) {
        eVar.getClass();
        xe.i context = dVar.getContext();
        Object dVar2 = context == xe.j.f23216t ? new ye.d(dVar) : new ye.e(dVar, context);
        a0.d(2, eVar);
        return eVar.invoke(obj, dVar2);
    }

    public static void R(Parcel parcel, int i2, int i10) {
        if (i2 == i10) {
            return;
        }
        throw new wa.b(z.l(z.m(i10, i2, "Expected size ", " got ", " (0x"), Integer.toHexString(i2), ")"), parcel);
    }

    public static void S(Parcel parcel, int i2, int i10) {
        int iL = L(parcel, i2);
        if (iL == i10) {
            return;
        }
        throw new wa.b(z.l(z.m(i10, iL, "Expected size ", " got ", " (0x"), Integer.toHexString(iL), ")"), parcel);
    }

    public static b3.c a() {
        return new b3.c(1.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0123  */
    /* JADX WARN: Code duplicated, block: B:88:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x015d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0160  */
    public static final void b(final le.f fVar, final boolean z10, final q qVar, boolean z11, boolean z12, v0.n nVar, final int i2, final int i10) {
        int i11;
        boolean z13;
        int i12;
        final boolean z14;
        int i13;
        boolean z15;
        int i14;
        int i15;
        boolean z16;
        String strG;
        String strE;
        final String strG2;
        String strC0;
        long j10;
        final boolean z17;
        final boolean z18;
        s sVar;
        boolean zF;
        Object objO;
        v0.q qVar2;
        final boolean z19;
        h1 h1VarV;
        v0.q qVar3 = (v0.q) nVar;
        qVar3.b0(743675567);
        if ((i2 & 6) == 0) {
            i11 = ((i2 & 8) == 0 ? qVar3.f(fVar) : qVar3.h(fVar) ? 4 : 2) | i2;
        } else {
            i11 = i2;
        }
        if ((i2 & 48) == 0) {
            i11 |= qVar3.g(z10) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i11 |= qVar3.f(qVar) ? MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE : 128;
        }
        int i16 = i10 & 8;
        if (i16 == 0) {
            if ((i2 & 3072) == 0) {
                z13 = z11;
                i11 |= qVar3.g(z13) ? 2048 : 1024;
            }
            i12 = i10 & 16;
            if (i12 != 0) {
                if ((i2 & 24576) == 0) {
                    z14 = z12;
                    if (qVar3.g(z14)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i11 |= i13;
                }
                if ((i11 & 9363) == 9362 || !qVar3.E()) {
                    if (i16 != 0) {
                        z13 = false;
                    }
                    if (i12 != 0) {
                        z14 = false;
                    }
                    z15 = fVar instanceof le.d;
                    if (z15) {
                        i14 = ((le.d) fVar).f10149a * 60;
                    } else if (fVar instanceof le.c) {
                        i14 = ((le.c) fVar).f10148a;
                    } else {
                        if (!fVar.equals(le.e.f10150a)) {
                            m0.n.h();
                            return;
                        }
                        i14 = 0;
                    }
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    i15 = i14 / 86400;
                    z16 = fVar instanceof le.e;
                    if (z16) {
                        qVar3.Z(1398024428);
                        qVar3.q(false);
                        strG = "∞";
                    } else {
                        if (!z15 && i15 > 0) {
                            qVar3.Z(1707667346);
                            strE = xe.f.u(((le.d) fVar).f10149a, qVar3);
                            qVar3.q(false);
                        } else if (i15 > 0) {
                            qVar3.Z(1707669166);
                            strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                            qVar3.q(false);
                        } else {
                            qVar3.Z(1707671681);
                            qVar3.q(false);
                            strG = G(i14, false);
                        }
                        strG = strE;
                    }
                    if ((fVar instanceof le.c) || i15 <= 0) {
                        strG2 = null;
                    } else {
                        strG2 = G(i14 % 86400, true);
                    }
                    if (z16) {
                        strC0 = "No end time";
                    } else {
                        strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
                    }
                    if (z10) {
                        j10 = 4294112503L;
                    } else {
                        j10 = 4278916132L;
                    }
                    final long jD = r0.d(j10);
                    z17 = z13;
                    z18 = z14;
                    final l0 l0VarC = u8.g.C(qVar3);
                    if (z18) {
                        sVar = s.f20818x;
                    } else if (z17) {
                        sVar = s.B;
                    } else {
                        sVar = s.A;
                    }
                    final s sVar2 = sVar;
                    final n0 n0VarA = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar2, null, 0L, null, 0L, null, null, 16777211);
                    zF = qVar3.f(strC0);
                    final String str = strG;
                    objO = qVar3.O();
                    if (zF || objO == v0.m.f21654a) {
                        objO = new b0(strC0, 7);
                        qVar3.i0(objO);
                    }
                    q qVarA = n2.m.a(qVar, (hf.c) objO);
                    h1.i iVar = h1.b.f7342x;
                    d1.a aVarB = d1.f.b(1963229061, new hf.f() { // from class: le.g
                        /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                        /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                        /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                        /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                        /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                        /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                        /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                        /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                        /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                        /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                        /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                        /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                        /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                        /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                        @Override // hf.f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            boolean z20;
                            String str2;
                            float f10;
                            float f11;
                            n0 n0Var;
                            l0 l0Var;
                            j jVar;
                            int i17;
                            int iMax;
                            int i18;
                            int i19;
                            float fMin;
                            v0.q qVar4;
                            int i20;
                            i iVar2;
                            g2.h hVar;
                            long j11;
                            s sVar3;
                            androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                            n nVar2 = (n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            cVar.getClass();
                            long j12 = cVar.b;
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                            }
                            if ((iIntValue & 19) == 18) {
                                v0.q qVar5 = (v0.q) nVar2;
                                if (qVar5.E()) {
                                    qVar5.T();
                                } else {
                                    z20 = fVar instanceof e;
                                    str2 = strG2;
                                    if (z20) {
                                        f10 = 82.0f;
                                    } else if (str2 != null) {
                                        f10 = 48.0f;
                                    } else if (z18) {
                                        f10 = 88.0f;
                                    } else {
                                        f10 = 64.0f;
                                    }
                                    if (z17) {
                                        f11 = 1.25f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    float f12 = f10 * f11;
                                    long jC0 = bb.a.c0(f12, 4294967296L);
                                    n0Var = n0VarA;
                                    n0 n0VarA2 = n0.a(n0Var, 0L, jC0, null, null, 0L, null, 0L, null, null, 16777213);
                                    l0Var = l0VarC;
                                    String str3 = str;
                                    long j13 = l0.a(l0Var, str3, n0VarA2, 996).f16576c;
                                    if (str2 != null) {
                                        jVar = new j(l0.a(l0Var, str2, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                                    } else {
                                        jVar = null;
                                    }
                                    int i21 = (int) (j13 >> 32);
                                    if (jVar != null) {
                                        i17 = (int) (jVar.f1611a >> 32);
                                    } else {
                                        i17 = 0;
                                    }
                                    iMax = Math.max(i21, i17);
                                    if (iMax < 1) {
                                        iMax = 1;
                                    }
                                    int i22 = (int) (j13 & 4294967295L);
                                    if (jVar != null) {
                                        i18 = (int) (4294967295L & jVar.f1611a);
                                    } else {
                                        i18 = 0;
                                    }
                                    i19 = i22 + i18;
                                    if (i19 < 1) {
                                        i19 = 1;
                                    }
                                    fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                                    b0.y yVarA = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                                    qVar4 = (v0.q) nVar2;
                                    i20 = qVar4.P;
                                    d1.d dVarM = qVar4.m();
                                    q qVarC = h1.a.c(h1.n.f7355t, nVar2);
                                    k.f5534k.getClass();
                                    iVar2 = g2.j.b;
                                    qVar4.d0();
                                    if (qVar4.O) {
                                        qVar4.l(iVar2);
                                    } else {
                                        qVar4.l0();
                                    }
                                    v0.d.a0(g2.j.f5523f, yVarA, nVar2);
                                    v0.d.a0(g2.j.f5522e, dVarM, nVar2);
                                    hVar = g2.j.f5524g;
                                    if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                        t8.c.r(i20, qVar4, i20, hVar);
                                    }
                                    v0.d.a0(g2.j.f5521d, qVarC, nVar2);
                                    long jC1 = bb.a.c0(f12 * fMin, 4294967296L);
                                    j11 = jD;
                                    sVar3 = sVar2;
                                    c6.b(str3, null, j11, jC1, sVar3, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                    if (str2 != null) {
                                        qVar4.Z(87392716);
                                        c6.b(str2, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar3, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                    } else {
                                        qVar4.Z(82625319);
                                    }
                                    qVar4.q(false);
                                    qVar4.q(true);
                                }
                            } else {
                                z20 = fVar instanceof e;
                                str2 = strG2;
                                if (z20) {
                                    f10 = 82.0f;
                                } else if (str2 != null) {
                                    f10 = 48.0f;
                                } else if (z18) {
                                    f10 = 88.0f;
                                } else {
                                    f10 = 64.0f;
                                }
                                if (z17) {
                                    f11 = 1.25f;
                                } else {
                                    f11 = 1.0f;
                                }
                                float f13 = f10 * f11;
                                long jC2 = bb.a.c0(f13, 4294967296L);
                                n0Var = n0VarA;
                                n0 n0VarA3 = n0.a(n0Var, 0L, jC2, null, null, 0L, null, 0L, null, null, 16777213);
                                l0Var = l0VarC;
                                String str4 = str;
                                long j14 = l0.a(l0Var, str4, n0VarA3, 996).f16576c;
                                if (str2 != null) {
                                    jVar = new j(l0.a(l0Var, str2, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                                } else {
                                    jVar = null;
                                }
                                int i23 = (int) (j14 >> 32);
                                if (jVar != null) {
                                    i17 = (int) (jVar.f1611a >> 32);
                                } else {
                                    i17 = 0;
                                }
                                iMax = Math.max(i23, i17);
                                if (iMax < 1) {
                                    iMax = 1;
                                }
                                int i24 = (int) (j14 & 4294967295L);
                                if (jVar != null) {
                                    i18 = (int) (4294967295L & jVar.f1611a);
                                } else {
                                    i18 = 0;
                                }
                                i19 = i24 + i18;
                                if (i19 < 1) {
                                    i19 = 1;
                                }
                                fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                                b0.y yVarA2 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                                qVar4 = (v0.q) nVar2;
                                i20 = qVar4.P;
                                d1.d dVarM2 = qVar4.m();
                                q qVarC2 = h1.a.c(h1.n.f7355t, nVar2);
                                k.f5534k.getClass();
                                iVar2 = g2.j.b;
                                qVar4.d0();
                                if (qVar4.O) {
                                    qVar4.l(iVar2);
                                } else {
                                    qVar4.l0();
                                }
                                v0.d.a0(g2.j.f5523f, yVarA2, nVar2);
                                v0.d.a0(g2.j.f5522e, dVarM2, nVar2);
                                hVar = g2.j.f5524g;
                                if (qVar4.O) {
                                    t8.c.r(i20, qVar4, i20, hVar);
                                } else {
                                    t8.c.r(i20, qVar4, i20, hVar);
                                }
                                v0.d.a0(g2.j.f5521d, qVarC2, nVar2);
                                long jC3 = bb.a.c0(f13 * fMin, 4294967296L);
                                j11 = jD;
                                sVar3 = sVar2;
                                c6.b(str4, null, j11, jC3, sVar3, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                if (str2 != null) {
                                    qVar4.Z(87392716);
                                    c6.b(str2, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar3, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                } else {
                                    qVar4.Z(82625319);
                                }
                                qVar4.q(false);
                                qVar4.q(true);
                            }
                            return se.a0.f19710a;
                        }
                    }, qVar3);
                    qVar2 = qVar3;
                    b0.c.a(qVarA, iVar, aVarB, qVar2, 3120, 4);
                    z19 = z17;
                    z14 = z18;
                } else {
                    qVar3.T();
                    z19 = z13;
                    qVar2 = qVar3;
                }
                h1VarV = qVar2.v();
                if (h1VarV != null) {
                    h1VarV.f21594d = new hf.e() { // from class: le.h
                        @Override // hf.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            pf.l.b(fVar, z10, qVar, z19, z14, (n) obj, v0.d.e0(i2 | 1), i10);
                            return se.a0.f19710a;
                        }
                    };
                }
            }
            i11 |= 24576;
            z14 = z12;
            if ((i11 & 9363) == 9362) {
                if (i16 != 0) {
                    z13 = false;
                }
                if (i12 != 0) {
                    z14 = false;
                }
                z15 = fVar instanceof le.d;
                if (z15) {
                    i14 = ((le.d) fVar).f10149a * 60;
                } else if (fVar instanceof le.c) {
                    i14 = ((le.c) fVar).f10148a;
                } else {
                    if (!fVar.equals(le.e.f10150a)) {
                        m0.n.h();
                        return;
                    }
                    i14 = 0;
                }
                if (i14 < 0) {
                    i14 = 0;
                }
                i15 = i14 / 86400;
                z16 = fVar instanceof le.e;
                if (z16) {
                    qVar3.Z(1398024428);
                    qVar3.q(false);
                    strG = "∞";
                } else if (!z15) {
                    if (i15 > 0) {
                        qVar3.Z(1707669166);
                        strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                        qVar3.q(false);
                        strG = strE;
                    } else {
                        qVar3.Z(1707671681);
                        qVar3.q(false);
                        strG = G(i14, false);
                    }
                } else if (i15 > 0) {
                    qVar3.Z(1707669166);
                    strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                    qVar3.q(false);
                    strG = strE;
                } else {
                    qVar3.Z(1707671681);
                    qVar3.q(false);
                    strG = G(i14, false);
                }
                if (fVar instanceof le.c) {
                    strG2 = null;
                } else {
                    strG2 = null;
                }
                if (z16) {
                    strC0 = "No end time";
                } else {
                    strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
                }
                if (z10) {
                    j10 = 4294112503L;
                } else {
                    j10 = 4278916132L;
                }
                final long jD2 = r0.d(j10);
                z17 = z13;
                z18 = z14;
                final l0 l0VarC2 = u8.g.C(qVar3);
                if (z18) {
                    sVar = s.f20818x;
                } else if (z17) {
                    sVar = s.B;
                } else {
                    sVar = s.A;
                }
                final s sVar3 = sVar;
                final n0 n0VarA2 = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar3, null, 0L, null, 0L, null, null, 16777211);
                zF = qVar3.f(strC0);
                final String str2 = strG;
                objO = qVar3.O();
                if (zF) {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                } else {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                }
                q qVarA2 = n2.m.a(qVar, (hf.c) objO);
                h1.i iVar2 = h1.b.f7342x;
                d1.a aVarB2 = d1.f.b(1963229061, new hf.f() { // from class: le.g
                    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                    @Override // hf.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z20;
                        String str3;
                        float f10;
                        float f11;
                        n0 n0Var;
                        l0 l0Var;
                        j jVar;
                        int i17;
                        int iMax;
                        int i18;
                        int i19;
                        float fMin;
                        v0.q qVar4;
                        int i20;
                        i iVar3;
                        g2.h hVar;
                        long j11;
                        s sVar4;
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        n nVar2 = (n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        long j12 = cVar.b;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18) {
                            v0.q qVar5 = (v0.q) nVar2;
                            if (qVar5.E()) {
                                qVar5.T();
                            } else {
                                z20 = fVar instanceof e;
                                str3 = strG2;
                                if (z20) {
                                    f10 = 82.0f;
                                } else if (str3 != null) {
                                    f10 = 48.0f;
                                } else if (z18) {
                                    f10 = 88.0f;
                                } else {
                                    f10 = 64.0f;
                                }
                                if (z17) {
                                    f11 = 1.25f;
                                } else {
                                    f11 = 1.0f;
                                }
                                float f13 = f10 * f11;
                                long jC2 = bb.a.c0(f13, 4294967296L);
                                n0Var = n0VarA2;
                                n0 n0VarA3 = n0.a(n0Var, 0L, jC2, null, null, 0L, null, 0L, null, null, 16777213);
                                l0Var = l0VarC2;
                                String str4 = str2;
                                long j14 = l0.a(l0Var, str4, n0VarA3, 996).f16576c;
                                if (str3 != null) {
                                    jVar = new j(l0.a(l0Var, str3, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                                } else {
                                    jVar = null;
                                }
                                int i23 = (int) (j14 >> 32);
                                if (jVar != null) {
                                    i17 = (int) (jVar.f1611a >> 32);
                                } else {
                                    i17 = 0;
                                }
                                iMax = Math.max(i23, i17);
                                if (iMax < 1) {
                                    iMax = 1;
                                }
                                int i24 = (int) (j14 & 4294967295L);
                                if (jVar != null) {
                                    i18 = (int) (4294967295L & jVar.f1611a);
                                } else {
                                    i18 = 0;
                                }
                                i19 = i24 + i18;
                                if (i19 < 1) {
                                    i19 = 1;
                                }
                                fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                                b0.y yVarA2 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                                qVar4 = (v0.q) nVar2;
                                i20 = qVar4.P;
                                d1.d dVarM2 = qVar4.m();
                                q qVarC2 = h1.a.c(h1.n.f7355t, nVar2);
                                k.f5534k.getClass();
                                iVar3 = g2.j.b;
                                qVar4.d0();
                                if (qVar4.O) {
                                    qVar4.l(iVar3);
                                } else {
                                    qVar4.l0();
                                }
                                v0.d.a0(g2.j.f5523f, yVarA2, nVar2);
                                v0.d.a0(g2.j.f5522e, dVarM2, nVar2);
                                hVar = g2.j.f5524g;
                                if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                    t8.c.r(i20, qVar4, i20, hVar);
                                }
                                v0.d.a0(g2.j.f5521d, qVarC2, nVar2);
                                long jC3 = bb.a.c0(f13 * fMin, 4294967296L);
                                j11 = jD2;
                                sVar4 = sVar3;
                                c6.b(str4, null, j11, jC3, sVar4, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                if (str3 != null) {
                                    qVar4.Z(87392716);
                                    c6.b(str3, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar4, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                } else {
                                    qVar4.Z(82625319);
                                }
                                qVar4.q(false);
                                qVar4.q(true);
                            }
                        } else {
                            z20 = fVar instanceof e;
                            str3 = strG2;
                            if (z20) {
                                f10 = 82.0f;
                            } else if (str3 != null) {
                                f10 = 48.0f;
                            } else if (z18) {
                                f10 = 88.0f;
                            } else {
                                f10 = 64.0f;
                            }
                            if (z17) {
                                f11 = 1.25f;
                            } else {
                                f11 = 1.0f;
                            }
                            float f14 = f10 * f11;
                            long jC4 = bb.a.c0(f14, 4294967296L);
                            n0Var = n0VarA2;
                            n0 n0VarA4 = n0.a(n0Var, 0L, jC4, null, null, 0L, null, 0L, null, null, 16777213);
                            l0Var = l0VarC2;
                            String str5 = str2;
                            long j15 = l0.a(l0Var, str5, n0VarA4, 996).f16576c;
                            if (str3 != null) {
                                jVar = new j(l0.a(l0Var, str3, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                            } else {
                                jVar = null;
                            }
                            int i25 = (int) (j15 >> 32);
                            if (jVar != null) {
                                i17 = (int) (jVar.f1611a >> 32);
                            } else {
                                i17 = 0;
                            }
                            iMax = Math.max(i25, i17);
                            if (iMax < 1) {
                                iMax = 1;
                            }
                            int i26 = (int) (j15 & 4294967295L);
                            if (jVar != null) {
                                i18 = (int) (4294967295L & jVar.f1611a);
                            } else {
                                i18 = 0;
                            }
                            i19 = i26 + i18;
                            if (i19 < 1) {
                                i19 = 1;
                            }
                            fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                            b0.y yVarA3 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                            qVar4 = (v0.q) nVar2;
                            i20 = qVar4.P;
                            d1.d dVarM3 = qVar4.m();
                            q qVarC3 = h1.a.c(h1.n.f7355t, nVar2);
                            k.f5534k.getClass();
                            iVar3 = g2.j.b;
                            qVar4.d0();
                            if (qVar4.O) {
                                qVar4.l(iVar3);
                            } else {
                                qVar4.l0();
                            }
                            v0.d.a0(g2.j.f5523f, yVarA3, nVar2);
                            v0.d.a0(g2.j.f5522e, dVarM3, nVar2);
                            hVar = g2.j.f5524g;
                            if (qVar4.O) {
                                t8.c.r(i20, qVar4, i20, hVar);
                            } else {
                                t8.c.r(i20, qVar4, i20, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC3, nVar2);
                            long jC5 = bb.a.c0(f14 * fMin, 4294967296L);
                            j11 = jD2;
                            sVar4 = sVar3;
                            c6.b(str5, null, j11, jC5, sVar4, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            if (str3 != null) {
                                qVar4.Z(87392716);
                                c6.b(str3, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar4, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            } else {
                                qVar4.Z(82625319);
                            }
                            qVar4.q(false);
                            qVar4.q(true);
                        }
                        return se.a0.f19710a;
                    }
                }, qVar3);
                qVar2 = qVar3;
                b0.c.a(qVarA2, iVar2, aVarB2, qVar2, 3120, 4);
                z19 = z17;
                z14 = z18;
            } else {
                if (i16 != 0) {
                    z13 = false;
                }
                if (i12 != 0) {
                    z14 = false;
                }
                z15 = fVar instanceof le.d;
                if (z15) {
                    i14 = ((le.d) fVar).f10149a * 60;
                } else if (fVar instanceof le.c) {
                    i14 = ((le.c) fVar).f10148a;
                } else {
                    if (!fVar.equals(le.e.f10150a)) {
                        m0.n.h();
                        return;
                    }
                    i14 = 0;
                }
                if (i14 < 0) {
                    i14 = 0;
                }
                i15 = i14 / 86400;
                z16 = fVar instanceof le.e;
                if (z16) {
                    qVar3.Z(1398024428);
                    qVar3.q(false);
                    strG = "∞";
                } else if (!z15) {
                    if (i15 > 0) {
                        qVar3.Z(1707669166);
                        strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                        qVar3.q(false);
                        strG = strE;
                    } else {
                        qVar3.Z(1707671681);
                        qVar3.q(false);
                        strG = G(i14, false);
                    }
                } else if (i15 > 0) {
                    qVar3.Z(1707669166);
                    strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                    qVar3.q(false);
                    strG = strE;
                } else {
                    qVar3.Z(1707671681);
                    qVar3.q(false);
                    strG = G(i14, false);
                }
                if (fVar instanceof le.c) {
                    strG2 = null;
                } else {
                    strG2 = null;
                }
                if (z16) {
                    strC0 = "No end time";
                } else {
                    strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
                }
                if (z10) {
                    j10 = 4294112503L;
                } else {
                    j10 = 4278916132L;
                }
                final long jD3 = r0.d(j10);
                z17 = z13;
                z18 = z14;
                final l0 l0VarC3 = u8.g.C(qVar3);
                if (z18) {
                    sVar = s.f20818x;
                } else if (z17) {
                    sVar = s.B;
                } else {
                    sVar = s.A;
                }
                final s sVar4 = sVar;
                final n0 n0VarA3 = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar4, null, 0L, null, 0L, null, null, 16777211);
                zF = qVar3.f(strC0);
                final String str3 = strG;
                objO = qVar3.O();
                if (zF) {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                } else {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                }
                q qVarA3 = n2.m.a(qVar, (hf.c) objO);
                h1.i iVar3 = h1.b.f7342x;
                d1.a aVarB3 = d1.f.b(1963229061, new hf.f() { // from class: le.g
                    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                    @Override // hf.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z20;
                        String str4;
                        float f10;
                        float f11;
                        n0 n0Var;
                        l0 l0Var;
                        j jVar;
                        int i17;
                        int iMax;
                        int i18;
                        int i19;
                        float fMin;
                        v0.q qVar4;
                        int i20;
                        i iVar4;
                        g2.h hVar;
                        long j11;
                        s sVar5;
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        n nVar2 = (n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        long j12 = cVar.b;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18) {
                            v0.q qVar5 = (v0.q) nVar2;
                            if (qVar5.E()) {
                                qVar5.T();
                            } else {
                                z20 = fVar instanceof e;
                                str4 = strG2;
                                if (z20) {
                                    f10 = 82.0f;
                                } else if (str4 != null) {
                                    f10 = 48.0f;
                                } else if (z18) {
                                    f10 = 88.0f;
                                } else {
                                    f10 = 64.0f;
                                }
                                if (z17) {
                                    f11 = 1.25f;
                                } else {
                                    f11 = 1.0f;
                                }
                                float f14 = f10 * f11;
                                long jC4 = bb.a.c0(f14, 4294967296L);
                                n0Var = n0VarA3;
                                n0 n0VarA4 = n0.a(n0Var, 0L, jC4, null, null, 0L, null, 0L, null, null, 16777213);
                                l0Var = l0VarC3;
                                String str5 = str3;
                                long j15 = l0.a(l0Var, str5, n0VarA4, 996).f16576c;
                                if (str4 != null) {
                                    jVar = new j(l0.a(l0Var, str4, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                                } else {
                                    jVar = null;
                                }
                                int i25 = (int) (j15 >> 32);
                                if (jVar != null) {
                                    i17 = (int) (jVar.f1611a >> 32);
                                } else {
                                    i17 = 0;
                                }
                                iMax = Math.max(i25, i17);
                                if (iMax < 1) {
                                    iMax = 1;
                                }
                                int i26 = (int) (j15 & 4294967295L);
                                if (jVar != null) {
                                    i18 = (int) (4294967295L & jVar.f1611a);
                                } else {
                                    i18 = 0;
                                }
                                i19 = i26 + i18;
                                if (i19 < 1) {
                                    i19 = 1;
                                }
                                fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                                b0.y yVarA3 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                                qVar4 = (v0.q) nVar2;
                                i20 = qVar4.P;
                                d1.d dVarM3 = qVar4.m();
                                q qVarC3 = h1.a.c(h1.n.f7355t, nVar2);
                                k.f5534k.getClass();
                                iVar4 = g2.j.b;
                                qVar4.d0();
                                if (qVar4.O) {
                                    qVar4.l(iVar4);
                                } else {
                                    qVar4.l0();
                                }
                                v0.d.a0(g2.j.f5523f, yVarA3, nVar2);
                                v0.d.a0(g2.j.f5522e, dVarM3, nVar2);
                                hVar = g2.j.f5524g;
                                if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                    t8.c.r(i20, qVar4, i20, hVar);
                                }
                                v0.d.a0(g2.j.f5521d, qVarC3, nVar2);
                                long jC5 = bb.a.c0(f14 * fMin, 4294967296L);
                                j11 = jD3;
                                sVar5 = sVar4;
                                c6.b(str5, null, j11, jC5, sVar5, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                if (str4 != null) {
                                    qVar4.Z(87392716);
                                    c6.b(str4, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar5, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                } else {
                                    qVar4.Z(82625319);
                                }
                                qVar4.q(false);
                                qVar4.q(true);
                            }
                        } else {
                            z20 = fVar instanceof e;
                            str4 = strG2;
                            if (z20) {
                                f10 = 82.0f;
                            } else if (str4 != null) {
                                f10 = 48.0f;
                            } else if (z18) {
                                f10 = 88.0f;
                            } else {
                                f10 = 64.0f;
                            }
                            if (z17) {
                                f11 = 1.25f;
                            } else {
                                f11 = 1.0f;
                            }
                            float f15 = f10 * f11;
                            long jC6 = bb.a.c0(f15, 4294967296L);
                            n0Var = n0VarA3;
                            n0 n0VarA5 = n0.a(n0Var, 0L, jC6, null, null, 0L, null, 0L, null, null, 16777213);
                            l0Var = l0VarC3;
                            String str6 = str3;
                            long j16 = l0.a(l0Var, str6, n0VarA5, 996).f16576c;
                            if (str4 != null) {
                                jVar = new j(l0.a(l0Var, str4, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                            } else {
                                jVar = null;
                            }
                            int i27 = (int) (j16 >> 32);
                            if (jVar != null) {
                                i17 = (int) (jVar.f1611a >> 32);
                            } else {
                                i17 = 0;
                            }
                            iMax = Math.max(i27, i17);
                            if (iMax < 1) {
                                iMax = 1;
                            }
                            int i28 = (int) (j16 & 4294967295L);
                            if (jVar != null) {
                                i18 = (int) (4294967295L & jVar.f1611a);
                            } else {
                                i18 = 0;
                            }
                            i19 = i28 + i18;
                            if (i19 < 1) {
                                i19 = 1;
                            }
                            fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                            b0.y yVarA4 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                            qVar4 = (v0.q) nVar2;
                            i20 = qVar4.P;
                            d1.d dVarM4 = qVar4.m();
                            q qVarC4 = h1.a.c(h1.n.f7355t, nVar2);
                            k.f5534k.getClass();
                            iVar4 = g2.j.b;
                            qVar4.d0();
                            if (qVar4.O) {
                                qVar4.l(iVar4);
                            } else {
                                qVar4.l0();
                            }
                            v0.d.a0(g2.j.f5523f, yVarA4, nVar2);
                            v0.d.a0(g2.j.f5522e, dVarM4, nVar2);
                            hVar = g2.j.f5524g;
                            if (qVar4.O) {
                                t8.c.r(i20, qVar4, i20, hVar);
                            } else {
                                t8.c.r(i20, qVar4, i20, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC4, nVar2);
                            long jC7 = bb.a.c0(f15 * fMin, 4294967296L);
                            j11 = jD3;
                            sVar5 = sVar4;
                            c6.b(str6, null, j11, jC7, sVar5, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            if (str4 != null) {
                                qVar4.Z(87392716);
                                c6.b(str4, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar5, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            } else {
                                qVar4.Z(82625319);
                            }
                            qVar4.q(false);
                            qVar4.q(true);
                        }
                        return se.a0.f19710a;
                    }
                }, qVar3);
                qVar2 = qVar3;
                b0.c.a(qVarA3, iVar3, aVarB3, qVar2, 3120, 4);
                z19 = z17;
                z14 = z18;
            }
            h1VarV = qVar2.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new hf.e() { // from class: le.h
                    @Override // hf.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pf.l.b(fVar, z10, qVar, z19, z14, (n) obj, v0.d.e0(i2 | 1), i10);
                        return se.a0.f19710a;
                    }
                };
            }
        }
        i11 |= 3072;
        z13 = z11;
        i12 = i10 & 16;
        if (i12 != 0) {
            if ((i2 & 24576) == 0) {
                z14 = z12;
                if (qVar3.g(z14)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i11 |= i13;
            }
            if ((i11 & 9363) == 9362) {
                if (i16 != 0) {
                    z13 = false;
                }
                if (i12 != 0) {
                    z14 = false;
                }
                z15 = fVar instanceof le.d;
                if (z15) {
                    i14 = ((le.d) fVar).f10149a * 60;
                } else if (fVar instanceof le.c) {
                    i14 = ((le.c) fVar).f10148a;
                } else {
                    if (!fVar.equals(le.e.f10150a)) {
                        m0.n.h();
                        return;
                    }
                    i14 = 0;
                }
                if (i14 < 0) {
                    i14 = 0;
                }
                i15 = i14 / 86400;
                z16 = fVar instanceof le.e;
                if (z16) {
                    qVar3.Z(1398024428);
                    qVar3.q(false);
                    strG = "∞";
                } else if (!z15) {
                    if (i15 > 0) {
                        qVar3.Z(1707669166);
                        strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                        qVar3.q(false);
                        strG = strE;
                    } else {
                        qVar3.Z(1707671681);
                        qVar3.q(false);
                        strG = G(i14, false);
                    }
                } else if (i15 > 0) {
                    qVar3.Z(1707669166);
                    strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                    qVar3.q(false);
                    strG = strE;
                } else {
                    qVar3.Z(1707671681);
                    qVar3.q(false);
                    strG = G(i14, false);
                }
                if (fVar instanceof le.c) {
                    strG2 = null;
                } else {
                    strG2 = null;
                }
                if (z16) {
                    strC0 = "No end time";
                } else {
                    strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
                }
                if (z10) {
                    j10 = 4294112503L;
                } else {
                    j10 = 4278916132L;
                }
                final long jD4 = r0.d(j10);
                z17 = z13;
                z18 = z14;
                final l0 l0VarC4 = u8.g.C(qVar3);
                if (z18) {
                    sVar = s.f20818x;
                } else if (z17) {
                    sVar = s.B;
                } else {
                    sVar = s.A;
                }
                final s sVar5 = sVar;
                final n0 n0VarA4 = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar5, null, 0L, null, 0L, null, null, 16777211);
                zF = qVar3.f(strC0);
                final String str4 = strG;
                objO = qVar3.O();
                if (zF) {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                } else {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                }
                q qVarA4 = n2.m.a(qVar, (hf.c) objO);
                h1.i iVar4 = h1.b.f7342x;
                d1.a aVarB4 = d1.f.b(1963229061, new hf.f() { // from class: le.g
                    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                    @Override // hf.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z20;
                        String str5;
                        float f10;
                        float f11;
                        n0 n0Var;
                        l0 l0Var;
                        j jVar;
                        int i17;
                        int iMax;
                        int i18;
                        int i19;
                        float fMin;
                        v0.q qVar4;
                        int i20;
                        i iVar5;
                        g2.h hVar;
                        long j11;
                        s sVar6;
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        n nVar2 = (n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        long j12 = cVar.b;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18) {
                            v0.q qVar5 = (v0.q) nVar2;
                            if (qVar5.E()) {
                                qVar5.T();
                            } else {
                                z20 = fVar instanceof e;
                                str5 = strG2;
                                if (z20) {
                                    f10 = 82.0f;
                                } else if (str5 != null) {
                                    f10 = 48.0f;
                                } else if (z18) {
                                    f10 = 88.0f;
                                } else {
                                    f10 = 64.0f;
                                }
                                if (z17) {
                                    f11 = 1.25f;
                                } else {
                                    f11 = 1.0f;
                                }
                                float f15 = f10 * f11;
                                long jC6 = bb.a.c0(f15, 4294967296L);
                                n0Var = n0VarA4;
                                n0 n0VarA5 = n0.a(n0Var, 0L, jC6, null, null, 0L, null, 0L, null, null, 16777213);
                                l0Var = l0VarC4;
                                String str6 = str4;
                                long j16 = l0.a(l0Var, str6, n0VarA5, 996).f16576c;
                                if (str5 != null) {
                                    jVar = new j(l0.a(l0Var, str5, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                                } else {
                                    jVar = null;
                                }
                                int i27 = (int) (j16 >> 32);
                                if (jVar != null) {
                                    i17 = (int) (jVar.f1611a >> 32);
                                } else {
                                    i17 = 0;
                                }
                                iMax = Math.max(i27, i17);
                                if (iMax < 1) {
                                    iMax = 1;
                                }
                                int i28 = (int) (j16 & 4294967295L);
                                if (jVar != null) {
                                    i18 = (int) (4294967295L & jVar.f1611a);
                                } else {
                                    i18 = 0;
                                }
                                i19 = i28 + i18;
                                if (i19 < 1) {
                                    i19 = 1;
                                }
                                fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                                b0.y yVarA4 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                                qVar4 = (v0.q) nVar2;
                                i20 = qVar4.P;
                                d1.d dVarM4 = qVar4.m();
                                q qVarC4 = h1.a.c(h1.n.f7355t, nVar2);
                                k.f5534k.getClass();
                                iVar5 = g2.j.b;
                                qVar4.d0();
                                if (qVar4.O) {
                                    qVar4.l(iVar5);
                                } else {
                                    qVar4.l0();
                                }
                                v0.d.a0(g2.j.f5523f, yVarA4, nVar2);
                                v0.d.a0(g2.j.f5522e, dVarM4, nVar2);
                                hVar = g2.j.f5524g;
                                if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                    t8.c.r(i20, qVar4, i20, hVar);
                                }
                                v0.d.a0(g2.j.f5521d, qVarC4, nVar2);
                                long jC7 = bb.a.c0(f15 * fMin, 4294967296L);
                                j11 = jD4;
                                sVar6 = sVar5;
                                c6.b(str6, null, j11, jC7, sVar6, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                if (str5 != null) {
                                    qVar4.Z(87392716);
                                    c6.b(str5, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar6, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                } else {
                                    qVar4.Z(82625319);
                                }
                                qVar4.q(false);
                                qVar4.q(true);
                            }
                        } else {
                            z20 = fVar instanceof e;
                            str5 = strG2;
                            if (z20) {
                                f10 = 82.0f;
                            } else if (str5 != null) {
                                f10 = 48.0f;
                            } else if (z18) {
                                f10 = 88.0f;
                            } else {
                                f10 = 64.0f;
                            }
                            if (z17) {
                                f11 = 1.25f;
                            } else {
                                f11 = 1.0f;
                            }
                            float f16 = f10 * f11;
                            long jC8 = bb.a.c0(f16, 4294967296L);
                            n0Var = n0VarA4;
                            n0 n0VarA6 = n0.a(n0Var, 0L, jC8, null, null, 0L, null, 0L, null, null, 16777213);
                            l0Var = l0VarC4;
                            String str7 = str4;
                            long j17 = l0.a(l0Var, str7, n0VarA6, 996).f16576c;
                            if (str5 != null) {
                                jVar = new j(l0.a(l0Var, str5, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                            } else {
                                jVar = null;
                            }
                            int i29 = (int) (j17 >> 32);
                            if (jVar != null) {
                                i17 = (int) (jVar.f1611a >> 32);
                            } else {
                                i17 = 0;
                            }
                            iMax = Math.max(i29, i17);
                            if (iMax < 1) {
                                iMax = 1;
                            }
                            int i210 = (int) (j17 & 4294967295L);
                            if (jVar != null) {
                                i18 = (int) (4294967295L & jVar.f1611a);
                            } else {
                                i18 = 0;
                            }
                            i19 = i210 + i18;
                            if (i19 < 1) {
                                i19 = 1;
                            }
                            fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                            b0.y yVarA5 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                            qVar4 = (v0.q) nVar2;
                            i20 = qVar4.P;
                            d1.d dVarM5 = qVar4.m();
                            q qVarC5 = h1.a.c(h1.n.f7355t, nVar2);
                            k.f5534k.getClass();
                            iVar5 = g2.j.b;
                            qVar4.d0();
                            if (qVar4.O) {
                                qVar4.l(iVar5);
                            } else {
                                qVar4.l0();
                            }
                            v0.d.a0(g2.j.f5523f, yVarA5, nVar2);
                            v0.d.a0(g2.j.f5522e, dVarM5, nVar2);
                            hVar = g2.j.f5524g;
                            if (qVar4.O) {
                                t8.c.r(i20, qVar4, i20, hVar);
                            } else {
                                t8.c.r(i20, qVar4, i20, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC5, nVar2);
                            long jC9 = bb.a.c0(f16 * fMin, 4294967296L);
                            j11 = jD4;
                            sVar6 = sVar5;
                            c6.b(str7, null, j11, jC9, sVar6, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            if (str5 != null) {
                                qVar4.Z(87392716);
                                c6.b(str5, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar6, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            } else {
                                qVar4.Z(82625319);
                            }
                            qVar4.q(false);
                            qVar4.q(true);
                        }
                        return se.a0.f19710a;
                    }
                }, qVar3);
                qVar2 = qVar3;
                b0.c.a(qVarA4, iVar4, aVarB4, qVar2, 3120, 4);
                z19 = z17;
                z14 = z18;
            } else {
                if (i16 != 0) {
                    z13 = false;
                }
                if (i12 != 0) {
                    z14 = false;
                }
                z15 = fVar instanceof le.d;
                if (z15) {
                    i14 = ((le.d) fVar).f10149a * 60;
                } else if (fVar instanceof le.c) {
                    i14 = ((le.c) fVar).f10148a;
                } else {
                    if (!fVar.equals(le.e.f10150a)) {
                        m0.n.h();
                        return;
                    }
                    i14 = 0;
                }
                if (i14 < 0) {
                    i14 = 0;
                }
                i15 = i14 / 86400;
                z16 = fVar instanceof le.e;
                if (z16) {
                    qVar3.Z(1398024428);
                    qVar3.q(false);
                    strG = "∞";
                } else if (!z15) {
                    if (i15 > 0) {
                        qVar3.Z(1707669166);
                        strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                        qVar3.q(false);
                        strG = strE;
                    } else {
                        qVar3.Z(1707671681);
                        qVar3.q(false);
                        strG = G(i14, false);
                    }
                } else if (i15 > 0) {
                    qVar3.Z(1707669166);
                    strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                    qVar3.q(false);
                    strG = strE;
                } else {
                    qVar3.Z(1707671681);
                    qVar3.q(false);
                    strG = G(i14, false);
                }
                if (fVar instanceof le.c) {
                    strG2 = null;
                } else {
                    strG2 = null;
                }
                if (z16) {
                    strC0 = "No end time";
                } else {
                    strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
                }
                if (z10) {
                    j10 = 4294112503L;
                } else {
                    j10 = 4278916132L;
                }
                final long jD5 = r0.d(j10);
                z17 = z13;
                z18 = z14;
                final l0 l0VarC5 = u8.g.C(qVar3);
                if (z18) {
                    sVar = s.f20818x;
                } else if (z17) {
                    sVar = s.B;
                } else {
                    sVar = s.A;
                }
                final s sVar6 = sVar;
                final n0 n0VarA5 = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar6, null, 0L, null, 0L, null, null, 16777211);
                zF = qVar3.f(strC0);
                final String str5 = strG;
                objO = qVar3.O();
                if (zF) {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                } else {
                    objO = new b0(strC0, 7);
                    qVar3.i0(objO);
                }
                q qVarA5 = n2.m.a(qVar, (hf.c) objO);
                h1.i iVar5 = h1.b.f7342x;
                d1.a aVarB5 = d1.f.b(1963229061, new hf.f() { // from class: le.g
                    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                    @Override // hf.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z20;
                        String str6;
                        float f10;
                        float f11;
                        n0 n0Var;
                        l0 l0Var;
                        j jVar;
                        int i17;
                        int iMax;
                        int i18;
                        int i19;
                        float fMin;
                        v0.q qVar4;
                        int i20;
                        i iVar6;
                        g2.h hVar;
                        long j11;
                        s sVar7;
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        n nVar2 = (n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        long j12 = cVar.b;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                        }
                        if ((iIntValue & 19) == 18) {
                            v0.q qVar5 = (v0.q) nVar2;
                            if (qVar5.E()) {
                                qVar5.T();
                            } else {
                                z20 = fVar instanceof e;
                                str6 = strG2;
                                if (z20) {
                                    f10 = 82.0f;
                                } else if (str6 != null) {
                                    f10 = 48.0f;
                                } else if (z18) {
                                    f10 = 88.0f;
                                } else {
                                    f10 = 64.0f;
                                }
                                if (z17) {
                                    f11 = 1.25f;
                                } else {
                                    f11 = 1.0f;
                                }
                                float f16 = f10 * f11;
                                long jC8 = bb.a.c0(f16, 4294967296L);
                                n0Var = n0VarA5;
                                n0 n0VarA6 = n0.a(n0Var, 0L, jC8, null, null, 0L, null, 0L, null, null, 16777213);
                                l0Var = l0VarC5;
                                String str7 = str5;
                                long j17 = l0.a(l0Var, str7, n0VarA6, 996).f16576c;
                                if (str6 != null) {
                                    jVar = new j(l0.a(l0Var, str6, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                                } else {
                                    jVar = null;
                                }
                                int i29 = (int) (j17 >> 32);
                                if (jVar != null) {
                                    i17 = (int) (jVar.f1611a >> 32);
                                } else {
                                    i17 = 0;
                                }
                                iMax = Math.max(i29, i17);
                                if (iMax < 1) {
                                    iMax = 1;
                                }
                                int i210 = (int) (j17 & 4294967295L);
                                if (jVar != null) {
                                    i18 = (int) (4294967295L & jVar.f1611a);
                                } else {
                                    i18 = 0;
                                }
                                i19 = i210 + i18;
                                if (i19 < 1) {
                                    i19 = 1;
                                }
                                fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                                b0.y yVarA5 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                                qVar4 = (v0.q) nVar2;
                                i20 = qVar4.P;
                                d1.d dVarM5 = qVar4.m();
                                q qVarC5 = h1.a.c(h1.n.f7355t, nVar2);
                                k.f5534k.getClass();
                                iVar6 = g2.j.b;
                                qVar4.d0();
                                if (qVar4.O) {
                                    qVar4.l(iVar6);
                                } else {
                                    qVar4.l0();
                                }
                                v0.d.a0(g2.j.f5523f, yVarA5, nVar2);
                                v0.d.a0(g2.j.f5522e, dVarM5, nVar2);
                                hVar = g2.j.f5524g;
                                if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                    t8.c.r(i20, qVar4, i20, hVar);
                                }
                                v0.d.a0(g2.j.f5521d, qVarC5, nVar2);
                                long jC9 = bb.a.c0(f16 * fMin, 4294967296L);
                                j11 = jD5;
                                sVar7 = sVar6;
                                c6.b(str7, null, j11, jC9, sVar7, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                if (str6 != null) {
                                    qVar4.Z(87392716);
                                    c6.b(str6, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar7, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                                } else {
                                    qVar4.Z(82625319);
                                }
                                qVar4.q(false);
                                qVar4.q(true);
                            }
                        } else {
                            z20 = fVar instanceof e;
                            str6 = strG2;
                            if (z20) {
                                f10 = 82.0f;
                            } else if (str6 != null) {
                                f10 = 48.0f;
                            } else if (z18) {
                                f10 = 88.0f;
                            } else {
                                f10 = 64.0f;
                            }
                            if (z17) {
                                f11 = 1.25f;
                            } else {
                                f11 = 1.0f;
                            }
                            float f17 = f10 * f11;
                            long jC10 = bb.a.c0(f17, 4294967296L);
                            n0Var = n0VarA5;
                            n0 n0VarA7 = n0.a(n0Var, 0L, jC10, null, null, 0L, null, 0L, null, null, 16777213);
                            l0Var = l0VarC5;
                            String str8 = str5;
                            long j18 = l0.a(l0Var, str8, n0VarA7, 996).f16576c;
                            if (str6 != null) {
                                jVar = new j(l0.a(l0Var, str6, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                            } else {
                                jVar = null;
                            }
                            int i211 = (int) (j18 >> 32);
                            if (jVar != null) {
                                i17 = (int) (jVar.f1611a >> 32);
                            } else {
                                i17 = 0;
                            }
                            iMax = Math.max(i211, i17);
                            if (iMax < 1) {
                                iMax = 1;
                            }
                            int i212 = (int) (j18 & 4294967295L);
                            if (jVar != null) {
                                i18 = (int) (4294967295L & jVar.f1611a);
                            } else {
                                i18 = 0;
                            }
                            i19 = i212 + i18;
                            if (i19 < 1) {
                                i19 = 1;
                            }
                            fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                            b0.y yVarA6 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                            qVar4 = (v0.q) nVar2;
                            i20 = qVar4.P;
                            d1.d dVarM6 = qVar4.m();
                            q qVarC6 = h1.a.c(h1.n.f7355t, nVar2);
                            k.f5534k.getClass();
                            iVar6 = g2.j.b;
                            qVar4.d0();
                            if (qVar4.O) {
                                qVar4.l(iVar6);
                            } else {
                                qVar4.l0();
                            }
                            v0.d.a0(g2.j.f5523f, yVarA6, nVar2);
                            v0.d.a0(g2.j.f5522e, dVarM6, nVar2);
                            hVar = g2.j.f5524g;
                            if (qVar4.O) {
                                t8.c.r(i20, qVar4, i20, hVar);
                            } else {
                                t8.c.r(i20, qVar4, i20, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC6, nVar2);
                            long jC11 = bb.a.c0(f17 * fMin, 4294967296L);
                            j11 = jD5;
                            sVar7 = sVar6;
                            c6.b(str8, null, j11, jC11, sVar7, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            if (str6 != null) {
                                qVar4.Z(87392716);
                                c6.b(str6, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar7, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            } else {
                                qVar4.Z(82625319);
                            }
                            qVar4.q(false);
                            qVar4.q(true);
                        }
                        return se.a0.f19710a;
                    }
                }, qVar3);
                qVar2 = qVar3;
                b0.c.a(qVarA5, iVar5, aVarB5, qVar2, 3120, 4);
                z19 = z17;
                z14 = z18;
            }
            h1VarV = qVar2.v();
            if (h1VarV != null) {
                h1VarV.f21594d = new hf.e() { // from class: le.h
                    @Override // hf.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pf.l.b(fVar, z10, qVar, z19, z14, (n) obj, v0.d.e0(i2 | 1), i10);
                        return se.a0.f19710a;
                    }
                };
            }
        }
        i11 |= 24576;
        z14 = z12;
        if ((i11 & 9363) == 9362) {
            if (i16 != 0) {
                z13 = false;
            }
            if (i12 != 0) {
                z14 = false;
            }
            z15 = fVar instanceof le.d;
            if (z15) {
                i14 = ((le.d) fVar).f10149a * 60;
            } else if (fVar instanceof le.c) {
                i14 = ((le.c) fVar).f10148a;
            } else {
                if (!fVar.equals(le.e.f10150a)) {
                    m0.n.h();
                    return;
                }
                i14 = 0;
            }
            if (i14 < 0) {
                i14 = 0;
            }
            i15 = i14 / 86400;
            z16 = fVar instanceof le.e;
            if (z16) {
                qVar3.Z(1398024428);
                qVar3.q(false);
                strG = "∞";
            } else if (!z15) {
                if (i15 > 0) {
                    qVar3.Z(1707669166);
                    strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                    qVar3.q(false);
                    strG = strE;
                } else {
                    qVar3.Z(1707671681);
                    qVar3.q(false);
                    strG = G(i14, false);
                }
            } else if (i15 > 0) {
                qVar3.Z(1707669166);
                strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                qVar3.q(false);
                strG = strE;
            } else {
                qVar3.Z(1707671681);
                qVar3.q(false);
                strG = G(i14, false);
            }
            if (fVar instanceof le.c) {
                strG2 = null;
            } else {
                strG2 = null;
            }
            if (z16) {
                strC0 = "No end time";
            } else {
                strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
            }
            if (z10) {
                j10 = 4294112503L;
            } else {
                j10 = 4278916132L;
            }
            final long jD6 = r0.d(j10);
            z17 = z13;
            z18 = z14;
            final l0 l0VarC6 = u8.g.C(qVar3);
            if (z18) {
                sVar = s.f20818x;
            } else if (z17) {
                sVar = s.B;
            } else {
                sVar = s.A;
            }
            final s sVar7 = sVar;
            final n0 n0VarA6 = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar7, null, 0L, null, 0L, null, null, 16777211);
            zF = qVar3.f(strC0);
            final String str6 = strG;
            objO = qVar3.O();
            if (zF) {
                objO = new b0(strC0, 7);
                qVar3.i0(objO);
            } else {
                objO = new b0(strC0, 7);
                qVar3.i0(objO);
            }
            q qVarA6 = n2.m.a(qVar, (hf.c) objO);
            h1.i iVar6 = h1.b.f7342x;
            d1.a aVarB6 = d1.f.b(1963229061, new hf.f() { // from class: le.g
                /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                @Override // hf.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z20;
                    String str7;
                    float f10;
                    float f11;
                    n0 n0Var;
                    l0 l0Var;
                    j jVar;
                    int i17;
                    int iMax;
                    int i18;
                    int i19;
                    float fMin;
                    v0.q qVar4;
                    int i20;
                    i iVar7;
                    g2.h hVar;
                    long j11;
                    s sVar8;
                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    long j12 = cVar.b;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18) {
                        v0.q qVar5 = (v0.q) nVar2;
                        if (qVar5.E()) {
                            qVar5.T();
                        } else {
                            z20 = fVar instanceof e;
                            str7 = strG2;
                            if (z20) {
                                f10 = 82.0f;
                            } else if (str7 != null) {
                                f10 = 48.0f;
                            } else if (z18) {
                                f10 = 88.0f;
                            } else {
                                f10 = 64.0f;
                            }
                            if (z17) {
                                f11 = 1.25f;
                            } else {
                                f11 = 1.0f;
                            }
                            float f17 = f10 * f11;
                            long jC10 = bb.a.c0(f17, 4294967296L);
                            n0Var = n0VarA6;
                            n0 n0VarA7 = n0.a(n0Var, 0L, jC10, null, null, 0L, null, 0L, null, null, 16777213);
                            l0Var = l0VarC6;
                            String str8 = str6;
                            long j18 = l0.a(l0Var, str8, n0VarA7, 996).f16576c;
                            if (str7 != null) {
                                jVar = new j(l0.a(l0Var, str7, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                            } else {
                                jVar = null;
                            }
                            int i211 = (int) (j18 >> 32);
                            if (jVar != null) {
                                i17 = (int) (jVar.f1611a >> 32);
                            } else {
                                i17 = 0;
                            }
                            iMax = Math.max(i211, i17);
                            if (iMax < 1) {
                                iMax = 1;
                            }
                            int i212 = (int) (j18 & 4294967295L);
                            if (jVar != null) {
                                i18 = (int) (4294967295L & jVar.f1611a);
                            } else {
                                i18 = 0;
                            }
                            i19 = i212 + i18;
                            if (i19 < 1) {
                                i19 = 1;
                            }
                            fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                            b0.y yVarA6 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                            qVar4 = (v0.q) nVar2;
                            i20 = qVar4.P;
                            d1.d dVarM6 = qVar4.m();
                            q qVarC6 = h1.a.c(h1.n.f7355t, nVar2);
                            k.f5534k.getClass();
                            iVar7 = g2.j.b;
                            qVar4.d0();
                            if (qVar4.O) {
                                qVar4.l(iVar7);
                            } else {
                                qVar4.l0();
                            }
                            v0.d.a0(g2.j.f5523f, yVarA6, nVar2);
                            v0.d.a0(g2.j.f5522e, dVarM6, nVar2);
                            hVar = g2.j.f5524g;
                            if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                t8.c.r(i20, qVar4, i20, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC6, nVar2);
                            long jC11 = bb.a.c0(f17 * fMin, 4294967296L);
                            j11 = jD6;
                            sVar8 = sVar7;
                            c6.b(str8, null, j11, jC11, sVar8, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            if (str7 != null) {
                                qVar4.Z(87392716);
                                c6.b(str7, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar8, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            } else {
                                qVar4.Z(82625319);
                            }
                            qVar4.q(false);
                            qVar4.q(true);
                        }
                    } else {
                        z20 = fVar instanceof e;
                        str7 = strG2;
                        if (z20) {
                            f10 = 82.0f;
                        } else if (str7 != null) {
                            f10 = 48.0f;
                        } else if (z18) {
                            f10 = 88.0f;
                        } else {
                            f10 = 64.0f;
                        }
                        if (z17) {
                            f11 = 1.25f;
                        } else {
                            f11 = 1.0f;
                        }
                        float f18 = f10 * f11;
                        long jC12 = bb.a.c0(f18, 4294967296L);
                        n0Var = n0VarA6;
                        n0 n0VarA8 = n0.a(n0Var, 0L, jC12, null, null, 0L, null, 0L, null, null, 16777213);
                        l0Var = l0VarC6;
                        String str9 = str6;
                        long j19 = l0.a(l0Var, str9, n0VarA8, 996).f16576c;
                        if (str7 != null) {
                            jVar = new j(l0.a(l0Var, str7, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                        } else {
                            jVar = null;
                        }
                        int i213 = (int) (j19 >> 32);
                        if (jVar != null) {
                            i17 = (int) (jVar.f1611a >> 32);
                        } else {
                            i17 = 0;
                        }
                        iMax = Math.max(i213, i17);
                        if (iMax < 1) {
                            iMax = 1;
                        }
                        int i214 = (int) (j19 & 4294967295L);
                        if (jVar != null) {
                            i18 = (int) (4294967295L & jVar.f1611a);
                        } else {
                            i18 = 0;
                        }
                        i19 = i214 + i18;
                        if (i19 < 1) {
                            i19 = 1;
                        }
                        fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                        b0.y yVarA7 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                        qVar4 = (v0.q) nVar2;
                        i20 = qVar4.P;
                        d1.d dVarM7 = qVar4.m();
                        q qVarC7 = h1.a.c(h1.n.f7355t, nVar2);
                        k.f5534k.getClass();
                        iVar7 = g2.j.b;
                        qVar4.d0();
                        if (qVar4.O) {
                            qVar4.l(iVar7);
                        } else {
                            qVar4.l0();
                        }
                        v0.d.a0(g2.j.f5523f, yVarA7, nVar2);
                        v0.d.a0(g2.j.f5522e, dVarM7, nVar2);
                        hVar = g2.j.f5524g;
                        if (qVar4.O) {
                            t8.c.r(i20, qVar4, i20, hVar);
                        } else {
                            t8.c.r(i20, qVar4, i20, hVar);
                        }
                        v0.d.a0(g2.j.f5521d, qVarC7, nVar2);
                        long jC13 = bb.a.c0(f18 * fMin, 4294967296L);
                        j11 = jD6;
                        sVar8 = sVar7;
                        c6.b(str9, null, j11, jC13, sVar8, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                        if (str7 != null) {
                            qVar4.Z(87392716);
                            c6.b(str7, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar8, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                        } else {
                            qVar4.Z(82625319);
                        }
                        qVar4.q(false);
                        qVar4.q(true);
                    }
                    return se.a0.f19710a;
                }
            }, qVar3);
            qVar2 = qVar3;
            b0.c.a(qVarA6, iVar6, aVarB6, qVar2, 3120, 4);
            z19 = z17;
            z14 = z18;
        } else {
            if (i16 != 0) {
                z13 = false;
            }
            if (i12 != 0) {
                z14 = false;
            }
            z15 = fVar instanceof le.d;
            if (z15) {
                i14 = ((le.d) fVar).f10149a * 60;
            } else if (fVar instanceof le.c) {
                i14 = ((le.c) fVar).f10148a;
            } else {
                if (!fVar.equals(le.e.f10150a)) {
                    m0.n.h();
                    return;
                }
                i14 = 0;
            }
            if (i14 < 0) {
                i14 = 0;
            }
            i15 = i14 / 86400;
            z16 = fVar instanceof le.e;
            if (z16) {
                qVar3.Z(1398024428);
                qVar3.q(false);
                strG = "∞";
            } else if (!z15) {
                if (i15 > 0) {
                    qVar3.Z(1707669166);
                    strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                    qVar3.q(false);
                    strG = strE;
                } else {
                    qVar3.Z(1707671681);
                    qVar3.q(false);
                    strG = G(i14, false);
                }
            } else if (i15 > 0) {
                qVar3.Z(1707669166);
                strE = u8.l.E(R.plurals.timer_duration_days, i15, new Object[]{Integer.valueOf(i15)}, qVar3);
                qVar3.q(false);
                strG = strE;
            } else {
                qVar3.Z(1707671681);
                qVar3.q(false);
                strG = G(i14, false);
            }
            if (fVar instanceof le.c) {
                strG2 = null;
            } else {
                strG2 = null;
            }
            if (z16) {
                strC0 = "No end time";
            } else {
                strC0 = te.k.c0(te.j.X(new String[]{strG, strG2}), " ", null, null, null, 62);
            }
            if (z10) {
                j10 = 4294112503L;
            } else {
                j10 = 4278916132L;
            }
            final long jD7 = r0.d(j10);
            z17 = z13;
            z18 = z14;
            final l0 l0VarC7 = u8.g.C(qVar3);
            if (z18) {
                sVar = s.f20818x;
            } else if (z17) {
                sVar = s.B;
            } else {
                sVar = s.A;
            }
            final s sVar8 = sVar;
            final n0 n0VarA7 = n0.a((n0) qVar3.k(c6.f17498a), 0L, 0L, sVar8, null, 0L, null, 0L, null, null, 16777211);
            zF = qVar3.f(strC0);
            final String str7 = strG;
            objO = qVar3.O();
            if (zF) {
                objO = new b0(strC0, 7);
                qVar3.i0(objO);
            } else {
                objO = new b0(strC0, 7);
                qVar3.i0(objO);
            }
            q qVarA7 = n2.m.a(qVar, (hf.c) objO);
            h1.i iVar7 = h1.b.f7342x;
            d1.a aVarB7 = d1.f.b(1963229061, new hf.f() { // from class: le.g
                /* JADX WARN: Code duplicated, block: B:15:0x003d  */
                /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:19:0x004a  */
                /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                /* JADX WARN: Code duplicated, block: B:22:0x0051  */
                /* JADX WARN: Code duplicated, block: B:23:0x0054  */
                /* JADX WARN: Code duplicated, block: B:26:0x005c  */
                /* JADX WARN: Code duplicated, block: B:27:0x005f  */
                /* JADX WARN: Code duplicated, block: B:30:0x0092  */
                /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
                /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
                /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:41:0x00db  */
                /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
                /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
                /* JADX WARN: Code duplicated, block: B:48:0x0122  */
                /* JADX WARN: Code duplicated, block: B:49:0x0126  */
                /* JADX WARN: Code duplicated, block: B:54:0x0147  */
                /* JADX WARN: Code duplicated, block: B:57:0x019a  */
                /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
                @Override // hf.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z20;
                    String str8;
                    float f10;
                    float f11;
                    n0 n0Var;
                    l0 l0Var;
                    j jVar;
                    int i17;
                    int iMax;
                    int i18;
                    int i19;
                    float fMin;
                    v0.q qVar4;
                    int i20;
                    i iVar8;
                    g2.h hVar;
                    long j11;
                    s sVar9;
                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    long j12 = cVar.b;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((v0.q) nVar2).f(cVar) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18) {
                        v0.q qVar5 = (v0.q) nVar2;
                        if (qVar5.E()) {
                            qVar5.T();
                        } else {
                            z20 = fVar instanceof e;
                            str8 = strG2;
                            if (z20) {
                                f10 = 82.0f;
                            } else if (str8 != null) {
                                f10 = 48.0f;
                            } else if (z18) {
                                f10 = 88.0f;
                            } else {
                                f10 = 64.0f;
                            }
                            if (z17) {
                                f11 = 1.25f;
                            } else {
                                f11 = 1.0f;
                            }
                            float f18 = f10 * f11;
                            long jC12 = bb.a.c0(f18, 4294967296L);
                            n0Var = n0VarA7;
                            n0 n0VarA8 = n0.a(n0Var, 0L, jC12, null, null, 0L, null, 0L, null, null, 16777213);
                            l0Var = l0VarC7;
                            String str9 = str7;
                            long j19 = l0.a(l0Var, str9, n0VarA8, 996).f16576c;
                            if (str8 != null) {
                                jVar = new j(l0.a(l0Var, str8, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                            } else {
                                jVar = null;
                            }
                            int i213 = (int) (j19 >> 32);
                            if (jVar != null) {
                                i17 = (int) (jVar.f1611a >> 32);
                            } else {
                                i17 = 0;
                            }
                            iMax = Math.max(i213, i17);
                            if (iMax < 1) {
                                iMax = 1;
                            }
                            int i214 = (int) (j19 & 4294967295L);
                            if (jVar != null) {
                                i18 = (int) (4294967295L & jVar.f1611a);
                            } else {
                                i18 = 0;
                            }
                            i19 = i214 + i18;
                            if (i19 < 1) {
                                i19 = 1;
                            }
                            fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                            b0.y yVarA7 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                            qVar4 = (v0.q) nVar2;
                            i20 = qVar4.P;
                            d1.d dVarM7 = qVar4.m();
                            q qVarC7 = h1.a.c(h1.n.f7355t, nVar2);
                            k.f5534k.getClass();
                            iVar8 = g2.j.b;
                            qVar4.d0();
                            if (qVar4.O) {
                                qVar4.l(iVar8);
                            } else {
                                qVar4.l0();
                            }
                            v0.d.a0(g2.j.f5523f, yVarA7, nVar2);
                            v0.d.a0(g2.j.f5522e, dVarM7, nVar2);
                            hVar = g2.j.f5524g;
                            if (qVar4.O || !l.a(qVar4.O(), Integer.valueOf(i20))) {
                                t8.c.r(i20, qVar4, i20, hVar);
                            }
                            v0.d.a0(g2.j.f5521d, qVarC7, nVar2);
                            long jC13 = bb.a.c0(f18 * fMin, 4294967296L);
                            j11 = jD7;
                            sVar9 = sVar8;
                            c6.b(str9, null, j11, jC13, sVar9, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            if (str8 != null) {
                                qVar4.Z(87392716);
                                c6.b(str8, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar9, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                            } else {
                                qVar4.Z(82625319);
                            }
                            qVar4.q(false);
                            qVar4.q(true);
                        }
                    } else {
                        z20 = fVar instanceof e;
                        str8 = strG2;
                        if (z20) {
                            f10 = 82.0f;
                        } else if (str8 != null) {
                            f10 = 48.0f;
                        } else if (z18) {
                            f10 = 88.0f;
                        } else {
                            f10 = 64.0f;
                        }
                        if (z17) {
                            f11 = 1.25f;
                        } else {
                            f11 = 1.0f;
                        }
                        float f19 = f10 * f11;
                        long jC14 = bb.a.c0(f19, 4294967296L);
                        n0Var = n0VarA7;
                        n0 n0VarA9 = n0.a(n0Var, 0L, jC14, null, null, 0L, null, 0L, null, null, 16777213);
                        l0Var = l0VarC7;
                        String str10 = str7;
                        long j110 = l0.a(l0Var, str10, n0VarA9, 996).f16576c;
                        if (str8 != null) {
                            jVar = new j(l0.a(l0Var, str8, n0.a(n0Var, 0L, bb.a.T(24), null, null, 0L, null, 0L, null, null, 16777213), 996).f16576c);
                        } else {
                            jVar = null;
                        }
                        int i215 = (int) (j110 >> 32);
                        if (jVar != null) {
                            i17 = (int) (jVar.f1611a >> 32);
                        } else {
                            i17 = 0;
                        }
                        iMax = Math.max(i215, i17);
                        if (iMax < 1) {
                            iMax = 1;
                        }
                        int i216 = (int) (j110 & 4294967295L);
                        if (jVar != null) {
                            i18 = (int) (4294967295L & jVar.f1611a);
                        } else {
                            i18 = 0;
                        }
                        i19 = i216 + i18;
                        if (i19 < 1) {
                            i19 = 1;
                        }
                        fMin = Math.min(1.0f, Math.min(b3.a.h(j12) / iMax, b3.a.g(j12) / i19));
                        b0.y yVarA8 = x.a(b0.j.f1460c, h1.b.G, nVar2, 48);
                        qVar4 = (v0.q) nVar2;
                        i20 = qVar4.P;
                        d1.d dVarM8 = qVar4.m();
                        q qVarC8 = h1.a.c(h1.n.f7355t, nVar2);
                        k.f5534k.getClass();
                        iVar8 = g2.j.b;
                        qVar4.d0();
                        if (qVar4.O) {
                            qVar4.l(iVar8);
                        } else {
                            qVar4.l0();
                        }
                        v0.d.a0(g2.j.f5523f, yVarA8, nVar2);
                        v0.d.a0(g2.j.f5522e, dVarM8, nVar2);
                        hVar = g2.j.f5524g;
                        if (qVar4.O) {
                            t8.c.r(i20, qVar4, i20, hVar);
                        } else {
                            t8.c.r(i20, qVar4, i20, hVar);
                        }
                        v0.d.a0(g2.j.f5521d, qVarC8, nVar2);
                        long jC15 = bb.a.c0(f19 * fMin, 4294967296L);
                        j11 = jD7;
                        sVar9 = sVar8;
                        c6.b(str10, null, j11, jC15, sVar9, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                        if (str8 != null) {
                            qVar4.Z(87392716);
                            c6.b(str8, null, j11, bb.a.c0(24.0f * fMin, 4294967296L), sVar9, null, 0L, null, null, 0L, 0, false, 1, 0, null, nVar2, 0, 3456, 118738);
                        } else {
                            qVar4.Z(82625319);
                        }
                        qVar4.q(false);
                        qVar4.q(true);
                    }
                    return se.a0.f19710a;
                }
            }, qVar3);
            qVar2 = qVar3;
            b0.c.a(qVarA7, iVar7, aVarB7, qVar2, 3120, 4);
            z19 = z17;
            z14 = z18;
        }
        h1VarV = qVar2.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new hf.e() { // from class: le.h
                @Override // hf.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pf.l.b(fVar, z10, qVar, z19, z14, (n) obj, v0.d.e0(i2 | 1), i10);
                    return se.a0.f19710a;
                }
            };
        }
    }

    public static final void c(d0.b0 b0Var, Object obj, int i2, Object obj2, v0.n nVar, int i10) {
        int i11;
        v0.q qVar = (v0.q) nVar;
        qVar.b0(1439843069);
        if ((i10 & 6) == 0) {
            i11 = (qVar.f(b0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= qVar.f(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= qVar.d(i2) ? MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= qVar.f(obj2) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && qVar.E()) {
            qVar.T();
        } else {
            ((e1.c) obj).d(obj2, d1.f.b(980966366, new c0.l(i2, b0Var, obj2), qVar), qVar, 48);
        }
        h1 h1VarV = qVar.v();
        if (h1VarV != null) {
            h1VarV.f21594d = new w(b0Var, obj, i2, obj2, i10);
        }
    }

    public static Activity d(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return d(baseContext);
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, ModuleDescriptor.MODULE_VERSION);
        }
        Trace.beginSection(str);
    }

    public static t8.a f(Bundle bundle, String str) {
        String string;
        bundle.getClass();
        str.getClass();
        Date dateN = i0.n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateN2 = i0.n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new t8.a(string2, str, string, stringArrayList, null, null, t8.f.FACEBOOK_APPLICATION_SERVICE, dateN, new Date(), dateN2, bundle.getString("graph_domain"));
    }

    public static t8.a g(HashSet hashSet, Bundle bundle, t8.f fVar, String str) {
        Collection collectionH;
        ArrayList arrayListH;
        ArrayList arrayListH2;
        bundle.getClass();
        str.getClass();
        Date dateN = i0.n(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date dateN2 = i0.n(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                Object[] array = qf.k.R0(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                if (array == null) {
                    collectionH = hashSet;
                    collectionH = hashSet;
                    p1.n.h("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                collectionH = hashSet;
                collectionH = hashSet;
                String[] strArr = (String[]) array;
                collectionH = u7.f.h(Arrays.copyOf(strArr, strArr.length));
            }
            collectionH = hashSet;
            collectionH = hashSet;
            collectionH = hashSet;
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListH = null;
            } else {
                Object[] array2 = qf.k.R0(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                if (array2 == null) {
                    p1.n.h("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr2 = (String[]) array2;
                arrayListH = u7.f.h(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListH2 = null;
            } else {
                Object[] array3 = qf.k.R0(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                if (array3 == null) {
                    p1.n.h("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr3 = (String[]) array3;
                arrayListH2 = u7.f.h(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!i0.B(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    p1.n.u("Authorization response does not contain the signed_request");
                    return null;
                }
                try {
                    Object[] array4 = qf.k.R0(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                    if (array4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr4 = (String[]) array4;
                    if (strArr4.length == 2) {
                        byte[] bArrDecode = Base64.decode(strArr4[1], 0);
                        bArrDecode.getClass();
                        String string7 = new JSONObject(new String(bArrDecode, qf.a.f17245a)).getString("user_id");
                        string7.getClass();
                        return new t8.a(string, str, string7, collectionH, arrayListH, arrayListH2, fVar, dateN, new Date(), dateN2, string5);
                    }
                    p1.n.u("Failed to retrieve user_id from signed_request");
                    return null;
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
            }
        }
        return null;
    }

    public static t8.g h(Bundle bundle, String str) {
        bundle.getClass();
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new t8.g(string, str);
        } catch (Exception e10) {
            throw new t8.l(e10.getMessage(), e10);
        }
    }

    public static Bundle i(Parcel parcel, int i2) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iL);
        return bundle;
    }

    public static byte[] j(Parcel parcel, int i2) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iL);
        return bArrCreateByteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xe.d k(hf.e eVar, xe.d dVar, xe.d dVar2) {
        eVar.getClass();
        if (eVar instanceof ze.a) {
            return ((ze.a) eVar).create(dVar, dVar2);
        }
        xe.i context = dVar2.getContext();
        return context == xe.j.f23216t ? new ye.b(eVar, dVar2, dVar) : new ye.c(dVar2, context, eVar, dVar);
    }

    public static Intent l(Context context, String str) {
        if (!xe.f.e(context.getPackageManager())) {
            d8.m.k("Unused App Restriction features are not available on this device");
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", str, null));
        if (i2 >= 30) {
            return data;
        }
        String strM = xe.f.m(context.getPackageManager());
        strM.getClass();
        return data.setPackage(strM);
    }

    public static Parcelable m(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iL);
        return parcelable;
    }

    public static String n(Parcel parcel, int i2) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iL);
        return string;
    }

    public static ArrayList o(Parcel parcel, int i2) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iL);
        return arrayListCreateStringArrayList;
    }

    public static Object[] p(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iL);
        return objArrCreateTypedArray;
    }

    public static ArrayList q(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iL = L(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iL == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iL);
        return arrayListCreateTypedArrayList;
    }

    public static void r(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void s(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static void t(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new wa.b(c1.i("Overread allowed size end=", i2), parcel);
        }
    }

    public static final int u(int i2, s sVar) {
        boolean z10 = sVar.compareTo(s.f20817w) >= 0;
        boolean z11 = i2 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final u1.e v() {
        u1.e eVar = f16905d;
        if (eVar != null) {
            return eVar;
        }
        u1.d dVar = new u1.d("Filled.AppShortcut", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f0.f20688a;
        long j10 = o1.w.b;
        b1 b1Var = new b1(j10);
        jg.m mVar = new jg.m(2);
        mVar.m(17.0f, 18.0f);
        mVar.i(7.0f);
        mVar.q(6.0f);
        mVar.j(10.0f);
        mVar.r(1.0f);
        mVar.j(2.0f);
        mVar.q(3.0f);
        mVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mVar.i(7.0f);
        mVar.g(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        mVar.r(18.0f);
        mVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mVar.j(10.0f);
        mVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mVar.r(-4.0f);
        mVar.j(-2.0f);
        mVar.q(18.0f);
        mVar.f();
        u1.d.a(dVar, mVar.f8904t, b1Var);
        b1 b1Var2 = new b1(j10);
        jg.m mVar2 = new jg.m(2);
        mVar2.m(20.38f, 9.62f);
        mVar2.l(0.62f, 1.38f);
        mVar2.l(0.62f, -1.38f);
        mVar2.l(1.38f, -0.62f);
        mVar2.l(-1.38f, -0.62f);
        mVar2.l(-0.62f, -1.38f);
        mVar2.l(-0.62f, 1.38f);
        mVar2.l(-1.38f, 0.62f);
        mVar2.f();
        u1.d.a(dVar, mVar2.f8904t, b1Var2);
        b1 b1Var3 = new b1(j10);
        jg.m mVar3 = new jg.m(2);
        mVar3.m(16.0f, 8.0f);
        mVar3.l(-1.25f, 2.75f);
        mVar3.l(-2.75f, 1.25f);
        mVar3.l(2.75f, 1.25f);
        mVar3.l(1.25f, 2.75f);
        mVar3.l(1.25f, -2.75f);
        mVar3.l(2.75f, -1.25f);
        mVar3.l(-2.75f, -1.25f);
        mVar3.f();
        u1.d.a(dVar, mVar3.f8904t, b1Var3);
        b1 b1Var4 = new b1(j10);
        jg.m mVar4 = new jg.m(2);
        mVar4.m(21.0f, 13.0f);
        mVar4.l(-0.62f, 1.38f);
        mVar4.l(-1.38f, 0.62f);
        mVar4.l(1.38f, 0.62f);
        mVar4.l(0.62f, 1.38f);
        mVar4.l(0.62f, -1.38f);
        mVar4.l(1.38f, -0.62f);
        mVar4.l(-1.38f, -0.62f);
        mVar4.f();
        u1.d.a(dVar, mVar4.f8904t, b1Var4);
        u1.e eVarB = dVar.b();
        f16905d = eVarB;
        return eVarB;
    }

    public static final u1.e w() {
        u1.e eVar = f16906e;
        if (eVar != null) {
            return eVar;
        }
        u1.d dVar = new u1.d("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f0.f20688a;
        b1 b1Var = new b1(o1.w.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new u1.m(10.0f, 6.0f));
        arrayList.add(new u1.l(8.59f, 7.41f));
        arrayList.add(new u1.l(13.17f, 12.0f));
        arrayList.add(new t(-4.58f, 4.59f));
        arrayList.add(new u1.l(10.0f, 18.0f));
        arrayList.add(new t(6.0f, -6.0f));
        u1.e eVarO = c1.o(arrayList, u1.i.f20716c, dVar, arrayList, b1Var);
        f16906e = eVarO;
        return eVarO;
    }

    public static d0 x() {
        return r1.f16323m0;
    }

    public static final u1.e y() {
        u1.e eVar = f16907f;
        if (eVar != null) {
            return eVar;
        }
        u1.d dVar = new u1.d("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f0.f20688a;
        b1 b1Var = new b1(o1.w.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new u1.m(7.41f, 8.59f));
        arrayList.add(new u1.l(12.0f, 13.17f));
        arrayList.add(new t(4.59f, -4.58f));
        arrayList.add(new u1.l(18.0f, 10.0f));
        arrayList.add(new t(-6.0f, 6.0f));
        arrayList.add(new t(-6.0f, -6.0f));
        arrayList.add(new t(1.41f, -1.41f));
        u1.e eVarO = c1.o(arrayList, u1.i.f20716c, dVar, arrayList, b1Var);
        f16907f = eVarO;
        return eVarO;
    }

    public static final u1.e z() {
        u1.e eVar = f16904c;
        if (eVar != null) {
            return eVar;
        }
        u1.d dVar = new u1.d("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = f0.f20688a;
        b1 b1Var = new b1(o1.w.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new u1.m(8.59f, 16.59f));
        arrayList.add(new u1.l(13.17f, 12.0f));
        arrayList.add(new u1.l(8.59f, 7.41f));
        arrayList.add(new u1.l(10.0f, 6.0f));
        arrayList.add(new t(6.0f, 6.0f));
        arrayList.add(new t(-6.0f, 6.0f));
        arrayList.add(new t(-1.41f, -1.41f));
        u1.e eVarO = c1.o(arrayList, u1.i.f20716c, dVar, arrayList, b1Var);
        f16904c = eVarO;
        return eVarO;
    }
}
