package savingsAccounts;
public class BankAccount {
	
	private int account_number;
	private int account_balance;
	private int removeMoney;
	private int addMoney;
	
	
	
	public BankAccount(int account_number, int account_balance) {
		
		this.account_number = account_number;
		this.account_balance = account_balance;
		System.out.println("You created the bank account " + this.account_number + 
				" with $" + this.account_balance + ".") ;
		
	}
	
	public void deposit(int addMoney) {
		this.addMoney = addMoney;
		if(addMoney < 0) {
			System.out.println("You cannot add a negative amount!");
		}
		else {
			this.account_balance = this.account_balance + addMoney;
			System.out.println("$"+addMoney + " deposited into account " + this.account_number + ".");
		}
	}
	
	public void withdrawal(int removeMoney) {
		this.removeMoney = removeMoney;
		if(removeMoney > this.account_balance) {
			System.out.println("You cannot withdrawal more than the account balance. ");
		}
		else {
			this.account_balance = this.account_balance - removeMoney;
			System.out.println("$"+removeMoney + " withdrawn from account " + this.account_number + ".");
		}
	}
	
	public int getDep() {
		return this.addMoney;
	}
	
	public int getWith() {
		return this.removeMoney;
	}
	
	public int balance() {
		return this.account_balance;
	}
	
	public double monthlyInt(double rate) {
		double monthlyRate = ((rate/100)/12);
		return monthlyRate;
		 
	}

}






