 package stream_practice_style2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class stream_practice_style2 {
	//public static Scanner sc;
	//static Set<Object> arr = new LinkedHashSet<Object>();
	//static Hashtable <String, String> table = new Hashtable <String, String>();
	//static String userInput;
	
		public static void main(String args) throws IOException  {
			File file = new File("hello.txt");
			// create file
			if(file.createNewFile())
			{
				System.out.println("file create");
			}
			
			FileWriter writ = new FileWriter(file);
			
			writ.write("hasebbbbbbbbbbbbbbb");
			writ.flush();
			writ.close();
			
		}
	
}


