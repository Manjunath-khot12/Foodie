package com.food.dao;



import java.util.List;

import com.food.model.ViewCart;

public interface ViewCartDao {
	void addCart(ViewCart viewcart);
    List<ViewCart> getAllViewCart(String username);
    void deleteCart(int id);
    void updateCart(int id,int quantity);
}
