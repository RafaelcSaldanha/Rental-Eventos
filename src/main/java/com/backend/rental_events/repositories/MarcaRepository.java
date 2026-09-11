package com.backend.rental_events.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.rental_events.models.Marca;

public interface MarcaRepository  extends JpaRepository<Marca, Integer> {
    
}
