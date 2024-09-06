package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor  extends Pessoa{

    List<Aluno> alunos = new ArrayList<>();
    String disciplina;

    public Professor(String nome, int RA,String disciplina) {
        super(nome, RA);
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno alu){
        alunos.add(alu);
    }
}
