
public class NullPointerException_hand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This statement will be executed"); 
		 
        String s = null;
 
        try
        {
            System.out.println(s.length());  //This statement throws NullPointerException
        }
        catch (Exception e)
        {
            System.out.println("String is null you can not find length Exception Caught");
        }
 
        System.out.println("Now, This statement will also be executed");
	}

}
