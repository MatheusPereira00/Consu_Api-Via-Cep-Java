package com.matheus.api.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.matheus.api.model.Consumir;

@RestController
@RequestMapping("consulta-cep")

public class ConsuController {

    // instancia restTemplate
    // chama o metodo getForEntity da classe restTemplate para fazer uma solicitacao
    // http get para a api viacep.

    @GetMapping("{cep}")
    public Consumir consultaCep(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Consumir> resp = restTemplate
                .getForEntity(String.format("https://viacep.com.br/ws/%s/json", cep), Consumir.class);
        return resp.getBody();
    }

}
