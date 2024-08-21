package com.food.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.food.dao.MenuDao;
import com.food.model.Menu;

public class MenuDaoImpl implements MenuDao {
	 Connection con;
     PreparedStatement pst;
     ResultSet res;
     public  MenuDaoImpl()
     {
    	 try {
 			Class.forName("com.mysql.cj.jdbc.Driver");
 			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","root");
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
     }
	@Override
	public void addMenu(Menu menu) {
		String sql="insert into menu(res_id,item_name,item_description,price,IsAvaiable) values (?,?,?,?,?)";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, menu.getRestId());
			pst.setString(2,menu.getItemName());
			pst.setString(3,menu.getItemDescription());
			pst.setFloat(4,menu.getPrice());
			pst.setBoolean(5,menu.isAvailabe());
			int n=pst.executeUpdate();
			if(n==1)
			{
				System.out.println("menu inserted");
			}
			else
			{
				System.out.println("not inserted menu");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Menu getMenu(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getAllMenuByRestaurant(int restaurantId) {
		String sql="select * from menu where res_id=?";
		ArrayList<Menu> al=new ArrayList<Menu>();
		try
		{
			pst=con.prepareStatement(sql);
			pst.setInt(1,restaurantId);
			res=pst.executeQuery();
			while(res.next())
			{
				String itemName=res.getString("item_name");
				String desc=res.getString("item_description");
				int price=res.getInt("price");
				boolean isAvaiable=res.getBoolean("isAvaiable");
				Menu m=new Menu(itemName,desc,price,isAvaiable);
				al.add(m);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public void updateMenu(Menu menu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMenu(int menuId) {
		// TODO Auto-generated method stub

	}

}
