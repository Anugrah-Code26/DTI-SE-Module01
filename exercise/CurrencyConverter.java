package exercise;

import java.util.Scanner;

public class CurrencyConverter {
    Scanner scanner = new Scanner(System.in);

    private static final double[][] conversionFactors = {
            // Conversion factors for each currency to other currencies
            {1, 0.90, 0.76, 143, 15468},            // USD
            {1.1, 1, 0.84, 158.38, 17171.86},       // EUR
            {1.31, 1.19, 1, 187.79, 20319.52},      // GBP
            {0.007, 0.006, 0.005, 1, 108.18},       // JPY
            {0.00007, 0.00006, 0.00005, 0.009, 1}   // IDR
    };

    public double convert(double amount, int initialCurrencyInput, int convertedCurrencyInput) {
        int initialCurrency = initialCurrencyInput - 1;
        int convertedCurrency = convertedCurrencyInput - 1;

        if (initialCurrency < 0 || convertedCurrency < 0) {
            throw new IllegalArgumentException("Invalid currency!");
        }
        return amount * conversionFactors[initialCurrency][convertedCurrency];
    }

    public void run(double amountInput, int initialCurrencyInput, int convertedCurrencyInput) {
        System.out.println("Input amount:");
        amountInput = scanner.nextInt();

        System.out.println("Choose initial currency:");
        System.out.println("1. USD\n 2. EUR\n 3. GBP\n 4. JPY\n 5. IDR ");
        System.out.println("Initial Currency: ");
        initialCurrencyInput = scanner.nextInt();

        System.out.println("Choose converted currency:");
        System.out.println("1. USD\n 2. EUR\n 3. GBP\n 4. JPY\n 5. IDR ");
        System.out.println("Converted Currency: ");
        convertedCurrencyInput = scanner.nextInt();



    }
}
