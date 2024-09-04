package exercise;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateCircumference() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

}
