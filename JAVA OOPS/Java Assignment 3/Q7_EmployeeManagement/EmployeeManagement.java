import java.util.Scanner;

/**
 * Question 7: Employee Management System
 * 
 * Manages employees with salary calculations including various allowances.
 * Demonstrates method overloading for flexible salary computation.
 * 
 * OOP Concepts Used:
 * - Method overloading (three versions of calculateSalary)
 * - Encapsulation (private fields with public accessors)
 * - Static variable to count total employees
 */

class Employee {
    private int empId;
    private String name;
    private double baseSalary;

    private static int totalEmployees = 0;

    public Employee(int empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
        totalEmployees++;
    }

    /**
     * METHOD OVERLOADING - Version 1: Calculate salary with NO allowances.
     * Returns just the base salary.
     * 
     * All three calculateSalary methods have the SAME NAME but different
     * parameter lists. The Java compiler determines which version to call
     * based on the number and types of arguments passed at the call site.
     * This is resolved at COMPILE TIME (static polymorphism).
     */
    public double calculateSalary() {
        return baseSalary;
    }

    /**
     * METHOD OVERLOADING - Version 2: Calculate salary with HRA (House Rent Allowance).
     * Takes one parameter: hraPercentage.
     * HRA is calculated as a percentage of the base salary.
     */
    public double calculateSalary(double hraPercentage) {
        double hra = baseSalary * hraPercentage / 100;
        return baseSalary + hra;
    }

    /**
     * METHOD OVERLOADING - Version 3: Calculate salary with HRA + DA (Dearness Allowance).
     * Takes two parameters: hraPercentage and daPercentage.
     * Both allowances are calculated as percentages of the base salary.
     */
    public double calculateSalary(double hraPercentage, double daPercentage) {
        double hra = baseSalary * hraPercentage / 100;
        double da = baseSalary * daPercentage / 100;
        return baseSalary + hra + da;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public void displayDetails() {
        System.out.println("=== Employee Details ===");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.printf("Base Salary: Rs.%.2f%n", baseSalary);
        System.out.printf("Salary (No Allowance):    Rs.%.2f%n", calculateSalary());
        System.out.printf("Salary (10%% HRA):         Rs.%.2f%n", calculateSalary(10));
        System.out.printf("Salary (10%% HRA + 5%% DA): Rs.%.2f%n", calculateSalary(10, 5));
        System.out.println("========================\n");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Employee " + (i + 1) + " ---");
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Base Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(id, name, salary);
        }

        // Display all employee details with all salary variations
        System.out.println("\n========== EMPLOYEE REPORTS ==========");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        sc.close();
    }
}
