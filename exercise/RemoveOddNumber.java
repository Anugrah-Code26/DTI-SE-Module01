package exercise;

import java.util.*;

public class RemoveOddNumber {
    static List<Integer> arrNum = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static int[] createArrNum () {
        System.out.print("Insert number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        arrNum.add(num);

        System.out.println("(Press y to continue!) or (Press x to finish!)");
        String code = scanner.nextLine();

        if (Objects.equals(code, "y")) {
            return createArrNum();
        } else {
            return arrNum.stream().mapToInt(i -> i).toArray();
        }

    }

    public static int[] arrEvenNumber () {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i : arrNum) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        return evenNumbers.stream().mapToInt(i -> i).toArray();
    }

    public static void run () {
        int[] numbers = createArrNum();
        int[] result = arrEvenNumber();
        System.out.println("Array Numbers: " + Arrays.toString(numbers));
        System.out.println("Even Numbers: " + Arrays.toString(result));
    }
}
