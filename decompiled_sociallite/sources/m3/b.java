package m3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f10444a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f10445c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[][] f10446d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int b(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f10445c;
        return n3.a.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float c(int i2) {
        float f10 = i2 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static d d(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i2;
        int i10;
        ?? r9;
        long j10;
        Throwable th;
        ?? r10;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            f(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), h3.a.b);
        int i11 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i12 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), h3.a.f7669c);
                        int i13 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, RCHTTPStatusCodes.BAD_REQUEST);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i14 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i15 = typedArrayObtainAttributes2.getInt(i14, 0);
                        int i16 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i16, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i16);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            f(xmlResourceParser);
                        }
                        arrayList.add(new f(i13, i15, resourceId2, string7, string6, z10));
                    } else {
                        f(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList.toArray(new f[0]));
        }
        List listE = e(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i12) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), h3.a.f7670d);
                    int i17 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i11);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            r9 = typedArrayObtainAttributes3;
                            j10 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                f(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = typedArrayObtainAttributes3;
                                j10 = 1;
                            }
                        }
                        try {
                            r9 = typedArrayObtainAttributes3;
                            i10 = i17;
                            j10 = 1;
                            try {
                                q3.d dVar = new q3.d(string, string2, string8, listE, string9, string10);
                                if (r9 instanceof AutoCloseable) {
                                    ((AutoCloseable) r9).close();
                                } else if (r9 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r9;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z11 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z11) {
                                                    executorService2.shutdownNow();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r9.recycle();
                                }
                                arrayList2.add(dVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r9 = typedArrayObtainAttributes3;
                            j10 = 1;
                            th = th;
                            r10 = r9;
                            if (r10 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r10 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r10).close();
                                    throw th;
                                }
                                if (r10 instanceof ExecutorService) {
                                    r10.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r10;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r9 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r10 = r9;
                    if (r10 != 0) {
                        throw th;
                    }
                    if (!(r10 instanceof AutoCloseable)) {
                        ((AutoCloseable) r10).close();
                        throw th;
                    }
                    if (r10 instanceof ExecutorService) {
                        r10.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r10;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z12 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j10, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z12) {
                                executorService.shutdownNow();
                                z12 = true;
                            }
                        }
                    }
                    if (!z12) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i10 = integer;
                f(xmlResourceParser);
                integer = i10;
                integer2 = integer2;
                string5 = string5;
                i2 = 2;
                i11 = 0;
                i12 = 3;
            }
        }
        int i18 = integer2;
        String str = string5;
        int i19 = integer;
        if (!arrayList2.isEmpty()) {
            return new g(arrayList2, i19, i18, str);
        }
        if (string3 == null) {
            w4.d.j("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new q3.d(string, string2, string3, listE, null, null));
        if (string4 != null) {
            arrayList2.add(new q3.d(string, string2, string4, listE, null, null));
        }
        return new g(arrayList2, i19, i18, str);
    }

    public static List e(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static float g() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
