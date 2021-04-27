package net.wedocode.behavioural.visitor;

import java.util.ArrayList;

// ConcreteElement A/B
public class Director extends EmployeeBase{

    public ArrayList<EmployeeBase> Subordinates;

    public Director() {
        Subordinates =  new ArrayList<EmployeeBase>();
    }


    @Override
    public void accept(VisitorBase visitor) {
        visitor.visit(this);
        for (EmployeeBase subordinates: Subordinates)
        {
            subordinates.accept(visitor);
        }
    }
}
