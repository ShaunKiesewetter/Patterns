package net.wedocode.behavioural.interpreter;

// Non Terminal expression
public class IntegerExpression extends ExpressionBase{

    public Integer value;

    public IntegerExpression(Integer value){
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "IntegerExpression{" +
                "value=" + value +
                '}';
    }
}
