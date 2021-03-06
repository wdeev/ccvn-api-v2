package com.sone.ccvn.api.services.dtos.request;

import com.sone.ccvn.api.entities.enums.TelefoneTipo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO implements Serializable {

    private Long id;

    @Enumerated(EnumType.STRING)
    private TelefoneTipo tipo;

    private String numero;


}
