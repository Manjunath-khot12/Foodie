package com.food.dao;

import java.util.List;

import com.food.model.OrderTable;

public interface OrderDao {
     void addOrder(OrderTable order);
     OrderTable getOrder(int orderId);
     void updateOrder(OrderTable order);
     void deleteOrder(int orderId);
     List<OrderTable> getAllorderByUserId(int userid);    
}
