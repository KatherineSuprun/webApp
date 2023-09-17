package servlet;

import dto.Order;
import dto.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    public static List<User> registred = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = User.builder()
                .username(req.getParameter("username"))
                .lastName(req.getParameter("lastName"))
                .email(req.getParameter("email"))
                .password(req.getParameter("password"))
                .build();
        registred.add(user);
        req.setAttribute("name",user.getUsername());
        req.setAttribute("lastName",user.getLastName());
        req.setAttribute("email",user.getEmail());
        req.getRequestDispatcher("personalPage.jsp").forward(req,resp);
    }
}
