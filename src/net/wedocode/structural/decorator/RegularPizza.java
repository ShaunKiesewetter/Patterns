package net.wedocode.structural.decorator;

// Player: A Concrete Pitza component
public class RegularPizza extends Pizza{

    public Double calculateCost(){
        return 7d;
    }

    public  String getDescription(){
        return "Medium Pizza.";
    }

}
