package com.food.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.MenuDao;
import com.food.daoImpl.MenuDaoImpl;
import com.food.model.Menu;

@SuppressWarnings("serial")
@WebServlet("/menucontroller")
public class MenuController extends HttpServlet
{
	MenuDao menudao=new MenuDaoImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("restId"));
		String itemName=req.getParameter("itemName");
		String itemDesc=req.getParameter("itemdesc");
		float itemPrice=Float.parseFloat(req.getParameter("itemPrice"));
		boolean isAvailable=Boolean.parseBoolean(req.getParameter("isAviable"));
		Menu m=new Menu(id,itemName,itemDesc,itemPrice,isAvailable);
		menudao.addMenu(m);
		resp.sendRedirect("RestaurantCreationConformation.jsp");
		
	}

}
