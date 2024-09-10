package org.example;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Métodos
    public double calcularSalario(){
        return this.salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Salario: " + getSalarioBase());
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalarioBase(double salario) {
        this.salario = salario;
    }
}


