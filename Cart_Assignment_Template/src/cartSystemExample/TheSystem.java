package cartSystemExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem extends Item {
    private HashMap<String, Item> itemCollection;
    Scanner sc = new Scanner(System.in);
    
    public TheSystem() throws IOException {
        this.itemCollection = new HashMap<String, Item>();
        
        String file = ("sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        if(getClass().getSimpleName().equals("AppSystem")) {
        	String line = null;
        	while ((line = br.readLine()) != null) {
        		System.out.println(line);
//        		if (line.split(" ").length > 1) {
//        			
//        		} continue;
//        		Item item = line;
//        		itemCollection.put(line, );
        	} 
        } else {
        	
        	return;
        }
    }
    
    
    public HashMap<String, Item> getItemCollection() {
    	HashMap<String, Item> newMap = new HashMap<String, Item>();
    	newMap.putAll(this.itemCollection);
    	return newMap; 
    }
    
    public void setItemCollection(HashMap<String, Item> copy){
      this.itemCollection = copy;
    }
    
    public Boolean add(Item item) {
      if((item.getAvailableQuantity() >= 1) && !(getClass().getSimpleName().equals("TheSystem"))) {
    	  
    	  // to add to the cart
    	  this.itemCollection.put(item.getItemName(), item);
    	  item.IncrementQuantity();
    	  this.remove(item.getItemName());
    	  item.DecAvailableQuantity();
    	  return true;
    	  
    	  // to add to the collection
      } else if(getClass().getSimpleName().equals("TheSystem")){
    	  this.itemCollection.put(item.getItemName(), item);
    	  return true; 
    	  
      } else {
    	  
    	  // don't add at all
    	  return false;
      }
      
    }
    
    public Item remove(String itemName) {
    	if(itemCollection.containsKey(itemName)){
    		Item rem = itemCollection.remove(itemName);
    		return rem;
    	} else {
    		
    		return null;
    	}
    }
    
    public void display() {
    	
    	for(Item obj : this.getItemCollection().values()) {
    		System.out.format("%d %s with %s at %.2f each are available in the system%n%n", obj.getAvailableQuantity(), obj.getItemName(), obj.getItemDesc(),
    				obj.getItemPrice());
    	}
     
    }
    
    public Boolean checkAvailability(Item item, Integer current) {
      if((item.getQuantity() + current) > item.getAvailableQuantity()) {
    	  System.out.println("System is unable to add " + current + " " + item + "s." +
      "System can only add " + item.getAvailableQuantity() + " " + item.getItemName());
  
    	  return false;
    	  
      } else {
    	  
    	  return true;
      }
		
    }
}
