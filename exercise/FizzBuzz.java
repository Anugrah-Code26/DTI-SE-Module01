package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void runFizzBuzz () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n sequence number: ");
        int n = scanner.nextInt();

        String[] fizzbuzz = new String[n];

        for (int i = 1; i <= n ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzbuzz[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                fizzbuzz[i-1] = "Buzz";
            } else {
                fizzbuzz[i-1] = String.valueOf(i);
            }
        }
        System.out.println(Arrays.toString(fizzbuzz));
    }
}
