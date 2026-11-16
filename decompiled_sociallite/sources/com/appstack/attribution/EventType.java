package com.appstack.attribution;

import u7.f;

/* JADX INFO: loaded from: classes.dex */
public enum EventType {
    INSTALL,
    LOGIN,
    SIGN_UP,
    REGISTER,
    PURCHASE,
    ADD_TO_CART,
    ADD_TO_WISHLIST,
    INITIATE_CHECKOUT,
    START_TRIAL,
    SUBSCRIBE,
    LEVEL_START,
    LEVEL_COMPLETE,
    TUTORIAL_COMPLETE,
    SEARCH,
    VIEW_ITEM,
    VIEW_CONTENT,
    SHARE,
    CUSTOM;

    private static final /* synthetic */ af.a $ENTRIES = f.n(values());

    public static af.a getEntries() {
        return $ENTRIES;
    }
}
