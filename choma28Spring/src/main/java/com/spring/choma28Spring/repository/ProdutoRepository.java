package com.spring.choma28Spring.repository;

import com.spring.choma28Spring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository< Produto,Integer> {

}
