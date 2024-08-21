package com.food.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.ViewCartDao;
import com.food.daoImpl.ViewCartDaoImpl;
import com.food.model.ViewCart;

@SuppressWarnings("serial")
@WebServlet("/Showcart")
public class ShowCartController extends HttpServlet {
	ViewCartDao vdao=new ViewCartDaoImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("name");
       List<ViewCart> vc=vdao.getAllViewCart(name);
       req.setAttribute("listofcart",vc);
       req.setAttribute("name",name);
       RequestDispatcher rd=req.getRequestDispatcher("showcarts.jsp");
       rd.include(req, resp);
       
       
	}
}
