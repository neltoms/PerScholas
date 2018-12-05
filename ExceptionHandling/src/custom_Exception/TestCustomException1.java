package custom_Exception;

public class TestCustomException1 {

	
	public void validates(int age) throws InvalidAgeException
	{  
		     if(age<18)  
		     {
		      throw new InvalidAgeException("not valid");  
		     }
		      else
		      {
		    	  System.out.println("welcome to vote");  
		      }
	 }  
}
