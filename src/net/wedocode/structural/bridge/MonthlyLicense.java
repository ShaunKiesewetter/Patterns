package net.wedocode.structural.bridge;

import java.time.LocalDate;

public class MonthlyLicense extends MovieLicense{

    public MonthlyLicense(){
        super();
    }

    public MonthlyLicense(DiscountBridge discount) {
        super(discount);
    }

    @Override
    public String getDescription() {
        return "Monthly License" + this.discount.getDescription();
    }

    @Override
    public Double getPrice() {
        return  10D * this.discount.getDiscount();
    }

    @Override
    public LocalDate expiryDate() {
        return  this.purchaseDate.plusMonths(1);
    }

}
