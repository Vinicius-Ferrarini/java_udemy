public class Livro {
    String nome;
    String autor;
    int anoPublicacao;

    public Livro(String nome, String autor,int ano){
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = ano;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.nome +" Autor:" + this.autor +" Ano:" + this.anoPublicacao;
    }
}
