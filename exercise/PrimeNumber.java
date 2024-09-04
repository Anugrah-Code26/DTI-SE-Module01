package exercise;

public class PrimeNumber {
    private final int num;

    public PrimeNumber (int num) {
        this.num = num;
    }

    public String checkPrimeNumber() {
        if (num <= 1) {
            return "Not Prime Number";
        }
        if (num == 2) {
            return "Prime Number";
        }
        if (num % 2 == 0) {
            return "Not Prime Number";
        }
        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                return "Not Prime Number";
            }
        }
        return "Prime Number";
    }
}
