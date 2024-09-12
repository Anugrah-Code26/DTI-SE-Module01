import exercise.*;

import java.util.Scanner;

public class MainExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();

        Event.displayEvent();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        User user = new User(name, email);

        System.out.print("Enter the Event ID to book a ticket: ");
        int eventId = scanner.nextInt();

        bookingSystem.bookTicket(eventId, user);
    }
}