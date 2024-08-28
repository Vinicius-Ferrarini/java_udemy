package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean status;

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        status = false;
    }

    public boolean isConcluida(){
        return status;
    }
    public void concluirTarefa(){
        status = true;
    }
    public void alterarPrazo(String novoPrazo){
        this.prazo = novoPrazo;
    }

}

