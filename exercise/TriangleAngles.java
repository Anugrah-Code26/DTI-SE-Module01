package exercise;

public class TriangleAngles {
    private double a;
    private double b;

    public TriangleAngles(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getAngle1() {
        return a;
    }

    public double getAngle2() {
        return b;
    }

    public double calculateAngle() {
        return 180 - (a + b);
    }
}
