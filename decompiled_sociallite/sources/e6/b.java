package e6;

import ac.b1;
import ac.f0;
import ac.i0;
import ac.q;
import ac.z0;
import d8.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f4430v = new q(new m(7), z0.f597t);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f4431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long[] f4432u;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public b(b1 b1Var) {
        int i2 = b1Var.f482w;
        long j10 = -9223372036854775807L;
        int i10 = 0;
        if (i2 == 1) {
            f0 f0VarListIterator = b1Var.listIterator(0);
            Object next = f0VarListIterator.next();
            if (f0VarListIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i10 < 4 && f0VarListIterator.hasNext()) {
                    sb2.append(", ");
                    sb2.append(f0VarListIterator.next());
                    i10++;
                }
                if (f0VarListIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            a aVar = (a) next;
            long j11 = aVar.b;
            long j12 = aVar.f4428c;
            long j13 = j11 == -9223372036854775807L ? 0L : j11;
            i0 i0Var = aVar.f4427a;
            if (j12 == -9223372036854775807L) {
                this.f4431t = i0.u(i0Var);
                this.f4432u = new long[]{j13};
                return;
            } else {
                f0 f0Var = i0.f523u;
                this.f4431t = i0.v(i0Var, b1.f480x);
                this.f4432u = new long[]{j13, j12 + j13};
                return;
            }
        }
        long[] jArr = new long[i2 * 2];
        this.f4432u = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        b1 b1VarW = i0.w(f4430v, b1Var);
        int i11 = 0;
        while (i10 < b1VarW.f482w) {
            a aVar2 = (a) b1VarW.get(i10);
            long j14 = aVar2.b;
            long j15 = aVar2.f4428c;
            i0 i0Var2 = aVar2.f4427a;
            j14 = j14 == j10 ? 0L : j14;
            long j16 = j14 + j15;
            if (i11 != 0) {
                int i12 = i11 - 1;
                long j17 = this.f4432u[i12];
                if (j17 < j14) {
                    this.f4432u[i11] = j14;
                    arrayList.add(i0Var2);
                    i11++;
                } else if (j17 == j14 && ((i0) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, i0Var2);
                } else {
                    r4.a.v("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f4432u[i12] = j14;
                    arrayList.set(i12, i0Var2);
                }
            } else {
                this.f4432u[i11] = j14;
                arrayList.add(i0Var2);
                i11++;
            }
            if (j15 != j10) {
                this.f4432u[i11] = j16;
                arrayList.add(b1.f480x);
                i11++;
            }
            i10++;
            j10 = j10;
        }
        this.f4431t = i0.q(arrayList);
    }

    @Override // e6.d
    public final int f(long j10) {
        int iB = v.b(this.f4432u, j10, false);
        if (iB < this.f4431t.size()) {
            return iB;
        }
        return -1;
    }

    @Override // e6.d
    public final long g(int i2) {
        r4.a.e(i2 < this.f4431t.size());
        return this.f4432u[i2];
    }

    @Override // e6.d
    public final List k(long j10) {
        int iD = v.d(this.f4432u, j10, false);
        if (iD != -1) {
            return (i0) this.f4431t.get(iD);
        }
        f0 f0Var = i0.f523u;
        return b1.f480x;
    }

    @Override // e6.d
    public final int m() {
        return this.f4431t.size();
    }
}
