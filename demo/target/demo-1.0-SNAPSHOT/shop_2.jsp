<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String coke = request.getParameter("cookies");
    int r = Integer.parseInt(coke);
    String chip = request.getParameter("chips");
    int w = Integer.parseInt(chip);

    int tco = r * 2;
    int tc = w * 1;
    int ft = tc + tco;
    session.setAttribute("fT", ft);
%>
<html>
<head>
    <title>Shopping Mall</title>
</head>
<body>
    <h1>Shopping MALL</h1>
    <h3>Items Available : </h3>

    <form action="shop_3.jsp" method="get">
         Chocolate :
        <select name="choco">
            <option value="2">1</option>
            <option value="12">12</option>
            <option value="24">24</option>
            <option value="36">36</option>
        </select>
        <br><br>
         Juice  :
        <select name="juice">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="6">6</option>
        </select>
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
