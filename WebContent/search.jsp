<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="//getbootstrap.com/favicon.ico">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="//getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <!-- <link href="http://v4-alpha.getbootstrap.com/examples/dashboard/dashboard.css" rel="stylesheet">
  --> 
 
  </head>

  <body>
    

    <div class="container-fluid">
      <div class="row">
        
        <main class="col-lg-6 col-sm-12  col-md-6  col-lg-offset-3 col-md-offset-3">
          <h1>Dashboard</h1>

          <h2>Search Here</h2>
          <form class="form-signi"  method="post" action="/RestoReview/Search">
            <label for="inputEmail">Type here</label>
            <input type="text" name="inputField" id="inputField"  class="form-control" placeholder="Search anything here" required autofocus>
            <label for="searchparameter">Search By</label>
            <select class="form-control" name="searchparameter" id="searchparameter"> 
              <option value="c">Cuisine</option>
              <option value="locality">Locality</option>
              <option value="dishes">Dish</option>
              <option value="restaurant">Restaurant</option>
            </select>
                          
            <button class="btn btn-lg btn-primary btn-block" type="submit">Search Here</button>
          </form>
          <h3 style="text-align:center"><a href ="createresto.html">Admin can create restaurants here</a></h3>
        </main>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery-3.1.1.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
