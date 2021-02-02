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

@WebServlet(name = "SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    public ICustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");
        try {
            List<Customer> customers = customerService.findByName(search);
            request.setAttribute("customers", customers);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("JSP/list.jsp").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }
}
