 <html><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        </head>
        <body>
        <form action="Bus" method="get">
        Enter the customer name for reservation cancellation<input type="text" name="custname">
                <input type="submit" value="Submit">
        </form>
        </body>
        </html>

package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet(name = "Bus", value = "/Bus")
public class Bus extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String cust_name = request.getParameter("cust_name");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql:///bus", "root", "admin");
            Statement stmt = conn.createStatement();
            String sql = "Delete from bustable where name='"+cust_name+"'";
            stmt.executeUpdate(sql);
        }
    }
}

