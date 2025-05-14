package com.cleanArchitecture.pessoa_api.infrasctructure.controllers;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.infrasctructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.getNome(), pessoa.getEmail(), pessoa.getCpfCnpj(), pessoa.getTipoPessoa());
    }

    public Pessoa toDomain(PessoaDto pessoaDto) {
        return new Pessoa(null, pessoaDto.nome(), pessoaDto.email(), pessoaDto.cpfCnpj(), pessoaDto.tipoPessoa());
    }
}
