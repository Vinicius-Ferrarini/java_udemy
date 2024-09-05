package org.example;

public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public ContaPoupanca(String numeroConta, double saldo, String titular, double rendimento) {
        super(numeroConta, saldo, titular);
        this.rendimento = rendimento;
    }

    @Override
    public void sacar(double saque){
        if(getSaldo() >= saque)
            System.out.println("Saque realizado.Saldo atual " + (getSaldo() - saque));
    }



    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Poupanca!");
    }
}
