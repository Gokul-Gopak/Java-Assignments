<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <form method="post" action="">
        <br> Enter text : <input type="text" name="change"><br>
        <br><br>Choose from options below<br>
        <select name="chk">
            <option value="Upper">Uppercase</option>
            <option value="Lower">Lowercase</option>
        </select>
    </form>
</body>
</html>
<%  String texts = request.getParameter("change");
    String changes = request.getParameter("chk");
    if(changes.equals("Upper"))
        String x = texts.toUpperCase();
%>