package com.codigo.api_rest_g7.ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // el pathvariable define que el valor de la variable se obtiene de la url
    @GetMapping("/greet/{name}/{age}")
    public String greetUser(@PathVariable String name, @PathVariable int age) {
        return "Hola " + name + " tienes " + age + " años";
    }
}
