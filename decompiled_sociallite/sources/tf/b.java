package tf;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import sf.u;

/* JADX INFO: loaded from: classes.dex */
public final class b extends xe.a implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public b() {
        super(u.f19814t);
        this._preHandler = this;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void y(Throwable th) {
        Method declaredMethod;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            if (obj != this) {
                declaredMethod = (Method) obj;
            } else {
                try {
                    declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                    if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                        declaredMethod = null;
                    }
                } catch (Throwable unused) {
                }
                this._preHandler = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
