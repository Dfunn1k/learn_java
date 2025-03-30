package com.codigo.ms_registros.retrofit;

import com.codigo.ms_registros.aggregates.response.ReniecResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

// La interfaz define el endpoint que vamos a consumir
public interface ClientReniecService {
    @GET("/v2/reniec/")
    Call<ReniecResponse> getDataReniec(@Header("Authorization") String token,
                                       @Query("dni") String dni);
}
