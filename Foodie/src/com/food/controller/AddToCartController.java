package com.food.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.ViewCartDao;
import com.food.daoImpl.ViewCartDaoImpl;
import com.food.model.ViewCart;

@WebServlet("/addtocart")
@SuppressWarnings("serial")
public class AddToCartController extends HttpServlet {
    ViewCartDao viewDao = new ViewCartDaoImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String itemName = req.getParameter("itemName");
        double price = Double.parseDouble(req.getParameter("price"));
        String username = req.getParameter("userName");
        String resName = req.getParameter("resName");
        ViewCart vc = new ViewCart(itemName, price, resName, username);
        viewDao.addCart(vc);  
        resp.sendRedirect("AddMoreItem.html");
        

    }
}
