package exercise;

public class BubbleSortASC {
    private final int[] array;

    public BubbleSortASC(int[] array) {
        this.array = array;
    }

    public int[] sortArray () {
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
        return array;
    }
}
