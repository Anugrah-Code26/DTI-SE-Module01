package exercise;

public class Magazine {
    private final MaterialDetails details;
    private final String issue;

    public Magazine(String title, String issue, int availableCount) {
        this.details = new MaterialDetails(title, availableCount);
        this.issue = issue;
    }

    public void borrow() {
        details.borrowMaterial();
    }

    public void returnMaterial() {
        details.returnMaterial();
    }

    public void displayStatus() {
        details.displayStatus();
        System.out.println("Issue: " + issue);
    }

    public String getTitle() {
        return details.getTitle();
    }
}
