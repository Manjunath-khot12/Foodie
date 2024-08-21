package com.food.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.food.dao.RestaurantDao;
import com.food.model.Restaurant;

public class ResturantDaoImpl implements RestaurantDao {
	 Connection con;
     PreparedStatement pst;
     ResultSet res;
	public ResturantDaoImpl()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addRestaurant(Restaurant restaurant) {
		String sql="insert into restaurant(name,cuisineType,deliverytime,address,isactive) values (?,?,?,?,?)";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, restaurant.getResName());
			pst.setString(2,restaurant.getCuisineType());
			pst.setInt(3, restaurant.getDeliveryTime());
			pst.setString(4, restaurant.getAddress());
			pst.setBoolean(5, restaurant.isActive());
			int n=pst.executeUpdate();
			if(n==1)
			{
				System.out.println("restaurant inserted");
			}
			else
			{
				System.out.println("not inserted restaurants");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Restaurant getRestaurant(String restName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
	 String sql="select * from restaurant";
	 List<Restaurant> ls=new ArrayList<Restaurant>();
	 try {
		pst=con.prepareStatement(sql);
		res=pst.executeQuery();
		while(res.next())
		{
			int id=res.getInt("res_id");
			String name=res.getString("name");
			String cuisineType=res.getString("CuisineType");
			int deliveryTime=res.getInt("deliveryTime");
			String address=res.getString("address");
			boolean ISActive=res.getBoolean("ISActive");
			Restaurant res=new Restaurant(id,name,cuisineType,deliveryTime,address,ISActive);
			ls.add(res);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ls;
	  
	 
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRestaurant(int restaurantid) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRestaurantId(String resName) {
		String sql="select res_id from restaurant where name=?";
		int id=0;
		try
		{
			pst=con.prepareStatement(sql);
			pst.setString(1, resName);
			res=pst.executeQuery();
			while(res.next())
			{
			id=res.getInt("res_id");
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return id;
		
	}

}
