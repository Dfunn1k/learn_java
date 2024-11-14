package com.example.persistence.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class ProductoCategoryId implements Serializable {
    private Long product_id;
    private Long category_id;
}
