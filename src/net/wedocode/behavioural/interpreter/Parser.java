package net.wedocode.behavioural.interpreter;

import java.util.ArrayList;
import java.util.Arrays;

/// Parser is simply to show off the Interpreter design pattern.
public class Parser
{
    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public ExpressionBase parse(String polish)
    {
        ArrayList<String> symbols = new ArrayList<String>(Arrays.asList(polish.split(" ")));
        return parseNextExpression(symbols);
    }

    public ExpressionBase parseNextExpression(ArrayList<String> symbols)
    {
        Integer value = tryParse(symbols.get(0));
        if (value != null){
            symbols.remove(0);
            return new IntegerExpression(value);
        }
        else {
            return parseNonTerminalExpression(symbols);
        }

    }

    private ExpressionBase parseNonTerminalExpression(ArrayList<String> symbols)
    {
        String symbol = symbols.get(0);
        symbols.remove(0);

        ExpressionBase expr1 = parseNextExpression(symbols);
        ExpressionBase expr2 = parseNextExpression(symbols);

        switch (symbol)
        {
            case "+":
                return new AdditionExpression(expr1, expr2);
            case "-":
                return new SubtractExpression(expr1, expr2);
            default:
                String message = String.format("Invalid Symbol %s)", symbol);
                throw new IllegalStateException(message);
        }
    }



}
