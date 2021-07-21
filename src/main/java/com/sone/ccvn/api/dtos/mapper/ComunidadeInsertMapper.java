package com.sone.ccvn.api.dtos.mapper;

import com.sone.ccvn.api.dtos.request.ComunidadeEntradaDTO;
import com.sone.ccvn.api.entities.Comunidade;
import com.sone.ccvn.api.entities.Endereco;
import com.sone.ccvn.api.entities.Localidade;
import org.springframework.stereotype.Component;
import java.util.Date;

//@Component
public class ComunidadeInsertMapper {
//
//    private final TelefoneMapper mapperTelefone = TelefoneMapper.INSTANCE;
//
//    public Comunidade ComunidadeDTOToComunidade(ComunidadeEntradaDTO obj) {
//
//        Comunidade comunidade = new Comunidade(
//                null,
//                obj.getNome(),
//                obj.getNomeFantasia(),
//                obj.getRazaoSocial(),
//                obj.getCnpj(),
//                obj.getInscEstadual(),
//                obj.getEmail(),
//                new Date(),
//                obj.getStatus()
//        );
//
//        comunidade.getTelefones().addAll(mapperTelefone.toListTelefones(obj.getTelefones()));
//
//        Localidade localidade = new Localidade(obj.getLocalidade_id(), null, null);
//
//        Endereco endereco = new Endereco(
//                null,
//                obj.getCep(),
//                obj.getLogradouro(),
//                obj.getNumero(),
//                obj.getComplemento(),
//                obj.getBairro(),
//                localidade,
//                comunidade
//        );
//
//        comunidade.getEnderecos().add(endereco);
//        return comunidade;
//    }
}
