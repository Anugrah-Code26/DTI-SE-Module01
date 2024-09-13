import exercise.*;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainExercise {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserManager userManager = new UserManager();

    public static void main(String[] args) {
        while (true) {
            if (userManager.getLoggedInUser() == null) {
                showLoginMenu();
            } else {
                showTaskMenu();
            }
        }
    }

    private static void showLoginMenu() {
        System.out.println("\n=== To-Do List App ===");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> exitApp();
                default -> System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();  // Consume the invalid input
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showTaskMenu() {
        System.out.println("\n=== Task Menu ===");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Logout");
        System.out.print("Choose an option: ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> deleteTask();
                case 4 -> userManager.logoutUser();
                default -> System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();  // Consume the invalid input
        }
    }

    private static void registerUser() {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            userManager.registerUser(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void loginUser() {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            userManager.loginUser(username, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        userManager.getLoggedInUser().addTask(task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks() {
        System.out.println("Your Tasks:");
        for (String task : userManager.getLoggedInUser().getTasks()) {
            System.out.println("- " + task);
        }
    }

    private static void deleteTask() {
        System.out.print("Enter task to delete: ");
        String task = scanner.nextLine();
        userManager.getLoggedInUser().deleteTask(task);
        System.out.println("Task deleted successfully.");
    }

    private static void exitApp() {
        System.out.println("Exiting application. Goodbye!");
        System.exit(0);
    }
}