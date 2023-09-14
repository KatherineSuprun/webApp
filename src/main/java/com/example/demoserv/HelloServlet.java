package com.example.demoserv;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Contact info!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String orders = request.getParameter("orders");
        String registration = request.getParameter("registration");
        response.setContentType("text/html");
        if(orders == null){
            orders = "No orders yet! :(";
        }
        if(registration == null){
            registration = "You are not registered yet! :(";
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>Orders:"  + orders + "</h1>");
        out.println("<h2>Registration:" + registration + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}