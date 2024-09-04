package exercise;

public class EvenOdd {
    private int number;

    public EvenOdd (int number) {
        this.number = number;
    }

    public String getEvenOdd() {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public boolean getEven() {
        return (number % 2 == 0);
    }
}
