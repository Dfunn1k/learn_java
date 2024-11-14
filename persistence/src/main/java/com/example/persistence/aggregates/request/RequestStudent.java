package com.example.persistence.aggregates.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class RequestStudent {
    // Esto es un DTO(data transfer object)
    private String name;
    private Set<UUID> courses;
}
