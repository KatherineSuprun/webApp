package servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    public void init() {
        message = "Contact info!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String lastName = request.getParameter("LastName");
        String age = request.getParameter("age");
        String city = request.getParameter("city");
        String[] orders = request.getParameterValues("orders");

        out.println("<p Name: " + name + "</p>");
        out.println("<p lastName: " + lastName + "</p>");
        out.println("<p Age: " + age + "</p>");
        out.println("<p City: " + city + "</p>");
        out.println("<h4 Orders: " + "</h4>");

        for (String order : orders) {
            out.println(("<li" + order + "</li>"));
        }
    }

    public void destroy() {
    }
}