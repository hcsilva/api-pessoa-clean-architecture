package com.cleanArchitecture.pessoa_api.core.usecases;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;

public interface CreatePessoaUserCase {

    Pessoa execute(Pessoa pessoa);
}
