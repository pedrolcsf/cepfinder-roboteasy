package com.roboteasy.cepfinder.service;

import com.roboteasy.cepfinder.model.CepResponse;
import org.springframework.stereotype.Service;

@Service
public interface CepService {
    CepResponse findCep(String cep) throws Exception;
}
