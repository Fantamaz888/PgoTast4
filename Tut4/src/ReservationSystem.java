import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> events;
    private ArrayList<Customer> customers;

    public ReservationSystem() {
        events = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void makeReservation(Customer customer, Event event) {
        if (event.reserveSeat()) {
            customer.addReservation(event);
            System.out.println(customer.getFirstName() + " reserved a seat for " + event.getName());
        } else {
            System.out.println("No seats available for " + event.getName());
        }
    }

    public Event findEvent(String name) {
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public Customer findCustomer(String lastName) {
        for (Customer c : customers) {
            if (c.getLastName().equalsIgnoreCase(lastName)) {
                return c;
            }
        }
        return null;
    }

    public void changeEventPrice(String name, double newPrice) {
        Event event = findEvent(name);
        if (event != null) {
            event.setPrice(newPrice);
            System.out.println("Price of " + name + " changed to $" + newPrice);
        } else {
            System.out.println("Event not found.");
        }
    }
}