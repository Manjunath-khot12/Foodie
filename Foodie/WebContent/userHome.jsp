<%@page import="java.util.*,com.food.model.Restaurant" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
    padding-top: 60px; /* Adjust this to the height of your header */
  }
  .header {
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    background-color: #333;
    color: white;
    padding: 10px 20px;
    z-index: 1000; /* Ensures the header stays on top of other content */
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  .header #icon {
    font-size: 1.2em;
  }
  .header .navbar {
    position: relative;
  }
  .header .navbar a {
    color: white;
    text-decoration: none;
    margin-left: 20px;
  }
  .header .navbar .dropdown {
    position: relative;
    display: inline-block;
  }
  .header .navbar .dropdown-content {
    display: none;
    position: absolute;
    background-color: #333;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
    border-radius: 4px;
  }
  .header .navbar .dropdown-content a {
    color: white;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
  }
  .header .navbar .dropdown-content a:hover {
    background-color: #575757;
  }
  .header .navbar .dropdown:hover .dropdown-content {
    display: block;
  }
  .banner {
    position: relative;
    width: 100%;
    height: 400px;
    overflow: hidden;
  }
  .banner img {
    width: 100%;
    height: 100%;
    object-fit: cover;
  }
  .banner .head {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    text-align: center;
    color: white;
  }
  .banner .head #heading {
    font-size: 3em;
    margin: 0;
  }
  .banner .head #desc {
    font-size: 1.5em;
    margin: 0;
  }
  #rest-heading {
    text-align: center;
    margin-top: 20px;
    font-size: 2em;
  }
  #rest-heading #rest {
    color: #007bff;
  }
  .rest-link {
    display: block;
    text-align: center;
    margin-bottom: 20px;
    color: #007bff;
    text-decoration: none;
  }
  .restaurants {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    padding: 0 20px;
  }
  .rest-menu {
    background-color: white;
    border: 1px solid #ccc;
    border-radius: 8px;
    margin: 10px;
    padding: 15px;
    width: calc(33.333% - 20px);
    box-sizing: border-box;
    text-align: center;
    display: flex;
    flex-direction: column;
    align-items: center;
    display: none;
  }
  .rest-menu img {
    width: 100%;
    height: 200px;
    object-fit: cover;
    border-radius: 8px 8px 0 0;
  }
  .rest-name {
    font-size: 1.5em;
    margin: 10px 0;
  }
  .details {
    width: 100%;
    margin: 10px 0;
    text-align: left;
  }
  .details p {
    margin: 5px 0;
    display: flex;
    justify-content: space-between;
    padding: 0 10px;
  }
  .view-menu {
    display: inline-block;
    padding: 5px 10px;
    background-color: #007bff;
    color: white;
    text-decoration: none;
    border-radius: 4px;
    text-align: center;
    margin-top: 10px;
  }
  .view-menu:hover {
    background-color: #0056b3;
  }
  .loading {
    display: none;
    position: fixed;
    z-index: 999;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 24px;
    font-weight: bold;
    color: #007bff;
  }
  .more-restaurants-container {
    text-align: center;
    margin: 20px auto;
  }
  .more-restaurants {
    display: inline-block;
    padding: 8px 16px; /* Adjust padding to make the button smaller */
    background-color: #007bff;
    color: white;
    text-decoration: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 1em; /* Adjust font size to make the button smaller */
  }
  .more-restaurants:hover {
    background-color: #0056b3;
  }
  .active-status {
    color: green;
    font-weight: bold;
  }
  .closed-status {
    color: red;
    font-weight: bold;
  }
  #username
  {
    text-align:center;
    color:black
  }
  #name
  {
    color:orange;
  }
</style>
<script>
  let currentCount = 10;

  function showLoading() {
    document.getElementById('loading').style.display = 'block';
  }

  function showMoreRestaurants() {
    const restaurants = document.querySelectorAll('.rest-menu');
    const totalRestaurants = restaurants.length;
    
    for (let i = currentCount; i < currentCount + 10 && i < totalRestaurants; i++) {
      restaurants[i].style.display = 'block';
    }

    currentCount += 10;

    if (currentCount >= totalRestaurants) {
      document.getElementById('more-btn').style.display = 'none';
    }
  }

  window.onload = function() {
    showMoreRestaurants(); // Initially show the first 10 restaurants
  }
</script>
</head>
<body>
  <%
  String name = (String) request.getAttribute("name");
  %>
  <!-- header and banner photo -->
  <div class="header">
    <div id="icon">
      <i class="fa-thin fa-mobile-button"></i>Get an app
    </div>
    <div class="navbar">
      <div class="dropdown">
        <a href="AddResturants.html">Add restaurant</a>
        <div class="dropdown-content">
          <a href="AddMenu.html">Add Menu</a>
          <a href="knowYourRestaurantID.html">Know Your RestaurantId</a>
        </div>
      </div>
      <a href="Showcart?name=<%=name %>">View Cart</a>
      <a href="orderhistory?name=<%=name %>">View Order History</a>
      <a href="index.jsp">Logout</a>
    </div>
  </div>
  <div class="banner">
    <img src="foodapp.jpg" alt="Tap Food">
    <div class="head">
      <h1 id="heading">
        <i>Tap Food</i>
      </h1>
      <h1 id="desc">Discover the best food & drinks in Bengaluru</h1>
    </div>
  </div>

  <h1 id="username">Welcome <span id="name"><%=name %></span>  </h1>
  <!-- All Restaurants collections -->
  <h1 id="rest-heading">All <span id="rest">Restaurants</span></h1>
  <a class="rest-link" href="allrestaurants1?userName=<%=name %>" onclick="showLoading()">All Restaurants</a>
  
  <div id="loading" class="loading">Loading...</div>

  <div class="restaurants">
    <%
      List<Restaurant> res = (List<Restaurant>)request.getAttribute("list");
      if(res != null){
        int index = 0;
        for(Restaurant rest : res) {
    %>
      <div class="rest-menu" style="display: <%= index < 10 ? "block" : "none" %>;">
        <img src="restaurnats.jpg" alt="Restaurant Image">
        <p class="rest-name"><%=rest.getResName()%></p>
        <div class="details">
          <p><span>Cuisine Type:</span><span><%=rest.getCuisineType()%></span></p>
          <p><span>Is Active:</span>
            <span class="<%= rest.isActive() ? "active-status" : "closed-status" %>">
              <%= rest.isActive() ? "Open" : "Closed" %>
            </span>
          </p>
          <p><span>Delivery Time:</span><span><%=rest.getDeliveryTime()%> min</span></p>
          <p><span>Address:</span><span><%=rest.getAddress()%></span></p>
        </div>

        <a class="view-menu" href="showMenu?resturantId=<%= rest.getRestaurantid() %>&restName=<%=rest.getResName()%>&name=<%= name %>">View Menu</a>
        
      </div>
    <%
        index++;
        }
      } else {
    %>
      <div style="text-align: center; width: 100%;">
        <p>No Record Found</p>
      </div>
    <%
      }
    %>
  </div>

  <%-- More Restaurants Button --%>
  <%
    if (res != null && res.size() > 10) {
  %>
    <div class="more-restaurants-container">
      <div id="more-btn" class="more-restaurants" onclick="showMoreRestaurants()">More Restaurants</div>
    </div>
  <%
    }
  %>

</body>
</html>
