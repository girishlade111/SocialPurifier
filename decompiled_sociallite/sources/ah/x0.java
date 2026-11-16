package ah;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import ke.c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f788a = new Type[0];
    public static boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f789c;

    public static final Object b(e eVar, xe.d dVar) {
        sf.g gVar = new sf.g(1, pf.l.D(dVar));
        gVar.s();
        gVar.v(new u(eVar, 0));
        eVar.j(new k7.i(gVar, 4));
        return gVar.r();
    }

    public static final Object c(e eVar, xe.d dVar) {
        sf.g gVar = new sf.g(1, pf.l.D(dVar));
        gVar.s();
        gVar.v(new u(eVar, 1));
        eVar.j(new od.c(gVar, 5));
        return gVar.r();
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            w4.d.b();
        }
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbK = c1.k("Index ", i2, " not in range [0,");
        sbK.append(actualTypeArguments.length);
        sbK.append(") for ");
        sbK.append(parameterizedType);
        throw new IllegalArgumentException(sbK.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            w4.d.b();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb2 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb2.append(type);
        String name = type.getClass().getName();
        sb2.append("> is of type ");
        sb2.append(name);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return p(type, cls, f(type, cls, Map.class));
        }
        w4.d.b();
        return null;
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return j(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            a6.d.m("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (j(type2)) {
                return true;
            }
        }
        return false;
    }

    public static Object k(Class cls, Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f789c;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f789c = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException m(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static IllegalArgumentException n(Method method, int i2, String str, Object... objArr) {
        return m(method, null, str + " (" + k0.b.d(method, i2) + ")", objArr);
    }

    public static IllegalArgumentException o(Method method, Exception exc, int i2, String str, Object... objArr) {
        return m(method, exc, str + " (" + k0.b.d(method, i2) + ")", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type p(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeP;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i2 = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeP2 = p(type, cls, componentType);
                        return componentType == typeP2 ? cls2 : new u0(typeP2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeP3 = p(type, cls, genericComponentType);
                    return genericComponentType == typeP3 ? genericArrayType : new u0(typeP3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeP4 = p(type, cls, ownerType);
                    boolean z10 = typeP4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type typeP5 = p(type, cls, actualTypeArguments[i2]);
                        if (typeP5 != actualTypeArguments[i2]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i2] = typeP5;
                        }
                        i2++;
                    }
                    return z10 ? new v0(typeP4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeP6 = p(type, cls, lowerBounds[0]);
                        if (typeP6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new w0(new Type[]{Object.class}, new Type[]{typeP6});
                        }
                    } else if (upperBounds.length == 1 && (typeP = p(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new w0(new Type[]{typeP}, f788a);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeF = f(type, cls, cls3);
                if (typeF instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i2 >= typeParameters.length) {
                            a6.d.d();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type4 = ((ParameterizedType) typeF).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void q(Throwable th, xe.d dVar) {
        v vVar;
        if (dVar instanceof v) {
            vVar = (v) dVar;
            int i2 = vVar.f777u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.f777u = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(dVar);
            }
        } else {
            vVar = new v(dVar);
        }
        Object obj = vVar.f776t;
        int i10 = vVar.f777u;
        if (i10 == 0) {
            se.a.f(obj);
            vVar.f777u = 1;
            sf.h0.f19764a.Z(vVar.getContext(), new ad.l(vVar, 1, th));
        } else if (i10 != 1) {
            w4.d.l("call to 'resume' before 'invoke' with coroutine");
        } else {
            se.a.f(obj);
            throw new p();
        }
    }

    public static void r(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(n0 n0Var, Object obj);
}
