package com.food.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.RestaurantDao;
import com.food.daoImpl.ResturantDaoImpl;

@WebServlet("/knowYourRestaurantID")
@SuppressWarnings("serial")
public class knowYourRestaurantID extends HttpServlet {
	RestaurantDao resdao=new ResturantDaoImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           String name=req.getParameter("resName");
           int id=resdao.getRestaurantId(name);
           req.setAttribute("id", id);
           RequestDispatcher rd=req.getRequestDispatcher("knowyourRestaurantId.jsp");
           rd.include(req, resp);
	}
}
