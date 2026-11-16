package je;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 je.e[], still in use, count: 1, list:
  (r1v11 je.e[]) from 0x0137: CONSTRUCTOR (r2v12 af.b) = (r1v11 je.e[]) A[MD:(java.lang.Enum[]):void (m)] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("app_first_launch", "lifecycle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("session_started", "lifecycle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("session_ended", "lifecycle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF41("onboarding_started", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("onboarding_step_viewed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF61("onboarding_step_completed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF71("onboarding_step_abandoned", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("onboarding_account_type_selected", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF92("onboarding_signup_attempted", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF103("onboarding_signup_completed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF114("onboarding_signup_failed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF125("onboarding_login_attempted", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF138("onboarding_login_completed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF151("onboarding_login_failed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF164("onboarding_completed", "onboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    EF179("paywall_shown", "paywall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF192("paywall_dismissed", "paywall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF205("paywall_purchase_started", "paywall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF218("paywall_purchase_completed", "paywall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF231("paywall_purchase_failed", "paywall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF246("subscription_restored", "billing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF261("permission_prompted", "permissions"),
    /* JADX INFO: Fake field, exist only in values array */
    EF274("permission_resolved", "permissions");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f8746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final LinkedHashMap f8747w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f8750u;

    static {
        af.b bVar = new af.b(eVarArr);
        f8746v = new h();
        int iK = te.x.K(te.l.I(bVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK < 16 ? 16 : iK);
        dg.f fVar = new dg.f(bVar, 7);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            linkedHashMap.put(((e) next).f8749t, next);
        }
        f8747w = linkedHashMap;
    }

    public e(String str, String str2) {
        super(str, i);
        this.f8749t = str;
        this.f8750u = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f8748x.clone();
    }
}
