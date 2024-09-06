package org.example;

public class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armaduraExtra;

    public int getForcaExtra() {
        return forcaExtra;
    }

    public int getArmaduraExtra() {
        return armaduraExtra;
    }

    public void setForcaExtra(int forcaExtra) {
        this.forcaExtra = forcaExtra;
    }

    public void setArmaduraExtra(int armaduraExtra) {
        this.armaduraExtra = armaduraExtra;
    }

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armaduraExtra) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armaduraExtra = armaduraExtra;
    }

    @Override
    public void atacar(Personagem inimigo){
        int dano = getAtk() + forcaExtra - inimigo.getDef();
        inimigo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano){
        int tempHp = getHp() + armaduraExtra - dano;
        if (getHp() > tempHp){
            setHp(tempHp);
        }else{
            System.out.println("Zero dano!");
        }

    }

    @Override
    public void exibirStatus() {
        System.out.printf("\nGuerreiro: %s\nNivel: %d\nHP: %d\nATK: %d\nDEF: %d\nForca Extra: %d\nArmadura Extra: %d\n",getNome(),getNivel(),getHp(),getAtk(),getDef(),getForcaExtra(),getArmaduraExtra());
    }

    @Override
    public void especial(Personagem inimigo) {
        atacar(inimigo);
    }
}
