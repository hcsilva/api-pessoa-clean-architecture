package com.cleanArchitecture.pessoa_api.infrasctructure.persistence;

import com.cleanArchitecture.pessoa_api.core.enums.EnumTipoPessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;

    @Enumerated(EnumType.STRING)
    private EnumTipoPessoa tipoPessoa;

    public PessoaEntity(Long id, String nome, String email, String cpfCnpj, EnumTipoPessoa tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.tipoPessoa = tipoPessoa;
    }

    public PessoaEntity() {
    }

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
