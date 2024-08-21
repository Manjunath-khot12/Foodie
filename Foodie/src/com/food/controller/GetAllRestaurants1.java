package com.food.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.RestaurantDao;
import com.food.daoImpl.ResturantDaoImpl;
import com.food.model.Restaurant;


@WebServlet("/allrestaurants1")
public class GetAllRestaurants1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RestaurantDao resdao=new ResturantDaoImpl();
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Restaurant> res=resdao.getAllRestaurant();
		String name=req.getParameter("userName");
		req.setAttribute("name",name);
		req.setAttribute("list", res);
		RequestDispatcher rd=req.getRequestDispatcher("userHome.jsp");
		rd.include(req, resp);
		
	}

}
