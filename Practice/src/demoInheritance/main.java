package demoInheritance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		 String file = ("sample.txt");
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        
	        	String line = null;
	        	while ((line = br.readLine()) != null) {
	        		System.out.println(line);
	        	}
		
//		manager m = new manager(1, "Jimmy", "25 street", 2569874, 5);
//		m.Vacation();
//		m.managervacation();
//		m.calculatesalary();
//		
		
	
		
	}

}
