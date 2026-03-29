import java.util.Scanner;

/**
 * Question 9: Course Management System
 * 
 * Manages courses and student enrollments.
 * Tracks which students are enrolled in which courses.
 * 
 * OOP Concepts Used:
 * - Object Composition (Course contains enrolled student names)
 * - Arrays with dynamic tracking (using a count variable with fixed-size array)
 * - Static variable for total course count
 * - Encapsulation with controlled enrollment logic
 */

class Course {
    private int courseId;
    private String courseName;
    private double fees;
    private String[] enrolledStudents;  // Fixed-size array for enrolled student names
    private int enrollmentCount;        // Tracks how many students are actually enrolled

    private static int totalCourses = 0;

    /**
     * Constructor initializes the course with a max capacity.
     * The enrolledStudents array is pre-allocated to maxCapacity size,
     * but enrollmentCount tracks actual usage. This is a common pattern
     * when you know the upper bound but not the exact number upfront.
     */
    public Course(int courseId, String courseName, double fees, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fees = fees;
        this.enrolledStudents = new String[maxCapacity];
        this.enrollmentCount = 0;
        totalCourses++;
    }

    /**
     * Enrolls a student in this course.
     * Checks capacity before allowing enrollment.
     * Uses enrollmentCount as both the next available index AND the current count.
     * This works because array indices are 0-based:
     *   - When count=0, next student goes to index 0
     *   - When count=1, next student goes to index 1
     *   - etc.
     */
    public void enrollStudent(String studentName) {
        if (enrollmentCount >= enrolledStudents.length) {
            System.out.println("Course '" + courseName + "' is full! Cannot enroll " + studentName);
        } else {
            enrolledStudents[enrollmentCount] = studentName;
            enrollmentCount++;
            System.out.println(studentName + " enrolled in '" + courseName + "' successfully.");
        }
    }

    public int getEnrollmentCount() { return enrollmentCount; }

    public static int getTotalCourses() { return totalCourses; }

    public void displayDetails() {
        System.out.println("=== Course Details ===");
        System.out.println("Course ID: " + courseId);
        System.out.println("Name: " + courseName);
        System.out.printf("Fees: Rs.%.2f%n", fees);
        System.out.println("Enrolled Students (" + enrollmentCount + "):");
        if (enrollmentCount == 0) {
            System.out.println("  No students enrolled yet.");
        } else {
            for (int i = 0; i < enrollmentCount; i++) {
                System.out.println("  " + (i + 1) + ". " + enrolledStudents[i]);
            }
        }
        System.out.println("======================\n");
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Course " + (i + 1) + " ---");
            System.out.print("Course ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Course Name: ");
            String name = sc.nextLine();
            System.out.print("Fees: ");
            double fees = sc.nextDouble();
            System.out.print("Max Capacity: ");
            int cap = sc.nextInt();
            sc.nextLine();

            courses[i] = new Course(id, name, fees, cap);
        }

        // Enroll students interactively
        System.out.print("\nHow many student enrollments to process? ");
        int enrollments = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < enrollments; i++) {
            System.out.println("\n--- Enrollment " + (i + 1) + " ---");
            System.out.print("Student Name: ");
            String sName = sc.nextLine();
            System.out.println("Available Courses:");
            for (int j = 0; j < n; j++) {
                System.out.println("  " + (j + 1) + ". " + courses[j].getEnrollmentCount() + " enrolled");
            }
            System.out.print("Choose course number (1-" + n + "): ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= n) {
                courses[choice - 1].enrollStudent(sName);
            } else {
                System.out.println("Invalid choice!");
            }
        }

        // Display all course details
        System.out.println("\n========== COURSE REPORTS ==========");
        for (Course c : courses) {
            c.displayDetails();
        }

        System.out.println("Total Courses: " + Course.getTotalCourses());
        sc.close();
    }
}
