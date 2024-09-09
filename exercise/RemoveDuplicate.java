package exercise;

import java.util.Arrays;

public class RemoveDuplicate {
    private final int[] duplicateArray;

    public RemoveDuplicate(int[] duplicateArray) {
        this.duplicateArray = duplicateArray;
    }

    public void remove() {
        System.out.println("Array: " + Arrays.toString(duplicateArray));

        Arrays.sort(duplicateArray);
        int[] temp = new int[duplicateArray.length];
        int k = 0;
        temp[k++] = duplicateArray[0];

        for (int i = 1; i < duplicateArray.length; i++) {
            if (duplicateArray[i] != duplicateArray[i - 1]) {
                temp[k++] = duplicateArray[i];
            }
        }

        int[] nonDuplicate = new int[k];
        System.arraycopy(temp, 0, nonDuplicate, 0, k);
        System.out.println("Non Duplicate Array: " + Arrays.toString(nonDuplicate));
    }
}
