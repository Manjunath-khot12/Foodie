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
@WebServlet("/updateQuantity")
public class UpdateCartController extends HttpServlet {
	ViewCartDao vdao=new ViewCartDaoImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            int quantity=Integer.parseInt(req.getParameter("quantity"));
            int id=Integer.parseInt(req.getParameter("cartid"));
            vdao.updateCart(id, quantity);
            
	}
}
