package q3;

import a1.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pf.l;
import s.i0;
import s.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f17073a = new o(16);
    public static final ThreadPoolExecutor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f17075d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        f17074c = new Object();
        f17075d = new i0(0);
    }

    public static String a(int i2, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((d) list.get(i10)).f17066g);
            sb2.append("-");
            sb2.append(i2);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static g b(String str, Context context, List list, int i2) {
        int i10;
        Typeface typefaceF;
        o oVar = f17073a;
        l.e("getFontSync");
        try {
            Typeface typeface = (Typeface) oVar.c(str);
            if (typeface != null) {
                g gVar = new g(typeface);
                Trace.endSection();
                return gVar;
            }
            try {
                n nVarA = c.a(list, context);
                List list2 = (List) nVarA.f60v;
                int i11 = nVarA.f59u;
                if (i11 == 0) {
                    i[] iVarArr = (i[]) list2.get(0);
                    if (iVarArr == null || iVarArr.length == 0) {
                        i10 = 1;
                    } else {
                        int length = iVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i10 = 0;
                                break;
                            }
                            int i13 = iVarArr[i12].f17080f;
                            if (i13 != 0) {
                                if (i13 >= 0) {
                                    i10 = i13;
                                    break;
                                }
                                i10 = -3;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        i10 = -3;
                        break;
                    }
                    i10 = -2;
                }
                if (i10 != 0) {
                    g gVar2 = new g(i10);
                    Trace.endSection();
                    return gVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    i[] iVarArr2 = (i[]) list2.get(0);
                    db.h hVar = n3.e.f15133a;
                    l.e("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceF = n3.e.f15133a.f(context, iVarArr2, i2);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    db.h hVar2 = n3.e.f15133a;
                    l.e("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceF = n3.e.f15133a.g(context, list2, i2);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceF == null) {
                    g gVar3 = new g(-3);
                    Trace.endSection();
                    return gVar3;
                }
                oVar.d(str, typefaceF);
                g gVar4 = new g(typefaceF);
                Trace.endSection();
                return gVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                g gVar5 = new g(-1);
                Trace.endSection();
                return gVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
