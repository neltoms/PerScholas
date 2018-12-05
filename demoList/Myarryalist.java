package demoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Myarryalist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> obj =  new ArrayList<String>();
	
	
	obj.add("Haseeb");
	obj.add("Honesto");
	obj.add("Peter");
	obj.add("Mohammad");
	obj.add("Mohammad");

	System.out.println();
	System.out.println(obj);
	//obj.set(4, "Laura");
	obj.remove(4);
	obj.remove("Mohammad");
	
	
	for(String showValue: obj)
	{
		System.out.println(showValue);
	}
	
	System.out.println("/////////////");
	
	Iterator<String> itr = obj.iterator();
	while(itr.hasNext())
	{
		//System.out.println(itr.next());
	}
		
	}

}
