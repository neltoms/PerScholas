package Encapsulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		int empId = sc.nextInt();
				
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		System.out.println(name + "'s employee ID is: " + empId);
		

	}

}
