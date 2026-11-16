package kotlin.jvm.internal;

import e4.w0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static Collection a(LinkedHashSet linkedHashSet) {
        if (!(linkedHashSet instanceof jf.a) || (linkedHashSet instanceof jf.b)) {
            return linkedHashSet;
        }
        f("kotlin.collections.MutableCollection", linkedHashSet);
        throw null;
    }

    public static List b(Object obj) {
        if ((obj instanceof jf.a) && !(obj instanceof jf.c)) {
            f("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            l.c(e10, a0.class.getName());
            throw e10;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof jf.a) && !(obj instanceof jf.e)) {
            f("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            l.c(e10, a0.class.getName());
            throw e10;
        }
    }

    public static void d(int i2, Object obj) {
        if (obj == null || e(i2, obj)) {
            return;
        }
        f("kotlin.jvm.functions.Function" + i2, obj);
        throw null;
    }

    public static boolean e(int i2, Object obj) {
        int arity;
        if (obj instanceof se.d) {
            if (obj instanceof g) {
                arity = ((g) obj).getArity();
            } else if (obj instanceof hf.a) {
                arity = 0;
            } else if (obj instanceof hf.c) {
                arity = 1;
            } else if (obj instanceof hf.e) {
                arity = 2;
            } else if (obj instanceof hf.f) {
                arity = 3;
            } else if (obj instanceof hf.g) {
                arity = 4;
            } else if (obj instanceof d1.a) {
                arity = 5;
            } else if (obj instanceof hf.h) {
                arity = 6;
            } else if (obj instanceof d1.a) {
                arity = 7;
            } else if (obj instanceof d1.a) {
                arity = 8;
            } else if (obj instanceof d1.a) {
                arity = 9;
            } else if (obj instanceof d1.a) {
                arity = 10;
            } else if (obj instanceof d1.a) {
                arity = 11;
            } else if (obj instanceof d1.a) {
                arity = 13;
            } else if (obj instanceof d1.a) {
                arity = 14;
            } else if (obj instanceof d1.a) {
                arity = 15;
            } else if (obj instanceof d1.a) {
                arity = 16;
            } else if (obj instanceof d1.a) {
                arity = 17;
            } else if (obj instanceof d1.a) {
                arity = 18;
            } else if (obj instanceof d1.a) {
                arity = 19;
            } else if (obj instanceof d1.a) {
                arity = 20;
            } else {
                arity = obj instanceof d1.a ? 21 : -1;
            }
            if (arity == i2) {
                return true;
            }
        }
        return false;
    }

    public static void f(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException(w0.r(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.c(classCastException, a0.class.getName());
        throw classCastException;
    }
}
