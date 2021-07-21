package com.sone.ccvn.api.dtos.request;

import com.sone.ccvn.api.entities.Localidade;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
public class EnderecoDTO implements Serializable {

    private  Long id;

    private String cep;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private  LocalidadeDTO localidade;

    private Long localidade_id;

    //    private Long estado_id;
}
