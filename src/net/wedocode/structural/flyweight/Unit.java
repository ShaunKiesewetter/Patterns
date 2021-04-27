package net.wedocode.structural.flyweight;

public abstract class Unit {


    protected final String name;
    protected final Integer armour;
    protected final Integer speed;
    protected final Integer rotationRate;
    protected final Integer fireRate;
    protected final Integer range;
    protected final Integer firePower;



    public Unit(String name, Integer armour, Integer speed, Integer rotationRate, Integer fireRate, Integer range, Integer firePower){
        this.name = name;
        this.armour = armour;
        this.speed = speed;
        this.rotationRate = rotationRate;
        this.fireRate = fireRate;
        this.range = range;
        this.firePower = firePower;
    }

    public abstract void FireAt(Target target);
}
