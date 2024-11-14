// acá definimos las funcionalidades
package com.example.persistence.service;

import com.example.persistence.entity.ProductEntity;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(UUID id);
    List<ProductEntity> getAllProducts();
    ProductEntity updateProduct(UUID id, ProductEntity productEntity);
    void deleteProduct(UUID id);
}
