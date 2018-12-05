package demo;

public class myClass {
	public void mymethod()
	{
		try
		{
			System.out.println("hello");
			int i = 1000/4;
			System.out.println("Done");
		}
		catch( Exception e)
		{
			System.out.println("Error: Numerator must be greater then zero");
		}
	}
}
