package com.demo.demo.services.Impl;

import com.demo.demo.models.Customer;
import com.demo.demo.models.Service;
import com.demo.demo.repository.ServiceRepository;
import com.demo.demo.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(Service service) {
        serviceRepository.delete(service);
    }

    @Override
    public Service findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Service> fillAll() {
        return serviceRepository.findAll();
    }
}
