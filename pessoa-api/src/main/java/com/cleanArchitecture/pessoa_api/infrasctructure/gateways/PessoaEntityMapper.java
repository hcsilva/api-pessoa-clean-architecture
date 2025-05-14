package com.cleanArchitecture.pessoa_api.infrasctructure.gateways;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.infrasctructure.persistence.PessoaEntity;
import org.springframework.stereotype.Component;

@Component
public class PessoaEntityMapper {

    public PessoaEntity toEntity(Pessoa pessoa) {
        return new PessoaEntity(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getCpfCnpj(), pessoa.getTipoPessoa());
    }

    public Pessoa toPessoa(PessoaEntity pessoa) {
        return new Pessoa(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getCpfCnpj(), pessoa.getTipoPessoa());
    }
}
