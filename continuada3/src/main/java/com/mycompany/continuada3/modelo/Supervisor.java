/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.continuada3.modelo;

import com.mycompany.continuada3.TelaGerencia;

/**
 *
 * @author Aluno
 */
public class Supervisor extends Funcionario{

    @Override
    public String trabalhar(String frase) {
        TelaGerencia tela = new TelaGerencia();
        frase = "Funcionario trabalhando - Supervisor";
        return frase;
    }

   
    
}
