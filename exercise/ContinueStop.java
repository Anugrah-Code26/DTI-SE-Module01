package exercise;

import java.util.Objects;
import java.util.Scanner;

public class ContinueStop {
    Scanner scanner = new Scanner(System.in);

    public String generator () {
        int num = 1;
        String initial = "1";
        String result = "1";
        int stopper = 1;

        while (stopper != 0) {
            System.out.println(initial + " (Press y to continue) or " + (num + 1) + " (Press x to stop)");
            String code = scanner.nextLine();

            if (Objects.equals(code, "x") || Objects.equals(code, "y")) {
                result = initial + "," + (num + 1);
                initial = result;
                if (Objects.equals(code, "y")) {
                    num++;
                } else {
                    stopper = 0;
                }
            } else {
                System.out.println("Key not recognized!");
            }
        }
        return result;
    }
}
