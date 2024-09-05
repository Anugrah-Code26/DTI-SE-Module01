import exercise.*;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a menu of exercise numbers
        System.out.println("Choose an exercise to run by its number (1-10):");
        System.out.println("1. Write a program to calculate the sum of digits in a given number!");
        System.out.println("2. Create a function to check if a number is prime!");
        System.out.println("3. Write a program to ﬁnd the largest element in an array!");
        System.out.println("4. Implement a simple calculator that can perform addition, subtraction, multiplication, and division!");
        System.out.println("5. Write a function to reverse a string without using built-in reverse functions!");
        System.out.println("6. Create a program to generate the Fibonacci sequence up to n terms!");
        System.out.println("7. Write a function to count the number of vowels in a string!");
        System.out.println("8. Implement a program to sort an array of integers using bubble!");
        System.out.println("9. Create a function to check if two strings are anagrams!");
        System.out.println("10. Write a program to ﬁnd the second-smallest element in an array!");

        // Input for selecting exercise number
        System.out.println("Enter the number of the exercise you want to run: ");
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();

        switch (exerciseNumber) {
            case 1:
                System.out.println("\n" + "01. Write a program to calculate the sum of digits in a given number!");

                // Input Number
                System.out.println("Input number: ");
                int numberInput = scanner.nextInt();
                SumDigits sumDigits = new SumDigits(numberInput);

                // Digits Sum
                System.out.println("Sum Digits: " + sumDigits.calculateSum());
                break;

            case 2:
                System.out.println("\n" + "02. Create a function to check if a number is prime!");

                // Input Number
                System.out.println("Input number: ");
                int checkNumInput = scanner.nextInt();
                PrimeNumber primeNumber = new PrimeNumber(checkNumInput);

                // Prime Number Confirmation
                System.out.println(primeNumber.checkPrimeNumber());
                break;

            case 3:
                System.out.println("\n" + "03. Write a program to ﬁnd the largest element in an array!");

                // Input Array
                int[] arrayNumber = {3, 7, 2, 8, 1};
                LargestNumber largestNumber = new LargestNumber(arrayNumber);

                // Largest Number
                System.out.println("Array Number: " + Arrays.toString(arrayNumber));
                System.out.println("Largest Number: " + largestNumber.findLargestNumber());
                break;

            case 4:
                System.out.println("\n" + "04. Implement a simple calculator that can perform addition, subtraction, multiplication, and division!");

                System.out.println("Calculation Methods: \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
                // Input the Operator
                System.out.println("Select the calculation method: ");
                int methodInput = scanner.nextInt();

                // Input First Number
                System.out.println("Input first number: ");
                double num1Input = scanner.nextDouble();

                // Input Second Number
                System.out.println("Input second number: ");
                double num2Input = scanner.nextDouble();
                scanner.nextLine();

                SimpleCalculator simpleCalculator = new SimpleCalculator(methodInput, num1Input, num2Input);

                // Calculate Result
                System.out.println("Result:");
                System.out.println(simpleCalculator.simpleCalculation());
                break;

            case 5:
                System.out.println("\n" + "05. Write a function to reverse a string without using built-in reverse functions!");

                // Input the String
                System.out.println("Input the string: ");
                String stringInput = scanner.nextLine();
                ReverseString reverseString = new ReverseString(stringInput);

                // Reversed Word
                System.out.println("Reversed Word: " + reverseString.reverse());
                break;

            case 6:
                System.out.println("\n" + "06. Create a program to generate the Fibonacci sequence up to n terms!");

                // Input Number of Sequence
                System.out.println("Input number of fibonacci sequence: ");
                int numInput = scanner.nextInt();
                scanner.nextLine();

                Fibonacci fibonacci = new Fibonacci(numInput);

                // Fibonacci Sequence
                System.out.println("Fibonacci with " + numInput + " sequence: " + Arrays.toString(fibonacci.fibonacciSequence()));
                break;

            case 7:
                System.out.println("\n" + "07. Write a function to count the number of vowels in a string!");

                // Input the String
                System.out.println("Input the string: ");
                String wordInput = scanner.nextLine();
                Vowels vowels = new Vowels(wordInput);

                // Count Vowels
                System.out.println("Vowels Count: " + vowels.countVowels());
                break;

            case 8:
                System.out.println("\n" + "08. Implement a program to sort an array of integers using bubble!");

                // Input Array
                int[] unsortedArray = {3, 7, 2, 8, 1};
                BubbleSortASC bubbleSortASC = new BubbleSortASC(unsortedArray);

                // Sorted Array
                System.out.println("Sorted Array: " + Arrays.toString(bubbleSortASC.sortArray()));

            case 9:
                System.out.println("\n" + "09. Create a function to check if two strings are anagrams!");

                // Input the first word
                System.out.println("Input first word: ");
                String word1Input = scanner.nextLine();

                // Input the second word
                System.out.println("Input second word: ");
                String word2Input = scanner.nextLine();

                Anagrams anagrams = new Anagrams(word1Input, word2Input);

                // Anagrams Confirmation
                System.out.println("Is Anagrams? " + anagrams.isAnagrams());

            case 10:
                System.out.println("\n" + "10. Write a program to ﬁnd the second-smallest element in an array!");

                // Input Array
                int[] arrayNum = {3, 7, 2, 8, 1};
                SecondSmallest secondSmallest = new SecondSmallest(arrayNum);

                // Second Smallest Value
                System.out.println("Second Smallest Value: " + Arrays.toString(secondSmallest.sortArray()));
        }
    }
}
