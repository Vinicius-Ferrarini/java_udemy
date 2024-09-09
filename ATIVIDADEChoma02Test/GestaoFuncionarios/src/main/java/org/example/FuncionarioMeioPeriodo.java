package org.example;

public class FuncionarioMeioPeriodo extends Funcionario{
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioMeioPeriodo(String nome, String cpf, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, horasTrabalhadas*valorHora);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Funcionario Meio periodo: %s,cpf: %s,horas Trabahadas: %f,valor hora: %f",getNome(),getCpf(),horasTrabalhadas,valorHora);
    }
}
