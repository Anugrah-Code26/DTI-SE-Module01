package exercise;

public class Palindrome {
    private String word;

    public Palindrome (String word) {
        this.word = word;
    }

    public boolean isPalindrome () {
        word = word.toLowerCase().replaceAll("\\s+", "");
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String palindromeConfirmation () {
        return isPalindrome() ? "Palindrome" : "Not Palindrome";
    }
}
