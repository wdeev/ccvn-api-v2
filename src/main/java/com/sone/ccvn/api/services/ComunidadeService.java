package com.sone.ccvn.api.services;

import com.sone.ccvn.api.services.dtos.request.ComunidadeDTO;
import com.sone.ccvn.api.services.dtos.response.MessageResponseDTO;
import com.sone.ccvn.api.services.exception.ObjectNotFoundException;

import java.util.List;

public interface ComunidadeService {

    List<ComunidadeDTO> findAll();

    ComunidadeDTO create(ComunidadeDTO obj);

    ComunidadeDTO findById(Long id) throws ObjectNotFoundException;

    MessageResponseDTO updateById(Long id, ComunidadeDTO dto) throws ObjectNotFoundException;

    void delete(Long id) throws ObjectNotFoundException;
}
