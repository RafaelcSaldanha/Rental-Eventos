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
@Table(name = "alerta")
public class Alerta {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "alerta_id")
    private Integer alertaId;
    
    @Column(name = "tipo")
    private String tipo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_alerta")
    private LocalDateTime dataAlerta;

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "equipamento_id")
    private List<Equipamento> equipamento;

    public Alerta() {
    }

    public Alerta(Integer alertaId, String tipo, String descricao, LocalDateTime dataAlerta, String status,
            List<Equipamento> equipamento) {
        this.alertaId = alertaId;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataAlerta = dataAlerta;
        this.status = status;
        this.equipamento = equipamento;
    }

    public Integer getAlertaId() {
        return alertaId;
    }

    public void setAlertaId(Integer alertaId) {
        this.alertaId = alertaId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataAlerta() {
        return dataAlerta;
    }

    public void setDataAlerta(LocalDateTime dataAlerta) {
        this.dataAlerta = dataAlerta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }

    
}
