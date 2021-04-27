package net.wedocode.structural.flyweight;

public class Tank extends Unit{

    public Tank(String name, Integer armour, Integer speed, Integer rotationRate, Integer fireRate, Integer range, Integer firePower) {
        super(name, armour, speed, rotationRate, fireRate, range, firePower);
    }

    @Override
    public void FireAt(Target target) {
            System.out.println(String.format("Firing at unit %s with power of %s", target.ID, firePower));

    }
}
