package net.wedocode.structural.decorator;

// Player: A Concrete Pizza component representing the brown field application.
public class SmallPizza extends Pizza{

    public Double calculateCost(){
        return 3d;
    }

    public  String getDescription(){
        return "Small Pizza.";
    }
}