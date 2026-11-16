package e5;

import android.media.Spatializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements zb.f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f4364t;

    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[Catch: all -> 0x008f, FALL_THROUGH, TryCatch #0 {all -> 0x008f, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:34:0x0056, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:42:0x0066, B:44:0x006a, B:46:0x006e, B:48:0x0078, B:50:0x0084, B:56:0x0092), top: B:60:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    @Override // zb.f
    public final boolean apply(Object obj) {
        boolean z10;
        c8.c cVar;
        c8.c cVar2;
        r rVar = this.f4364t;
        o4.o oVar = (o4.o) obj;
        synchronized (rVar.f4411c) {
            try {
                z10 = true;
                if (rVar.f4414f.f4392v && !rVar.f4413e) {
                    if (oVar.f15942z > 2) {
                        String str = oVar.f15929m;
                        if (str != null) {
                            switch (str) {
                                case "audio/eac3-joc":
                                case "audio/ac3":
                                case "audio/ac4":
                                case "audio/eac3":
                                    if (r4.v.f18493a >= 32 && (cVar2 = rVar.f4415g) != null && cVar2.f2316a) {
                                    }
                                default:
                                    if (r4.v.f18493a < 32) {
                                        z10 = false;
                                        break;
                                    } else {
                                        z10 = false;
                                        break;
                                    }
                                    break;
                            }
                        } else if (r4.v.f18493a < 32 || (cVar = rVar.f4415g) == null || !cVar.f2316a || !((Spatializer) cVar.b).isAvailable() || !((Spatializer) rVar.f4415g.b).isEnabled() || !rVar.f4415g.b(rVar.f4416h, oVar)) {
                            z10 = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
