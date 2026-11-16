package ah;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends b {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i2) {
        super(7);
        this.A = i2;
    }

    @Override // ah.b
    public String d(Method method, int i2) {
        switch (this.A) {
            case 1:
                Parameter parameter = method.getParameters()[i2];
                if (!parameter.isNamePresent()) {
                    return super.d(method, i2);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.d(method, i2);
        }
    }

    @Override // ah.b
    public final Object e(Class cls, Object obj, Method method, Object[] objArr) {
        switch (this.A) {
            case 0:
                break;
        }
        return x0.k(cls, obj, method, objArr);
    }

    @Override // ah.b
    public final boolean f(Method method) {
        switch (this.A) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
