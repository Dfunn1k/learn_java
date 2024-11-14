package com.codigo.api_rest_g7.ejercicio7.service.Impl;

import com.codigo.api_rest_g7.ejercicio7.service.CalculatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service // hace que la clase se convierta en un bean y se pueda inyectar
@Qualifier("multiplicationService")
public class MultiplicationServiceImpl implements CalculatorService {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
