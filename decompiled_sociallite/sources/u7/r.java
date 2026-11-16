package u7;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.play_billing.b2;
import com.revenuecat.purchases.common.Constants;
import com.sociallite.android.R;
import e4.v0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.f0;
import r4.v;
import v4.u;
import va.x;
import x4.g0;
import x4.j0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements b0, p3.a, ca.b, e6.j, i5.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f21065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f21066u;

    public r(Context context, int i2) {
        switch (i2) {
            case 15:
                x.i(context);
                Resources resources = context.getResources();
                this.f21065t = resources;
                this.f21066u = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.f21065t = context;
                this.f21066u = new a5.j(context, 0);
                break;
        }
    }

    public v4.d[] a(Handler handler, u uVar, u uVar2, u uVar3, u uVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f21065t;
        a5.j jVar = (a5.j) this.f21066u;
        arrayList.add(new g5.k(context, jVar, handler, uVar));
        e0.x xVar = new e0.x(context);
        r4.a.i(!xVar.f3986t);
        xVar.f3986t = true;
        if (((mc.c) xVar.f3989w) == null) {
            xVar.f3989w = new mc.c(new p4.d[0]);
        }
        if (((j4) xVar.f3991y) == null) {
            xVar.f3991y = new j4(context, 17);
        }
        arrayList.add(new j0((Context) this.f21065t, jVar, handler, uVar2, new g0(xVar)));
        arrayList.add(new d5.f(uVar3, handler.getLooper()));
        arrayList.add(new b5.b(uVar4, handler.getLooper()));
        arrayList.add(new h5.b());
        arrayList.add(new z4.f(z4.b.f23854s));
        return (v4.d[]) arrayList.toArray(new v4.d[0]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // i5.h
    public i5.g b(i5.n r19, long r20) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.b(i5.n, long):i5.g");
    }

    @Override // i5.h
    public void d() {
        r4.o oVar = (r4.o) this.f21066u;
        byte[] bArr = v.f18497f;
        oVar.getClass();
        oVar.D(bArr, bArr.length);
    }

    public void e(v4.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f21065t;
        if (handler != null) {
            handler.post(new x4.m(this, 0, eVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.b0
    public i f(com.google.android.gms.internal.measurement.n nVar) {
        i iVarX = ((i) this.f21065t).X();
        String str = (String) this.f21066u;
        iVarX.Z(str, nVar);
        ((HashMap) iVarX.f21018w).put(str, Boolean.TRUE);
        return iVarX;
    }

    public String g(String str) {
        String str2 = (String) this.f21066u;
        Resources resources = (Resources) this.f21065t;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // re.a
    public Object get() {
        int i2 = 20;
        wc.b bVar = new wc.b(i2);
        gd.e eVar = new gd.e(i2);
        Object obj = ((re.a) this.f21065t).get();
        re.a aVar = (re.a) this.f21066u;
        return new ha.f(bVar, eVar, ha.a.f7747f, (ha.h) obj, aVar);
    }

    public ArrayList h(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f21065t;
        u6.u uVarE = u6.u.e(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            uVarE.L(1);
        } else {
            uVarE.h(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorB = db.h.B(workDatabase_Impl, uVarE);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            uVarE.f();
        }
    }

    public void i(kotlin.jvm.internal.e eVar, bg.a aVar) {
        aVar.getClass();
        ((ArrayList) this.f21066u).add(new se.k(eVar, aVar));
    }

    @Override // p3.a
    public void onCancel() {
        ((Animator) this.f21065t).end();
        if (e4.j0.F(2)) {
            Objects.toString((v0) this.f21066u);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x0253  */
    /* JADX WARN: Code duplicated, block: B:130:0x025e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x0271  */
    /* JADX WARN: Code duplicated, block: B:135:0x0279  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281  */
    /* JADX WARN: Code duplicated, block: B:138:0x0285  */
    /* JADX WARN: Code duplicated, block: B:140:0x028d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0294  */
    /* JADX WARN: Code duplicated, block: B:143:0x029c  */
    /* JADX WARN: Code duplicated, block: B:149:0x02af  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:170:0x0302  */
    /* JADX WARN: Code duplicated, block: B:172:0x030a  */
    /* JADX WARN: Code duplicated, block: B:174:0x031a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0334  */
    /* JADX WARN: Code duplicated, block: B:178:0x0345  */
    /* JADX WARN: Code duplicated, block: B:181:0x034e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0350  */
    /* JADX WARN: Code duplicated, block: B:185:0x0359  */
    /* JADX WARN: Code duplicated, block: B:186:0x035b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:193:0x036c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0371  */
    /* JADX WARN: Code duplicated, block: B:195:0x0376  */
    /* JADX WARN: Code duplicated, block: B:197:0x0389  */
    /* JADX WARN: Code duplicated, block: B:238:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:174:0x031a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // e6.j
    public void q(byte[] bArr, int i2, int i10, e6.i iVar, r4.c cVar) {
        m6.c cVarD;
        String strTrim;
        int i11;
        String string;
        int i12;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z10;
        r rVar = this;
        r4.o oVar = (r4.o) rVar.f21065t;
        oVar.D(bArr, i2 + i10);
        oVar.F(i2);
        ArrayList arrayList = new ArrayList();
        try {
            m6.i.c(oVar);
            while (!TextUtils.isEmpty(oVar.h(zb.c.f24027c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z11 = false;
                int i13 = -1;
                int i14 = 0;
                byte b10 = -1;
                while (true) {
                    int i15 = 1;
                    if (b10 == -1) {
                        i14 = oVar.b;
                        String strH = oVar.h(zb.c.f24027c);
                        if (strH == null) {
                            b10 = 0;
                        } else if ("STYLE".equals(strH)) {
                            b10 = 2;
                        } else {
                            b10 = strH.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        oVar.F(i14);
                        if (b10 == 0) {
                            w8.c.O(new m(arrayList2), iVar, cVar);
                            return;
                        }
                        if (b10 == 1) {
                            while (!TextUtils.isEmpty(oVar.h(zb.c.f24027c))) {
                            }
                        } else {
                            String str = null;
                            if (b10 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    w4.d.j("A style block was found after the first cue.");
                                    return;
                                }
                                oVar.h(zb.c.f24027c);
                                m6.a aVar = (m6.a) rVar.f21066u;
                                r4.o oVar2 = aVar.f10503a;
                                StringBuilder sb2 = aVar.b;
                                sb2.setLength(0);
                                int i16 = oVar.b;
                                while (!TextUtils.isEmpty(oVar.h(zb.c.f24027c))) {
                                }
                                oVar2.D(oVar.f18482a, oVar.b);
                                oVar2.F(i16);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    m6.a.c(oVar2);
                                    if (oVar2.a() >= 5 && "::cue".equals(oVar2.r(5, zb.c.f24027c))) {
                                        int i17 = oVar2.b;
                                        String strB = m6.a.b(oVar2, sb2);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            oVar2.F(i17);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i18 = oVar2.b;
                                                int i19 = oVar2.f18483c;
                                                int i20 = z11 ? 1 : 0;
                                                while (i18 < i19 && i20 == 0) {
                                                    int i21 = i18 + 1;
                                                    i20 = ((char) oVar2.f18482a[i18]) == ')' ? i15 : z11 ? 1 : 0;
                                                    i18 = i21;
                                                }
                                                strTrim = oVar2.r((i18 - 1) - oVar2.b, zb.c.f24027c).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(m6.a.b(oVar2, sb2))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(m6.a.b(oVar2, sb2))) {
                                        m6.b bVar = new m6.b();
                                        bVar.f10504a = "";
                                        bVar.b = "";
                                        bVar.f10505c = Collections.EMPTY_SET;
                                        bVar.f10506d = "";
                                        bVar.f10507e = str;
                                        bVar.f10509g = z11;
                                        bVar.f10511i = z11;
                                        bVar.f10512j = i13;
                                        bVar.f10513k = i13;
                                        bVar.l = i13;
                                        bVar.f10514m = i13;
                                        bVar.f10515n = i13;
                                        bVar.f10517p = i13;
                                        bVar.f10518q = z11;
                                        if (!"".equals(strTrim)) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i13) {
                                                Matcher matcher2 = m6.a.f10501c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i15);
                                                    strGroup2.getClass();
                                                    bVar.f10506d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z11 ? 1 : 0, iIndexOf);
                                            }
                                            int i22 = v.f18493a;
                                            String[] strArrSplit = strTrim.split("\\.", i13);
                                            String str2 = strArrSplit[z11 ? 1 : 0];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i13) {
                                                bVar.b = str2.substring(z11 ? 1 : 0, iIndexOf2);
                                                bVar.f10504a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                bVar.b = str2;
                                            }
                                            if (strArrSplit.length > i15) {
                                                int length = strArrSplit.length;
                                                r4.a.e(length <= strArrSplit.length ? i15 : z11 ? 1 : 0);
                                                bVar.f10505c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i15, length)));
                                            }
                                        }
                                        ?? r9 = z11 ? 1 : 0;
                                        String strB2 = null;
                                        while (r9 == 0) {
                                            int i23 = oVar2.b;
                                            strB2 = m6.a.b(oVar2, sb2);
                                            ?? r14 = (strB2 == null || "}".equals(strB2)) ? i15 : z11;
                                            if (r14 == 0) {
                                                oVar2.F(i23);
                                                m6.a.c(oVar2);
                                                String strA = m6.a.a(oVar2, sb2);
                                                if (!"".equals(strA) && Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(m6.a.b(oVar2, sb2))) {
                                                    m6.a.c(oVar2);
                                                    StringBuilder sb3 = new StringBuilder();
                                                    boolean z12 = false;
                                                    while (true) {
                                                        if (z12) {
                                                            string = sb3.toString();
                                                        } else {
                                                            int i24 = oVar2.b;
                                                            boolean z13 = z12;
                                                            String strB3 = m6.a.b(oVar2, sb2);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                oVar2.F(i24);
                                                                z12 = true;
                                                            } else {
                                                                sb3.append(strB3);
                                                                z12 = z13;
                                                            }
                                                        }
                                                    }
                                                    if (string == null || "".equals(string)) {
                                                        i11 = 1;
                                                    } else {
                                                        int i25 = oVar2.b;
                                                        String strB4 = m6.a.b(oVar2, sb2);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i12 = 1;
                                                                bVar.f10508f = r4.b.a(string, true);
                                                                bVar.f10509g = true;
                                                            } else {
                                                                i12 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f10510h = r4.b.a(string, true);
                                                                    bVar.f10511i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                        bVar.f10518q = z10;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i12 = 1;
                                                                            bVar.f10513k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.f10507e = b2.v(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i12 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                bVar.f10514m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = m6.a.f10502d.matcher(b2.v(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                m0.n.m();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i11);
                                                                                        strGroup3.getClass();
                                                                                        bVar.f10516o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                m0.n.m();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i11);
                                                                                        strGroup4.getClass();
                                                                                        bVar.f10516o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                m0.n.m();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i11);
                                                                                        strGroup5.getClass();
                                                                                        bVar.f10516o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        bVar.f10515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        bVar.f10515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        bVar.f10515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        m0.n.m();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i11);
                                                                                strGroup6.getClass();
                                                                                bVar.f10516o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                r4.a.v("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i12 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i11 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f10517p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f10517p = 2;
                                                                    i11 = 1;
                                                                } else {
                                                                    i11 = 1;
                                                                }
                                                            }
                                                            i11 = i12;
                                                        } else if ("}".equals(strB4)) {
                                                            oVar2.F(i25);
                                                            if ("color".equals(strA)) {
                                                                i12 = 1;
                                                                bVar.f10508f = r4.b.a(string, true);
                                                                bVar.f10509g = true;
                                                            } else {
                                                                i12 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    bVar.f10510h = r4.b.a(string, true);
                                                                    bVar.f10511i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                        bVar.f10518q = z10;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i12 = 1;
                                                                            bVar.f10513k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        bVar.f10507e = b2.v(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i12 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                bVar.f10514m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = m6.a.f10502d.matcher(b2.v(string));
                                                                            if (matcher.matches()) {
                                                                                r4.a.v("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                m0.n.m();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i11);
                                                                                        strGroup7.getClass();
                                                                                        bVar.f10516o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                m0.n.m();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i11);
                                                                                        strGroup8.getClass();
                                                                                        bVar.f10516o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i11 = 1;
                                                                                                bVar.f10515n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                m0.n.m();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i11);
                                                                                        strGroup9.getClass();
                                                                                        bVar.f10516o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        bVar.f10515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        bVar.f10515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        bVar.f10515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        m0.n.m();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i11);
                                                                                strGroup10.getClass();
                                                                                bVar.f10516o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i12 = 1;
                                                                        bVar.l = 1;
                                                                    }
                                                                    i11 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    bVar.f10517p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    bVar.f10517p = 2;
                                                                    i11 = 1;
                                                                } else {
                                                                    i11 = 1;
                                                                }
                                                            }
                                                            i11 = i12;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i11 = i15;
                                                }
                                            } else {
                                                i11 = i15;
                                            }
                                            i15 = i11;
                                            r9 = r14;
                                            z11 = false;
                                        }
                                        int i26 = i15;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(bVar);
                                        }
                                        i15 = i26;
                                        z11 = false;
                                        i13 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b10 == 3) {
                                Pattern pattern = m6.h.f10538a;
                                Charset charset = zb.c.f24027c;
                                String strH2 = oVar.h(charset);
                                if (strH2 == null) {
                                    cVarD = null;
                                } else {
                                    Pattern pattern2 = m6.h.f10538a;
                                    Matcher matcher3 = pattern2.matcher(strH2);
                                    if (matcher3.matches()) {
                                        cVarD = m6.h.d(null, matcher3, oVar, arrayList);
                                    } else {
                                        cVarD = null;
                                        String strH3 = oVar.h(charset);
                                        if (strH3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strH3);
                                            if (matcher4.matches()) {
                                                cVarD = m6.h.d(strH2.trim(), matcher4, oVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVarD != null) {
                                    arrayList2.add(cVarD);
                                }
                            }
                            rVar = this;
                        }
                    }
                }
            }
        } catch (f0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public /* synthetic */ r(Object obj, Object obj2) {
        this.f21065t = obj;
        this.f21066u = obj2;
    }
}
