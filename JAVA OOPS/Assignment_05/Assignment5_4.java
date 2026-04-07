import java.util.ArrayList;
import java.util.List;

class Payment {
    int paymentId;
    double amount;

    Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId + ", Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(int paymentId, double amount, String cardNumber) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void displayPayment() {
        System.out.println("Credit Card Payment -> ID: " + paymentId +
                ", Amount: " + amount +
                ", Card: " + cardNumber);
    }
}


class UPIPayment extends Payment {
    String upiId;

    UPIPayment(int paymentId, double amount, String upiId) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    @Override
    public void displayPayment() {
        System.out.println("UPI Payment -> ID: " + paymentId +
                ", Amount: " + amount +
                ", UPI ID: " + upiId);
    }
}


class PaymentProcessor {

    // Wildcard method
    public static void processPayments(List<? extends Payment> payments) {
        for (Payment p : payments) {
            p.displayPayment();
        }
        System.out.println("------------------------");
    }
}

public class Assignment5_4 {
    public static void main(String[] args) {

        // Credit Card Payments List
        List<CreditCardPayment> creditList = new ArrayList<>();
        creditList.add(new CreditCardPayment(1, 5000, "1234-XXXX"));
        creditList.add(new CreditCardPayment(2, 12000, "5678-XXXX"));

        // UPI Payments List
        List<UPIPayment> upiList = new ArrayList<>();
        upiList.add(new UPIPayment(3, 1500, "user@upi"));
        upiList.add(new UPIPayment(4, 2200, "abc@upi"));

        // Process both lists
        System.out.println("Credit Card Payments:");
        PaymentProcessor.processPayments(creditList);

        System.out.println("UPI Payments:");
        PaymentProcessor.processPayments(upiList);
    }
}

