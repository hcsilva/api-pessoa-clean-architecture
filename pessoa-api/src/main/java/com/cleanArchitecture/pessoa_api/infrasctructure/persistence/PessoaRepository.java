package com.cleanArchitecture.pessoa_api.infrasctructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    PessoaEntity findByCpfCnpj(String cpfCnpj);
}
