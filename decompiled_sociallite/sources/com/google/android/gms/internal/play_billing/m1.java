package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static final m1 b = new m1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f3083c = new m1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f3084d = new m1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m1 f3085e = new m1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m1 f3086f = new m1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m1 f3087g = new m1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m1 f3088h = new m1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m1 f3089i = new m1(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3090a;

    public /* synthetic */ m1(int i2) {
        this.f3090a = i2;
    }

    public final boolean a(int i2) {
        w3 w3Var;
        switch (this.f3090a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 2:
                return t3.a(i2) != null;
            case 3:
                if (i2 == 0) {
                    w3Var = w3.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    w3Var = w3.PURCHASES_UPDATED_ACTION;
                } else if (i2 != 2) {
                    w3Var = i2 != 3 ? null : w3.ALTERNATIVE_BILLING_ACTION;
                } else {
                    w3Var = w3.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return w3Var != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
