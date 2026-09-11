package com.backend.rental_events.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.rental_events.models.Categoria;
import com.backend.rental_events.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    // Injeção de dependência via construtor
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/contar")
    public Long contarCategorias() {
        return categoriaService.countCategorias();
    }

    @GetMapping("/buscar{id}")
    public Categoria buscarCategoriaPorId(@PathVariable Integer id) {
        return categoriaService.buscarCategoriaPorId(id);
    }
    
    @GetMapping("/listar")
    public List<Categoria> listarCategorias() {
        return categoriaService.buscarTodasCategorias();
    }
    
    @DeleteMapping("/deletar{id}")
    public String deletarCategoria(@PathVariable Integer id) {
        if (categoriaService.deletarCategoria(id)) {
            return "Categoria deletada com sucesso";
        }
        return "Erro ao deletar categoria";
    }

    @PostMapping
    public Categoria salvarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.cadastrarCategoria(categoria);
    }

    @PutMapping("/atualizar{id}")
    public String atualizarCategoria(@PathVariable Integer id, @RequestBody Categoria categoria) {
        if (categoriaService.atualizarCategoria(id, categoria) != null) {
            return "Categoria atualizada com sucesso";
        }
        return "Erro ao atualizar categoria";
    }
}