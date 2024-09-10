package org.example;

public class Pix implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("E o pix nada ainda??" + valor);
    }
}
