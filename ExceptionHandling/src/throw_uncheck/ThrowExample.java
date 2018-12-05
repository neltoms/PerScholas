package throw_uncheck;

public class ThrowExample {
 public static void checkEligibilty(int stuage, int stuweight) throws Exception
 { 
	      if(stuage<12 && stuweight<40) {
	         throw new Exception("Student is not eligible for registration"); 
	      }
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   } 
}
