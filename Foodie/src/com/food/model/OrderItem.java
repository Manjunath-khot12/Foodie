package com.food.model;

public class OrderItem {
    private int orderItemId;
    private int quntity;
    private float itemTotal;
    
    public OrderItem()
    {
    	
    }
	public OrderItem(int orderItemId, int quntity, float itemTotal) {
		super();
		this.orderItemId = orderItemId;
		this.quntity = quntity;
		this.itemTotal = itemTotal;
	}
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public float getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(float itemTotal) {
		this.itemTotal = itemTotal;
	}
    
    
}
