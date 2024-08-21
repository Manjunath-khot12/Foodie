package com.food.model;

public class OrderHistory {
     private int orderHistoryId;
     private float totaAmount;
     private String status;
     
     public OrderHistory()
     {
    	 
     }
	public OrderHistory(int orderHistoryId,  float totaAmount, String status) {
		super();
		this.orderHistoryId = orderHistoryId;
		this.totaAmount = totaAmount;
		this.status = status;
	}
	public int getOrderHistoryId() {
		return orderHistoryId;
	}
	public void setOrderHistoryId(int orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}
	public float getTotaAmount() {
		return totaAmount;
	}
	public void setTotaAmount(float totaAmount) {
		this.totaAmount = totaAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
     
     
}
