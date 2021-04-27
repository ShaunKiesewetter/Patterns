package net.wedocode.behavioural.stategy;

public class Bank {
    public CalculationBase calculationAlgorithm;

    public void doSomeCalculation(Double input){
        if (calculationAlgorithm != null)
        {
            calculationAlgorithm.calculate(100D);
        }
    }
}
