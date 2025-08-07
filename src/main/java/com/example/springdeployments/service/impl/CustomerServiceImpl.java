package com.example.springdeployments.service.impl;

import com.example.springdeployments.entity.Customer;
import com.example.springdeployments.repo.CustomerRepo;
import com.example.springdeployments.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
}
