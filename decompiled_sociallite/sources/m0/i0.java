package m0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import h2.h1;
import h2.r2;
import h2.s2;
import h2.v0;
import i0.b2;
import i0.c2;
import i0.u0;
import i0.w1;
import i0.y0;
import java.util.ArrayList;
import java.util.List;
import o1.x0;
import v0.b1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f10293a;
    public v2.r b = c2.f7995a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hf.c f10294c = x.f10371w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f10295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f10296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2.g0 f10297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h1 f10298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r2 f10299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w1.a f10300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m1.n f10301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b1 f10302k;
    public final b1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f10304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b1 f10306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b1 f10307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v2.y f10309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2.e f10310t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g0 f10311u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final od.c f10312v;

    public i0(b2 b2Var) {
        this.f10293a = b2Var;
        v2.y yVar = new v2.y(7, (String) null, 0L);
        v0.p0 p0Var = v0.p0.f21675y;
        this.f10296e = v0.d.Q(yVar, p0Var);
        this.f10297f = v2.f0.f21823t;
        Boolean bool = Boolean.TRUE;
        this.f10302k = v0.d.Q(bool, p0Var);
        this.l = v0.d.Q(bool, p0Var);
        this.f10303m = 0L;
        this.f10305o = 0L;
        this.f10306p = v0.d.Q(null, p0Var);
        this.f10307q = v0.d.Q(null, p0Var);
        this.f10308r = -1;
        this.f10309s = new v2.y(7, (String) null, 0L);
        this.f10311u = new g0(this, 1);
        this.f10312v = new od.c(this, 27);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    public static final long a(i0 i0Var, v2.y yVar, long j10, boolean z10, boolean z11, n nVar, boolean z12) {
        w1 w1VarD;
        long j11;
        m mVar;
        m mVar2;
        boolean z13;
        w1.a aVar;
        l lVarJ;
        l lVar;
        l lVar2;
        m mVar3;
        y0 y0Var = i0Var.f10295d;
        if (y0Var == null || (w1VarD = y0Var.d()) == null) {
            return p2.m0.b;
        }
        v2.r rVar = i0Var.b;
        long j12 = yVar.b;
        p2.f fVar = yVar.f21847a;
        int i2 = p2.m0.f16588c;
        long jA = te.a0.a(rVar.d((int) (j12 >> 32)), i0Var.b.d((int) (j12 & 4294967295L)));
        int iB = w1VarD.b(false, j10);
        int i10 = (z11 || z10) ? iB : (int) (jA >> 32);
        int i11 = (!z11 || z10) ? iB : (int) (jA & 4294967295L);
        a2.e eVar = i0Var.f10310t;
        int i12 = -1;
        if (z10 || eVar == null) {
            j11 = 4294967295L;
        } else {
            j11 = 4294967295L;
            int i13 = i0Var.f10308r;
            if (i13 != -1) {
                i12 = i13;
            }
        }
        p2.j0 j0Var = w1VarD.f8225a;
        if (z10) {
            mVar = null;
        } else {
            int i14 = (int) (jA >> 32);
            int i15 = (int) (jA & j11);
            mVar = new m(new l(c.a.p(j0Var, i14), i14, 1L), new l(c.a.p(j0Var, i15), i15, 1L), p2.m0.f(jA));
        }
        a2.e eVar2 = new a2.e(z11, mVar, new be.a(i10, i11, i12, j0Var));
        if (mVar != null && eVar != null && z11 == eVar.b) {
            be.a aVar2 = (be.a) eVar.f89d;
            if (i10 == aVar2.b && i11 == aVar2.f1843c) {
                return j12;
            }
        }
        i0Var.f10310t = eVar2;
        i0Var.f10308r = iB;
        switch (nVar.f10326t) {
            case 0:
                be.a aVar3 = (be.a) eVar2.f89d;
                mVar2 = new m(aVar3.d(aVar3.b), aVar3.d(aVar3.f1843c), eVar2.e() == 1);
                break;
            case 1:
                mVar2 = android.support.v4.media.session.b.H(eVar2, o.f10330c);
                break;
            case 2:
                mVar2 = android.support.v4.media.session.b.H(eVar2, o.b);
                break;
            default:
                mVar2 = (m) eVar2.f88c;
                be.a aVar4 = (be.a) eVar2.f89d;
                if (mVar2 != null) {
                    l lVar3 = mVar2.b;
                    l lVar4 = mVar2.f10322a;
                    if (eVar2.b) {
                        lVarJ = android.support.v4.media.session.b.J(eVar2, aVar4, lVar4);
                        lVar2 = lVar3;
                        lVar3 = lVar4;
                        lVar = lVarJ;
                    } else {
                        lVarJ = android.support.v4.media.session.b.J(eVar2, aVar4, lVar3);
                        lVar = lVar4;
                        lVar2 = lVarJ;
                    }
                    if (!kotlin.jvm.internal.l.a(lVarJ, lVar3)) {
                        m mVar4 = new m(lVar, lVar2, eVar2.e() == 1 || (eVar2.e() == 3 && lVar.b > lVar2.b));
                        be.a aVar5 = (be.a) eVar2.f89d;
                        l lVar5 = mVar4.f10322a;
                        long j13 = lVar5.f10318c;
                        l lVar6 = mVar4.b;
                        if (j13 != lVar6.f10318c) {
                            boolean z14 = mVar4.f10323c;
                            if ((z14 ? lVar5 : lVar6).b == 0) {
                                if (((p2.j0) aVar5.f1845e).f16575a.f16566a.f16547t.length() == (z14 ? lVar6 : lVar5).b) {
                                    mVar3 = (m) eVar2.f88c;
                                    String str = ((p2.j0) aVar5.f1845e).f16575a.f16566a.f16547t;
                                    if (mVar3 == null) {
                                    }
                                }
                            }
                        } else if (lVar5.b == lVar6.b) {
                            mVar3 = (m) eVar2.f88c;
                            String str2 = ((p2.j0) aVar5.f1845e).f16575a.f16566a.f16547t;
                            if (mVar3 == null && str2.length() != 0) {
                                boolean z15 = eVar2.b;
                                String str3 = ((p2.j0) aVar5.f1845e).f16575a.f16566a.f16547t;
                                int i16 = aVar5.b;
                                int length = str3.length();
                                if (i16 == 0) {
                                    int iO = u0.o(0, str3);
                                    mVar2 = !z15 ? m.a(mVar4, null, android.support.v4.media.session.b.M(lVar6, aVar5, iO), false, 1) : m.a(mVar4, android.support.v4.media.session.b.M(lVar5, aVar5, iO), null, true, 2);
                                } else if (i16 != length) {
                                    boolean z16 = mVar3.f10323c;
                                    int iR = z15 ^ z16 ? u0.r(i16, str3) : u0.o(i16, str3);
                                    mVar2 = !z15 ? m.a(mVar4, null, android.support.v4.media.session.b.M(lVar6, aVar5, iR), z16, 1) : m.a(mVar4, android.support.v4.media.session.b.M(lVar5, aVar5, iR), null, z16, 2);
                                } else {
                                    int iR2 = u0.r(length, str3);
                                    mVar2 = !z15 ? m.a(mVar4, null, android.support.v4.media.session.b.M(lVar6, aVar5, iR2), true, 1) : m.a(mVar4, android.support.v4.media.session.b.M(lVar5, aVar5, iR2), null, false, 2);
                                }
                                break;
                            }
                        }
                        mVar2 = mVar4;
                    }
                } else {
                    mVar2 = android.support.v4.media.session.b.H(eVar2, o.f10330c);
                }
                break;
        }
        long jA2 = te.a0.a(i0Var.b.c(mVar2.f10322a.b), i0Var.b.c(mVar2.b.b));
        if (p2.m0.a(jA2, j12)) {
            return j12;
        }
        boolean z17 = p2.m0.f(jA2) != p2.m0.f(j12) && p2.m0.a(te.a0.a((int) (jA2 & j11), (int) (jA2 >> 32)), j12);
        boolean z18 = p2.m0.b(jA2) && p2.m0.b(j12);
        if (z12 && fVar.f16547t.length() > 0 && !z17 && !z18 && (aVar = i0Var.f10300i) != null) {
            ((w1.b) aVar).a(9);
        }
        i0Var.f10294c.invoke(c(fVar, jA2));
        if (!z12) {
            i0Var.p(!p2.m0.b(jA2));
        }
        y0 y0Var2 = i0Var.f10295d;
        if (y0Var2 != null) {
            y0Var2.f8261q.setValue(Boolean.valueOf(z12));
        }
        y0 y0Var3 = i0Var.f10295d;
        if (y0Var3 != null) {
            y0Var3.f8257m.setValue(Boolean.valueOf(!p2.m0.b(jA2) && db.h.w(i0Var, true)));
        }
        y0 y0Var4 = i0Var.f10295d;
        if (y0Var4 == null) {
            z13 = false;
        } else {
            z13 = false;
            y0Var4.f8258n.setValue(Boolean.valueOf(!p2.m0.b(jA2) && db.h.w(i0Var, false)));
        }
        y0 y0Var5 = i0Var.f10295d;
        if (y0Var5 == null) {
            return jA2;
        }
        if (p2.m0.b(jA2) && db.h.w(i0Var, true)) {
            z13 = true;
        }
        y0Var5.f8259o.setValue(Boolean.valueOf(z13));
        return jA2;
    }

    public static v2.y c(p2.f fVar, long j10) {
        return new v2.y(fVar, j10, (p2.m0) null);
    }

    public final void b(boolean z10) {
        if (p2.m0.b(j().b)) {
            return;
        }
        h1 h1Var = this.f10298g;
        if (h1Var != null) {
            ((h2.g) h1Var).a(xe.f.n(j()));
        }
        if (z10) {
            int iD = p2.m0.d(j().b);
            this.f10294c.invoke(c(j().f21847a, te.a0.a(iD, iD)));
            n(i0.m0.f8124t);
        }
    }

    public final void d() {
        if (p2.m0.b(j().b)) {
            return;
        }
        h1 h1Var = this.f10298g;
        if (h1Var != null) {
            ((h2.g) h1Var).a(xe.f.n(j()));
        }
        p2.f fVarQ = xe.f.q(j(), j().f21847a.f16547t.length());
        p2.f fVarP = xe.f.p(j(), j().f21847a.f16547t.length());
        p2.c cVar = new p2.c(fVarQ);
        cVar.c(fVarP);
        p2.f fVarG = cVar.g();
        int iE = p2.m0.e(j().b);
        this.f10294c.invoke(c(fVarG, te.a0.a(iE, iE)));
        n(i0.m0.f8124t);
        this.f10293a.f7980e = true;
    }

    public final void e(n1.c cVar) {
        if (!p2.m0.b(j().b)) {
            y0 y0Var = this.f10295d;
            w1 w1VarD = y0Var != null ? y0Var.d() : null;
            int iD = (cVar == null || w1VarD == null) ? p2.m0.d(j().b) : this.b.c(w1VarD.b(true, cVar.f15033a));
            this.f10294c.invoke(v2.y.a(j(), null, te.a0.a(iD, iD), 5));
        }
        n((cVar == null || j().f21847a.f16547t.length() <= 0) ? i0.m0.f8124t : i0.m0.f8126v);
        p(false);
    }

    public final void f(boolean z10) {
        m1.n nVar;
        y0 y0Var = this.f10295d;
        if (y0Var != null && !y0Var.b() && (nVar = this.f10301j) != null) {
            nVar.a(m1.h.f10391x);
        }
        this.f10309s = j();
        p(z10);
        n(i0.m0.f8125u);
    }

    public final n1.c g() {
        return (n1.c) this.f10307q.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final long i(boolean z10) {
        w1 w1VarD;
        long j10;
        y0 y0Var = this.f10295d;
        if (y0Var == null || (w1VarD = y0Var.d()) == null) {
            return 9205357640488583168L;
        }
        p2.j0 j0Var = w1VarD.f8225a;
        y0 y0Var2 = this.f10295d;
        p2.f fVar = y0Var2 != null ? y0Var2.f8247a.f8042a : null;
        if (fVar == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.l.a(fVar.f16547t, j0Var.f16575a.f16566a.f16547t)) {
            return 9205357640488583168L;
        }
        v2.y yVarJ = j();
        if (z10) {
            long j11 = yVarJ.b;
            int i2 = p2.m0.f16588c;
            j10 = j11 >> 32;
        } else {
            long j12 = yVarJ.b;
            int i10 = p2.m0.f16588c;
            j10 = j12 & 4294967295L;
        }
        int iD = this.b.d((int) j10);
        boolean zF = p2.m0.f(j().b);
        int iF = j0Var.f(iD);
        long j13 = j0Var.f16576c;
        p2.p pVar = j0Var.b;
        if (iF >= pVar.f16607f) {
            return 9205357640488583168L;
        }
        boolean z11 = j0Var.a(((!z10 || zF) && (z10 || !zF)) ? Math.max(iD + (-1), 0) : iD) == j0Var.j(iD);
        pVar.j(iD);
        int length = ((p2.f) pVar.f16603a.f5054t).f16547t.length();
        ArrayList arrayList = pVar.f16609h;
        p2.r rVar = (p2.r) arrayList.get(iD == length ? u7.f.s(arrayList) : rg.l.q(iD, arrayList));
        p2.a aVar = rVar.f16613a;
        int iB = rVar.b(iD);
        q2.z zVar = aVar.f16485d;
        return a.a.d(u8.l.i(z11 ? zVar.h(iB, false) : zVar.i(iB, false), 0.0f, (int) (j13 >> 32)), u8.l.i(pVar.b(iF), 0.0f, (int) (4294967295L & j13)));
    }

    public final v2.y j() {
        return (v2.y) this.f10296e.getValue();
    }

    public final void k() {
        r2 r2Var = this.f10299h;
        if ((r2Var != null ? ((v0) r2Var).f7633d : 0) != 1 || r2Var == null) {
            return;
        }
        v0 v0Var = (v0) r2Var;
        v0Var.f7633d = 2;
        ActionMode actionMode = v0Var.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        v0Var.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    public final void l() {
        int i2;
        Spanned spanned;
        char c10;
        int i10;
        h1 h1Var = this.f10298g;
        if (h1Var != null) {
            ClipData primaryClip = ((h2.g) h1Var).f7455a.getPrimaryClip();
            p2.f fVar = null;
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                fVar = null;
            } else {
                int i11 = 0;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt != null ? itemAt.getText() : null;
                if (text != null) {
                    char c11 = 6;
                    if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length = annotationArr.length - 1;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i12];
                                if (kotlin.jvm.internal.l.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel parcelObtain = Parcel.obtain();
                                    byte[] bArrDecode = Base64.decode(value, i11);
                                    parcelObtain.unmarshall(bArrDecode, i11, bArrDecode.length);
                                    parcelObtain.setDataPosition(i11);
                                    long j10 = o1.w.f15766i;
                                    long j11 = j10;
                                    long jC0 = b3.m.f1616c;
                                    long jC1 = jC0;
                                    u2.s sVar = null;
                                    u2.o oVar = null;
                                    u2.p pVar = null;
                                    String string = null;
                                    a3.a aVar = null;
                                    a3.o oVar2 = null;
                                    a3.j jVar = null;
                                    x0 x0Var = null;
                                    while (true) {
                                        if (parcelObtain.dataAvail() > 1) {
                                            byte b = parcelObtain.readByte();
                                            if (b != 1) {
                                                i2 = i11;
                                                spanned = spanned2;
                                                int i13 = 2;
                                                if (b != 2) {
                                                    i12 = i12;
                                                    if (b == 3) {
                                                        if (parcelObtain.dataAvail() < 4) {
                                                            c10 = 6;
                                                            break;
                                                        }
                                                        sVar = new u2.s(parcelObtain.readInt());
                                                        i11 = i2;
                                                        spanned2 = spanned;
                                                        i12 = i12;
                                                        c11 = 6;
                                                    } else if (b == 4) {
                                                        if (parcelObtain.dataAvail() < 1) {
                                                            c10 = 6;
                                                            break;
                                                        }
                                                        byte b10 = parcelObtain.readByte();
                                                        oVar = new u2.o((b10 != 0 && b10 == 1) ? 1 : i2);
                                                        i11 = i2;
                                                        spanned2 = spanned;
                                                        i12 = i12;
                                                        c11 = 6;
                                                    } else if (b != 5) {
                                                        c10 = 6;
                                                        if (b == 6) {
                                                            string = parcelObtain.readString();
                                                        } else if (b == 7) {
                                                            if (parcelObtain.dataAvail() < 5) {
                                                                break;
                                                            }
                                                            byte b11 = parcelObtain.readByte();
                                                            long j12 = b11 == 1 ? 4294967296L : b11 == 2 ? 8589934592L : 0L;
                                                            jC1 = b3.n.a(j12, 0L) ? b3.m.f1616c : bb.a.c0(parcelObtain.readFloat(), j12);
                                                        } else if (b == 8) {
                                                            if (parcelObtain.dataAvail() < 4) {
                                                                break;
                                                            } else {
                                                                aVar = new a3.a(parcelObtain.readFloat());
                                                            }
                                                        } else if (b == 9) {
                                                            if (parcelObtain.dataAvail() < 8) {
                                                                break;
                                                            } else {
                                                                oVar2 = new a3.o(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                            }
                                                        } else if (b == 10) {
                                                            if (parcelObtain.dataAvail() < 8) {
                                                                break;
                                                            }
                                                            j11 = parcelObtain.readLong();
                                                            int i14 = o1.w.f15767j;
                                                        } else if (b == 11) {
                                                            if (parcelObtain.dataAvail() < 4) {
                                                                break;
                                                            }
                                                            int i15 = parcelObtain.readInt();
                                                            int i16 = (i15 & 2) != 0 ? 1 : i2;
                                                            int i17 = (i15 & 1) != 0 ? 1 : i2;
                                                            a3.j jVar2 = a3.j.f186d;
                                                            a3.j jVar3 = a3.j.f185c;
                                                            if (i16 != 0 && i17 != 0) {
                                                                List listW = u7.f.w(jVar2, jVar3);
                                                                Integer numValueOf = Integer.valueOf(i2);
                                                                int size = listW.size();
                                                                for (int i18 = i2; i18 < size; i18++) {
                                                                    numValueOf = Integer.valueOf(numValueOf.intValue() | ((a3.j) listW.get(i18)).f187a);
                                                                }
                                                                jVar = new a3.j(numValueOf.intValue());
                                                            } else if (i16 != 0) {
                                                                jVar = jVar2;
                                                            } else {
                                                                jVar = i17 != 0 ? jVar3 : a3.j.b;
                                                            }
                                                        } else if (b == 12) {
                                                            if (parcelObtain.dataAvail() < 20) {
                                                                break;
                                                            }
                                                            long j13 = parcelObtain.readLong();
                                                            int i19 = o1.w.f15767j;
                                                            c11 = 6;
                                                            i11 = i2;
                                                            spanned2 = spanned;
                                                            i12 = i12;
                                                            x0Var = new x0(j13, a.a.d(parcelObtain.readFloat(), parcelObtain.readFloat()), parcelObtain.readFloat());
                                                        }
                                                        c11 = 6;
                                                        i11 = i2;
                                                        spanned2 = spanned;
                                                        i12 = i12;
                                                    } else {
                                                        if (parcelObtain.dataAvail() < 1) {
                                                            c10 = 6;
                                                            break;
                                                        }
                                                        byte b12 = parcelObtain.readByte();
                                                        if (b12 == 0) {
                                                            i13 = i2;
                                                        } else if (b12 == 1) {
                                                            i13 = 1;
                                                        } else if (b12 == 3) {
                                                            i13 = 3;
                                                        } else if (b12 != 2) {
                                                            i13 = i2;
                                                        }
                                                        pVar = new u2.p(i13);
                                                        i11 = i2;
                                                        spanned2 = spanned;
                                                        i12 = i12;
                                                        c11 = 6;
                                                    }
                                                } else {
                                                    if (parcelObtain.dataAvail() < 5) {
                                                        i12 = i12;
                                                        c10 = 6;
                                                        break;
                                                    }
                                                    byte b13 = parcelObtain.readByte();
                                                    long j14 = b13 == 1 ? 4294967296L : b13 == 2 ? 8589934592L : 0L;
                                                    jC0 = b3.n.a(j14, 0L) ? b3.m.f1616c : bb.a.c0(parcelObtain.readFloat(), j14);
                                                    i11 = i2;
                                                    spanned2 = spanned;
                                                    i12 = i12;
                                                    c11 = 6;
                                                }
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                j10 = parcelObtain.readLong();
                                                int i20 = o1.w.f15767j;
                                            }
                                        }
                                        i2 = i11;
                                        spanned = spanned2;
                                        c10 = c11;
                                        i12 = i12;
                                        break;
                                    }
                                    arrayList.add(new p2.d(spanStart, spanEnd, new p2.e0(j10, jC0, sVar, oVar, pVar, (u2.i) null, string, jC1, aVar, oVar2, (w2.b) null, j11, jVar, x0Var, 49152)));
                                    i10 = i12;
                                } else {
                                    i2 = i11;
                                    spanned = spanned2;
                                    c10 = c11;
                                    i10 = i12;
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i12 = i10 + 1;
                                c11 = c10;
                                i11 = i2;
                                spanned2 = spanned;
                            }
                        }
                        fVar = new p2.f(4, text.toString(), arrayList);
                    } else {
                        fVar = new p2.f(6, text.toString(), null);
                    }
                }
            }
            if (fVar == null) {
                return;
            }
            p2.c cVar = new p2.c(xe.f.q(j(), j().f21847a.f16547t.length()));
            cVar.c(fVar);
            p2.f fVarG = cVar.g();
            p2.f fVarP = xe.f.p(j(), j().f21847a.f16547t.length());
            p2.c cVar2 = new p2.c(fVarG);
            cVar2.c(fVarP);
            p2.f fVarG2 = cVar2.g();
            int length2 = fVar.f16547t.length() + p2.m0.e(j().b);
            this.f10294c.invoke(c(fVarG2, te.a0.a(length2, length2)));
            n(i0.m0.f8124t);
            this.f10293a.f7980e = true;
        }
    }

    public final void m() {
        v2.y yVarC = c(j().f21847a, te.a0.a(0, j().f21847a.f16547t.length()));
        this.f10294c.invoke(yVarC);
        this.f10309s = v2.y.a(this.f10309s, null, yVarC.b, 5);
        f(true);
    }

    public final void n(i0.m0 m0Var) {
        y0 y0Var = this.f10295d;
        if (y0Var != null) {
            if (y0Var.a() == m0Var) {
                y0Var = null;
            }
            if (y0Var != null) {
                y0Var.f8256k.setValue(m0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    public final void o() {
        i0.e0 e0Var;
        n1.d dVar;
        float fG;
        e2.r rVarC;
        e2.r rVarC2;
        e2.r rVarC3;
        e2.r rVarC4;
        h1 h1Var;
        if (h()) {
            y0 y0Var = this.f10295d;
            if (y0Var == null || ((Boolean) y0Var.f8261q.getValue()).booleanValue()) {
                boolean z10 = this.f10297f instanceof v2.s;
                i0.e0 e0Var2 = (p2.m0.b(j().b) || z10) ? null : new i0.e0(this, 4);
                boolean zB = p2.m0.b(j().b);
                b1 b1Var = this.f10302k;
                i0.e0 e0Var3 = (zB || !((Boolean) b1Var.getValue()).booleanValue() || z10) ? null : new i0.e0(this, 5);
                if (!((Boolean) b1Var.getValue()).booleanValue() || (h1Var = this.f10298g) == null) {
                    e0Var = null;
                } else {
                    ClipDescription primaryClipDescription = ((h2.g) h1Var).f7455a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        e0Var = new i0.e0(this, 6);
                    } else {
                        e0Var = null;
                    }
                }
                i0.e0 e0Var4 = p2.m0.c(j().b) != j().f21847a.f16547t.length() ? new i0.e0(this, 7) : null;
                r2 r2Var = this.f10299h;
                if (r2Var != null) {
                    y0 y0Var2 = this.f10295d;
                    if (y0Var2 == null) {
                        r2Var = r2Var;
                        dVar = n1.d.f15034e;
                    } else {
                        y0 y0Var3 = y0Var2.f8260p ? null : y0Var2;
                        if (y0Var3 != null) {
                            int iD = this.b.d((int) (j().b >> 32));
                            int iD2 = this.b.d((int) (j().b & 4294967295L));
                            y0 y0Var4 = this.f10295d;
                            long jG0 = 0;
                            long jG1 = (y0Var4 == null || (rVarC4 = y0Var4.c()) == null) ? 0L : rVarC4.g0(i(true));
                            y0 y0Var5 = this.f10295d;
                            if (y0Var5 != null && (rVarC3 = y0Var5.c()) != null) {
                                jG0 = rVarC3.g0(i(false));
                            }
                            y0 y0Var6 = this.f10295d;
                            float fG2 = 0.0f;
                            if (y0Var6 == null || (rVarC2 = y0Var6.c()) == null) {
                                fG = 0.0f;
                            } else {
                                w1 w1VarD = y0Var3.d();
                                fG = n1.c.g(rVarC2.g0(a.a.d(0.0f, w1VarD != null ? w1VarD.f8225a.c(iD).b : 0.0f)));
                            }
                            y0 y0Var7 = this.f10295d;
                            if (y0Var7 != null && (rVarC = y0Var7.c()) != null) {
                                w1 w1VarD2 = y0Var3.d();
                                fG2 = n1.c.g(rVarC.g0(a.a.d(0.0f, w1VarD2 != null ? w1VarD2.f8225a.c(iD2).b : 0.0f)));
                            }
                            dVar = new n1.d(Math.min(n1.c.f(jG1), n1.c.f(jG0)), Math.min(fG, fG2), Math.max(n1.c.f(jG1), n1.c.f(jG0)), (y0Var3.f8247a.f8047g.b() * 25) + Math.max(n1.c.g(jG1), n1.c.g(jG0)));
                        } else {
                            r2Var = r2Var;
                            dVar = n1.d.f15034e;
                        }
                    }
                    v0 v0Var = (v0) r2Var;
                    lc.p pVar = v0Var.f7632c;
                    pVar.f10129w = dVar;
                    pVar.f10130x = e0Var2;
                    pVar.f10132z = e0Var3;
                    pVar.f10131y = e0Var;
                    pVar.f10128v = e0Var4;
                    ActionMode actionMode = v0Var.b;
                    if (actionMode != null) {
                        actionMode.invalidate();
                    } else {
                        v0Var.f7633d = 1;
                        v0Var.b = s2.f7577a.b(v0Var.f7631a, new j2.a(pVar), 1);
                    }
                }
            }
        }
    }

    public final void p(boolean z10) {
        y0 y0Var = this.f10295d;
        if (y0Var != null) {
            y0Var.l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            o();
        } else {
            k();
        }
    }
}
