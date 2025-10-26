// Kyle Fahey
// October 26, 2025
// CSC372-1

// Implementing a Superclass Bank Account
// Part 1

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Default Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdrawal Method
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    // Printing All Account Information
    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.printf("Balance: $", balance);
    }
}
