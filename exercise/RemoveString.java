package exercise;

public class RemoveString {
    private String word;
    private String removedWord;

    public RemoveString (String word, String removedWord) {
        this.word = word;
        this.removedWord = removedWord;
    }

    public String getNewWord() {
        return word.replaceFirst(removedWord, "");
    }
}
