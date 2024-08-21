package com.food.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.food.dao.MenuDao;
import com.food.daoImpl.MenuDaoImpl;
import com.food.model.Menu;

@WebServlet("/showMenu")
@SuppressWarnings("serial")
public class ShowMenuController extends HttpServlet {
	MenuDao menudao=new MenuDaoImpl();
	
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        int restaurantId = Integer.parseInt(req.getParameter("resturantId"));
        String resName=req.getParameter("restName");
        List<Menu> menu=menudao.getAllMenuByRestaurant(restaurantId);
        req.setAttribute("menu",menu);
        req.setAttribute("resName",resName);
        RequestDispatcher rd=req.getRequestDispatcher("showMenu.jsp");
        rd.include(req, resp);
         
         
            
          
    }
}
