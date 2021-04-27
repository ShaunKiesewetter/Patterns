package net.wedocode.behavioural.visitor;

// ConcreteVisitor A/B
public class PayrollVisitor extends VisitorBase {
    @Override
    public void visit(Supervisor employee) {
        System.out.println(String.format("%s paid %s.", employee.Name, employee.MonthlySalary));
    }

    @Override
    public void visit(Director employee) {
        System.out.println(String.format("%s paid %s + Bonus.", employee.Name, employee.MonthlySalary));
    }
}
