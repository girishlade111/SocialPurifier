package p5;

import ac.b0;
import ac.b1;
import ac.i0;
import ac.r;
import g5.w;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import o4.f0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f16699a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f16700c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static w a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!r4.a.s(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw f0.a(null, "Couldn't find xmp metadata");
        }
        ac.f0 f0Var = i0.f523u;
        b1 b1VarB = b1.f480x;
        long j10 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (r4.a.s(xmlPullParserNewPullParser, "rdf:Description")) {
                int i2 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    String strP = r4.a.p(xmlPullParserNewPullParser, f16699a[i10]);
                    if (strP != null) {
                        if (Integer.parseInt(strP) != 1) {
                            break loop0;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                String strP2 = r4.a.p(xmlPullParserNewPullParser, b[i11]);
                                if (strP2 != null) {
                                    j10 = Long.parseLong(strP2);
                                    if (j10 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i11++;
                            }
                            j10 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i2 >= 2) {
                                ac.f0 f0Var2 = i0.f523u;
                                b1VarB = b1.f480x;
                                break;
                            }
                            String strP3 = r4.a.p(xmlPullParserNewPullParser, f16700c[i2]);
                            if (strP3 != null) {
                                b1VarB = i0.v(new b(0L, 0L, "image/jpeg"), new b(Long.parseLong(strP3), 0L, "video/mp4"));
                                break;
                            }
                            i2++;
                        }
                    }
                }
                return null;
            }
            if (r4.a.s(xmlPullParserNewPullParser, "Container:Directory")) {
                b1VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (r4.a.s(xmlPullParserNewPullParser, "GContainer:Directory")) {
                b1VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!r4.a.r(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (b1VarB.isEmpty()) {
            break loop0;
        }
        return new w(j10, b1VarB);
        return null;
    }

    public static b1 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ac.f0 f0Var = i0.f523u;
        r.b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i2 = 0;
        boolean z10 = false;
        do {
            xmlPullParser.next();
            if (r4.a.s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strP = r4.a.p(xmlPullParser, strConcat3);
                String strP2 = r4.a.p(xmlPullParser, strConcat4);
                String strP3 = r4.a.p(xmlPullParser, strConcat5);
                String strP4 = r4.a.p(xmlPullParser, strConcat6);
                if (strP == null || strP2 == null) {
                    return b1.f480x;
                }
                b bVar = new b(strP3 != null ? Long.parseLong(strP3) : 0L, strP4 != null ? Long.parseLong(strP4) : 0L, strP);
                int i10 = i2 + 1;
                if (objArrCopyOf.length < i10) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, b0.d(objArrCopyOf.length, i10));
                } else {
                    if (z10) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i2] = bVar;
                    i2++;
                }
                z10 = false;
                objArrCopyOf[i2] = bVar;
                i2++;
            }
        } while (!r4.a.r(xmlPullParser, strConcat2));
        return i0.m(i2, objArrCopyOf);
    }
}
