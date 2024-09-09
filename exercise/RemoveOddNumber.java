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

        for (int i : arrNumber) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        return evenNumbers.stream().mapToInt(i -> i).toArray();
    }
}
