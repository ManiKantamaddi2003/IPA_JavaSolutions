package mark35Questions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Class representing a bank account
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Class representing a transaction
class Transaction {
    private String transactionCode;
    private double amount;
    private String timestamp;

    // Parameterized constructor
    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    // Getters
    public String getTransactionCode() {
        return transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

// Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Class containing utility methods for banking operations
class BankUtils {
    public static Transaction transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) throws InsufficientBalanceException {
        if (fromAccount.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance in the account " + fromAccount.getAccountNumber());
        }

        // Deduct amount from fromAccount and add to toAccount
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        // Create a timestamp for the transaction
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        // Create and return the transaction object
        return new Transaction(transactionCode, amount, timestamp);
    }
}

// Main class to test the implementation
public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Bank Account 1
        System.out.println("Account 1:");
        System.out.print("Account Number: ");
        String accountNumber1 = scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String accountHolderName1 = scanner.nextLine();
        System.out.print("Balance: ");
        double balance1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        BankAccount account1 = new BankAccount(accountNumber1, accountHolderName1, balance1);

        // Create Bank Account 2
        System.out.println("\nAccount 2:");
        System.out.print("Account Number: ");
        String accountNumber2 = scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String accountHolderName2 = scanner.nextLine();
        System.out.print("Balance: ");
        double balance2 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        BankAccount account2 = new BankAccount(accountNumber2, accountHolderName2, balance2);

        // Transfer Details
        System.out.println("\nTransfer Details:");
        System.out.print("Amount: ");
        double transferAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Transaction Code: ");
        String transactionCode = scanner.nextLine();

        // Display account details before transfer
        System.out.println("\nBefore Transfer:");
        System.out.println("Account 1: " + account1.getAccountHolderName() + " - " + account1.getAccountNumber() + " - " + account1.getBalance());
        System.out.println("Account 2: " + account2.getAccountHolderName() + " - " + account2.getAccountNumber() + " - " + account2.getBalance());

        // Perform fund transfer and handle exceptions
        try {
            Transaction transaction = BankUtils.transferFunds(account1, account2, transferAmount, transactionCode);
            System.out.println("\nAfter Transfer:");
            System.out.println("Account 1: " + account1.getAccountHolderName() + " - " + account1.getAccountNumber() + " - " + account1.getBalance());
            System.out.println("Account 2: " + account2.getAccountHolderName() + " - " + account2.getAccountNumber() + " - " + account2.getBalance());

            // Print transaction details
            System.out.println("\nTransaction Details:");
            System.out.println("Transaction Code: " + transaction.getTransactionCode());
            System.out.println("Amount Transferred: " + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
