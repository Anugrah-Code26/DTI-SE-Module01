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

        System.out.println("Array: " + Arrays.toString(array));

        System.out.print("Enter which value you want to remove: ");
        int removedValue = scanner.nextInt();

        int k = 0;
        int[] temp = new int[array.length];

        for (int i : array) {
            if (i != removedValue) {
                temp[k++] = i;
            }
        }

        int[] newArray = new int[k];
        System.arraycopy(temp, 0, newArray, 0, k);
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
