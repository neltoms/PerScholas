package throw_uncheck;

public class main {
//	Lets say we have a requirement where we we need to only register 
//	the students when their age is less than 12 and weight is less than 40,
//	if any of the condition is not met then the user should get an ArithmeticException
//	with the warning message “Student is not eligible for registration”.
//	We have implemented the logic by placing the code in the method that checks student
//	eligibility if the entered student age and weight doesn’t met the criteria then
//	we throw the exception using throw keyword.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("Welcome to the Registration process!!");
		     ThrowExample t = new ThrowExample(); 
		     t.checkEligibilty(10, 42); 
		     System.out.println("Have a nice day.."); 
	}

}
// In the above example we have throw an unchecked exception