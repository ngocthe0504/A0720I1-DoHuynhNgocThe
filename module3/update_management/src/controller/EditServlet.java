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

@WebServlet(name = "EditServlet", urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    ICustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(request.getParameter("name"));
        customer.setEmail(request.getParameter("email"));
        customer.setAddress(request.getParameter("address"));
        try {
            customerService.edit(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("list");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            Customer customer = customerService.findById(id);
            request.setAttribute("customer", customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("JSP/edit.jsp").forward(request, response);
    }
}
