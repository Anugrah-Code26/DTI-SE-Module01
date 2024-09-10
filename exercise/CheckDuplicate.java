package exercise;

import java.util.Arrays;

public class CheckDuplicate {
    private final int[] array;

    public CheckDuplicate(int[] array) {
        this.array = array;
    }

    public void check() {
        boolean isDuplicate = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println(isDuplicate ? "True" : "False");
    }
}
