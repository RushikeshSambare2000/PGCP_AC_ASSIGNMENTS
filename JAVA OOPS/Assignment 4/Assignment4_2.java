import java.util.*;

// 2.4 Interface
interface BankService {
    void deposit(double amount);
    void deposit(double amount, double bonus); // overloading
    void withdraw(double amount);
}

// 2.1 Base Class
class Account {
    int accountNumber;
    String accountHolderName;
    double balance;

    // 2.6 Constructor with String balance input
    Account(int accNo, String name, String balanceStr) {
        this.accountNumber = accNo;
        this.accountHolderName = name;

        try {
            this.balance = Double.parseDouble(balanceStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance input. Setting balance to 0.");
            this.balance = 0;
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
    }

    // 2.9 Summary using StringBuilder
    String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- Account Summary ---\n");
        sb.append("Account Number: ").append(accountNumber).append("\n");
        sb.append("Account Holder: ").append(accountHolderName).append("\n");
        sb.append("Balance: ").append(balance).append("\n");
        return sb.toString();
    }
}

// 2.2 SavingsAccount
class SavingsAccount extends Account implements BankService {

    SavingsAccount(int accNo, String name, String balanceStr) {
        super(accNo, name, balanceStr);
    }

    // 2.3 Method overriding
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Savings Account");
    }

    // 2.5 Deposit
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }
        balance += amount;
    }

    // 2.7 Overloaded deposit
    public void deposit(double amount, double bonus) {
        if (amount < 0 || bonus < 0) {
            System.out.println("Invalid deposit/bonus.");
            return;
        }
        balance += (amount + bonus);
    }

    // 2.8 Withdraw
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal cannot be negative.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}

// 2.2 CurrentAccount
class CurrentAccount extends Account implements BankService {

    CurrentAccount(int accNo, String name, String balanceStr) {
        super(accNo, name, balanceStr);
    }

    // 2.3 Method overriding
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Current Account");
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative.");
            return;
        }
        balance += amount;
    }

    public void deposit(double amount, double bonus) {
        if (amount < 0 || bonus < 0) {
            System.out.println("Invalid deposit/bonus.");
            return;
        }
        balance += (amount + bonus);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal cannot be negative.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}

// 2.11 Main Class
public class assignment4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance (String): ");
            String balanceStr = sc.nextLine();

            System.out.print("Choose Account Type (1: Savings, 2: Current): ");
            int choice = sc.nextInt();

            Account acc;

            if (choice == 1) {
                acc = new SavingsAccount(accNo, name, balanceStr);
            } else {
                acc = new CurrentAccount(accNo, name, balanceStr);
            }

            acc.displayAccountDetails();

            BankService service = (BankService) acc;

            System.out.print("Enter deposit amount: ");
            double dep = sc.nextDouble();
            service.deposit(dep);

            System.out.print("Enter deposit bonus: ");
            double bonus = sc.nextDouble();
            service.deposit(dep, bonus);

            System.out.print("Enter withdrawal amount: ");
            double wd = sc.nextDouble();
            service.withdraw(wd);

            System.out.println(acc.getSummary());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}