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

import com.backend.rental_events.models.Funcionario;
import com.backend.rental_events.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/contar-funcionarios")
    public Long contarFuncionarios() {
        return funcionarioService.countFuncionarios();
    }

    @GetMapping("/buscar-funcionarios/{id}")
    public Funcionario buscarFuncionarioPorId(@PathVariable Integer id) {
        return funcionarioService.buscarFuncionarioPorId(id);
    }

    @GetMapping("/listar-funcionarios")
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.buscarTodosFuncionarios();
    }

    @DeleteMapping("/deletar-funcionario/{id}")
    public String deletarFuncionario(@PathVariable Integer id) {
        if(funcionarioService.deletarFuncionario(id)) {
            return "Funcionario deletado com sucesso";
        }
        return "Erro ao deletar funcionario";
    }

    @PostMapping("/salvar-funcionarios")
    public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.cadastrarFuncionario(funcionario);
    }

    @PostMapping("/atualizar-funcionarios/{id}")
    public String atualizarFuncionario(@PathVariable Integer id, @RequestBody Funcionario funcionario) {
        if(funcionarioService.atualizarFuncionario(id, funcionario) != null) {
            return "Funcionario atualizado com sucesso";
        }
        return "Erro ao atualizar funcionario";
    } 
}
