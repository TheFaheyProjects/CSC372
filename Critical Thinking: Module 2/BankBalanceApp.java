// Kyle Fahey
// Novembber 2, 2025
// CSC372-1


// GUI Bank Balance Application

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// BankAccount handles Deposits, Withdrawls, and Balance
class BankAccount {
    private double balance;

    // Default Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Creating the GUI
public class BankBalanceApp extends JFrame implements ActionListener {

    // Decalring Instances
    private BankAccount account;
    private JTextField amountField;
    private JLabel balanceLabel;

    // User Buttons
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton exitButton;

    // Default Constructor
    public BankBalanceApp() {

        // Initialize Bank Account with User Input
        String input = JOptionPane.showInputDialog("Enter your starting Balance:");
        double startingBalance = 0;

        // Handle Invalid User Input
        try {
            startingBalance = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Starting Balance has been set to 0.");
        }

        // Creating a New Object
        account = new BankAccount(startingBalance);

        // Setting up the JFrame
        setTitle("Bank Balance Application");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting up the JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        // Create GUI Components
        panel.add(new JLabel("Enter amount:"));
        amountField = new JTextField();
        panel.add(amountField);

        // Creating the Buttons for the User
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");

        // Adding the Buttons to the Panel
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(exitButton);

        // Creating and Displaying the Current Balance
        balanceLabel = new JLabel("Current Balance: $" + account.getBalance());
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(balanceLabel);

        add(panel);

        // Adding Action listeners to the Buttons
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        exitButton.addActionListener(this);

        setVisible(true);
    }

    // Event Handling
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Deposit Button
        if (command.equals("Deposit")) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                account.deposit(amount);
                balanceLabel.setText("Current Balance: $" + account.getBalance());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            }

        // Withdraw Button
        } else if (command.equals("Withdraw")) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                account.withdraw(amount);
                balanceLabel.setText("Current Balance: $" + account.getBalance());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            }

        // Exit the Program
        } else if (command.equals("Exit")) {
            // Displaying the Final Balance
            JOptionPane.showMessageDialog(this,
                    "Final Balance: $" + account.getBalance() + "\nThank you for using our Bank!");
            System.exit(0);
        }
    }

    // Main Method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BankBalanceApp());
    }
}
