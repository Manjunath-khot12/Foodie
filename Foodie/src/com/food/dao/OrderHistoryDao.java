package com.food.dao;

import java.util.List;

import com.food.model.OrderHistory;

public interface OrderHistoryDao {
	 void addOrderHistory(OrderHistory orderHistory);
     OrderHistory getOrderHistory(int orderHistoryId);
     void updateOrderHistory(OrderHistory orderHistory);
     void deleteOrderHistory(int orderHistoryId);
     List<OrderHistory> getOrderHistoryByUser(int userid);
}
