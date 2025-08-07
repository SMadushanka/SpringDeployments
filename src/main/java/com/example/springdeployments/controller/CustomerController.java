package com.example.springdeployments.controller;

import com.example.springdeployments.entity.Customer;
import com.example.springdeployments.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> customers = customerService.findAll();
        return ResponseEntity.ok(customers);
    }
}
