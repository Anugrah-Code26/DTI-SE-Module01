package exercise;

public class LargestNumber {
    private final int[] numbers;

    public LargestNumber (int[] numbers) {
        this.numbers = numbers;
    }

    public int findLargestNumber() {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
