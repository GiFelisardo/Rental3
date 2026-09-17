package com.rental.eventos.dto;

public class LoginRequest {

    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Object getSetor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
