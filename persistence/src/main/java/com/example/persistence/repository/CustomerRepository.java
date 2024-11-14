package com.example.persistence.repository;

import com.example.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}
