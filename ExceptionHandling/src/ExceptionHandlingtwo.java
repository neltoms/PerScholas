
public class ExceptionHandlingtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This statement will be executed"); 
		 
        try
        {
            Integer I = new Integer("abc");  //This statement throws NumberFormatException
        }
        catch (Exception e)
        {
            System.out.println("Wrong input: Exception caught");
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
