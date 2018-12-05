package demoList;

public class Book {

	protected int Booknumber;
	protected String name;
	protected String author;
	protected String category;
	
	public Book(int bknum,String nm, String auth, String cat)
	{
		this.Booknumber = bknum;
		this.name = nm;
		this.author = auth;
		this.category = cat;
	}
	
	
	public int getBooknumber() {
		return this.Booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.Booknumber = booknumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	
}
