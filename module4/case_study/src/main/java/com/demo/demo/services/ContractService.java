package com.demo.demo.services;

import com.demo.demo.models.Contract;
import com.demo.demo.models.Customer;

import java.util.List;

public interface ContractService {
    void save(Contract contract);
    void delete(Contract contract);
    Contract findById(int id);
    List<Contract> fillAll();
}
