package exercise;

public class FahrenheitToCelsius {
    private double fahrenheit;

    public FahrenheitToCelsius(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5 / 9 ;
    }
}
