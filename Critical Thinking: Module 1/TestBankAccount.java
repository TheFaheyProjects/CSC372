// Kyle Fahey
// October 26, 2025
// CSC372-1

// Implementing a Superclass Bank Account
// Part 3 - Test Account

public class TestBankAccount {
    public static void main(String[] args) {

        // Create CheckingAccount Object
        CheckingAccount account = new CheckingAccount(0.02); // 2% interest

        // Setting Account Information
        account.setFirstName("Kyle");
        account.setLastName("Fahey");
        account.setAccountID(110624);

        // Depositing
        account.deposit(500.00);
        account.displayAccount();
        System.out.println();

        // Withdrawing without Overdraft
        System.out.println("Withdrawing $200...");
        account.processWithdrawal(200.00);
        account.displayAccount();
        System.out.println();

        // Withdrawing with Overdraft
        System.out.println("Withdrawing $400 (overdraft)...");
        account.processWithdrawal(400.00);
        account.displayAccount();
    }
}
