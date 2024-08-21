package com.food.dao;

import java.util.List;

import com.food.model.OrderItem;

public interface OrderItemDao {
    void addOrderItem(OrderItem orderItem);
    OrderItem getOrderItem(int orderItemId);
    void updateOrderItem(OrderItem orderItem);
    void deleteOrderItem(int orderItemId);
    List<OrderItem> getOrderItemByOrder(int orderId);
}
