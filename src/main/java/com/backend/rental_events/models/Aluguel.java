package com.backend.rental_events.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private List<Cliente> cliente;

    public Aluguel() {
    }

    public Aluguel(Integer aluguelId, LocalDateTime dataLocacao, LocalDateTime dataDevolucao, Double valorTotal,
            String status, List<Cliente> cliente) {
        this.aluguelId = aluguelId;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.status = status;
        this.cliente = cliente;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    
}
