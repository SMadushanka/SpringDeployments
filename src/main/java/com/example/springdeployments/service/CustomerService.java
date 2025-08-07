package com.example.springdeployments.service;

import com.example.springdeployments.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface CustomerService {

     Customer saveCustomer(Customer customer);

     List<Customer> findAll();
    }

