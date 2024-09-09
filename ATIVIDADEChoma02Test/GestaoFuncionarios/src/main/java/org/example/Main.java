package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();
        int opcao = 0;
        do {
            System.out.println("1-Digitar funcionario Integral\n2-Digitar Funcionario Meio periodo\n3-Digitar Estagiario\n");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    cadastrarFuncionario();

            }

        }while (opcao != 4);


   void cadastrarFuncionario(){
            System.out.println("Digite o nome do funcionario");
            String tempNome = sc.nextLine();
        }

        sc.close();
    }



}
