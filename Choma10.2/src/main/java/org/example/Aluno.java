package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    List<Professor> professor;


    public Aluno(String nome, int RA) {
        super(nome, RA);
        this.professor = new ArrayList<>();
    }

    public List<Professor> getProfessor(){
        return this.professor;
    }

    public void cadastrarProfessor(Professor prof){
        professor.add(prof);
    }
}
