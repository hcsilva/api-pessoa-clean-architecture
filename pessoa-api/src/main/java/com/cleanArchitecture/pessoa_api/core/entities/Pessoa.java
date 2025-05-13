package com.cleanArchitecture.pessoa_api.core.entities;

import com.cleanArchitecture.pessoa_api.core.enums.EnumTipoPessoa;

public class Pessoa {
    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;
    private EnumTipoPessoa tipoPessoa;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public EnumTipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
