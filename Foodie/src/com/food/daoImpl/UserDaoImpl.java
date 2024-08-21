package com.food.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.food.dao.UserDao;
import com.food.model.User;

public class UserDaoImpl implements UserDao {
     Connection con;
     PreparedStatement pst;
     ResultSet res;
	public UserDaoImpl()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void addUser(User user) {
		String sql="insert into user(username,password,email,address,role) values (?,?,?,?,?)";
	    try 
	    {
			pst=con.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3,user.getEmail());
			pst.setString(4,user.getAddress());
			pst.setString(5, user.getRole());
			int n=pst.executeUpdate();
			if(n==1)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("not");
			}
		} 
	    catch (Exception e)
	    {
			e.printStackTrace();
		}

	}

	@Override
	public User getUser(String emailid) {
		String sql="select * from user where email=?";
		User u = null;
		try 
		{
			pst=con.prepareStatement(sql);
			pst.setString(1, emailid);
			res=pst.executeQuery();
			while(res.next())
			{
				int id=res.getInt("userid");
				String name=res.getString("username");
				String password=res.getString("password");
				String email=res.getString("email");
				String address=res.getString("address");
				String role=res.getString("role");
				Date date=res.getDate("created");
				u=new User(id,name,password,email,address,role,date);
				
			}
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
		return u;
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int userid) {
		// TODO Auto-generated method stub

	}

}
