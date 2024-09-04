package exercise;

public class SimpleCalculator {
    private final double num1;
    private final double num2;
    private final String operator;

    public SimpleCalculator (double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double simpleCalculation () {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            default -> throw new IllegalArgumentException("Operator not known!");
        };
    }
}
