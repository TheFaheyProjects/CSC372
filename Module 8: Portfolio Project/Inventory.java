// Kyle Fahey
// CSC372-1
// Module 8: Portfolio Project

// Basic Library System

import java.util.ArrayList;

// Inventory Class Stores and Manages All Books in the Library
public class Inventory {

    // Main Inventory - What is Available
    private ArrayList<Book> mainInventory = new ArrayList<>();

    // Borrowed Books - What is Currently Checked Out
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Adds a New Book
    public void addBook(Book book) {
        mainInventory.add(book);
    }

    // Borrow a Book by ID
    // Moves Book from mainInventory to borrowedBooks
    public boolean borrowBook(int id) {

        // Loop Through Available Books
        for (Book b : mainInventory) {
            if (b.getId() == id) {
                mainInventory.remove(b);
                borrowedBooks.add(b);
                // Borrow Successful
                return true; 
            }
        }
        // Book Not Found or Unavailable
        return false; 
    }

    // Return a Borrowed Book by ID
    // Moves Book from borrowedBooks to mainInventory
    public boolean returnBook(int id) {

        // Loop Through Borrowed Books
        for (Book b : borrowedBooks) {
            if (b.getId() == id) {
                borrowedBooks.remove(b);
                mainInventory.add(b);
                // Return Successful
                return true; 
            }
        }
        // Book is Not Currently Borrowed
        return false; 
    }

    // Prints All Available Books in the Library
    public void printAll() {
        if (mainInventory.isEmpty()) {
            System.out.println("No Books are Currently in the Library.");
            return;
        }

        // Call printBookInfo() for Each Book
        for (Book b : mainInventory) {
            b.printBookInfo();
        }
    }

    // Searches for Books that Match a Title
    // Case-insensitive Search
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<>();

        for (Book b : mainInventory) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(b);
            }
        }

        return results;
    }
}
