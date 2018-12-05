package custom_Exception;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{  
		    TestCustomException1 cs = new TestCustomException1();
			  cs.validates(22);
		      }
		  catch(Exception m)
		  {
			  System.out.println("Exception occured: "+m);
		}  
		  
		  
		      System.out.println("rest of the code...");  
		  }

	


	}


