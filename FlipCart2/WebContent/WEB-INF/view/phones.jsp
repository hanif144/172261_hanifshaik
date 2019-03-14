<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">


<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="login.css" />
</head>
<body>
<form action ="validate" method="post">


    <input type="text" placeholder="Username" name="username" value="vidhya@gmail.com">  
  <input type="password" placeholder="password" name="password" value="123">  
  <a href="#" class="forgot">forgot password?</a>
 <a href=Check.jsp><input type="submit" value="Sign In"></a>
</form>
<div class="shadow"></div>
</body>
</html>