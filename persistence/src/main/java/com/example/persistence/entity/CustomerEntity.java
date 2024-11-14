package com.example.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    // para poder crear y actualizar
    @OneToOne(cascade = {CascadeType.ALL, CascadeType.MERGE})
    // aqui se define cual es la foreign key
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressEntity addressEntity;

    @JsonManagedReference
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<OrderEntity> orders;
}
