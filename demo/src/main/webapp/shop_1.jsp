<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping Mall</title>
</head>
<body>
    <h1>Shopping MALL</h1>
    <h3>Items Available : </h3>
    <form action="shop_2.jsp" method="post">
        Cookie :
        <select name="cookies"><br>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
        <br><br>
        Chips :
        <select name="chips">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="5">5</option>
            <option value="10">10</option>
        </select>
        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
