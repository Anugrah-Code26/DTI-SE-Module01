package exercise;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddNumber {
    private final int[] arrNumber;

    public RemoveOddNumber (int[] arrNumber) {
        this.arrNumber = arrNumber;
    }

    public int[] arrEvenNumber () {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int j : arrNumber) {
            if (j % 2 == 0) {
                evenNumbers.add(j);
            }
        }
        return evenNumbers.stream().mapToInt(i -> i).toArray();
    }
}
