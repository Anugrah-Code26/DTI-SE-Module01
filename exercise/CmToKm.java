package exercise;

public class CmToKm {
    private double centimeter;

    public CmToKm (double centimeter) {
        this.centimeter = centimeter;
    }

    public double getKilometer() {
        return centimeter / 100000;
    }
}
