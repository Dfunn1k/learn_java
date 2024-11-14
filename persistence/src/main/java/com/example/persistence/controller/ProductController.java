package com.example.persistence.controller;


import com.example.persistence.entity.ProductEntity;
import com.example.persistence.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    // aqui inyectamos
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    public ResponseEntity<ProductEntity> createProduct(@RequestBody ProductEntity product) {
        ProductEntity newProduct = productService.saveProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable UUID id) {
        ProductEntity product = productService.getProduct(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping()
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> updateProductById(@PathVariable UUID id ,
                                                           @RequestBody ProductEntity product) {
        ProductEntity newProduct = productService.updateProduct(id, product);
        return new ResponseEntity<>(newProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
