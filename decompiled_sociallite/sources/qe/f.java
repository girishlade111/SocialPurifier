package qe;

import a5.z;
import ah.p;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import ke.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f17242a = Collections.EMPTY_SET;
    public static final Type[] b = new Type[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f17243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Class f17244d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f17244d = cls;
        f17243c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new c(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof d) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof c ? type : new c(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof e)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            n.n(type, ". Use the boxed type.", "Unexpected primitive ");
        }
    }

    public static Type c(Type type, Class cls, Class cls2) {
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
                    return c(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean d(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static p e(String str, String str2, pe.p pVar) {
        String string;
        String strK = pVar.k();
        if (str2.equals(str)) {
            string = z.j("Required value '", str, "' missing at ", strK);
        } else {
            StringBuilder sbL = c1.l("Required value '", str, "' (JSON name '", str2, "') missing at ");
            sbL.append(strK);
            string = sbL.toString();
        }
        return new p(string);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    public static Type f(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type type3;
        WildcardType wildcardType;
        Type typeF;
        Type[] upperBounds;
        Type[] lowerBounds;
        TypeVariable typeVariable;
        do {
            int i2 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeF2 = f(type, cls, componentType, linkedHashSet);
                        return componentType == typeF2 ? cls2 : new c(typeF2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeF3 = f(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == typeF3 ? genericArrayType : new c(typeF3);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeF4 = f(type, cls, ownerType, linkedHashSet);
                    boolean z10 = typeF4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type typeF5 = f(type, cls, actualTypeArguments[i2], linkedHashSet);
                        if (typeF5 != actualTypeArguments[i2]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i2] = typeF5;
                        }
                        i2++;
                    }
                    return z10 ? new d(typeF4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof WildcardType) {
                    wildcardType = (WildcardType) type2;
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Type[] upperBounds2 = wildcardType.getUpperBounds();
                    if (lowerBounds2.length == 1) {
                        Type typeF6 = f(type, cls, lowerBounds2[0], linkedHashSet);
                        if (typeF6 != lowerBounds2[0]) {
                            if (typeF6 instanceof WildcardType) {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = ((WildcardType) typeF6).getLowerBounds();
                            } else {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = new Type[]{typeF6};
                            }
                            return new e(new Type[]{Object.class}, lowerBounds);
                        }
                    } else if (upperBounds2.length == 1 && (typeF = f(type, cls, upperBounds2[0], linkedHashSet)) != upperBounds2[0]) {
                        if (typeF instanceof WildcardType) {
                            type3 = type2;
                            type3 = wildcardType;
                            type3 = wildcardType;
                            upperBounds = ((WildcardType) typeF).getUpperBounds();
                        } else {
                            type3 = type2;
                            type3 = wildcardType;
                            type3 = wildcardType;
                            upperBounds = new Type[]{typeF};
                        }
                        return new e(upperBounds, b);
                    }
                }
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeC = c(type, cls, cls3);
                if (typeC instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i2 >= typeParameters.length) {
                            a6.d.d();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i2])) {
                            type2 = ((ParameterizedType) typeC).getActualTypeArguments()[i2];
                            break;
                        }
                        i2++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static void g(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static String h(Type type, Set set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static p j(String str, String str2, pe.p pVar) {
        String string;
        String strK = pVar.k();
        if (str2.equals(str)) {
            string = z.j("Non-null value '", str, "' was null at ", strK);
        } else {
            StringBuilder sbL = c1.l("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            sbL.append(strK);
            string = sbL.toString();
        }
        return new p(string);
    }
}
