package exercise;

public class MultiplicationTable {
    private final int nMultiplication;

    public MultiplicationTable (int nMultiplication) {
        this.nMultiplication = nMultiplication;
    }

    public void generateTable () {
        int highestMultiplication = (int) Math.pow(nMultiplication, 2);
        int spacingLength = Integer.toString(highestMultiplication).length();
        String formatting = "%" + (spacingLength + 1) + "d";

        for (int i = 0; i <= nMultiplication; i++) {
            for (int j = 0; j <= nMultiplication; j++) {
                if (i == 0) {
                    System.out.printf(formatting, j);
                } else if (j == 0) {
                    System.out.printf(formatting, i);
                } else {
                    System.out.printf(formatting, i * j);
                }
            }
            System.out.println();
        }
    }
}
