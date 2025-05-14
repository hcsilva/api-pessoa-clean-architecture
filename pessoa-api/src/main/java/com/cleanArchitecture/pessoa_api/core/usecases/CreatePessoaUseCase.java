package com.cleanArchitecture.pessoa_api.core.usecases;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;

public interface CreatePessoaUseCase {

    Pessoa execute(Pessoa pessoa);
}
