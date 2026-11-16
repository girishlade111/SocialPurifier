package g5;

import a5.b0;
import a5.e0;
import ac.b1;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.credentials.CredentialOption;
import androidx.security.crypto.MasterKey;
import c5.x0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.j4;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o4.w0;
import p2.h0;
import v4.u0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a5.v {
    public static final int[] B1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean C1;
    public static boolean D1;
    public n A1;
    public final Context X0;
    public final e Y0;
    public final k0.o Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final int f5673a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final boolean f5674b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final p f5675c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final o f5676d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public db.d f5677e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f5678f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f5679g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public Surface f5680h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public r4.p f5681i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public m f5682j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f5683k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f5684l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public long f5685m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f5686n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f5687o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f5688p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public long f5689q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f5690r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public long f5691s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public w0 f5692t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public w0 f5693u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f5694v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f5695w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f5696x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f5697y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public j f5698z1;

    public k(Context context, a5.l lVar, Handler handler, v4.u uVar) {
        super(2, lVar, 30.0f);
        this.f5673a1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.X0 = applicationContext;
        this.Z0 = new k0.o(handler, 5, uVar);
        c8.c cVar = new c8.c(applicationContext);
        r4.a.i(!cVar.f2316a);
        if (((c) cVar.f2318d) == null) {
            if (((b) cVar.f2317c) == null) {
                cVar.f2317c = new b();
            }
            cVar.f2318d = new c((b) cVar.f2317c);
        }
        e eVar = new e(cVar);
        cVar.f2316a = true;
        if (eVar.f5652d == null) {
            p pVar = new p(applicationContext, this);
            r4.a.i(!eVar.b());
            eVar.f5652d = pVar;
            w wVar = new w();
            wVar.f5742u = pVar;
            new o();
            new b6.g(5, (byte) 0);
            new b6.g(5, (byte) 0);
            long[] jArr = new long[Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16];
            w0 w0Var = w0.f16000e;
            wVar.f5741t = -9223372036854775807L;
            eVar.f5653e = wVar;
        }
        this.Y0 = eVar;
        p pVar2 = eVar.f5652d;
        r4.a.j(pVar2);
        this.f5675c1 = pVar2;
        this.f5676d1 = new o();
        this.f5674b1 = "NVIDIA".equals(r4.v.f18494c);
        this.f5684l1 = 1;
        this.f5692t1 = w0.f16000e;
        this.f5697y1 = 0;
        this.f5693u1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean w0(String str) {
        String str2;
        byte b;
        String str3;
        byte b10;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!C1) {
                    int i2 = r4.v.f18493a;
                    byte b11 = 28;
                    if (i2 <= 28) {
                        String str4 = r4.v.b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b10 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b10 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b10 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b10 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b10 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b10 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b10 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b10 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i2 <= 27 || !"HWEML".equals(r4.v.b)) {
                                    str2 = r4.v.f18495d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i2 <= 26) {
                                                str3 = r4.v.b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b11 = 0;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b11 = 1;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b11 = 2;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b11 = 3;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b11 = 4;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b11 = 5;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b11 = 6;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b11 = 7;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b11 = 8;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b11 = 9;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b11 = 10;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b11 = 11;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b11 = 12;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b11 = 13;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b11 = 14;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b11 = 15;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b11 = 16;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b11 = 17;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b11 = 18;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b11 = 19;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b11 = 20;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b11 = 21;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b11 = 22;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b11 = 23;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b11 = 24;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b11 = 25;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b11 = 26;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b11 = 27;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b11 = 29;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b11 = 30;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b11 = 31;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b11 = 32;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b11 = 33;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b11 = 34;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b11 = 35;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b11 = 36;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b11 = 37;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b11 = 38;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b11 = 39;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b11 = 40;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b11 = 41;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b11 = 42;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b11 = 43;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b11 = 44;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b11 = 45;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b11 = 46;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b11 = 47;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b11 = 48;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b11 = 49;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b11 = 50;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b11 = 51;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b11 = 52;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b11 = 53;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b11 = 54;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b11 = 55;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b11 = 56;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b11 = 57;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b11 = 58;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b11 = 59;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b11 = 60;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b11 = 61;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b11 = 62;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b11 = 63;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b11 = 64;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b11 = 65;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b11 = 66;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b11 = 67;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b11 = 68;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b11 = 69;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b11 = 70;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b11 = 71;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b11 = 72;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b11 = 73;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b11 = 74;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b11 = 75;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b11 = 76;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b11 = 77;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b11 = 78;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b11 = 79;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b11 = 80;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b11 = 81;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b11 = 82;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b11 = 83;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b11 = 84;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b11 = 85;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b11 = 86;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b11 = 87;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b11 = 88;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b11 = 89;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b11 = 90;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b11 = 91;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b11 = 92;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b11 = 93;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b11 = 94;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b11 = 95;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b11 = 96;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b11 = 97;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b11 = 98;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b11 = 99;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b11 = 100;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b11 = 101;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b11 = 102;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b11 = 103;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b11 = 104;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b11 = 105;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b11 = 106;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b11 = 107;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b11 = 108;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b11 = 109;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b11 = 110;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b11 = 111;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b11 = 112;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b11 = 113;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b11 = 114;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b11 = 115;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b11 = 116;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b11 = 117;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b11 = 118;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b11 = 119;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b11 = 120;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b11 = 121;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b11 = 122;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b11 = 123;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b11 = 124;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b11 = 125;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b11 = 126;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b11 = 127;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b11 = 128;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b11 = 129;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b11 = 130;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b11 = 131;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b11 = 132;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b11 = 133;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b11 = 134;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b11 = 135;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b11 = 136;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b11 = 137;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b11 = 138;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b11 = 139;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b11 = -1;
                                                        break;
                                                }
                                                switch (b11) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
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
                                                    case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
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
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                                    case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT /* 50 */:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case CredentialOption.PRIORITY_PASSKEY_OR_SIMILAR /* 100 */:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case ModuleDescriptor.MODULE_VERSION /* 127 */:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z10 = true;
                                                        break;
                                                }
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
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z10 = true;
                                break;
                        }
                    } else if (i2 <= 27) {
                        str2 = r4.v.f18495d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i2 <= 26) {
                                    str3 = r4.v.b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b11 = 0;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b11 = 1;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b11 = 2;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b11 = 3;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b11 = 4;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b11 = 5;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b11 = 6;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b11 = 7;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b11 = 8;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b11 = 9;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b11 = 10;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b11 = 11;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b11 = 12;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b11 = 13;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b11 = 14;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b11 = 15;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b11 = 16;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b11 = 17;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b11 = 18;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b11 = 19;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b11 = 20;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b11 = 21;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b11 = 22;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b11 = 23;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b11 = 24;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b11 = 25;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b11 = 26;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b11 = 27;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b11 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b11 = 29;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b11 = 30;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b11 = 31;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b11 = 32;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b11 = 33;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b11 = 34;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b11 = 35;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b11 = 36;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b11 = 37;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b11 = 38;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b11 = 39;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b11 = 40;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b11 = 41;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b11 = 42;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b11 = 43;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b11 = 44;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b11 = 45;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b11 = 46;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b11 = 47;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b11 = 48;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b11 = 49;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b11 = 50;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b11 = 51;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b11 = 52;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b11 = 53;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b11 = 54;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b11 = 55;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b11 = 56;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b11 = 57;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b11 = 58;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b11 = 59;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b11 = 60;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b11 = 61;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b11 = 62;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b11 = 63;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b11 = 64;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b11 = 65;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b11 = 66;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b11 = 67;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b11 = 68;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b11 = 69;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b11 = 70;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b11 = 71;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b11 = 72;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b11 = 73;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b11 = 74;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b11 = 75;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b11 = 76;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b11 = 77;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b11 = 78;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b11 = 79;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b11 = 80;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b11 = 81;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b11 = 82;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b11 = 83;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b11 = 84;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b11 = 85;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b11 = 86;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b11 = 87;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b11 = 88;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b11 = 89;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b11 = 90;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b11 = 91;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b11 = 92;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b11 = 93;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b11 = 94;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b11 = 95;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b11 = 96;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b11 = 97;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b11 = 98;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b11 = 99;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b11 = 100;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b11 = 101;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b11 = 102;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b11 = 103;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b11 = 104;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b11 = 105;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b11 = 106;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b11 = 107;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b11 = 108;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b11 = 109;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b11 = 110;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b11 = 111;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b11 = 112;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b11 = 113;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b11 = 114;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b11 = 115;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b11 = 116;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b11 = 117;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b11 = 118;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b11 = 119;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b11 = 120;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b11 = 121;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b11 = 122;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b11 = 123;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b11 = 124;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b11 = 125;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b11 = 126;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b11 = 127;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b11 = 128;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b11 = 129;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b11 = 130;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b11 = 131;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b11 = 132;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b11 = 133;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b11 = 134;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b11 = 135;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b11 = 136;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b11 = 137;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b11 = 138;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b11 = 139;
                                            } else {
                                                b11 = -1;
                                            }
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    switch (b11) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
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
                                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
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
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                        case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case CredentialOption.PRIORITY_PASSKEY_OR_SIMILAR /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case ModuleDescriptor.MODULE_VERSION /* 127 */:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z10 = true;
                                            break;
                                    }
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
                                z10 = true;
                                break;
                        }
                    } else {
                        str2 = r4.v.f18495d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i2 <= 26) {
                                    str3 = r4.v.b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b11 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b11 = -1;
                                            } else {
                                                b11 = 139;
                                            }
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    switch (b11) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
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
                                        case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES /* 16 */:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
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
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                        case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT /* 50 */:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case CredentialOption.PRIORITY_PASSKEY_OR_SIMILAR /* 100 */:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case ModuleDescriptor.MODULE_VERSION /* 127 */:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z10 = true;
                                            break;
                                    }
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
                                z10 = true;
                                break;
                        }
                    }
                    D1 = z10;
                    C1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return D1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int x0(a5.p pVar, o4.o oVar) {
        int iIntValue;
        int i2 = oVar.f15934r;
        int i10 = oVar.f15935s;
        if (i2 != -1 && i10 != -1) {
            String str = oVar.f15929m;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = e0.d(oVar);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i2 * i10) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i2 * i10) * 3) / 4);
                case "video/avc":
                    String str2 = r4.v.f18495d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(r4.v.f18494c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !pVar.f251f)))) {
                        return ((r4.v.e(i10, 16) * r4.v.e(i2, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i2 * i10) * 3) / 8;
            }
        }
        return -1;
    }

    public static List y0(Context context, a5.w wVar, o4.o oVar, boolean z10, boolean z11) {
        List listE;
        String str = oVar.f15929m;
        if (str == null) {
            return b1.f480x;
        }
        if (r4.v.f18493a >= 26 && "video/dolby-vision".equals(str) && !i.a(context)) {
            String strB = e0.b(oVar);
            if (strB == null) {
                listE = b1.f480x;
            } else {
                wVar.getClass();
                listE = e0.e(strB, z10, z11);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return e0.g(wVar, oVar, z10, z11);
    }

    public static int z0(a5.p pVar, o4.o oVar) {
        int i2 = oVar.f15930n;
        List list = oVar.f15931o;
        if (i2 == -1) {
            return x0(pVar, oVar);
        }
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return oVar.f15930n + length;
    }

    @Override // a5.v, v4.d
    public final void A(float f10, float f11) throws v4.j {
        super.A(f10, f11);
        p pVar = this.f5675c1;
        pVar.f5717i = f10;
        v vVar = pVar.b;
        vVar.f5733i = f10;
        vVar.f5736m = 0L;
        vVar.f5739p = -1L;
        vVar.f5737n = -1L;
        vVar.c(false);
    }

    public final void A0() {
        if (this.f5686n1 > 0) {
            this.f21877z.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f5685m1;
            int i2 = this.f5686n1;
            k0.o oVar = this.Z0;
            Handler handler = (Handler) oVar.f8998u;
            if (handler != null) {
                handler.post(new x(oVar, i2, j10));
            }
            this.f5686n1 = 0;
            this.f5685m1 = jElapsedRealtime;
        }
    }

    public final void B0(w0 w0Var) {
        if (w0Var.equals(w0.f16000e) || w0Var.equals(this.f5693u1)) {
            return;
        }
        this.f5693u1 = w0Var;
        this.Z0.K(w0Var);
    }

    public final void C0() {
        int i2;
        a5.m mVar;
        if (!this.f5696x1 || (i2 = r4.v.f18493a) < 23 || (mVar = this.f264c0) == null) {
            return;
        }
        this.f5698z1 = new j(this, mVar);
        if (i2 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            mVar.c(bundle);
        }
    }

    public final void D0() {
        Surface surface = this.f5680h1;
        m mVar = this.f5682j1;
        if (surface == mVar) {
            this.f5680h1 = null;
        }
        if (mVar != null) {
            mVar.release();
            this.f5682j1 = null;
        }
    }

    @Override // a5.v
    public final v4.f E(a5.p pVar, o4.o oVar, o4.o oVar2) {
        v4.f fVarB = pVar.b(oVar, oVar2);
        int i2 = fVarB.f21909e;
        db.d dVar = this.f5677e1;
        dVar.getClass();
        if (oVar2.f15934r > dVar.f3762a || oVar2.f15935s > dVar.b) {
            i2 |= MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
        }
        if (z0(pVar, oVar2) > dVar.f3763c) {
            i2 |= 64;
        }
        int i10 = i2;
        return new v4.f(pVar.f247a, oVar, oVar2, i10 != 0 ? 0 : fVarB.f21908d, i10);
    }

    public final void E0(a5.m mVar, int i2) {
        Surface surface;
        r4.a.b("releaseOutputBuffer");
        mVar.o(i2, true);
        r4.a.o();
        this.S0.f21897e++;
        this.f5687o1 = 0;
        B0(this.f5692t1);
        p pVar = this.f5675c1;
        boolean z10 = pVar.f5712d != 3;
        pVar.f5712d = 3;
        pVar.f5718j.getClass();
        pVar.f5714f = r4.v.B(SystemClock.elapsedRealtime());
        if (!z10 || (surface = this.f5680h1) == null) {
            return;
        }
        k0.o oVar = this.Z0;
        Handler handler = (Handler) oVar.f8998u;
        if (handler != null) {
            handler.post(new e9.a(oVar, surface, SystemClock.elapsedRealtime()));
        }
        this.f5683k1 = true;
    }

    @Override // a5.v
    public final a5.o F(IllegalStateException illegalStateException, a5.p pVar) {
        Surface surface = this.f5680h1;
        h hVar = new h(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return hVar;
    }

    public final void F0(a5.m mVar, int i2, long j10) {
        Surface surface;
        r4.a.b("releaseOutputBuffer");
        mVar.j(i2, j10);
        r4.a.o();
        this.S0.f21897e++;
        this.f5687o1 = 0;
        B0(this.f5692t1);
        p pVar = this.f5675c1;
        boolean z10 = pVar.f5712d != 3;
        pVar.f5712d = 3;
        pVar.f5718j.getClass();
        pVar.f5714f = r4.v.B(SystemClock.elapsedRealtime());
        if (!z10 || (surface = this.f5680h1) == null) {
            return;
        }
        k0.o oVar = this.Z0;
        Handler handler = (Handler) oVar.f8998u;
        if (handler != null) {
            handler.post(new e9.a(oVar, surface, SystemClock.elapsedRealtime()));
        }
        this.f5683k1 = true;
    }

    public final boolean G0(a5.p pVar) {
        if (r4.v.f18493a < 23 || this.f5696x1 || w0(pVar.f247a)) {
            return false;
        }
        return !pVar.f251f || m.a(this.X0);
    }

    public final void H0(a5.m mVar, int i2) {
        r4.a.b("skipVideoBuffer");
        mVar.o(i2, false);
        r4.a.o();
        this.S0.f21898f++;
    }

    public final void I0(int i2, int i10) {
        v4.e eVar = this.S0;
        eVar.f21900h += i2;
        int i11 = i2 + i10;
        eVar.f21899g += i11;
        this.f5686n1 += i11;
        int i12 = this.f5687o1 + i11;
        this.f5687o1 = i12;
        eVar.f21901i = Math.max(i12, eVar.f21901i);
        int i13 = this.f5673a1;
        if (i13 <= 0 || this.f5686n1 < i13) {
            return;
        }
        A0();
    }

    public final void J0(long j10) {
        v4.e eVar = this.S0;
        eVar.f21903k += j10;
        eVar.l++;
        this.f5689q1 += j10;
        this.f5690r1++;
    }

    @Override // a5.v
    public final int N(u4.d dVar) {
        return (r4.v.f18493a < 34 || !this.f5696x1 || dVar.f20847z >= this.E) ? 0 : 32;
    }

    @Override // a5.v
    public final boolean O() {
        return this.f5696x1 && r4.v.f18493a < 23;
    }

    @Override // a5.v
    public final float P(float f10, o4.o[] oVarArr) {
        float fMax = -1.0f;
        for (o4.o oVar : oVarArr) {
            float f11 = oVar.f15936t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // a5.v
    public final ArrayList Q(a5.w wVar, o4.o oVar, boolean z10) {
        List listY0 = y0(this.X0, wVar, oVar, z10, this.f5696x1);
        Pattern pattern = e0.f218a;
        ArrayList arrayList = new ArrayList(listY0);
        int i2 = 0;
        Collections.sort(arrayList, new a5.y(new a5.x(oVar, i2), i2));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x017a, please report this as an issue */
    @Override // a5.v
    public final a5.k R(a5.p pVar, o4.o oVar, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        int i2;
        o4.h hVar;
        int iMax;
        db.d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        byte b;
        boolean z11;
        Pair pairD;
        int iX0;
        boolean z12 = pVar.f251f;
        m mVar = this.f5682j1;
        if (mVar != null && mVar.f5706t != z12) {
            D0();
        }
        String str = pVar.f248c;
        o4.o[] oVarArr = this.C;
        oVarArr.getClass();
        int i10 = oVar.f15934r;
        float f11 = oVar.f15936t;
        int i11 = oVar.f15935s;
        o4.h hVar2 = oVar.f15941y;
        int iZ0 = z0(pVar, oVar);
        if (oVarArr.length == 1) {
            if (iZ0 != -1 && (iX0 = x0(pVar, oVar)) != -1) {
                iZ0 = Math.min((int) (iZ0 * 1.5f), iX0);
            }
            dVar = new db.d(i10, i11, iZ0);
            z10 = z12;
            i2 = i11;
            hVar = hVar2;
        } else {
            int length = oVarArr.length;
            int iMax2 = i10;
            int iMax3 = i11;
            int i12 = 0;
            boolean z13 = false;
            while (i12 < length) {
                o4.o oVar2 = oVarArr[i12];
                o4.o[] oVarArr2 = oVarArr;
                if (hVar2 != null && oVar2.f15941y == null) {
                    o4.n nVarA = oVar2.a();
                    nVarA.f15900x = hVar2;
                    oVar2 = new o4.o(nVarA);
                }
                v4.f fVarB = pVar.b(oVar, oVar2);
                int i13 = length;
                int i14 = oVar2.f15935s;
                if (fVarB.f21908d != 0) {
                    int i15 = oVar2.f15934r;
                    b = -1;
                    z13 |= i15 == -1 || i14 == -1;
                    iMax2 = Math.max(iMax2, i15);
                    iMax3 = Math.max(iMax3, i14);
                    iZ0 = Math.max(iZ0, z0(pVar, oVar2));
                } else {
                    b = -1;
                }
                length = i13;
                i12++;
                oVarArr = oVarArr2;
            }
            int i16 = iMax3;
            if (z13) {
                r4.a.v("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + "x" + i16);
                boolean z14 = i11 > i10;
                boolean z15 = z14;
                int i17 = z14 ? i11 : i10;
                z10 = z12;
                int i18 = z15 ? i10 : i11;
                float f12 = i18 / i17;
                int i19 = 0;
                while (true) {
                    hVar = hVar2;
                    if (i19 < 9) {
                        int i20 = B1[i19];
                        int i21 = i19;
                        int i22 = (int) (i20 * f12);
                        if (i20 > i17 && i22 > i18) {
                            int i23 = i18;
                            int i24 = i17;
                            if (r4.v.f18493a >= 21) {
                                int i25 = z15 ? i22 : i20;
                                if (!z15) {
                                    i20 = i22;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f249d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(r4.v.e(i25, widthAlignment) * widthAlignment, r4.v.e(i20, heightAlignment) * heightAlignment);
                                }
                                if (point2 != null) {
                                    i2 = i11;
                                    if (pVar.f(point2.x, point2.y, f11)) {
                                        point = point2;
                                    }
                                } else {
                                    i2 = i11;
                                }
                                i19 = i21 + 1;
                                i11 = i2;
                                hVar2 = hVar;
                                i18 = i23;
                                i17 = i24;
                            } else {
                                i2 = i11;
                                try {
                                    int iE = r4.v.e(i20, 16) * 16;
                                    int iE2 = r4.v.e(i22, 16) * 16;
                                    if (iE * iE2 <= e0.j()) {
                                        int i26 = z15 ? iE2 : iE;
                                        if (!z15) {
                                            iE = iE2;
                                        }
                                        point = new Point(i26, iE);
                                    } else {
                                        i19 = i21 + 1;
                                        i11 = i2;
                                        hVar2 = hVar;
                                        i18 = i23;
                                        i17 = i24;
                                    }
                                } catch (b0 unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax2 = Math.max(iMax2, point.x);
                            iMax = Math.max(i16, point.y);
                            o4.n nVarA2 = oVar.a();
                            nVarA2.f15893q = iMax2;
                            nVarA2.f15894r = iMax;
                            iZ0 = Math.max(iZ0, x0(pVar, new o4.o(nVarA2)));
                            r4.a.v("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                        }
                        dVar = new db.d(iMax2, iMax, iZ0);
                    }
                    i2 = i11;
                    point = null;
                    if (point != null) {
                        iMax2 = Math.max(iMax2, point.x);
                        iMax = Math.max(i16, point.y);
                        o4.n nVarA3 = oVar.a();
                        nVarA3.f15893q = iMax2;
                        nVarA3.f15894r = iMax;
                        iZ0 = Math.max(iZ0, x0(pVar, new o4.o(nVarA3)));
                        r4.a.v("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                    }
                    dVar = new db.d(iMax2, iMax, iZ0);
                }
            } else {
                z10 = z12;
                i2 = i11;
                hVar = hVar2;
            }
            iMax = i16;
            dVar = new db.d(iMax2, iMax, iZ0);
        }
        this.f5677e1 = dVar;
        int i27 = this.f5696x1 ? this.f5697y1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i10);
        mediaFormat.setInteger("height", i2);
        r4.a.u(mediaFormat, oVar.f15931o);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        r4.a.t(mediaFormat, "rotation-degrees", oVar.f15937u);
        if (hVar != null) {
            o4.h hVar3 = hVar;
            r4.a.t(mediaFormat, "color-transfer", hVar3.f15846c);
            r4.a.t(mediaFormat, "color-standard", hVar3.f15845a);
            r4.a.t(mediaFormat, "color-range", hVar3.b);
            byte[] bArr = hVar3.f15847d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(oVar.f15929m) && (pairD = e0.d(oVar)) != null) {
            r4.a.t(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f3762a);
        mediaFormat.setInteger("max-height", dVar.b);
        r4.a.t(mediaFormat, "max-input-size", dVar.f3763c);
        if (r4.v.f18493a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f5674b1) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (this.f5680h1 == null) {
            if (!G0(pVar)) {
                m0.n.m();
                return null;
            }
            if (this.f5682j1 == null) {
                this.f5682j1 = m.b(this.X0, z10);
            }
            this.f5680h1 = this.f5682j1;
        }
        return new a5.k(pVar, mediaFormat, oVar, this.f5680h1, mediaCrypto);
    }

    @Override // a5.v
    public final void S(u4.d dVar) {
        if (this.f5679g1) {
            ByteBuffer byteBuffer = dVar.A;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        a5.m mVar = this.f264c0;
                        mVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // a5.v
    public final void X(Exception exc) {
        r4.a.n("MediaCodecVideoRenderer", "Video codec error", exc);
        k0.o oVar = this.Z0;
        Handler handler = (Handler) oVar.f8998u;
        if (handler != null) {
            handler.post(new x(3, exc, oVar));
        }
    }

    @Override // a5.v
    public final void Y(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        k0.o oVar = this.Z0;
        Handler handler = (Handler) oVar.f8998u;
        if (handler != null) {
            str2 = str;
            handler.post(new x(oVar, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.f5678f1 = w0(str2);
        a5.p pVar = this.f271j0;
        pVar.getClass();
        boolean z10 = false;
        if (r4.v.f18493a >= 29 && "video/x-vnd.on2.vp9".equals(pVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f249d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f5679g1 = z10;
        C0();
    }

    @Override // a5.v
    public final void Z(String str) {
        k0.o oVar = this.Z0;
        Handler handler = (Handler) oVar.f8998u;
        if (handler != null) {
            handler.post(new x(6, str, oVar));
        }
    }

    @Override // a5.v
    public final v4.f a0(j4 j4Var) {
        v4.f fVarA0 = super.a0(j4Var);
        o4.o oVar = (o4.o) j4Var.f2775v;
        oVar.getClass();
        k0.o oVar2 = this.Z0;
        Handler handler = (Handler) oVar2.f8998u;
        if (handler != null) {
            handler.post(new x(oVar2, oVar, fVarA0));
        }
        return fVarA0;
    }

    @Override // a5.v
    public final void b0(o4.o oVar, MediaFormat mediaFormat) {
        int integer;
        int i2;
        a5.m mVar = this.f264c0;
        if (mVar != null) {
            mVar.r(this.f5684l1);
        }
        if (this.f5696x1) {
            i2 = oVar.f15934r;
            integer = oVar.f15935s;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i2 = integer2;
        }
        float f10 = oVar.f15938v;
        int i10 = oVar.f15937u;
        if (r4.v.f18493a >= 21) {
            if (i10 == 90 || i10 == 270) {
                f10 = 1.0f / f10;
                int i11 = integer;
                integer = i2;
                i2 = i11;
            }
            i10 = 0;
        }
        this.f5692t1 = new w0(f10, i2, integer, i10);
        float f11 = oVar.f15936t;
        v vVar = this.f5675c1.b;
        vVar.f5730f = f11;
        g gVar = vVar.f5726a;
        ((f) gVar.f5669d).c();
        ((f) gVar.f5670e).c();
        gVar.f5668c = false;
        gVar.b = -9223372036854775807L;
        gVar.f5667a = 0;
        vVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r10v8, types: [g5.m] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [g5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a5.m] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v4.d, v4.r0
    public final void d(int i2, Object obj) throws v4.j {
        ?? B;
        Handler handler;
        Surface surface;
        Surface surface2;
        p pVar = this.f5675c1;
        ?? r9 = this.Y0;
        if (i2 != 1) {
            if (i2 == 7) {
                obj.getClass();
                this.A1 = (n) obj;
                r9.getClass();
                return;
            }
            if (i2 == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.f5697y1 != iIntValue) {
                    this.f5697y1 = iIntValue;
                    if (this.f5696x1) {
                        k0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.f5684l1 = iIntValue2;
                a5.m mVar = this.f264c0;
                if (mVar != null) {
                    mVar.r(iIntValue2);
                    return;
                }
                return;
            }
            if (i2 == 5) {
                obj.getClass();
                int iIntValue3 = ((Integer) obj).intValue();
                v vVar = pVar.b;
                if (vVar.f5734j == iIntValue3) {
                    return;
                }
                vVar.f5734j = iIntValue3;
                vVar.c(true);
                return;
            }
            if (i2 == 13) {
                obj.getClass();
                r9.f5655g = (List) obj;
                if (r9.b()) {
                    r4.a.j(null);
                    throw null;
                }
                this.f5694v1 = true;
                return;
            }
            if (i2 != 14) {
                return;
            }
            obj.getClass();
            this.f5681i1 = (r4.p) obj;
            if (r9.b()) {
                r4.p pVar2 = this.f5681i1;
                pVar2.getClass();
                if (pVar2.f18485a != 0) {
                    r4.p pVar3 = this.f5681i1;
                    pVar3.getClass();
                    if (pVar3.b == 0 || (surface2 = this.f5680h1) == null) {
                        return;
                    }
                    r4.p pVar4 = this.f5681i1;
                    pVar4.getClass();
                    r9.c(surface2, pVar4);
                    return;
                }
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            B = 0;
        }
        if (B == 0) {
            m mVar2 = this.f5682j1;
            if (mVar2 != null) {
                B = surface;
                B = mVar2;
            } else {
                a5.p pVar5 = this.f271j0;
                if (pVar5 != null && G0(pVar5)) {
                    B = surface;
                    B = m.b(this.X0, pVar5.f251f);
                    this.f5682j1 = B;
                }
            }
        }
        B = surface;
        B = surface;
        B = surface;
        Surface surface3 = this.f5680h1;
        k0.o oVar = this.Z0;
        if (surface3 == B) {
            if (B == 0 || B == this.f5682j1) {
                return;
            }
            w0 w0Var = this.f5693u1;
            if (w0Var != null) {
                oVar.K(w0Var);
            }
            Surface surface4 = this.f5680h1;
            if (surface4 == null || !this.f5683k1 || (handler = (Handler) oVar.f8998u) == null) {
                return;
            }
            handler.post(new e9.a(oVar, surface4, SystemClock.elapsedRealtime()));
            return;
        }
        this.f5680h1 = B;
        v vVar2 = pVar.b;
        vVar2.getClass();
        int i10 = r4.v.f18493a;
        ?? r10 = (i10 < 17 || !q.a(B)) ? B : 0;
        if (vVar2.f5729e != r10) {
            vVar2.a();
            vVar2.f5729e = r10;
            vVar2.c(true);
        }
        pVar.a(1);
        this.f5683k1 = false;
        int i11 = this.A;
        ?? r11 = this.f264c0;
        if (r11 != 0 && !r9.b()) {
            if (i10 < 23 || B == 0 || this.f5678f1) {
                k0();
                V();
            } else {
                r11.t(B);
            }
        }
        if (B == 0 || B == this.f5682j1) {
            this.f5693u1 = null;
            if (r9.b()) {
                int i12 = r4.p.f18484c.f18485a;
                r9.f5656h = null;
            }
        } else {
            w0 w0Var2 = this.f5693u1;
            if (w0Var2 != null) {
                oVar.K(w0Var2);
            }
            if (i11 == 2) {
                pVar.f5718j.getClass();
                pVar.f5716h = SystemClock.elapsedRealtime() + HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
            }
            if (r9.b()) {
                r9.c(B, r4.p.f18484c);
            }
        }
        C0();
    }

    @Override // a5.v
    public final void d0(long j10) {
        super.d0(j10);
        if (this.f5696x1) {
            return;
        }
        this.f5688p1--;
    }

    @Override // a5.v
    public final void e0() {
        this.f5675c1.a(2);
        C0();
        e eVar = this.Y0;
        if (eVar.b()) {
            eVar.d(this.T0.f260c);
        }
    }

    @Override // a5.v
    public final void f0(u4.d dVar) {
        Surface surface;
        boolean z10 = this.f5696x1;
        if (!z10) {
            this.f5688p1++;
        }
        if (r4.v.f18493a >= 23 || !z10) {
            return;
        }
        long j10 = dVar.f20847z;
        v0(j10);
        B0(this.f5692t1);
        this.S0.f21897e++;
        p pVar = this.f5675c1;
        boolean z11 = pVar.f5712d != 3;
        pVar.f5712d = 3;
        pVar.f5718j.getClass();
        pVar.f5714f = r4.v.B(SystemClock.elapsedRealtime());
        if (z11 && (surface = this.f5680h1) != null) {
            k0.o oVar = this.Z0;
            Handler handler = (Handler) oVar.f8998u;
            if (handler != null) {
                handler.post(new e9.a(oVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f5683k1 = true;
        }
        d0(j10);
    }

    @Override // a5.v
    public final void g0(o4.o oVar) throws v4.j {
        boolean z10 = this.f5694v1;
        e eVar = this.Y0;
        if (z10 && !this.f5695w1 && !eVar.b()) {
            try {
                eVar.a(oVar);
                throw null;
            } catch (z e10) {
                throw g(e10, oVar, false, 7000);
            }
        } else if (!eVar.b()) {
            this.f5695w1 = true;
        } else {
            r4.a.j(null);
            new gd.e(this);
            throw null;
        }
    }

    @Override // v4.d
    public final void h() {
        p pVar = this.f5675c1;
        if (pVar.f5712d == 0) {
            pVar.f5712d = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x024d  */
    /* JADX WARN: Code duplicated, block: B:147:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:165:0x02da  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:174:0x0309  */
    /* JADX WARN: Code duplicated, block: B:176:0x030d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0321  */
    /* JADX WARN: Code duplicated, block: B:182:0x0327  */
    /* JADX WARN: Code duplicated, block: B:184:0x032d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0345  */
    /* JADX WARN: Code duplicated, block: B:195:0x0356  */
    /* JADX WARN: Code duplicated, block: B:197:0x0365  */
    /* JADX WARN: Code duplicated, block: B:200:0x0372  */
    /* JADX WARN: Code duplicated, block: B:201:0x0376  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[PHI: r34
  0x014d: PHI (r34v5 long) = (r34v4 long), (r34v6 long), (r34v6 long), (r34v6 long) binds: [B:62:0x015b, B:52:0x013e, B:54:0x0142, B:56:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a5.v
    public final boolean i0(long j10, long j11, a5.m mVar, ByteBuffer byteBuffer, int i2, int i10, int i11, long j12, boolean z10, boolean z11, o4.o oVar) throws v4.j {
        long j13;
        long j14;
        boolean z12;
        o oVar2;
        o oVar3;
        long j15;
        long jNanoTime;
        n nVar;
        long j16;
        long j17;
        long j18;
        n nVar2;
        n nVar3;
        o oVar4;
        long j19;
        int i12;
        int i13;
        long j20;
        long j21;
        v vVar;
        o oVar5 = this.f5676d1;
        mVar.getClass();
        a5.u uVar = this.T0;
        long j22 = j12 - uVar.f260c;
        p pVar = this.f5675c1;
        long j23 = uVar.b;
        o oVar6 = this.f5676d1;
        pVar.getClass();
        oVar6.f5709a = -9223372036854775807L;
        oVar6.b = -9223372036854775807L;
        if (pVar.f5713e == -9223372036854775807L) {
            pVar.f5713e = j10;
        }
        int i14 = 0;
        if (pVar.f5715g != j12) {
            v vVar2 = pVar.b;
            long j24 = vVar2.f5737n;
            if (j24 != -1) {
                vVar2.f5739p = j24;
                vVar2.f5740q = vVar2.f5738o;
            }
            vVar2.f5736m++;
            g gVar = vVar2.f5726a;
            long j25 = j12 * 1000;
            ((f) gVar.f5669d).b(j25);
            if (((f) gVar.f5669d).a()) {
                gVar.f5668c = false;
                vVar = vVar2;
                j13 = j22;
            } else {
                j13 = j22;
                if (gVar.b != -9223372036854775807L) {
                    if (gVar.f5668c) {
                        f fVar = (f) gVar.f5670e;
                        vVar = vVar2;
                        long j26 = fVar.f5662d;
                        if (j26 == 0 ? false : fVar.f5665g[(int) ((j26 - 1) % 15)]) {
                        }
                        gVar.f5668c = true;
                        ((f) gVar.f5670e).b(j25);
                    } else {
                        vVar = vVar2;
                    }
                    ((f) gVar.f5670e).c();
                    ((f) gVar.f5670e).b(gVar.b);
                    gVar.f5668c = true;
                    ((f) gVar.f5670e).b(j25);
                } else {
                    vVar = vVar2;
                }
            }
            if (gVar.f5668c && ((f) gVar.f5670e).a()) {
                f fVar2 = (f) gVar.f5669d;
                gVar.f5669d = (f) gVar.f5670e;
                gVar.f5670e = fVar2;
                gVar.f5668c = false;
            }
            gVar.b = j25;
            gVar.f5667a = ((f) gVar.f5669d).a() ? 0 : gVar.f5667a + 1;
            vVar.b();
            pVar.f5715g = j12;
        } else {
            j13 = j22;
        }
        long jB = (long) ((j12 - j10) / ((double) pVar.f5717i));
        if (pVar.f5711c) {
            pVar.f5718j.getClass();
            jB -= r4.v.B(SystemClock.elapsedRealtime()) - j11;
        }
        oVar6.f5709a = jB;
        if (pVar.f5716h != -9223372036854775807L) {
            z12 = false;
            j14 = -30000;
        } else {
            int i15 = pVar.f5712d;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        j14 = -30000;
                        if (j10 < j23) {
                            z12 = false;
                        }
                    } else if (i15 == 3) {
                        pVar.f5718j.getClass();
                        j14 = -30000;
                        long jB2 = r4.v.B(SystemClock.elapsedRealtime()) - pVar.f5714f;
                        if (!pVar.f5711c || jB >= -30000 || jB2 <= 100000) {
                            z12 = false;
                        }
                    } else {
                        m0.n.m();
                        i14 = 0;
                    }
                    oVar2 = oVar5;
                    if (!z10 && !z11) {
                        H0(mVar, i2);
                        return true;
                    }
                    if (this.f5680h1 == this.f5682j1) {
                        oVar4 = oVar2;
                        if (oVar4.f5709a < HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
                            H0(mVar, i2);
                            J0(oVar4.f5709a);
                            return true;
                        }
                    } else {
                        oVar3 = oVar2;
                        if (i14 != 0) {
                            j15 = j13;
                            this.f21877z.getClass();
                            jNanoTime = System.nanoTime();
                            nVar = this.A1;
                            if (nVar != null) {
                                nVar.c(j15, jNanoTime, oVar, this.f266e0);
                            }
                            if (r4.v.f18493a >= 21) {
                                F0(mVar, i2, jNanoTime);
                            } else {
                                E0(mVar, i2);
                            }
                            J0(oVar3.f5709a);
                            return true;
                        }
                        if (i14 != 1) {
                            j16 = oVar3.b;
                            j17 = oVar3.f5709a;
                            if (r4.v.f18493a >= 21) {
                                if (j16 == this.f5691s1) {
                                    H0(mVar, i2);
                                } else {
                                    nVar3 = this.A1;
                                    if (nVar3 != null) {
                                        nVar3.c(j13, j16, oVar, this.f266e0);
                                    }
                                    F0(mVar, i2, j16);
                                }
                                J0(j17);
                                this.f5691s1 = j16;
                                return true;
                            }
                            j18 = j13;
                            if (j17 < HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
                                if (j17 > 11000) {
                                    try {
                                        Thread.sleep((j17 - 10000) / 1000);
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                        return false;
                                    }
                                }
                                nVar2 = this.A1;
                                if (nVar2 != null) {
                                    nVar2.c(j18, j16, oVar, this.f266e0);
                                }
                                E0(mVar, i2);
                                J0(j17);
                                return true;
                            }
                        } else {
                            if (i14 != 2) {
                                r4.a.b("dropVideoBuffer");
                                mVar.o(i2, false);
                                r4.a.o();
                                I0(0, 1);
                                J0(oVar3.f5709a);
                                return true;
                            }
                            if (i14 != 3) {
                                H0(mVar, i2);
                                J0(oVar3.f5709a);
                                return true;
                            }
                            if (i14 != 4 && i14 != 5) {
                                w4.d.l(String.valueOf(i14));
                                return false;
                            }
                        }
                    }
                    return false;
                }
                j14 = -30000;
                z12 = true;
            } else {
                j14 = -30000;
                z12 = pVar.f5711c;
            }
        }
        if (z12) {
            oVar2 = oVar5;
        } else {
            if (!pVar.f5711c || j10 == pVar.f5713e) {
                oVar2 = oVar5;
            } else {
                pVar.f5718j.getClass();
                long jNanoTime2 = System.nanoTime();
                v vVar3 = pVar.b;
                long j27 = (oVar6.f5709a * 1000) + jNanoTime2;
                if (vVar3.f5739p == -1 || !((f) vVar3.f5726a.f5669d).a()) {
                    j19 = jNanoTime2;
                    oVar2 = oVar5;
                } else {
                    g gVar2 = vVar3.f5726a;
                    if (((f) gVar2.f5669d).a()) {
                        f fVar3 = (f) gVar2.f5669d;
                        oVar2 = oVar5;
                        long j28 = fVar3.f5663e;
                        j21 = j28 == 0 ? 0L : fVar3.f5664f / j28;
                    } else {
                        oVar2 = oVar5;
                        j21 = -9223372036854775807L;
                    }
                    j19 = jNanoTime2;
                    long j29 = vVar3.f5740q + ((long) (((vVar3.f5736m - vVar3.f5739p) * j21) / vVar3.f5733i));
                    if (Math.abs(j27 - j29) <= 20000000) {
                        j27 = j29;
                    } else {
                        vVar3.f5736m = 0L;
                        vVar3.f5739p = -1L;
                        vVar3.f5737n = -1L;
                    }
                }
                vVar3.f5737n = vVar3.f5736m;
                vVar3.f5738o = j27;
                u uVar2 = vVar3.f5727c;
                if (uVar2 != null && vVar3.f5735k != -9223372036854775807L) {
                    long j30 = uVar2.f5722t;
                    if (j30 != -9223372036854775807L) {
                        long j31 = vVar3.f5735k;
                        long j32 = (((j27 - j30) / j31) * j31) + j30;
                        if (j27 <= j32) {
                            j20 = j32 - j31;
                        } else {
                            j20 = j32;
                            j32 = j31 + j32;
                        }
                        if (j32 - j27 >= j27 - j20) {
                            j32 = j20;
                        }
                        j27 = j32 - vVar3.l;
                    }
                }
                oVar6.b = j27;
                long j33 = (j27 - j19) / 1000;
                oVar6.f5709a = j33;
                boolean z13 = pVar.f5716h != -9223372036854775807L;
                k kVar = pVar.f5710a;
                if (j33 >= -500000 || z11) {
                    i12 = 1;
                    i13 = 0;
                } else {
                    x0 x0Var = kVar.B;
                    x0Var.getClass();
                    int iF = x0Var.f(j10 - kVar.D);
                    if (iF == 0) {
                        i12 = 1;
                        i13 = 0;
                    } else {
                        v4.e eVar = kVar.S0;
                        if (z13) {
                            eVar.f21896d += iF;
                            eVar.f21898f += kVar.f5688p1;
                            i12 = 1;
                        } else {
                            i12 = 1;
                            eVar.f21902j++;
                            kVar.I0(iF, kVar.f5688p1);
                        }
                        if (kVar.L()) {
                            kVar.V();
                        }
                        i13 = i12;
                    }
                }
                if (i13 != 0) {
                    i14 = 4;
                } else {
                    long j34 = oVar6.f5709a;
                    if (j34 < j14 && !z11) {
                        i14 = i12;
                    }
                    if (i14 != 0) {
                        i14 = z13 ? 3 : 2;
                    } else if (j34 <= 50000) {
                        i14 = i12;
                    }
                }
            }
            i14 = 5;
        }
        if (!z10) {
        }
        if (this.f5680h1 == this.f5682j1) {
            oVar4 = oVar2;
            if (oVar4.f5709a < HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
                H0(mVar, i2);
                J0(oVar4.f5709a);
                return true;
            }
        } else {
            oVar3 = oVar2;
            if (i14 != 0) {
                j15 = j13;
                this.f21877z.getClass();
                jNanoTime = System.nanoTime();
                nVar = this.A1;
                if (nVar != null) {
                    nVar.c(j15, jNanoTime, oVar, this.f266e0);
                }
                if (r4.v.f18493a >= 21) {
                    F0(mVar, i2, jNanoTime);
                } else {
                    E0(mVar, i2);
                }
                J0(oVar3.f5709a);
                return true;
            }
            if (i14 != 1) {
                j16 = oVar3.b;
                j17 = oVar3.f5709a;
                if (r4.v.f18493a >= 21) {
                    if (j16 == this.f5691s1) {
                        H0(mVar, i2);
                    } else {
                        nVar3 = this.A1;
                        if (nVar3 != null) {
                            nVar3.c(j13, j16, oVar, this.f266e0);
                        }
                        F0(mVar, i2, j16);
                    }
                    J0(j17);
                    this.f5691s1 = j16;
                    return true;
                }
                j18 = j13;
                if (j17 < HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
                    if (j17 > 11000) {
                        Thread.sleep((j17 - 10000) / 1000);
                    }
                    nVar2 = this.A1;
                    if (nVar2 != null) {
                        nVar2.c(j18, j16, oVar, this.f266e0);
                    }
                    E0(mVar, i2);
                    J0(j17);
                    return true;
                }
            } else {
                if (i14 != 2) {
                    r4.a.b("dropVideoBuffer");
                    mVar.o(i2, false);
                    r4.a.o();
                    I0(0, 1);
                    J0(oVar3.f5709a);
                    return true;
                }
                if (i14 != 3) {
                    H0(mVar, i2);
                    J0(oVar3.f5709a);
                    return true;
                }
                if (i14 != 4) {
                    w4.d.l(String.valueOf(i14));
                    return false;
                }
            }
        }
        return false;
    }

    @Override // v4.d
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // v4.d
    public final boolean l() {
        return this.O0;
    }

    @Override // a5.v, v4.d
    public final boolean m() {
        m mVar;
        boolean zM = super.m();
        if (zM && (((mVar = this.f5682j1) != null && this.f5680h1 == mVar) || this.f264c0 == null || this.f5696x1)) {
            return true;
        }
        p pVar = this.f5675c1;
        if (zM && pVar.f5712d == 3) {
            pVar.f5716h = -9223372036854775807L;
            return true;
        }
        if (pVar.f5716h != -9223372036854775807L) {
            pVar.f5718j.getClass();
            if (SystemClock.elapsedRealtime() < pVar.f5716h) {
                return true;
            }
            pVar.f5716h = -9223372036854775807L;
        }
        return false;
    }

    @Override // a5.v
    public final void m0() {
        super.m0();
        this.f5688p1 = 0;
    }

    @Override // a5.v, v4.d
    public final void n() {
        v4.e eVar;
        k0.o oVar = this.Z0;
        this.f5693u1 = null;
        this.f5675c1.a(0);
        C0();
        this.f5683k1 = false;
        this.f5698z1 = null;
        try {
            super.n();
            eVar = this.S0;
            oVar.getClass();
            synchronized (eVar) {
            }
        } finally {
            eVar = this.S0;
            oVar.getClass();
            synchronized (eVar) {
                Handler handler = (Handler) oVar.f8998u;
                if (handler != null) {
                    handler.post(new ad.a(oVar, 5, eVar));
                }
                oVar.K(w0.f16000e);
            }
        }
    }

    @Override // v4.d
    public final void o(boolean z10, boolean z11) {
        this.S0 = new v4.e();
        u0 u0Var = this.f21874w;
        u0Var.getClass();
        boolean z12 = u0Var.b;
        r4.a.i((z12 && this.f5697y1 == 0) ? false : true);
        if (this.f5696x1 != z12) {
            this.f5696x1 = z12;
            k0();
        }
        v4.e eVar = this.S0;
        k0.o oVar = this.Z0;
        Handler handler = (Handler) oVar.f8998u;
        if (handler != null) {
            handler.post(new x(4, eVar, oVar));
        }
        this.f5675c1.f5712d = z11 ? 1 : 0;
    }

    @Override // v4.d
    public final void p() {
        r4.q qVar = this.f21877z;
        qVar.getClass();
        this.f5675c1.f5718j = qVar;
        e eVar = this.Y0;
        r4.a.i(!eVar.b());
        eVar.f5651c = qVar;
    }

    @Override // a5.v, v4.d
    public final void q(boolean z10, long j10) {
        super.q(z10, j10);
        e eVar = this.Y0;
        if (eVar.b()) {
            eVar.d(this.T0.f260c);
        }
        p pVar = this.f5675c1;
        v vVar = pVar.b;
        vVar.f5736m = 0L;
        vVar.f5739p = -1L;
        vVar.f5737n = -1L;
        pVar.f5715g = -9223372036854775807L;
        pVar.f5713e = -9223372036854775807L;
        pVar.a(1);
        pVar.f5716h = -9223372036854775807L;
        if (z10) {
            pVar.f5718j.getClass();
            pVar.f5716h = SystemClock.elapsedRealtime() + HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
        }
        C0();
        this.f5687o1 = 0;
    }

    @Override // a5.v
    public final boolean q0(a5.p pVar) {
        return this.f5680h1 != null || G0(pVar);
    }

    @Override // v4.d
    public final void r() {
        e eVar = this.Y0;
        if (!eVar.b() || eVar.f5659k == 2) {
            return;
        }
        r4.s sVar = eVar.f5654f;
        if (sVar != null) {
            sVar.f18488a.removeCallbacksAndMessages(null);
        }
        eVar.f5656h = null;
        eVar.f5659k = 2;
    }

    @Override // v4.d
    public final void s() {
        try {
            try {
                G();
                k0();
                h0 h0Var = this.X;
                if (h0Var != null) {
                    h0Var.m(null);
                }
                this.X = null;
                this.f5695w1 = false;
                if (this.f5682j1 != null) {
                    D0();
                }
            } catch (Throwable th) {
                h0 h0Var2 = this.X;
                if (h0Var2 != null) {
                    h0Var2.m(null);
                }
                this.X = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.f5695w1 = false;
            if (this.f5682j1 != null) {
                D0();
            }
            throw th2;
        }
    }

    @Override // a5.v
    public final int s0(a5.w wVar, o4.o oVar) {
        boolean z10;
        int i2 = 0;
        if (!o4.e0.g(oVar.f15929m)) {
            return v4.d.f(0, 0, 0, 0);
        }
        boolean z11 = oVar.f15932p != null;
        Context context = this.X0;
        List listY0 = y0(context, wVar, oVar, z11, false);
        if (z11 && listY0.isEmpty()) {
            listY0 = y0(context, wVar, oVar, false, false);
        }
        if (listY0.isEmpty()) {
            return v4.d.f(1, 0, 0, 0);
        }
        int i10 = oVar.I;
        if (i10 != 0 && i10 != 2) {
            return v4.d.f(2, 0, 0, 0);
        }
        a5.p pVar = (a5.p) listY0.get(0);
        boolean zD = pVar.d(oVar);
        if (!zD) {
            int i11 = 1;
            while (true) {
                if (i11 >= listY0.size()) {
                    z10 = true;
                    break;
                }
                a5.p pVar2 = (a5.p) listY0.get(i11);
                if (pVar2.d(oVar)) {
                    z10 = false;
                    zD = true;
                    pVar = pVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = zD ? 4 : 3;
        int i13 = pVar.e(oVar) ? 16 : 8;
        int i14 = pVar.f252g ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (r4.v.f18493a >= 26 && "video/dolby-vision".equals(oVar.f15929m) && !i.a(context)) {
            i15 = MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE;
        }
        if (zD) {
            List listY1 = y0(context, wVar, oVar, z11, true);
            if (!listY1.isEmpty()) {
                Pattern pattern = e0.f218a;
                ArrayList arrayList = new ArrayList(listY1);
                Collections.sort(arrayList, new a5.y(new a5.x(oVar, i2), i2));
                a5.p pVar3 = (a5.p) arrayList.get(0);
                if (pVar3.d(oVar) && pVar3.e(oVar)) {
                    i2 = 32;
                }
            }
        }
        return i12 | i13 | i2 | i14 | i15;
    }

    @Override // v4.d
    public final void t() {
        this.f5686n1 = 0;
        this.f21877z.getClass();
        this.f5685m1 = SystemClock.elapsedRealtime();
        this.f5689q1 = 0L;
        this.f5690r1 = 0;
        p pVar = this.f5675c1;
        pVar.f5711c = true;
        pVar.f5718j.getClass();
        pVar.f5714f = r4.v.B(SystemClock.elapsedRealtime());
        v vVar = pVar.b;
        vVar.f5728d = true;
        vVar.f5736m = 0L;
        vVar.f5739p = -1L;
        vVar.f5737n = -1L;
        s sVar = vVar.b;
        if (sVar != null) {
            u uVar = vVar.f5727c;
            uVar.getClass();
            uVar.f5723u.sendEmptyMessage(1);
            sVar.e(new a5.x(vVar, 9));
        }
        vVar.c(false);
    }

    @Override // v4.d
    public final void u() {
        A0();
        int i2 = this.f5690r1;
        if (i2 != 0) {
            long j10 = this.f5689q1;
            k0.o oVar = this.Z0;
            Handler handler = (Handler) oVar.f8998u;
            if (handler != null) {
                handler.post(new x(oVar, j10, i2));
            }
            this.f5689q1 = 0L;
            this.f5690r1 = 0;
        }
        p pVar = this.f5675c1;
        pVar.f5711c = false;
        pVar.f5716h = -9223372036854775807L;
        v vVar = pVar.b;
        vVar.f5728d = false;
        s sVar = vVar.b;
        if (sVar != null) {
            sVar.i();
            u uVar = vVar.f5727c;
            uVar.getClass();
            uVar.f5723u.sendEmptyMessage(2);
        }
        vVar.a();
    }

    @Override // a5.v, v4.d
    public final void x(long j10, long j11) throws v4.j {
        super.x(j10, j11);
    }
}
