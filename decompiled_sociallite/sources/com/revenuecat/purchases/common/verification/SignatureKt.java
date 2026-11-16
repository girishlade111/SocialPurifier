package com.revenuecat.purchases.common.verification;

import te.j;

/* JADX INFO: loaded from: classes.dex */
public final class SignatureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] copyOf(byte[] bArr, Signature.Component component) {
        return j.S(bArr, component.getStartByte(), component.getEndByte());
    }
}
