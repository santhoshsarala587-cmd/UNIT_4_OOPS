import java.util.*;

class Show {
    int showId;
    String movieName;
    int totalSeats;
    ArrayList<Integer> bookedSeats = new ArrayList<>();

    Show(int showId, String movieName, int totalSeats) {
        this.showId = showId;
        this.movieName = movieName;
        this.totalSeats = totalSeats;
    }

    void displayShow() {
        int available = totalSeats - bookedSeats.size();
        System.out.println("Show ID: " + showId +
                " | Movie: " + movieName +
                " | Available Seats: " + available + "/" + totalSeats);
    }
}

class Customer {
    String name;
    int seatNumber;

    Customer(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }
}

class Ticket<T> {
    private ArrayList<T> tickets = new ArrayList<>();

    void addTicket(T ticket) {
        tickets.add(ticket);
    }

    void showTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
            return;
        }
        int i = 1;
        for (T t : tickets) {
            System.out.println(i++ + ". " + t);
        }
    }

    int count() {
        return tickets.size();
    }
}

class SeatBookedException extends Exception {
    SeatBookedException(String msg) {
        super(msg);
    }
}