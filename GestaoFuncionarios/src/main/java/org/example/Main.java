package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=0;
        int i=1;
        String nome;
        String cpf;
        double salario;

        String instEnsino;
        double bolsaAux;

        double hrTrabalhadas;
        double vlrHora;

        double bonus;

        // Lista para armazenar os funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while(op==0){
            System.out.println("1- Cadastrar Funcionario (Estagiario)");
            System.out.println("2- Cadastrar Funcionario (Funcionario)");
            System.out.println("3- Cadastrar Funcionario (FuncionarioMeioPeriodo)");
            System.out.println("4- Cadastrar Funcionario (FuncionarioTempoIntegral)");
            System.out.println("5- Sair");
            System.out.print("\nEscolha: ");
            op=sc.nextInt();
            sc.nextLine(); //Consome a quebra de linha
            if(op!=5){
                clearConsole();
            }
            else{
                System.out.println("\nFechando Programa :)");
            }



            switch (op){
                case 1: //cadastrar novo Funcionário (Funcionario
                    System.out.print("Digite o seu nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    cpf = sc.nextLine();
                    System.out.print("Digite o seu salário: ");
                    salario = sc.nextDouble();

                    // Criando o funcionário com nome, CPF fictício e salário
                    Funcionario funcionario = new Funcionario(nome, cpf, salario);
                    // Adicionando o funcionário à lista
                    funcionarios.add(funcionario);

                    //Printa as informações
                    System.out.println("\nInformações do funcionário criado: ");
                    System.out.println("Nome : " + funcionarios.get(0).getNome());
                    System.out.println("CPF : " + funcionarios.get(0).getCpf());
                    System.out.println("Salário : " + funcionarios.get(0).getSalarioBase());
                    sc.nextLine(); //Consome a quebra de linha
                    op=0;
                    clearConsole();
                    break;

                case 2: //cadastrar novo Funcionário (Estagiario)
                    System.out.print("Digite o seu nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    cpf = sc.nextLine();
                    System.out.print("Digite o seu Instituição de Ensino: ");
                    instEnsino = sc.nextLine();
                    System.out.print("Digite o seu Bolsa Aux: ");
                    bolsaAux = sc.nextDouble();
                    sc.nextLine(); //Consome a quebra de linha

                    // Criando o funcionário
                    Funcionario funcionario_est = new Estagiario(nome, cpf, instEnsino, bolsaAux);
                    // Adicionando o funcionário à lista
                    funcionarios.add(funcionario_est);

                    //Printa as informações
                    System.out.println("\nInformações do funcionário criado: ");
                    System.out.println("Nome : " + nome);
                    System.out.println("CPF : " + cpf);
                    System.out.println("Instituição de Ensino : " + instEnsino);
                    System.out.println("Bolsa Aux : " + bolsaAux);
                    sc.nextLine(); //Consome a quebra de linha
                    op=0;
                    clearConsole();
                    break;

                case 3: //cadastrar novo Funcionário (FuncionarioMeioPeriodo)
                    System.out.print("Digite o seu nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    cpf = sc.nextLine();
                    System.out.print("Digite o seu Horas Trabalhadas: ");
                    hrTrabalhadas = sc.nextDouble();
                    System.out.print("Digite o seu Valor Hora: ");
                    vlrHora = sc.nextDouble();

                    sc.nextLine(); //Consome a quebra de linha

                    // Criando o funcionário
                    Funcionario funcionario_Meio = new FuncionarioMeioPeriodo(nome, cpf, hrTrabalhadas, vlrHora);
                    // Adicionando o funcionário à lista
                    funcionarios.add(funcionario_Meio);

                    //Printa as informações
                    System.out.println("\nInformações do funcionário criado: ");
                    System.out.println("Nome : " + nome);
                    System.out.println("CPF : " + cpf);
                    System.out.println("Horas Trabalhadas : " + hrTrabalhadas);
                    System.out.println("Valor Hora : " + vlrHora);
                    System.out.println("\n============Enter para continuar============");
                    sc.nextLine(); //Consome a quebra de linha
                    op=0;
                    clearConsole();
                    break;

                case 4: //cadastrar novo Funcionário (FuncionarioTempoIntegral
                    System.out.print("Digite o seu nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    cpf = sc.nextLine();
                    System.out.print("Digite o seu Salario : ");
                    salario = sc.nextDouble();
                    System.out.print("Digite o seu Bônus : ");
                    bonus = sc.nextDouble();

                    sc.nextLine(); //Consome a quebra de linha

                    // Criando o funcionário
                    Funcionario funcionario_Int = new FuncionarioMeioPeriodo(nome, cpf, salario, bonus);
                    // Adicionando o funcionário à lista
                    funcionarios.add(funcionario_Int);

                    //Printa as informações
                    System.out.println("\nInformações do funcionário criado: ");
                    System.out.println("Nome : " + nome);
                    System.out.println("CPF : " + cpf);
                    System.out.println("Salário : " + salario);
                    System.out.println("Bônus : " + bonus);
                    System.out.println("\n============Enter para continuar============");
                    sc.nextLine(); //Consome a quebra de linha9
                    op=0;
                    clearConsole();
                    break;

            }
        }










/*
        Funcionario felipe = new FuncionarioMeioPeriodo("Felipe", "031", 20, 50);
        System.out.println("Nome: ");
        felipe.setNome(sc.nextLine());
        felipe.exibirInformacoes();

 */


    }
}
