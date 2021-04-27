package net.wedocode.creational.abstractFactory;

public class Client {

    private Packaging packaging;
    private DeliveryDocument deliveryDocument;

    public Client(PurchaseFactory factory){
        packaging = factory.CreatePackaging();
        deliveryDocument = factory.CreateDeliveryDocument();
    }

    public Packaging getClientPackaging(){
        return packaging;
    }

    public DeliveryDocument getDeliveryDocument(){
        return deliveryDocument;
    }

}
