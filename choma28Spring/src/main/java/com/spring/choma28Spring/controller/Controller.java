package com.spring.choma28Spring.controller;

import com.spring.choma28Spring.model.Produto;
import com.spring.choma28Spring.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    private ProdutoService produtoService;
    @GetMapping
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

}
