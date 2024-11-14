package com.codigo.api_rest_g7.ejercicio6.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException() {
        super("No se encontró la tarea con ese ID");
    }
}
