package com.backend.rental_events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.rental_events.models.Movimentacao;
import com.backend.rental_events.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public Long countMovimentacoes() {
        return movimentacaoRepository.count();
    }

    public Movimentacao buscarMovimentacaoPorId(Integer id) {
        return movimentacaoRepository.findById(id).get();
    }

    public List<Movimentacao> buscarTodasMovimentacoes() {
        return movimentacaoRepository.findAll();
    }

    public Boolean deletarMovimentacao(Integer id) {
        if (movimentacaoRepository.existsById(id)) {
            movimentacaoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Movimentacao atualizarMovimentacao(Integer id, Movimentacao movimentacao) {
        Movimentacao movimentacaoRecuperada = buscarMovimentacaoPorId(id);
        if (movimentacaoRecuperada != null) {
            movimentacaoRecuperada.setMovimentacaoId(id);
            if (movimentacao.getEquipamento() != null) {
                movimentacaoRecuperada.setEquipamento(movimentacao.getEquipamento());
            }
            if (movimentacao.getFuncionario() != null) {
                movimentacaoRecuperada.setFuncionario(movimentacao.getFuncionario());
            }
            if (movimentacao.getDataMovimentacao() != null) {
                movimentacaoRecuperada.setDataMovimentacao(movimentacao.getDataMovimentacao());
            }
            if (movimentacao.getTipo() != null) {
                movimentacaoRecuperada.setTipo(movimentacao.getTipo());
            }

            if (movimentacao.getQuantidade() != null) {
                movimentacaoRecuperada.setQuantidade(movimentacao.getQuantidade());
            }
            return movimentacaoRepository.save(movimentacaoRecuperada);
        }
        return null;
    }
}
