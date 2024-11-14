package com.codigo.api_rest_g7.ejercicio1.controller;

import com.codigo.api_rest_g7.ejercicio1.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    // private final GreetingService greetingService;

//    public GreetingController(@Qualifier("secondaryGreetingService")GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    @Autowired
    @Qualifier("greetingServiceImpl2")
    private GreetingService greetingService;

    @GetMapping("/default")
    public String greet() {
        return greetingService.greet();
    }
}
