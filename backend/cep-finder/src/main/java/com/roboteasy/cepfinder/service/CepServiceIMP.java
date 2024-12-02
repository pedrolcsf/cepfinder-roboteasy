package com.roboteasy.cepfinder.service;

import com.roboteasy.cepfinder.model.CepResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CepServiceIMP implements CepService {
    @Override
    public CepResponse findCep(String cep) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        if (!isCepValid(cep)) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "CEP inválido");
        }
        try {
            return restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json", CepResponse.class);
        }
        catch (Exception e) {
            throw new Exception("Erro ao buscar CEP");
        }
    }

    private Boolean isCepValid(String cep) {
        return cep.matches("[0-9]{8}");
    }
}
