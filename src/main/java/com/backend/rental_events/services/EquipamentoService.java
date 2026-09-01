package com.backend.rental_events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.rental_events.models.Equipamento;
import com.backend.rental_events.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public Long countEquipamentos() {
        return equipamentoRepository.count();
    }

    public Equipamento buscarEquipamentoPorId(Integer id) {
        return equipamentoRepository.findById(id).get();
    }
    
    public List<Equipamento> buscarTodosEquipamentos() {
        return equipamentoRepository.findAll();
    }

    public Boolean deletarEquipamento(Integer id) {
        if (equipamentoRepository.existsById(id)) {
            equipamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Equipamento cadastrarEquipamento(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento atualizarEquipamento(Integer id, Equipamento equipamento) {
        Equipamento equipamentoRecuperado = buscarEquipamentoPorId(id);
        if (equipamentoRecuperado != null) {
            equipamentoRecuperado.setEquipamentoId(id);
            if (equipamento.getNome() != null) {
                equipamentoRecuperado.setNome(equipamento.getNome());
            }
            if (equipamento.getDescricao() != null) {
                equipamentoRecuperado.setDescricao(equipamento.getDescricao());
            }
            if (equipamento.getCategoria() != null) {
                equipamentoRecuperado.setCategoria(equipamento.getCategoria());
            }
            if (equipamento.getMarca() != null) {
                equipamentoRecuperado.setMarca(equipamento.getMarca());
            }
            if (equipamento.getQuantidadeDisponivel() != null) {
                equipamentoRecuperado.setQuantidadeDisponivel(equipamento.getQuantidadeDisponivel());
            }
            if (equipamento.getValorDiaria() != null) {
                equipamentoRecuperado.setValorDiaria(equipamento.getValorDiaria());
            }
            if (equipamento.getCor() != null) {
                equipamentoRecuperado.setCor(equipamento.getCor());
            }
            if (equipamento.getDimensoes() != null) {
                equipamentoRecuperado.setDimensoes(equipamento.getDimensoes());
            }
            if (equipamento.getPeso() != null) {
                equipamentoRecuperado.setPeso(equipamento.getPeso());
            }
            if (equipamento.getMaterial() != null) {
                equipamentoRecuperado.setMaterial(equipamento.getMaterial());
            }
            if (equipamento.getPotencia() != null) {
                equipamentoRecuperado.setPotencia(equipamento.getPotencia());
            }
            if (equipamento.getModelo() != null) {
                equipamentoRecuperado.setModelo(equipamento.getModelo());
            }
            if (equipamento.getQuantidadeMinima() != null) {
                equipamentoRecuperado.setQuantidadeMinima(equipamento.getQuantidadeMinima());
            }
            if (equipamento.getEstado() != null) {
                equipamentoRecuperado.setEstado(equipamento.getEstado());
            }
            return equipamentoRepository.save(equipamentoRecuperado);
        }
        return null;
    }
}
