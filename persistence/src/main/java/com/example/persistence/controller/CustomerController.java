package com.example.persistence.controller;


import com.example.persistence.entity.CustomerEntity;
import com.example.persistence.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerEntity> getCustomerByID(@PathVariable UUID id){
        CustomerEntity customer = customerService.getCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerEntity> createCustomer(@RequestBody CustomerEntity customerData){
        CustomerEntity customer = customerService.saveCustomer(customerData);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @GetMapping
    public List<CustomerEntity> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerEntity> updateCustomer(@RequestBody CustomerEntity customerData,
                                                         @PathVariable UUID id){
        CustomerEntity customer = customerService.updateCustomer(id, customerData);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable UUID id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
