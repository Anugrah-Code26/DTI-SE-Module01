package exercise;

import java.util.*;

public class ArrayAVG {
    static Scanner scanner = new Scanner(System.in);

    static List<Integer> arrayNumber = new ArrayList<>();
    static List<String> arrayHistory = new ArrayList<>();

    public static List<Integer> createArrNum () {
        System.out.println("- Create the array first!");

        while (true) {
            System.out.print("Insert integer value or 'q' to finish: ");
            String inputValue = scanner.nextLine();
            arrayHistory.add(inputValue);

            try {
                int num = Integer.parseInt(inputValue);
                arrayNumber.add(num);
            } catch (NumberFormatException e) {
                if (Objects.equals(inputValue.toLowerCase(), "q")) {
                    if (arrayNumber.isEmpty()) {
                        System.out.println("\nThe Array still do not have any integer value!");
                        System.out.println("Please input the integer value first!");
                    } else {
                        System.out.println("\nInput History: " + arrayHistory);
                        System.out.println("Array Number: " + arrayNumber);
                        return arrayNumber;
                    }
                } else {
                    System.out.println("\nInvalid input! Please enter a valid number or 'q' to finish!");
                }
            }
        }
    }

    public static void calcAVG() {
        List<Integer> array = createArrNum();
        int sum = 0;

        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Average Value: " + (double) sum / array.size());
    }
}
