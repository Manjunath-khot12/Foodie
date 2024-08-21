package com.food.model;

public class Restaurant {
	private int restaurantid;
	private String resName;
	private String cuisineType;
	private int deliveryTime;
	private String address;
	private boolean isActive;

	public Restaurant() {
	}

	public Restaurant(String resName, String cuisineType, int deliveryTime, String address,
			boolean isActive) {
		super();
		this.resName = resName;
		this.cuisineType = cuisineType;
		this.deliveryTime = deliveryTime;
		this.address = address;
		this.isActive = isActive;
	}

	public Restaurant(int restaurantid, String resName, String cuisineType, int deliveryTime, String address,
			boolean isActive) {
		super();
		this.restaurantid = restaurantid;
		this.resName = resName;
		this.cuisineType = cuisineType;
		this.deliveryTime = deliveryTime;
		this.address = address;
		this.isActive = isActive;
	}

	public int getRestaurantid() {
		return restaurantid;
	}

	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public int getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
