package com.cleanArchitecture.pessoa_api.core.gateways;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);
}
