package com.backend.rental_events.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.rental_events.models.Marca;

@Repository
public interface MarcaRepository  extends JpaRepository<Marca, Integer> {
    
}
