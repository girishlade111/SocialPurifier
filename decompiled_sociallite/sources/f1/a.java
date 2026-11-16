package f1;

import java.util.List;
import me.s5;

/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements hf.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f4683u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s5 s5Var, List list) {
        super(1);
        this.f4682t = 9;
        this.f4683u = list;
    }

    @Override // hf.c
    public final Object invoke(Object obj) {
        switch (this.f4682t) {
            case 0:
                List list = this.f4683u;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((hf.c) list.get(i2)).invoke(obj);
                }
                return se.a0.f19710a;
            case 1:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 2:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 3:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 4:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 5:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 6:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 7:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 8:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 9:
                Integer num = (Integer) this.f4683u.get(((Number) obj).intValue());
                num.intValue();
                return num;
            case 10:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 11:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 12:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 13:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            case 14:
                this.f4683u.get(((Number) obj).intValue());
                return null;
            default:
                this.f4683u.get(((Number) obj).intValue());
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, List list) {
        super(1);
        this.f4682t = i2;
        this.f4683u = list;
    }
}
