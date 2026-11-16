package db;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import rb.c0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3775t = 1;

    public /* synthetic */ g(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f3775t) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = xg.d.f23287h;
                ReentrantLock reentrantLock2 = xg.d.f23287h;
                reentrantLock2.lock();
                try {
                    xg.d dVarO = c0.o();
                    if (dVarO == xg.d.l) {
                        xg.d.l = null;
                        reentrantLock2.unlock();
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (dVarO != null) {
                            dVarO.j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ g(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
