import java.util.Random;
public class BankAccount {
    private final String owner;
    private double balance;
    private final String accountNumber;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        // Remove the += operator
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        // Remove the -= operator
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}