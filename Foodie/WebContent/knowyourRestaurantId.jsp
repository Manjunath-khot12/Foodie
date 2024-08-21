<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Restaurant ID</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    position: relative;
  }

  .result-container {
    background-color: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
    text-align: center;
  }

  .result-container h1 {
    font-size: 1.5em;
    color: #333;
  }

  .result-container h1 span {
    color: #007bff;
  }

  .back-home {
    position: absolute;
    top: 20px;
    right: 20px;
    display: flex;
    align-items: center;
    text-decoration: none;
    color: #007bff;
    font-size: 1em;
    font-weight: bold;
  }

  .back-home i {
    margin-right: 5px;
    font-size: 1.2em;
  }

  .back-home:hover {
    color: #0056b3;
  }
</style>
</head>
<body>
  <div class="result-container">
    <%
      int id = (int)request.getAttribute("id");
    %>
    <h1>Your Restaurant ID is: <span><%= id %></span></h1>
  </div>

  <a href="index.jsp" class="back-home">
    <i class="fa fa-home"></i> Back to Home
  </a>
</body>
</html>
