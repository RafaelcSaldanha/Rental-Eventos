package com.backend.rental_events.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    @OneToOne
    @JoinColumn(name = "equipamento_id")
    private List<Equipamento> equipamento;

    @OneToMany
    @JoinColumn(name = "funcionario_id")
    private List<Funcionario> funcionario;

    public Movimentacao() {
    }

    public Movimentacao(Integer movimentacaoId, String tipo, String quantidade, LocalDate dataMovimentacao,
            List<Equipamento> equipamento, List<Funcionario> funcionario) {
        this.movimentacaoId = movimentacaoId;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.dataMovimentacao = dataMovimentacao;
        this.equipamento = equipamento;
        this.funcionario = funcionario;
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

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    
}
