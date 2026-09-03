package com.backend.rental_events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.rental_events.models.Categoria;
import com.backend.rental_events.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository; 

    public Long countCategorias() {
        return categoriaRepository.count();
    }

    public Categoria buscarCategoriaPorId(Integer id) {
        return categoriaRepository.findById(id).get();
    }

    public List<Categoria> buscarTodasCategorias() {
        return categoriaRepository.findAll();
    }

    public boolean deletarCategoria(Integer id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Categoria cadastrarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizarCategoria(Integer id, Categoria categoria) {
        Categoria categoriaRecuperado = buscarCategoriaPorId(id);
        if (categoriaRecuperado != null) {
            categoriaRecuperado.setCategoriaId(id);
            if (categoria.getNome() != null) {
                categoriaRecuperado.setNome(categoria.getNome());
            }
            if (categoria.getDescricao() != null) {
                categoriaRecuperado.setDescricao(categoria.getDescricao());
            }
            return categoriaRepository.save(categoriaRecuperado);
        }
        return null;
    }
}
