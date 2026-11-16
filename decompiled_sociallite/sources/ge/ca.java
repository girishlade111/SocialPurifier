package ge;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ge.ca[], still in use, count: 1, list:
  (r0v1 ge.ca[]) from 0x00c0: CONSTRUCTOR (r1v3 af.b) = (r0v1 ge.ca[]) A[MD:(java.lang.Enum[]):void (m)] call: af.b.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ca {
    INSTAGRAM("Instagram", "https://www.instagram.com/accounts/login/", o1.r0.d(4293148767L)),
    YOUTUBE("YouTube", "https://m.youtube.com/", o1.r0.d(4294901760L)),
    TWITTER("X", "https://x.com/home", o1.r0.d(4280132082L)),
    TIKTOK("TikTok", "https://www.tiktok.com/inbox", o1.r0.d(4278190080L)),
    FACEBOOK("Facebook", "https://m.facebook.com/", o1.r0.d(4279793650L)),
    LINKEDIN("LinkedIn", "https://www.linkedin.com/feed/", o1.r0.d(4278871746L)),
    SNAPCHAT("Snapchat", "https://www.snapchat.com/web/", o1.r0.d(4294966272L)),
    REDDIT("Reddit", "https://www.reddit.com/", o1.r0.d(4294919424L));

    public static final /* synthetic */ af.b I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f5988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ArrayList f5989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f5990y;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f5992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f5993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f5994v;

    static {
        af.b bVar = new af.b(caVarArr);
        I = bVar;
        f5988w = new c();
        ArrayList arrayList = new ArrayList();
        dg.f fVar = new dg.f(bVar, 7);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            if (((ca) next) != REDDIT) {
                arrayList.add(next);
            }
        }
        f5989x = arrayList;
        ca caVar = TWITTER;
        ca caVar2 = YOUTUBE;
        ca caVar3 = INSTAGRAM;
        u7.f.w(caVar, caVar2, caVar3);
        f5990y = u7.f.w(caVar3, caVar2);
    }

    public ca(String str, String str2, long j10) {
        super(str, i);
        this.f5992t = str;
        this.f5993u = str2;
        this.f5994v = j10;
    }

    public static ca valueOf(String str) {
        return (ca) Enum.valueOf(ca.class, str);
    }

    public static ca[] values() {
        return (ca[]) H.clone();
    }

    public final String a(Context context) {
        context.getClass();
        i3 i3VarB = d2.B(context);
        int iOrdinal = ordinal();
        String str = this.f5993u;
        if (iOrdinal == 0) {
            if (i3VarB.getBoolean("ig_dmsOnly", false)) {
                str = "https://www.instagram.com/direct/inbox/";
            }
            String strF = t2.f(context);
            if (strF.equals("pt-br")) {
                strF = "pt";
            }
            return qf.k.t0(str, "?", false) ? e4.w0.r(str, "&hl=", strF) : e4.w0.r(str, "?hl=", strF);
        }
        if (iOrdinal == 3) {
            return i3VarB.getBoolean("tt_dmsOnly", false) ? "https://www.tiktok.com/inbox" : "https://www.tiktok.com/following";
        }
        if (iOrdinal != 4) {
            return ea.b(str, this, ea.e(context));
        }
        if (i3VarB.getBoolean("fb_marketplaceMode", false)) {
            str = "https://m.facebook.com/marketplace/";
        }
        return ea.b(str, this, ea.e(context));
    }

    public final List b(Context context) {
        context.getClass();
        i3 i3VarB = d2.B(context);
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            if (i3VarB.getBoolean("ig_blockReels", true) && !n3.c(i3VarB, this)) {
                arrayList.addAll(u7.f.w("/reels/", "/reels"));
            }
            return arrayList;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 4) {
                return u7.f.w("/reel/", "/reels/", "/reels", "/watch/");
            }
        } else if (!kotlin.jvm.internal.l.a(d2.B(context).f6283a.getString("accountType", "personal"), "personal")) {
            ArrayList arrayList2 = new ArrayList();
            if (i3VarB.getBoolean("yt_blockShorts", true) && !n3.c(i3VarB, this)) {
                arrayList2.addAll(u7.f.w("/shorts/", "/shorts"));
            }
            return arrayList2;
        }
        return te.s.f20249t;
    }

    public final String c() {
        return this.f5992t;
    }
}
