package net.wedocode.structural.decorator.pizzadecorators;

import net.wedocode.structural.decorator.*;

public class ExtraAvoDecorator extends Decorator {

    private final Double toppingCost = 9d;

    public ExtraAvoDecorator(Pizza pizza) {
        super(pizza);
    }

    public Double calculateCost(){
        return pizza.calculateCost() + toppingCost;
    }

    public  String getDescription(){
        return pizza.getDescription() + " extra avo @" + toppingCost;
    }
}