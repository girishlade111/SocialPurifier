package ge;

import com.sociallite.android.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ge.sa[], still in use, count: 1, list:
  (r0v1 ge.sa[]) from 0x0063: CONSTRUCTOR (r0v1 ge.sa[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sa {
    CONTENT(R.string.protection_content),
    APPS(R.string.protection_apps),
    OVERLAY(R.string.protection_overlay),
    LISTENER(R.string.protection_listener),
    ALERTS(R.string.protection_alerts),
    BATTERY(R.string.protection_battery),
    UNUSED_APP(R.string.protection_unused);

    public static final /* synthetic */ af.b C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6857t;

    static {
        C = new af.b(saVarArr);
    }

    public sa(int i2) {
        super(str, i);
        this.f6857t = i2;
    }

    public static sa valueOf(String str) {
        return (sa) Enum.valueOf(sa.class, str);
    }

    public static sa[] values() {
        return (sa[]) B.clone();
    }
}
