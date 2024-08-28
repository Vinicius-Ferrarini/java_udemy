package org.example;

public class Pontuacao {
    private int pontuacao;

    public void adicionarPontos(int pontos){
        this.pontuacao += pontos;
    }

    public void removerPontos(int pontos){
        if (pontos <= pontuacao)
            this.pontuacao -= pontos;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
