package net.wedocode.structural.bridge;

import java.time.LocalDate;

public class YearlyLicense extends MovieLicense{

    public YearlyLicense(){super();}

    public YearlyLicense(DiscountBridge discount) {
        super(discount);
    }

    @Override
    public String getDescription() {
        return "Yearly License" + discount.getDescription();
    }

    @Override
    public Double getPrice() {
        return 100D * discount.getDiscount();
    }

    @Override
    public LocalDate expiryDate() {
        return this.purchaseDate.plusYears(1);
    }
}

