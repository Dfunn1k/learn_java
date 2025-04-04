package com.codigo.ms_registros.controller;

import com.codigo.ms_registros.entity.NaturalPersonEntity;
import com.codigo.ms_registros.service.NaturalPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/natural_person")
public class NaturalPersonController {

    private final NaturalPersonService naturalPersonService;

    public NaturalPersonController(NaturalPersonService naturalPersonService) {
        this.naturalPersonService = naturalPersonService;
    }

    @PostMapping()
    public ResponseEntity<NaturalPersonEntity> saveNaturalPerson(
            @RequestParam("dni")String dni) throws IOException {
        NaturalPersonEntity naturalPerson = naturalPersonService.save(dni);
        return new ResponseEntity<>(naturalPerson, HttpStatus.CREATED);
    }
}
