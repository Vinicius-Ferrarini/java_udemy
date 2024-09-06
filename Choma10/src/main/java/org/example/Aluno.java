package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int RA;
    private List<Professor> professores;


    public Aluno(String nome, int RA) {
        this.nome = nome;
        this.RA = RA;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public void cadastrarProfessor(Professor professor){
        professores.add(professor);
    }

}
