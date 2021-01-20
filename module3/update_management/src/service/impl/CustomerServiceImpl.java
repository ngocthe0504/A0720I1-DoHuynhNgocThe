package service.impl;

import DAO.CustomerDAO;
import model.Customer;
import service.ICustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    public CustomerDAO customerDAO= new CustomerDAO();
    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        return customerDAO.getAllCustomer();
    }

    @Override
    public Customer findById(int id) throws SQLException {
        return customerDAO.findById(id);
    }

    @Override
    public void delete(int id) throws SQLException {
        customerDAO.delete(id);
    }

    @Override
    public void edit(Customer customer) throws SQLException {
        customerDAO.edit(customer);
    }
}
