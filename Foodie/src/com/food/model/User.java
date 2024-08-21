package com.food.model;

import java.sql.Date;

public class User {
	private int userid;
    private String username;
    private String password;
    private String email;
    private String address;
    private String role;
    private Date date;
    
    public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User() {}
	
	public User( String username, String password, String email, String address, String role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
	}
	
	public User( int usreid,String username, String password, String email, String address, String role,Date date) {
		super();
		this.userid=userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.role = role;
		this.date=date;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", role=" + role + ", date=" + date + "]";
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    
    
	

}
