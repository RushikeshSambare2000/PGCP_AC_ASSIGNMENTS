
    import java.util.Scanner;
public class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Recharge Amount: ");
        int amount = sc.nextInt();

        String validity = "";

        // Switch-case for plans
        switch (amount) {
            case 199:
                validity = "28 days";
                break;
            case 399:
                validity = "56 days";
                break;
            case 599:
                validity = "84 days";
                break;
            default:
                validity = "Invalid Plan";
        }

        // Output
        System.out.println("\n===== RECHARGE DETAILS =====");
        System.out.println("Mobile Number : " + mobile);

        if (!validity.equals("Invalid Plan")) {
            System.out.println("Recharge Amount : Rs. " + amount);
            System.out.println("Validity        : " + validity);
            System.out.println("Status          : Recharge Successful");
        } else {
            System.out.println("Status          : Invalid Recharge Plan");
        }

        System.out.println("============================");

        sc.close();
    }
}

