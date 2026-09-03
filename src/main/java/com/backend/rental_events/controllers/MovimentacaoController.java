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

import com.backend.rental_events.models.Movimentacao;
import com.backend.rental_events.services.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoService movimentacaoService;

    @GetMapping("/contar-movimentacoes")
    public Long contarMovimentacoes() {
        return movimentacaoService.countMovimentacoes();
    }

    @GetMapping("/buscar-movimentacoes/{id}")
    public Movimentacao buscarMovimentacaoPorId(@PathVariable Integer id) {
        return movimentacaoService.buscarMovimentacaoPorId(id);
    }

    @GetMapping("/listar-movimentacoes")
    public List<Movimentacao> listarMovimentacoes() {
        return movimentacaoService.buscarTodasMovimentacoes();
    }

    @DeleteMapping("/deletar-movimentacoes/{id}")
    public String deletarMovimentacao(@PathVariable Integer id) {
        if(movimentacaoService.deletarMovimentacao(id)) {
            return "Movimentacao deletada com sucesso";
        }
        return "Erro ao deletar movimentacao";
    }

    @PostMapping("/salvar-movimentacoes")
    public Movimentacao salvarMovimentacao(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.cadastrarMovimentacao(movimentacao);
    }

    @PostMapping("/atualizar-movimentacoes/{id}")
    public String atualizarMovimentacao(@PathVariable Integer id, @RequestBody Movimentacao movimentacao) {
        if(movimentacaoService.atualizarMovimentacao(id, movimentacao) != null) {
            return "Movimentacao atualizada com sucesso";
        }
        return "Erro ao atualizar movimentacao";
    }
}
