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
import java.util.List;

@WebServlet(name = "ShowAllServlet", urlPatterns = "/list")
public class ShowAllServlet extends HttpServlet {
    public ICustomerService iCustomerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = null;
        try {
            customers = iCustomerService.getAllCustomer();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("customers", customers);
         request.getRequestDispatcher("JSP/list.jsp").forward(request, response);
    }
}
