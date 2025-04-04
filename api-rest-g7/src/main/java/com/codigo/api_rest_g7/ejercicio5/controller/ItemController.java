package com.codigo.api_rest_g7.ejercicio5.controller;


import com.codigo.api_rest_g7.ejercicio5.exception.ItemNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping("/id/{id}")
    public String getItemById(@PathVariable int id) {
        if (id != 1) {
            throw new ItemNotFoundException();
        }
        return "El Item buscado con ID: " + id +
                " no se encuentra en la base de datos";
    }
}
