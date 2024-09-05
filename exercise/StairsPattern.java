package exercise;

public class StairsPattern {
    private final int level;

    public StairsPattern (int level) {
        this.level = level;
    }

    public void generateStairs () {
        for (int i = 0; i < level; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
