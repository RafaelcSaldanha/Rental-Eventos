package com.backend.rental_events.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.rental_events.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}