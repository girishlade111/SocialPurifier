package d8;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import b8.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import ke.c1;
import org.xmlpull.v1.XmlPullParserException;
import qf.r;
import xg.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3697a;
    public final Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8.m f3698c;

    public /* synthetic */ b(Uri uri, j8.m mVar, int i2) {
        this.f3697a = i2;
        this.b = uri;
        this.f3698c = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01b5  */
    @Override // d8.g
    public final Object a(xe.d dVar) throws XmlPullParserException, IOException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer numR0;
        Drawable drawable;
        int i2 = this.f3697a;
        Uri uri = this.b;
        j8.m mVar = this.f3698c;
        b8.e eVar = b8.e.f1800v;
        switch (i2) {
            case 0:
                String strC0 = te.k.c0(te.k.S(uri.getPathSegments(), 1), DomExceptionUtils.SEPARATOR, null, null, null, 62);
                return new n(new o(new a0(kf.a.E(mVar.f8674a.getAssets().open(strC0))), new b8.a()), n8.e.b(MimeTypeMap.getSingleton(), strC0), eVar);
            case 1:
                ContentResolver contentResolver = mVar.f8674a.getContentResolver();
                if (kotlin.jvm.internal.l.a(uri.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.l.a(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        a6.d.q(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && kotlin.jvm.internal.l.a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && kotlin.jvm.internal.l.a(pathSegments.get(size - 3), "audio") && kotlin.jvm.internal.l.a(pathSegments.get(size - 2), "albums")) {
                    k8.g gVar = mVar.f8676d;
                    android.support.v4.media.session.b bVar = gVar.f9168a;
                    k8.a aVar = bVar instanceof k8.a ? (k8.a) bVar : null;
                    if (aVar != null) {
                        int i10 = aVar.f9157g;
                        android.support.v4.media.session.b bVar2 = gVar.b;
                        k8.a aVar2 = bVar2 instanceof k8.a ? (k8.a) bVar2 : null;
                        if (aVar2 != null) {
                            int i11 = aVar2.f9157g;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        a6.d.q(uri, "'.", "Unable to find a music thumbnail associated with '");
                        return null;
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        a6.d.q(uri, "'.", "Unable to open '");
                        return null;
                    }
                }
                return new n(new o(new a0(kf.a.E(inputStreamOpenInputStream)), new b8.a()), contentResolver.getType(uri), eVar);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (qf.k.G0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) te.k.e0(uri.getPathSegments());
                        if (str == null || (numR0 = r.r0(str)) == null) {
                            m.l("Invalid android.resource URI: ", uri);
                            return null;
                        }
                        int iIntValue = numR0.intValue();
                        Context context = mVar.f8674a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strB = n8.e.b(MimeTypeMap.getSingleton(), charSequence.subSequence(qf.k.I0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!kotlin.jvm.internal.l.a(strB, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new n(new o(new a0(kf.a.E(resources.openRawResource(iIntValue, typedValue2))), new b8.n(typedValue2.density)), strB, eVar);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = c.a.m(context, iIntValue);
                            if (drawable == null) {
                                m.h(c1.i("Invalid resource ID: ", iIntValue));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = m3.j.f10460a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                m.h(c1.i("Invalid resource ID: ", iIntValue));
                                return null;
                            }
                        }
                        boolean z10 = drawable instanceof VectorDrawable;
                        if (z10) {
                            drawable = new BitmapDrawable(context.getResources(), u8.g.i(drawable, mVar.b, mVar.f8676d, mVar.f8677e, mVar.f8678f));
                        }
                        return new d(drawable, z10, eVar);
                    }
                }
                m.l("Invalid android.resource URI: ", uri);
                return null;
        }
    }
}
