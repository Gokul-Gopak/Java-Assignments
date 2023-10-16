<html>
<head>
  <title> Q1 </title>
</head>
<body>
<% String u=request.getParameter("username");
String p=request.getParameter("pass");
if( p.isEmpty() || u.isEmpty() )
  out.println("Valid username  and password ");
else
  out.println("Valid username and password ");
%>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title> Login Page </title>
</head>
<body>
<form action="log.jsp" method="get"> Enter Username : <input  type="text" name="username">
  <br> <br>
  Enter Password: <input type="password" name="PASS">  <br>
  <input type="submit" value="LOGIN">
  <br>
</form>
</body>
</html>