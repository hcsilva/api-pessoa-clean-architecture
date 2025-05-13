package com.cleanArchitecture.pessoa_api.core.usecases;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.core.gateways.PessoaGateway;

public class CreatePessoaUserCaseImpl implements CreatePessoaUserCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUserCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        return pessoaGateway.createPessoa(pessoa);
    }
}
