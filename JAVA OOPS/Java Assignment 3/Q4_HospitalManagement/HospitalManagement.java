import java.util.Scanner;

/**
 * Question 4: Hospital Management System
 * 
 * Manages patients with their details, assigned doctors, and bill payments.
 * Demonstrates object composition: a Patient HAS-A ContactInfo object.
 * 
 * OOP Concepts Used:
 * - Object Composition (Patient contains a ContactInfo object)
 * - Encapsulation (private fields with controlled access)
 * - Static variable to track total patients
 * - Arrays for storing multiple patient records
 */

/**
 * ContactInfo class - used as a COMPONENT inside Patient.
 * 
 * OBJECT COMPOSITION: Instead of Patient having phone/email as simple strings,
 * we create a separate ContactInfo class. This is composition - Patient "HAS-A" ContactInfo.
 * Benefits:
 *   1. ContactInfo can be reused in other classes (Doctor, Staff, etc.)
 *   2. Contact-related logic is encapsulated in its own class
 *   3. Easy to extend (add address, emergency contact) without modifying Patient
 */
class ContactInfo {
    private String phone;
    private String email;
    private String address;

    public ContactInfo(String phone, String email, String address) {
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    public void display() {
        System.out.println("  Phone: " + phone);
        System.out.println("  Email: " + email);
        System.out.println("  Address: " + address);
    }
}

class Patient {
    private String name;
    private int age;
    private String illness;
    private String doctorName;
    private double billAmount;
    private boolean billPaid;
    private ContactInfo contact;  // Composition: Patient HAS-A ContactInfo

    private static int totalPatients = 0;

    public Patient(String name, int age, String illness, String doctorName,
                   double billAmount, String phone, String email, String address) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.doctorName = doctorName;
        this.billAmount = billAmount;
        this.billPaid = false;
        // Creating the ContactInfo object inside Patient's constructor - this IS composition
        this.contact = new ContactInfo(phone, email, address);
        totalPatients++;
    }

    /**
     * Bill payment method with validation.
     * Checks if bill is already paid to prevent double payment.
     */
    public void payBill() {
        if (billPaid) {
            System.out.println("Bill for " + name + " is already paid.");
        } else {
            billPaid = true;
            System.out.println("Bill of Rs." + billAmount + " paid successfully for " + name);
        }
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    // View a concise record
    public void viewRecord() {
        System.out.println(name + " | Age: " + age + " | Illness: " + illness
                + " | Doctor: " + doctorName + " | Bill: Rs." + billAmount
                + (billPaid ? " (PAID)" : " (UNPAID)"));
    }

    // Generate a detailed patient report
    public void generateReport() {
        System.out.println("========== Patient Report ==========");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Illness: " + illness);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Bill Amount: Rs." + billAmount);
        System.out.println("Bill Status: " + (billPaid ? "PAID" : "UNPAID"));
        System.out.println("Contact Details:");
        contact.display();  // Delegating display to the composed object
        System.out.println("====================================\n");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Patient " + (i + 1) + " ---");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Illness: ");
            String illness = sc.nextLine();
            System.out.print("Doctor Name: ");
            String doctor = sc.nextLine();
            System.out.print("Bill Amount: ");
            double bill = sc.nextDouble();
            sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            patients[i] = new Patient(name, age, illness, doctor, bill, phone, email, address);
        }

        // Display all records
        System.out.println("\n========== ALL PATIENT RECORDS ==========");
        for (Patient p : patients) {
            p.viewRecord();
        }

        // Generate detailed reports
        System.out.println("\n========== DETAILED REPORTS ==========");
        for (Patient p : patients) {
            p.generateReport();
        }

        // Pay bill for first patient as demo
        if (n > 0) {
            System.out.println("--- Paying bill for Patient 1 ---");
            patients[0].payBill();
            patients[0].payBill();  // Try paying again to show validation
        }

        System.out.println("\nTotal Patients: " + Patient.getTotalPatients());
        sc.close();
    }
}
