package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortOrder {
    private final int[] array;

    public SortOrder(int[] array) {
        this.array = array;
    }

    public void sortASC () {
        boolean isSwapped;

        for (int i = 0; i < array.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        System.out.println(Arrays.toString(array));
    }

    public void sortDESC () {
        boolean isSwapped;

        for (int i = 0; i < array.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        System.out.println(Arrays.toString(array));
    }

    public void runSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unsorted Array: " + Arrays.toString(array));
        System.out.println("Choose Sort Direction:");
        System.out.println(" 1. Ascending\n 2. Descending");
        System.out.print("Selected Direction: ");
        int directionInput = scanner.nextInt();

        if (directionInput == 1) {
            sortASC();
        } else if (directionInput == 2) {
            sortDESC();
        } else {
            System.out.println("Invalid Input!");
        }
    }
}
