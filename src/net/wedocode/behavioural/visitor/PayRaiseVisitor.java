package net.wedocode.behavioural.visitor;

// ConcreteVisitor A/B
public class PayRaiseVisitor  extends VisitorBase{

    Double _multiplier;

    public PayRaiseVisitor(Double _multiplier) {
        this._multiplier = _multiplier;
        TotalIncrease = 0D;
    }

    public Double TotalIncrease;

    @Override
    public void visit(Supervisor employee) {
        double increase = employee.MonthlySalary * _multiplier;
        employee.MonthlySalary += increase;
        TotalIncrease += increase;
        System.out.println(String.format("$s salary increased by %s.", employee.Name, increase));
    }

    @Override
    public void visit(Director employee) {
        double increase = employee.MonthlySalary * _multiplier;
        employee.MonthlySalary += increase;
        TotalIncrease += increase;
        System.out.println(String.format("$s salary increased by %s.", employee.Name, increase));
    }
}
