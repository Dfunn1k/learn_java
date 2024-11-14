package com.codigo.ms_registros.controller;

import com.codigo.ms_registros.entity.LegalPersonEntity;
import com.codigo.ms_registros.service.LegalPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legal_person")
public class LegalPersonController {
    private final LegalPersonService legalPersonService;

    public LegalPersonController(LegalPersonService legalPersonService) {
        this.legalPersonService = legalPersonService;
    }

    @PostMapping
    public ResponseEntity<LegalPersonEntity> saveLegalPerson(@RequestParam("ruc") String ruc){
        LegalPersonEntity legalPerson = legalPersonService.save(ruc);
        return new ResponseEntity<>(legalPerson, HttpStatus.CREATED);
    }

}
