import java.util.Random;
public class BankAccount{
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;
    private String generateAccountNumber(){
        Random r = new Random();
        String newStr = "";
        for (int i = 0; i<10; i++){
            newStr = newStr + r.nextInt(10);
        }
        return newStr;
    }
    public BankAccount(){
        this.accountNumber = this.generateAccountNumber();
        accounts++;
    }
    public void getAccountNumber(){
        System.out.println("Account Number: "+this.accountNumber);
    }
    public void getChecking(){
        System.out.println("Checking Balance: "+this.checkingBalance);
    }
    public void getSavings(){
        System.out.println("Savings Balance: "+this.savingsBalance);
    }
    public void depositSavings(double amount){
        this.savingsBalance += amount;
        totalMoney += amount;
    }
    public void depositChecking(double amount){
        this.checkingBalance += amount;
        totalMoney += amount;
    }
    public void withdrawSavings(double amount){
        if(this.savingsBalance - amount <0){
            System.out.println("Insufficient funds.");
        }
        else {
            this.savingsBalance -= amount;
            totalMoney -= amount;
        }
    }
    public void withdrawChecking(double amount){
        if(this.checkingBalance - amount <0){
            System.out.println("Insufficient funds.");
        }
        else {
            this.checkingBalance -= amount;
            totalMoney -= amount;
        }
    }
    public void totalMoney(){
        System.out.println("Total Money: "+totalMoney);
    }
    public void totalAccounts(){
        System.out.println("Total Accounts: "+accounts);
    }

}