public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bob = new BankAccount();
        BankAccount billy = new BankAccount();
        bob.getAccountNumber();
        billy.getAccountNumber();
        bob.depositSavings(200);
        billy.depositSavings(5000);
        billy.depositChecking(10.5);
        bob.depositChecking(113.9);
        bob.totalMoney();
        bob.totalAccounts();
    }
}