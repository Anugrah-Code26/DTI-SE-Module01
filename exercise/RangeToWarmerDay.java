package exercise;

import java.util.Arrays;

public class RangeToWarmerDay {
    private final int[] temperatureArray;

    public RangeToWarmerDay(int[] temperatureArray) {
        this.temperatureArray = temperatureArray;
    }

    public void rangeDay() {
        System.out.println("Temperature: " + Arrays.toString(temperatureArray));
        int[] range = new int[temperatureArray.length];
        int count = 0;

        for (int i = 0; i < temperatureArray.length - 1; i++) {
            if (temperatureArray[i] < temperatureArray[i + 1]) {
                count++;
            } else {
                for (int j = i + 1; j < temperatureArray.length - 1; j++) {
                    count++;
                    if (temperatureArray[i] < temperatureArray[j]) {
                        break;
                    }
                }
            }
            range[i] = count;
            count = 0;
        }
        System.out.println("Range to Warmer Day: " + Arrays.toString(range));
    }
}
