import exercise.*;

import java.util.Arrays;
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
        System.out.println("4. Sort Direction!");
        System.out.println("5. Remove Specific Value in Array!");
        System.out.println("6. Reverse String!");
        System.out.println("7. Find Duplicate Value in Array!");
        System.out.println("8. Range to Warmer Day!");

        // Input for selecting exercise number
        System.out.print("Enter the number of the exercise you want to run: ");
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        // Input Array
        int[] nullArray = {};
        int[] duplicateArray = {1,2,2,3,3,3,4,5,6,6};
        int[] noDuplicateArray = {1,2,3,4,5,6,7,8,9,10};
        int[] unSortedArray = {8,5,7,2};
        int[] temperature = {73,74,75,71,69,72,76,73};

        switch (exerciseNumber) {
            case 1:
                System.out.println("1. Rotate Array!");

                int[] arrayInput1 = noDuplicateArray;

                if (arrayInput1.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    ArrayRotation arrayRotation = new ArrayRotation(arrayInput1);
                    arrayRotation.rotate();
                }
                break;

            case 2:
                System.out.println("2. Check Duplicate in Array!");

                int[] arrayInput2 = noDuplicateArray;

                if (arrayInput2.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    CheckDuplicate checkDuplicate = new CheckDuplicate(arrayInput2);
                    checkDuplicate.check();
                }
                break;

            case 3:
                System.out.println("3. Remove Duplicate in Array!");

                int[] arrayInput3 = duplicateArray;

                if (arrayInput3.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    RemoveDuplicate removeDuplicate = new RemoveDuplicate(arrayInput3);
                    removeDuplicate.remove();
                }
                break;

            case 4:
                System.out.println("4. Sort Direction!");

                int[] arrayInput4 = unSortedArray;

                if (arrayInput4.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    SortOrder sortOrder = new SortOrder(arrayInput4);
                    sortOrder.runSort();
                }
                break;

            case 5:
                System.out.println("5. Remove Specific Value in Array!");

                int[] arrayInput5 = nullArray;

                if (arrayInput5.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    RemoveSpecific removeSpecific = new RemoveSpecific(arrayInput5);
                    removeSpecific.remove();
                }
                break;

            case 6:
                System.out.println("6. Reverse String!");
                ReverseString.reverse();
                break;

            case 7:
                System.out.println("7. Find Duplicate Value in Array!");

                int[] arrayInput7 = duplicateArray;

                if (arrayInput7.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    FindDuplicateValue findDuplicateValue = new FindDuplicateValue(arrayInput7);
                    findDuplicateValue.find();
                }
                break;

            case 8:
                System.out.println("8. Range to Warmer Day!");

                int[] arrayInput8 = temperature;

                if (arrayInput8.length == 0) {
                    System.out.println("Array is empty!");
                } else {
                    RangeToWarmerDay rangeToWarmerDay = new RangeToWarmerDay(arrayInput8);
                    rangeToWarmerDay.rangeDay();
                }
                break;
        }
    }
}