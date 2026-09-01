package com.backend.rental_events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.rental_events.models.Funcionario;
import com.backend.rental_events.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Long countFuncionarios() {
        return funcionarioRepository.count();
    }

    public Funcionario buscarFuncionarioPorId(Integer id) {
        return funcionarioRepository.findById(id).get();
    }

    public List<Funcionario> buscarTodosFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Boolean deletarFuncionario(Integer id) {
        if (funcionarioRepository.existsById(id)) {
            funcionarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Funcionario cadastrarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizarFuncionario(Integer id, Funcionario funcionario) {
        Funcionario funcionarioRecuperado = buscarFuncionarioPorId(id);
        if (funcionarioRecuperado != null) {
            funcionarioRecuperado.setFuncionarioId(id);
            if (funcionario.getNome() != null) {
                funcionarioRecuperado.setNome(funcionario.getNome());
            }
            if (funcionario.getEmail() != null) {
                funcionarioRecuperado.setEmail(funcionario.getEmail());
            }
            if (funcionario.getSenha() != null) {
                funcionarioRecuperado.setSenha(funcionario.getSenha());
            }
            if (funcionario.getCargo() != null) {
                funcionarioRecuperado.setCargo(funcionario.getCargo());
            }
            return funcionarioRepository.save(funcionarioRecuperado);
        }
        return null;
    }
}
