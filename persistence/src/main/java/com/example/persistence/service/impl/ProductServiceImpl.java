package com.example.persistence.service.impl;

import com.example.persistence.entity.ProductEntity;
import com.example.persistence.repository.ProductRepository;
import com.example.persistence.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service // esto hacee que se genere un bean de esta clase para poder inyectarla en el controller
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    // aquí inyectamos el bean del repositorio para poder usar sus métodos de interación con BD
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity getProduct(UUID id) {
        return productRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Error Product not found with ID"));
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity updateProduct(UUID id, ProductEntity productEntity) {
        ProductEntity product = getProduct(id);
        product.setName(productEntity.getName());
        product.setPrice(productEntity.getPrice());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(UUID id) {
        ProductEntity product = getProduct(id);
        productRepository.delete(product);
    }
}
