package com.cleanArchitecture.pessoa_api.core.usecases;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.core.exceptions.BusinessException;
import com.cleanArchitecture.pessoa_api.core.gateways.PessoaGateway;

import java.util.List;

public class GetAllPessoasUseCaseImpl implements GetAllPessoasUseCase {

    private final PessoaGateway pessoaGateway;

    public GetAllPessoasUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public List<Pessoa> execute() {
        return pessoaGateway.getAllPessoas();
    }
}
