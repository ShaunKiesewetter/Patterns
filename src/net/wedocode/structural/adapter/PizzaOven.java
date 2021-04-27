package net.wedocode.structural.adapter;

public class PizzaOven {

    // Our pizza oven accepts a type of Cookable considering you could actually cook anything in this oven not just pizza.
    public String Cook(Cookable target)
    {
        return target.Cook();
    }
}
