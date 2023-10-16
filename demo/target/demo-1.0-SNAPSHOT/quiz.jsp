<%@page import="java.sql.*"%>
<%@page import="javax.servlet.*"%>
<html>
<form method="post" action="quiz.jsp">
    <table>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb","Vitwork", "LBJ3");
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery("Select * from quest order by rand() limit 1");

            while(rs.next()){
        %>
        <tr>
            <td>Question : <br></td>
        </tr>
        <tr>
            <td><%=rs.getString("question")%><br></td>
        </tr>
        <tr>
            <td><input type="radio" value="<%=rs.getString("Qa")%>" name="<%=rs.getString("question")%>"/><%=rs.getString("Qa")%></td>
        </tr>
        <tr>
            <td><input type="radio" value="<%=rs.getString("Qb")%>" name="<%=rs.getString("question")%>"/><%=rs.getString("Qb")%></td>
        </tr>
        <tr>
            <td><input type="radio" value="<%=rs.getString("Qc")%>" name="<%=rs.getString("question")%>"/><%=rs.getString("Qc")%></td>
        </tr>
        <tr>
            <td><input type="radio" value="<%=rs.getString("Qd")%>" name="<%=rs.getString("question")%>"/><%=rs.getString("Qd")%></td>
        </tr>
        <tr>

            <td><input type="submit" value="next"></td>
            <td><input type="submit" value="total" name="submit"></td>
        <%
            }
        %>
        </tr>
        <tr>
            <td></td>
        </tr>
    </table>
</form>
</html>