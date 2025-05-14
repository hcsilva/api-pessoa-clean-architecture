package com.cleanArchitecture.pessoa_api.core.usecases;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;

import java.util.List;

public interface GetAllPessoasUseCase {

    List<Pessoa> execute();
}
