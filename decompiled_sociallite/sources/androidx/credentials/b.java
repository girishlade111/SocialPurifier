package androidx.credentials;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ android.credentials.ClearCredentialStateRequest a(Bundle bundle) {
        return new android.credentials.ClearCredentialStateRequest(bundle);
    }

    public static /* synthetic */ android.credentials.CreateCredentialRequest.Builder d(Bundle bundle, String str, Bundle bundle2) {
        return new android.credentials.CreateCredentialRequest.Builder(str, bundle, bundle2);
    }

    public static /* bridge */ /* synthetic */ android.credentials.CredentialManager g(Object obj) {
        return (android.credentials.CredentialManager) obj;
    }

    public static /* synthetic */ android.credentials.CredentialOption.Builder j(Bundle bundle, String str, Bundle bundle2) {
        return new android.credentials.CredentialOption.Builder(str, bundle, bundle2);
    }

    public static /* synthetic */ android.credentials.GetCredentialRequest.Builder l(Bundle bundle) {
        return new android.credentials.GetCredentialRequest.Builder(bundle);
    }

    public static /* synthetic */ void s() {
    }
}
