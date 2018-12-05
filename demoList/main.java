package demoList;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	showList a = new showList();
	ArrayList<Book> myVariable = a.booklist();
	
	for(Book b : myVariable)
	{
		System.out.println("Author: " + b.author
		+ ", BookName: "	+ b.name 
		+ ", BookNumber: "+ b.Booknumber
		+ ", Book Category: " + b.category
		);
		
	}
	
	
	}

}
