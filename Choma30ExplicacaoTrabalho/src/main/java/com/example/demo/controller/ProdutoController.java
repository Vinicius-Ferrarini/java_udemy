package com.example.demo.controller;

import com.example.demo.model.Produto;
import com.example.demo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> verProdutos(){
        return produtoService.buscarProdutos();
    }

    @PostMapping
    public Produto criaProduto(@RequestBody Produto produto){
        return produtoService.addProduto(produto);
    }
}
