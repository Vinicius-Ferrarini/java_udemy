package org.example;

public class FuncionarioTempoIntegral extends Funcionario{
    private double bonus;


    public FuncionarioTempoIntegral(String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus= bonus;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Salário: " + getSalarioBase()*(this.bonus/100));
        return (getSalarioBase() + getSalarioBase()*(this.bonus/100));
    }

    public double getBonus() {
        return bonus;
    }
}
