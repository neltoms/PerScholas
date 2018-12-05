
public class ArithmaticException_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Below example shows how ArithmaticException can be handled using try-catch blocks.
		System.out.println("This statement will be executed"); 
		 
        try
        {
            int i = 1000/10;    //This statement throws ArithmaticException : / by zero
        System.out.println(i);
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught:Numerator must be greater then Zero");
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
