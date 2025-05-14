package com.cleanArchitecture.pessoa_api.infrasctructure.controllers;

import com.cleanArchitecture.pessoa_api.core.entities.Pessoa;
import com.cleanArchitecture.pessoa_api.core.usecases.CreatePessoaUseCase;
import com.cleanArchitecture.pessoa_api.core.usecases.GetAllPessoasUseCase;
import com.cleanArchitecture.pessoa_api.infrasctructure.dtos.PessoaDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final GetAllPessoasUseCase getAllPessoasUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;

    public PessoaController(CreatePessoaUseCase createPessoaUseCase, GetAllPessoasUseCase getAllPessoasUseCase, PessoaDtoMapper pessoaDtoMapper) {
        this.createPessoaUseCase = createPessoaUseCase;
        this.getAllPessoasUseCase = getAllPessoasUseCase;
        this.pessoaDtoMapper = pessoaDtoMapper;
    }

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        Pessoa novaPessoa = createPessoaUseCase.execute(pessoaDtoMapper.toDomain(pessoaDto));
        return pessoaDtoMapper.toDto(novaPessoa);
    }

    @GetMapping
    public List<PessoaDto> getAllPessoas() {
        return getAllPessoasUseCase.execute().stream()
                .map(pessoaDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
