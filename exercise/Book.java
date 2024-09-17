package exercise;

public class Book {
    private final MaterialDetails details;
    private final String author;

    public Book(String title, String author, int availableCount) {
        this.details = new MaterialDetails(title, availableCount);
        this.author = author;
    }

    public void borrow() {
        details.borrowMaterial();
    }

    public void returnMaterial() {
        details.returnMaterial();
    }

    public void displayStatus() {
        details.displayStatus();
        System.out.println("Author: " + author);
    }

    public String getTitle() {
        return details.getTitle();
    }
}
