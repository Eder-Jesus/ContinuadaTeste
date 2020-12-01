/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.continuada3.modelo;

/**
 *
 * @author Aluno
 */
public class Usuario {
    public String nome;
    public String email;
    public String senha;
    public Integer tipoF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTipoF() {
        return tipoF;
    }

    public void setTipoF(Integer tipoF) {
        this.tipoF = tipoF;
    }
}
