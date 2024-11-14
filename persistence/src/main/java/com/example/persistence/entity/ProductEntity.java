// acá construimos la tabla
package com.example.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "product") // si no lleva el decorador Table, el nombre de la clase será el nombre de la clase
//@Data esto reemplaza al getter al setter e incluso agrega un constructor
@Getter
@Setter
public class ProductEntity {
    @Id // AQUI SE DEFINE EL PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.UUID) // Esto hace que el id lo genere la base de datos
    private UUID id;

    @Column(name = "name", length = 100, unique = true)
    private String name;

    @Column(name = "price", nullable = false) //nullable = false dice que si o si debe guardarse
    private double price;
}
