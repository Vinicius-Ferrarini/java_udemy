package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {
    //entrada dados
    Livro livro = new Livro("Profissao prerigo","1","Magaiver");


    @Test
    public void testGetTitulo(){
        assertEquals("Profissao prerigo",livro.getTitulo());
    }

    @Test
    public void testGetAutor(){
        assertEquals("Magaiver",livro.getAutor());
    }


}