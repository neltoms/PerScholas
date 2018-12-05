package Loops;

public class Primes {

	public static void main(String[] args) {
	
		primes();
	
	}
	
		public static void primes() {
		
			for(int i = 1; i < 100; i++) {
				int cnt = 0;
				for(int j = 1; j < 100; j++) {
					if(i%j == 0) {
						cnt+=1;
					}
					
				}
				// if the counter reads 2 then i was divisible by j only twice making it a prime number
				if (cnt == 2) {
					System.out.println(i);
				}
				
			}
		}
		
}

