package net.wedocode.structural.composite;

public class Contractor implements Worker{

    private String Name = "";

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }
}
