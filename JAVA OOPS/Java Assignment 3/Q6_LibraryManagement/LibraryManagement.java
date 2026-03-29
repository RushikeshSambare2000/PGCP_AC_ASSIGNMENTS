import java.util.Scanner;

/**
 * Question 6: Library Management System
 * 
 * Manages books with issue/return functionality and availability tracking.
 * Demonstrates the 'this' keyword and static variables.
 * 
 * OOP Concepts Used:
 * - 'this' keyword in constructors (to distinguish parameters from fields)
 * - Static variable to track total books in the library
 * - Boolean flag for availability status
 * - Validation to prevent issuing unavailable books
 */

class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    /**
     * STATIC VARIABLE: Shared across ALL Book objects.
     * Unlike instance variables (which each object has its own copy of),
     * a static variable has only ONE copy for the entire class.
     * Every time we create a Book, this counter increments for ALL books.
     */
    private static int totalBooks = 0;

    /**
     * Constructor demonstrating the 'this' keyword.
     * 
     * 'this' refers to the CURRENT OBJECT being constructed.
     * When parameter names match field names, 'this' disambiguates:
     *   - 'bookId' alone refers to the PARAMETER (local scope wins)
     *   - 'this.bookId' refers to the FIELD of the current object
     * Without 'this', the parameter would shadow the field, and the
     * assignment would do nothing useful.
     */
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;      // this.bookId = field, bookId = parameter
        this.title = title;        // this.title = field, title = parameter
        this.author = author;      // this.author = field, author = parameter
        this.isAvailable = true;   // New books are available by default
        totalBooks++;              // Static variable: shared counter increments
    }

    /**
     * Issue a book to a student/member.
     * Checks availability first - can't issue what's already issued.
     */
    public void issueBook() {
        if (!isAvailable) {
            System.out.println("'" + title + "' is NOT available. Already issued to someone.");
        } else {
            isAvailable = false;  // Mark as unavailable
            System.out.println("'" + title + "' has been issued successfully.");
        }
    }

    /**
     * Return a previously issued book.
     * Checks if the book was actually issued before allowing return.
     */
    public void returnBook() {
        if (isAvailable) {
            System.out.println("'" + title + "' was not issued. No need to return.");
        } else {
            isAvailable = true;  // Mark as available again
            System.out.println("'" + title + "' has been returned successfully.");
        }
    }

    // Static method to get total books - accessed via Book.getTotalBooks()
    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayStatus() {
        System.out.println("ID: " + bookId + " | " + title + " by " + author
                + " | Status: " + (isAvailable ? "AVAILABLE" : "ISSUED"));
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Book " + (i + 1) + " ---");
            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();

            books[i] = new Book(id, title, author);
        }

        // Display all books
        System.out.println("\n========== LIBRARY CATALOG ==========");
        for (Book b : books) {
            b.displayStatus();
        }
        System.out.println("Total Books in Library: " + Book.getTotalBooks());

        // Demonstrate issue and return
        if (n > 0) {
            System.out.println("\n--- Issue/Return Demo ---");
            books[0].issueBook();         // Issue first book
            books[0].issueBook();         // Try issuing again (should fail)
            books[0].returnBook();        // Return the book
            books[0].returnBook();        // Try returning again (should show message)

            System.out.println("\n--- Updated Catalog ---");
            for (Book b : books) {
                b.displayStatus();
            }
        }

        sc.close();
    }
}
