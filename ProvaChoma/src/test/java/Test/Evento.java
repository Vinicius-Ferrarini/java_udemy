package Test;

public class Evento {
    private String nome;
    private String date;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Evento(String nome, String date) {
        this.nome = nome;
        this.date = date;
    }
    public boolean validar(){
        return true;
    }

}
