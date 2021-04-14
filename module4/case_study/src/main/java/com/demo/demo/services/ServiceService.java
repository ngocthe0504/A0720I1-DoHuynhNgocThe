package com.demo.demo.services;

import com.demo.demo.models.Customer;
import com.demo.demo.models.Service;

import java.util.List;

public interface ServiceService {
    void save(Service service);
    void delete(Service service);
    Service findById(int id);
    List<Service> fillAll();
}
