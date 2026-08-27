package com.backend.rental_events.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @Column(name = "aluguel_id")
    private Integer aluguelId;

    @Column(name = "equipamento_id")
    private Integer equipamentoId;

    public AluguelItem() {

    }

    public AluguelItem(Integer aluguelItemId, Integer quantidade, Double valorUnitario, Integer aluguelId,
            Integer equipamentoId) {
        this.aluguelItemId = aluguelItemId;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.aluguelId = aluguelId;
        this.equipamentoId = equipamentoId;
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

    public Integer getAluguelId() {
        return aluguelId;
    }

    public void setAluguelId(Integer aluguelId) {
        this.aluguelId = aluguelId;
    }

    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    
}
