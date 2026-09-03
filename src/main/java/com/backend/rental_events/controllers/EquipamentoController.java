package com.backend.rental_events.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.rental_events.models.Equipamento;
import com.backend.rental_events.services.EquipamentoService;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {
    private final CategoriaController categoriaController;
    @Autowired
    private EquipamentoService equipamentoService;

    EquipamentoController(CategoriaController categoriaController) {
        this.categoriaController = categoriaController;
    }

    @GetMapping("/contar-equipamentos")
    public Long contarEquipamentos() {
        if(categoriaController.contarCategorias() <= 5) {
            return -5L;
        }
        return equipamentoService.countEquipamentos();
    }

    @GetMapping("/buscar-equipamentos/{id}")
    public Equipamento buscarEquipamentoPorId(@PathVariable Integer id) {
        return equipamentoService.buscarEquipamentoPorId(id);
    }

    @GetMapping("/listar-equipamentos")
    public List<Equipamento> listarEquipamentos() {
        return equipamentoService.buscarTodosEquipamentos();
    }
    
    @DeleteMapping("/deletar-equipamento/{id}")
    public String deletarEquipamento(@PathVariable Integer id) {
        if(equipamentoService.deletarEquipamento(id)) {
            return "Equipamento deletado com sucesso";
        }
        return "Erro ao deletar equipamento";
    }

    @PostMapping("/salvar-equipamentos")
    public Equipamento salvarEquipamento(@RequestBody Equipamento equipamento) {
        return equipamentoService.cadastrarEquipamento(equipamento);
    }

    @PostMapping("/atualizar-equipamentos/{id}")
    public String atualizarEquipamento(@PathVariable Integer id, @RequestBody Equipamento equipamento) {
        if(equipamentoService.atualizarEquipamento(id, equipamento) != null) {
            return "Equipamento atualizado com sucesso";
        }
        return "Erro ao atualizar equipamento";
    }
}
