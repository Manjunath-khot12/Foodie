package com.food.dao;

import java.util.List;

import com.food.model.Restaurant;

public interface RestaurantDao {
    void addRestaurant(Restaurant restaurant);
    Restaurant getRestaurant(String restName);
    List<Restaurant> getAllRestaurant();
    void updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int restaurantid);
    int getRestaurantId(String resName);
}
