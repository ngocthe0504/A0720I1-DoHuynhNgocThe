package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {

    List<Customer> getAllCustomer() throws SQLException;

    Customer findById(int id) throws SQLException;

    void delete(int id) throws SQLException;

    void edit(Customer customer) throws SQLException;
    void create(Customer customer) throws SQLException;

    List<Customer> findByName(String search) throws SQLException;
}
