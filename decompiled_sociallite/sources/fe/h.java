package fe;

import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.Constants;
import com.sociallite.android.MainActivity;
import com.sociallite.android.R;
import com.sociallite.android.data.BlockedAppActivity;
import com.sociallite.android.data.LinkedKid;
import com.sociallite.android.data.NotificationBlockerService;
import com.sociallite.android.data.UninstallProtectionReceiver;
import com.sociallite.android.data.WebBlockerVpnService;
import ge.ca;
import ge.gb;
import ge.h3;
import ge.i3;
import ge.mb;
import ge.r4;
import ge.z7;
import h2.p2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ke.f3;
import ke.r2;
import me.bh;
import me.k6;
import me.ln;
import r0.y6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements hf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5180t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5181u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5182v;

    public /* synthetic */ h(Context context, String str, boolean z10) {
        this.f5180t = 11;
        this.f5181u = str;
        this.f5182v = context;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0429  */
    @Override // hf.a
    public final Object invoke() {
        int iC;
        boolean z10 = true;
        Intent intent = null;
        int i2 = 0;
        switch (this.f5180t) {
            case 0:
                ge.k1 k1Var = (ge.k1) this.f5181u;
                MainActivity mainActivity = (MainActivity) this.f5182v;
                int i10 = MainActivity.D;
                ge.k1.M(k1Var, new j(mainActivity, i2), 1);
                return se.a0.f19710a;
            case 1:
                ((v0.u0) this.f5182v).setValue((a) this.f5181u);
                return se.a0.f19710a;
            case 2:
                ((ge.t) this.f5181u).a((a1.n) this.f5182v, null);
                return se.a0.f19710a;
            case 3:
                ((ge.k1) this.f5181u).D((String) this.f5182v);
                return se.a0.f19710a;
            case 4:
                ((hf.c) this.f5181u).invoke(new se.m((Offerings) this.f5182v));
                return se.a0.f19710a;
            case 5:
                ((hf.c) this.f5181u).invoke(new se.m(new se.l(new IllegalStateException(((PurchasesError) this.f5182v).getMessage()))));
                return se.a0.f19710a;
            case 6:
                return BlockedAppActivity.onCreate$lambda$10$lambda$6$lambda$5((BlockedAppActivity) this.f5181u, (ca) this.f5182v);
            case 7:
                mb mbVar = (mb) this.f5181u;
                return Boolean.valueOf(mbVar.H0() && !qf.k.G0(mbVar.X()) && ((PowerManager) this.f5182v).isInteractive());
            case 8:
                Context context = (Context) this.f5181u;
                NotificationManager notificationManager = (NotificationManager) this.f5182v;
                ComponentName componentName = new ComponentName(context, (Class<?>) NotificationBlockerService.class);
                if (Build.VERSION.SDK_INT < 27) {
                    String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                    if (string != null) {
                        List listS0 = qf.k.S0(string, new char[]{':'});
                        if ((listS0 instanceof Collection) && listS0.isEmpty()) {
                            z10 = false;
                        } else {
                            Iterator it = listS0.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.l.a(ComponentName.unflattenFromString((String) it.next()), componentName)) {
                                }
                            }
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } else if (notificationManager == null || !notificationManager.isNotificationListenerAccessGranted(componentName)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 9:
                WebBlockerVpnService webBlockerVpnService = (WebBlockerVpnService) this.f5181u;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f5182v;
                int i11 = WebBlockerVpnService.f3521z;
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32767);
                while (webBlockerVpnService.f3522t) {
                    try {
                        byteBufferAllocate.clear();
                        try {
                            int i12 = fileInputStream.read(byteBufferAllocate.array());
                            if (i12 > 0) {
                                byteBufferAllocate.limit(i12);
                                webBlockerVpnService.d(byteBufferAllocate, i12, fileOutputStream);
                            }
                        } catch (Exception e10) {
                            if (webBlockerVpnService.f3522t) {
                                Log.w("WebBlockerVPN", "read() failed: " + e10.getMessage());
                                break;
                            }
                            fileInputStream.close();
                            fileOutputStream.close();
                            parcelFileDescriptor.close();
                            return se.a0.f19710a;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            break;
                        } catch (Exception unused) {
                        }
                        try {
                            fileOutputStream.close();
                            break;
                        } catch (Exception unused2) {
                        }
                        try {
                            parcelFileDescriptor.close();
                            throw th;
                        } catch (Exception unused3) {
                            throw th;
                        }
                    }
                }
                try {
                    fileInputStream.close();
                    break;
                } catch (Exception unused4) {
                }
                try {
                    fileOutputStream.close();
                    break;
                } catch (Exception unused5) {
                }
                try {
                    parcelFileDescriptor.close();
                    break;
                } catch (Exception unused6) {
                }
                return se.a0.f19710a;
            case 10:
                ke.q1 q1Var = (ke.q1) this.f5181u;
                v0.y0 y0Var = (v0.y0) this.f5182v;
                int i13 = y0Var.i();
                int i14 = q1Var.f9712a;
                y0Var.k(i13 != i14 ? i14 : -1);
                return se.a0.f19710a;
            case 11:
                String str = (String) this.f5181u;
                Context context2 = (Context) this.f5182v;
                if (str != null) {
                    int i15 = f3.f9461a;
                    context2.getClass();
                    String string2 = context2.getString(R.string.referral_share_pro_format, str);
                    string2.getClass();
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.TEXT", string2);
                    Intent intentCreateChooser = Intent.createChooser(intent2, context2.getString(R.string.referral_share_chooser_title));
                    intentCreateChooser.addFlags(268435456);
                    context2.startActivity(intentCreateChooser);
                }
                return se.a0.f19710a;
            case 12:
                ((v0.u0) this.f5182v).setValue((k6) this.f5181u);
                return se.a0.f19710a;
            case 13:
                mb mbVar2 = (mb) this.f5181u;
                r4 r4Var = (r4) this.f5182v;
                mbVar2.getClass();
                r4Var.getClass();
                i3 i3Var = mbVar2.b;
                h3 h3VarK = e4.w0.k(i3Var, i3Var);
                h3VarK.f6230a.put("nativeFacebookFeedSection", r4Var.f6793t);
                h3VarK.a(false);
                mbVar2.S0();
                return se.a0.f19710a;
            case 14:
                Context context3 = (Context) this.f5181u;
                ge.e eVar = (ge.e) this.f5182v;
                vf.d0 d0Var = gb.f6210a;
                String str2 = eVar.f6042a;
                context3.getClass();
                LinkedHashSet linkedHashSet = gb.f6213e;
                synchronized (linkedHashSet) {
                    linkedHashSet.add(str2);
                }
                gb.f6210a.j(null);
                return se.a0.f19710a;
            case 15:
                v0.u0 u0Var = (v0.u0) this.f5181u;
                v0.y0 y0Var2 = (v0.y0) this.f5182v;
                u0Var.setValue(null);
                y0Var2.k(y0Var2.i() + 1);
                return se.a0.f19710a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                Context context4 = (Context) this.f5181u;
                f.j jVar = (f.j) this.f5182v;
                Object systemService = context4.getApplicationContext().getSystemService("device_policy");
                if ((systemService instanceof DevicePolicyManager ? (DevicePolicyManager) systemService : null) != null) {
                    intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
                    intent.putExtra("android.app.extra.DEVICE_ADMIN", new ComponentName(context4.getApplicationContext(), (Class<?>) UninstallProtectionReceiver.class));
                    intent.putExtra("android.app.extra.ADD_EXPLANATION", context4.getString(R.string.uninstall_protection_explanation));
                }
                if (intent != null) {
                    jVar.a(intent);
                }
                return se.a0.f19710a;
            case 17:
                ((hf.c) this.f5181u).invoke(this.f5182v);
                return se.a0.f19710a;
            case 18:
                hf.a aVar = (hf.a) this.f5181u;
                v0.y0 y0Var3 = (v0.y0) this.f5182v;
                if (y0Var3.i() >= 0) {
                    ke.c1.x(y0Var3, -1);
                } else {
                    aVar.invoke();
                }
                return se.a0.f19710a;
            case 19:
                p2 p2Var = (p2) this.f5181u;
                v0.u0 u0Var2 = (v0.u0) this.f5182v;
                if (p2Var != null) {
                    ((h2.m1) p2Var).a();
                }
                ((hf.a) u0Var2.getValue()).invoke();
                return se.a0.f19710a;
            case 20:
                mb mbVar3 = (mb) this.f5181u;
                String str3 = ((bh) this.f5182v).f10931a;
                mbVar3.getClass();
                i3 i3Var2 = mbVar3.b;
                h3 h3VarK2 = e4.w0.k(i3Var2, i3Var2);
                h3VarK2.f6230a.put("onboardingGoal", str3);
                h3VarK2.a(false);
                mbVar3.S0();
                return se.a0.f19710a;
            case 21:
                w1.a aVar2 = (w1.a) this.f5181u;
                v0.u0 u0Var3 = (v0.u0) this.f5182v;
                ((w1.b) aVar2).a(0);
                u0Var3.setValue(null);
                return se.a0.f19710a;
            case 22:
                ((hf.c) this.f5181u).invoke(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + ((Context) this.f5182v).getPackageName())));
                return se.a0.f19710a;
            case 23:
                ((hf.c) this.f5181u).invoke((LinkedKid) this.f5182v);
                return se.a0.f19710a;
            case 24:
                ((v0.u0) this.f5182v).setValue((ln) this.f5181u);
                return se.a0.f19710a;
            case 25:
                Context context5 = (Context) this.f5181u;
                z7 z7Var = (z7) this.f5182v;
                z7Var.getClass();
                Intent intent3 = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
                intent3.setData(Uri.fromParts("package", z7Var.f7253a.getPackageName(), null));
                intent3.addFlags(268435456);
                context5.startActivity(intent3);
                return se.a0.f19710a;
            case 26:
                y6 y6Var = (y6) this.f5181u;
                ((hf.c) this.f5182v).invoke(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(y6Var.h())}, 1)) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(y6Var.d())}, 1)));
                return se.a0.f19710a;
            case 27:
                Context context6 = (Context) this.f5181u;
                ca caVar = (ca) this.f5182v;
                Intent intent4 = new Intent(context6, (Class<?>) MainActivity.class);
                intent4.setAction("android.intent.action.VIEW");
                String lowerCase = caVar.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                intent4.setData(Uri.parse("sociallite://open?platform=".concat(lowerCase)));
                try {
                    iC = r2.c(caVar, "painted");
                    break;
                } catch (Exception unused7) {
                    iC = android.R.drawable.ic_menu_share;
                }
                String lowerCase2 = caVar.name().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                String strConcat = "shortcut_".concat(lowerCase2);
                String str4 = caVar.f5992t;
                String string3 = context6.getString(R.string.shortcut_long_label_format, str4);
                PorterDuff.Mode mode = IconCompat.f1164k;
                IconCompat iconCompatA = IconCompat.a(context6.getResources(), context6.getPackageName(), iC);
                Intent[] intentArr = {intent4};
                if (TextUtils.isEmpty(str4)) {
                    w4.d.j("Shortcut must have a non-empty label");
                    return null;
                }
                int i16 = Build.VERSION.SDK_INT;
                ShortcutManager shortcutManager = (ShortcutManager) context6.getSystemService(ShortcutManager.class);
                ShortcutInfo.Builder intents = new ShortcutInfo.Builder(context6, strConcat).setShortLabel(str4).setIntents(intentArr);
                intents.setIcon(iconCompatA.d(context6));
                if (!TextUtils.isEmpty(string3)) {
                    intents.setLongLabel(string3);
                }
                if (!TextUtils.isEmpty(null)) {
                    intents.setDisabledMessage(null);
                }
                intents.setRank(0);
                if (i16 >= 29) {
                    intents.setLongLived(false);
                } else {
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putBoolean("extraLongLived", false);
                    intents.setExtras(persistableBundle);
                }
                if (i16 >= 33) {
                    l3.a.c(intents);
                }
                shortcutManager.requestPinShortcut(intents.build(), null);
                return se.a0.f19710a;
            case 28:
                mb mbVar4 = (mb) this.f5181u;
                Set set = (Set) this.f5182v;
                mbVar4.getClass();
                set.getClass();
                i3 i3Var3 = mbVar4.b;
                h3 h3VarK3 = e4.w0.k(i3Var3, i3Var3);
                h3VarK3.putStringSet("sleepAllowedPackages", new HashSet(set));
                h3VarK3.a(false);
                mbVar4.S0();
                return se.a0.f19710a;
            default:
                ((hf.e) this.f5181u).invoke(Boolean.TRUE, new l0((mb) this.f5182v, 16));
                return se.a0.f19710a;
        }
    }

    public /* synthetic */ h(Object obj, int i2, Object obj2) {
        this.f5180t = i2;
        this.f5181u = obj;
        this.f5182v = obj2;
    }
}
