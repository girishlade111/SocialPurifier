package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w5 implements z5 {
    public static final k5 b = new k5(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2936a;

    @Override // com.google.android.gms.internal.measurement.z5
    public boolean a(Class cls) {
        for (z5 z5Var : (z5[]) this.f2936a) {
            if (z5Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public h6 b(Class cls) {
        for (z5 z5Var : (z5[]) this.f2936a) {
            if (z5Var.a(cls)) {
                return z5Var.b(cls);
            }
        }
        d8.m.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public Object c() {
        f4 f4Var = (f4) this.f2936a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = f4Var.f2714t.acquireUnstableContentProviderClient(f4Var.f2715u);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(f4Var.f2715u, f4.B, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map eVar = count <= 256 ? new s.e(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return eVar;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException e10) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public void d(int i2, Object obj, i6 i6Var) throws c5.i0 {
        b5 b5Var = (b5) this.f2936a;
        b5Var.o(i2, 3);
        i6Var.e((t4) obj, b5Var.f2614a);
        b5Var.o(i2, 4);
    }

    public void e(int i2, Object obj, i6 i6Var) throws c5.i0 {
        b5 b5Var = (b5) this.f2936a;
        t4 t4Var = (t4) obj;
        b5Var.o(i2, 2);
        b5Var.n(t4Var.a(i6Var));
        i6Var.e(t4Var, b5Var.f2614a);
    }
}
