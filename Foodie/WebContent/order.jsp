<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Confirmation</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
    color: #333;
    text-align: center;
}

.container {
    width: 80%;
    max-width: 800px;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
    border-radius: 8px;
}

h1 {
    color: #5cb85c;
    margin-bottom: 20px;
    font-size: 36px;
}

p {
    font-size: 18px;
    margin: 10px 0;
}

a {
    display: inline-block;
    margin-top: 20px;
    padding: 12px 25px;
    font-size: 18px;
    color: #fff;
    background-color: #5cb85c;
    text-decoration: none;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

a:hover {
    background-color: #4cae4c;
}
</style>
</head>
<body>
<div class="container">
    <h1>Order Confirmed</h1>
    <p>Thank you, <%= (String) request.getAttribute("name") %>! Your order has been successfully placed.</p>
    <a href="allrestaurants1?userName=<%= (String) request.getAttribute("name") %>">Back to Home</a>
</div>
</body>
</html>
