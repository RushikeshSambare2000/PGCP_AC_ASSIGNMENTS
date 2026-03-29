import java.util.Scanner;

/**
 * Question 3: Banking System
 * 
 * Manages bank accounts with deposit, withdrawal, and interest calculation.
 * Demonstrates static methods, method overloading, and encapsulation.
 * 
 * OOP Concepts Used:
 * - Static methods for interest calculation (utility methods that don't need object state)
 * - Method overloading for deposit (deposit with amount vs. deposit with amount + description)
 * - Encapsulation with validation (e.g., minimum balance check during withdrawal)
 * - Static variable to track total accounts
 */

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;  // "Savings" or "Current"

    private static int totalAccounts = 0;
    private static final double MIN_BALANCE = 1000.0;  // Minimum balance required

    public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
        totalAccounts++;
    }

    /**
     * OVERLOADED deposit method (version 1): Simple deposit with just an amount.
     * Method overloading = same method name, different parameter lists.
     * The compiler decides which version to call based on the arguments passed.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
            System.out.println("New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    /**
     * OVERLOADED deposit method (version 2): Deposit with a description/note.
     * Same name 'deposit' but accepts an extra String parameter.
     */
    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount + " (" + description + ")");
            System.out.println("New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    /**
     * Withdrawal with minimum balance validation.
     * Ensures the account never goes below the MIN_BALANCE threshold.
     * The check (balance - amount >= MIN_BALANCE) prevents overdrawing.
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Insufficient funds! Minimum balance of Rs." + MIN_BALANCE + " must be maintained.");
            System.out.println("Maximum withdrawal allowed: Rs." + (balance - MIN_BALANCE));
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }

    /**
     * STATIC METHOD: Calculates interest based on account type.
     * 
     * Static methods belong to the CLASS, not to any specific object.
     * They can be called as BankAccount.calculateInterest(...) without creating an object.
     * Use static when the logic doesn't depend on instance-specific data.
     * 
     * Here, the interest rate is determined solely by the account type string,
     * not by any particular account object's state.
     */
    public static double calculateInterest(double balance, String accountType) {
        double rate;
        switch (accountType.toLowerCase()) {
            case "savings":
                rate = 4.0;  // 4% for savings
                break;
            case "current":
                rate = 2.0;  // 2% for current
                break;
            default:
                rate = 3.0;  // Default 3%
        }
        return (balance * rate) / 100;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        System.out.println("=== Account Details ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
        // Calling static method using the class name from within the class
        double interest = BankAccount.calculateInterest(balance, accountType);
        System.out.printf("Annual Interest: Rs.%.2f%n", interest);
        System.out.println("========================\n");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Account " + (i + 1) + " ---");
            System.out.print("Account Number: ");
            String accNo = sc.nextLine();
            System.out.print("Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();
            System.out.print("Account Type (Savings/Current): ");
            String type = sc.nextLine();

            accounts[i] = new BankAccount(accNo, name, bal, type);
        }

        // Display all accounts
        System.out.println("\n========== ACCOUNT REPORTS ==========");
        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }

        // Demonstrate deposit overloading and withdrawal
        if (n > 0) {
            System.out.println("--- Demonstrating Deposit & Withdrawal on Account 1 ---");
            accounts[0].deposit(5000);                          // Overloaded version 1
            accounts[0].deposit(3000, "Salary Credit");          // Overloaded version 2
            accounts[0].withdraw(2000);
            System.out.println();
            accounts[0].displayDetails();
        }

        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
        sc.close();
    }
}
