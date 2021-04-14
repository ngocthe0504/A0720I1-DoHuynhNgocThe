package com.demo.demo.services;

import com.demo.demo.models.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    void delete(Customer customer);
    Customer findById(int id);
    List<Customer> fillAll();
}
