package exercise;

public class MaterialDetails {
    private final String title;
    private int availableCount;
    private int borrowedCount;

    public MaterialDetails(String title, int availableCount) {
        this.title = title;
        this.availableCount = availableCount;
        this.borrowedCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return availableCount > 0;
    }

    public void borrowMaterial() {
        if (isAvailable()) {
            availableCount--;
            borrowedCount++;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println(title + " is not available for borrowing.");
        }
    }

    public void returnMaterial() {
        if (borrowedCount > 0) {
            availableCount++;
            borrowedCount--;
            System.out.println("Returned: " + title);
        } else {
            System.out.println("No borrowed copies of " + title + " to return.");
        }
    }

    public void displayStatus() {
        System.out.println(title + " - Available: " + availableCount + ", Borrowed: " + borrowedCount);
    }
}
