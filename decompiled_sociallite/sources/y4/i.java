package y4;

import r4.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f23612a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(v.f18494c)) {
            String str = v.f18495d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f23612a = z10;
    }
}
