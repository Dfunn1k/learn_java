package com.codigo.ms_registros.service;

import com.codigo.ms_registros.entity.NaturalPersonEntity;

import java.io.IOException;

public interface NaturalPersonService {
    NaturalPersonEntity save(String dni) throws IOException;
}
