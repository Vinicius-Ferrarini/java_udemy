package org.example;

public abstract class Personagem {
    private String nome;
    private int nivel;
    private int hp;
    private int atk;
    private int def;

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void atacar(Personagem inimigo){
        int dano = atk - inimigo.def;
        inimigo.receberDano(dano);
    }

    public void especial(){}

    public void receberDano(int dano){
        hp -= dano;
    }


    public void exibirStatus(){
        System.out.printf("\nNome: %s\nNivel: %d\nHP: %d\nATK: %d\nDEF: %d\n",getNome(),getNivel(),getHp(),getAtk(),getDef());
    }

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public boolean estaVivo(){
        if (getHp() > 0){
            return true;
        }else{
            return false;
        }
    }


    public void statusLuta(){
        System.out.printf("%s , HP: %d \n",nome,hp);
    }


    public static Personagem escolhaPersonagem(int opcao){
        switch (opcao){
            case 1:
                return new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);

            case 2:
                return new Mago("Gandalf", 10, 80, 15, 5, 50, 25);

            case 3:
                return new Arqueiro("Legolas", 10, 90, 18, 8, 10, 15);

            default:
                System.out.println("Digita certo po ;-;");
                return null;
        }
    }

    public abstract void especial(Personagem inimigo);
}
