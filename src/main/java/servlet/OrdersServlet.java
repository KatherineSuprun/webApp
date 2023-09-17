package servlet;

import dto.Order;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/orders")
public class OrdersServlet extends HttpServlet {

    public static List<Order> orders = new ArrayList<>();
    public static Order current = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/orders.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     /*   Order ord = Order.builder()
                .lipstick(req.getParameter("username"))
                .shampoo(req.getParameter("lastName"))
                .gel(req.getParameter("email"))
                .soap(req.getParameter("password"))
                .mascara(req.getParameter("password"))
                .build();
        orders.add(ord);
        req.setAttribute("name",ord.getLipstick());
        req.setAttribute("lastName",ord.getShampoo());
        req.setAttribute("email",ord.getGel());
        req.setAttribute("email",ord.getSoap());
        req.setAttribute("email",ord.getShampoo());*/

        req.getRequestDispatcher("personalPage.jsp").forward(req,resp);
        String[] product = req.getParameterValues("products");
        String[] quantity = req.getParameterValues("quantities");
        current = new Order(product, quantity);
        req.getRequestDispatcher("orders.jsp").forward(req,resp);

    }
}