package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {

    private double hrTrabalhadas;
    private double vlrHora;
    private double aux;

    public FuncionarioMeioPeriodo(String nome, String cpf, double salario, double hrTrabalhadas, double vlrHora) {
        super(nome, cpf, salario);
        this.hrTrabalhadas = hrTrabalhadas;
        this.vlrHora = vlrHora;
    }

    public FuncionarioMeioPeriodo(String nome, String cpf, double hrTrabalhadas, double vlrHora) {
        super(nome, cpf);
        this.hrTrabalhadas = hrTrabalhadas;
        this.vlrHora = vlrHora;
    }

    @Override
    public double calcularSalario() {
        aux= hrTrabalhadas*vlrHora;
        System.out.println("Salário: " + aux);
        return aux;
    }

    public double getHrTrabalhadas() {
        return hrTrabalhadas;
    }

    public double getVlrHora() {
        return vlrHora;
    }
}
