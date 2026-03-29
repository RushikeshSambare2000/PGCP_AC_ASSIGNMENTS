import java.util.Scanner;

/**
 * Question 2: Fleet Management System
 * 
 * This program manages a fleet of vehicles (Cars and Bikes).
 * Demonstrates inheritance with a base class Vehicle and derived classes Car and Bike.
 * 
 * OOP Concepts Used:
 * - Inheritance (Car/Bike extend Vehicle)
 * - Static block (one-time system initialization, runs when class is first loaded)
 * - Non-static / Instance block (runs every time an object is created, before constructor)
 * - Method overriding (display() in subclasses)
 * - Encapsulation (private fields with getters/setters)
 */

// Base class for all vehicles
class Vehicle {
    private String brand;
    private double speed;

    /*
     * STATIC BLOCK:
     * - Executes ONCE when the class is first loaded into memory by the JVM.
     * - Used for one-time initialization tasks (e.g., loading config, logging startup).
     * - Runs before any constructor or static method call.
     */
    static {
        System.out.println("===========================================");
        System.out.println("  Fleet Management System Initialized!");
        System.out.println("  System ready to track vehicles.");
        System.out.println("===========================================\n");
    }

    /*
     * NON-STATIC (INSTANCE) BLOCK:
     * - Executes EVERY TIME a new object of this class (or subclass) is created.
     * - Runs BEFORE the constructor body.
     * - Useful for common initialization logic shared across all constructors.
     */
    {
        System.out.println("[LOG] A new Vehicle object is being created...");
    }

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() { return brand; }
    public double getSpeed() { return speed; }

    // Setter to allow updating speed after object creation
    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println(brand + " speed updated to " + speed + " km/h");
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

/**
 * Car class inherits from Vehicle and adds fuel type and mileage.
 * The 'extends' keyword establishes the IS-A relationship: Car IS-A Vehicle.
 */
class Car extends Vehicle {
    private String fuelType;
    private double mileage;

    public Car(String brand, double speed, String fuelType, double mileage) {
        // super() calls the parent class constructor. Must be the first statement.
        super(brand, speed);
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    /**
     * Overrides the parent display() method to include car-specific details.
     * The @Override annotation tells the compiler to verify this method
     * actually overrides a parent method (catches typos at compile time).
     */
    @Override
    public void display() {
        System.out.println("--- Car Details ---");
        super.display();  // Call parent's display() to avoid duplicating code
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("-------------------\n");
    }
}

// Bike class - another subclass of Vehicle
class Bike extends Vehicle {
    private String fuelType;
    private double mileage;

    public Bike(String brand, double speed, String fuelType, double mileage) {
        super(brand, speed);
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    @Override
    public void display() {
        System.out.println("--- Bike Details ---");
        super.display();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("--------------------\n");
    }
}

public class FleetManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store vehicles in an array. Using Vehicle[] allows polymorphism -
        // we can store both Car and Bike objects in the same array.
        Vehicle[] fleet = new Vehicle[4];

        System.out.println("--- Enter Car 1 Details ---");
        System.out.print("Brand: "); String b1 = sc.nextLine();
        System.out.print("Speed (km/h): "); double s1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fuel Type: "); String f1 = sc.nextLine();
        System.out.print("Mileage (km/l): "); double m1 = sc.nextDouble();
        sc.nextLine();
        fleet[0] = new Car(b1, s1, f1, m1);

        System.out.println("\n--- Enter Car 2 Details ---");
        System.out.print("Brand: "); String b2 = sc.nextLine();
        System.out.print("Speed (km/h): "); double s2 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fuel Type: "); String f2 = sc.nextLine();
        System.out.print("Mileage (km/l): "); double m2 = sc.nextDouble();
        sc.nextLine();
        fleet[1] = new Car(b2, s2, f2, m2);

        System.out.println("\n--- Enter Bike 1 Details ---");
        System.out.print("Brand: "); String b3 = sc.nextLine();
        System.out.print("Speed (km/h): "); double s3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fuel Type: "); String f3 = sc.nextLine();
        System.out.print("Mileage (km/l): "); double m3 = sc.nextDouble();
        sc.nextLine();
        fleet[2] = new Bike(b3, s3, f3, m3);

        System.out.println("\n--- Enter Bike 2 Details ---");
        System.out.print("Brand: "); String b4 = sc.nextLine();
        System.out.print("Speed (km/h): "); double s4 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Fuel Type: "); String f4 = sc.nextLine();
        System.out.print("Mileage (km/l): "); double m4 = sc.nextDouble();
        fleet[3] = new Bike(b4, s4, f4, m4);

        // Display all vehicles using polymorphism:
        // Even though fleet[] is of type Vehicle[], calling display() on each
        // element invokes the overridden version in Car or Bike at runtime.
        System.out.println("\n========== FLEET REPORT ==========");
        for (Vehicle v : fleet) {
            v.display();
        }

        // Demonstrate updating speed
        System.out.println("--- Updating speed of first car ---");
        fleet[0].setSpeed(180);

        sc.close();
    }
}
