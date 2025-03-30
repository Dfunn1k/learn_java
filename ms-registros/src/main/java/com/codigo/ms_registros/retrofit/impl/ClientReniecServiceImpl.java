package com.codigo.ms_registros.retrofit.impl;

import com.codigo.ms_registros.aggregates.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Generando un cliente retrofit, nos prepara la solicitud
@Slf4j
public class ClientReniecServiceImpl {
    private static final String BASE_URL = Constants.BASE_URL;
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            log.info("ClientReniecServiceImpl -> CREANDO CLIENTE RETROFIT CON URL Y PARAMETROS(SIN VALORES)");
        }
        return retrofit;
    }
}
