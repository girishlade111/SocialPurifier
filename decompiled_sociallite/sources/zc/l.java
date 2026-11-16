package zc;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l implements hd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f24067a;
    public volatile Set b;

    @Override // hd.a
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f24067a.iterator();
                                while (it.hasNext()) {
                                    this.b.add(((hd.a) it.next()).get());
                                }
                                this.f24067a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
