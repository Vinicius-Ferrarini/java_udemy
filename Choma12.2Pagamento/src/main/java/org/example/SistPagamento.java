package org.example;

public class SistPagamento {
    public static void main(String[] args) {

        Pagamento paPix = new Pix();

        paPix.processarPagamento(100.50);

        Pagamento pgCartao = new CartaoCredito();

        pgCartao.processarPagamento(123);

        processar(pgCartao,42);
        processar(paPix,987);
    }

    public static void processar(Pagamento pg,double valor){
        pg.processarPagamento(valor);
    }

}
