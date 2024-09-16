package Test;

public class EventoCorporativo extends Evento{
    private String salaConferencia;
    private String comedouro;

    public String getSalaConferencia() {
        return salaConferencia;
    }

    public void setSalaConferencia(String salaConferencia) {
        this.salaConferencia = salaConferencia;
    }

    public String getComedouro() {
        return comedouro;
    }

    public void setComedouro(String comedouro) {
        this.comedouro = comedouro;
    }

    public EventoCorporativo(String nome, String date, String salaConferencia, String comedouro) {
        super(nome, date);
        this.salaConferencia = salaConferencia;
        this.comedouro = comedouro;
    }
}
