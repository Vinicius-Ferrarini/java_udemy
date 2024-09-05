package org.example;

public class Pessoa {
    private String nome;
    private int RA;

    public Pessoa(String nome, int RA) {
        this.nome = nome;
        this.RA = RA;
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
}
