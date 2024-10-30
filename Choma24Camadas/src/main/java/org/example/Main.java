package org.example;

import org.example.controler.ProdutoController;
import org.example.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoView produtoView = new ProdutoView();
        ProdutoController produtoController = new ProdutoController(produtoView);

        produtoController.criarProduto();
        produtoController.selectAll();
        produtoController.deleteProduto();
        produtoController.selectAll();

    }
}