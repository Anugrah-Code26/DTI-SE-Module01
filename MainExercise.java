import exercise.*;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a menu of exercise numbers
        System.out.println("Choose an exercise to run by its number (1-6):");
        System.out.println("1. Word Guessing Game!");
        System.out.println("2. Currency Converter!");
        System.out.println("3. Remove Odd Number!");

        // Input for selecting exercise number
        System.out.print("Enter the number of the exercise you want to run: ");
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch (exerciseNumber) {
            case 1:
                System.out.println("1. Word Guessing Game!");
                WordGuessingGame.runGame();

                break;

            case 2:
                System.out.println("2. Currency Converter!");
                CurrencyConverter.run();

                break;

            case 3:
                System.out.println("3. Remove Odd Number!");
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                RemoveOddNumber removeOddNumber = new RemoveOddNumber(array);
                int[] evenNumbers = removeOddNumber.arrEvenNumber();
                System.out.println("The Array: " + Arrays.toString(array));
                System.out.println("The Even Array: " + Arrays.toString(evenNumbers));

                break;

            case 4:
                System.out.println("4. Currency Converter!");

                break;

            case 5:
                System.out.println("5. Currency Converter!");

                break;
        }
    }
}
