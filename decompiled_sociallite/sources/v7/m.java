package v7;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    static {
        l7.p.d("ProcessUtils");
    }

    public static final boolean a(Context context, l7.a aVar) {
        String strA;
        Object next;
        context.getClass();
        aVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strA = a.f22145a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, m7.n.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strA = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strA = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                l7.p.c().getClass();
            }
        }
        return kotlin.jvm.internal.l.a(strA, context.getApplicationInfo().processName);
    }
}
