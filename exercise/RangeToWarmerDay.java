package exercise;

import java.util.Arrays;

public class RangeToWarmerDay {
    private final int[] temperatureArray;

    public RangeToWarmerDay(int[] temperatureArray) {
        this.temperatureArray = temperatureArray;
    }

    public void rangeDay() {
        int[] range = new int[temperatureArray.length];

        for (int i = 0; i < temperatureArray.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < temperatureArray.length; j++) {
                count++;
                if (temperatureArray[j] > temperatureArray[i]) {
                    range[i] = count;
                    break;
                }
            }
        }
        System.out.println("Temperature: " + Arrays.toString(temperatureArray));
        System.out.println("Range to Warmer Day: " + Arrays.toString(range));
    }
}
