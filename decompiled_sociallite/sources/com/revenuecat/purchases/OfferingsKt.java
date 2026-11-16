package com.revenuecat.purchases;

import java.util.ArrayList;
import java.util.List;
import te.l;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingsKt {
    public static final Offering withPresentedContext(Offering offering, String str, Offerings.Targeting targeting) {
        offering.getClass();
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(l.I(availablePackages, 10));
        for (Package r9 : availablePackages) {
            PresentedOfferingContext presentedOfferingContext = r9.getPresentedOfferingContext();
            PresentedOfferingContext presentedOfferingContextCopy$default = PresentedOfferingContext.copy$default(presentedOfferingContext, null, str == null ? presentedOfferingContext.getPlacementIdentifier() : str, targeting != null ? new PresentedOfferingContext.TargetingContext(targeting.getRevision(), targeting.getRuleId()) : presentedOfferingContext.getTargetingContext(), 1, null);
            arrayList.add(new Package(r9.getIdentifier(), r9.getPackageType(), r9.getProduct().copyWithPresentedOfferingContext(presentedOfferingContextCopy$default), presentedOfferingContextCopy$default, r9.getWebCheckoutURL()));
        }
        return new Offering(offering.getIdentifier(), offering.getServerDescription(), offering.getMetadata(), arrayList, offering.getPaywall(), offering.getPaywallComponents(), offering.getWebCheckoutURL());
    }
}
