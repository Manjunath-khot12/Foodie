package com.food.model;


public class Menu {
    private int menuId;
    private String itemName;
    private String itemDescription;
    private float price;
    private boolean isAvailabe;
    private int restId;
    
    public Menu() {
    	
    }
    public Menu(int restId,String itemName, String itemDescription, float price,
			boolean isAvailabe) {
		super();
		this.restId=restId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.price = price;
		this.isAvailabe = isAvailabe;
	}
	public Menu(int menuId,  int restId,String itemName, String itemDescription, float price,
			boolean isAvailabe) {
		super();
		this.restId=restId;
		this.menuId = menuId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.price = price;
		this.isAvailabe = isAvailabe;
	}
	public Menu(String itemName, String itemDescription, float price,
			boolean isAvailabe) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.price = price;
		this.isAvailabe = isAvailabe;
	}
	
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailabe() {
		return isAvailabe;
	}
	public void setAvailabe(boolean isAvailabe) {
		this.isAvailabe = isAvailabe;
	}
	
	
    
    
}
