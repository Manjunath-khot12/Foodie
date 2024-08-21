<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.food.model.Menu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Items</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }

    h1 {
        text-align: center;
        margin-top: 20px;
        color: #333;
    }

    .menu-main {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-around;
        padding: 20px;
        max-width: 1200px;
        margin: 0 auto;
    }

    .menu-item-card {
        width: 30%;
        background-color: white;
        border: 1px solid #ddd;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        margin-bottom: 20px;
        overflow: hidden;
        transition: transform 0.2s;
        display: flex;
        flex-direction: column;
        justify-content: space-between;
    }

    .menu-item-card:hover {
        transform: translateY(-10px);
    }

    .menu-item-card img {
        width: 100%;
        height: 200px;
        object-fit: cover;
        border-bottom: 1px solid #ddd;
    }

    .menu-item-card span {
        font-weight: bold;
    }

    .menu-item-card p {
        padding: 10px;
        color: #555;
    }

    .menu-item-card .price {
        color: #e67e22;
        font-size: 1.2em;
        margin-top: 10px;
    }

    .menu-item-card .availability {
        color: #27ae60;
        font-weight: bold;
        margin-top: 5px;
    }

    .add-to-cart-container {
        display: flex;
        justify-content: center;
        padding: 15px 0;
    }

    .add-to-cart {
        padding: 10px 20px;
        background-color: #3498db;
        color: white;
        text-align: center;
        text-decoration: none;
        border-radius: 5px;
        font-size: 1em;
        transition: background-color 0.3s;
    }

    .add-to-cart:hover {
        background-color: #2980b9;
    }

    .back-link {
        display: block;
        text-align: center;
        margin: 20px;
        color: #3498db;
        text-decoration: none;
        font-size: 1.1em;
    }

    .back-link:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
<%

  String name = (String) request.getAttribute("resName");
  String username = (String) request.getParameter("name");


%>
<h1>Restaurant Name: <%= name %></h1>
<a class="back-link" href="index.jsp">Back to Home</a>
<a class="back-link" href="allrestaurants1?userName=<%=username%>">Back</a>
<div class="menu-main">
  <%
   List<Menu> menu = (List<Menu>) request.getAttribute("menu");
   for(Menu m : menu) {
  %>
  <div class="menu-item-card">
    <img src="restaurnats.jpg" alt="<%= m.getItemName() %>">
    <p>Item Name: <span><%= m.getItemName() %></span></p>
    <p>Description: <span><%= m.getItemDescription() %></span></p>
    <p class="price">Price: <%= m.getPrice() %></p>
    <p class="availability">Available: <%= m.isAvailabe() ? "Yes" : "No" %></p>
    <div class="add-to-cart-container">
        <a class="add-to-cart" href="addtocart?itemName=<%= m.getItemName() %>&price=<%= m.getPrice() %>&resName=<%=request.getAttribute("resName")%>&userName=<%= username %>">Add to Cart</a>
    </div>
  </div>
  <%
   }
  %>
 
  
</div>
</body>
</html>
