package com.codigo.ms_registros.service.impl;

import com.codigo.ms_registros.aggregates.constants.Constants;
import com.codigo.ms_registros.aggregates.response.ReniecResponse;
import com.codigo.ms_registros.client.ReniecClient;
import com.codigo.ms_registros.entity.NaturalPersonEntity;
import com.codigo.ms_registros.repository.NaturalPersonRepository;
import com.codigo.ms_registros.retrofit.ClientReniecService;
import com.codigo.ms_registros.retrofit.impl.ClientReniecServiceImpl;
import com.codigo.ms_registros.service.NaturalPersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Objects;

@Log4j2
@Service
public class NaturalPersonServiceImpl implements NaturalPersonService {

    private final NaturalPersonRepository naturalPersonRepository;
    private final ReniecClient reniecClient;
    // Aqui llamamos a la interfaz de retrofit
    ClientReniecService reniecServiceRetrofit = ClientReniecServiceImpl
            .getRetrofit()
            .create(ClientReniecService.class);

    @Value("${token.api}") // carga de propiedades
    private String token;

    public NaturalPersonServiceImpl(NaturalPersonRepository naturalPersonRepository,
                                    ReniecClient reniecClient){
        this.naturalPersonRepository = naturalPersonRepository;
        this.reniecClient = reniecClient;
    }

    @Override
    public NaturalPersonEntity save(String dni) throws IOException{
        NaturalPersonEntity naturalPersonData = getEntity(dni);
        if(Objects.nonNull(naturalPersonData)){
            return naturalPersonRepository.save(naturalPersonData);
        } else {
            return null;
        }
    }

    // Este metodo realiza la petición a reniec
    private ReniecResponse executionReniec(String dni){
        String tokenFinal = "Bearer " + token;
        return reniecClient.getNaturalPersonReniec(dni, tokenFinal);
    }

    private NaturalPersonEntity getEntity(String dni) throws IOException {
        NaturalPersonEntity naturalPerson = new NaturalPersonEntity();
        ReniecResponse response = null;
        // ReniecResponse response = executionReniec(dni);


        Call<ReniecResponse> clienRetrofit = prepareReniecRetrofit(dni);
        // La clase Response convierte el json al la clase que en este caso es ReniecResponse
        Response<ReniecResponse> executeReniec = clienRetrofit.execute();
        log.info("getEntity -> Se preparo todo el cliente retrofit, listo para ejecutar");
        if (executeReniec.isSuccessful() && Objects.nonNull(executeReniec.body())){
            response = executeReniec.body();
            log.info("getEntity -> valores del body: {}", executeReniec.body().toString());
        }
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

    //Método que ejecuta el client retrofit de reniec
    // El call nos esta dando un objeto retrofit con la url y el token listo para ejecutar
    private Call<ReniecResponse> prepareReniecRetrofit(String dni) {
        String tokenFinal = "Bearer " + token;
        log.info("prepareReniecRetrofit -> Ejecutando método de apoyo que crea el objeto retrofit completo");
        return reniecServiceRetrofit.getDataReniec(tokenFinal, dni);
    }
}
