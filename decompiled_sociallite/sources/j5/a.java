package j5;

import i5.d0;
import i5.m;
import i5.n;
import i5.o;
import i5.q;
import i5.y;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import o4.e0;
import o4.f0;
import r4.v;
import zb.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f8587n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f8588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f8589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f8590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f8591r;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8596f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f8600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f8601k;
    public y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8602m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8592a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8597g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f8588o = iArr;
        int i2 = v.f18493a;
        Charset charset = c.f24027c;
        f8589p = "#!AMR\n".getBytes(charset);
        f8590q = "#!AMR-WB\n".getBytes(charset);
        f8591r = iArr[8];
    }

    @Override // i5.m
    public final void a() {
    }

    public final int b(n nVar) throws f0 {
        boolean z10;
        nVar.k();
        byte[] bArr = this.f8592a;
        nVar.n(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw f0.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i2 = (b >> 3) & 15;
        if (i2 >= 0 && i2 <= 15 && (((z10 = this.b) && (i2 < 10 || i2 > 13)) || (!z10 && (i2 < 12 || i2 > 14)))) {
            return z10 ? f8588o[i2] : f8587n[i2];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.b ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i2);
        throw f0.a(null, sb2.toString());
    }

    public final boolean c(n nVar) {
        nVar.k();
        byte[] bArr = f8589p;
        byte[] bArr2 = new byte[bArr.length];
        nVar.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            nVar.l(bArr.length);
            return true;
        }
        nVar.k();
        byte[] bArr3 = f8590q;
        byte[] bArr4 = new byte[bArr3.length];
        nVar.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        nVar.l(bArr3.length);
        return true;
    }

    @Override // i5.m
    public final void e(o oVar) {
        this.f8600j = oVar;
        this.f8601k = oVar.v(0, 1);
        oVar.p();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    @Override // i5.m
    public final int f(n nVar, d0.a aVar) throws f0 {
        int iB;
        int i2;
        r4.a.j(this.f8601k);
        int i10 = v.f18493a;
        if (nVar.getPosition() == 0 && !c(nVar)) {
            throw f0.a(null, "Could not find AMR header.");
        }
        if (!this.f8602m) {
            this.f8602m = true;
            boolean z10 = this.b;
            String str = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? 16000 : 8000;
            d0 d0Var = this.f8601k;
            o4.n nVar2 = new o4.n();
            nVar2.l = e0.h(str);
            nVar2.f15889m = f8591r;
            nVar2.f15901y = 1;
            nVar2.f15902z = i11;
            d0Var.a(new o4.o(nVar2));
        }
        int i12 = -1;
        if (this.f8595e == 0) {
            try {
                int iB2 = b(nVar);
                this.f8594d = iB2;
                this.f8595e = iB2;
                if (this.f8597g == -1) {
                    nVar.getPosition();
                    this.f8597g = this.f8594d;
                }
                if (this.f8597g == this.f8594d) {
                    this.f8598h++;
                }
                iB = this.f8601k.b(nVar, this.f8595e, true);
                if (iB != -1) {
                    i2 = this.f8595e - iB;
                    this.f8595e = i2;
                    if (i2 <= 0) {
                        this.f8601k.d(this.f8599i + this.f8593c, 1, this.f8594d, 0, null);
                        this.f8593c += 20000;
                    }
                    i12 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iB = this.f8601k.b(nVar, this.f8595e, true);
            if (iB != -1) {
                i2 = this.f8595e - iB;
                this.f8595e = i2;
                if (i2 <= 0) {
                    this.f8601k.d(this.f8599i + this.f8593c, 1, this.f8594d, 0, null);
                    this.f8593c += 20000;
                }
                i12 = 0;
            }
        }
        nVar.h();
        if (!this.f8596f) {
            q qVar = new q(-9223372036854775807L);
            this.l = qVar;
            this.f8600j.q(qVar);
            this.f8596f = true;
        }
        return i12;
    }

    @Override // i5.m
    public final void g(long j10, long j11) {
        this.f8593c = 0L;
        this.f8594d = 0;
        this.f8595e = 0;
        if (j10 != 0) {
            y yVar = this.l;
            if (yVar instanceof a6.a) {
                a6.a aVar = (a6.a) yVar;
                this.f8599i = (Math.max(0L, j10 - aVar.b) * 8000000) / ((long) aVar.f294e);
                return;
            }
        }
        this.f8599i = 0L;
    }

    @Override // i5.m
    public final boolean i(n nVar) {
        return c(nVar);
    }
}
