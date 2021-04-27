package net.wedocode.creational.abstractFactory;

public class DelicatePurchaseFactory extends PurchaseFactory {
    @Override
    public Packaging CreatePackaging() {
        return new ShockProofPackaging();
    }

    @Override
    public DeliveryDocument CreateDeliveryDocument() {
        return new CourierManifest();
    }
}
