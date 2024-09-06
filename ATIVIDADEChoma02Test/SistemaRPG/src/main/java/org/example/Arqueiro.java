package org.example;

public class Arqueiro extends Personagem {
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    public void atirarFlecha(Personagem inimigo){
        int dano = getAtk() + getPrecisao() - inimigo.getDef();
        inimigo.receberDano(dano);
    }
    public int testDano(Personagem inimigo){
        return getAtk() + getPrecisao() - inimigo.getDef();
    }

    @Override
    public void exibirStatus() {
        System.out.printf("\nArqueiro: %s\nNivel: %d\nHP: %d\nATK: %d\nDEF: %d\nPrecisao: %d\nAlcance: %d\n",getNome(),getNivel(),getHp(),getAtk(),getDef(),getPrecisao(),getAlcance());
    }

    @Override
    public void especial(Personagem inimigo) {
        this.atirarFlecha(inimigo);
    }

    //System.out.printf("Arqueiro: %s\nNivel: %d\nHP: %d\nATK: %d\nDEF: %d",getNome(),getNivel(),getHp(),getAtk(),getDef());
}
