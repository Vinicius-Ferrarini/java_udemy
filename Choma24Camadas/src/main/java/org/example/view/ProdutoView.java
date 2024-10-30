package org.example.view;

import org.example.model.Produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoView {

    Scanner sc = new Scanner(System.in);

    public int getIdProduto(){
        System.out.println("Digite o Id:");
        return sc.nextInt();
    }

    public String getNomeProduto(){
        System.out.println("Entre com o nome:");
        return sc.next();
    }

    public double getPrecoProduto(){
        System.out.println("Digite o preco:");
        return sc.nextDouble();
    }

    public void trasmitirMensagem(String msg){
        System.out.println(msg);
    }

    public void imprimirTodos(List<Produto> produtoList) {
        for (Produto produto : produtoList){
            System.out.println(produto);
        }
    }
}
