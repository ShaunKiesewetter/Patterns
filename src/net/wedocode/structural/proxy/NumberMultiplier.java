package net.wedocode.structural.proxy;

public class NumberMultiplier extends CalculatorBase {
    @Override
    public Integer Calculate() {
        Integer result = 1;
         for (Integer i = 2; i <= 10; i++){
             result *= i;
         }
        return result;
    }
}
