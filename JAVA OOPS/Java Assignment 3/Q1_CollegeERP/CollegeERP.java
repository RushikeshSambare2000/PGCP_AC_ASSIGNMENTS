import java.util.Scanner;

/**
 * Question 1: College ERP (Student Module)
 * 
 * This program simulates a College ERP system for managing students.
 * It stores roll number, name, marks in multiple subjects, and contact details.
 * Features: Store multiple students, calculate total/average marks, track admissions.
 * 
 * OOP Concepts Used:
 * - Encapsulation (private fields, getters/setters)
 * - Object Composition (Student has ContactDetails)
 * - Arrays of objects for storing multiple students
 * - Variable-length argument handling for flexible average calculation
 */

// Separate class to hold contact details - demonstrates Object Composition
class ContactDetails {
    private String phone;
    private String email;

    public ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void display() {
        System.out.println("  Phone: " + phone);
        System.out.println("  Email: " + email);
    }
}

class Student {
    private int rollNumber;
    private String name;
    private double[] marks;          // Array to store marks in multiple subjects
    private ContactDetails contact;  // Composition: Student HAS-A ContactDetails

    // Static variable to track total students admitted across all instances
    private static int totalStudents = 0;

    public Student(int rollNumber, String name, double[] marks, String phone, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.contact = new ContactDetails(phone, email);
        totalStudents++;  // Increment count each time a new student is created
    }

    /**
     * Calculates the total marks by summing all elements in the marks array.
     * Uses a for-each loop for clean iteration over the array.
     */
    public double calculateTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    /**
     * Calculates average marks.
     * Reuses calculateTotal() to avoid code duplication (DRY principle).
     * Guards against division by zero when no marks exist.
     */
    public double calculateAverage() {
        if (marks.length == 0) return 0;
        return calculateTotal() / marks.length;
    }

    /**
     * Overloaded method: Calculates average of only the first 'n' subjects.
     * This demonstrates method overloading - same method name, different parameters.
     * Useful when you want average of a subset of subjects.
     */
    public double calculateAverage(int numberOfSubjects) {
        if (numberOfSubjects <= 0 || numberOfSubjects > marks.length) return calculateAverage();
        double total = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            total += marks[i];
        }
        return total / numberOfSubjects;
    }

    // Static method - belongs to the class, not any specific instance
    public static int getTotalStudents() {
        return totalStudents;
    }

    public void displayReport() {
        System.out.println("=== Student Report ===");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + (i < marks.length - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Average Marks: %.2f%n", calculateAverage());
        System.out.println("Contact Details:");
        contact.display();
        System.out.println("======================\n");
    }
}

public class CollegeERP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Array of Student objects to store multiple students
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine(); // Consume leftover newline after nextInt()
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Number of subjects: ");
            int subjects = sc.nextInt();
            double[] marks = new double[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }
            sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            students[i] = new Student(roll, name, marks, phone, email);
        }

        // Display all student reports
        System.out.println("\n========== ALL STUDENT REPORTS ==========");
        for (Student s : students) {
            s.displayReport();
        }

        // Static method call - accessed via class name, not an object
        System.out.println("Total Students Admitted: " + Student.getTotalStudents());
        sc.close();
    }
}
