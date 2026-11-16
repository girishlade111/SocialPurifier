package je;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 je.d[], still in use, count: 1, list:
  (r0v1 je.d[]) from 0x009a: CONSTRUCTOR (r0v1 je.d[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d {
    USER_CANCELLED("user_cancelled"),
    NETWORK_UNAVAILABLE("network_unavailable"),
    NETWORK_TIMEOUT("network_timeout"),
    NETWORK_TLS("network_tls"),
    SERVER_ERROR("server_error"),
    RATE_LIMITED("rate_limited"),
    ACCOUNT_ALREADY_EXISTS("account_already_exists"),
    INVALID_CREDENTIALS("invalid_credentials"),
    AUTH_PROVIDER_ERROR("auth_provider_error"),
    AUTH_PROVIDER_BLOCKED("auth_provider_blocked"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_VALIDATION("client_validation"),
    UNKNOWN("unknown");

    public static final /* synthetic */ af.b G;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8745t;

    static {
        G = new af.b(dVarArr);
    }

    public d(String str) {
        super(str, i);
        this.f8745t = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) F.clone();
    }
}
