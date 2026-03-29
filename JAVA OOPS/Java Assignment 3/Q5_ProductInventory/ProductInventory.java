import java.util.Scanner;

/**
 * Question 5: Product Inventory System
 * 
 * Tracks products with ID, name, price, and quantity.
 * Features: Store products, calculate total inventory value, update stock.
 * 
 * OOP Concepts Used:
 * - Constructors for initialization (default + parameterized)
 * - Method overloading for price update (discount percentage vs. direct price)
 * - Encapsulation with validation
 * - Static method for total inventory value calculation
 */

class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    /**
     * DEFAULT CONSTRUCTOR: Sets fields to default placeholder values.
     * Useful when you want to create an object first and set values later.
     */
    public Product() {
        this.productId = 0;
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    /**
     * PARAMETERIZED CONSTRUCTOR: Initializes all fields at the time of creation.
     * This is the preferred way when you have all data available upfront.
     */
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    /**
     * METHOD OVERLOADING - Version 1: Update price directly to a new value.
     * 
     * Method overloading means having multiple methods with the same name
     * but different parameter types or counts. The compiler picks the right
     * one based on the arguments you pass.
     */
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            System.out.println(name + ": Price updated from Rs." + price + " to Rs." + newPrice);
            this.price = newPrice;
        } else {
            System.out.println("Invalid price!");
        }
    }

    /**
     * METHOD OVERLOADING - Version 2: Update price by applying a discount percentage.
     * Same name 'updatePrice' but accepts (double, boolean) instead of just (double).
     * The boolean flag indicates this is a discount-based update.
     */
    public void updatePrice(double discountPercentage, boolean isDiscount) {
        if (isDiscount && discountPercentage > 0 && discountPercentage < 100) {
            double discountAmount = price * discountPercentage / 100;
            double newPrice = price - discountAmount;
            System.out.printf("%s: %.1f%% discount applied. Price: Rs.%.2f -> Rs.%.2f%n",
                    name, discountPercentage, price, newPrice);
            this.price = newPrice;
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    /**
     * Updates stock quantity. Positive values add stock, negative values remove.
     * Includes validation to prevent stock from going negative.
     */
    public void updateStock(int change) {
        if (quantity + change < 0) {
            System.out.println("Cannot reduce stock below 0! Current stock: " + quantity);
        } else {
            quantity += change;
            System.out.println(name + " stock updated. New quantity: " + quantity);
        }
    }

    /**
     * STATIC METHOD: Calculates total value of an entire inventory array.
     * Static because it operates on a collection, not a single instance.
     * Total value = sum of (price * quantity) for each product.
     */
    public static double calculateTotalValue(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public void display() {
        System.out.println("ID: " + productId + " | " + name
                + " | Price: Rs." + String.format("%.2f", price)
                + " | Qty: " + quantity
                + " | Value: Rs." + String.format("%.2f", price * quantity));
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Product " + (i + 1) + " ---");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            // Using the parameterized constructor
            products[i] = new Product(id, name, price, qty);
        }

        // Display all products
        System.out.println("\n========== INVENTORY ==========");
        for (Product p : products) {
            p.display();
        }

        // Display total inventory value using static method
        System.out.printf("\nTotal Inventory Value: Rs.%.2f%n",
                Product.calculateTotalValue(products));

        // Demonstrate overloaded updatePrice methods
        if (n > 0) {
            System.out.println("\n--- Price Update Demo ---");
            products[0].updatePrice(999.99);          // Direct price update (version 1)
            products[0].updatePrice(10, true);         // Discount-based update (version 2)
            products[0].updateStock(50);               // Add stock
            products[0].updateStock(-20);              // Remove stock
        }

        sc.close();
    }
}
