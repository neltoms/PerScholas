package Encapon;

public class person {
	private String name;
	private int id;
	private int age;
	private String collage ;
	

	public void setcollage(String collage)
	{
		this.collage = collage;
	}
	
	public String getcollage()
	{
		return collage;
	}
	

	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String getName()
	{
		String nm = this.name + " Ahmed" ;
		return nm;
	}

	public void setAge(int a)
	{
		this.age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int doubleAge()
	{
		int newAge = age + age;
		return newAge;
	}
	
	public int after10yearYourAge()
	{
		int afteryear = age + 10;
		return afteryear;
	}
	

}
