package org.example;

public class CartaoCredito implements Pagamento {


    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pago no cartao!!! "+ valor);
    }
}
