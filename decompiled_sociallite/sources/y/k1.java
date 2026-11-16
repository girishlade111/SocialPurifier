package y;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends ze.i implements hf.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f23437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f23438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ long f23439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l1 f23440w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, xe.d dVar) {
        super(2, dVar);
        this.f23440w = l1Var;
    }

    @Override // ze.a
    public final xe.d create(Object obj, xe.d dVar) {
        k1 k1Var = new k1(this.f23440w, dVar);
        k1Var.f23439v = ((b3.o) obj).f1619a;
        return k1Var;
    }

    @Override // hf.e
    public final Object invoke(Object obj, Object obj2) {
        long j10 = ((b3.o) obj).f1619a;
        k1 k1Var = new k1(this.f23440w, (xe.d) obj2);
        k1Var.f23439v = j10;
        return k1Var.invokeSuspend(se.a0.f19710a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // ze.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        int i2 = this.f23438u;
        l1 l1Var = this.f23440w;
        ye.a aVar = ye.a.f23667t;
        if (i2 == 0) {
            se.a.f(obj);
            j10 = this.f23439v;
            z1.d dVar = l1Var.f23446f;
            this.f23439v = j10;
            this.f23438u = 1;
            obj = dVar.b(j10, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            j10 = this.f23439v;
            se.a.f(obj);
        } else {
            if (i2 == 2) {
                j11 = this.f23437t;
                j10 = this.f23439v;
                se.a.f(obj);
                j12 = ((b3.o) obj).f1619a;
                z1.d dVar2 = l1Var.f23446f;
                long jD = b3.o.d(j11, j12);
                this.f23439v = j10;
                this.f23437t = j12;
                this.f23438u = 3;
                obj = dVar2.a(jD, j12, this);
                if (obj != aVar) {
                    j13 = j10;
                    j14 = j12;
                }
                return aVar;
            }
            if (i2 != 3) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = this.f23437t;
            j13 = this.f23439v;
            se.a.f(obj);
        }
        return new b3.o(b3.o.d(j13, b3.o.d(j14, ((b3.o) obj).f1619a)));
        long jD2 = b3.o.d(j10, ((b3.o) obj).f1619a);
        this.f23439v = j10;
        this.f23437t = jD2;
        this.f23438u = 2;
        obj = l1Var.b(jD2, this);
        if (obj != aVar) {
            j11 = jD2;
            j12 = ((b3.o) obj).f1619a;
            z1.d dVar3 = l1Var.f23446f;
            long jD3 = b3.o.d(j11, j12);
            this.f23439v = j10;
            this.f23437t = j12;
            this.f23438u = 3;
            obj = dVar3.a(jD3, j12, this);
            if (obj != aVar) {
                j13 = j10;
                j14 = j12;
                return new b3.o(b3.o.d(j13, b3.o.d(j14, ((b3.o) obj).f1619a)));
            }
        }
        return aVar;
    }
}
