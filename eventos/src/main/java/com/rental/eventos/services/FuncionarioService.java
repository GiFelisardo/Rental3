package com.rental.eventos.services;

import org.springframework.stereotype.Service;
import com.rental.eventos.dto.LoginRequest;
import com.rental.eventos.models.Funcionario;
import com.rental.eventos.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public Funcionario login(LoginRequest login) {

        Funcionario funcionario = repository.findByNome(login.getNome())
                .orElseThrow(() -> new RuntimeException(
                        "Funcionário não encontrado."
                ));

        if (!funcionario.getSetor().equals(login.getSetor())) {
            throw new RuntimeException(
                    "O setor informado não corresponde ao funcionário."
            );
        }

        if (!funcionario.getSenha().equals(login.getSenha())) {
            throw new RuntimeException(
                    "Senha incorreta."
            );
        }

        return funcionario;
    }
}
