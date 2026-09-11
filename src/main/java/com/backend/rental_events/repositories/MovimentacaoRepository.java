package com.backend.rental_events.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.rental_events.models.Movimentacao;

public interface  MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
    
}
