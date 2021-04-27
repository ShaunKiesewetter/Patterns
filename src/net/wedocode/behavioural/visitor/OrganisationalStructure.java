package net.wedocode.behavioural.visitor;

// Object Structure
public class OrganisationalStructure {
    public EmployeeBase Employee;

    public OrganisationalStructure(EmployeeBase firstEmployee) {
        Employee = firstEmployee;
    }

    public void Accept(VisitorBase visitor)
    {
        Employee.accept(visitor);
    }
}
