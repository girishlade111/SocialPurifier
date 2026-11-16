package ge;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5901a = te.x.L(new se.k("nativeBlockInstagramReels", ca.INSTAGRAM), new se.k("nativeBlockYoutubeShorts", ca.YOUTUBE), new se.k("nativeBlockTikTok", ca.TIKTOK), new se.k("nativeSnapchatSpotlightBlocking", ca.SNAPCHAT), new se.k("nativeBlockFacebookReels", ca.FACEBOOK), new se.k("nativeBlockTwitter", ca.TWITTER));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static boolean a(SharedPreferences sharedPreferences, ca caVar) {
        String string;
        String string2;
        sharedPreferences.getClass();
        caVar.getClass();
        if (f5901a.values().contains(caVar)) {
            if (kotlin.jvm.internal.l.a(sharedPreferences.getString("accountType", ""), "personal") && (string = sharedPreferences.getString("userId", "")) != null && !qf.k.G0(string) && ((string2 = sharedPreferences.getString("parentViewKidCode", "")) == null || qf.k.G0(string2))) {
                z9 z9Var = z9.f7262a;
                if (!z9.e(sharedPreferences).contains(caVar)) {
                    String string3 = sharedPreferences.getString("appDailyBudgetMinutes", "");
                    List listS0 = qf.k.S0(string3 != null ? string3 : "", new char[]{','});
                    if (!(listS0 instanceof Collection) || !listS0.isEmpty()) {
                        Iterator it = listS0.iterator();
                        while (it.hasNext()) {
                            List listS1 = qf.k.S0((String) it.next(), new char[]{':'});
                            if (listS1.size() == 2 && kotlin.jvm.internal.l.a(listS1.get(0), caVar.name()) && qf.r.r0((String) listS1.get(1)) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
