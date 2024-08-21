<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.food.model.ViewCart" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f7f7f7;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    .cart-container {
        width: 80%;
        max-width: 1200px;
        margin-top: 50px;
        background-color: #fff;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        padding: 20px;
        border-radius: 10px;
    }
    h1 {
        text-align: center;
        font-size: 32px;
        margin-bottom: 20px;
        color: #333;
    }
    .cartsMenu {
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 15px 0;
        border-bottom: 1px solid #ddd;
    }
    .cartsMenu:last-child {
        border-bottom: none;
    }
    .cartsMenu p {
        margin: 0;
        font-size: 16px;
        flex: 1;
    }
    .cartsMenu span {
        font-weight: bold;
        color: #333;
    }
    .cartsMenu input[type="number"] {
        width: 60px;
        padding: 5px;
        font-size: 16px;
        margin-left: 10px;
    }
    .cartsMenu a {
        text-decoration: none;
        color: #007BFF;
        font-weight: bold;
        margin-left: 20px;
    }
    .cartsMenu a:hover {
        text-decoration: underline;
    }
    .links {
        text-align: center;
        margin-top: 20px;
    }
    .links a {
        text-decoration: none;
        background-color: #28a745;
        color: white;
        padding: 10px 20px;
        border-radius: 5px;
        font-weight: bold;
        margin: 10px;
        display: inline-block;
    }
    .links a:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
<div class="cart-container">
    <h1>ViewCart</h1> <!-- Added Heading -->
<%
  String name=(String)request.getAttribute("name");
  List<ViewCart> viewcart = (List<ViewCart>)request.getAttribute("listofcart");
  if (viewcart != null && !viewcart.isEmpty()) {
      for(ViewCart vc : viewcart) {
%>
    <div class="cartsMenu">
        <p>Item-Name: <span><%= vc.getItemName() %></span></p>
        <p>Price: <span>$<%= vc.getPrice() %></span></p>
        <p>Quantity: 
            <input type="number" name="quantity" value="<%= vc.getQuantity() %>">
        </p>
        <div>
            <a href="updateQuantity?cartid=<%=vc.getCartId() %>">Update</a>
            <a href="deletecart?id=<%=vc.getCartId() %>" style="color: #dc3545;">Remove</a>
        </div>
    </div>
<%
      }
  } else {
%>
    <p>Your cart is empty.</p>
<%
  }
%>
    <div class="links">
        <a href="allrestaurants1?userName=<%=name%>">Add More Items</a>
        <a href="checkout?username=<%=name%>">Proceed to Checkout</a>
    </div>
</div>
</body>
</html>
