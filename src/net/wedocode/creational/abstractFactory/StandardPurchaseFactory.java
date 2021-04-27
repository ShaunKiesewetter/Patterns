package net.wedocode.creational.abstractFactory;

public class StandardPurchaseFactory extends PurchaseFactory{

    @Override
    public Packaging CreatePackaging() {
        return new StandardPackaging();
    }

    @Override
    public DeliveryDocument CreateDeliveryDocument() {
        return new PostalLabel();
    }
}
