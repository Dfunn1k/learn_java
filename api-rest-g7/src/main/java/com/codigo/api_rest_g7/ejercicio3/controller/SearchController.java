package com.codigo.api_rest_g7.ejercicio3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    // Simplemente los QueryParams
    @GetMapping("/product")
    public String searchProduct(@RequestParam String product,
                                @RequestParam(required = false, defaultValue = "") String category) {
        return "Buscando producto: " + product + category;
    }
}



