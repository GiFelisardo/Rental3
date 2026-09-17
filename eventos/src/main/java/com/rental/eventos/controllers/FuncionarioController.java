package com.rental.eventos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rental.eventos.models.Funcionario;
import com.rental.eventos.services.FuncionarioService;
import com.rental.eventos.dto.LoginRequest;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowide
    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Funcionario> cadastrar(
            @RequestBody Funcionario funcionario) {

        Funcionario novoFuncionario =
                funcionarioService.cadastrar(funcionario);

        return ResponseEntity.ok(novoFuncionario);
    }

    @GetMapping("/perfil")
    public ResponseEntity<String> perfil() {
        return ResponseEntity.ok("Você está autenticado!");

        @PostMapping("/login")
public ResponseEntity<Funcionario> login(
        @RequestBody LoginRequest loginRequest) {

    Funcionario funcionario = funcionarioService.login(
            loginRequest.getNome(),
            loginRequest.getSenha()
    );

    return ResponseEntity.ok(funcionario);
}
    }
}
