package com.codigo.api_rest_g7.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl1 implements GreetingService {
    @Override
    public String greet() {
        return "Hola desde el primer servicio";
    }
}
