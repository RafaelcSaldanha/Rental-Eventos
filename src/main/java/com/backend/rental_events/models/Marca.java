package com.backend.rental_events.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "marca_id")
    private Integer marcaId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "ativo")
    private Boolean ativo;

    public Marca() {
    }

    public Marca(Integer marcaId, String nome, String observacao, Boolean ativo) {
        this.marcaId = marcaId;
        this.nome = nome;
        this.observacao = observacao;
        this.ativo = ativo;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
}
