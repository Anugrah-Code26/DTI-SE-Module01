package exercise;

public class SwapCharacterCase {
    private String str;
    
    public SwapCharacterCase(String str) {
        this.str = str;
    }
    
    public String getSwap () {
        StringBuilder swappedString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                swappedString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                swappedString.append(Character.toUpperCase(ch));
            } else {
                swappedString.append(ch);
            }
        }
        return swappedString.toString();
    }
}
