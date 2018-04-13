<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rate</title>
</head>
<body>
<form method="post" action="/RestoReview/rate">

<input type="hidden" name="resto" id="resto" value="<%=request.getParameter("rid")%>">
<input type="hidden" name="user" id="user" value="<%=request.getSession().getAttribute("resultData")%>">
<select name="rates" id="rates">
<option value="1.0">1</option>
<option value="2.0">2</option>
<option value="3.0">3</option>
<option value="4.0">4</option>
<option value="5.0">5</option>
</select>
<input type="submit" value="submit">
</form>

</body>
</html>