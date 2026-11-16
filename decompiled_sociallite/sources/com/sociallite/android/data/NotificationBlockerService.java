package com.sociallite.android.data;

import a5.z;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.sociallite.android.MainActivity;
import com.sociallite.android.R;
import ge.c;
import ge.d2;
import ge.i3;
import ge.mb;
import ge.z9;
import i3.f;
import java.util.List;
import k0.o;
import kotlin.jvm.internal.l;
import se.k;
import te.x;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationBlockerService extends NotificationListenerService {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f3516t = x.L(new k("com.instagram.android", "instagram"), new k("com.google.android.youtube", "youtube"), new k("com.zhiliaoapp.musically", "tiktok"), new k("com.ss.android.ugc.trill", "tiktok"), new k("com.snapchat.android", "snapchat"), new k("com.twitter.android", "twitter"), new k("com.twitter.android.lite", "twitter"), new k("com.atebits.Tweetie2", "twitter"), new k("com.facebook.katana", "facebook"), new k("com.facebook.lite", "facebook"), new k("com.facebook.orca", "facebook"), new k("com.linkedin.android", "linkedin"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f3517u = x.L(new k("instagram", "Instagram"), new k("youtube", "YouTube"), new k("tiktok", "TikTok"), new k("snapchat", "Snapchat"), new k("twitter", "X"), new k("facebook", "Facebook"), new k("linkedin", "LinkedIn"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f3518v = x.L(new k("instagram", "sl_msg_instagram"), new k("youtube", "sl_msg_youtube"), new k("tiktok", "sl_msg_tiktok"), new k("snapchat", "sl_msg_snapchat"), new k("twitter", "sl_msg_twitter"), new k("facebook", "sl_msg_facebook"), new k("linkedin", "sl_msg_linkedin"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f3519w;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final void a(StatusBarNotification statusBarNotification, String str) {
        Bitmap bitmapCreateScaledBitmap;
        String strConcat;
        String str2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str3 = (String) f3518v.get(str);
        if (str3 == null) {
            return;
        }
        String str4 = (String) f3517u.get(str);
        if (str4 == null) {
            str4 = str;
        }
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification != null ? notification.extras : null;
        String string = (bundle == null || (charSequence3 = bundle.getCharSequence("android.title")) == null) ? null : charSequence3.toString();
        String string2 = (bundle == null || (charSequence2 = bundle.getCharSequence("android.text")) == null) ? null : charSequence2.toString();
        String string3 = (bundle == null || (charSequence = bundle.getCharSequence("android.bigText")) == null) ? null : charSequence.toString();
        if (string == null) {
            string = str4;
        }
        if (string3 != null) {
            string2 = string3;
        } else if (string2 == null) {
            string2 = "New notification";
        }
        if (bundle != null) {
            try {
                bitmapCreateScaledBitmap = (Bitmap) bundle.getParcelable("android.largeIcon");
            } catch (Exception unused) {
                bitmapCreateScaledBitmap = null;
            }
        } else {
            bitmapCreateScaledBitmap = null;
        }
        String str5 = "/messages";
        String str6 = str4;
        switch (str.hashCode()) {
            case -916346253:
                if (!str.equals("twitter")) {
                    str5 = null;
                }
                break;
            case -873713414:
                if (!str.equals("tiktok")) {
                    str5 = null;
                }
                break;
            case 28903346:
                if (!str.equals("instagram")) {
                    str5 = null;
                } else {
                    str5 = "/direct/inbox/";
                }
                break;
            case 284397090:
                if (!str.equals("snapchat")) {
                    str5 = null;
                } else {
                    str5 = "/web";
                }
                break;
            case 497130182:
                if (!str.equals("facebook")) {
                    str5 = null;
                } else {
                    str5 = "/messages/";
                }
                break;
            default:
                str5 = null;
                break;
        }
        if (str5 != null) {
            switch (str) {
                case "twitter":
                    str2 = "https://x.com";
                    break;
                case "tiktok":
                    str2 = "https://www.tiktok.com";
                    break;
                case "instagram":
                    str2 = "https://www.instagram.com";
                    break;
                case "snapchat":
                    str2 = "https://web.snapchat.com";
                    break;
                case "facebook":
                    str2 = "https://m.facebook.com";
                    break;
                default:
                    str2 = null;
                    break;
            }
            if (str2 != null) {
                strConcat = str2.concat(str5);
            } else {
                strConcat = null;
            }
        } else {
            strConcat = null;
        }
        String strJ = strConcat != null ? z.j("sociallite://open?platform=", str, "&url=", Uri.encode(strConcat)) : "sociallite://open?platform=".concat(str);
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(strJ));
        intent.setFlags(805306368);
        PendingIntent activity = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 201326592);
        f fVar = new f(this, str3);
        int i2 = R.drawable.sociallite_logo_dark;
        Notification notification2 = fVar.f8312t;
        notification2.icon = i2;
        fVar.f8298e = f.b(string);
        fVar.f8299f = f.b(string2);
        fVar.f8305m = f.b(getString(R.string.notifblocker_via_format, str6));
        fVar.f8300g = activity;
        fVar.c(16);
        notification2.when = statusBarNotification.getPostTime();
        fVar.f8304k = true;
        fVar.f8303j = 2;
        fVar.f8307o = "msg";
        notification2.defaults = -1;
        notification2.flags |= 1;
        fVar.f8301h = activity;
        fVar.c(128);
        f fVar2 = new f(this, str3);
        fVar2.f8312t.icon = R.drawable.sociallite_logo_dark;
        fVar2.f8298e = f.b("SocialLite");
        fVar2.f8299f = f.b(getString(R.string.notifblocker_new_message_format, str6));
        fVar.f8309q = fVar2.a();
        if (bitmapCreateScaledBitmap != null) {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = fVar.f8295a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmapCreateScaledBitmap.getWidth() > dimensionPixelSize || bitmapCreateScaledBitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmapCreateScaledBitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmapCreateScaledBitmap.getHeight())));
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.ceil(((double) bitmapCreateScaledBitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmapCreateScaledBitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f1164k;
            bitmapCreateScaledBitmap.getClass();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = bitmapCreateScaledBitmap;
            fVar.f8302i = iconCompat;
        }
        if (string2.length() > 50) {
            o oVar = new o(6, (byte) 0);
            oVar.f8999v = f.b(string2);
            fVar.d(oVar);
        }
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.notify("sl_".concat(str), statusBarNotification.getId(), fVar.a());
            }
            try {
                cancelNotification(statusBarNotification.getKey());
            } catch (Exception e10) {
                Log.w("NotifService", "Could not cancel original: " + e10.getMessage());
            }
        } catch (Exception e11) {
            Log.e("NotifService", "Failed to post replacement: " + e11.getMessage(), e11);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        super.onListenerConnected();
        f3519w = true;
        ge.f.d(this);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerDisconnected() {
        super.onListenerDisconnected();
        f3519w = false;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification statusBarNotification) {
        String str;
        if (l.a(d2.B(this).f6283a.getString("accountType", "personal"), "kid") || statusBarNotification == null || l.a(statusBarNotification.getPackageName(), getApplicationContext().getPackageName()) || (str = (String) f3516t.get(statusBarNotification.getPackageName())) == null) {
            return;
        }
        try {
            i3 i3VarB = d2.B(this);
            z9 z9Var = z9.f7262a;
            if (z9.b(i3VarB, str)) {
                return;
            }
            boolean zB = false;
            boolean z10 = i3VarB.getBoolean("notificationRedirectEnabled", false);
            boolean z11 = i3VarB.getBoolean("redirect_notif_".concat(str), false);
            boolean zU = c.U(i3VarB);
            boolean zA = zU ? ge.f.a(i3VarB) : i3VarB.getBoolean("appBlockingEnabled", false);
            if (!zU) {
                List list = ge.f.f6116a;
                zB = ge.f.b(i3VarB, str, statusBarNotification.getPackageName());
            } else if (mb.f6571i.c(this).O0()) {
                String packageName = statusBarNotification.getPackageName();
                packageName.getClass();
                if (c.k(i3VarB, packageName, c.R(this, packageName))) {
                    zB = true;
                }
            }
            if (z10 && z11) {
                a(statusBarNotification, str);
            } else if (zA && zB) {
                try {
                    cancelNotification(statusBarNotification.getKey());
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            Log.e("NotifService", "Error processing notification: " + e10.getMessage(), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap, int i2) {
        String str;
        super.onNotificationRemoved(statusBarNotification, rankingMap, i2);
        if (statusBarNotification == null || (str = (String) f3516t.get(statusBarNotification.getPackageName())) == null) {
            return;
        }
        if (i2 == 3 || i2 == 8) {
            try {
                NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.cancel("sl_".concat(str), statusBarNotification.getId());
                }
            } catch (Exception unused) {
            }
        }
    }
}
