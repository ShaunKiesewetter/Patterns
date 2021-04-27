package net.wedocode.structural.flyweight;

public class Soldier extends Unit{

    public Soldier(String name, Integer armour, Integer speed, Integer rotationRate, Integer fireRate, Integer range, Integer firePower) {
        super(name, armour, speed, rotationRate, fireRate, range, firePower);
    }

    @Override
    public void FireAt(Target target) {
        System.out.println(String.format("Shooting at unit %s with power of %s", target.ID, firePower));
    }
}
