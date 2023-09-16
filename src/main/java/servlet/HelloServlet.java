package servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


   @Override
protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {

   req.getRequestDispatcher("index.jsp").forward(req,resp);


   }
}