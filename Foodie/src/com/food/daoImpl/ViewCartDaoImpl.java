package com.food.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.food.dao.ViewCartDao;
import com.food.model.ViewCart;

public class ViewCartDaoImpl implements ViewCartDao {
	 Connection con;
     PreparedStatement pst;
     ResultSet res;
	public ViewCartDaoImpl()
	{
		try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","root");
 		} catch (Exception e) {
 			e.printStackTrace();
 		}	
	}
	@Override
	public List<ViewCart> getAllViewCart(String username) {
		String sql="select * from viewcart where username=?";
		ArrayList<ViewCart> al=new ArrayList<ViewCart>();
		try 
		{
			pst=con.prepareStatement(sql);
			pst.setString(1, username);
			res=pst.executeQuery();
			while(res.next())
			{
				int id=res.getInt("cart_id");
				String itemName=res.getString("itemname");
				double price=res.getDouble("price");
				int quantity=res.getInt("quantity");
				String resturantName=res.getString("resturant_name");
				Date date=res.getDate("date");
				ViewCart vcs=new ViewCart(id,itemName, price, quantity,resturantName,date);
				al.add(vcs);
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public void deleteCart(int id) {
		String sql="delete from viewcart where cart_id=?";
		try
		{
			pst=con.prepareStatement(sql);
			pst.setInt(1,id);
			pst.executeUpdate();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		

	}

	@Override
	public void updateCart(int id,int quantity) {
		String sql="update viewcart set quantity=? where id=?";
		try 
		{
			pst=con.prepareStatement(sql);
			pst.setInt(1, quantity);
			pst.setInt(2, id);
			pst.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

	@Override
	public void addCart(ViewCart viewcart) {
	   String sql="insert into viewcart(itemName,price,resturant_name,userName) values (?,?,?,?)";
	   try
	   {
		pst=con.prepareStatement(sql);
		pst.setString(1,viewcart.getItemName());
		pst.setDouble(2,viewcart.getPrice());
		pst.setString(3, viewcart.getResturantName());
		pst.setString(4, viewcart.getUserName());
		pst.executeUpdate();
	   }
	   catch (SQLException e)
	   {
		e.printStackTrace();
   	   }
		
	}

}
