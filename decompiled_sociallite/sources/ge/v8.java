package ge;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ge.v8[], still in use, count: 1, list:
  (r0v1 ge.v8[]) from 0x0055: CONSTRUCTOR (r0v1 ge.v8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class v8 {
    /* JADX INFO: Fake field, exist only in values array */
    TRIAL_CANCELLED("trial_cancelled", "save-cancel-2599", 25990000L),
    /* JADX INFO: Fake field, exist only in values array */
    YEARLY_CANCELLED("yearly_cancelled", "save-price-3499", 34990000L),
    /* JADX INFO: Fake field, exist only in values array */
    MONTHLY_CANCELLED("monthly_cancelled", "save-free-2999", 29990000L),
    /* JADX INFO: Fake field, exist only in values array */
    MONTHLY_UPSELL("monthly_upsell", "save-price-3499", 34990000L),
    PAYWALL_DISCOUNT("paywall_discount", "save-2000", 20000000L);


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f7041w = new c();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ af.b f7044z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f7046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7047v;

    static {
        f7044z = new af.b(new v8[]{r0, r1, r2, r3, r4});
    }

    public v8(String str, String str2, long j10) {
        super(str, i);
        this.f7045t = str;
        this.f7046u = str2;
        this.f7047v = j10;
    }

    public static v8 valueOf(String str) {
        return (v8) Enum.valueOf(v8.class, str);
    }

    public static v8[] values() {
        return (v8[]) f7043y.clone();
    }
}
