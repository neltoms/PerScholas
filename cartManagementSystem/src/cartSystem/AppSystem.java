package cartSystem;

import java.io.IOException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
	
	HashMap<String, Item> map;
    public AppSystem() throws IOException {
    	super();
    	this.map = new HashMap<String, Item>();
    }

   
	public Boolean add(Item item) {
		if((getItemCollection().containsValue(item)) && (getClass().getSimpleName().equals("AppSystem"))) {
	    	System.out.println(item.getItemName() + " is already in the " + this.getClass().getSimpleName()); 
			return false;
			
	      } else {
	    	  map.put(item.getItemName(), item);
	    	  super.setItemCollection(map);
	    	  return true;
	      }
	      
    }
	public HashMap<String, Item> getItemCollection() {
		return super.getItemCollection();
		
	}
	
}
	