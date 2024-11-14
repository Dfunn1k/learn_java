package com.example.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "course")
@Getter
@Setter
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    @ManyToMany(mappedBy = "courses") // el atributo en la otra entidad
    @JsonBackReference // indica qque no se cargue los estudiantes
    private Set<StudentEntity> students;
}
