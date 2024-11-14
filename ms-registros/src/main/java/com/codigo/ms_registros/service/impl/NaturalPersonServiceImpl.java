package com.codigo.ms_registros.service.impl;

import com.codigo.ms_registros.aggregates.constants.Constants;
import com.codigo.ms_registros.aggregates.response.ResponseReniec;
import com.codigo.ms_registros.client.ReniecClient;
import com.codigo.ms_registros.entity.NaturalPersonEntity;
import com.codigo.ms_registros.repository.NaturalPersonRepository;
import com.codigo.ms_registros.service.NaturalPersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Objects;

@Service
public class NaturalPersonServiceImpl implements NaturalPersonService {

    private final NaturalPersonRepository naturalPersonRepository;
    private final ReniecClient reniecClient;

    @Value("${token.api}") // carga de propiedades
    private String token;

    public NaturalPersonServiceImpl(NaturalPersonRepository naturalPersonRepository,
                                    ReniecClient reniecClient){
        this.naturalPersonRepository = naturalPersonRepository;
        this.reniecClient = reniecClient;
    }

    @Override
    public NaturalPersonEntity save(String dni) {
        NaturalPersonEntity naturalPersonData = getEntity(dni);
        if(Objects.nonNull(naturalPersonData)){
            return naturalPersonRepository.save(naturalPersonData);
        } else {
            return null;
        }

    }

    // Este metodo realiza la petición a reniec
    private ResponseReniec executionReniec(String dni){
        String tokenFinal = "Bearer " + token;
        return reniecClient.getNaturalPersonReniec(dni, tokenFinal);
    }

    private NaturalPersonEntity getEntity(String dni){
        NaturalPersonEntity naturalPerson = new NaturalPersonEntity();
        ResponseReniec response = executionReniec(dni);

        if (Objects.nonNull(response)){
            naturalPerson.setState(true);
            naturalPerson.setNombres(response.getNombres());
            naturalPerson.setApellidoPaterno(response.getApellidoPaterno());
            naturalPerson.setApellidoMaterno(response.getApellidoMaterno());
            naturalPerson.setTipoDocumento(response.getTipoDocumento());
            naturalPerson.setNumeroDocumento(response.getNumeroDocumento());
            naturalPerson.setDigitoVerificador(response.getDigitoVerificador());
            naturalPerson.setCreatedBy(Constants.CREATED_BY); //Aquí se llama a la constante que creamos
            naturalPerson.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            return naturalPerson;
        } else {
            return null;
        }
    }
}
