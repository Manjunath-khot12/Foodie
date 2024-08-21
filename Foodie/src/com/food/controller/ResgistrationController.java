package com.food.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.UserDao;
import com.food.daoImpl.UserDaoImpl;
import com.food.model.User;

@WebServlet("/Registration")
public class ResgistrationController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	UserDao userdao=new UserDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String username=req.getParameter("username");
    	String password=req.getParameter("password");
    	String emailId=req.getParameter("email");
        String address=req.getParameter("address");
        String role=req.getParameter("role");
        User u=new User(username,password,emailId,address,role);
        userdao.addUser(u);
        resp.sendRedirect("index.jsp");
    }
}
