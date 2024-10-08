package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String anoPublicacao, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
