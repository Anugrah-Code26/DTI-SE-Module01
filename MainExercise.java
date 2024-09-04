import exercise.*;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

    // 01. Write a program to calculate the sum of digits in a given number!
        System.out.println("\n" + "01. Write a program to calculate the sum of digits in a given number!");
        
        // Input Number
        System.out.println("Input number: ");
        int numberInput = scanner.nextInt();
        SumDigits sumDigits = new SumDigits(numberInput);

        // Digits Sum
        System.out.println("Sum Digits: " + sumDigits.calculateSum());

    // 02. Create a function to check if a number is prime!
        System.out.println("\n" + "02. Create a function to check if a number is prime!");

        // Input Number
        System.out.println("Input number: ");
        int checkNumInput = scanner.nextInt();
        PrimeNumber primeNumber = new PrimeNumber(checkNumInput);

        // Prime Number Confirmation
        System.out.println(primeNumber.checkPrimeNumber());

    // 03. Write a program to ﬁnd the largest element in an array!
        System.out.println("\n" + "03. Write a program to ﬁnd the largest element in an array!");

        // Input Array
        int[] arrayNumber = {3, 7, 2, 8, 1};
        LargestNumber largestNumber = new LargestNumber(arrayNumber);

        // Largest Number
        System.out.println("Array Number: " + Arrays.toString(arrayNumber));
        System.out.println("Largest Number: " + largestNumber.findLargestNumber());

    // 04. Implement a simple calculator that can perform addition, subtraction, multiplication, and division!
        System.out.println("\n" + "04. Implement a simple calculator that can perform addition, subtraction, multiplication, and division!");

        // Input First Number
        System.out.println("Input first number: ");
        double num1Input = scanner.nextDouble();
        scanner.nextLine();

        // Input the Operator
        System.out.println("Input the operator: ");
        String operatorInput = scanner.nextLine();

        // Input Second Number
        System.out.println("Input second number: ");
        double num2Input = scanner.nextDouble();
        scanner.nextLine();

        SimpleCalculator simpleCalculator = new SimpleCalculator(num1Input, num2Input, operatorInput);

        // Calculate Result
        System.out.println("Calculation:");
        System.out.println(num1Input + " " + operatorInput + " " + num2Input + " = " + simpleCalculator.simpleCalculation());

    // 05. Write a function to reverse a string without using built-in reverse functions!
        System.out.println("\n" + "05. Write a function to reverse a string without using built-in reverse functions!");

        // Input the String
        System.out.println("Input the string: ");
        String stringInput = scanner.nextLine();
        ReverseString reverseString = new ReverseString(stringInput);

        // Reversed Word
        System.out.println("Reversed Word: " + reverseString.reverse());

    // 06. Create a program to generate the Fibonacci sequence up to n terms!
        System.out.println("\n" + "06. Create a program to generate the Fibonacci sequence up to n terms!");

        // Input Number of Sequence
        System.out.println("Input number of fibonacci sequence: ");
        int numInput = scanner.nextInt();
        scanner.nextLine();

        Fibonacci fibonacci = new Fibonacci(numInput);

        // Fibonacci Sequence
        System.out.println("Fibonacci with " + numInput + " sequence: " + Arrays.toString(fibonacci.fibonacciSequence()));

    // 07. Write a function to count the number of vowels in a string!
        System.out.println("\n" + "07. Write a function to count the number of vowels in a string!");

        // Input the String
        System.out.println("Input the string: ");
        String wordInput = scanner.nextLine();
        Vowels vowels = new Vowels(wordInput);

        // Count Vowels
        System.out.println("Vowels Count: " + vowels.countVowels());

    // 08. Implement a program to sort an array of integers using bubble!
        System.out.println("\n" + "08. Implement a program to sort an array of integers using bubble!");

        // Input Array
        int[] unsortedArray = {3, 7, 2, 8, 1};
        BubbleSortASC bubbleSortASC = new BubbleSortASC(unsortedArray);

        // Sorted Array
        System.out.println("Sorted Array: " + Arrays.toString(bubbleSortASC.sortArray()));

    // 09. Create a function to check if two strings are anagrams!
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

    // 10. Write a program to ﬁnd the second-smallest element in an array!
        System.out.println("\n" + "10. Write a program to ﬁnd the second-smallest element in an array!");

        // Input Array
        int[] arrayNum = {3, 7, 2, 8, 1};
        SecondSmallest secondSmallest = new SecondSmallest(arrayNum);

        // Second Smallest Value
        System.out.println("Second Smallest Value: " + Arrays.toString(secondSmallest.sortArray()));
    }
}
