package a5;

import ac.b1;
import ac.f0;
import ac.i0;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.view.Display;
import android.webkit.WebView;
import com.sociallite.android.UnusedAppSettingsActivity;
import ge.qa;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import me.fn;
import o4.g0;
import o4.j0;
import o4.p0;
import oe.p1;
import oe.r1;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements d0, e5.o, r4.c, h.b, e9.l, ia.b, zc.c, ub.c, ub.b, i5.f, d7.c, j7.b, k9.n, r4.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f287t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f288u;

    public /* synthetic */ x(Object obj, int i2) {
        this.f287t = i2;
        this.f288u = obj;
    }

    @Override // e9.l
    public void a(File file) {
        HashMap map;
        int i2;
        HashMap map2;
        f9.b bVar;
        HashMap map3;
        ArrayList arrayList = (ArrayList) this.f288u;
        file.getClass();
        HashMap map4 = f9.b.f5015m;
        int i10 = 0;
        if (p9.a.f16774a.contains(f9.g.class)) {
            map = null;
            break;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable >= 4) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = byteBufferWrap.getInt();
                int i12 = i11 + 4;
                if (iAvailable >= i12) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, qf.a.f17245a));
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length = jSONArrayNames.length();
                    String[] strArr = new String[length];
                    int i13 = length - 1;
                    if (i13 >= 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            strArr[i14] = jSONArrayNames.getString(i14);
                            if (i15 > i13) {
                                break;
                            } else {
                                i14 = i15;
                            }
                        }
                    }
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    map = new HashMap();
                    int i16 = 0;
                    while (i16 < length) {
                        String str = strArr[i16];
                        i16++;
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i17 = length2 - 1;
                            if (i17 >= 0) {
                                int i18 = 1;
                                while (true) {
                                    int i19 = i10 + 1;
                                    int i20 = jSONArray.getInt(i10);
                                    iArr[i10] = i20;
                                    i18 *= i20;
                                    if (i19 > i17) {
                                        break;
                                    } else {
                                        i10 = i19;
                                    }
                                }
                                i2 = i18;
                            } else {
                                i2 = 1;
                            }
                            int i21 = i2 * 4;
                            int i22 = i12 + i21;
                            if (i22 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i12, i21);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                f9.a aVar = new f9.a(iArr);
                                byteBufferWrap2.asFloatBuffer().get(aVar.f5014c, 0, i2);
                                map.put(str, aVar);
                                i12 = i22;
                                i10 = 0;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            p9.a.a(th, f9.g.class);
        }
        map = null;
        break;
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        if (p9.a.f16774a.contains(f9.b.class)) {
            map3 = null;
        } else {
            try {
                map3 = f9.b.f5015m;
            } catch (Throwable th2) {
                p9.a.a(th2, f9.b.class);
                map3 = null;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map3.containsKey(entry.getKey()) && (str2 = (String) map3.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            bVar = null;
        } else {
            try {
                bVar = new f9.b(map2);
            } catch (Exception unused2) {
                bVar = null;
            }
        }
        if (bVar != null) {
            int size = arrayList.size();
            int i23 = 0;
            while (i23 < size) {
                Object obj = arrayList.get(i23);
                i23++;
                f9.d dVar = (f9.d) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dVar.f5029a);
                sb2.append('_');
                String strL = t8.c.l(sb2, dVar.f5031d, "_rule");
                String str3 = dVar.f5030c;
                e5.f fVar = new e5.f(dVar, 2, bVar);
                File file2 = new File(f9.g.a(), strL);
                if (str3 == null || file2.exists()) {
                    fVar.a(file2);
                } else {
                    new e9.m(str3, file2, fVar).execute(new String[0]);
                }
            }
        }
    }

    @Override // r4.c
    public void accept(Object obj) {
        ((ac.e0) this.f288u).a((e6.a) obj);
    }

    @Override // a5.d0
    public int b(Object obj) {
        o4.o oVar = (o4.o) this.f288u;
        p pVar = (p) obj;
        String str = pVar.b;
        return ((str.equals(oVar.f15929m) || str.equals(e0.b(oVar))) && pVar.c(oVar, false)) ? 1 : 0;
    }

    @Override // d7.c
    public d7.d c(d7.b bVar) {
        Context context = (Context) this.f288u;
        String str = bVar.b;
        b6.c cVar = bVar.f3693c;
        cVar.getClass();
        if (str != null && str.length() != 0) {
            return new e7.h(context, str, cVar, true, true);
        }
        w4.d.j("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // i5.f
    public long d(long j10) {
        i5.r rVar = (i5.r) this.f288u;
        return r4.v.h((j10 * ((long) rVar.f8424e)) / 1000000, 0L, rVar.f8429j - 1);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    @Override // j7.b
    public void e(WebView webView, a1.n nVar, Uri uri, boolean z10, k7.f fVar) {
        Object lVar;
        int i2;
        int i10;
        int i11 = this.f287t;
        Object obj = this.f288u;
        switch (i11) {
            case 17:
                oe.q qVar = (oe.q) obj;
                webView.getClass();
                uri.getClass();
                fVar.getClass();
                boolean z11 = qVar.H;
                WebView webView2 = qVar.f16284t;
                if (!z11 && z10 && kotlin.jvm.internal.l.a(uri.getScheme(), "https") && te.k.P(te.a0.F("www.instagram.com", "instagram.com"), uri.getHost())) {
                    vf.d0 d0Var = oe.b.f16144a;
                    Context context = webView2.getContext();
                    context.getClass();
                    if (oe.b.a(context)) {
                        try {
                            String strG = nVar.g();
                            if (strG == null) {
                                strG = "";
                            }
                            lVar = Uri.parse(strG);
                        } catch (Throwable th) {
                            lVar = new se.l(th);
                        }
                        if (lVar instanceof se.l) {
                            lVar = null;
                        }
                        Uri uri2 = (Uri) lVar;
                        if (uri2 != null) {
                            String path = uri2.getPath();
                            String str = path != null ? path : "";
                            Pattern patternCompile = Pattern.compile("/[A-Za-z0-9_.]+/?");
                            patternCompile.getClass();
                            if (patternCompile.matcher(str).matches()) {
                                Set setF = te.a0.F("accounts", "direct", "stories", "reels", "explore", "create", "challenge", "oauth");
                                int i12 = 1;
                                char[] cArr = {'/'};
                                int length = str.length() - 1;
                                int i13 = 0;
                                int i14 = 0;
                                while (true) {
                                    if (i13 <= length) {
                                        char cCharAt = str.charAt(i14 == 0 ? i13 : length);
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i12) {
                                                i10 = i12;
                                                if (cCharAt != cArr[i15]) {
                                                    i15++;
                                                    i12 = i10;
                                                }
                                            } else {
                                                i10 = i12;
                                                i15 = -1;
                                            }
                                        }
                                        int i16 = i15 >= 0 ? i10 : 0;
                                        if (i14 == 0) {
                                            if (i16 == 0) {
                                                i12 = i10;
                                                i14 = i12;
                                            } else {
                                                i13++;
                                            }
                                        } else if (i16 != 0) {
                                            length--;
                                        }
                                        i12 = i10;
                                    } else {
                                        i10 = i12;
                                    }
                                }
                                if (setF.contains(str.subSequence(i13, length + 1).toString())) {
                                    i2 = 0;
                                } else {
                                    i2 = i10;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (kotlin.jvm.internal.l.a(uri2.getScheme(), "https") && te.k.P(te.a0.F("www.instagram.com", "instagram.com"), uri2.getHost()) && uri2.getUserInfo() == null && uri2.getPort() == -1) {
                                if (i2 == 0) {
                                    Pattern patternCompile2 = Pattern.compile("/p/[A-Za-z0-9_-]+/?");
                                    patternCompile2.getClass();
                                    if (!patternCompile2.matcher(str).matches()) {
                                    }
                                }
                                qVar.h();
                                webView2.loadUrl("https://www.instagram.com".concat(str));
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                r1.a((p1) obj, webView, nVar, uri, z10, fVar);
                break;
        }
    }

    @Override // zc.c
    public Object f(fa.c cVar) {
        return new gd.d((Context) cVar.a(Context.class), ((uc.f) cVar.a(uc.f.class)).d(), cVar.i(zc.o.a(gd.e.class)), cVar.c(od.b.class), (Executor) cVar.h((zc.o) this.f288u));
    }

    @Override // k9.n
    public void g(boolean z10) {
        String str = (String) this.f288u;
        if (z10) {
            try {
                q9.a aVar = new q9.a(str);
                if ((aVar.b == null || aVar.f17179c == null) ? false : true) {
                    rg.l.J(aVar.f17178a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // e5.o
    public b1 h(int i2, p0 p0Var, int[] iArr) {
        Object[] objArrCopyOf;
        e5.k kVar = (e5.k) this.f288u;
        f0 f0Var = i0.f523u;
        ac.r.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < p0Var.f15944a) {
            int i12 = i2;
            p0 p0Var2 = p0Var;
            e5.h hVar = new e5.h(i12, p0Var2, i10, kVar, iArr[i10]);
            int i13 = i11 + 1;
            if (objArr.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArr, ac.b0.d(objArr.length, i13));
            } else {
                if (z10) {
                    objArrCopyOf = (Object[]) objArr.clone();
                }
                objArr[i11] = hVar;
                i10++;
                i11++;
                i2 = i12;
                p0Var = p0Var2;
            }
            objArr = objArrCopyOf;
            z10 = false;
            objArr[i11] = hVar;
            i10++;
            i11++;
            i2 = i12;
            p0Var = p0Var2;
        }
        return i0.m(i11, objArr);
    }

    @Override // ia.b
    public Object i() {
        switch (this.f287t) {
            case 10:
                ha.f fVar = ((ga.i) this.f288u).f5834i;
                SQLiteDatabase sQLiteDatabaseA = fVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + fVar.f7759u.e()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                u7.i iVar = (u7.i) this.f288u;
                Iterator it = ((Iterable) ((ha.f) iVar.f21016u).f(new d8.m(19))).iterator();
                while (it.hasNext()) {
                    ((u7.m) iVar.f21017v).l0((aa.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // r4.h
    public void invoke(Object obj) {
        switch (this.f287t) {
            case 22:
                ((j0) obj).k((o4.b0) this.f288u);
                break;
            case 23:
                ((j0) obj).x((q4.c) this.f288u);
                break;
            case 24:
                ((j0) obj).k(((v4.u) this.f288u).f22061t.J);
                break;
            case 25:
                ((j0) obj).n((o4.d0) this.f288u);
                break;
            case 26:
                ((j0) obj).u((List) this.f288u);
                break;
            case 27:
            default:
                v4.e eVar = (v4.e) this.f288u;
                w4.k kVar = (w4.k) obj;
                kVar.f22632x += eVar.f21899g;
                kVar.f22633y += eVar.f21897e;
                break;
            case 28:
                ((w4.k) obj).f22622n = (g0) this.f288u;
                break;
        }
    }

    public void j() {
        hf.e eVar = (hf.e) this.f288u;
        synchronized (f1.p.b) {
            Iterable iterable = (Iterable) f1.p.f4779g;
            iterable.getClass();
            ArrayList arrayList = new ArrayList(te.l.I(iterable, 10));
            boolean z10 = false;
            for (Object obj : iterable) {
                boolean z11 = true;
                if (!z10 && kotlin.jvm.internal.l.a(obj, eVar)) {
                    z10 = true;
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
            f1.p.f4779g = arrayList;
        }
    }

    public void k(Display display) {
        g5.v vVar = (g5.v) this.f288u;
        vVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            vVar.f5735k = refreshRate;
            vVar.l = (refreshRate * 80) / 100;
        } else {
            r4.a.v("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            vVar.f5735k = -9223372036854775807L;
            vVar.l = -9223372036854775807L;
        }
    }

    @Override // h.b
    public void onActivityResult(Object obj) {
        int i2 = this.f287t;
        Object obj2 = this.f288u;
        switch (i2) {
            case 4:
                ((hf.c) ((u0) obj2).getValue()).invoke(obj);
                break;
            case 8:
                UnusedAppSettingsActivity unusedAppSettingsActivity = (UnusedAppSettingsActivity) obj2;
                int i10 = UnusedAppSettingsActivity.f3481x;
                qa qaVar = qa.f6764a;
                qa.b(unusedAppSettingsActivity);
                unusedAppSettingsActivity.finish();
                break;
            default:
                ((fn) obj2).invoke((h.a) obj);
                break;
        }
    }

    @Override // ub.b
    public void onFailure(Exception exc) {
        ((a8.c) this.f288u).invoke(null);
    }

    @Override // ub.c
    public void onSuccess(Object obj) {
        ((c8.b) this.f288u).invoke(obj);
    }

    public /* synthetic */ x(w4.a aVar, Object obj, int i2) {
        this.f287t = i2;
        this.f288u = obj;
    }
}
