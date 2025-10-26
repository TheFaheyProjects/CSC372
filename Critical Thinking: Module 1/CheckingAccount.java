// Kyle Fahey
// October 26, 2025
// CSC372-1

// Implementing a Superclass Bank Account
// Part 2

public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount(double interestRate) {
        super(); // Call BankAccount constructor
        this.interestRate = interestRate;
    }

    // Process Withdrawal with Overdraft Fee
    public void processWithdrawal(double amount) {
        double currentBalance = getBalance();
        if (amount <= currentBalance) {
            withdrawal(amount);
        } else {
            double overdraftFee = 30.0;
            withdrawal(amount + overdraftFee);
            System.out.println("Overdraft! A $30 fee has been applied to your account.");
        }
    }

    // Display All Info including Interest Rate
    public void displayAccount() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Account ID: " + getAccountID());
        System.out.printf("Balance: $%.2f%n", getBalance());
        System.out.println("Interest Rate: " + (getInterestRate() * 100) + "%");
    }

    // Setter and Getter for Interest Rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
