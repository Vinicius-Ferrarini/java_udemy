package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private int registro;
    List<Aluno> aluno;

    public Professor(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
        this.aluno = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public void addAluno(Aluno aluno ){
        this.aluno.add(aluno);
    }
}
