package com.backend.rental_events.models;

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
@Table(name = "aluguel_item")
public class AluguelItem {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "aluguel_item_id")
    private Integer aluguelItemId;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "valor_unitario")
    private Double valorUnitario;

    @OneToOne
    @JoinColumn(name = "aluguel_id")
    private List<Aluguel> aluguel;

    @OneToMany
    @JoinColumn(name = "equipamento_id")
    private List<Equipamento> equipamento;

    public AluguelItem() {
    }

    public AluguelItem(Integer aluguelItemId, Integer quantidade, Double valorUnitario, List<Aluguel> aluguel,
            List<Equipamento> equipamento) {
        this.aluguelItemId = aluguelItemId;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.aluguel = aluguel;
        this.equipamento = equipamento;
    }

    public Integer getAluguelItemId() {
        return aluguelItemId;
    }

    public void setAluguelItemId(Integer aluguelItemId) {
        this.aluguelItemId = aluguelItemId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public List<Aluguel> getAluguel() {
        return aluguel;
    }

    public void setAluguel(List<Aluguel> aluguel) {
        this.aluguel = aluguel;
    }

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }

    
}
