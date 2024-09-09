package exercise;

public class AdditionTarget {
    private final int target;
    private final int[] number;

    public AdditionTarget(int target, int[] number) {
        this.target = target;
        this.number = number;
    }

    public int[] numIndex () {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}
