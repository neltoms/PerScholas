
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("line number 6 statement will be executed"); 
		Integer I = new Integer("g");  //This statement throws NumberFormatException
        System.out.println("line number 9 statement will not be executed");
        
        //In the above example, Line 7 throws NumberFormatException. 
        //This causes the abrupt termination of the program i.e remaining statement 
        //(Line 8) will not be executed. To make it run normally, enclose the
        //statement which is throwing an exception in try-catch blocks.
	}

}
