import exercise.*;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a menu of exercise numbers
        System.out.println("Choose an exercise to run by its number (1-6):");
        System.out.println("1. Create a program that prints a multiplication table up to n x n!");
        System.out.println("2. Write a program to print the following pattern for n rows");
        System.out.println("3. Write a code that reads n number of input from scanner");
        System.out.println("4. Create a simple number guessing game where the computer generates a random number between 1 and 100, and the user tries to guess it!");
        System.out.println("5. Write a code to swap the case of each character from string!");

        // Input for selecting exercise number
        System.out.println("Enter the number of the exercise you want to run: ");
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();

        switch (exerciseNumber) {
            case 1:
                System.out.println("\n" + "1. Create a program that prints a multiplication table up to n x n!");

                // Input Table Size
                System.out.println("Enter the multiplication size: ");
                int n = scanner.nextInt();

                MultiplicationTable multiplicationTable = new MultiplicationTable(n);

                // Generate Table
                multiplicationTable.generateTable();

                break;

            case 2:
                System.out.println("\n" + "2. Write a program to print the following pattern for n rows!");

                // Input Stair Levels
                System.out.println("Enter stair level: ");
                int level = scanner.nextInt();

                StairsPattern stairsPattern = new StairsPattern(level);

                // Generate Pattern
                stairsPattern.generateStairs();

                break;

            case 3:
                System.out.println("\n" + "3. Write a code that reads n number of input from scanner!");

                // Generate Code
                ContinueStop continueStop = new ContinueStop();
                System.out.println(continueStop.generator());

                break;

            case 4:
                System.out.println("\n" + "4. Create a simple number guessing game where the computer generates a random number between 1 and 100, and the user tries to guess it!");

                // Generate Game
                GuessingGame guessingGame = new GuessingGame();
                System.out.println(guessingGame.generateGuessGame());

                break;

            case 5:
                System.out.println("\n" + "5. Write a code to swap the case of each character from string!");

                // Input String
                System.out.print("Enter the string: ");
                String stringInput = scanner.nextLine();
                SwapCharacterCase swapCharacterCase = new SwapCharacterCase(stringInput);

                // Swapped Case
                System.out.println("Swapped Case String: " + swapCharacterCase.getSwap());

                break;
        }
    }
}
