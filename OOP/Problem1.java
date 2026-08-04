package OOP;

class BankAccount {

    private final int accountNumber;
    private final String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
            System.out.println("Balance Remaining: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountInformation() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name of Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Problem1 {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(1234567890, "Saurabh", 2000);

        account1.deposit(1000);
        account1.withdraw(2000);

        account1.displayAccountInformation();
    }
}