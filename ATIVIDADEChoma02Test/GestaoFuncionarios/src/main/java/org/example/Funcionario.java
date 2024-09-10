package org.example;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void cadastrarFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario");
        String tempNome = sc.nextLine();
        System.out.println("Digite o cpf do funcionario:");
        String tempCpf = sc.nextLine();
        System.out.println("Salario do funcionario:");
        double tempSalarioBase = sc.nextInt();
        sc.next();

        sc.close();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void exibirInformacoes(){
        System.out.printf("O funcionario: %s,cpf: %s,salario %.2f",nome,cpf,salarioBase);
    }

}
