package com.codigo.ms_registros.service.impl;

import com.codigo.ms_registros.aggregates.constants.Constants;
import com.codigo.ms_registros.aggregates.response.SunatResponse;
import com.codigo.ms_registros.client.SunatClient;
import com.codigo.ms_registros.entity.LegalPersonEntity;
import com.codigo.ms_registros.repository.LegalPersonRepository;
import com.codigo.ms_registros.service.LegalPersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Objects;

@Service
public class LegalPersonServiceImpl implements LegalPersonService {

    private final LegalPersonRepository legalPersonRepository;
    private final SunatClient sunatClient;

    @Value("${token.api}")
    private String token;

    public LegalPersonServiceImpl(LegalPersonRepository legalPersonRepository,
                                  SunatClient sunatClient){
        this.legalPersonRepository = legalPersonRepository;
        this.sunatClient = sunatClient;
    }

    @Override
    public LegalPersonEntity save(String ruc) {
        LegalPersonEntity legalPersonData = getEntity(ruc);
        if(Objects.nonNull(legalPersonData)){
            return legalPersonRepository.save(legalPersonData);
        } else {
            return null;
        }
    }

    private SunatResponse executionSunat(String ruc){
        String tokenFinal = "Bearer " + token;
        return sunatClient.getLegalPersonSunat(ruc, tokenFinal);
    }

    private LegalPersonEntity getEntity(String ruc){
        LegalPersonEntity legalPerson = new LegalPersonEntity();
        SunatResponse response = executionSunat(ruc);

        if (Objects.nonNull(response)){
            legalPerson.setState(true);
            legalPerson.setRazonSocial(response.getRazonSocial());
            legalPerson.setTipoDocumento(response.getTipoDocumento());
            legalPerson.setNumeroDocumento(response.getNumeroDocumento());
            legalPerson.setEstado(response.getEstado());
            legalPerson.setCondicion(response.getCondicion());
            legalPerson.setDireccion(response.getDireccion());
            legalPerson.setUbigeo(response.getUbigeo());
            legalPerson.setViaTipo(response.getViaTipo());
            legalPerson.setViaNombre(response.getViaNombre());
            legalPerson.setZonaCodigo(response.getZonaCodigo());
            legalPerson.setZonaTipo(response.getZonaTipo());
            legalPerson.setNumero(response.getNumero());
            legalPerson.setInterior(response.getInterior());
            legalPerson.setLote(response.getLote());
            legalPerson.setDpto(response.getDpto());
            legalPerson.setManzana(response.getManzana());
            legalPerson.setKilometro(response.getKilometro());
            legalPerson.setDistrito(response.getDistrito());
            legalPerson.setProvincia(response.getProvincia());
            legalPerson.setDepartamento(response.getDepartamento());
            legalPerson.setEsAgenteRetencion(true);
            legalPerson.setTipo(response.getTipo());
            legalPerson.setActividadEconomica(response.getActividadEconomica());
            legalPerson.setNumeroTrabajadores(response.getNumeroTrabajadores());
            legalPerson.setTipoFacturacion(response.getTipoFacturacion());
            legalPerson.setTipoContabilidad(response.getTipoContabilidad());
            legalPerson.setComercioExterior(response.getComercioExterior());
            legalPerson.setCreatedBy(Constants.CREATED_BY);
            legalPerson.setCreatedAt(new Timestamp(System.currentTimeMillis()));

            return legalPerson;
        } else {
            return null;
        }
    }
}
