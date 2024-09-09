package org.example;

public class Estagiario extends Funcionario{
    private String InstituicaoEnsino;
    private double bolsa;

    public Estagiario(String nome, String cpf, String InstituicaoEnsino, double bolsa) {
        super(nome, cpf,bolsa);
        this.InstituicaoEnsino = InstituicaoEnsino;
        this.bolsa = bolsa;
    }

    public String getInstituicaoEnsino() {
        return InstituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        InstituicaoEnsino = instituicaoEnsino;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Funcionario Meio periodo: %s,cpf: %s,InstituicaoEnsino: %s,Bolsa: %f",getNome(),getCpf(),InstituicaoEnsino,bolsa);
    }
}
