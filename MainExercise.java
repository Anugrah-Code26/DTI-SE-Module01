import exercise.*;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a menu of exercise numbers
        System.out.println("Choose an exercise to run by its number (1-7):");
        System.out.println("1. Rotate Array!");
        System.out.println("2. Check Duplicate in Array!");
        System.out.println("3. Remove Duplicate in Array!");
        System.out.println("4. Remove Specific Value in Array!");
        System.out.println("5. Reverse String!");
        System.out.println("6. Find Duplicate Value in Array!");
        System.out.println("7. Range to Warmer Day!");

        // Input for selecting exercise number
        System.out.print("Enter the number of the exercise you want to run: ");
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        // Input Array
        int[] duplicateArray = {1,2,2,3,3,3,4,5,6,6};
        int[] noDuplicateArray = {1,2,3,4,5,6,7,8,9,10};
        int[] temperature = {73,74,75,71,69,72,76,73};

        switch (exerciseNumber) {
            case 1:
                System.out.println("1. Rotate Array!");

                ArrayRotation arrayRotation = new ArrayRotation(noDuplicateArray);
                arrayRotation.rotate();

                break;

            case 2:
                System.out.println("2. Check Duplicate in Array!");

                CheckDuplicate checkDuplicate = new CheckDuplicate(noDuplicateArray);
                checkDuplicate.check();

                break;

            case 3:
                System.out.println("3. Remove Duplicate in Array!");

                RemoveDuplicate removeDuplicate = new RemoveDuplicate(duplicateArray);
                removeDuplicate.remove();

                break;

            case 4:
                System.out.println("4. Remove Specific Value in Array!");

                RemoveSpecific removeSpecific = new RemoveSpecific(duplicateArray);
                removeSpecific.remove();

                break;

            case 5:
                System.out.println("5. Reverse String!");

                ReverseString.reverse();

                break;

            case 6:
                System.out.println("6. Find Duplicate Value in Array!");

                FindDuplicateValue findDuplicateValue = new FindDuplicateValue(duplicateArray);
                findDuplicateValue.find();

                break;

            case 7:
                System.out.println("7. Range to Warmer Day!");

                RangeToWarmerDay rangeToWarmerDay = new RangeToWarmerDay(temperature);
                rangeToWarmerDay.rangeDay();

                break;
        }
    }
}
