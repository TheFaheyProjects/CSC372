// Kyle Fahey
// CSC372-1
// Module 8: Portfolio Project

// Basic Library System

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

// Main Program for the Library System
public class LibrarySystem {

    public static void main(String[] args) {

        // Create Library Inventory
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        // Menu Selection Variable
        int choice = 0; 

        // Menu Keeps Running Until User Chooses Exit (6)
        while (choice != 6) {

            // Display Menu
            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search by Title");
            System.out.println("5. Print All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                // Reads Menu Choice
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {

                // Option 1: Add Book
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();

                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();

                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();

                        System.out.print("Enter Number of Pages: ");
                        int pages = scanner.nextInt();

                        // Create a New Book and Add to Inventory
                        Book book = new Book(id, title, author, isbn, pages);
                        inventory.addBook(book);

                        System.out.println("Book has Been Added to the Library.");

                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please try again.");
                        scanner.nextLine();
                    }
                    break;

                // Option 2: Borrow Book
                case 2:
                    System.out.print("Enter Book ID to Borrow: ");
                    int borrowId = scanner.nextInt();

                    if (inventory.borrowBook(borrowId)) {
                        System.out.println("Book has Been Borrowed Successfully.");
                    } else {
                        System.out.println("Book has Not Been Found or it has Already Been Borrowed.");
                    }
                    break;

                // Option 3: Return Book
                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = scanner.nextInt();

                    if (inventory.returnBook(returnId)) {
                        System.out.println("Book has Been Returned Successfully.");
                    } else {
                        System.out.println("Book has Not Been Found in the Borrowed List.");
                    }
                    break;

                // Option 4: Search By Title
                case 4:
                    System.out.print("Enter Title: ");
                    String titleSearch = scanner.nextLine();

                    ArrayList<Book> results = inventory.searchByTitle(titleSearch);

                    if (results.isEmpty()) {
                        System.out.println("No Book Matching that Title Found.");
                    } else {
                        for (Book b : results) {
                            b.printBookInfo();
                        }
                    }
                    break;

                // Option 5: Print All Books
                case 5:
                    inventory.printAll();
                    break;

                // Option 6: Exit Program
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                // Invalid Option
                default:
                    System.out.println("Invalid option. Please choose from 1 - 6.");
            }
        }

        scanner.close(); // Close scanner
    }
}
