import java.util.ArrayList;

public class TestBank {
    
	public static void main(String[] args) {


        BankAccount account1 = new BankAccount(500.0, 250.5);
        account1.checkingDeposit(2000.0);
        account1.checkingWithdrawal(230.0);
        account1.getCheckingBalance();
        System.out.print(account1.getAllBalances());

        BankAccount account2 = new BankAccount(10.0, 5.0);
        BankAccount account3 = new BankAccount(1000.0, 500.0);
        BankAccount account4 = new BankAccount(204.0, 105.0);
        BankAccount account5 = new BankAccount(300.0, 2500.0);

        System.out.println(BankAccount.getAccounts());
        // System.out.println(BankAccount.getTotal());
        

    }

}