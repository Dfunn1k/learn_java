package com.example.persistence.service.impl;

import com.example.persistence.entity.CustomerEntity;
import com.example.persistence.entity.OrderEntity;
import com.example.persistence.repository.CustomerRepository;
import com.example.persistence.repository.OrderRepository;
import com.example.persistence.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class CustomServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public CustomServiceImpl(CustomerRepository customerRepository,
                             OrderRepository orderRepository){
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    @Override
    public CustomerEntity getCustomerById(UUID id) {
        return customerRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Customer not found"));
    }

    @Override
    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerEntity updateCustomer(UUID id, CustomerEntity customer) {
        CustomerEntity customerFound = getCustomerById(id);
        customerFound.setName(customer.getName());
        customerFound.setAddressEntity(customerFound.getAddressEntity());

        manageOrders(customerFound, customer.getOrders());
        return customerRepository.save(customerFound);
    }

    private void manageOrders(CustomerEntity existingCostumer, List<OrderEntity> ordersData) {
        List<OrderEntity> existingOrders = existingCostumer.getOrders();
        existingOrders.clear();

        for (OrderEntity order : ordersData) {
            if (order.getId() != null){
                OrderEntity orderFound = orderRepository.findById(order.getId()).
                        orElseThrow(() -> new NoSuchElementException("Pedido no encontrado"));
                orderFound.setDescription(order.getDescription());
                existingOrders.add(orderFound);
            } else {
                order.setCustomer(existingCostumer);
                existingOrders.add(order);
            }
        }
        existingCostumer.setOrders(ordersData);
    }

    @Override
    public void deleteCustomer(UUID id) {
        CustomerEntity customerFound = getCustomerById(id);
        customerRepository.delete(customerFound);
    }
}
