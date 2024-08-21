package com.food.model;

import java.sql.Date;

public class ViewCart {
	
	private int cartId;
	private String itemName;
	private double price;
	private int Quantity;
	private String resturantName;
	private String userName;
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ViewCart(int cartId, String itemName, double price, int quantity, String resturantName, String userName) {
		super();
		this.cartId = cartId;
		this.itemName = itemName;
		this.price = price;
		Quantity = quantity;
		this.resturantName = resturantName;
		this.userName = userName;
		
	}
	public ViewCart(String itemName, double price, String resturantName, String userName) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.resturantName = resturantName;
		this.userName = userName;
	}
	public ViewCart(int cartId,String itemName, double price, int quantity, String resturantName,Date date) {
		super();
		this.cartId = cartId;
		this.itemName = itemName;
		this.price = price;
		Quantity = quantity;
		this.resturantName = resturantName;
		this.date=date;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getResturantName() {
		return resturantName;
	}
	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
