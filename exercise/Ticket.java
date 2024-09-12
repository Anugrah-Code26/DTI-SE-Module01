package exercise;

import java.util.ArrayList;
import java.util.UUID;

interface TicketInterface {
    void displayTicketFormat();
}

public class Ticket implements TicketInterface {
    private String ticketId;
    private int eventId;
    private String eventName;
    private int ticketPrice;
    private boolean isAvailable;

    public Ticket(int eventId, String eventName, int ticketPrice) {
        this.ticketId = UUID.randomUUID().toString();
        this.eventId = eventId;
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;
        this.isAvailable = true;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public void displayTicketFormat() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Booked"));
    }

    public static ArrayList<Ticket> ticketList() {
        return new ArrayList<>();
    }
}