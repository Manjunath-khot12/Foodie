package com.food.dao;

import java.util.List;

import com.food.model.User;

public interface UserDao {
      void addUser(User user);
      User getUser(String email);
      void updateUser(User user);
      List<User> getAllUser();
      void deleteUser(int userid);    
}
