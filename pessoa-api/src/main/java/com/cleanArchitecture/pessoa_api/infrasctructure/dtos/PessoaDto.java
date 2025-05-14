package com.cleanArchitecture.pessoa_api.infrasctructure.dtos;

import com.cleanArchitecture.pessoa_api.core.enums.EnumTipoPessoa;

public record PessoaDto(
        String nome,
        String email,
        String cpfCnpj,
        EnumTipoPessoa tipoPessoa
) {
}
