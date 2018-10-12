package lyndaDotCom;

public class Main {

	public static void main(String[] args) {
		
		BankAccount myBankAccount = new BankAccount(4141, 100);
		
		//System.out.println(myBankAccount.account_balance);
		myBankAccount.deposit(-300);
		myBankAccount.withdrawal(200);
		myBankAccount.deposit(200);
		myBankAccount.withdrawal(300);
		

	}

}
