package org.example.controler;

import org.example.model.Produto;
import org.example.view.ProdutoView;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private ProdutoView produtoView;

    private List<Produto> produtoList;

    public ProdutoController(ProdutoView novaView){
        this.produtoView = novaView;
        this.produtoList = new ArrayList<>();
    }

    public void criarProduto(){
        insertProduto(produtoView.getIdProduto(),produtoView.getNomeProduto(),produtoView.getPrecoProduto());
    }
    public void insertProduto(int id,String nome,double preco){
        Produto novaProduto = new Produto(id, nome, preco);
        produtoList.add(novaProduto);
    }

    public Produto buscarProdutoById(int id){
        for (Produto produto : produtoList){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    public void deleteProduto(){
        int id = produtoView.getIdProduto();
        Produto produtoDeletar = buscarProdutoById(id);
        if (produtoDeletar != null){
            produtoList.remove(produtoDeletar);
            produtoView.trasmitirMensagem("Produto Deletado!");
        }else{
            produtoView.trasmitirMensagem("BAD REQUEST 404");
        }
    }

    public void updateProduto(){
        int id = produtoView.getIdProduto();
        Produto produtoUpdate = buscarProdutoById(id);
        if (produtoUpdate != null){
            String novoNome  = produtoView.getNomeProduto();
            double novoPreco = produtoUpdate.getPreco();
            produtoUpdate.setNome(novoNome);
            produtoUpdate.setPreco(novoPreco);
            produtoView.trasmitirMensagem("Update ok!");
        }else {
            produtoView.trasmitirMensagem("BAD REQUEST 404");
        }
    }

    public void selectAll(){
        produtoView.imprimirTodos(produtoList);
    }


}
