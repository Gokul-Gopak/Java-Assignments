<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String chocolate = request.getParameter("choco");
    int c = Integer.parseInt(chocolate);
    String juices = request.getParameter("juice");
    int j = Integer.parseInt(juices);

    int tc = c * 2;
    int tj = j * 1;
    int st = tc + tj;
    int ft = (Integer)request.getSession().getAttribute("fT");
    int finaltot = st + ft;
%>
<html>
<head>
    <title>Shopping Mall</title>
</head>
<body>
    <h1>Shopping MALL</h1>
    <h3>First Page Total : <%=ft%></h3>
    <h3>Second Page Total : <%=st%></h3>
    <h2> Total : <%=finaltot%></h2>
</body>
</html>
