package net.wedocode.structural.bridge;

import java.time.LocalDate;

public abstract class MovieLicense {

    // This is the key to the bridge pattern. Composition on one abstraction into another.
    protected final DiscountBridge discount;

    public MovieLicense(){
        this.discount = new NoDiscount();
    }

    public MovieLicense(DiscountBridge discount)
    {
        if (discount == null){
            discount = new NoDiscount();
        }
        this.discount = discount;
    }

    protected final LocalDate purchaseDate = LocalDate.now();
    public abstract String getDescription();
    public abstract Double getPrice();
    public abstract LocalDate expiryDate();

}