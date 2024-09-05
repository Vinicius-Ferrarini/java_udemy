package org.example;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente Claudio = new ContaCorrente("51",200.00,"Yuri Alberto",1000.00);
        System.out.printf("Titular = %s\nSaldo = %.2f\nSaque = ",Claudio.getTitular(),Claudio.getSaldo());
        Claudio.sacar(69);


    }
}
