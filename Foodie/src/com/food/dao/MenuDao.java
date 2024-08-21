package com.food.dao;

import java.util.List;

import com.food.model.Menu;

public interface MenuDao {
     void addMenu(Menu menu);
     Menu getMenu(int menuId);
     List<Menu> getAllMenuByRestaurant(int restaurantId);
     void updateMenu(Menu menu);
     void deleteMenu(int menuId);
}
