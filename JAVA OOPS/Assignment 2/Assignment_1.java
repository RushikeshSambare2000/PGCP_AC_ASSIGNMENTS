import java.util.Scanner;

class ElectricityBill {

    String customerName;
    int consumerNumber;
    int units;
    double billAmount;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Consumer Number: ");
        consumerNumber = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextInt();
    }

    void calculateBill() {
        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {
            billAmount = (100 * 5) + (units - 100) * 7;
        } else {
            billAmount = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        // surcharge
        if (billAmount > 1500) {
            billAmount = billAmount + (billAmount * 0.05);
        }
    }

    void displayBill() {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Consumer No: " + consumerNumber);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: Rs. " + billAmount);
    }
}

public class Assignment_1 {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

        eb.getData();
        eb.calculateBill();
        eb.displayBill();
    }
}