package net.wedocode.structural.decorator.pizzadecorators;

import net.wedocode.structural.decorator.*;

public class ExtraOlivesDecorator extends Decorator {

    private final Double toppingCost = 4d;

    public ExtraOlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    public Double calculateCost(){
        return pizza.calculateCost() + toppingCost;
    }

    public  String getDescription(){
        return pizza.getDescription() + " extra olives @" + toppingCost;
    }
}
