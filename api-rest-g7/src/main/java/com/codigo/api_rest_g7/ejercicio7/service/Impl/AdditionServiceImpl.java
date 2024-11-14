package com.codigo.api_rest_g7.ejercicio7.service.Impl;

import com.codigo.api_rest_g7.ejercicio7.service.CalculatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("additionService")
public class AdditionServiceImpl implements CalculatorService {

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
