package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecific {
    private final int[] array;

    public RemoveSpecific(int[] array) {
        this.array = array;
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter which value you want to remove: ");
        int removedValue = scanner.nextInt();

        int tempIndex = 0;
        int[] temp = new int[array.length];

        for (int i : array) {
            if (i != removedValue) {
                temp[tempIndex++] = i;
            }
        }

        int[] newArray = new int[tempIndex];
        System.arraycopy(temp, 0, newArray, 0, tempIndex);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
