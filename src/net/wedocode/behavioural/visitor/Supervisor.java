package net.wedocode.behavioural.visitor;

// ConcreteElement A/B
public class Supervisor extends EmployeeBase{
    @Override
    public void accept(VisitorBase visitor) {
        visitor.visit(this);
    }
}
