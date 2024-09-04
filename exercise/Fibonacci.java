package exercise;

public class Fibonacci {
    private final int nSequence;

    public  Fibonacci (int nSequence) {
        this.nSequence = nSequence;
    }

    public int[] fibonacciSequence () {
        int num1 = 0;
        int num2 = 1;

        int[] arrFibonacci = new int[nSequence];

        for (int i = 0; i < nSequence; i++) {
            if (i == 0) {
                arrFibonacci[i] = 0;
            } else if (i == 2) {
                arrFibonacci[i] = 1;
            } else {
                arrFibonacci[i] = num1 + num2;
                num1 = num2;
                num2 = arrFibonacci[i];
            }
        }
        return arrFibonacci;
    }
}
