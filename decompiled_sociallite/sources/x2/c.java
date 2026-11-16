package x2;

import a3.j;
import a3.p;
import a3.q;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import e0.m;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.jvm.internal.l;
import o1.b1;
import o1.r;
import o1.r0;
import o1.w;
import o1.w0;
import o1.x0;
import p2.e0;
import p2.n0;
import p2.t;
import p2.u;
import p2.x;
import p2.z;
import q2.n;
import qf.k;
import te.a0;
import u2.f0;
import u2.o;
import u2.s;
import v0.c2;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements t {
    public final CharSequence A;
    public final n B;
    public mc.c C;
    public final boolean D;
    public final int E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f22918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n0 f22919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f22920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f22921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u2.h f22922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b3.b f22923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f22924z;

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:201:0x03de  */
    /* JADX WARN: Code duplicated, block: B:212:0x0417  */
    /* JADX WARN: Code duplicated, block: B:213:0x0421  */
    /* JADX WARN: Code duplicated, block: B:215:0x042c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0433  */
    /* JADX WARN: Code duplicated, block: B:219:0x0443  */
    /* JADX WARN: Code duplicated, block: B:220:0x0448  */
    /* JADX WARN: Code duplicated, block: B:222:0x0453  */
    /* JADX WARN: Code duplicated, block: B:223:0x045a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0488  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:249:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:255:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:258:0x050a  */
    /* JADX WARN: Code duplicated, block: B:260:0x0510  */
    /* JADX WARN: Code duplicated, block: B:263:0x051e  */
    /* JADX WARN: Code duplicated, block: B:265:0x053f  */
    /* JADX WARN: Code duplicated, block: B:267:0x054a A[LOOP:6: B:266:0x0548->B:267:0x054a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x055c A[LOOP:7: B:269:0x055a->B:270:0x055c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:273:0x057e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0583  */
    /* JADX WARN: Code duplicated, block: B:277:0x058e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0596  */
    /* JADX WARN: Code duplicated, block: B:280:0x059f  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:293:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:298:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:305:0x0617  */
    /* JADX WARN: Code duplicated, block: B:362:0x0745  */
    /* JADX WARN: Code duplicated, block: B:364:0x074c  */
    /* JADX WARN: Code duplicated, block: B:371:0x076a  */
    /* JADX WARN: Code duplicated, block: B:384:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:386:0x07cc A[LOOP:5: B:385:0x07ca->B:386:0x07cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:389:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:390:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:392:0x0806  */
    /* JADX WARN: Code duplicated, block: B:393:0x0809  */
    /* JADX WARN: Code duplicated, block: B:396:0x081e  */
    /* JADX WARN: Code duplicated, block: B:397:0x0821  */
    /* JADX WARN: Code duplicated, block: B:399:0x0827  */
    /* JADX WARN: Code duplicated, block: B:400:0x082a  */
    /* JADX WARN: Code duplicated, block: B:405:0x0857  */
    /* JADX WARN: Instruction removed from duplicated block: B:384:0x07b4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.List] */
    public c(String str, n0 n0Var, List list, List list2, u2.h hVar, b3.b bVar) throws Throwable {
        Locale locale;
        int i2;
        Typeface typeface;
        long j10;
        ?? arrayList;
        CharSequence charSequenceF;
        int i10;
        p pVar;
        ArrayList arrayList2;
        int size;
        int i11;
        e0 e0Var;
        u2.i iVar;
        boolean z10;
        e0 e0Var2;
        m mVar;
        int size2;
        int i12;
        Integer[] numArr;
        int i13;
        int size3;
        int i14;
        Integer[] numArr2;
        int iIntValue;
        int i15;
        Integer num;
        int iIntValue2;
        int size4;
        e0 e0Var3;
        e0 e0VarC;
        int i16;
        ArrayList arrayList3;
        Integer[] numArr3;
        int i17;
        int i18;
        int size5;
        boolean z11;
        int i19;
        b3.b bVar2;
        int size6;
        int i20;
        int i21;
        long jB;
        long j11;
        int i22;
        long jB2;
        int i23;
        int size7;
        int i24;
        int i25;
        int i26;
        int i27;
        b3.b bVar3;
        int i28;
        int i29;
        Object obj;
        e0 e0Var4;
        boolean z12;
        long j12;
        long j13;
        int i30;
        long jB3;
        float fC;
        long jB4;
        float fC2;
        x xVar;
        this.f22918t = str;
        this.f22919u = n0Var;
        this.f22920v = list;
        this.f22921w = list2;
        this.f22922x = hVar;
        this.f22923y = bVar;
        float fB = bVar.b();
        d dVar = new d(1);
        ((TextPaint) dVar).density = fB;
        dVar.b = j.b;
        dVar.f22926c = 3;
        dVar.f22927d = x0.f15771d;
        this.f22924z = dVar;
        z zVar = n0Var.f16597c;
        e0 e0Var5 = n0Var.f16596a;
        u uVar = n0Var.b;
        r6.c cVar = g.f22934a;
        r6.c cVar2 = g.f22934a;
        c2 c2VarJ = (c2) cVar2.f18522t;
        if (c2VarJ == null) {
            if (z3.i.c()) {
                c2VarJ = cVar2.j();
                cVar2.f18522t = c2VarJ;
            } else {
                c2VarJ = h.f22935a;
            }
        }
        this.D = ((Boolean) c2VarJ.getValue()).booleanValue();
        int i31 = uVar.b;
        w2.b bVar4 = e0Var5.f16542k;
        int i32 = 2;
        if (i31 == 4) {
            i2 = 2;
        } else if (i31 == 5) {
            i2 = 3;
        } else if (i31 == 1) {
            i2 = 0;
        } else if (i31 == 2) {
            i2 = 1;
        } else {
            if (i31 != 3 && i31 != Integer.MIN_VALUE) {
                w4.d.l("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar4 == null || (locale = ((w2.a) bVar4.f22568t.get(0)).f22566a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        }
        this.E = i2;
        c0.i iVar2 = new c0.i(this, i32);
        q qVar = uVar.f16628i;
        qVar = qVar == null ? q.f196c : qVar;
        dVar.setFlags(qVar.b ? dVar.getFlags() | 128 : dVar.getFlags() & (-129));
        int i33 = qVar.f198a;
        if (i33 == 1) {
            dVar.setFlags(dVar.getFlags() | 64);
            dVar.setHinting(0);
        } else if (i33 == 2) {
            dVar.getFlags();
            dVar.setHinting(1);
        } else if (i33 == 3) {
            dVar.getFlags();
            dVar.setHinting(0);
        } else {
            dVar.getFlags();
        }
        boolean zIsEmpty = list.isEmpty();
        long j14 = e0Var5.b;
        s sVar = e0Var5.f16534c;
        o oVar = e0Var5.f16535d;
        String str2 = e0Var5.f16538g;
        w2.b bVar5 = e0Var5.f16542k;
        a3.n nVar = e0Var5.f16533a;
        a3.o oVar2 = e0Var5.f16541j;
        long j15 = e0Var5.f16539h;
        long jB5 = b3.m.b(j14);
        if (b3.n.a(jB5, 4294967296L)) {
            dVar.setTextSize(bVar.y0(j14));
        } else if (b3.n.a(jB5, 8589934592L)) {
            dVar.setTextSize(b3.m.c(j14) * dVar.getTextSize());
        }
        u2.i iVar3 = e0Var5.f16537f;
        if (iVar3 != null || oVar != null || sVar != null) {
            s sVar2 = sVar == null ? s.f20819y : sVar;
            int i34 = oVar != null ? oVar.f20812a : 0;
            u2.p pVar2 = e0Var5.f16536e;
            f0 f0VarB = ((u2.j) hVar).b(iVar3, sVar2, i34, pVar2 != null ? pVar2.f20813a : 1);
            if (f0VarB instanceof u2.e0) {
                Object obj2 = ((u2.e0) f0VarB).f20797t;
                obj2.getClass();
                typeface = (Typeface) obj2;
            } else {
                mc.c cVar3 = new mc.c(f0VarB, this.C);
                this.C = cVar3;
                Object obj3 = cVar3.f10636w;
                obj3.getClass();
                typeface = (Typeface) obj3;
            }
            dVar.setTypeface(typeface);
        }
        y2.a aVar = y2.a.f23606a;
        if (bVar5 != null) {
            w2.b bVar6 = w2.b.f22567v;
            if (!bVar5.equals(a0.m())) {
                aVar.b(dVar, bVar5);
            }
        }
        if (str2 != null && !str2.equals("")) {
            dVar.setFontFeatureSettings(str2);
        }
        if (oVar2 != null && !oVar2.equals(a3.o.f192c)) {
            dVar.setTextScaleX(dVar.getTextScaleX() * oVar2.f193a);
            dVar.setTextSkewX(dVar.getTextSkewX() + oVar2.b);
        }
        dVar.d(nVar.b());
        dVar.c(nVar.c(), 9205357640488583168L, nVar.a());
        dVar.f(e0Var5.f16544n);
        dVar.g(e0Var5.f16543m);
        dVar.e(e0Var5.f16546p);
        if (!b3.n.a(b3.m.b(j15), 4294967296L) || b3.m.c(j15) == 0.0f) {
            j10 = j15;
            if (b3.n.a(b3.m.b(j10), 8589934592L)) {
                dVar.setLetterSpacing(b3.m.c(j10));
            }
        } else {
            float textScaleX = dVar.getTextScaleX() * dVar.getTextSize();
            j10 = j15;
            float fY0 = bVar.y0(j10);
            if (textScaleX != 0.0f) {
                dVar.setLetterSpacing(fY0 / textScaleX);
            }
        }
        long j16 = e0Var5.l;
        a3.a aVar2 = e0Var5.f16540i;
        boolean z13 = (zIsEmpty || !b3.n.a(b3.m.b(j10), 4294967296L) || b3.m.c(j10) == 0.0f) ? false : true;
        long j17 = w.f15766i;
        boolean z14 = (w.d(j16, j17) || w.d(j16, w.f15765h)) ? false : true;
        boolean z15 = (aVar2 == null || Float.compare(aVar2.f172a, 0.0f) == 0) ? false : true;
        e0 e0Var6 = (z13 || z14 || z15) ? new e0(0L, 0L, (s) null, (o) null, (u2.p) null, (u2.i) null, (String) null, z13 ? j10 : b3.m.f1616c, z15 ? aVar2 : null, (a3.o) null, (w2.b) null, z14 ? j16 : j17, (j) null, (x0) null, 63103) : null;
        if (e0Var6 != null) {
            int size8 = list.size() + 1;
            arrayList = new ArrayList(size8);
            int i35 = 0;
            while (i35 < size8) {
                arrayList.add(i35 == 0 ? new p2.d(0, this.f22918t.length(), e0Var6) : (p2.d) this.f22920v.get(i35 - 1));
                i35++;
            }
        } else {
            arrayList = list;
        }
        String str3 = this.f22918t;
        float textSize = this.f22924z.getTextSize();
        n0 n0Var2 = this.f22919u;
        List list3 = this.f22921w;
        b3.b bVar7 = this.f22923y;
        boolean z16 = this.D;
        a aVar3 = b.f22917a;
        if (z16 && z3.i.c()) {
            z zVar2 = n0Var2.f16597c;
            if (zVar2 != null) {
                x xVar2 = zVar2.b;
            }
            charSequenceF = z3.i.a().f(str3, 0, str3.length(), 0);
            charSequenceF.getClass();
        } else {
            charSequenceF = str3;
        }
        if (!arrayList.isEmpty() || !list3.isEmpty() || !l.a(n0Var2.b.f16623d, p.f194c) || !bb.a.Z(n0Var2.b.f16622c)) {
            Spannable spannableString = charSequenceF instanceof Spannable ? (Spannable) charSequenceF : new SpannableString(charSequenceF);
            e0 e0Var7 = n0Var2.f16596a;
            u uVar2 = n0Var2.b;
            if (l.a(e0Var7.f16543m, j.f185c)) {
                spannableString.setSpan(b.f22917a, 0, str3.length(), 33);
            }
            z zVar3 = n0Var2.f16597c;
            if (((zVar3 == null || (xVar = zVar3.b) == null) ? false : xVar.f16631a) && uVar2.f16625f == null) {
                float fD = u8.g.D(uVar2.f16622c, textSize, bVar7);
                if (!Float.isNaN(fD)) {
                    spannableString.setSpan(new s2.g(fD), 0, spannableString.length(), 33);
                }
            } else {
                a3.g gVar = uVar2.f16625f;
                gVar = gVar == null ? a3.g.f179c : gVar;
                float fD2 = u8.g.D(uVar2.f16622c, textSize, bVar7);
                if (!Float.isNaN(fD2)) {
                    int length = (spannableString.length() == 0 || k.H0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i36 = gVar.b;
                    i10 = 0;
                    spannableString.setSpan(new s2.h(fD2, length, (i36 & 1) > 0, (i36 & 16) > 0, gVar.f180a), 0, spannableString.length(), 33);
                }
                pVar = uVar2.f16623d;
                if (pVar != null) {
                    j12 = pVar.b;
                    j13 = pVar.f195a;
                    i30 = i10;
                    if ((b3.m.a(j13, bb.a.T(i30)) || !b3.m.a(j12, bb.a.T(i30))) && !bb.a.Z(j13) && !bb.a.Z(j12)) {
                        jB3 = b3.m.b(j13);
                        if (b3.n.a(jB3, 4294967296L)) {
                            fC = bVar7.y0(j13);
                        } else if (b3.n.a(jB3, 8589934592L)) {
                            fC = b3.m.c(j13) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB4 = b3.m.b(j12);
                        if (b3.n.a(jB4, 4294967296L)) {
                            fC2 = bVar7.y0(j12);
                        } else if (b3.n.a(jB4, 8589934592L)) {
                            fC2 = b3.m.c(j12) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                for (i11 = 0; i11 < size; i11++) {
                    obj = arrayList.get(i11);
                    Object obj4 = ((p2.d) obj).f16512a;
                    e0Var4 = (e0) obj4;
                    if (e0Var4.f16537f != null && e0Var4.f16535d == null && e0Var4.f16534c == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12 || ((e0) obj4).f16536e != null) {
                        arrayList2.add(obj);
                    }
                }
                e0Var = n0Var2.f16596a;
                iVar = e0Var.f16537f;
                if (iVar != null && e0Var.f16535d == null && e0Var.f16534c == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && e0Var.f16536e == null) {
                    e0Var2 = null;
                } else {
                    e0Var2 = new e0(0L, 0L, e0Var.f16534c, e0Var.f16535d, e0Var.f16536e, iVar, (String) null, 0L, (a3.a) null, (a3.o) null, (w2.b) null, 0L, (j) null, (x0) null, 65475);
                }
                mVar = new m(spannableString, 7, iVar2);
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i12 = size2 * 2;
                    numArr = new Integer[i12];
                    for (i13 = 0; i13 < i12; i13++) {
                        numArr[i13] = 0;
                    }
                    size3 = arrayList2.size();
                    for (i14 = 0; i14 < size3; i14++) {
                        p2.d dVar2 = (p2.d) arrayList2.get(i14);
                        numArr[i14] = Integer.valueOf(dVar2.b);
                        numArr[i14 + size2] = Integer.valueOf(dVar2.f16513c);
                    }
                    numArr2 = numArr;
                    if (numArr2.length > 1) {
                        Arrays.sort(numArr2);
                    }
                    if (i12 != 0) {
                        p1.n.o("Array is empty.");
                        throw null;
                    }
                    iIntValue = numArr[0].intValue();
                    i15 = 0;
                    while (i15 < i12) {
                        num = numArr[i15];
                        iIntValue2 = num.intValue();
                        if (iIntValue2 == iIntValue) {
                            arrayList3 = arrayList2;
                            e0Var3 = e0Var2;
                            numArr3 = numArr;
                        } else {
                            size4 = arrayList2.size();
                            e0Var3 = e0Var2;
                            e0VarC = e0Var3;
                            i16 = 0;
                            while (i16 < size4) {
                                ArrayList arrayList4 = arrayList2;
                                p2.d dVar3 = (p2.d) arrayList2.get(i16);
                                int i37 = i16;
                                i17 = dVar3.b;
                                Integer[] numArr4 = numArr;
                                i18 = dVar3.f16513c;
                                if (i17 == i18 && p2.g.c(iIntValue, iIntValue2, i17, i18)) {
                                    e0 e0Var8 = (e0) dVar3.f16512a;
                                    e0VarC = e0VarC != null ? e0VarC.c(e0Var8) : e0Var8;
                                }
                                i16 = i37 + 1;
                                arrayList2 = arrayList4;
                                numArr = numArr4;
                            }
                            arrayList3 = arrayList2;
                            numArr3 = numArr;
                            if (e0VarC != null) {
                                mVar.invoke(e0VarC, Integer.valueOf(iIntValue), num);
                            }
                            iIntValue = iIntValue2;
                        }
                        i15++;
                        e0Var2 = e0Var3;
                        i12 = i12;
                        arrayList2 = arrayList3;
                        numArr = numArr3;
                    }
                } else if (!arrayList2.isEmpty()) {
                    e0 e0Var9 = (e0) ((p2.d) arrayList2.get(0)).f16512a;
                    mVar.invoke(e0Var2 != null ? e0Var2.c(e0Var9) : e0Var9, Integer.valueOf(((p2.d) arrayList2.get(0)).b), Integer.valueOf(((p2.d) arrayList2.get(0)).f16513c));
                }
                size5 = arrayList.size();
                z11 = false;
                i19 = 0;
                while (i19 < size5) {
                    p2.d dVar4 = (p2.d) arrayList.get(i19);
                    i27 = dVar4.b;
                    Object obj5 = dVar4.f16512a;
                    int i38 = dVar4.f16513c;
                    if (i27 >= 0 || i27 >= spannableString.length() || i38 <= i27 || i38 > spannableString.length()) {
                        size5 = size5;
                        z11 = z11;
                        bVar3 = bVar7;
                    } else {
                        int i39 = dVar4.b;
                        int i40 = dVar4.f16513c;
                        e0 e0Var10 = (e0) obj5;
                        a3.a aVar4 = e0Var10.f16540i;
                        long j18 = e0Var10.f16539h;
                        a3.n nVar2 = e0Var10.f16533a;
                        if (aVar4 != null) {
                            spannableString.setSpan(new s2.a(0, aVar4.f172a), i39, i40, 33);
                        }
                        u8.g.F(spannableString, nVar2.b(), i39, i40);
                        r rVarC = nVar2.c();
                        float fA = nVar2.a();
                        if (rVarC != null) {
                            if (rVarC instanceof b1) {
                                u8.g.F(spannableString, ((b1) rVarC).f15704a, i39, i40);
                            } else {
                                spannableString.setSpan(new z2.b((w0) rVarC, fA), i39, i40, 33);
                            }
                        }
                        j jVar = e0Var10.f16543m;
                        if (jVar != null) {
                            int i41 = jVar.f187a;
                            i28 = 33;
                            spannableString.setSpan(new s2.k((i41 | 1) == i41, (i41 | 2) == i41), i39, i40, 33);
                        } else {
                            i28 = 33;
                        }
                        u8.g.G(spannableString, e0Var10.b, bVar7, i39, i40);
                        String str4 = e0Var10.f16538g;
                        if (str4 != null) {
                            spannableString.setSpan(new s2.b(str4, 0), i39, i40, i28);
                        }
                        a3.o oVar3 = e0Var10.f16541j;
                        if (oVar3 != null) {
                            spannableString.setSpan(new ScaleXSpan(oVar3.f193a), i39, i40, i28);
                            spannableString.setSpan(new s2.a(1, oVar3.b), i39, i40, i28);
                        }
                        w2.b bVar8 = e0Var10.f16542k;
                        if (bVar8 != null) {
                            spannableString.setSpan(aVar.a(bVar8), i39, i40, i28);
                        }
                        bVar3 = bVar7;
                        long j19 = e0Var10.l;
                        if (j19 != 16) {
                            spannableString.setSpan(new BackgroundColorSpan(r0.E(j19)), i39, i40, i28);
                        }
                        x0 x0Var = e0Var10.f16544n;
                        if (x0Var != null) {
                            long j20 = x0Var.b;
                            int iE = r0.E(x0Var.f15772a);
                            float f10 = n1.c.f(j20);
                            float fG = n1.c.g(j20);
                            float f11 = x0Var.f15773c;
                            s2.j jVar2 = new s2.j(f10, fG, f11 == 0.0f ? Float.MIN_VALUE : f11, iE);
                            i29 = 33;
                            spannableString.setSpan(jVar2, i39, i40, 33);
                        } else {
                            i29 = i28;
                        }
                        q1.e eVar = e0Var10.f16546p;
                        if (eVar != null) {
                            spannableString.setSpan(new z2.a(eVar), i39, i40, i29);
                        }
                        z11 = (b3.n.a(b3.m.b(r1), 4294967296L) || b3.n.a(b3.m.b(j18), 8589934592L)) ? true : z11;
                        i19++;
                        size5 = size5;
                        bVar7 = bVar3;
                    }
                    z11 = z11;
                    i19++;
                    size5 = size5;
                    bVar7 = bVar3;
                }
                bVar2 = bVar7;
                if (z11) {
                    size7 = arrayList.size();
                    i24 = 0;
                    while (i24 < size7) {
                        p2.d dVar5 = (p2.d) arrayList.get(i24);
                        i25 = dVar5.b;
                        int i42 = dVar5.f16513c;
                        e0 e0Var11 = (e0) dVar5.f16512a;
                        if (i25 >= 0 || i25 >= spannableString.length() || i42 <= i25 || i42 > spannableString.length()) {
                            i26 = size7;
                        } else {
                            long j21 = e0Var11.f16539h;
                            long jB6 = b3.m.b(j21);
                            i26 = size7;
                            Object fVar = b3.n.a(jB6, 4294967296L) ? new s2.f(bVar2.y0(j21)) : b3.n.a(jB6, 8589934592L) ? new s2.e(b3.m.c(j21)) : null;
                            if (fVar != null) {
                                spannableString.setSpan(fVar, i25, i42, 33);
                            }
                        }
                        i24++;
                        size7 = i26;
                    }
                }
                size6 = list3.size();
                i20 = 0;
                while (i20 < size6) {
                    p2.d dVar6 = (p2.d) list3.get(i20);
                    p2.w wVar = (p2.w) dVar6.f16512a;
                    int i43 = dVar6.b;
                    int i44 = dVar6.f16513c;
                    for (Object obj6 : spannableString.getSpans(i43, i44, v.class)) {
                        spannableString.removeSpan((v) obj6);
                    }
                    long j22 = wVar.f16630a;
                    long j23 = wVar.b;
                    float fC3 = b3.m.c(j22);
                    jB = b3.m.b(wVar.f16630a);
                    b3.b bVar9 = bVar2;
                    List list4 = list3;
                    if (b3.n.a(jB, 4294967296L)) {
                        j11 = 8589934592L;
                        i22 = 0;
                    } else {
                        j11 = 8589934592L;
                        if (b3.n.a(jB, 8589934592L)) {
                            i22 = 1;
                        } else {
                            i22 = 2;
                        }
                    }
                    float fC4 = b3.m.c(j23);
                    jB2 = b3.m.b(j23);
                    if (b3.n.a(jB2, 4294967296L)) {
                        i23 = 0;
                    } else if (b3.n.a(jB2, j11)) {
                        i23 = 1;
                    } else {
                        i23 = 2;
                    }
                    spannableString.setSpan(new s2.i(fC3, i22, fC4, i23, bVar9.b() * bVar9.a0(), 6), i43, i44, 33);
                    i20++;
                    list3 = list4;
                    bVar2 = bVar9;
                }
                charSequenceF = spannableString;
            }
            i10 = 0;
            pVar = uVar2.f16623d;
            if (pVar != null) {
                j12 = pVar.b;
                j13 = pVar.f195a;
                i30 = i10;
                if (b3.m.a(j13, bb.a.T(i30))) {
                    jB3 = b3.m.b(j13);
                    if (b3.n.a(jB3, 4294967296L)) {
                        fC = bVar7.y0(j13);
                    } else if (b3.n.a(jB3, 8589934592L)) {
                        fC = b3.m.c(j13) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB4 = b3.m.b(j12);
                    if (b3.n.a(jB4, 4294967296L)) {
                        fC2 = bVar7.y0(j12);
                    } else if (b3.n.a(jB4, 8589934592L)) {
                        fC2 = b3.m.c(j12) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB3 = b3.m.b(j13);
                    if (b3.n.a(jB3, 4294967296L)) {
                        fC = bVar7.y0(j13);
                    } else if (b3.n.a(jB3, 8589934592L)) {
                        fC = b3.m.c(j13) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB4 = b3.m.b(j12);
                    if (b3.n.a(jB4, 4294967296L)) {
                        fC2 = bVar7.y0(j12);
                    } else if (b3.n.a(jB4, 8589934592L)) {
                        fC2 = b3.m.c(j12) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            }
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            while (i11 < size) {
                obj = arrayList.get(i11);
                Object obj7 = ((p2.d) obj).f16512a;
                e0Var4 = (e0) obj7;
                if (e0Var4.f16537f != null) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (z12) {
                    arrayList2.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            e0Var = n0Var2.f16596a;
            iVar = e0Var.f16537f;
            if (iVar != null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (z10) {
                e0Var2 = new e0(0L, 0L, e0Var.f16534c, e0Var.f16535d, e0Var.f16536e, iVar, (String) null, 0L, (a3.a) null, (a3.o) null, (w2.b) null, 0L, (j) null, (x0) null, 65475);
            } else {
                e0Var2 = new e0(0L, 0L, e0Var.f16534c, e0Var.f16535d, e0Var.f16536e, iVar, (String) null, 0L, (a3.a) null, (a3.o) null, (w2.b) null, 0L, (j) null, (x0) null, 65475);
            }
            mVar = new m(spannableString, 7, iVar2);
            if (arrayList2.size() <= 1) {
                size2 = arrayList2.size();
                i12 = size2 * 2;
                numArr = new Integer[i12];
                while (i13 < i12) {
                    numArr[i13] = 0;
                }
                size3 = arrayList2.size();
                while (i14 < size3) {
                    p2.d dVar7 = (p2.d) arrayList2.get(i14);
                    numArr[i14] = Integer.valueOf(dVar7.b);
                    numArr[i14 + size2] = Integer.valueOf(dVar7.f16513c);
                }
                numArr2 = numArr;
                if (numArr2.length > 1) {
                    Arrays.sort(numArr2);
                }
                if (i12 != 0) {
                    p1.n.o("Array is empty.");
                    throw null;
                }
                iIntValue = numArr[0].intValue();
                i15 = 0;
                while (i15 < i12) {
                    num = numArr[i15];
                    iIntValue2 = num.intValue();
                    if (iIntValue2 == iIntValue) {
                        arrayList3 = arrayList2;
                        e0Var3 = e0Var2;
                        numArr3 = numArr;
                    } else {
                        size4 = arrayList2.size();
                        e0Var3 = e0Var2;
                        e0VarC = e0Var3;
                        i16 = 0;
                        while (i16 < size4) {
                            ArrayList arrayList5 = arrayList2;
                            p2.d dVar8 = (p2.d) arrayList2.get(i16);
                            int i310 = i16;
                            i17 = dVar8.b;
                            Integer[] numArr5 = numArr;
                            i18 = dVar8.f16513c;
                            if (i17 == i18) {
                            }
                            i16 = i310 + 1;
                            arrayList2 = arrayList5;
                            numArr = numArr5;
                        }
                        arrayList3 = arrayList2;
                        numArr3 = numArr;
                        if (e0VarC != null) {
                            mVar.invoke(e0VarC, Integer.valueOf(iIntValue), num);
                        }
                        iIntValue = iIntValue2;
                    }
                    i15++;
                    e0Var2 = e0Var3;
                    i12 = i12;
                    arrayList2 = arrayList3;
                    numArr = numArr3;
                }
            } else if (!arrayList2.isEmpty()) {
                e0 e0Var12 = (e0) ((p2.d) arrayList2.get(0)).f16512a;
                mVar.invoke(e0Var2 != null ? e0Var2.c(e0Var12) : e0Var12, Integer.valueOf(((p2.d) arrayList2.get(0)).b), Integer.valueOf(((p2.d) arrayList2.get(0)).f16513c));
            }
            size5 = arrayList.size();
            z11 = false;
            i19 = 0;
            while (i19 < size5) {
                p2.d dVar9 = (p2.d) arrayList.get(i19);
                i27 = dVar9.b;
                Object obj8 = dVar9.f16512a;
                int i311 = dVar9.f16513c;
                if (i27 >= 0) {
                    size5 = size5;
                    z11 = z11;
                    bVar3 = bVar7;
                    z11 = z11;
                } else {
                    size5 = size5;
                    z11 = z11;
                    bVar3 = bVar7;
                    z11 = z11;
                }
                i19++;
                size5 = size5;
                bVar7 = bVar3;
            }
            bVar2 = bVar7;
            if (z11) {
                size7 = arrayList.size();
                i24 = 0;
                while (i24 < size7) {
                    p2.d dVar10 = (p2.d) arrayList.get(i24);
                    i25 = dVar10.b;
                    int i45 = dVar10.f16513c;
                    e0 e0Var13 = (e0) dVar10.f16512a;
                    if (i25 >= 0) {
                        i26 = size7;
                    } else {
                        i26 = size7;
                    }
                    i24++;
                    size7 = i26;
                }
            }
            size6 = list3.size();
            i20 = 0;
            while (i20 < size6) {
                p2.d dVar11 = (p2.d) list3.get(i20);
                p2.w wVar2 = (p2.w) dVar11.f16512a;
                int i46 = dVar11.b;
                int i47 = dVar11.f16513c;
                while (i21 < r9) {
                    spannableString.removeSpan((v) obj6);
                }
                long j24 = wVar2.f16630a;
                long j25 = wVar2.b;
                float fC5 = b3.m.c(j24);
                jB = b3.m.b(wVar2.f16630a);
                b3.b bVar10 = bVar2;
                List list5 = list3;
                if (b3.n.a(jB, 4294967296L)) {
                    j11 = 8589934592L;
                    i22 = 0;
                } else {
                    j11 = 8589934592L;
                    if (b3.n.a(jB, 8589934592L)) {
                        i22 = 1;
                    } else {
                        i22 = 2;
                    }
                }
                float fC6 = b3.m.c(j25);
                jB2 = b3.m.b(j25);
                if (b3.n.a(jB2, 4294967296L)) {
                    i23 = 0;
                } else if (b3.n.a(jB2, j11)) {
                    i23 = 1;
                } else {
                    i23 = 2;
                }
                spannableString.setSpan(new s2.i(fC5, i22, fC6, i23, bVar10.b() * bVar10.a0(), 6), i46, i47, 33);
                i20++;
                list3 = list5;
                bVar2 = bVar10;
            }
            charSequenceF = spannableString;
        }
        this.A = charSequenceF;
        this.B = new n(charSequenceF, this.f22924z, this.E);
    }

    @Override // p2.t
    public final boolean b() {
        mc.c cVar = this.C;
        if (cVar != null ? cVar.n() : false) {
            return true;
        }
        if (!this.D) {
            z zVar = this.f22919u.f16597c;
            r6.c cVar2 = g.f22934a;
            r6.c cVar3 = g.f22934a;
            c2 c2VarJ = (c2) cVar3.f18522t;
            if (c2VarJ == null) {
                if (z3.i.c()) {
                    c2VarJ = cVar3.j();
                    cVar3.f18522t = c2VarJ;
                } else {
                    c2VarJ = h.f22935a;
                }
            }
            if (((Boolean) c2VarJ.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p2.t
    public final float d() {
        n nVar = this.B;
        if (!Float.isNaN(nVar.f17022e)) {
            return nVar.f17022e;
        }
        CharSequence charSequence = nVar.f17019a;
        TextPaint textPaint = nVar.b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new q2.k(charSequence, charSequence.length()));
        PriorityQueue<se.k> priorityQueue = new PriorityQueue(10, new e5.c(18));
        int i2 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new se.k(Integer.valueOf(i2), Integer.valueOf(next)));
            } else {
                se.k kVar = (se.k) priorityQueue.peek();
                if (kVar != null && ((Number) kVar.f19724u).intValue() - ((Number) kVar.f19723t).intValue() < next - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new se.k(Integer.valueOf(i2), Integer.valueOf(next)));
                }
            }
            i2 = next;
        }
        float fMax = 0.0f;
        for (se.k kVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) kVar2.f19723t).intValue(), ((Number) kVar2.f19724u).intValue(), textPaint));
        }
        nVar.f17022e = fMax;
        return fMax;
    }

    @Override // p2.t
    public final float j() {
        return this.B.b();
    }
}
