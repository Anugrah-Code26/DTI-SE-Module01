package exercise;

import java.util.ArrayList;

public class BookingSystem {
    private ArrayList<Ticket> tickets;

    public BookingSystem() {
        tickets = Ticket.ticketList();
    }

    public void createTicket(int eventId, String eventName, int price) {
        Ticket ticket = new Ticket(eventId, eventName, price);
        tickets.add(ticket);
        System.out.println("Ticket Created for Event: " + eventName + " (ID: " + ticket.getTicketId() + ")");
    }

    public void bookTicket(int eventId, User user) {
        if (Event.ticketAvailability(eventId) > 0) {
            String eventName = Event.eventList().get(eventId - 1).eventName;
            createTicket(eventId, eventName, 15000); // Assuming price is $50
            System.out.println("Ticket successfully booked for " + user.getName());
        } else {
            System.out.println("Ticket is unavailable or sold out.");
        }
    }
}
