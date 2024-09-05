package exercise;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Scanner scanner = new Scanner(System.in);

    private int guessNumber, userNumber, attemptNumber;

    public int generateGuessGame () {
        Random random = new Random();
        guessNumber = random.nextInt(100) + 1;
        int stopper = 1;

        while (stopper != 0) {
            System.out.print("Enter the number: ");
            userNumber = scanner.nextInt();

            if (userNumber < guessNumber) {
                System.out.println("TOO LOW!");
                attemptNumber++;
            } else if (userNumber > guessNumber) {
                System.out.println("TOO HIGH!");
                attemptNumber++;
            } else if (userNumber == guessNumber) {
                System.out.println("CONGRATULATION! YOU GUESS THE RIGHT NUMBER!");
                attemptNumber++;
                stopper = 0;
            } else {
                System.out.println("Please enter number in range 1-100!");
            }
        }
        System.out.print("Attempted number: ");
        return attemptNumber;
    }
}
