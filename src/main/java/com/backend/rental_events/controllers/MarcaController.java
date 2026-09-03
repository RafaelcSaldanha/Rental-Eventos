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

import com.backend.rental_events.models.Marca;
import com.backend.rental_events.services.MarcaService;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/contar-marcas")
    public Long contarMarcas() {
        return marcaService.countMarcas();
    }

    @GetMapping("/buscar-marcas/{id}")
    public Marca buscarMarcaPorId(@PathVariable Integer id) {
        return marcaService.buscarMarcaPorId(id);
    }

    @GetMapping("/listar-marcas")
    public List<Marca> listarMarcas() {
        return marcaService.buscarTodasMarcas();
    }

    @DeleteMapping("/deletar-marcas/{id}")
    public String deletarMarca(@PathVariable Integer id) {
        if(marcaService.deletarMarca(id)) {
            return "Marca deletada com sucesso";
        }
        return "Erro ao deletar marca";
    }

    @PostMapping("/salvar-marcas")
    public Marca salvarMarca(@RequestBody Marca marca) {
        return marcaService.cadastrarMarca(marca);
    }

    @PostMapping("/atualizar-marcas/{id}")
    public String atualizarMarca(@PathVariable Integer id, @RequestBody Marca marca) {
        if(marcaService.atualizarMarca(id, marca) != null) {
            return "Marca atualizada com sucesso";
        }
        return "Erro ao atualizar marca";
    }
}
