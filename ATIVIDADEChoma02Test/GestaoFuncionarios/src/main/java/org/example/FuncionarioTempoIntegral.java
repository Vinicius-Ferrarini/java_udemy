package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonus;


    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()  * (bonus/100+1);
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Funcionario tempo integral: %s,cpf: %s,salario Base: %f,Bonus: %f",getNome(),getCpf(),getSalarioBase(),bonus);
    }
}
