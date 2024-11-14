package com.example.persistence.service;

import com.example.persistence.entity.OrderEntity;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    OrderEntity saveOrder(UUID clientId, OrderEntity order);
    OrderEntity getOrderById(UUID id);
    List<OrderEntity> getAllOrders();
    OrderEntity UpdateOrder(UUID id, UUID clientId, OrderEntity order);
    void deleteOrder(UUID id);
}
