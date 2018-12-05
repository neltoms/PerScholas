package Loops;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		int rem;
		int temp;
		int revNum = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wish to palindrome check...\n");
		
		int num = sc.nextInt();
		temp = num;
		
		while(num > 0) {
			rem = (num % 10);
			
			revNum = (revNum*10)+ rem;
			
			num = num /10;
		
		}
		
		if (temp == revNum) {
			System.out.println("This number is a palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
	
	}
	
		
}

