package com.backend.rental_events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.rental_events.models.Marca;
import com.backend.rental_events.repositories.MarcaRepository;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public Long countMarcas() {
        return marcaRepository.count();
    }

    public Marca buscarMarcaPorId(Integer id) {
        return marcaRepository.findById(id).get();
    }

    public List<Marca> buscarTodasMarcas() {
        return marcaRepository.findAll();
    }

    public Boolean deletarMarca(Integer id) {
        if (marcaRepository.existsById(id)) {
            marcaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Marca cadastrarMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Marca atualizarMarca(Integer id, Marca marca) {
        Marca marcaRecuperada = buscarMarcaPorId(id);
        if (marcaRecuperada != null) {
            marcaRecuperada.setMarcaId(id);
            if (marca.getNome() != null) {
                marcaRecuperada.setNome(marca.getNome());
            }
            if (marca.getObservacao() != null) {
                marcaRecuperada.setObservacao(marca.getObservacao());
            }
            if (marca.getAtivo() != null) {
                marcaRecuperada.setAtivo(marca.getAtivo());
            }
            return marcaRepository.save(marcaRecuperada);
        }
        return null;
    }
}
