<html>
<head>
<title>JSP</title>
</head>
<body>
    <%
        String u=request.getParameter("username");
        String p=request.getParameter("pass");
        if( p.isEmpty() || u.isEmpty() )
            out.println("Valid username and password ");
        else
            out.println("!!! NOT Valid username and password ");
    %>
</body>
</html>