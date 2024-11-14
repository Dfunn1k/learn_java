 package com.example.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_category")
public class ProductoCategoryEntity {

    @EmbeddedId
    private ProductoCategoryId id;
    @ManyToOne
    @MapsId("product_id")
    private ProductoEntity producto;
    @ManyToOne
    @MapsId("category_id")
    private CategoryEntity category_id;
    private String state;
    private int stock;
}
