package com.matheus.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.matheus.api.model.Consumir;

@Service
public class ConsumirService {

    public Consumir consultaServiceCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Consumir> resp = restTemplate
                .getForEntity(String.format("https://viacep.com.br/ws/%s/json", cep), Consumir.class);
        return resp.getBody();
    }
}
