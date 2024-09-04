package exercise;

public class InitialName {
    String fullName;

    public InitialName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullname() {
        return fullName;
    }

    public String getInitials() {
        StringBuilder initials = new StringBuilder();
        String[] nameParts = fullName.split(" ");
    
        for(String part:nameParts) {
            initials.append(Character.toUpperCase(part.charAt(0)));
        }
        return initials.toString();
    }
}
