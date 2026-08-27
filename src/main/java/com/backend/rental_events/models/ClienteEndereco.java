package com.backend.rental_events.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente_endereco")
public class ClienteEndereco {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "cliente_endereco_id")
    private Integer clienteEnderecoId;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "endereco_id")
    private Integer enderecoId;

    public ClienteEndereco() {

    }

    public ClienteEndereco(Integer clienteEnderecoId, Integer clienteId, Integer enderecoId) {
        this.clienteEnderecoId = clienteEnderecoId;
        this.clienteId = clienteId;
        this.enderecoId = enderecoId;
    }

    public Integer getClienteEnderecoId() {
        return clienteEnderecoId;
    }

    public void setClienteEnderecoId(Integer clienteEnderecoId) {
        this.clienteEnderecoId = clienteEnderecoId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    
}
