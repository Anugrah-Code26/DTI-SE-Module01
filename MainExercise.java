import exercise.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExercise {
    private static final List<Book> books = new ArrayList<>();
    private static final List<Magazine> magazines = new ArrayList<>();
    private static final List<DVD> dvds = new ArrayList<>();

    public static void main(String[] args) {
        // Initial sample materials
        books.add(new Book("Java Programming", "Anugrah Java", 5));
        magazines.add(new Magazine("Java Today", "June 2024", 2));
        dvds.add(new DVD("Doraemon", "Yazid Ghani", 3));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. View All Materials");
            System.out.println("2. Borrow a Material");
            System.out.println("3. Return a Material");
            System.out.println("4. Add a New Material");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewAllMaterials();
                    break;
                case 2:
                    borrowMaterial(scanner);
                    break;
                case 3:
                    returnMaterial(scanner);
                    break;
                case 4:
                    addNewMaterial(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the library system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Display all available materials
    private static void viewAllMaterials() {
        System.out.println("\n--- Books ---");
        for (Book book : books) {
            book.displayStatus();
        }

        System.out.println("\n--- Magazines ---");
        for (Magazine magazine : magazines) {
            magazine.displayStatus();
        }

        System.out.println("\n--- DVDs ---");
        for (DVD dvd : dvds) {
            dvd.displayStatus();
        }
    }

    // Borrow a material
    private static void borrowMaterial(Scanner scanner) {
        System.out.println("Type of material: ");
        System.out.println(" 1. Book\n 2. Magazine\n 3. DVD");
        System.out.print("Choose an option: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();

        if (type == 1) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.borrow();
                    return;
                }
            }
        } else if (type == 2) {
            for (Magazine magazine : magazines) {
                if (magazine.getTitle().equalsIgnoreCase(title)) {
                    magazine.borrow();
                    return;
                }
            }
        } else if (type == 3) {
            for (DVD dvd : dvds) {
                if (dvd.getTitle().equalsIgnoreCase(title)) {
                    dvd.borrow();
                    return;
                }
            }
        }
        System.out.println("Material not found.");
    }

    // Return a material
    private static void returnMaterial(Scanner scanner) {
        System.out.println("Type of material: ");
        System.out.println(" 1. Book\n 2. Magazine\n 3. DVD");
        System.out.print("Choose an option: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();

        if (type == 1) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    book.returnMaterial();
                    return;
                }
            }
        } else if (type == 2) {
            for (Magazine magazine : magazines) {
                if (magazine.getTitle().equalsIgnoreCase(title)) {
                    magazine.returnMaterial();
                    return;
                }
            }
        } else if (type == 3) {
            for (DVD dvd : dvds) {
                if (dvd.getTitle().equalsIgnoreCase(title)) {
                    dvd.returnMaterial();
                    return;
                }
            }
        }
        System.out.println("Material not found.");
    }

    // Add a new material
    private static void addNewMaterial(Scanner scanner) {
        System.out.println("Type of material: ");
        System.out.println(" 1. Book\n 2. Magazine\n 3. DVD");
        System.out.print("Choose an option: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        System.out.println("Enter the available count: ");
        int availableCount = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (type == 1) {
            System.out.println("Enter the author: ");
            String author = scanner.nextLine();
            books.add(new Book(title, author, availableCount));
        } else if (type == 2) {
            System.out.println("Enter the issue: ");
            String issue = scanner.nextLine();
            magazines.add(new Magazine(title, issue, availableCount));
        } else if (type == 3) {
            System.out.println("Enter the director: ");
            String director = scanner.nextLine();
            dvds.add(new DVD(title, director, availableCount));
        } else {
            System.out.println("Invalid material type.");
        }
        System.out.println("New material added successfully!");
    }
}