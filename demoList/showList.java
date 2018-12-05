package demoList;

import java.util.ArrayList;

public class showList {
	
	public ArrayList<Book> booklist()
	{
		ArrayList<Book> obj = new ArrayList<Book>();
		
		Book b = new Book(2, "Death note", "Muhammad", "Funny");
		Book b2 = new Book(3, "Attact on Titan", "haseeb", "Animated");
		Book b3 = new Book (4, "This is US", "ELi", "TV series");
		
		obj.add(b);
		obj.add(b2);
		obj.add(b3);
		
		return obj;
	}
}
