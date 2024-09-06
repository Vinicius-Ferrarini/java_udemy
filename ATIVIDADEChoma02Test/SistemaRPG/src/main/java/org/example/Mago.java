package org.example;

public class Mago extends Personagem{
    private int mana;
    private int ap;

    public int getMana() {
        return mana;
    }

    public int getAp() {
        return ap;
    }

    public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int ap) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.ap = ap;
    }
    public void lancarMagia(Personagem inimigo) {
        if (mana >= 10) {
            mana -= 10;
            int dano = ap - inimigo.getDef();
            inimigo.receberDano(dano);
        }else{
            System.out.println("Sem mana!!");
        }
    }

    @Override
    public void exibirStatus() {
        System.out.printf("\nMago: %s\nNivel: %d\nHP: %d\nATK: %d\nDEF: %d\nMana: %d\nPoder magico: %d\n",getNome(),getNivel(),getHp(),getAtk(),getDef(),getMana(),getAp());
    }

    @Override
    public void especial(Personagem inimigo) {
        this.lancarMagia(inimigo);
    }
}
