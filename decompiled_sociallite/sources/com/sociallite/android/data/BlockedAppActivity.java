package com.sociallite.android.data;

import a8.j;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.n;
import com.sociallite.android.MainActivity;
import fe.h;
import ge.ca;
import ge.d2;
import ge.s1;
import hf.a;
import java.util.Locale;
import kotlin.jvm.internal.l;
import se.a0;
import v0.m;
import v0.p0;
import v0.q;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class BlockedAppActivity extends n {
    public static final int $stable = 8;
    public static final s1 Companion = new s1();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInApp() {
        return getIntent().getBooleanExtra("in_app", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void leaveBlockedApp() {
        if (getInApp()) {
            finish();
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
        finish();
    }

    private static final String onCreate$lambda$0(u0 u0Var) {
        return (String) u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public static final a0 onCreate$lambda$10(String str, boolean z10, ca caVar, BlockedAppActivity blockedAppActivity, u0 u0Var, v0.n nVar, int i2) {
        a aVar;
        q qVar;
        boolean zH;
        Object objO;
        if ((i2 & 3) == 2) {
            q qVar2 = (q) nVar;
            if (qVar2.E()) {
                qVar2.T();
            } else {
                String strOnCreate$lambda$0 = onCreate$lambda$0(u0Var);
                p0 p0Var = m.f21654a;
                if (z10 || caVar == null) {
                    q qVar3 = (q) nVar;
                    qVar3.Z(-1235764116);
                    qVar3.q(false);
                    aVar = null;
                } else {
                    q qVar4 = (q) nVar;
                    qVar4.Z(-1236319914);
                    boolean zH2 = qVar4.h(blockedAppActivity) | qVar4.d(caVar.ordinal());
                    Object objO2 = qVar4.O();
                    if (zH2 || objO2 == p0Var) {
                        objO2 = new h(blockedAppActivity, 6, caVar);
                        qVar4.i0(objO2);
                    }
                    aVar = (a) objO2;
                    qVar4.q(false);
                }
                a aVar2 = aVar;
                qVar = (q) nVar;
                zH = qVar.h(blockedAppActivity);
                objO = qVar.O();
                if (zH || objO == p0Var) {
                    objO = new j(blockedAppActivity, 9);
                    qVar.i0(objO);
                }
                d2.a(str, strOnCreate$lambda$0, aVar2, (a) objO, qVar, 0);
            }
        } else {
            String strOnCreate$lambda$1 = onCreate$lambda$0(u0Var);
            p0 p0Var2 = m.f21654a;
            if (z10) {
                q qVar5 = (q) nVar;
                qVar5.Z(-1235764116);
                qVar5.q(false);
                aVar = null;
            } else {
                q qVar6 = (q) nVar;
                qVar6.Z(-1235764116);
                qVar6.q(false);
                aVar = null;
            }
            a aVar3 = aVar;
            qVar = (q) nVar;
            zH = qVar.h(blockedAppActivity);
            objO = qVar.O();
            if (zH) {
                objO = new j(blockedAppActivity, 9);
                qVar.i0(objO);
            } else {
                objO = new j(blockedAppActivity, 9);
                qVar.i0(objO);
            }
            d2.a(str, strOnCreate$lambda$1, aVar3, (a) objO, qVar, 0);
        }
        return a0.f19710a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 onCreate$lambda$10$lambda$6$lambda$5(BlockedAppActivity blockedAppActivity, ca caVar) {
        Intent intent = new Intent(blockedAppActivity, (Class<?>) MainActivity.class);
        intent.addFlags(335544320);
        intent.setAction("android.intent.action.VIEW");
        String lowerCase = caVar.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        intent.setData(Uri.parse("sociallite://open?platform=".concat(lowerCase)));
        blockedAppActivity.startActivity(intent);
        blockedAppActivity.finish();
        return a0.f19710a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 onCreate$lambda$10$lambda$9$lambda$8(BlockedAppActivity blockedAppActivity) {
        if (!blockedAppActivity.getInApp()) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            blockedAppActivity.startActivity(intent);
        }
        blockedAppActivity.finish();
        return a0.f19710a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x0185  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    @Override // androidx.activity.n, i3.c, android.app.Activity
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sociallite.android.data.BlockedAppActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005a  */
    @Override // androidx.activity.n, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean z10;
        intent.getClass();
        boolean zA = l.a(getIntent().getStringExtra("package_name"), intent.getStringExtra("package_name"));
        if (l.a(getIntent().getStringExtra("platform"), intent.getStringExtra("platform"))) {
            z10 = (getIntent().getBooleanExtra("in_app", false) == intent.getBooleanExtra("in_app", false) && getIntent().getBooleanExtra("sleep_block", false) == intent.getBooleanExtra("sleep_block", false) && getIntent().getBooleanExtra("daily_limit_block", false) == intent.getBooleanExtra("daily_limit_block", false)) ? false : true;
        }
        super.onNewIntent(intent);
        if ((z10 || !zA) && !l.a(d2.B(this).f6283a.getString("accountType", ""), "kid")) {
            setIntent(intent);
            recreate();
        } else {
            if (!l.a(d2.B(this).f6283a.getString("accountType", ""), "kid") || zA) {
                return;
            }
            setIntent(intent);
            recreate();
        }
    }
}
