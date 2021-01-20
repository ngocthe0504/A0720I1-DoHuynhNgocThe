package DAO;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "123123";

    private static final String SELECT_ALL_CUSTOMER = "Select * from Customer";
    private static final String SELECT_CUSTOMER = "Select * from Customer where id = ?";
    private static final String DELETE_CUSTOMER = "delete from Customer where id = ? ";
    private static final String EDIT_CUSTOMER = "update customer set name_customer = ?, email = ?, address = ? where id = ?";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }


    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getNString("name_customer");
            String email = resultSet.getNString("email");
            String address = resultSet.getNString("address");

            customerList.add(new Customer(id, name, email, address));

        }

        return  customerList;
    }

    public Customer findById(int id) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER);
        preparedStatement.setString(1, String.valueOf(id));
        ResultSet resultSet = preparedStatement.executeQuery();
        Customer customer = new Customer();
        if (resultSet.next()) {
            String name = resultSet.getNString("name_customer");
            String email = resultSet.getNString("email");
            String address = resultSet.getNString("address");
            customer.setId(id);
            customer.setName(name);
            customer.setEmail(email);
            customer.setAddress(address);
        }
        return customer;
    }

    public void delete(int id) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
        preparedStatement.setString(1, String.valueOf(id));
        preparedStatement.executeUpdate();
    }

    public void edit(Customer customer) throws SQLException {

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(EDIT_CUSTOMER);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getEmail());
        preparedStatement.setString(3, customer.getAddress());
        preparedStatement.setString(4, String.valueOf(customer.getId()));
        preparedStatement.executeUpdate();
    }


}
