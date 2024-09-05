package exercise;

public class SimpleCalculator {
    private final double num1;
    private final double num2;
    private final int method;

    public SimpleCalculator (int method, double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.method = method;
    }

    public double simpleCalculation () {
        return switch (method) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> throw new IllegalArgumentException("Operator not known!");
        };
    }
}
