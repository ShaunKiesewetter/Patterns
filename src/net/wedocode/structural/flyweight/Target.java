package net.wedocode.structural.flyweight;

import java.util.UUID;

public class Target {
    public Unit UnitData;
    public UUID ID;
    public Target()
    {
        this.ID = UUID.randomUUID();
    }
}
