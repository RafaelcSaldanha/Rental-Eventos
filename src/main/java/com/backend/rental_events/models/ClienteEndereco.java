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
@Table(name = "cliente_endereco")
public class ClienteEndereco {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "cliente_endereco_id")
    private Integer clienteEnderecoId;

    @OneToMany
    @JoinColumn(name = "cliente_id")
    private List<Cliente> cliente;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private List<Endereco> endereco;

    public ClienteEndereco() {
    }

    public ClienteEndereco(Integer clienteEnderecoId, List<Cliente> cliente, List<Endereco> endereco) {
        this.clienteEnderecoId = clienteEnderecoId;
        this.cliente = cliente;
        this.endereco = endereco;
    }

    public Integer getClienteEnderecoId() {
        return clienteEnderecoId;
    }

    public void setClienteEnderecoId(Integer clienteEnderecoId) {
        this.clienteEnderecoId = clienteEnderecoId;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
