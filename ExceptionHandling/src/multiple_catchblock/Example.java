package multiple_catchblock;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
	         int a[]=new int[7];
	        
	         Integer n = new Integer("d");
	         a[8]=n/1;	         
	        		 
	           }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
		 catch(NumberFormatException e){
		        System.out.println("Warning: Wrong input(number formate)");
		     }
	     catch(Exception e){
	        System.out.println("Warning: Some Other exception");
	     }
	   System.out.println("Out of try-catch block...");
	}

}
