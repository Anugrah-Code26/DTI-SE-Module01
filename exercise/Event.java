package exercise;

import java.util.ArrayList;

interface EventInterface{
    void createEvent(int eventId, String eventName, int ticketQuantity);
    void displayEventFormat();
}

public class Event implements EventInterface {
    private int eventId;
    String eventName;
    private int ticketQuantity;

    @Override
    public void createEvent(int eventId, String eventName, int ticketQuantity) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.ticketQuantity = ticketQuantity;
    }

    @Override
    public void displayEventFormat() {
        System.out.println(eventId + ". " + eventName);
    }

    public int getEventId() {
        return eventId;
    }

    public static ArrayList<Event> eventList() {
        ArrayList<Event> list = new ArrayList<>();

        Event event1 = new Event();
        Event event2 = new Event();
        Event event3 = new Event();
        Event event4 = new Event();

        event1.createEvent(1, "Football Match (A vs B)", 5);
        event2.createEvent(2, "Basketball Match (A vs B)", 4);
        event3.createEvent(3, "Badminton Match (A vs B)", 3);
        event4.createEvent(4, "Volley Match (A vs B)", 2);

        list.add(event1);
        list.add(event2);
        list.add(event3);
        list.add(event4);

        return list;
    }

    public static void displayEvent() {
        System.out.println("Event List: ");
        for (Event event : eventList()) {
            event.displayEventFormat();
        }
    }

    public static int ticketAvailability(int eventInput) {
        int ticketQuantityEvent = eventList().get(eventInput).ticketQuantity;
        int ticketBooked = 0;
        for (Ticket ticket : Ticket.ticketList()) {
            if (ticket.getEventId() == eventInput) {
                ticketBooked++;
            }
        }
        return ticketQuantityEvent - ticketBooked;
    }
}
