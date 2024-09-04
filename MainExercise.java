import exercise.*;
import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

    // 01. Write a program that takes a temperature in Fahrenheit as input and converts it to Celsius!
        System.out.println("\n" + "01. Write a program that takes a temperature in Fahrenheit as input and converts it to Celsius!");
        
        // Input Fahrenheit
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();
        scanner.nextLine();
        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius(fahrenheitInput);

        // Convert to Celsius
        System.out.println("Temperature in Celsius: " + fahrenheitToCelsius.getCelsius() + " degree");

    // 02. Write a code to convert centimeter to kilometer.!
        System.out.println("\n" + "02. Write a code to convert centimeter to kilometer.!");

        // Input Centimeter
        System.out.println("Enter length in Centimeter: ");
        double centimeterInput = scanner.nextDouble();
        scanner.nextLine();
        CmToKm cmToKm = new CmToKm(centimeterInput);

        // Convert to Kilometer
        System.out.println("Length in Kilometer: " + cmToKm.getKilometer() + "km");

    // 03. Write a function that takes an integer n as input and returns true if n is odd and false if n is even!
        System.out.println("\n" + "03. Write a function that takes an integer n as input and returns true if n is odd and false if n is even!");

        // Input Number
        System.out.println("Enter the number: ");
        int numberInput = scanner.nextInt();
        scanner.nextLine();
        EvenOdd evenOdd = new EvenOdd(numberInput);

        // Check Even Odd Number
        System.out.println(evenOdd.getEven() + " (The number is " + evenOdd.getEvenOdd() + ")");

    // 04. Write a code to remove the ﬁrst occurrence of a given “search string” from a string!
        System.out.println("\n" + "04. Write a code to remove the ﬁrst occurrence of a given “search string” from a string!");

        // Input Word
        System.out.print("Enter the word: ");
        String wordInput = scanner.nextLine();

        // Input Removed
        System.out.print("Enter the removed word: ");
        String removedWordInput = scanner.nextLine();

        // Show New Word
        RemoveString removeString = new RemoveString(wordInput, removedWordInput);
        System.out.print("The new word: " + removeString.getNewWord() + "\n");

    // 05. Write a code to check whether a string is a palindrome or not!
        System.out.println("05. Write a code to check whether a string is a palindrome or not!");

        // Input Word
        System.out.print("Enter the word you want to check: ");
        String checkWordInput = scanner.nextLine();

        // Check Palindrome
        Palindrome palindrome = new Palindrome(checkWordInput);
        System.out.print(palindrome.palindromeConfirmation());
    }
}
