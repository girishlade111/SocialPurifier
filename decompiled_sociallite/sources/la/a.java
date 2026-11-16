package la;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c, IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f10108g;

    public a(IBinder iBinder) {
        this.f10108g = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10108g;
    }

    public final Bundle b(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i2 = w9.a.f22802a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f10108g.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                parcelObtain2.recycle();
                return bundle2;
            } catch (RuntimeException e10) {
                parcelObtain2.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
