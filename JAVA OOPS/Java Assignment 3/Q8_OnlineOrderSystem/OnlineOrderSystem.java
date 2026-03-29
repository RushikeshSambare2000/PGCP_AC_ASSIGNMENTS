import java.util.Scanner;

/**
 * Question 8: Online Order System
 * 
 * Manages online orders with multiple items, prices, and GST calculation.
 * Demonstrates arrays for storing multiple items and constructor initialization.
 * 
 * OOP Concepts Used:
 * - Parallel arrays (items[] and prices[] are aligned by index)
 * - Constructor for object initialization
 * - Encapsulation with computed properties (total bill, GST)
 * - Formatted output for bill display
 */

class Order {
    private int orderId;
    private String customerName;
    private String[] items;      // Array to store item names
    private double[] prices;     // Parallel array to store item prices

    /**
     * PARALLEL ARRAYS: items[i] and prices[i] correspond to each other.
     * items[0] = "Laptop" with prices[0] = 50000.0
     * This is a simple approach; a more advanced design would use an Item class.
     */
    public Order(int orderId, String customerName, String[] items, double[] prices) {
        this.orderId = orderId;
        this.customerName = customerName;
        // Create copies of arrays to prevent external modification (defensive copying)
        this.items = new String[items.length];
        this.prices = new double[prices.length];
        for (int i = 0; i < items.length; i++) {
            this.items[i] = items[i];
            this.prices[i] = prices[i];
        }
    }

    /**
     * Calculates the subtotal by summing all item prices.
     * Uses a for-each loop for clean array iteration.
     */
    public double calculateSubtotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    /**
     * Calculates GST amount.
     * GST (Goods and Services Tax) is applied as a percentage on the subtotal.
     * Common GST rates in India: 5%, 12%, 18%, 28%.
     * Using 18% as default for this system.
     */
    public double calculateGST() {
        return calculateSubtotal() * 18.0 / 100;  // 18% GST
    }

    /**
     * Total bill = subtotal + GST.
     * This is a computed property - its value is derived from other data,
     * not stored separately. This ensures it's always consistent.
     */
    public double calculateTotalBill() {
        return calculateSubtotal() + calculateGST();
    }

    public void displayBill() {
        System.out.println("============= ORDER BILL =============");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("---------------------------------------");
        System.out.printf("%-20s %10s%n", "Item", "Price (Rs.)");
        System.out.println("---------------------------------------");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-20s %10.2f%n", items[i], prices[i]);
        }
        System.out.println("---------------------------------------");
        System.out.printf("%-20s %10.2f%n", "Subtotal:", calculateSubtotal());
        System.out.printf("%-20s %10.2f%n", "GST (18%):", calculateGST());
        System.out.println("=======================================");
        System.out.printf("%-20s %10.2f%n", "TOTAL BILL:", calculateTotalBill());
        System.out.println("=======================================\n");
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Order " + (i + 1) + " ---");
            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Number of items: ");
            int itemCount = sc.nextInt();
            sc.nextLine();

            String[] items = new String[itemCount];
            double[] prices = new double[itemCount];

            for (int j = 0; j < itemCount; j++) {
                System.out.print("Item " + (j + 1) + " name: ");
                items[j] = sc.nextLine();
                System.out.print("Item " + (j + 1) + " price: ");
                prices[j] = sc.nextDouble();
                sc.nextLine();
            }

            orders[i] = new Order(id, name, items, prices);
        }

        // Display all order bills
        System.out.println("\n========== ALL ORDER BILLS ==========");
        for (Order order : orders) {
            order.displayBill();
        }

        sc.close();
    }
}
