package exercise;

import java.util.Arrays;

public class FindDuplicateValue {
    private final int[] duplicateArray;

    public FindDuplicateValue(int[] duplicateArray) {
        this.duplicateArray = duplicateArray;
    }

    public void find() {
        System.out.println("Array: " + Arrays.toString(duplicateArray));

        Arrays.sort(duplicateArray);
        int[] temp = new int[duplicateArray.length];
        int k = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < duplicateArray.length - 1; i++) {
            if (duplicateArray[i] == duplicateArray[i + 1] && !isDuplicate) {
                temp[k++] = duplicateArray[i];
                isDuplicate = true;
            } else {
                isDuplicate = false;
            }
        }

        int[] duplicateValue = new int[k];
        System.arraycopy(temp, 0, duplicateValue, 0, k);
        System.out.println("Duplicate Value: " + Arrays.toString(duplicateValue));
    }
}
