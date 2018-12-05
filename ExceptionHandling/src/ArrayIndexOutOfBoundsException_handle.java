
public class ArrayIndexOutOfBoundsException_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("This statement will be executed"); 
		 
	        try
	        {
	            String s = args[1];    //This statement throws ArrayIndexOutOfBoundsException
	        }
	        catch (Exception e)
	        {
	            System.out.println("Exception Caught");
	        }
	 
	        System.out.println("Now, This statement will also be executed");
	}

}
