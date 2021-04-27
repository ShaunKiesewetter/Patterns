package net.wedocode.behavioural.chainOfResponsibility;

// Not part of the pattern, this is simply the model we use as the subject of the pattern.
public class Coin {
    public double Weight;
    public double Diameter;

    public Coin(double diameter, double weight) {
        Weight = weight;
        Diameter = diameter;
    }
}
