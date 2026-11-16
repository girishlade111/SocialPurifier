package l7;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final String b = p.d("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f10084c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10085a;

    static {
        f fVar = new f(new HashMap());
        b(fVar);
        f10084c = fVar;
    }

    public f(f fVar) {
        this.f10085a = new HashMap(fVar.f10085a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0033 A[EXC_TOP_SPLITTER, PHI: r4
  0x0033: PHI (r4v7 java.io.ObjectInputStream) = (r4v6 java.io.ObjectInputStream), (r4v8 java.io.ObjectInputStream) binds: [B:31:0x0052, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static f a(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e10;
        String str = b;
        if (bArr.length > 10240) {
            w4.d.l("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int i2 = objectInputStream.readInt(); i2 > 0; i2--) {
                                map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            }
                        } catch (IOException e11) {
                            e10 = e11;
                            Log.e(str, "Error in Data#fromByteArray: ", e10);
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return new f(map);
                        } catch (ClassNotFoundException e12) {
                            e10 = e12;
                            Log.e(str, "Error in Data#fromByteArray: ", e10);
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return new f(map);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e13) {
                                Log.e(str, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e14) {
                            Log.e(str, "Error in Data#fromByteArray: ", e14);
                            throw th;
                        }
                    }
                } catch (IOException e15) {
                    e = e15;
                    Throwable th3 = e;
                    objectInputStream = null;
                    e10 = th3;
                    Log.e(str, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new f(map);
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    Throwable th4 = e;
                    objectInputStream = null;
                    e10 = th4;
                    Log.e(str, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new f(map);
                } catch (Throwable th5) {
                    th = th5;
                    if (0 != 0) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
                byteArrayInputStream.close();
            } catch (IOException e17) {
                Log.e(str, "Error in Data#fromByteArray: ", e17);
            }
            objectInputStream.close();
        } catch (IOException e18) {
            Log.e(str, "Error in Data#fromByteArray: ", e18);
        }
        return new f(map);
    }

    public static byte[] b(f fVar) throws Throwable {
        String str = b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(fVar.f10085a.size());
                    for (Map.Entry entry : fVar.f10085a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(str, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(str, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    w4.d.l("Data cannot occupy more than 10240 bytes when serialized");
                    return null;
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(str, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(str, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(str, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(str, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(str, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                HashMap map = ((f) obj).f10085a;
                HashMap map2 = this.f10085a;
                Set<String> setKeySet = map2.keySet();
                if (setKeySet.equals(map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10085a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap map = this.f10085a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public f(HashMap map) {
        this.f10085a = new HashMap(map);
    }
}
