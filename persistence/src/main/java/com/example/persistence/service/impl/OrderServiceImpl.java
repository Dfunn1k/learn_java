package com.example.persistence.service.impl;

import com.example.persistence.entity.CustomerEntity;
import com.example.persistence.entity.OrderEntity;
import com.example.persistence.repository.CustomerRepository;
import com.example.persistence.repository.OrderRepository;
import com.example.persistence.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;

    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public OrderEntity saveOrder(UUID clientId, OrderEntity order) {
       CustomerEntity customerFound = customerRepository.findById(clientId)
                .orElseThrow(() -> new NoSuchElementException("¡Cliente no encontrado!"));
        order.setCustomer(customerFound);
        return orderRepository.save(order);
    }

    @Override
    public OrderEntity getOrderById(UUID id) {
        return orderRepository.findById(id).orElseThrow(()
                -> new NoSuchElementException("¡Pedido no encontrado!"));
    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity UpdateOrder(UUID id, UUID clientId, OrderEntity order) {
        OrderEntity orderFound = getOrderById(id);
        //ClienteEntity clienteExistente = clienteRepository.findById(idCliente).orElseThrow(() -> new RuntimeException("Erorr cliente a relacionar no existe"));
        orderFound.setDescription(order.getDescription());
        //pedidoExistente.setCliente(clienteExistente);
        return orderRepository.save(orderFound);
    }

    @Override
    public void deleteOrder(UUID id) {
        OrderEntity orderFound = getOrderById(id);
        orderRepository.delete(orderFound);
    }
}
