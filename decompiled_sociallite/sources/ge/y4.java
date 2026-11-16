package ge;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ge.y4[], still in use, count: 1, list:
  (r0v1 ge.y4[]) from 0x007a: CONSTRUCTOR (r0v1 ge.y4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class y4 {
    f7199v("nativeFbBlockGroupsForYou", te.a0.F("for you", "para ti", "para você", "pour vous", "für dich", "per te", "لك", "おすすめ", "あなたへのおすすめ")),
    f7200w("nativeFbBlockGroupsYourGroups", te.a0.F("your groups", "tus grupos", "seus grupos", "vos groupes", "deine gruppen", "i tuoi gruppi", "مجموعاتك", "あなたのグループ", "参加中のグループ")),
    f7201x("nativeFbBlockGroupsDiscover", te.a0.F("discover", "descubrir", "descobrir", "découvrir", "entdecken", "scopri", "اكتشاف", "見つける", "発見"));


    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ af.b f7203z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Set f7205u;

    static {
        f7203z = new af.b(y4VarArr);
    }

    public y4(String str, Set set) {
        super(str, i);
        this.f7204t = str;
        this.f7205u = set;
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) f7202y.clone();
    }
}
