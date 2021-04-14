package com.demo.demo.services;

import com.demo.demo.models.ContractDetail;
import com.demo.demo.models.Customer;

import java.util.List;

public interface ContractDetailService {
    void save(ContractDetail contractDetail);
    void delete(ContractDetail contractDetail);
    ContractDetail findById(int id);
    List<ContractDetail> fillAll();
}
