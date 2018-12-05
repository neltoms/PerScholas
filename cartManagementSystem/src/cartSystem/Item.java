package cartSystem;


public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Double quantity = 0.0;
    private Integer availableQuantity;
    
    
    public Item() {
    	this.availableQuantity = 0;
    	
    }

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public void IncrementQuantity() {
		this.quantity++;
	}
	
	public void DecrementQuantity() {
		this.quantity--;
	}
	
	public Double getQuantity() {
		return this.quantity;
	}

	

	public Integer getAvailableQuantity() {
		return this.availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	public void DecAvailableQuantity() {
		this.availableQuantity--;
	}
    
    
    
    
}
