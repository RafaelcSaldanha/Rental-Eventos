package com.backend.rental_events.models;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @Column(name = "equipamento_id")
    private Integer equipamentoId;

    @Column(name = "status")
    private String status;

    public Alerta() {
    }

    public Alerta(Integer alertaId, String tipo, String descricao, LocalDateTime dataAlerta, Integer equipamentoId,
            String status) {
        this.alertaId = alertaId;
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataAlerta = dataAlerta;
        this.equipamentoId = equipamentoId;
        this.status = status;
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

    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
