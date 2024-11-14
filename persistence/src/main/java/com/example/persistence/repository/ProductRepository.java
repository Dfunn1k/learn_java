package com.example.persistence.repository;

import com.example.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

// se coloca la entidad a la que hacemos referencia y el tipo de dato del PK
// esto crea un bean que nos proveerá los metodos para interacturar con la BD
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
}
