package com.codigo.api_rest_g7.ejercicio4.controller;


import com.codigo.api_rest_g7.ejercicio4.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book, @RequestHeader("test") String test) {
        // retornar un JSON con los datos del libro
        // return book;
        book.setDato(test);
        return book;
    }
}
