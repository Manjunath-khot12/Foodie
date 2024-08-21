package com.food.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.ViewCartDao;
import com.food.daoImpl.ViewCartDaoImpl;

@SuppressWarnings("serial")
@WebServlet("/deletecart")
public class DeleteCartController extends HttpServlet {
	ViewCartDao vcdao=new ViewCartDaoImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          int id=Integer.parseInt(req.getParameter("id"));
          vcdao.deleteCart(id);
          resp.sendRedirect("cartdeleted.html");
          
	}
}
