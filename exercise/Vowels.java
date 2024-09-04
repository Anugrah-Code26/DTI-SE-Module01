package exercise;

public class Vowels {
    private final String word;

    public Vowels (String word) {
        this.word = word;
    }

    public int countVowels () {
        char[] vowels = {'a', 'i', 'u', 'e', 'o'};
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (word.toLowerCase().charAt(i) == vowels[j]) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
}
