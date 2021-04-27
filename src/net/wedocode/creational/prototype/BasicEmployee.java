package net.wedocode.creational.prototype;

public abstract class BasicEmployee {
    public abstract BasicEmployee CloneEmployee() throws CloneNotSupportedException;
    public String Name;
    public String Role ;
}
