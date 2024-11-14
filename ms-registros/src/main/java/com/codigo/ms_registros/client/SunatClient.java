package com.codigo.ms_registros.client;

import com.codigo.ms_registros.aggregates.response.SunatResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sunat-client", url="https://api.apis.net.pe/v2/sunat/")
public interface SunatClient {
    @GetMapping("ruc/full")
    SunatResponse getLegalPersonSunat(@RequestParam("numero") String ruc,
                                      @RequestHeader("Authorization") String token);
}
