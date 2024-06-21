package com.castelo.caixa_escola.DTO;

import com.castelo.caixa_escola.Professor;

public class ProfessorDTO {
 
    private String nome;
    private int Idade;


    public ProfessorDTO() {
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return Idade;
    }


    public void setIdade(int idade) {
        Idade = idade;
    }

    public Professor newprofessor() {
        return new Professor(this.nome, this.Idade);
    }
}
