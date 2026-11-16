package f1;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements hf.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Collection f4793u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i2, Collection collection) {
        super(1);
        this.f4792t = i2;
        this.f4793u = collection;
    }

    @Override // hf.c
    public final Object invoke(Object obj) {
        switch (this.f4792t) {
            case 0:
                return Boolean.valueOf(((List) obj).retainAll(this.f4793u));
            case 1:
                return Boolean.valueOf(this.f4793u.contains(obj));
            default:
                return Boolean.valueOf(this.f4793u.contains(obj));
        }
    }
}
