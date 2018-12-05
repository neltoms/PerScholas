package throw_userdefine;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException("This  is My error Message");
		
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	}
//	Explanation:
//		You can see that while throwing custom exception I gave a string in
//		parenthesis ( throw new MyException("This is My error Message");).
//		That’s why we have a parameterized constructor (with a String parameter)
//		in my custom exception class.
}
