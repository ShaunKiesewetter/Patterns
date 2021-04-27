package net.wedocode.structural.bridge;

public class NoDiscount extends DiscountBridge{
    @Override
    public double getDiscount() {
        return 1; // No discount
    }

    @Override
    public String getDescription() {
        return " Standard pricing applied";
    }
}

