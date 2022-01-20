public class BankAccount {
    //variables
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalAmount;

    //constructors
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        BankAccount.totalAmount += (checkingBalance + savingsBalance);
    }

    //getters and setters
    public double getCheckingBalance(){
        System.out.println("Balance for checking account is: " + this.checkingBalance);
        return this.checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance(){
        System.out.println("Balance for savings is: " + this.savingsBalance);
        return this.savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double getAllBalances(){
        System.out.println("Total balance for checking & savings is: " + (this.checkingBalance + this.savingsBalance));
        return (this.savingsBalance + this.checkingBalance);
    }

    public static int getAccounts(){
        return BankAccount.numberOfAccounts;
    }

    public static double getTotal(){
        return BankAccount.totalAmount;
    }


    
    public double checkingDeposit(double deposit){
        this.checkingBalance += deposit; 
        BankAccount.totalAmount += deposit;

        return checkingBalance;
    }

    public double savingsDeposit(double deposit){
        this.savingsBalance += deposit; 
        BankAccount.totalAmount += deposit;

        return savingsBalance;
    }

    public boolean checkingWithdrawal(double withdrawal){
        if(withdrawal > this.checkingBalance) {
            return false;
        }
        this.checkingBalance += withdrawal; 
        BankAccount.totalAmount += withdrawal;

        return true;
    }

    public boolean savingsWithdrawal(double withdrawal){
        if(withdrawal > this.savingsBalance) {
            return false;
        }
        this.savingsBalance -= withdrawal; 
        BankAccount.totalAmount -= withdrawal;

        return true;
    }


}



