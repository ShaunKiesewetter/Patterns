package net.wedocode.behavioural.visitor;

// ElementBase
public abstract class EmployeeBase {

    public abstract void accept(VisitorBase visitor);

    public String Name;

    public double MonthlySalary;
}
