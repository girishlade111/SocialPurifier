package ud;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f21250e = new e(f.b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21251a;
    public final f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21253d;

    public e(f fVar, int i2, int i10, int i11) {
        this.b = fVar;
        this.f21251a = i2;
        this.f21252c = i10;
        this.f21253d = i11;
    }

    public final e a(int i2) {
        int i10;
        f dVar = this.b;
        int i11 = this.f21251a;
        int i12 = this.f21253d;
        if (i11 == 4 || i11 == 2) {
            int[] iArr = c.b[i11];
            i11 = 0;
            int i13 = iArr[0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            dVar.getClass();
            i12 += i15;
            dVar = new d(dVar, i14, i15);
        }
        int i16 = this.f21252c;
        if (i16 == 0 || i16 == 31) {
            i10 = 18;
        } else {
            i10 = i16 == 62 ? 9 : 8;
        }
        int i17 = i16 + 1;
        e eVar = new e(dVar, i11, i17, i12 + i10);
        return i17 == 2078 ? eVar.b(i2 + 1) : eVar;
    }

    public final e b(int i2) {
        int i10 = this.f21252c;
        if (i10 == 0) {
            return this;
        }
        f fVar = this.b;
        fVar.getClass();
        return new e(new a(fVar, i2 - i10, i10), this.f21251a, 0, this.f21253d);
    }

    public final boolean c(e eVar) {
        int i2;
        int i10 = this.f21253d + (c.b[this.f21251a][eVar.f21251a] >> 16);
        int i11 = eVar.f21252c;
        if (i11 > 0 && ((i2 = this.f21252c) == 0 || i2 > i11)) {
            i10 += 10;
        }
        return i10 <= eVar.f21253d;
    }

    public final e d(int i2, int i10) {
        int i11 = this.f21253d;
        f dVar = this.b;
        int i12 = this.f21251a;
        if (i2 != i12) {
            int i13 = c.b[i12][i2];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            dVar.getClass();
            i11 += i15;
            dVar = new d(dVar, i14, i15);
        }
        int i16 = i2 == 2 ? 4 : 5;
        dVar.getClass();
        return new e(new d(dVar, i10, i16), i2, 0, i11 + i16);
    }

    public final e e(int i2, int i10) {
        int i11 = this.f21251a;
        int i12 = i11 == 2 ? 4 : 5;
        int i13 = c.f21247d[i11][i2];
        f fVar = this.b;
        fVar.getClass();
        return new e(new d(new d(fVar, i13, i12), i10, 5), i11, 0, this.f21253d + i12 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f21245a[this.f21251a], Integer.valueOf(this.f21253d), Integer.valueOf(this.f21252c));
    }
}
