public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);
        System.out.println(account.getOwner());  // Output: John Doe
        System.out.println(account.getBalance());  // Output: 1000
        System.out.println(account.getAccountNumber());  // Output: Random 10-digit number
        account.deposit(500);
        System.out.println(account.getBalance());  // Output: 1500
        account.withdraw(200);
        System.out.println(account.getBalance());  // Output: 1300
    }
}
