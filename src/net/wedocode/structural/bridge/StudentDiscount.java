package net.wedocode.structural.bridge;

public class StudentDiscount extends DiscountBridge{
    @Override
    public double getDiscount() {
        return 0.9D; // 10 percent discount for students
    }

    @Override
    public String getDescription() {
        return " a student discount of 10 % will be applied";
    }
}
