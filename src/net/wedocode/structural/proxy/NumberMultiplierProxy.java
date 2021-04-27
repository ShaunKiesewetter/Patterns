package net.wedocode.structural.proxy;

public class NumberMultiplierProxy extends CalculatorBase{

    private NumberMultiplier realNumberMultiplier;
    private Integer cachedValue;

    @Override
    public Integer Calculate() {
        if (realNumberMultiplier == null){
            realNumberMultiplier = new NumberMultiplier();
            cachedValue = realNumberMultiplier.Calculate();
        }
        return  cachedValue;
    }
}
