package net.wedocode.structural.adapter;

public class PizzaCookingAdapter implements Cookable{

    private final Hamburger hamburger;

    public  PizzaCookingAdapter(Hamburger hamburger){
        this.hamburger = hamburger;
    }

    @Override
    public String Cook() {
        return hamburger.Cook(); // Could of also called grill() or even done some return type conversions. This is the wrapper method.
    }
}
