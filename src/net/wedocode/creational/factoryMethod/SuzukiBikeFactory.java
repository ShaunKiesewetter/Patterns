package net.wedocode.creational.factoryMethod;

// Concrete Factory
public class SuzukiBikeFactory extends BikeFactory{
    @Override
    public Bike CreateBike(String model) {
        switch (model.toLowerCase()){
            case "cruiser":  return new SuzukiCruiser();
            case "dirtbike":  return new SuzukiDirtBike();
            default: throw new IllegalArgumentException();
        }
    }
}
