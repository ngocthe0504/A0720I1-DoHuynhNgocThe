package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ViewServlet", urlPatterns = "/view")
public class ViewServlet extends HttpServlet {
    public ICustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Customer customer = customerService.findById(id);
            request.setAttribute("customerA", customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("JSP/detail.jsp").forward(request, response);
    }
}
