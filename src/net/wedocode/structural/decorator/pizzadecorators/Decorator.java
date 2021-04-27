package net.wedocode.structural.decorator.pizzadecorators;

import net.wedocode.structural.decorator.*;

// Player: The Decorator
// We can consider this the new code, which will inject new functionality into the legacy Pizza domain objects.
public abstract class Decorator extends Pizza { // <- Structural note, it extends the legacy component

    protected Pizza pizza; // Structural note, compose an instance of the legacy object.

    public Decorator(Pizza pizza){
        this.pizza = pizza;
    }
}