package Loops;

public class Factorial {

	public static void main(String[] args) {
		factWhile(6);
		factFor(6);

	}
	
	public static void factFor(int n) {
		
		long fac = 1;
		for(int i = 1; i<=n; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
	}
	
	public static void factWhile(int n) {
		int i = 1;
		long fac = 1;
		while(i <= n) {
			fac = fac * i;
			i++;
			
		}
		System.out.println(fac);
		
	}

}
