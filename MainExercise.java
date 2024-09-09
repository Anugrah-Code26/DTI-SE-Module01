import exercise.*;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a menu of exercise numbers
        System.out.println("Choose an exercise to run by its number (1-5):");
        System.out.println("1. Word Guessing Game!");
        System.out.println("2. Currency Converter!");
        System.out.println("3. Remove Odd Number!");
        System.out.println("4. FizzBuzz!");
        System.out.println("5. Addition Target!");

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
                RemoveOddNumber.run();

                break;

            case 4:
                System.out.println("4. FizzBuzz!");

                FizzBuzz.runFizzBuzz();

                break;

            case 5:
                System.out.println("5. Addition Target!");

                int[] numbers = {2, 7, 11, 15};
                System.out.print("Input target: ");
                int target = scanner.nextInt();;
                AdditionTarget additionTarget = new AdditionTarget(target, numbers);
                int[] result = additionTarget.numIndex();

                if (result.length == 2) {
                    System.out.println(Arrays.toString(result));
                } else {
                    System.out.println("No valid pair found!");
                }

                break;
        }
    }
}
