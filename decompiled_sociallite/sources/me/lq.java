package me;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 me.lq[], still in use, count: 1, list:
  (r0v1 me.lq[]) from 0x005c: CONSTRUCTOR (r0v1 me.lq[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class lq {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("blocks", "Blocks landed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("trend", "Weekly trend"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("sessions", "Sessions"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("streak", "Longest stretch away"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("limits", "Limit hits"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("hardmode", "Hard Mode"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("latestopen", "Latest open");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final kq f12587v = new kq();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ af.b f12589x = new af.b(new lq[]{new lq("blocks", "Blocks landed"), new lq("trend", "Weekly trend"), new lq("sessions", "Sessions"), new lq("streak", "Longest stretch away"), new lq("limits", "Limit hits"), new lq("hardmode", "Hard Mode"), new lq("latestopen", "Latest open")});

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f12590t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f12591u;

    static {
    }

    public lq(String str, String str2) {
        super(str, i);
        this.f12590t = str;
        this.f12591u = str2;
    }

    public static lq valueOf(String str) {
        return (lq) Enum.valueOf(lq.class, str);
    }

    public static lq[] values() {
        return (lq[]) f12588w.clone();
    }
}
