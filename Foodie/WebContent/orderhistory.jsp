<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.food.model.ViewCart" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order History</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

.container {
    width: 80%;
    max-width: 900px;
    margin: 20px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
    border-radius: 8px;
}

h1 {
    text-align: center;
    color: #333;
    margin-bottom: 20px;
}

.ordermenu {
    border: 2px solid #ddd;
    border-radius: 8px;
    padding: 15px;
    margin-bottom: 20px;
    background-color: #f9f9f9;
}

.ordermenu p {
    font-size: 16px;
    margin: 10px 0;
    color: #555;
}

.ordermenu span {
    font-weight: bold;
    color: #333;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
}

table, th, td {
    border: 1px solid #ddd;
}

th, td {
    padding: 10px;
    text-align: center;
}

th {
    background-color: #5cb85c;
    color: white;
}

tr:nth-child(even) {
    background-color: #f2f2f2;
}

hr {
    border: 0;
    height: 1px;
    background: #ddd;
    margin: 20px 0;
}
</style>
</head>
<body>
<div class="container">
    <h1>Order History</h1>
    <hr>
<%
  List<ViewCart> vc = (List<ViewCart>) request.getAttribute("vc");
  if (vc != null && !vc.isEmpty()) {
      for (ViewCart v : vc) {
%>
        <div class="ordermenu">
            <p>Restaurant Name: <span><%= v.getResturantName() %></span></p>
            <p>Order ID: <span><%= v.getCartId() %></span></p>
            <p>Order Date: <span><%= v.getDate() %></span></p>
            <hr>
            <table>
                <thead>
                    <tr>
                        <th>Item Name</th>
                        <th>Quantity</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><%= v.getItemName() %></td>
                        <td><%= v.getQuantity() %></td>
                        <td>$<%= v.getPrice() %></td>
                    </tr>
                </tbody>
            </table>
        </div>
<%
      }
  } else {
%>
      <p>No orders found.</p>
<%
  }
%>
</div>
</body>
</html>
