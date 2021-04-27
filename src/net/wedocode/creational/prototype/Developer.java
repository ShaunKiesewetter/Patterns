package net.wedocode.creational.prototype;

public class Developer extends BasicEmployee implements Cloneable{

    public String language;

    @Override
    public BasicEmployee CloneEmployee() throws CloneNotSupportedException {
        final BasicEmployee clone;
        clone = (BasicEmployee) this.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Name ='" + super.Name + '\'' +
                "Name ='" + super.Role + '\'' +
                "language='" + language + '\'' +
                '}';
    }
}
