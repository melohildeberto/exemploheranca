package com.exemplo.heranca.exemploheranca;

import jakarta.persistence.Column;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa {
    @Column(name = "nome")
    public String nome;
    @Column(name = "cpf")
    public String cpf;
}
