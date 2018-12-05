package Loops;

public class Fibonacci {

	public static void main(String[] args) {
		fib(10);
			
		}
	public static void fib(int n) {
		long fib1 = 0;
		long fib2 = 1;
		long fib3;
		
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i = 2; i < n; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3 + " ");
		}

	}

}
