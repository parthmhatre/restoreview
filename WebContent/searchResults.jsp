<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="classes.restaurant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
//restaurant resto =new restaurant();
ArrayList<restaurant> restaurantIdSet = (ArrayList<restaurant>)request.getSession().getAttribute("lists");
Set<String> rating = (Set<String>)request.getSession().getAttribute("rating");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="//getbootstrap.com/favicon.ico">

    <title>Search Results</title>

    <!-- Bootstrap core CSS -->
    <link href="//getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <!-- <link href="http://v4-alpha.getbootstrap.com/examples/dashboard/dashboard.css" rel="stylesheet">
  --> 
  </head>

  <body>
    

    <div class="container-fluid">
      <div class="row">
        
        <main class="col-lg-8 col-sm-12  col-md-8  col-lg-offset-2 col-md-offset-2">
          <h1>Dashboard</h1>

          <h2>Section title</h2>
          <div class="table-responsive col-md-9 col-sm-9 col-lg-9" style="float:left;">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Sr No</th>
                  <th>Restaurant Name</th>
                  <th>Adress</th>
                  <th>Contact</th>
                  <th>Rate</th>
                </tr>
              </thead>
              <tbody>
              <%
				int i=1;
				for(restaurant resto:restaurantIdSet){
				%>
				<tr>
				<td><%out.println(i); %></td>
				<td><%String name = resto.getR_name();out.println(name); %></td>
				<td><%String address = resto.getR_address();out.println(address); %></td>
				<td><%String contact = resto.getR_contact();out.println(contact); %></td>
				<td><a href="rate.jsp?rid=<%=resto.getR_id()%>">Click</a></td>
				<tr><%
				i++;
				} %>
				                
              </tbody>
            </table>
            
            <a href="search.jsp">Back to Search</a>
          </div>
            <div class="table-responsive col-md-3 col-sm-3 col-lg-3" style="float:right;">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Rating</th>
                </tr>
              </thead>
              <tbody>
              <%
				for(String rate:rating){
				%>
				<tr>
				<td><%String rating1 = rate;out.println(rating1); %></td>
				<tr><%
			
				} %>
				                
              </tbody>
            </table>
            
            <!-- <a href="search.jsp">Back to Search</a> -->
          </div>
        </main>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery.min.js"><\/script>')</script>
    <script src="//getbootstrap.com/dist/js/bootstrap.min.js"></script>
  </body>
</html>
