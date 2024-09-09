package exercise;

import java.util.Scanner;

public class ReverseString {
    public static void reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the String: ");
        String stringInput = scanner.nextLine();

        StringBuilder reverseString = new StringBuilder();

        for (int i = stringInput.length() - 1; i >= 0; i--) {
            reverseString.append(stringInput.charAt(i));
        }

        System.out.println("Reversed String: " + reverseString);
    }
}
