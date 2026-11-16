package c9;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2363a;

    public /* synthetic */ k(int i2) {
        this.f2363a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0227  */
    /* JADX WARN: Code duplicated, block: B:59:0x0233  */
    /* JADX WARN: Code duplicated, block: B:78:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x028a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public n a(Context context) {
        Class cls;
        Object objW;
        n nVar;
        Class clsJ = v.j("com.android.billingclient.api.BillingClient");
        Class clsJ2 = v.j("com.android.billingclient.api.Purchase");
        Class clsJ3 = v.j("com.android.billingclient.api.ProductDetails");
        Class clsJ4 = v.j("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsJ5 = v.j("com.android.billingclient.api.QueryProductDetailsParams$Product");
        Class clsJ6 = v.j("com.android.billingclient.api.BillingResult");
        Class clsJ7 = v.j("com.android.billingclient.api.QueryProductDetailsParams");
        Class clsJ8 = v.j("com.android.billingclient.api.QueryPurchaseHistoryParams");
        Class clsJ9 = v.j("com.android.billingclient.api.QueryPurchasesParams");
        Class clsJ10 = v.j("com.android.billingclient.api.QueryProductDetailsParams$Builder");
        Class clsJ11 = v.j("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
        Class clsJ12 = v.j("com.android.billingclient.api.QueryPurchasesParams$Builder");
        Class clsJ13 = v.j("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
        Class clsJ14 = v.j("com.android.billingclient.api.BillingClient$Builder");
        Class clsJ15 = v.j("com.android.billingclient.api.PurchasesUpdatedListener");
        Class clsJ16 = v.j("com.android.billingclient.api.BillingClientStateListener");
        Class clsJ17 = v.j("com.android.billingclient.api.ProductDetailsResponseListener");
        Class clsJ18 = v.j("com.android.billingclient.api.PurchasesResponseListener");
        Class clsJ19 = v.j("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsJ == null || clsJ2 == null || clsJ3 == null || clsJ4 == null || clsJ5 == null || clsJ6 == null || clsJ7 == null || clsJ8 == null || clsJ9 == null || clsJ10 == null || clsJ11 == null || clsJ12 == null || clsJ13 == null || clsJ14 == null || clsJ15 == null || clsJ16 == null || clsJ17 == null || clsJ18 == null || clsJ19 == null) {
            Log.w(n.b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodO = v.o(clsJ, "queryPurchasesAsync", clsJ9, clsJ18);
        Method methodO2 = v.o(clsJ9, "newBuilder", new Class[0]);
        Method methodO3 = v.o(clsJ12, "build", new Class[0]);
        Method methodO4 = v.o(clsJ12, "setProductType", String.class);
        Method methodO5 = v.o(clsJ2, "getOriginalJson", new Class[0]);
        Method methodO6 = v.o(clsJ, "queryPurchaseHistoryAsync", clsJ8, clsJ19);
        Method methodO7 = v.o(clsJ8, "newBuilder", new Class[0]);
        Method methodO8 = v.o(clsJ11, "build", new Class[0]);
        Method methodO9 = v.o(clsJ11, "setProductType", String.class);
        Method methodO10 = v.o(clsJ4, "getOriginalJson", new Class[0]);
        Method methodO11 = v.o(clsJ, "queryProductDetailsAsync", clsJ7, clsJ17);
        Method methodO12 = v.o(clsJ7, "newBuilder", new Class[0]);
        Method methodO13 = v.o(clsJ10, "build", new Class[0]);
        Method methodO14 = v.o(clsJ10, "setProductList", List.class);
        Method methodO15 = v.o(clsJ5, "newBuilder", new Class[0]);
        Method methodO16 = v.o(clsJ13, "build", new Class[0]);
        Method methodO17 = v.o(clsJ13, "setProductId", String.class);
        Method methodO18 = v.o(clsJ13, "setProductType", String.class);
        Method methodO19 = v.o(clsJ3, "toString", new Class[0]);
        Method methodO20 = v.o(clsJ, "startConnection", clsJ16);
        Method methodO21 = v.o(clsJ6, "getResponseCode", new Class[0]);
        if (methodO == null || methodO2 == null || methodO3 == null || methodO4 == null || methodO5 == null || methodO6 == null || methodO7 == null || methodO8 == null || methodO9 == null || methodO10 == null || methodO11 == null || methodO12 == null || methodO13 == null || methodO14 == null || methodO15 == null || methodO16 == null || methodO17 == null || methodO18 == null || methodO19 == null || methodO20 == null || methodO21 == null) {
            Log.w(n.b(), "Failed to create Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        Method methodO22 = v.o(clsJ, "newBuilder", Context.class);
        Method methodO23 = v.o(clsJ14, "setListener", clsJ15);
        Method methodO24 = v.o(clsJ14, "enablePendingPurchases", new Class[0]);
        Method methodO25 = v.o(clsJ14, "build", new Class[0]);
        if (methodO25 != null && methodO23 != null && methodO22 != null && methodO24 != null) {
            cls = clsJ;
            Object objW2 = v.w(clsJ14, v.w(clsJ, null, methodO22, context), methodO23, Proxy.newProxyInstance(clsJ15.getClassLoader(), new Class[]{clsJ15}, this));
            if (objW2 != null) {
                objW = v.w(clsJ14, v.w(clsJ14, objW2, methodO24, new Object[0]), methodO25, new Object[0]);
            }
            if (objW == null) {
                Log.w(n.b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
                return null;
            }
            nVar = new n(objW, cls, clsJ2, clsJ3, clsJ4, clsJ5, clsJ6, clsJ7, clsJ8, clsJ10, clsJ11, clsJ13, clsJ16, clsJ17, clsJ19, methodO5, methodO6, methodO7, methodO8, methodO9, methodO10, methodO11, methodO12, methodO13, methodO14, methodO15, methodO16, methodO17, methodO18, methodO19, methodO20, methodO21);
            if (!p9.a.f16774a.contains(n.class)) {
                try {
                    n.I = nVar;
                } catch (Throwable th) {
                    p9.a.a(th, n.class);
                }
            }
            if (!p9.a.f16774a.contains(n.class)) {
                try {
                    return n.I;
                } catch (Throwable th2) {
                    p9.a.a(th2, n.class);
                }
            }
            return null;
        }
        cls = clsJ;
        objW = null;
        if (objW == null) {
            Log.w(n.b(), "Failed to build a Google Play billing library wrapper for in-app purchase auto-logging");
            return null;
        }
        nVar = new n(objW, cls, clsJ2, clsJ3, clsJ4, clsJ5, clsJ6, clsJ7, clsJ8, clsJ10, clsJ11, clsJ13, clsJ16, clsJ17, clsJ19, methodO5, methodO6, methodO7, methodO8, methodO9, methodO10, methodO11, methodO12, methodO13, methodO14, methodO15, methodO16, methodO17, methodO18, methodO19, methodO20, methodO21);
        if (!p9.a.f16774a.contains(n.class)) {
            n.I = nVar;
        }
        if (!p9.a.f16774a.contains(n.class)) {
            return n.I;
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f2363a) {
            case 0:
                if (!p9.a.f16774a.contains(this)) {
                    try {
                        obj.getClass();
                        method.getClass();
                    } catch (Throwable th) {
                        p9.a.a(th, this);
                        return null;
                    }
                    break;
                }
                break;
            default:
                obj.getClass();
                method.getClass();
                break;
        }
        return null;
    }
}
