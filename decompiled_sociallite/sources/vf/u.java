package vf;

import androidx.lifecycle.j0;
import h2.g3;
import java.util.NoSuchElementException;
import ke.c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hg.v f22375a = new hg.v("NO_VALUE");
    public static final hg.v b = new hg.v("NONE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hg.v f22376c = new hg.v("PENDING");

    public static final t a(int i2, int i10, uf.a aVar) {
        if (i2 < 0) {
            w4.d.e(c1.i("replay cannot be negative, but was ", i2));
            return null;
        }
        if (i10 < 0) {
            w4.d.e(c1.i("extraBufferCapacity cannot be negative, but was ", i10));
            return null;
        }
        if (i2 <= 0 && i10 <= 0 && aVar != uf.a.f21282t) {
            w4.d.k("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", aVar);
            return null;
        }
        int i11 = i10 + i2;
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        return new t(i2, i11, aVar);
    }

    public static final d0 b(Object obj) {
        if (obj == null) {
            obj = wf.c.b;
        }
        return new d0(obj);
    }

    public static final void c(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    public static final f d(f fVar) {
        return ((fVar instanceof b0) || (fVar instanceof e)) ? fVar : new e(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0051, B:28:0x0066, B:30:0x006e, B:20:0x0046, B:23:0x004d), top: B:47:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r1.b(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [uf.q] */
    /* JADX WARN: Type inference failed for: r8v1, types: [uf.i] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [uf.i] */
    /* JADX WARN: Type inference failed for: r8v3, types: [uf.i] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0080 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(vf.g r7, uf.q r8, boolean r9, ze.c r10) {
        /*
            boolean r0 = r10 instanceof vf.h
            if (r0 == 0) goto L13
            r0 = r10
            vf.h r0 = (vf.h) r0
            int r1 = r0.f22334y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22334y = r1
            goto L18
        L13:
            vf.h r0 = new vf.h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f22333x
            int r1 = r0.f22334y
            r2 = 0
            r3 = 2
            r4 = 1
            ye.a r5 = ye.a.f23667t
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L37
            boolean r9 = r0.f22332w
            uf.b r7 = r0.f22331v
            uf.i r8 = r0.f22330u
            vf.g r1 = r0.f22329t
            se.a.f(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L51
        L35:
            r7 = move-exception
            goto L8b
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            w4.d.l(r7)
            r7 = 0
            return r7
        L3e:
            boolean r9 = r0.f22332w
            uf.b r7 = r0.f22331v
            uf.i r8 = r0.f22330u
            vf.g r1 = r0.f22329t
            se.a.f(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4a:
            se.a.f(r10)
            uf.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L51:
            r0.f22329t = r7     // Catch: java.lang.Throwable -> L35
            r0.f22330u = r8     // Catch: java.lang.Throwable -> L35
            r0.f22331v = r10     // Catch: java.lang.Throwable -> L35
            r0.f22332w = r9     // Catch: java.lang.Throwable -> L35
            r0.f22334y = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L62
            goto L82
        L62:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f22329t = r1     // Catch: java.lang.Throwable -> L35
            r0.f22330u = r8     // Catch: java.lang.Throwable -> L35
            r0.f22331v = r7     // Catch: java.lang.Throwable -> L35
            r0.f22332w = r9     // Catch: java.lang.Throwable -> L35
            r0.f22334y = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L82:
            return r5
        L83:
            if (r9 == 0) goto L88
            r8.e(r2)
        L88:
            se.a0 r7 = se.a0.f19710a
            return r7
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r10 = move-exception
            if (r9 == 0) goto La5
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L96
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L96:
            if (r2 != 0) goto La2
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La2:
            r8.e(r2)
        La5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.u.e(vf.g, uf.q, boolean, ze.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [hf.e] */
    /* JADX WARN: Type inference failed for: r5v0, types: [vf.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [hf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public static final Object f(f fVar, hf.e eVar, ze.c cVar) {
        o oVar;
        ?? r9;
        kotlin.jvm.internal.w wVar;
        wf.a e10;
        m0.z zVar;
        ?? r10;
        hg.v vVar = wf.c.b;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.f22359x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f22359x = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(cVar);
            }
        } else {
            oVar = new o(cVar);
        }
        Object obj = oVar.f22358w;
        int i10 = oVar.f22359x;
        if (i10 == 0) {
            se.a.f(obj);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            wVar2.f9988t = vVar;
            m0.z zVar2 = new m0.z((Object) eVar, 8, wVar2);
            try {
                oVar.f22355t = (ze.i) eVar;
                oVar.f22356u = wVar2;
                oVar.f22357v = zVar2;
                oVar.f22359x = 1;
                Object objA = fVar.a(zVar2, oVar);
                ye.a aVar = ye.a.f23667t;
                if (objA == aVar) {
                    return aVar;
                }
                r10 = eVar;
                wVar = wVar2;
            } catch (wf.a e11) {
                r9 = eVar;
                wVar = wVar2;
                e10 = e11;
                zVar = zVar2;
                r10 = r9;
                if (e10.f22830t != zVar) {
                    throw e10;
                }
            }
        } else {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = oVar.f22357v;
            wVar = oVar.f22356u;
            r9 = (hf.e) oVar.f22355t;
            try {
                se.a.f(obj);
                r10 = r9;
            } catch (wf.a e12) {
                e10 = e12;
                r10 = r9;
                if (e10.f22830t != zVar) {
                    throw e10;
                }
            }
        }
        Object obj2 = wVar.f9988t;
        if (obj2 != vVar) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r10);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object g(f fVar, ze.c cVar) {
        n nVar;
        kotlin.jvm.internal.w wVar;
        wf.a e10;
        g3 g3Var;
        hg.v vVar = wf.c.b;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i2 = nVar.f22354w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f22354w = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(cVar);
            }
        } else {
            nVar = new n(cVar);
        }
        Object obj = nVar.f22353v;
        int i10 = nVar.f22354w;
        if (i10 == 0) {
            se.a.f(obj);
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            wVar2.f9988t = vVar;
            g3 g3Var2 = new g3(wVar2, 2);
            try {
                nVar.f22351t = wVar2;
                nVar.f22352u = g3Var2;
                nVar.f22354w = 1;
                Object objA = fVar.a(g3Var2, nVar);
                Object obj2 = ye.a.f23667t;
                if (objA == obj2) {
                    return obj2;
                }
                wVar = wVar2;
            } catch (wf.a e11) {
                wVar = wVar2;
                e10 = e11;
                g3Var = g3Var2;
                if (e10.f22830t != g3Var) {
                    throw e10;
                }
            }
        } else {
            if (i10 != 1) {
                w4.d.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g3Var = nVar.f22352u;
            wVar = nVar.f22351t;
            try {
                se.a.f(obj);
            } catch (wf.a e12) {
                e10 = e12;
                if (e10.f22830t != g3Var) {
                    throw e10;
                }
            }
        }
        Object obj3 = wVar.f9988t;
        if (obj3 != vVar) {
            return obj3;
        }
        p1.n.o("Expected at least one element");
        return null;
    }

    public static final q h(q7.h hVar, xf.e eVar, a0 a0Var, Float f10) {
        uf.i.f21321q.getClass();
        uf.h hVar2 = uf.h.f21320a;
        k0.o oVar = new k0.o(hVar, 16, xe.j.f23216t);
        d0 d0VarB = b(f10);
        sf.y.u(eVar, (xe.i) oVar.f8999v, a0Var.equals(x.f22382a) ? sf.x.f19825t : sf.x.f19828w, new j0(a0Var, (f) oVar.f8998u, d0VarB, f10, null, 23));
        return new q(d0VarB);
    }
}
