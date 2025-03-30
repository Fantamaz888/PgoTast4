class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats;
    private int availableSeats;
    private double price;

    public Event(String name, double price) {
        this(name, "", "", 100, 0, price);
    }

    public Event(String name, double price, String date) {
        this(name, date, "", 100, 0, price);
    }

    public Event(String name, double price, String date, String location) {
        this(name, date, location, 100, 0, price);
    }

    public Event(String name, String date, String location, int maxNumberOfSeats, int availableSeats, double price) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.maxNumberOfSeats = maxNumberOfSeats;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getAvailableSeats() { return availableSeats; }
    public int getMaxNumberOfSeats() { return maxNumberOfSeats; }

    public boolean reserveSeat() {
        if (availableSeats < maxNumberOfSeats) {
            availableSeats++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Location: " + location + ", Price: " + price;
    }
}