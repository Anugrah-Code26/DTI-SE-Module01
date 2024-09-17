package exercise;

public class DVD {
    private final MaterialDetails details;
    private final String director;

    public DVD(String title, String director, int availableCount) {
        this.details = new MaterialDetails(title, availableCount);
        this.director = director;
    }

    public void borrow() {
        details.borrowMaterial();
    }

    public void returnMaterial() {
        details.returnMaterial();
    }

    public void displayStatus() {
        details.displayStatus();
        System.out.println("Director: " + director);
    }

    public String getTitle() {
        return details.getTitle();
    }
}
