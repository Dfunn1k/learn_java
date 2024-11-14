package com.example.persistence.service;

import com.example.persistence.entity.CustomerEntity;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    CustomerEntity saveCustomer(CustomerEntity customer);
    CustomerEntity getCustomerById(UUID id);
    List<CustomerEntity> getAllCustomers();
    CustomerEntity updateCustomer(UUID id, CustomerEntity customer);
    void deleteCustomer(UUID id);
}