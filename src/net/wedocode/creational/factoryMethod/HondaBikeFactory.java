package net.wedocode.creational.factoryMethod;



// Concrete Factory
public class HondaBikeFactory extends BikeFactory{
    @Override
    public Bike CreateBike(String model) {
        switch (model.toLowerCase()){
            case "cruiser":  return new HondaCruiser();
            case "dirtbike":  return new HondaDirtBike();
            default: throw new IllegalArgumentException();
        }
    }
}
