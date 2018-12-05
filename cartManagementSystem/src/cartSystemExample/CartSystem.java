package cartSystemExample;

import java.io.IOException;
import java.util.HashMap;


public class CartSystem extends TheSystem {
	
	
    public CartSystem() throws IOException {
    	super();
    }
	
	public Item remove(String item_name) {
		if(super.getItemCollection().containsKey(item_name)){
    		Item rem = getItemCollection().remove(item_name);
    		return rem;
    	} else {
    		
    		return null;
    	}
	}
	
    public void display() {
    	for(Item obj : getItemCollection().values()) {
    		Double sum = (obj.getQuantity())*(obj.getItemPrice());
            System.out.format("The subtotal for %s with %s is %.2f.%nThe subtotal with tax is: %.2f.%n"
            		+ "There is(are) %d %s left in the system ", obj.getItemName(), obj.getItemDesc(), obj.getItemPrice(), sum*1.05,
            		obj.getItemName(), obj.getAvailableQuantity());
    	}
        
        
    }
}
