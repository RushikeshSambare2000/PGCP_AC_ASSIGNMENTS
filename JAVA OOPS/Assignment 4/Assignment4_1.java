import java.util.*;
class Product {
    int productId;
    String productName;
    String price; // String input

    Product(int id, String name, String price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    // Convert String to double
    double getPrice() {
        return Double.parseDouble(price);
    }
}

class Order {
    String customerName;
    Product[] products;

    Order(String name, Product[] products) {
        this.customerName = name;
        this.products = products;
    }

    // Normal total
    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Overloaded (with discount)
    double calculateTotal(double discount) {
        double total = calculateTotal();
        return total - (total * discount / 100);
    }

    // Generate bill
    String generateBill() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");

        for (Product p : products) {
            sb.append(p.productName).append(" - ").append(p.getPrice()).append("\n");
        }

        sb.append("Total: ").append(calculateTotal());
        return sb.toString();
    }
}

interface Payment {
    void pay(double amount);
    void refund(double amount);
}


class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via UPI");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Card");
    }
}



public class Assignment4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of products: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new Exception("Product count must be > 0");
            }

            Product[] products = new Product[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter product id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter product name: ");
                String name = sc.nextLine();

                System.out.print("Enter price: ");
                String price = sc.nextLine();

                products[i] = new Product(id, name, price);
            }

            sc.nextLine();
            System.out.print("Enter customer name: ");
            String cname = sc.nextLine();

            Order order = new Order(cname, products);

            System.out.println("\nBill:\n" + order.generateBill());

            double total = order.calculateTotal();

            System.out.println("Choose Payment: 1.UPI 2.Card");
            int choice = sc.nextInt();

            Payment p;

            if (choice == 1) {
                p = new UPIPayment();
            } else if (choice == 2) {
                p = new CardPayment();
            } else {
                throw new Exception("Invalid payment option");
            }

            p.pay(total);

        } catch (NumberFormatException e) {
            System.out.println("Invalid price format!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

