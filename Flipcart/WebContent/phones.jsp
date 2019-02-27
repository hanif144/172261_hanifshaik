<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="login.css">
<title>Insert title here</title>
</head>
<body>
<form action ="Login" method="post">


    <input type="text" placeholder="Username" name="username">  
  <input type="password" placeholder="password" name="password">  
  <a href="#" class="forgot">forgot password?</a>
 <a href=Check.jsp><input type="submit" value="Sign In"></a>
</form>
<div class="shadow"></div>
</body>
</html>