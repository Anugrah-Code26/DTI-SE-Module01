import exercise.*;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a menu of exercise numbers
        System.out.println("Choose an exercise to run by its number (1 or 2):");
        System.out.println("1. Calculate Average in Array!");
        System.out.println("2. File Report Summary!");

        // Input for selecting exercise number
        System.out.print("Enter the number of the exercise you want to run: ");
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        switch (exerciseNumber) {
            case 1:
                System.out.println("1. Calculate Average in Array!");
                ArrayAVG.calcAVG();
                break;

            case 2:
                System.out.println("2. File Report Summary!");
                FileSummary.summary();
                break;
        }
    }
}
