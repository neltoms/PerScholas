
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// Choose savings account number
		System.out.println("Choose a Savings Account #...");
		int saveNum = sc.nextInt();
		
		// Choose initial deposit amount
		System.out.println("What is your initial deposit? ...");
		int initDep = sc.nextInt();
		
		BankAccount savAcct = new BankAccount(saveNum, initDep);
		
		// Enter interest rate
		System.out.println("Enter the annual interest rate... ");
		double rate = sc.nextDouble();
		double newRate = savAcct.monthlyInt(rate);
		// Create a bucket to hold interest earned
		double earnedInt = Math.round(initDep*newRate);
		
		// Establish how many months the account has been opened
		System.out.println("How many months has the account been opened");
		int months = sc.nextInt();
		for(int i = 1; i <= months; i++) {
			System.out.println("Enter amount deposited for month " + i + ":");
			int dep = sc.nextInt();
			savAcct.deposit(dep);
			earnedInt += dep*newRate;
			System.out.println("Enter amount withdrawn for month " + i + ":");
			int with = sc.nextInt();
			savAcct.withdrawal(with);
			System.out.println("$"+earnedInt + " earned for the month. ");
		}
		
		
		System.out.println("Total deposited: " + savAcct.getDep());
		System.out.println("The total withdrawn: " + savAcct.getWith());
		System.out.println("Interest earned: " + Math.round(earnedInt));
		System.out.println("Ending balance: " + (savAcct.balance()+ Math.round(earnedInt)));
		
		
	
		

	}

}
