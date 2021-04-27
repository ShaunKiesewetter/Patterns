package net.wedocode.structural.decorator;

// Player: A Concrete Pizza component representing the brown field application.
public class LargePizza extends Pizza {

    public Double calculateCost(){
        return 10d;
    }

    public  String getDescription(){
        return "Big Pizza.";
    }

}