package com.cleanArchitecture.pessoa_api.infrasctructure.controllers;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.infrasctructure.dtos.PessoaDto;

public class PessoaDtoMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto();
    }
}
