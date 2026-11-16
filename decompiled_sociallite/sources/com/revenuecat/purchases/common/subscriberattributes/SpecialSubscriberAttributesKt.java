package com.revenuecat.purchases.common.subscriberattributes;

/* JADX INFO: loaded from: classes.dex */
public final class SpecialSubscriberAttributesKt {
    public static final SubscriberAttributeKey getSubscriberAttributeKey(String str) {
        str.getClass();
        if (str.equals(ReservedSubscriberAttribute.EMAIL.getValue())) {
            return SubscriberAttributeKey.Email.INSTANCE;
        }
        if (str.equals(ReservedSubscriberAttribute.DISPLAY_NAME.getValue())) {
            return SubscriberAttributeKey.DisplayName.INSTANCE;
        }
        if (str.equals(ReservedSubscriberAttribute.PHONE_NUMBER.getValue())) {
            return SubscriberAttributeKey.PhoneNumber.INSTANCE;
        }
        return str.equals(ReservedSubscriberAttribute.FCM_TOKENS.getValue()) ? SubscriberAttributeKey.FCMTokens.INSTANCE : new SubscriberAttributeKey.Custom(str);
    }
}
