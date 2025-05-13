package com.cleanArchitecture.pessoa_api.infrasctructure.controllers;

import com.cleanArchitecture.pessoa_api.core.usecases.CreatePessoaUserCase;
import com.cleanArchitecture.pessoa_api.infrasctructure.dtos.PessoaDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

    private final CreatePessoaUserCase createPessoaUserCase;

    public PessoaController(CreatePessoaUserCase createPessoaUserCase) {
        this.createPessoaUserCase = createPessoaUserCase;
    }

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto){

    }
}
