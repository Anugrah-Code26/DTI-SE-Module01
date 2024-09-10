package exercise;

import java.util.Arrays;

public class RemoveDuplicate {
    private final int[] duplicateArray;

    public RemoveDuplicate(int[] duplicateArray) {
        this.duplicateArray = duplicateArray;
    }

    public void remove() {
        Arrays.sort(duplicateArray);
        int[] temp = new int[duplicateArray.length];
        int tempIndex = 0;
        temp[tempIndex++] = duplicateArray[0];

        for (int i = 1; i < duplicateArray.length; i++) {
            if (duplicateArray[i] != duplicateArray[i - 1]) {
                temp[tempIndex++] = duplicateArray[i];
            }
        }

        int[] nonDuplicate = new int[tempIndex];
        System.arraycopy(temp, 0, nonDuplicate, 0, tempIndex);
        System.out.println("Array: " + Arrays.toString(duplicateArray));
        System.out.println("Non Duplicate Array: " + Arrays.toString(nonDuplicate));
    }
}
