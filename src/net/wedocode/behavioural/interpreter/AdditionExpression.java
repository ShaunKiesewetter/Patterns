package net.wedocode.behavioural.interpreter;

public class AdditionExpression extends ExpressionBase{

    ExpressionBase expr1;
    ExpressionBase expr2;

    public AdditionExpression(ExpressionBase expr1, ExpressionBase expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public int evaluate() {
        Integer value1 = expr1.evaluate();
        Integer value2 = expr2.evaluate();
        return value1 + value2;
    }

    @Override
    public String toString() {
        return "AdditionExpression{" +
                "expr1=" + expr1 +
                ", expr2=" + expr2 +
                '}';
    }
}
