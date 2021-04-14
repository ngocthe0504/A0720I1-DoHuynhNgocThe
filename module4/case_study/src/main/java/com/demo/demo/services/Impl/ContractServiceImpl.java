package com.demo.demo.services.Impl;

import com.demo.demo.models.Contract;
import com.demo.demo.models.Customer;
import com.demo.demo.repository.ContractRepository;
import com.demo.demo.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;
    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(Contract contract) {
        contractRepository.delete(contract);
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contract> fillAll() {
        return contractRepository.findAll();
    }
}
