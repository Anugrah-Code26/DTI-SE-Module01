package exercise;

public class SumDigits {
    private int num;

    public SumDigits (int num) {
        this.num = num;
    }

    public int calculateSum() {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
