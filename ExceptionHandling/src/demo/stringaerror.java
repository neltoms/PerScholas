package demo;

public class stringaerror {

	public void mymethod2()
	{
		try
		{
			System.out.println("Hello Mr");
			Integer age = new Integer(56);
			
			System.out.println("How are you doing" + age);
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception caught");
		}
		
	}
	
	public void lenghtofString()
	{
		try
		{
			String s = "hello Haseeb";
			int i = s.length();
			
			System.out.println("lenght of String is "+ i);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("String is Empty");
		}
	}
}
