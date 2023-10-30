package com.matheus.api.model;

import lombok.Data;

@Data
public class Consumir {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String ibge;
    private String ddd;
    private String siafi;
}
