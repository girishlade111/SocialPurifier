package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2809c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2810a;
    public final int b;

    static {
        byte b = (byte) (0 | 1);
        if (b != 1) {
            StringBuilder sb2 = new StringBuilder();
            if ((b & 1) == 0) {
                sb2.append(" hasDifferentDmaOwner");
            }
            w4.d.l("Missing required properties:".concat(String.valueOf(sb2)));
            return;
        }
        byte b10 = (byte) (0 | 1);
        if (b10 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb3.append(" hasDifferentDmaOwner");
            }
            w4.d.l("Missing required properties:".concat(String.valueOf(sb3)));
            return;
        }
        byte b11 = (byte) (0 | 1);
        if (b11 == 1) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        if ((b11 & 1) == 0) {
            sb4.append(" hasDifferentDmaOwner");
        }
        w4.d.l("Missing required properties:".concat(String.valueOf(sb4)));
    }

    public m0(int i2, int i10) {
        this.f2810a = i2;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return v.g.a(this.f2810a, m0Var.f2810a) && v.g.a(this.b, m0Var.b);
    }

    public final int hashCode() {
        return ((v.g.e(this.f2810a) ^ (-485106924)) * 583896283) ^ v.g.e(this.b);
    }

    public final String toString() {
        String str;
        String str2;
        int i2 = this.f2810a;
        if (i2 == 1) {
            str = "ALL_CHECKS";
        } else if (i2 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i2 != 3) {
            str = i2 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        int i10 = this.b;
        if (i10 == 1) {
            str2 = "READ_AND_WRITE";
        } else if (i10 != 2) {
            str2 = i10 != 3 ? "null" : "WRITE_ONLY";
        } else {
            str2 = "READ_ONLY";
        }
        return t8.c.j("FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }
}
