package net.wedocode.structural.bridge;

public class SeniorDiscount extends DiscountBridge{
    @Override
    public double getDiscount() {
        return 0.8D; // 20 percent discount
    }

    @Override
    public String getDescription() {
        return " a Senior discount of 20% will apply";
    }
}

