package com.food.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.UserDao;
import com.food.daoImpl.UserDaoImpl;
import com.food.model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	UserDao userdao=new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String password=req.getParameter("password");
    	String confPass=req.getParameter("confirmpassword");
    	String emailid=req.getParameter("email");
    	
    	User u=userdao.getUser(emailid);
    	String passwords=u.getPassword();
    	String name=u.getUsername();
    	int userId=u.getUserid();
    	if(confPass.equals(passwords))
    	{
    		req.setAttribute("name",name);
    		req.setAttribute("userId",userId);
    		RequestDispatcher rd=req.getRequestDispatcher("userHome.jsp");
    		rd.include(req, resp);
    	}
    	else
    	{
    		PrintWriter out=resp.getWriter();
    		out.println("password does not match");
    	}
    }
}
