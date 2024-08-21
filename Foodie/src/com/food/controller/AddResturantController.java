package com.food.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.food.dao.RestaurantDao;
import com.food.daoImpl.ResturantDaoImpl;
import com.food.model.Restaurant;

@WebServlet("/addResturants")
public class AddResturantController extends HttpServlet
{
	RestaurantDao restdao=new ResturantDaoImpl();
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     String resturantName=req.getParameter("resturantName");
	     String  cuisineType=req.getParameter("cuisineType");
	     int deliveryTime=Integer.parseInt(req.getParameter("delivertime"));
	     String Address=req.getParameter("resturantAddress");
	     boolean isActive=Boolean.parseBoolean(req.getParameter("active"));
	     Restaurant res=new Restaurant(resturantName,cuisineType,deliveryTime,Address,isActive);
	     restdao.addRestaurant(res);
	     req.setAttribute(resturantName,"resturantName");
	     RequestDispatcher rd=req.getRequestDispatcher("RestaurantCreationConformation.jsp");
	     rd.include(req, resp);
	     
	}

}
