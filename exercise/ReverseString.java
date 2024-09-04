package exercise;

public class ReverseString {
    private final String word;

    public ReverseString (String word) {
        this.word = word;
    }

    public String reverse () {
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }

}
