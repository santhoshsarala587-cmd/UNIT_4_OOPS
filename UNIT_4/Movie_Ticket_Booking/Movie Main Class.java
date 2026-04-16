public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Integer, Show> shows = new HashMap<>();
        Ticket<String> ticketList = new Ticket<>();

        shows.put(1, new Show(1, "Avengers", 10));
        shows.put(2, new Show(2, "Leo", 10));
        shows.put(3, new Show(3, "Jailer", 10));
        shows.put(4, new Show(4, "RRR", 10));

        while (true) {
            System.out.println("\n1. View Shows");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    for (Show s : shows.values()) {
                        s.displayShow();
                    }
                    break;

                case 2:
                    bookTicket(shows, ticketList);
                    break;

                case 3:
                    ticketList.showTickets();
                    break;

                case 4:
                    return;
            }
        }
    }

    static void bookTicket(HashMap<Integer, Show> shows, Ticket<String> ticketList) {
        try {
            System.out.print("Enter Show ID: ");
            int showId = Integer.parseInt(sc.nextLine());

            if (!shows.containsKey(showId)) {
                System.out.println("Invalid Show ID");
                return;
            }

            Show s = shows.get(showId);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Seat Number: ");
            int seat = Integer.parseInt(sc.nextLine());

            if (s.bookedSeats.contains(seat)) {
                throw new SeatBookedException("Seat already booked!");
            }

            s.bookedSeats.add(seat);
            ticketList.addTicket(name + " | " + s.movieName + " | Seat " + seat);
            System.out.println("Ticket Booked!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}