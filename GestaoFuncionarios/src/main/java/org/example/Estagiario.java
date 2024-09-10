package org.example;

public class Estagiario extends Funcionario{

    private String instEnsino;
    private double bolsaAux;

    public Estagiario(String nome, String cpf,String instEnsino , double bolsaAux) {
        super(nome, cpf);
        this.instEnsino = instEnsino;
        this.bolsaAux = bolsaAux;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "instEnsino: " + getInstituicaoEnsino() + "\n" + "bolsaAux: " + getBolsaAux());
    }

    @Override
    public double calcularSalario(){
        System.out.println("Salário: " + getBolsaAux());
        return this.bolsaAux;
    }


    public String getInstituicaoEnsino() {
        return instEnsino;
    }

    public double getBolsaAux() {
        return bolsaAux;
    }
}
