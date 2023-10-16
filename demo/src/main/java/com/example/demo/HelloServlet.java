package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
//    private String message;

//    public void init() {message = "HAHA GOT HIM";}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        out.println("<html><body>");
        if(user.equals("USER") && pass.equals("PASS"))
        {
            out.println("<h1>LOGIN SUCCESSFULL</h1>");
        }
        else
            out.println("<h1>LOGIN FAILED</h1>");
        out.println("</body></html>");

    }

//    public void destroy() { }
}