package com.cleanArchitecture.pessoa_api.infrasctructure.gateways;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.core.gateways.PessoaGateway;
import com.cleanArchitecture.pessoa_api.infrasctructure.persistence.PessoaEntity;
import com.cleanArchitecture.pessoa_api.infrasctructure.persistence.PessoaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PessoaRepositoryGateway implements PessoaGateway {

    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper pessoaEntityMapper;

    public PessoaRepositoryGateway(PessoaRepository pessoaRepository, PessoaEntityMapper pessoaEntityMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaEntityMapper = pessoaEntityMapper;
    }

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        PessoaEntity entity = pessoaEntityMapper.toEntity(pessoa);
        PessoaEntity pessoaSalva = pessoaRepository.save(entity);
        return pessoaEntityMapper.toPessoa(pessoaSalva);
    }

    @Override
    public Pessoa findByCpfCnpj(String cpfCnpj) {
        PessoaEntity pessoaEncontrada = pessoaRepository.findByCpfCnpj(cpfCnpj);
        if (pessoaEncontrada == null) {
            return null;
        }
        return pessoaEntityMapper.toPessoa(pessoaEncontrada);
    }

    @Override
    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll().stream()
                .map(pessoaEntityMapper::toPessoa)
                .collect(Collectors.toList());
    }
}
