package com.demo.demo.services.Impl;

import com.demo.demo.models.ContractDetail;
import com.demo.demo.repository.ContractDetailRepository;
import com.demo.demo.services.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;
    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

    @Override
    public void delete(ContractDetail contractDetail) {
        contractDetailRepository.delete(contractDetail);
    }

    @Override
    public ContractDetail findById(int id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public List<ContractDetail> fillAll() {
        return contractDetailRepository.findAll();
    }
}
