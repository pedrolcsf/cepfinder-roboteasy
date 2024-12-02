package com.roboteasy.cepfinder.controller;

import com.roboteasy.cepfinder.model.CepResponse;
import com.roboteasy.cepfinder.service.CepServiceIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CepController {
    @Autowired
    private final CepServiceIMP cepService;

    public CepController(CepServiceIMP cepService) {
        this.cepService = cepService;
    }

    @Cacheable("cepCache")
    @GetMapping("/cep/{cep}")
    public CepResponse findCep(@PathVariable("cep") String cep) throws Exception {
        return cepService.findCep(cep);
    }
}
