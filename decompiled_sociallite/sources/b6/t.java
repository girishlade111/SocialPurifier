package b6;

import i5.c0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1748a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f1749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f1751e;

    public t(boolean z10, String str, int i2, byte[] bArr, int i10, int i11, byte[] bArr2) {
        byte b = 0;
        int i12 = 1;
        r4.a.e((i2 == 0) ^ (bArr2 == null));
        this.f1748a = z10;
        this.b = str;
        this.f1750d = i2;
        this.f1751e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i12 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    r4.a.v("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f1749c = new c0(i12, i10, i11, bArr);
    }
}
