package lyndaDotCom;

public class BankAccount {
	
	private int account_number;
	private int account_balance;
	
	public BankAccount(int account_number, int account_balance) {
		
		this.account_number = account_number;
		this.account_balance = account_balance;
		System.out.println("You created the bank account " + this.account_number + ".") ;
		
	}
	
	public void deposit(int addMoney) {
		if(addMoney < 0) {
			System.out.println("You cannot add a negative amount!");
		}
		else {
			this.account_balance = this.account_balance + addMoney;
			System.out.println("$"+addMoney + " deposited into account " + this.account_number + ".");
		}
	}
	
	public void withdrawal(int removeMoney) {
		if(removeMoney > this.account_balance) {
			System.out.println("You cannot withdrawal more than the account balance. ");
		}
		else {
			this.account_balance = this.account_balance - removeMoney;
			System.out.println("$"+removeMoney + " withdrawn from account " + this.account_number + ".");
		}
	}

}
