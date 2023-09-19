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

@WebServlet("/createOrder")
public class CreateOrder extends HttpServlet {

    //  private static final long serialVersionUID = 1L;


/*
        request.setAttribute("order", order_list );
        RequestDispatcher dispatcher = request.getRequestDispatcher("/BookAdmin.jsp");
        dispatcher.forward(request, response);
    }


        request.setAttribute("order", books_list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
        dispatcher.forward(request, response);
    }



    private void insertBook(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        String title = request.getParameter("booktitle");
        String author = request.getParameter("bookauthor");
        String priceString = request.getParameter("bookprice");

        Order newOrder = new Order(title, author, Float.parseFloat(priceString));

        orderDao.insertBook(newOrder);
        response.sendRedirect("list");
    }*/


    public static List<Order> orders = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/orders.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = Order.builder()
                .lipstick(req.getParameter("lipstick"))
                .shampoo(req.getParameter("shampoo"))
                .gel(req.getParameter("gel"))
                .soap(req.getParameter("soap"))
                .mascara(req.getParameter("mascara"))
                .build();
        orders.add(order);
        req.setAttribute("lipstick", order.getLipstick());
        req.setAttribute("shampoo", order.getShampoo());
        req.setAttribute("gel", order.getGel());
        req.setAttribute("soap", order.getSoap());
        req.setAttribute("mascara", order.getMascara());
        req.getRequestDispatcher("orderDetails.jsp").forward(req, resp);
    }
}
