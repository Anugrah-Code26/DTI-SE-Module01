package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    private final int[] originalArray;

    public ArrayRotation(int[] originalArray) {
        this.originalArray = originalArray;
    }

    public void rotate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from which index the array will rotate: ");
        int splitIndex = scanner.nextInt();

        int[] rotatedArray = new int[originalArray.length];

        System.arraycopy(originalArray, 0, rotatedArray, rotatedArray.length - splitIndex - 1, splitIndex + 1);
        System.arraycopy(originalArray, splitIndex + 1, rotatedArray, 0, rotatedArray.length - splitIndex - 1);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Rotated array from index " + splitIndex + ": " + Arrays.toString(rotatedArray));
    }
}
