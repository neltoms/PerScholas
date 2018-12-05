package Encapon;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			person p = new person();
			p.setName("haseeb");
			System.out.println("hello " + p.getName());
			
			System.out.println("Enter Your Age");
			Scanner sc = new Scanner(System.in);
			int myage = sc.nextInt();
			p.setAge(myage);
			
			System.out.println(p.getAge());
			System.out.println(p.doubleAge());
			System.out.println("After 10 year you will be " + p.after10yearYourAge() + " old years old");
	
			
			
			
			
			
			
			
			
	p.setcollage("per scholas");		
	System.out.println(p.getcollage());		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
