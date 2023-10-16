package com.example.Counterofcookie;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    int x=1;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie c = new Cookie("Visit",String.valueOf(x));
        response.addCookie(c);

        int y = Integer.parseInt(c.getValue());
        out.println("<html><body>");
        if(y==1)
            out.println("<h1>Welcome to this page.</h1>");
        else
            out.println("<h1>No of times the user has visited this page : " + y + "</h1>");
        x++;
        out.println("</body></html>");
    }

}