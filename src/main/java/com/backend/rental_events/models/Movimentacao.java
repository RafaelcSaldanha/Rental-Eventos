package com.backend.rental_events.models;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimentacao")
public class Movimentacao {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "movimentacao_id")
    private Integer movimentacaoId;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "quantidade")
    private String quantidade;

    @Column(name = "data_movimentacao")
    private LocalDate dataMovimentacao;

    @Column(name = "equipamento_id")
    private Integer equipamentoId;

    @Column(name = "funcionario_id")
    private Integer funcionarioId;

    public Movimentacao() {
    }

    public Movimentacao(Integer movimentacaoId, String tipo, String quantidade, LocalDate dataMovimentacao,
            Integer equipamentoId, Integer funcionarioId) {
        this.movimentacaoId = movimentacaoId;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.dataMovimentacao = dataMovimentacao;
        this.equipamentoId = equipamentoId;
        this.funcionarioId = funcionarioId;
    }

    public Integer getMovimentacaoId() {
        return movimentacaoId;
    }

    public void setMovimentacaoId(Integer movimentacaoId) {
        this.movimentacaoId = movimentacaoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Integer funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    
}
