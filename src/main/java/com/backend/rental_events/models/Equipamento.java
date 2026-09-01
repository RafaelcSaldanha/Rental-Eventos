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
@Table(name = "equipamentos")
public class Equipamento {
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column(name = "equipamento_id")
    private Integer equipamentoId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "potencia")
    private String potencia;

    @Column(name = "material")
    private String material;

    @Column(name = "peso")
    private String peso;

    @Column(name = "dimensoes")
    private String dimensoes;

    @Column(name = "cor")
    private String cor;

    @Column(name = "quantidade_disponivel")
    private Integer quantidadeDisponivel;

    @Column(name = "quantidade_minima")
    private Integer quantidadeMinima;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor_diaria")
    private String valorDiaria;

    @Column(name = "estado")
    private String estado;

    @OneToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
    private List<Categoria> categoria;

    @OneToMany
    @JoinColumn(name = "marca_id", referencedColumnName = "marca_id")
    private List<Marca> marca;

    public Equipamento() {
    }

    public Equipamento(Integer equipamentoId, String nome, String modelo, String potencia, String material, String peso,
            String dimensoes, String cor, Integer quantidadeDisponivel, Integer quantidadeMinima, String descricao,
            String valorDiaria, String estado, List<Categoria> categoria, List<Marca> marca) {
        this.equipamentoId = equipamentoId;
        this.nome = nome;
        this.modelo = modelo;
        this.potencia = potencia;
        this.material = material;
        this.peso = peso;
        this.dimensoes = dimensoes;
        this.cor = cor;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.quantidadeMinima = quantidadeMinima;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.estado = estado;
        this.categoria = categoria;
        this.marca = marca;
    }

    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(String valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<Marca> getMarca() {
        return marca;
    }

    public void setMarca(List<Marca> marca) {
        this.marca = marca;
    }
}