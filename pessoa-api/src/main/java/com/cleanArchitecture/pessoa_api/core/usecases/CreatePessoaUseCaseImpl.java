package com.cleanArchitecture.pessoa_api.core.usecases;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.core.exceptions.BusinessException;
import com.cleanArchitecture.pessoa_api.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa pessoaEncontrada = pessoaGateway.findByCpfCnpj(pessoa.getCpfCnpj());

        if (pessoaEncontrada != null) {
            throw new BusinessException("Pessoa já existente com este CPF! "+pessoa.getCpfCnpj() );
        }

        return pessoaGateway.createPessoa(pessoa);
    }
}
