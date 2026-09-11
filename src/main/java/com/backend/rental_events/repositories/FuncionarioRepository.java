package com.backend.rental_events.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.rental_events.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    
}
