package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class p implements n, Iterable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2860t;

    public p(String str) {
        if (str != null) {
            this.f2860t = str;
        } else {
            w4.d.j("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return new r(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String d() {
        return this.f2860t;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.valueOf(!this.f2860t.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f2860t.equals(((p) obj).f2860t);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        String str = this.f2860t;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f2860t.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(this, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n
    public final n m(String str, u7.i iVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        int i2;
        int i10;
        boolean zIsEmpty;
        int i11;
        u7.i iVar2;
        String str5 = "hasOwnProperty";
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                w4.d.j(str.concat(" is not a String function"));
                return null;
            }
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -1789698943:
                str5 = str5;
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(str5)) {
                    b = 0;
                }
                break;
            case -1776922004:
                str3 = "charAt";
                str4 = "toString";
                str5 = str5;
                if (str.equals(str4)) {
                    b = 1;
                }
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str5 = str5;
                    str4 = "toString";
                    b = 2;
                } else {
                    str4 = "toString";
                }
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    b = 3;
                }
                str4 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 4;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 5;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 6;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 7;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 8;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 9;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b = 10;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 11;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 12;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 13;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 14;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 15;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 16;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            default:
                str3 = "charAt";
                str4 = "toString";
                break;
        }
        String strD = "undefined";
        String str6 = str5;
        String str7 = this.f2860t;
        switch (b) {
            case 0:
                p0.f(1, arrayList, str6);
                n nVarM = ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0));
                if (!"length".equals(nVarM.d())) {
                    double dDoubleValue = nVarM.g().doubleValue();
                    if (dDoubleValue != Math.floor(dDoubleValue) || (i2 = (int) dDoubleValue) < 0 || i2 >= str7.length()) {
                        return n.f2832g;
                    }
                }
                return n.f2831f;
            case 1:
                p0.f(0, arrayList, str4);
                return this;
            case 2:
                p0.f(0, arrayList, "toLocaleLowerCase");
                return new p(str7.toLowerCase());
            case 3:
                p0.n(1, str3, arrayList);
                int iA = !arrayList.isEmpty() ? (int) p0.a(((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).g().doubleValue()) : 0;
                return (iA < 0 || iA >= str7.length()) ? n.f2833h : new p(String.valueOf(str7.charAt(iA)));
            case 4:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(str7);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sb2.append(((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(i12)).d());
                    }
                    return new p(sb2.toString());
                }
                return this;
            case 5:
                p0.f(0, arrayList, "toLowerCase");
                return new p(str7.toLowerCase(Locale.ENGLISH));
            case 6:
                p0.n(1, "search", arrayList);
                Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).d()).matcher(str7);
                return matcher.find() ? new g(Double.valueOf(matcher.start())) : new g(Double.valueOf(-1.0d));
            case 7:
                p0.f(0, arrayList, "toLocaleUpperCase");
                return new p(str7.toUpperCase());
            case 8:
                p0.n(2, "lastIndexOf", arrayList);
                strD = arrayList.size() > 0 ? ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).d() : "undefined";
                double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(1)).g().doubleValue();
                return new g(Double.valueOf(str7.lastIndexOf(strD, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : p0.a(dDoubleValue2)))));
            case 9:
                p0.f(0, arrayList, "toUpperCase");
                return new p(str7.toUpperCase(Locale.ENGLISH));
            case 10:
                p0.f(0, arrayList, "toUpperCase");
                return new p(str7.trim());
            case 11:
                p0.n(1, "match", arrayList);
                Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).d()).matcher(str7);
                return matcher2.find() ? new e(new p(matcher2.group())) : n.b;
            case 12:
                p0.n(2, "slice", arrayList);
                double dA = p0.a(!arrayList.isEmpty() ? ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).g().doubleValue() : 0.0d);
                int iMax = (int) (dA < 0.0d ? Math.max(((double) str7.length()) + dA, 0.0d) : Math.min(dA, str7.length()));
                double dA2 = p0.a(arrayList.size() > 1 ? ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(1)).g().doubleValue() : str7.length());
                return new p(str7.substring(iMax, Math.max(0, ((int) (dA2 < 0.0d ? Math.max(((double) str7.length()) + dA2, 0.0d) : Math.min(dA2, str7.length()))) - iMax) + iMax));
            case 13:
                p0.n(2, "split", arrayList);
                if (str7.length() == 0) {
                    return new e(this);
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String strD2 = ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).d();
                    long j10 = arrayList.size() > 1 ? ((long) p0.j(((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(1)).g().doubleValue())) & 4294967295L : 2147483647L;
                    if (j10 == 0) {
                        return new e();
                    }
                    String[] strArrSplit = str7.split(Pattern.quote(strD2), ((int) j10) + 1);
                    int length = strArrSplit.length;
                    if (!strD2.isEmpty() || strArrSplit.length <= 0) {
                        i10 = 0;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            i10 = zIsEmpty;
                            length = strArrSplit.length - 1;
                            i10 = zIsEmpty;
                        }
                    }
                    i10 = zIsEmpty;
                    if (strArrSplit.length > j10) {
                        length--;
                    }
                    while (i10 < length) {
                        arrayList2.add(new p(strArrSplit[i10]));
                        i10++;
                    }
                }
                return new e(arrayList2);
            case 14:
                p0.n(2, "substring", arrayList);
                int iA2 = !arrayList.isEmpty() ? (int) p0.a(((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).g().doubleValue()) : 0;
                int iA3 = arrayList.size() > 1 ? (int) p0.a(((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(1)).g().doubleValue()) : str7.length();
                int iMin = Math.min(Math.max(iA2, 0), str7.length());
                int iMin2 = Math.min(Math.max(iA3, 0), str7.length());
                return new p(str7.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                p0.n(2, "replace", arrayList);
                boolean zIsEmpty2 = arrayList.isEmpty();
                n nVarF = n.f2827a;
                if (!zIsEmpty2) {
                    strD = ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(0)).d();
                    if (arrayList.size() > 1) {
                        nVarF = ((u7.l) iVar.f21016u).m(iVar, (n) arrayList.get(1));
                    }
                }
                int iIndexOf = str7.indexOf(strD);
                if (iIndexOf >= 0) {
                    if (nVarF instanceof j) {
                        i11 = 0;
                        nVarF = ((j) nVarF).f(iVar, Arrays.asList(new p(strD), new g(Double.valueOf(iIndexOf)), this));
                    } else {
                        i11 = 0;
                    }
                    return new p(e4.w0.r(str7.substring(i11, iIndexOf), nVarF.d(), str7.substring(strD.length() + iIndexOf)));
                }
                return this;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                p0.n(2, "indexOf", arrayList);
                if (arrayList.size() <= 0) {
                    iVar2 = iVar;
                } else {
                    iVar2 = iVar;
                    strD = ((u7.l) iVar2.f21016u).m(iVar2, (n) arrayList.get(0)).d();
                }
                return new g(Double.valueOf(str7.indexOf(strD, (int) p0.a(arrayList.size() < 2 ? 0.0d : ((u7.l) iVar2.f21016u).m(iVar2, (n) arrayList.get(1)).g().doubleValue()))));
            default:
                w4.d.j("Command not supported");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n q() {
        return new p(this.f2860t);
    }

    public final String toString() {
        return t8.c.i("\"", this.f2860t, "\"");
    }
}
