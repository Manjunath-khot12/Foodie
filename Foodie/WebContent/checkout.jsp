<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.food.model.ViewCart" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

h1#name {
    text-align: center;
    color: #333;
    margin-top: 20px;
}

.checkout-container {
    width: 60%;
    margin: 20px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
}

h2#food-details {
    text-align: center;
    color: #333;
    margin-bottom: 20px;
    font-size: 24px;
    border-bottom: 2px solid #ccc;
    padding-bottom: 10px;
}

.checkout-menu {
    border: 1px solid #ccc;
    padding: 15px;
    margin-bottom: 15px;
    border-radius: 5px;
    background-color: #f9f9f9;
}

.checkout-menu p {
    margin: 10px 0;
    font-size: 16px;
    color: #555;
}

.checkout-menu span {
    font-weight: bold;
    color: #333;
}

.payment-method {
    margin-top: 20px;
    margin-bottom: 30px;
    font-size: 16px;
    color: #555;
    padding: 20px;
    background-color: #f9f9f9;
    border-radius: 5px;
}

.payment-method select,
.payment-method textarea {
    width: 100%;
    padding: 10px;
    margin-top: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 14px;
}

h2#bill-details {
    text-align: center;
    color: #333;
    margin-bottom: 20px;
    font-size: 24px;
    border-bottom: 2px solid #ccc;
    padding-bottom: 10px;
}

.bill-details p {
    margin: 10px 0;
    font-size: 16px;
    color: #555;
}

.bill-details span {
    font-weight: bold;
    color: #333;
}

.total-price {
    font-size: 18px;
    color: #d9534f;
    margin-top: 20px;
    text-align: right;
    border-top: 2px solid #ccc;
    padding-top: 10px;
}

.checkout-button {
    display: block;
    width: 100%;
    padding: 15px;
    background-color: #5cb85c;
    color: white;
    text-align: center;
    font-size: 18px;
    border-radius: 5px;
    text-decoration: none;
    margin-top: 20px;
    transition: background-color 0.3s ease;
}

.checkout-button:hover {
    background-color: #4cae4c;
}
</style>
</head>
<body>
<%
 String name = (String)request.getAttribute("name");
%>
<h1 id="name">Welcome <%=name %></h1>
<div class="checkout-container">
    <h2 id="food-details">Food Details</h2>
<%
  List<ViewCart> viewcart = (List<ViewCart>) request.getAttribute("viewcartList");
  if (viewcart != null && !viewcart.isEmpty()) {
      double totalPrice = 0;
      for (ViewCart vc : viewcart) {
          double itemTotal = vc.getPrice() * vc.getQuantity();
          totalPrice += itemTotal;
          String resname=vc.getResturantName();
%>
          <div class="checkout-menu">
            <p>Item Name: <span><%=vc.getItemName() %></span></p>
            <p>Price: <span>$<%=vc.getPrice() %></span></p>
            <p>Quantity: <span><%=vc.getQuantity() %></span></p>
            <p>Total Price: <span>$<%=itemTotal %></span></p>
          </div>
<%
      }
%>
      <div class="payment-method">
        <p><strong>Payment Method:</strong></p>
        <select name="paymentMethod">
          <option value="">Select Payment Method</option>
          <option value="UPI">UPI</option>
          <option value="debitCard">Debit Card</option>
          <option value="creditCard">Credit Card</option>
          <option value="cashOnDelivery">Cash on Delivery</option>
        </select>
        <p><strong>Enter Address:</strong></p>
        <textarea rows="5" cols="30" placeholder="Enter your delivery address"></textarea>
      </div>

      <h2 id="bill-details">Bill Details</h2>
      <div class="bill-details">
        <p>Item Total: $<span><%=totalPrice %></span></p>
        <p>Packing Charge: $<span>20</span></p>
        <p>GST: $<span>18</span></p>
        <p>Delivery Charge: $<span>50</span></p>
        <%
           double amount = totalPrice + 20 + 18 + 50;
        %>
        <hr>
        <p><strong>Amount to Pay: $<span><%=amount %></span></strong></p>
      </div>
      
      <a href="order?username=<%=name%>" class="checkout-button">Order</a>
<%
  } else {
%>
      <p>Your cart is empty.</p>
<%
  }
%>
</div>
</body>
</html>
