package org.example;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public abstract void sacar(double n);

    public abstract void exibirTipoConta();



}
