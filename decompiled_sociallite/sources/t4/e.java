package t4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.CredentialOption;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    public FileInputStream A;
    public long B;
    public boolean C;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ContentResolver f20014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Uri f20015y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AssetFileDescriptor f20016z;

    public e(Context context) {
        super(false);
        this.f20014x = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // t4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f20015y = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.A     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.A = r0
            android.content.res.AssetFileDescriptor r3 = r5.f20016z     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f20016z = r0
            boolean r0 = r5.C
            if (r0 == 0) goto L2b
            r5.C = r2
            r5.p()
        L2b:
            return
        L2c:
            t4.d r4 = new t4.d     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f20016z = r0
            boolean r0 = r5.C
            if (r0 == 0) goto L3d
            r5.C = r2
            r5.p()
        L3d:
            throw r1
        L3e:
            t4.d r4 = new t4.d     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.A = r0
            android.content.res.AssetFileDescriptor r4 = r5.f20016z     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f20016z = r0
            boolean r0 = r5.C
            if (r0 == 0) goto L5d
            r5.C = r2
            r5.p()
        L5d:
            throw r3
        L5e:
            t4.d r4 = new t4.d     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f20016z = r0
            boolean r0 = r5.C
            if (r0 == 0) goto L6f
            r5.C = r2
            r5.p()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.e.close():void");
    }

    @Override // t4.h
    public final long g(j jVar) throws d {
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = jVar.f20022a;
                long j10 = jVar.f20026f;
                long j11 = jVar.f20025e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f20015y = uriNormalizeScheme;
                q();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f20014x;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f20016z = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + uriNormalizeScheme);
                    i2 = CredentialOption.PRIORITY_DEFAULT;
                    try {
                        throw new d(iOException, CredentialOption.PRIORITY_DEFAULT);
                    } catch (IOException e10) {
                        e = e10;
                        if (e instanceof FileNotFoundException) {
                            i2 = 2005;
                        }
                        throw new d(e, i2);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.A = fileInputStream;
                if (length != -1 && j11 > length) {
                    throw new d(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.B = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.B = jPosition;
                        if (jPosition < 0) {
                            throw new d(null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.B = j12;
                    if (j12 < 0) {
                        throw new d(null, 2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.B;
                    this.B = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.C = true;
                r(jVar);
                return j10 != -1 ? j10 : this.B;
            } catch (IOException e11) {
                e = e11;
                i2 = CredentialOption.PRIORITY_DEFAULT;
            }
        } catch (d e12) {
            throw e12;
        }
    }

    @Override // t4.h
    public final Uri m() {
        return this.f20015y;
    }

    @Override // o4.i
    public final int read(byte[] bArr, int i2, int i10) throws d {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.B;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new d(e10, CredentialOption.PRIORITY_DEFAULT);
                }
            }
            FileInputStream fileInputStream = this.A;
            int i11 = r4.v.f18493a;
            int i12 = fileInputStream.read(bArr, i2, i10);
            if (i12 != -1) {
                long j11 = this.B;
                if (j11 != -1) {
                    this.B = j11 - ((long) i12);
                }
                o(i12);
                return i12;
            }
        }
        return -1;
    }
}
