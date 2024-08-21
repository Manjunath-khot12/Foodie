package com.food.model;

public class OrderTable {
    private int orderId;
    private float totalAmount;
    private String orderStatus;
    private String paymentMethod;
    
    public OrderTable()
    {
    	
    }
	public OrderTable(int orderId,  float totalAmount, String orderStatus,
			String paymentMethod) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.paymentMethod = paymentMethod;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
    
    
}
