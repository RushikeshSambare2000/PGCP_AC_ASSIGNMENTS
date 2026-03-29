import java.util.Scanner;

/**
 * Question 10: Transport Ticket System
 * 
 * Manages transport ticket bookings with fare tracking and updates.
 * Features: Store bookings, calculate total fare, and update fares.
 * 
 * OOP Concepts Used:
 * - Encapsulation (private fields with controlled access)
 * - Constructor initialization
 * - Static method for total fare calculation across all bookings
 * - Method for updating fare with validation
 */

class Ticket {
    private int ticketId;
    private String passengerName;
    private String source;
    private String destination;
    private double fare;

    private static int totalBookings = 0;

    public Ticket(int ticketId, String passengerName, String source, String destination, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        totalBookings++;
    }

    public double getFare() { return fare; }

    /**
     * Updates the fare for this ticket.
     * Includes validation to ensure the new fare is positive.
     * Prints old and new fare for transparency/audit purposes.
     */
    public void updateFare(double newFare) {
        if (newFare > 0) {
            System.out.printf("Ticket %d: Fare updated from Rs.%.2f to Rs.%.2f%n",
                    ticketId, fare, newFare);
            this.fare = newFare;
        } else {
            System.out.println("Invalid fare amount!");
        }
    }

    /**
     * STATIC METHOD: Computes total fare across an array of Ticket objects.
     * Static because it operates on a collection, not a single ticket instance.
     * Iterates through all tickets and sums up their individual fares.
     */
    public static double calculateTotalFare(Ticket[] tickets) {
        double total = 0;
        for (Ticket t : tickets) {
            total += t.fare;
        }
        return total;
    }

    public static int getTotalBookings() {
        return totalBookings;
    }

    public void displayDetails() {
        System.out.println("Ticket ID: " + ticketId
                + " | Passenger: " + passengerName
                + " | " + source + " -> " + destination
                + " | Fare: Rs." + String.format("%.2f", fare));
    }
}

public class TransportTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        sc.nextLine();

        Ticket[] tickets = new Ticket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Booking " + (i + 1) + " ---");
            System.out.print("Ticket ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Passenger Name: ");
            String name = sc.nextLine();
            System.out.print("Source: ");
            String src = sc.nextLine();
            System.out.print("Destination: ");
            String dest = sc.nextLine();
            System.out.print("Fare: ");
            double fare = sc.nextDouble();
            sc.nextLine();

            tickets[i] = new Ticket(id, name, src, dest, fare);
        }

        // Display all bookings
        System.out.println("\n========== ALL BOOKINGS ==========");
        for (Ticket t : tickets) {
            t.displayDetails();
        }

        // Calculate and display total fare using static method
        System.out.printf("\nTotal Fare (all bookings): Rs.%.2f%n",
                Ticket.calculateTotalFare(tickets));

        // Demonstrate fare update
        if (n > 0) {
            System.out.println("\n--- Updating fare for Ticket 1 ---");
            tickets[0].updateFare(1500.00);
            System.out.printf("Updated Total Fare: Rs.%.2f%n",
                    Ticket.calculateTotalFare(tickets));
        }

        System.out.println("\nTotal Bookings: " + Ticket.getTotalBookings());
        sc.close();
    }
}
