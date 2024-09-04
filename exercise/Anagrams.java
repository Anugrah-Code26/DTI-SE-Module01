package exercise;

public class Anagrams {
    private String word1;
    private String word2;

    public Anagrams (String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean isAnagrams () {
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        if (word1.length() != word2.length()) {
            return false;
        }

        char[] charWord1 = word1.toCharArray();
        char[] charWord2 = word2.toCharArray();

        bubbleSort(charWord1);
        bubbleSort(charWord2);

        for (int i = 0; i < charWord1.length; i++) {
            if (charWord1[i] != charWord2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void bubbleSort(char[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
