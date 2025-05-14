package com.cleanArchitecture.pessoa_api.infrasctructure.configuration;

import com.cleanArchitecture.pessoa_api.core.gateways.PessoaGateway;
import com.cleanArchitecture.pessoa_api.core.usecases.CreatePessoaUseCase;
import com.cleanArchitecture.pessoa_api.core.usecases.CreatePessoaUseCaseImpl;
import com.cleanArchitecture.pessoa_api.core.usecases.GetAllPessoasUseCase;
import com.cleanArchitecture.pessoa_api.core.usecases.GetAllPessoasUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUserCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public GetAllPessoasUseCase getAllPessoasUseCase(PessoaGateway pessoaGateway) {
        return new GetAllPessoasUseCaseImpl(pessoaGateway);
    }

}
