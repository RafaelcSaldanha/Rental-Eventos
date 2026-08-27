package com.backend.rental_events.models;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluguel")
public class Aluguel {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "aluguel_id")
    private Integer aluguelId;

    @Column(name = "data_locacao")
    private LocalDateTime dataLocacao;

    @Column(name = "data_devolucao")
    private LocalDateTime dataDevolucao;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "status")
    private String status;

    public Aluguel() {
    }

    public Aluguel(Integer aluguelId, LocalDateTime dataLocacao, LocalDateTime dataDevolucao, Double valorTotal, Integer clienteId, String status) {
        this.aluguelId = aluguelId;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.clienteId = clienteId;
        this.status = status;
    }

    public Integer getAluguelId() {
        return aluguelId;
    }

    public void setAluguelId(Integer aluguelId) {
        this.aluguelId = aluguelId;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
