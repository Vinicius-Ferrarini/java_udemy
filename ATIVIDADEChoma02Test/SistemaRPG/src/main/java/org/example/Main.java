package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        Personagem personagem = null;
        Personagem inimigo = null;

        do {
            System.out.println("-------------MENU--------------");
            System.out.print("1-Escolha seu personagem!\n2-Escolha o personagem Inimigo!\n3-Batalhar!\n4-Sair\n");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("1-Guerreiro\n2-Mago\n3-Arqueiro\n");
                    int a = sc.nextInt();
                    personagem = Personagem.escolhaPersonagem(a) ;
                    break;
                case 2:
                    System.out.print("1-Guerreiro\n2-Mago\n3-Arqueiro\n");
                    int b = sc.nextInt();
                    inimigo = Personagem.escolhaPersonagem(b) ;
                    break;
                case 3:
                    if (personagem == null || inimigo == null){
                        System.out.println("Precisa declarar o oque voce e o inimigo é!!!");
                    }else{
                        System.out.println("---------Batalha-------");
                        int vez = 1;
                        int ataque = 1;
                        do {
                            if (vez == 1) {
                                System.out.printf("Turno do %s", personagem.getNome());
                                System.out.print("\n1-atacar\n2-ataque especial\n");
                                ataque = sc.nextInt();
                                if (ataque == 1){
                                    personagem.atacar(inimigo);
                                }else{
                                    personagem.especial();
                                }
                                inimigo.statusLuta();
                                vez = 2;
                            }else{
                                System.out.printf("Turno do %s", inimigo.getNome());
                                System.out.print("\n1-atacar\n2-ataque especial\n");
                                ataque = sc.nextInt();
                                if (ataque == 1){
                                    inimigo.atacar(personagem);
                                }else{
                                    inimigo.especial(personagem);
                                }
                                personagem.statusLuta();
                                vez = 1;
                            }
                        }while(inimigo.estaVivo() && personagem.estaVivo());

                        if (personagem.estaVivo()){
                            System.out.println("Você ganhou!!!");
                        }else{
                            System.out.println("Voce perdeu ;-;");
                        }
                    }
            }

        }while(opcao != 4);


        sc.close();
    }


}
