package com.codigo.api_rest_g7.ejercicio7.controller;


import com.codigo.api_rest_g7.ejercicio7.service.CalculatorService;
import com.codigo.api_rest_g7.ejercicio7.service.Impl.AdditionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    //recordemos que siempre se instancia la interfaz, 1er forma
//    @Autowired
//    @Qualifier("additionService")
//    private CalculatorService calculatorAddService;
//
//    @Autowired
//    @Qualifier("multiplicationService")
//    private CalculatorService calculatorMultService;

    // 2da forma
    private final CalculatorService calculatorAddService;
    private final CalculatorService calculatorMulService;

    public CalculatorController(@Qualifier("additionService") CalculatorService calculatorAddService,
                                @Qualifier("multiplicationService") CalculatorService calculatorMulService){
        this.calculatorMulService = calculatorMulService;
        this.calculatorAddService = calculatorAddService;
    }
    // 
    @GetMapping("/sum")
    public String addCalculate(@RequestParam double a, @RequestParam double b){
        return "Resultado: " + calculatorAddService.calculate(a, b);
    }

    @GetMapping("/mul")
    public String mulCalculate(@RequestParam double a, @RequestParam double b){
        return "Resultado:" + calculatorMulService.calculate(a, b);
    }





}
